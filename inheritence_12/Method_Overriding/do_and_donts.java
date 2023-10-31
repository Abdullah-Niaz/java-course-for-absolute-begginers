package inheritence_12.Method_Overriding;
class s_uper{
    // public s_uper(){
    //     display();
    // }
    public void display(){
        System.out.print("Hello");
    }
}
class b_ase extends s_uper{
    // @Overload
    public void display(){
        super.display();
        System.out.println(" World" );
    }
}
public class do_and_donts {
    public static void main(String[] args) {
        s_uper s = new b_ase();
        s.display();
    }
    
}