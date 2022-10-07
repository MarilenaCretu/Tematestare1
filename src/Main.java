import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String exercitiul = "Exercitiul ";
        int tema = 0;
        String calcul = "Calcul";

        System.out.println(exercitiul + ++tema + ": Printati \"Hello\" in consola, iar pe rand nou, printati numele vostru.");
        System.out.println("Hello\nMarilena\n");

        System.out.println(exercitiul + ++tema + ": Printati rezultatul sumei a doua numere(orice numere)");
        Scanner console = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int a = console.nextInt();
        System.out.println(a);
        System.out.println("Introduceti al doilea numar: ");
        int b = console.nextInt();
        System.out.println(b);
        int sum = a + b;
        System.out.println("Suma numerelor pe care le-ati introdus (" + a + ", " + b + ") este: " + sum + "\n");

        System.out.println(exercitiul + ++tema + ": Printati rezultatul impartirii a doua numere.\n" +
                "Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.");
        double impartit = (double) a / b;
        System.out.println("\tRezultatul pentru numerele pe care le-ati introdus (" + a + ", " + b + ") este: " + impartit + "\n");

        System.out.println(exercitiul + ++tema + ": Printati rezultatul urmatoarelor operatiuni:");
        double c = -5;
        double d = 8;
        double e = 6;
        double calculA = c + d * e;
        System.out.println("\t"+calcul + "A: -5 + 8 * 6 = " + calculA);
        int f = 55;
        int g = 9;
        int h = 9;
        int calculB = (f + g) % h;
        System.out.println("\t"+calcul + "B: (55+9) % 9 = " + calculB);
        double i = 20;
        double j = -3;
        double k = 5;
        double l = 8;
        double calculC = i + j * k / l;
        System.out.println("\t"+calcul + "C: 20 + -3*5 / 8 = " + calculC);
        double m = 5;
        double n = 15;
        double o = 3;
        double p = 2;
        double r = 8;
        double s = 3;
        double calculD = m + n / o * p - r % s;
        System.out.println("\t"+calcul + "D: 5 + 15 / 3 * 2 - 8 % 3 = " + calculD);

    }
}