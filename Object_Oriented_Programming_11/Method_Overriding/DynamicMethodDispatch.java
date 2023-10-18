package Abdul_Bari_Java.Object_Oriented_Programming_11.Method_Overriding;


class Super{
    public void display(){
        System.out.println("Hello World");
    }
}
class Sub extends Super{
    public void display(){
        System.out.println("WellCome To the .....");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[]args){

        // Super is the refrence to the sub object. 
        //  Whenever you calls a  methods through the refrence variables 
        // Methods of objects always will be called
        Super s = new Sub();
        s.display();
    }
    
}
