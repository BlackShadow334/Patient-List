package com.blackshadow334.patient_list.organs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eye {
    private final String name;
    private final String color;
    private final String medical_condition;
    public static boolean is_eye_open = false;

    public Eye(String name, String color, String medical_condition) {
        this.name = name;
        this.color = color;
        this.medical_condition = medical_condition;

    }

    public void runIt() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Name: " + this.name);
        if (is_eye_open){
            System.out.println("Color: " + this.color);
            System.out.println("Medical Condition: " + this.medical_condition);
        }


        while (true) {
            System.out.println("\tChoose Options: ");
            System.out.println("\t0. Back");
            if (!is_eye_open) System.out.println("\t1. Open Eye");

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
            } else if (input == 1 && !is_eye_open) {
                System.out.println("Opening eye...");
                is_eye_open = true;

                System.out.println("Color: " + this.color);
                System.out.println("Medical Condition: " + this.medical_condition);
            }else{
                System.out.println("Please Enter Valid Input.");
            }
        }

    }

}
