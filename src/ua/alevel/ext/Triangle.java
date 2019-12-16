package ua.alevel.ext;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, p, S;
        System.out.println("Введите a,b,c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        if ((a > 0) & (b > 0) & (c > 0)) {
            if ((a > b) & (a > c)) {
                System.out.println(a + "_");
                if (b > c)
                    System.out.print(b + "_" + c);
                else System.out.print(c + "_" + b);
            } else {
                if ((b > a) & (b > c)) {
                    System.out.println(b + "_");
                    if (a > c)
                        System.out.print(a + "_" + c);
                    else
                        System.out.print(c + "_" + a);
                } else {
                    if (a > b)
                        System.out.println(c + "_" + a + "_" + b);
                    else System.out.println(c + "_" + b + "_" + a);
                }
                p = (a + b + c) / 2;
                S = Math.sqrt((p - a) * (p - b) * (p - c));
                System.out.println("S=" + S);
            }

        } else System.out.println("Длина сторон не может быть отрицательной");
    }

}
