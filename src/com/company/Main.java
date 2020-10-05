package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество первого торта n1: ");
        int n1 = scanner.nextInt();
        System.out.print("Введите количество второго торта n2: ");
        int n2 = scanner.nextInt();
        System.out.print("Введите стоимость первого торта p1: ");
        int p1 = scanner.nextInt();
        System.out.print("Введите стоимость второго торта p2: ");
        int p2 = scanner.nextInt();
        System.out.print("Введите имеющуюся сумму m: ");
        int m = scanner.nextInt();
        if (p1 <= p2) {
            int n = m / p1;
            if (n >= n1) {
                n = n1;
            }
            else n1 = n;
            m = m - p1 * n1;
            int nn = m / p2;
            if (nn >= n2) {
                nn = n2;
            }
            else n2 = nn;
                n = n + nn;
                System.out.print("Можно купить " + n);
            }
        else {
            int n = m / p2;
            if (n >= n2) {
                n = n2;
            }
            else n2 = n;
            m = m - p2 * n2;
            int nn = m / p1;
            if (nn >= n1) {
                nn = n1;
            }
            else n1 = nn;
            n = n + nn;
            System.out.print("Можно купить " + n);
        }
    }
    }