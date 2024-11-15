package org.example;


import java.util.Scanner;

public class Main{
public static void main (String[] args) {


    Scanner scanner = new Scanner(System.in);
    boolean b = true;
    while(b){
        System.out.println("romel planetaze vcxovrobt?");

        String input = scanner.nextLine();
    switch (input) {
        case "dedamiwaze":
            System.out.println("pasuxi sworia");
            b = false;
            break;
        case "merkurze":
            System.out.println("pasuxi arasworia");
            break;
        case "veneraze":
            System.out.println("pasuxi arasworia");
            break;
        case "marsze":
            System.out.println("pasuxi arasworia");
            break;
        case "iupiterze":
            System.out.println("pasuxi arasworia");
            break;
        case "saturnze":
            System.out.println("pasuxi arasworia");
            break;
        case "uranze":
            System.out.println("pasuxi arasworia");
            break;
        case "neptunze":
            System.out.println("pasuxi arasworia");
            break;
        case "plutonze":
            System.out.println("pasuxi arasworia");
            break;

        default:
            System.out.println("gtxovt sheiyvanet planetis dasaxeleba");
            break;
    }
    }
}

}


