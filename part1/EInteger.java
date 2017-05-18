public class EInteger extends Element {
    
    protected int n;

    EInteger( int v) 
    { 
        n = v;  	
    }	
    public String toString() {
        return String.valueOf(n);
    }

    public int hash() { return Math.abs(n) % 17; }
}

