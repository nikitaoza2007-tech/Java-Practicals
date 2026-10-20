//Write a program that reads a number in meters, converts it to feet, and displays the rewsult.

import java.util.Scanner;

public class pr3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in meters:");
        double meter = sc.nextDouble();

        double feet = meter*(3.28084);

        System.out.println("Distance in feet = " + feet);

        sc.close();
    }
}