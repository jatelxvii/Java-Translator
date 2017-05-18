public class EBoolean extends Element{
  
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
}




