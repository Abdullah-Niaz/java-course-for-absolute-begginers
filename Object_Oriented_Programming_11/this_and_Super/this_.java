package Abdul_Bari_Java.Object_Oriented_Programming_11.this_and_Super;
class parent_{
    int length,breadth;
    public parent_(int length,int breadth){
        this.length= length;
        this.breadth = breadth;
    }
    void display(){
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }
}
public class this_ {
    public static void main(String [] args){
        parent_ p = new parent_(10, 20);
        p.display();
    }
}
