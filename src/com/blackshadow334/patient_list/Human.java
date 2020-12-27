package com.blackshadow334.patient_list;

import com.blackshadow334.patient_list.organs.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Human {

    private final String name;
    private final Short age;
    private final Eye left_eye;
    private final Eye right_eye;
    private final Heart heart;
    private final Stomach stomach;
    private final Skin skin;

    public Human(String name, Short age, Eye left_eye, Eye right_eye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.left_eye = left_eye;
        this.right_eye = right_eye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;

    }

    public void runit() {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Choose options below:");
            System.out.println("\t0. Quit");
            System.out.println("\t1. Left Eye");
            System.out.println("\t2. Right Eye");
            System.out.println("\t3. Heart");
            System.out.println("\t4. Stomach");
            System.out.println("\t5. Skin");

            int inp_organ;
            while (true) {
                try {
                    System.out.print(">>> ");
                    inp_organ = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please Enter Valid Input.");
                    scanner.nextLine();
                }
            }

            if (inp_organ == 0) {
                break;
            } else if (inp_organ == 1) {
                this.left_eye.runIt();
            } else if (inp_organ == 2) {
                this.right_eye.runIt();
            } else if (inp_organ == 3) {
                this.heart.runIt();
            } else if (inp_organ == 4) {
                this.stomach.runIt();
            } else if (inp_organ == 5) {
                this.skin.runIt();
            } else {
                System.out.println("Please Enter Valid Input.");
            }

        }
    }

}
