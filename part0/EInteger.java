public class EInteger extends Element {
    
    protected int n;

    EInteger( int v) 
    { 
        n = v;  	
    }	
    public String toString() {
        return String.valueOf(n);
    }
}