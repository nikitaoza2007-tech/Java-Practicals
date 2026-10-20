// Assume a vehicle plate number consists of 3 uppercase letters followed by 4 digits.Write a program to generate a plate number.

public class pr7{
    public static void main(String[] args){

        char letter1 = (char)('A' + Math.random()*26);
        char letter2 = (char)('A' + Math.random()*26);
        char letter3 = (char)('A' + Math.random()*26);

        int digit1 = (int)(Math.random()*10);
        int digit2 = (int)(Math.random()*10);
        int digit3 = (int)(Math.random()*10);
        int digit4 = (int)(Math.random()*10);
                

        System.out.println("Vehicle Plate Number:" + letter1 + "" + letter2 + "" + letter3 + "" + digit1 + "" + digit2 + "" + digit3 + "" + digit4);
    }
}