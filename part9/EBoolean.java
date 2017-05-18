public class EBoolean extends Element implements Comparable<EBoolean>{
  
    protected boolean b;
    protected static int boolean_count = 0;

    EBoolean(int v)
    {
        boolean_count++;
        
        if(v != 0)
            b = true;
        else
            b = false;
    }
    public String toString() {
        String bool;

        if(b)
            bool = "$true$";
	 else
	     bool = "$false$";
        return bool;
            
    }

    public int hash() {

        int h = 1;
        if(!b) 
            h = 0; 

        return h;
    }

    public static int getCount() { return boolean_count; }

    public int compareTo(EBoolean other) {
        int num = 0; // they're equal

	 if(!b && other.b) // this.false < other.true
            num = -1;

        else if(b && !other.b) // this.true > other.false
  	     num = 1;
	
	 return num;
    	
    }
}




