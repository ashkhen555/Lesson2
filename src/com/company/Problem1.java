package com.company;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int RandomNumber = scanner.nextInt();

        switch (RandomNumber/30) {
            case 0:
                System.out.println("1-30");
                break;
            case 1:
                System.out.println("30-60");
                break;
            case 2:
                System.out.println("60-90");
                break;
            default:
                System.out.println("90-");
        }
    }
}