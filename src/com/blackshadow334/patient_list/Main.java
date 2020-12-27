package com.blackshadow334.patient_list;

import com.blackshadow334.patient_list.organs.*;

public class Main {
    public static void main(String[] arr) {
        Human jack = new Human(
                "jack",
                (short) 38,
                new Eye("Left Eye", "Blue", "Short Sighted"),
                new Eye("Right Eye", "Blue", "Short Sighted"),
                new Heart("Heart", 65, "Normal"),
                new Stomach("Stomach", "PVD"),
                new Skin("Skin", "Burned"));

//        System.out.println(jack);

        System.out.println("\t*** Patient List ***");
        jack.runit();
    }
}
