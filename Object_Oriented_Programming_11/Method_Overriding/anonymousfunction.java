package Object_Oriented_Programming_11.Method_Overriding;

class sup_{
    public void display(){
        System.out.println("Hello World");
    }
}
class su_{
    public void display(){
        System.out.println("Wellcome");
    }
}
public class anonymousfunction {
    public static void main(String[] args){
        su_ s = new su_(){
            public void display(){
                System.out.println("Hello,  I am a anonymous Func........");
            }
        };

        s.display();
    }
}
