

public class EInteger extends Element {
    
    protected int n;
    protected static int int_count = 0;

    EInteger( int v) 
    { 
        int_count++; 
        n = v;  	
    }	
    public String toString() {
        return String.valueOf(n);
    }

    public int hash() {

        return Math.abs(n)%17;   

    }

    public static int getCount() { return int_count; } 
}

