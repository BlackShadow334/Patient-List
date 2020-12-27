package com.blackshadow334.patient_list.organs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Heart {
    private final String name;
    private int heart_rate ;
    private final String medical_condition;

    public Heart(String name, int heart_rate, String medical_condition){
        this.name = name;
        this.heart_rate = heart_rate;
        this.medical_condition = medical_condition;
    }

    public void setHeart_rate(int heart_rate) {
        this.heart_rate = heart_rate;
    }


    public void runIt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: " + this.name);
        System.out.println("Heart Rate: " + this.heart_rate);
        System.out.println("Medical Condition: " + this.medical_condition);

        while (true) {
            System.out.println("\tChoose Options: ");
            System.out.println("\t0. Back");
            System.out.println("\t1. Change Heart Rate.");

            int input;
            while (true) {
                try {
                    System.out.print(">>> ");
                    input = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please Enter Valid Input.");
                    scanner.nextLine();
                }
            }

            if (input == 0) {
                break;
            } else if (input == 1) {
                int heart_rate_inp;
                while (true) {
                    try {
                        System.out.print(">>> ");
                        heart_rate_inp = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Please Enter Valid Input.");
                        scanner.nextLine();
                    }
                }
                this.setHeart_rate(heart_rate_inp);
                System.out.println("Heart Rate changed to " + heart_rate_inp);

            }else{
                System.out.println("Please Enter Valid Input.");
            }
        }

    }

}
