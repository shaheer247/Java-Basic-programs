package com.company;

public class G_Arrays {
    public static void main(String[] args) {
       /* int []a=new int[5];
        a[0]=11;
        a[1]=22;
        a[2]=33;
        a[3]=44;
        a[4]=55;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
        int a[]={11,22,33,44,55};
        for(int element:a){
            System.out.println(element);
        }*/
        //2D-Arrays
        int[][]a=new int[2][3];
        a[0][0]=100;
        a[0][1]=101;
        a[0][2]=102;
        a[1][0]=200;
        a[1][1]=201;
        a[1][2]=202;
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }
}
