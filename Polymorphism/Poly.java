package Polymorphism;


class add{
    int a,b;
    public add(int a ,int b){
        this.a = a;
        this.b = b;
    }
    public int addition(){
        return a + b;
    }
}

class Parent{
    public void display1(){
        System.out.println("Super Dispaly 1 ");
    }
    public void display(){
        System.out.println("Super Dispaly ");
    }
}
class Child extends Parent{
    public void display3(){
        System.out.println("Super Dispaly 1 ");
    }
    public void display(){
        System.out.println("Super Dispaly ");
    }
}

public class Poly {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
        p.display1();


        add a = new add(20, 30);
        int ad = a.addition();
        System.out.println("Value of + : "+ ad);

    }
}
