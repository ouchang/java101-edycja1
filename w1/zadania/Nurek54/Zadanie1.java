package w1.zadania.Nurek54;

public class Zadanie1 {public static void main(String[] args)
{
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;

    int ab = a + b;
    int cd = c - d;

    double e = 1.1;
    double f = 2.2;
    double g = 3.3;
    double h = 4.4;

    double ef = e * f;
    double gh = g / h;

    int reszta = ab % b;

    char i = 'A';
    char j = 'a';

    int iPLUSj = i+j; //suma kodów ASCII

    String k = "Ala";
    String l = "ma";

    boolean m = true;
    boolean n = false;

    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("c: " + c);
    System.out.println("d: " + d);
    System.out.println("ab: " + ab);
    System.out.println("cd: " + cd);
    System.out.println("e: " + e);
    System.out.println("f: " + f);
    System.out.println("g: " + g);
    System.out.println("h: " + h);
    System.out.println("ef: " + ef);
    System.out.println("gh: " + gh);
    System.out.println("reszta: " + reszta);
    System.out.println("i: " + i);
    System.out.println("j: " + j);
    System.out.println("i + j: " + i + j);
    System.out.println("iPLUSj: " + iPLUSj); //To jest suma kodow ASCII A i a
    System.out.println("k: " + k);
    System.out.println("l: " + l);
    System.out.println("k + l: " + k + l);
    System.out.println("m: " + m);
    System.out.println("n: " + n);
    System.out.println("m && n: " + (m && n));
 }
}