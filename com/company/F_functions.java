package com.company;

import java.util.Scanner;

public class F_functions {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static int product(int a,int b){
        int product=a*b;
        return product;
    }
    public static int fact(int n){
        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int bincoeff(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);
        return (fact_n)/(fact_r*fact_nmr);
    }

    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primesinrange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                //true
                System.out.println(i);
            }
        }
    }

    public static void bintodec(int binnum){
        int dec=0;
        int pow=0;
        while(binnum>0){
           int Ld=(binnum)%10;
           dec=dec+(Ld*(int)(Math.pow(2,pow)));
           pow++;
           binnum= (binnum)/10;
        }
        System.out.println(dec);
    }

    public static void dectobin(int dec){
        int bin=0;
        int pow=0;
        while (dec>0){
            int rem=(dec)%2;
            bin=bin+(int)(rem*Math.pow(10,pow));
            pow++;
            dec=(dec)/2;
        }
        System.out.println(bin);
    }




    public static void main(String[] args) {
        //System.out.println("sum of two numbers:" + sum(8, 12));

       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a= sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        System.out.println("The product of two numbers:"+product(a,b));*/
        //System.out.println(fact(5));
        //System.out.println(bincoeff(5,2));
        //System.out.println(isPrime(4));
        //primesinrange(20);
        //bintodec(101);
        dectobin(7);


    }
}




