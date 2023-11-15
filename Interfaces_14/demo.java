package Interfaces_14;


interface demo1 {
    void method1();

    void method2();
}
interface demo2 {
    void method3();

    void method4();
}



class demo3 implements demo1,demo2 {

    // public demo3(){
    //     method4();
    //     method3();
    //     method2();
    //     method1();
    // }
    public void method1(){
        System.out.println("Method 1");;
    };

    public void method2(){
        System.out.println("Method 2");
    }

    @Override
    public void method3() {
    System.out.println("Method 3");
}

@Override
public void method4() {
        System.out.println("Method 4");
    };
}

public class demo {
    public static void main(String[] args) {   
        demo3 d = new demo3();
        d.method1();
        d.method2();
        d.method3();
        d.method4();
    }
}
