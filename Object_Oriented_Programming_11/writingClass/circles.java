package Abdul_Bari_Java.Object_Oriented_Programming_11.writingClass;

class circle{
    public double radius;
    
    public double area(){
        return 3.14*(radius*radius);
    }

    public double perimeter(){
        return 2 * 3.14 * radius;
    }
}

public class circles {
    public static void main(String[] args){
        circle cr = new circle();
        cr.radius = 30;

        System.out.println("Area: " + cr.area());
        System.out.println("Perimeter: " + cr.perimeter());
    }   
}
