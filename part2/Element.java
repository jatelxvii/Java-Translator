// the Element base class

public abstract class Element {

    static int count = 0;

    public abstract int hash(); 

    public static int getCount() { return count; }

    public Element() { count++; }
        

}