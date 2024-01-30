package sargam;

import java.util.Scanner;

public class Assign2{
    public static void main(String[] args){
        /*
        Define a program to find out whether a given number is 
        even or odd.
        */
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the number :");
       int a = in.nextInt();
       if(a%2==0){
        System.out.println("The given number is even");
       }
       else{
        System.out.println("The given number is odd");
       }
    }
}
