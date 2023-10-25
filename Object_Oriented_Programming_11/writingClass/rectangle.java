package Object_Oriented_Programming_11.writingClass;

class rectang{
    private double length;
    private double breadth;
    // Setters
    public void setLength(double l){
        if(l > 0){
            length = l;
        }
        else{
            length = 0;
        }
    };
    public void setBreadth(double b){
        if(b > 0){
        breadth = b;
        }
        else{
        breadth = 0;
        }
    };
    //Getters 
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    // Behaviours of the Rectangle
    public double Area(){
        return length + breadth;
    }
    public double perimeter(){
        return 2 * (length  + breadth);
    }

    public boolean isSquare(){
        if(length == breadth){
            return true;
        }
        else{
            return false;
        }
    }
}

public class rectangle {
    public static void main(String[] args){
        rectang r = new rectang();

        // Setters 
        r.setLength(60);
        r.setBreadth(20);

        // Getters
        System.out.println("Value of Length: " + r.getLength());
        System.out.println("Value of the Breadth: "+r.getBreadth());

        // Behaviours
        System.out.println("Area: " + r.Area());
        System.out.println("Perimeter: " + r.perimeter());
        System.out.println("Square: "+ r.isSquare());
    }
    
}
