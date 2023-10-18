package Abdul_Bari_Java.Object_Oriented_Programming_11.this_and_Super;

import javax.print.DocFlavor.STRING;

class parent__{
    int length,breadth;
    int x = 20;

    public parent__(int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}

class child__ extends parent__{
    int heigth;

    int x = 40;

    public child__(int length, int breadth, int heigth){
        super(length,breadth);
        this.heigth = heigth;
    }


    void display(){
        System.out.println("\n=====Value of the Same Variable Name=====\n");
        System.out.println("Value of the Parent X: " + super.x);
        System.out.println("Value of the Child X: " + this.x);

        System.out.println("\n===============instance Variables==============\n");
        System.out.println("Value of length: " + super.length);
        System.out.println("Value of breadth: " + super.breadth);
        System.out.println("Value of the Heigth: " + this.heigth);
    }
}
public class super_ {
    public static void main(String[] args){
        child__ c = new child__(100, 200, 300);
        c.display();
    }
}
