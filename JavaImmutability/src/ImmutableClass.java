/**
 * Created by ashankar1 on 7/28/15.
 */

import java.util.Date;

/**
 * Steps for making a class immutable:
 * 1. Declare the class as final
 * 2. Make all its fields final
 * 3. For all mutable fields, class should make a defensive copy and only return the copy to the calling code
 * 4. Do not provide any setter methods.
 * 5. Make the constructor private and declare a static factory method to create an instance.
 */
public final class ImmutableClass {
    /**
     * Integer and String classes are immutable whereas Date class is mutable
     */
    private final Integer immutableInteger;
    private final String immutableString;
    private final Date mutableDate;

    //A private constructor will ensure that no unplanned construction of class happens
    private ImmutableClass(Integer i, String s, Date d) {
        this.immutableInteger = i;
        this.immutableString = s;
        this.mutableDate = new Date(d.getTime());
    }

    //A factory method for object creation logic
    public static ImmutableClass createNewInstance(Integer i, String s, Date d) {
        return new ImmutableClass(i,s,d);
    }

    public String getImmutableString() {
        return immutableString;
    }

    public Integer getImmutableInteger() {
        return immutableInteger;
    }

    public Date getMutableDate() {
        return mutableDate;
    }

    @Override
    public String toString() {
        return immutableInteger + ", " + immutableString + ", " + mutableDate;
    }
}