package com.company;
import java.util.*;

public class BIkeyBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println(name);

    }
}

//Sum of Two numbers
/*package com.company;
import java.util.*;

public class Csumoftwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number:");
        int a= sc.nextInt();
        System.out.println("Enter Second number:");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of two numbers is:"+""+sum);
    }
}*/

// Percentage of marks of student
/*package com.company;
import java.util.*;

public class percentageofSTU {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sub1 marks:");
        float s1= sc.nextFloat();
        System.out.println("Enter sub2 marks:");
        float s2= sc.nextFloat();
        System.out.println("Enter sub3 marks:");
        float s3= sc.nextFloat();
        System.out.println("Enter sub4 marks:");
        float s4= sc.nextFloat();
        System.out.println("Enter sub5 marks:");
        float s5= sc.nextFloat();
        float sum=s1+s2+s3+s4+s5;
        float avg=sum/5;
        float percentage=(sum/500)*100;
        System.out.println("Total sum of 5subjects marks:"+sum);
        System.out.println("Average of 5subjects marks:"+avg);
        System.out.println("Total Percentage:"+percentage);


    }
}*/

//Even or Odd
/*package com.company;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

    }
}*/

//Leap Year or not
/*package com.company;

import java.util.Scanner;

public class Leapornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int n= sc.nextInt();
        if((n%4==0&&n%100!=0)||(n%400==0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a Leap year");
        }
    }

}*/



