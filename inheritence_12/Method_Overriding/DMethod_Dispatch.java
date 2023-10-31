package inheritence_12.Method_Overriding;

class top{
    public void display1(){
        System.out.println("Super Display 1");
    }
    public void display2(){
        System.out.println("Super Display 1");
    }
}

class bottom extends top{
    public void display2(){
        System.out.println("Super Display 1");
    }
    
    // it can't be displayed,
    // Throws an undefined Error
    public void display3(){
        System.out.println("Super Display 1");
    }
}

public class DMethod_Dispatch {
    public static void main(String[] args) {
        top t = new bottom();
        t.display2();
    }
}