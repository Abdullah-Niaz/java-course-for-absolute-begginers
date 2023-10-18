package Abdul_Bari_Java.Object_Oriented_Programming_11.Constructors;

class Parent{
    public Parent(){
        System.out.println("Non-Parametrized Parent Constructor");
    }
    public Parent(int x){
        System.out.println("Parameterized Parent Constructor "+x);
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Non-Parametrized Child Constructor");
    }
    public Child(int y){
        System.out.println("Parameterized Child Constructor "+y);
    }
    public Child(int x,int y){
        super(x);
        System.out.println("Parameterized Child Constructor "+y);
    }

}

public class Parameterized_Constructor {
    public static void main(String[] args){
        // Non Paremetrized
        // Child c = new Child();

        // Parametrized Constructor with single value of the Child
        // Child C = new Child(20);
        
        
        // Parametrized Constructor with two Values
        Child C = new Child(20, 30);
    }
}
