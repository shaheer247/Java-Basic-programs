package com.company;


public class OOPS {
    //Class,Objects and Constructor

    /*public static void main(String[] args) {
        //Initialising Object of Class
        Student Shaheer=new Student(" Shaik Shaheer",1,"CSE");
        Student Sachin=new Student(Shaheer);//Copying Shaheer details to Sachin
        System.out.println(Shaheer.name+ " ,"+Shaheer.Roll_no+" ,"+Shaheer.Branch);
        Shaheer.read();
        Sachin.name="Sachin";
        System.out.println(Sachin.name);
        System.out.println(Sachin.Branch);
        System.out.println(Sachin.Roll_no);
    }

}
class Student{
    //class Attributes
    String name;
    int Roll_no;
    String Branch;
    //Constructor with parameters
    Student(String name,int Roll_n0,String Branch){

        this.name=name;
        this.Roll_no=Roll_n0;
        this.Branch=Branch;
    }
    // Copy Constructor
    Student(Student Sachin){
        this.name=Sachin.name;
        this.Branch=Sachin.Branch;
        this.Roll_no= Sachin.Roll_no;
    }
    //Method
    public void read(){
        System.out.println("Student has to read");
    }*/

    //Inheritance

   /* public static void main(String[] args) {
       // Dog Shepard=new Dog();//sinle level
        //Shepard.drink();
        //Cat kitty=new Cat();//multilevel
        //kitty.sleep();
        Lion cheeku=new Lion();//Heirarchical
        cheeku.king();
    }

}
class Animal{
    public void eat(){
        System.out.println("I can Eat");
    }
}
//Single level Inheritance
class Dog extends Animal{
    public void drink() {
        super.eat();
        System.out.println("I Can Drink");
    }
}
//Multilevel Inheritance
class Cat extends Dog{
    public void sleep(){
        super.drink();
        System.out.println("I Can Sleep");
    }
}
//Heirarchical Inheritance
class Lion extends Animal{
    public void king(){
        System.out.println("I am the KING of Animals");
        super.eat();
    }
} */

    //Polymorphism

  /* public static void main(String[] args) {
       Calc add=new Calc();
       System.out.println(add.sum(50,50));
       System.out.println(add.sum(100,100,100));
   }
}

//Compile Time polymorphism

class Calc{
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
}*/

    // Runtime polymorphism

  /*( public static void main(String[] args) {
       disp d=new disp();
       d.display();
   }
}
class show {
    public void display() {
        System.out.println("Override method");
    }

}
 class disp extends show{
     public void display() {
         System.out.println("Overridden method");
     }
 }*/

//Abstraction
    /*public static void main(String[] args) {
        Duster D=new Duster();
        D.Start();

    }
}
 abstract class Car{
    abstract void Start();
}
class Duster extends Car{
    void Start(){
        System.out.println("car starts with a key");
    }
}*/
/*
public static void main(String[] args) {
    vehicle Duster = new vehicle();
    Duster.start();
    Duster.move();
    Duster.stop();


}
}
interface car{
    void start();
}
interface Bike{
    void start();
    void move();
    void stop();

}
 class  vehicle implements car,Bike{
    @Override
    public void start() {
        System.out.println("starts with a key");
    }

    @Override
    public void stop() {
        System.out.println("stops by applying brakes");
    }

    @Override
    public void move() {
        System.out.println("moves by accelarator");
    }
}

 */
    //Encapsulation
public static void main(String[] args) {
    Bank_Acc Shaheer=new Bank_Acc();
    Shaheer.setName("Shaheer");
    Shaheer.setAcc_no(123344445);
    Shaheer.setEmail("sheruu@1437");
    Shaheer.setAcc_bal(1000000.0f);
    System.out.println(Shaheer.getName()+" "+Shaheer.getAcc_no()+" "+Shaheer.getEmail()+" "+Shaheer.getAcc_bal());

}

}
class Bank_Acc{
    private long Acc_no;
    private String name,Email;
    private float Acc_bal;
//Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAcc_no(long acc_no) {
        this.Acc_no = acc_no;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
    public void setAcc_bal(float acc_bal){
        this.Acc_bal=acc_bal;
}
//getters

    public String getName() {
        return name;
    }
    public long getAcc_no(){
        return Acc_no;
    }

    public String getEmail(){
        return Email;
    }
    public float getAcc_bal(){
        return Acc_bal;
    }
}



