package Abdul_Bari_Java.Object_Oriented_Programming_11.Method_Overriding;

class super__{
    public void display(){
        System.out.println("Hello World");
    }
}
class sub__ extends super__{
    public void display(int x ){
        System.out.println("Wellcome");
    }
}
public class Calling {
    public static void main(String[] args){
        super__ s = new super__();
        s.display();
        
        
        sub__ sb = new sub__();
        sb.display();
    }
}
