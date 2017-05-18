public class EString extends Element{

    protected String r;
    
    EString (String v) {

        r = v.substring(0, Math.min(v.length(), 24));

    } 
    public String toString() { return r; }
}