class Plus {
    public static Element plus (EBoolean lhs, EBoolean rhs) {
        if(lhs.b || rhs.b)
            return new EBoolean(1); // either are true
 	 else
	     return new EBoolean(0);
    }

    public static Element plus (EInteger lhs, EInteger rhs) {
        int sum = lhs.n + rhs.n;
        EInteger val = new EInteger(sum);
        return val;

	//return new EInteger(lhs.n + rhs.n);
    }

    public static Element plus (EString lhs, EString rhs) {
        String str = lhs.r + rhs.r; //put strings together
        str = str.substring(0, Math.min(str.length(), 24)); //grab all of it or up to 24
        EString string = new EString(str);
        return string;
    }
}