public class EString extends Element{

    protected String r;
    protected static int string_count = 0;
    
    EString (String v) {

        string_count++;
        r = v.substring(0, Math.min(v.length(), 24));
    } 

    public String toString() {
        return r;
    }

    public int hash() {

        return r.length()%17;

    }

    public static int getCount() { return string_count; } 
}