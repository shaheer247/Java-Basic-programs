package com.company;

public class E_c_advPatterns {
    public static void hallowrectangle(int Totalrows,int Totalcols) {
        //outerloop-Rows
        for(int i=1;i<=Totalrows;i++){
            //innerloop-Cols
            for(int j=1;j<=Totalcols;j++){
                if(i==1||i==Totalrows||j==1||j==Totalcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void invertrotatehalf(int n){
        //outloop-rows
        for(int i=1;i<=n;i++){
            //inner-cols
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void invertedhalfnum(int n){
        //outer-rows
        for(int i=1;i<=n;i++){
            //inner-cols
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void FloydTriangle(int n){
        //outer-rows
        int count=1;
        for(int i=1;i<=n;i++){
            //inner-cols
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void oonestriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //1st star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //2nd star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //2nd half
        for(int i=n;i>=1;i--){
            //1st star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //2nd star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
    public static void solidrhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hallowrhombus(int n ,int totalrows,int totalcols){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==totalrows||j==1||j==totalcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
         for(int i=1;i<=n;i++){
             for(int j=1;j<=n-i;j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=(2*i)-1;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       // hallowrectangle(5,6);
       // invertrotatehalf(5);
       // invertedhalfnum(5);
       // FloydTriangle(5);
        //oonestriangle(7);
        butterfly(7);
        //solidrhombus(5);
       // hallowrhombus(4,4,4);
        //diamond(4);

    }
}
