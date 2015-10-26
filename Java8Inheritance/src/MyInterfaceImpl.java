/**
 * Created by ashankar1 on 10/25/15.
 */
public class MyInterfaceImpl implements MyInterface {
    @Override public void method1() {
        System.out.println("Implementation of method 1");
    }

    @Override public void method2() {
        System.out.println("Implementation of method 2");
    }

//    public static void main(String[] args){
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method1();
//        obj.method2();
//        obj.newMethod();
//    }
}
