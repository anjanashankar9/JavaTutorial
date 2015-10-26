/**
 * Created by ashankar1 on 10/25/15.
 */
public class InterfaceImpl implements InterfaceA,InterfaceB{
    @Override public void method() {
        System.out.println("Default method in implementation class");
    }
    public static void main(String[] args){
        InterfaceA obj = new InterfaceImpl();
        obj.method();
    }
}
