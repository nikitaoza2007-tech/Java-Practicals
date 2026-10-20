//Body Mass Index (BMI) is a measure of health based on weight.It can be calculated by taking your weight in kilograms and divinding 
//by the square of your height in meters.Write a program that prompts the user to enter a weight in pounds and height in inches
//and display the BMI. (Note: 1 pound = 45359237 Kg & 1 inch = 0254 meters)

import java.util.Scanner;
public class pr4{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter weight(in pounds):");
        double weight = sc.nextFloat();

        System.out.println("Enter height(in inches):");
        double height = sc.nextFloat();

        double kg = weight*(0.45359237);
        double mt = height*(0.0254);

        double bmi = kg/(mt*mt);

        System.out.println("BMI is:"+ bmi);

    }
}  