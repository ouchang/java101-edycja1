import static java.lang.Math.*;
public class Zadanie2{
    public static void main(String[] args){
        int a, b;
        a = 5;
        b = 10;
        double c, d;
        c = pow(a, b);
        d = sqrt(c);
        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c + "\nd = " + d);
        int e = -5;
        double g, h;
        g = abs(e);
        h = 10.5001;
        h = round(h);
        System.out.println("e = " + e + "\ng = " + g + "\nh = " + h);

    }
}