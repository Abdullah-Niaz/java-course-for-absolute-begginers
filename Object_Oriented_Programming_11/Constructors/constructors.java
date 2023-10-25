package Object_Oriented_Programming_11.Constructors;

import org.w3c.dom.css.Rect;

class Rectangle{
    private double length,breadth;

    public Rectangle(){
        System.out.println("in Default");
        length=breadth =1;
    }
    public Rectangle(double l , double b){
        System.out.println("in Paremetrized");
        length = l;
        length = b;
    }

    public Rectangle(double s){
        System.out.println("Single");
        length=breadth=s;
    }
}
public class constructors {
    public static void main(String[] args){
        Rectangle r = new Rectangle(10,20);

        
    }
}

