package com.company;
import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        final float PI = 3.14159f;
        float radius, area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Radius: ");
        radius = sc.nextFloat();

        area = PI * radius * radius;
        System.out.printf("%.2f", area);
    }
}
