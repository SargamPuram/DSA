package sargam;

import java.util.Scanner;

public class Assign1 {
    public static void main(String[] args) {
        // Q:Define two methods to print the maximum and the minimum number respectively
        //entered by the user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a = in.nextInt();
        System.out.print("Enter number 2 : ");
        int b = in.nextInt();
        System.out.print("Enter number 3 : ");
        int c = in.nextInt();

        maximum(a, b, c);
        minimum(a, b, c);

    }
    static void maximum(int a, int b, int c){
        if(a > b && a > c){
            System.out.println(a + " is the maximum number");
        }
        else if (b > a && b > c){
            System.out.println(b + " is the maximum number");
        }
        else{
            System.out.println(c + " is the maximum number");
        }
    }
    static void minimum(int a, int b, int c){
        if(a < b && a < c){
            System.out.println(a + " is the minimum number");
        }
        else if (b < a && b < c){
            System.out.println(b + " is the minimum number");
        }
        else{
            System.out.println(c + " is the minimum number");
        }
    }
}
