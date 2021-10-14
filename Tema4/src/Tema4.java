import java.util.List;
import java.util.Scanner;

public class Tema4 {
    public static boolean ex1(){
        Scanner scanner = new Scanner(System.in);
        int[] f = new int[3];
        int negativeNumberCount = 0;
        System.out.println("Scrie 3 cifre: ");
        for (int i = 0; i<3; i++) {
            System.out.print("Scrie cifra " + (i + 1) + ": ");
            f[i] = scanner.nextInt();
            if (f[i] < 0) {
                negativeNumberCount++;
            }
        }

        if (negativeNumberCount >= 2){
            return false;
        }
        return true;
    }

    public static int ex2(){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Scrie 3 cifre: ");
        for (int i = 0; i<3; i++) {
            System.out.println("Scrie cifra " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int max1 = numbers[0] > numbers[1] ? numbers[0] : numbers[1];
        int max2 = max1 > numbers[2] ? max1 : numbers[2];

        return max2;
    }

    public static void ex3 () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("scrie leftLimit: ");
        int leftLimit = scanner.nextInt();
        System.out.println("scrie rightLimit: ");
        int rightLimit = scanner.nextInt();

        for (int i = leftLimit; i <= rightLimit; i++) {
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void ex4 (int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("Numarul " + number + " este prim: " + isPrime);

    }

    public static void ex5 () {
        String cuvant = "cojoc";
        String reversed = "";
//        String reversed = new StringBuilder(cuvant).reverse().toString();
//        System.out.println(reversed);
//        if (cuvant.equals(reversed)) {
//                System.out.println(" Este polindrom");
//            } else {
//                System.out.println(" Nu este polindrom");
//        }

        for (int i = cuvant.length()-1; i >= 0; i--) {
            reversed += cuvant.charAt(i);
        }
        if (cuvant.equals(reversed)) {
            System.out.println(" Este palindrom");
        }  else {
            System.out.println(" Nu este palindrom");
        }
    }

    public static void ex6 (int n) {
        int fib = 0;
        int precedent = 1;
        int antePrecedent = 1;
        System.out.print(precedent +  " ");
        System.out.print(antePrecedent +  " ");
        for (int i = 0; i < n-2; i++) {
            fib = precedent + antePrecedent;
            System.out.print(fib +  " ");
            antePrecedent = precedent;
            precedent = fib;
        }
    }

    public static boolean ex7 () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrie un numar: ");
        int numar = scanner.nextInt();
        int sumaDivizori = 0;
        for (int i = 1; i < numar; i++) {
            if (numar % i == 0) {
                sumaDivizori += i;
            }
//            System.out.println(sumaDivizori);
        }
        if (sumaDivizori == numar) {
            return  true;
        }
        return false;
    }

    public static int ex8(int x){
        if(x < -5){
            return x + 10;
        }else if (x > -5 && x <= 10) {
            return x * 2;
        }
        return x * x + 50;
    }

    public static void ex9 () {
        List<String> monedeList = List.of("EUR", "USD", "AUD", "CHF", "GBP");
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Introdu suma dorita: ");
        int suma = scanner.nextInt();

        System.out.println("Alege una din monedele urmatoare: \"EUR\", \"USD\", \"AUD\", \"CHF\", \"GBP\"");
        String valuta = scanner.next();

        while(!monedeList.contains(valuta)){
            System.out.println("Moneda aleasa nu este corespunzatoare. Alege una din monedele urmatoare: \"EUR\", \"USD\", \"AUD\", \"CHF\", \"GBP\"");
            valuta = scanner.next();
        }

        double eur = 4.95;
        double usd = 4.28;
        double aud = 3.15;
        double chf = 4.61;
        double gbp = 5.83;

        switch (valuta) {
            case "EUR" :
                System.out.println(suma / eur);
                break;
            case "USD" :
                System.out.println(suma / usd);
                break;
            case "AUD" :
                System.out.println(suma / aud);
                break;
            case "CHF" :
                System.out.println(suma / chf);
                break;
            case "GBP" :
                System.out.println(suma / gbp);
                break;
        }
    }

    public static boolean ex10 (String str) {
        String specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        String numbers = "0123456789";
        boolean hasSpecialCharacter = false;
        boolean hasNumber = false;
        boolean hasUpperCharacter = false;
        boolean hasLowerCharacter = false;

        if (str.length() < 8){
            return false;
        }

        for (int i = 0; i < str.length(); i++){
            if(specialCharacters.contains(Character.toString(str.charAt(i))) && !hasSpecialCharacter){
                hasSpecialCharacter = true;
            }else if(numbers.contains(Character.toString(str.charAt(i))) && !hasNumber){
                hasNumber = true;
            }else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' && !hasLowerCharacter){
                hasLowerCharacter = true;
            }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' && !hasUpperCharacter){
                hasUpperCharacter = true;
            }
        }

        if (hasNumber && hasLowerCharacter && hasUpperCharacter && hasSpecialCharacter){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ex1());
        System.out.println(ex2());
        ex3();
        ex4(24);
        ex5();
        ex6(10);
        System.out.println(ex7());
        ex9();
        System.out.println(ex8(20));
        System.out.println(ex10("1h?asdASD"));


    }
}

