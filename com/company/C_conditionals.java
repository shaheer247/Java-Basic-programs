package com.company;

import java.util.Scanner;

public class C_conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        if(n<0){
            System.out.println("Negative number");
        }
        else if(n>0){
            System.out.println("Positive number");
        }
        else{
            System.out.println("Equal");
        }
    }
}
