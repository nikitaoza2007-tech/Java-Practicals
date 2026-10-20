//Write a program that prompts the user to enter 3 integers and displays the integers in decreasing order.

import java.util.Scanner;
public class pr5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int a = sc.nextInt();

        System.out.println("Enter second integer:");
        int b = sc.nextInt();

        System.out.println("Enter third integer:");
        int c = sc.nextInt();

        System.out.println("The descending order is:");

        if(a >=b && a >=c){
            if(b >=c){
                System.out.println(a +" "+ b +" " + c +" ");
            }
            else{
                System.out.println(a +" "+ c +" "+ b + " ");
            }
        }
        else if(b >=a && b >=c){
            if(a >=c){
            }
            else{
                System.out.println(b +" "+ c +" "+ a + " ");
            }
        }
        else{
            if(a >=b){
                System.out.println(c +" "+ a +" "+ b + " ");
            }
            else {
                System.out.println(c +" "+ b +" "+ a + " ");
            }
        }
    }
}