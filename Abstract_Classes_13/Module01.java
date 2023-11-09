package Abstract_Classes_13;

abstract class Super {
    Super() {
        System.out.println("Super");
    }

    public void display01() {
        System.out.println("Dispaly01");
    };

    abstract void display02();
}

class Base extends Super {
    Base() {
        System.out.println("Base");
    }

    public void display02() {
        System.out.println("Display02");
    }
}

public class Module01 {
    public static void main(String[] args) {
        
        // Super s = new Super() {void display02(){System.out.println("Hello World I am a anonymous Function");}};
        
        Super s = new Base();
        s.display01();
        s.display02();

    }
}
