class Plus {
    public static Element plus (EBoolean lhs, EBoolean rhs) {
        if(lhs.b || rhs.b)
            return new EBoolean(1); // rhs is true
 	 else
	     return new EBoolean(0);
    }
    public static Element plus (EInteger lhs, EInteger rhs) {
        int sum = lhs.n + rhs.n;
        EInteger val = new EInteger(sum);
        return val;
    }
    public static Element plus (EString lhs, EString rhs) {
        String str = lhs.r + rhs.r; //put strings together
        str = str.substring(0, Math.min(str.length(), 24)); //grab all of it or up to 24
        EString string = new EString(str);
        return string;
    } 
    //part 4
    public static Element plus(EBoolean lhs, EInteger rhs) {
    	 EInteger val;
        if(lhs.b) // if EBoolean is true, increment EInteger
	     val = new EInteger(rhs.n + 1);
	 else
	     val = new EInteger(rhs.n);
        return val;
    }
    public static Element plus(EBoolean lhs, EString rhs) {
        String string = lhs.toString() + rhs.r;

        return new EString(string);
    }
    public static Element plus(EInteger lhs, EBoolean rhs) {
	 
        if(rhs.b)
	     return new EInteger(lhs.n + 1);
        else
	     return new EInteger(lhs.n);
    }
    public static Element plus(EString lhs, EBoolean rhs) {
        String string = lhs.r + rhs.toString();
       
        return new EString(string);
    }
    public static Element plus(EInteger lhs, EString rhs) {
        String string = lhs.toString() + rhs.r;
  
        return new EString(string);
    } 
    public static Element plus(EString lhs, EInteger rhs) {
        String string = lhs.r + rhs.toString();

        return new EString(string);
    }

}