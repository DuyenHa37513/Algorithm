package org.example.quadratic_equation;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    static double calDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = sc.nextInt();
        System.out.print("Input b: ");
        double b = sc.nextInt();
        System.out.print("Input c: ");
        double c = sc.nextInt();

        if (a == 0) {
            if (b != 0) {
                double x4 = ((-c)/b);
                System.out.println("Phuong trinh co nghiem duy nhat: "+x4);
            } else if (b == 0 && c != 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (b == 0 && c == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            }

        } else if (a != 0) {
            if (calDelta(a, b, c) < 0) {
                System.out.println("Delta = " + calDelta(a, b, c) + " (< 0)");
                System.out.println("Phuong trinh vo nghiem.");
            } else if (calDelta(a, b, c) == 0) {
                System.out.println("Delta = " + calDelta(a, b, c) + " (= 0)");
                double x = (-b / 2 * a);
                System.out.println("Phuong trinh co nghiem kep: " + x);

            } else {
                System.out.println("Delta = " + calDelta(a, b, c) + " (> 0)");
                double x1 = (-b + Math.sqrt(calDelta(a, b, c))) / (2 * a);
                double x2 = (-b - Math.sqrt(calDelta(a, b, c))) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem: " + "x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
}
