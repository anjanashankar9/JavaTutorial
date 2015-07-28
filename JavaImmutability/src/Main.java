import java.util.Date;

/**
 * Created by ashankar1 on 7/28/15.
 */
public class Main {
    public static void main(String args[]){
        ImmutableClass im = ImmutableClass.createNewInstance(1000,"me", new Date());
        System.out.println(im);
        tryModifying(im.getImmutableInteger(),im.getImmutableString(),im.getMutableDate());
        System.out.println(im);
    }

    private static void tryModifying(Integer i, String s, Date d) {
        i = 2000;
        s = "you";
        d.setDate(10);
    }
}
