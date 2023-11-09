package Abstract_Classes_13;

abstract class Hospital{
    Hospital(){
        System.out.println("Hospital");
    }
    abstract void emergency();
    abstract void appointment();
    abstract void admint();
    abstract void billing();
}


class MyHospital extends Hospital{
    MyHospital(){
        System.out.println("MY Hospital");
    }

    @Override
    void emergency() {
        System.out.println("Unimplemented method 'emergency'");
    }

    @Override
    void appointment() {

        System.out.println("Unimplemented method 'appointment'");
    }

    @Override
    void admint() {
        System.out.println("Unimplemented method 'admint'");
    }

    @Override
    void billing() {
    System.out.println("Unimplemented method 'billing'");
    }

    
}

public class Module02 {
    public static void main(String[] args) {
        Hospital h = new MyHospital();
        h.admint();
        h.appointment();
        h.billing();
        h.emergency();
    }
    
}
