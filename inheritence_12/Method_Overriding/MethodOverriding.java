package inheritence_12.Method_Overriding;

class super_{
    public void display(){
        System.out.println("Hello World");
    }
}
class sub_{
    public void display(){
        System.out.println("Wellcome");
    }
}

public class MethodOverriding {
    public static void main(String[] args){
        sub_ s = new sub_();
        s.display();
    }
}
