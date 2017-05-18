/* *** This file is given as part of the programming assignment. *** */
public class Main {
    public static void main(String [] args) {
        // instantiate some elements
        EBoolean b1 = new EBoolean(1);
        EBoolean b2 = new EBoolean(0);
        EInteger i1 = new EInteger(34);
        EInteger i2 = new EInteger(-87);
        EInteger i3 = new EInteger(23);
        EString s1 = new EString("abc");
        EString s2 = new EString("");
        EString s3 = new EString("abcdefghijklmnopqrstuvwxyz0123456789");
        EString s4 = new EString("abcdefghijklmnopqrstuvwx");
        // do everything twice just to double check
        for( int i = 0; i < 2; i++) {
            
             System.out.print( "b1" + ":"); 
             System.out.print(b1); 
             System.out.println(":"); 
             System.out.println( "(Element)b1 instanceof EBoolean" + ":" + ((Element)b1 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)b1 instanceof EInteger" + ":" + ((Element)b1 instanceof EInteger) + ":"); 
             System.out.println( "(Element)b1 instanceof EString" + ":" + ((Element)b1 instanceof EString) + ":");
            
             System.out.print( "b2" + ":"); 
             System.out.print(b2); 
             System.out.println(":"); 
             System.out.println( "(Element)b2 instanceof EBoolean" + ":" + ((Element)b2 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)b2 instanceof EInteger" + ":" + ((Element)b2 instanceof EInteger) + ":"); 
             System.out.println( "(Element)b2 instanceof EString" + ":" + ((Element)b2 instanceof EString) + ":");
            
             System.out.print( "i1" + ":"); 
             System.out.print(i1); 
             System.out.println(":"); 
             System.out.println( "(Element)i1 instanceof EBoolean" + ":" + ((Element)i1 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)i1 instanceof EInteger" + ":" + ((Element)i1 instanceof EInteger) + ":"); 
             System.out.println( "(Element)i1 instanceof EString" + ":" + ((Element)i1 instanceof EString) + ":");
            
             System.out.print( "i2" + ":"); 
             System.out.print(i2); 
             System.out.println(":"); 
             System.out.println( "(Element)i2 instanceof EBoolean" + ":" + ((Element)i2 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)i2 instanceof EInteger" + ":" + ((Element)i2 instanceof EInteger) + ":"); 
             System.out.println( "(Element)i2 instanceof EString" + ":" + ((Element)i2 instanceof EString) + ":");
            
             System.out.print( "i3" + ":"); 
             System.out.print(i3); 
             System.out.println(":"); 
             System.out.println( "(Element)i3 instanceof EBoolean" + ":" + ((Element)i3 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)i3 instanceof EInteger" + ":" + ((Element)i3 instanceof EInteger) + ":"); 
             System.out.println( "(Element)i3 instanceof EString" + ":" + ((Element)i3 instanceof EString) + ":");
            
             System.out.print( "s1" + ":"); 
             System.out.print(s1); 
             System.out.println(":"); 
             System.out.println( "(Element)s1 instanceof EBoolean" + ":" + ((Element)s1 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)s1 instanceof EInteger" + ":" + ((Element)s1 instanceof EInteger) + ":"); 
             System.out.println( "(Element)s1 instanceof EString" + ":" + ((Element)s1 instanceof EString) + ":");
            
             System.out.print( "s2" + ":"); 
             System.out.print(s2); 
             System.out.println(":"); 
             System.out.println( "(Element)s2 instanceof EBoolean" + ":" + ((Element)s2 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)s2 instanceof EInteger" + ":" + ((Element)s2 instanceof EInteger) + ":"); 
             System.out.println( "(Element)s2 instanceof EString" + ":" + ((Element)s2 instanceof EString) + ":");
            
             System.out.print( "s3" + ":"); 
             System.out.print(s3); 
             System.out.println(":"); 
             System.out.println( "(Element)s3 instanceof EBoolean" + ":" + ((Element)s3 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)s3 instanceof EInteger" + ":" + ((Element)s3 instanceof EInteger) + ":"); 
             System.out.println( "(Element)s3 instanceof EString" + ":" + ((Element)s3 instanceof EString) + ":");
            
             System.out.print( "s4" + ":"); 
             System.out.print(s4); 
             System.out.println(":"); 
             System.out.println( "(Element)s4 instanceof EBoolean" + ":" + ((Element)s4 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)s4 instanceof EInteger" + ":" + ((Element)s4 instanceof EInteger) + ":"); 
             System.out.println( "(Element)s4 instanceof EString" + ":" + ((Element)s4 instanceof EString) + ":");
        }
        //check a bit more
        Element x;
        x = s1;
        
             System.out.print( "x" + ":"); 
             System.out.print(x); 
             System.out.println(":"); 
             System.out.println( "(Element)x instanceof EBoolean" + ":" + ((Element)x instanceof EBoolean) + ":"); 
             System.out.println( "(Element)x instanceof EInteger" + ":" + ((Element)x instanceof EInteger) + ":"); 
             System.out.println( "(Element)x instanceof EString" + ":" + ((Element)x instanceof EString) + ":");
        x = i2;
        
             System.out.print( "x" + ":"); 
             System.out.print(x); 
             System.out.println(":"); 
             System.out.println( "(Element)x instanceof EBoolean" + ":" + ((Element)x instanceof EBoolean) + ":"); 
             System.out.println( "(Element)x instanceof EInteger" + ":" + ((Element)x instanceof EInteger) + ":"); 
             System.out.println( "(Element)x instanceof EString" + ":" + ((Element)x instanceof EString) + ":");
        // did you need to copy EString's string?
        String go = "Go";
        EString g = new EString(go);
        System.out.println(go);
        
             System.out.print( "g" + ":"); 
             System.out.print(g); 
             System.out.println(":"); 
             System.out.println( "(Element)g instanceof EBoolean" + ":" + ((Element)g instanceof EBoolean) + ":"); 
             System.out.println( "(Element)g instanceof EInteger" + ":" + ((Element)g instanceof EInteger) + ":"); 
             System.out.println( "(Element)g instanceof EString" + ":" + ((Element)g instanceof EString) + ":");
        go = go + " figure";
        System.out.println(go);
        
             System.out.print( "g" + ":"); 
             System.out.print(g); 
             System.out.println(":"); 
             System.out.println( "(Element)g instanceof EBoolean" + ":" + ((Element)g instanceof EBoolean) + ":"); 
             System.out.println( "(Element)g instanceof EInteger" + ":" + ((Element)g instanceof EInteger) + ":"); 
             System.out.println( "(Element)g instanceof EString" + ":" + ((Element)g instanceof EString) + ":");
        System.exit(0);
    }
}
