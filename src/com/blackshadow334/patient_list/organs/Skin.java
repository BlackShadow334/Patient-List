package com.blackshadow334.patient_list.organs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Skin {
    private final String name;
    private final String medical_condition;

    public Skin(String name, String medical_condition){
        this.name = name;
        this.medical_condition = medical_condition;
    }


    public void runIt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: " + this.name);
        System.out.println("Medical Condition: " + this.medical_condition);

        while (true) {
            System.out.println("\tChoose Options: ");
            System.out.println("\t0. Back");

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
            }else{
                System.out.println("Please Enter Valid Input.");
            }
        }

    }


}
