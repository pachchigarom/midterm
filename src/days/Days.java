/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**
 * This class takes String input from the user and calls a method to print the name of the day.
 * If the input is not given in String, the program will accept and produce wrong results.
 * The code is modified to use enums, which avoids String input, and then prints the weekday names.
 * 
 * @author omkishan
 */
public class Days {

    enum Day {
        ONE("Monday"),
        TWO("Tuesday"),
        THREE("Wednesday"),
        FOUR("Thursday"),
        FIVE("Friday"),
        SIX("Saturday"),
        SEVEN("Sunday");

        private final String name;

        Day(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (one, two, three, four, five) in string:");
        String code = in.next().toUpperCase();

        Day day = Day.valueOf(code);
        System.out.println(day.getName());
    }
}
