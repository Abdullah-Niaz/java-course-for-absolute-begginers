package Abstract_Classes_13;

abstract class KFC {
    KFC(){
        System.out.println("KFC Constructor");
    }

    public void makeItem(){
        System.out.println("Making Method will be Provided");
    }

    abstract void menu();
    abstract void billing();
    abstract void envirement();
}

class MYKFC extends KFC{
    MYKFC(){
        System.out.println("MY KFC");
        menu();
        billing();
        envirement();
    }

    void menu(){
        System.out.println("Yes! we have Menu");
    }
    void billing(){
        System.out.println("Yes! Billing will be accor... to our needs");
    }
    void envirement(){
        System.out.println("We have Envirenment!");
    };
}

public class Module03 {
    public static void main(String[] args) {
        KFC Multan = new MYKFC();
    }
    
}
