package com.leo;

import java.util.Scanner;

import static java.lang.System.in;

public class AreaOfRectangle {
    public static void main(String[] args) { //static means that the method belongs to the class not an
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: "); //user prompt to enter the length of the rectangle
        double length = in.nextDouble(); //reads any double input of the length

        System.out.println("Enter width of the rectangle: "); // user inputs the width of the rectangle
        double width = in.nextDouble();

        // Area = L * W
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);

        in.close();
    }
}
