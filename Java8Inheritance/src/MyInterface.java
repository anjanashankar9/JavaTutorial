/**
 * Created by ashankar1 on 9/16/15.
 */

public interface MyInterface {
    /**
     * All the methods of an interface are public by default
     */
    void method1();
    void method2();
    default void newMethod(){
        System.out.println("This is the default implementation of the method");
    }
}
