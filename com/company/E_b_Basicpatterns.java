package com.company;

public class E_b_Basicpatterns {
    public static void main(String[] args) {
        /*for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

       /* for (int i = 0; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }*/

            /*for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= 5 - i + 1; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }*/
       /* for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
