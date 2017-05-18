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
        countOut();
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
        System.out.println( "b1.hash()" + ":" + (b1.hash()) + ":");
        System.out.println( "b2.hash()" + ":" + (b2.hash()) + ":");
        System.out.println( "i1.hash()" + ":" + (i1.hash()) + ":");
        System.out.println( "i2.hash()" + ":" + (i2.hash()) + ":");
        System.out.println( "i3.hash()" + ":" + (i3.hash()) + ":");
        System.out.println( "s1.hash()" + ":" + (s1.hash()) + ":");
        System.out.println( "s2.hash()" + ":" + (s2.hash()) + ":");
        System.out.println( "s3.hash()" + ":" + (s3.hash()) + ":");
        System.out.println( "s4.hash()" + ":" + (s4.hash()) + ":");
        x = s1;
        System.out.println( "x.hash()" + ":" + (x.hash()) + ":");
        x = i2;
        System.out.println( "x.hash()" + ":" + (x.hash()) + ":");
        System.out.println( "new EInteger(84).hash()" + ":" + (new EInteger(84).hash()) + ":");
        
             System.out.print( "Plus.plus(i3, i3)" + ":"); 
             System.out.print(Plus.plus(i3, i3)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(i3, i3) instanceof EBoolean" + ":" + ((Element)Plus.plus(i3, i3) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(i3, i3) instanceof EInteger" + ":" + ((Element)Plus.plus(i3, i3) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(i3, i3) instanceof EString" + ":" + ((Element)Plus.plus(i3, i3) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(i1, i2)" + ":"); 
             System.out.print(Plus.plus(i1, i2)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(i1, i2) instanceof EBoolean" + ":" + ((Element)Plus.plus(i1, i2) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(i1, i2) instanceof EInteger" + ":" + ((Element)Plus.plus(i1, i2) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(i1, i2) instanceof EString" + ":" + ((Element)Plus.plus(i1, i2) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(b1, b2)" + ":"); 
             System.out.print(Plus.plus(b1, b2)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(b1, b2) instanceof EBoolean" + ":" + ((Element)Plus.plus(b1, b2) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(b1, b2) instanceof EInteger" + ":" + ((Element)Plus.plus(b1, b2) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(b1, b2) instanceof EString" + ":" + ((Element)Plus.plus(b1, b2) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(s1, s1)" + ":"); 
             System.out.print(Plus.plus(s1, s1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(s1, s1) instanceof EBoolean" + ":" + ((Element)Plus.plus(s1, s1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(s1, s1) instanceof EInteger" + ":" + ((Element)Plus.plus(s1, s1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(s1, s1) instanceof EString" + ":" + ((Element)Plus.plus(s1, s1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(s3, s1)" + ":"); 
             System.out.print(Plus.plus(s3, s1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(s3, s1) instanceof EBoolean" + ":" + ((Element)Plus.plus(s3, s1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(s3, s1) instanceof EInteger" + ":" + ((Element)Plus.plus(s3, s1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(s3, s1) instanceof EString" + ":" + ((Element)Plus.plus(s3, s1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(s3, s4)" + ":"); 
             System.out.print(Plus.plus(s3, s4)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(s3, s4) instanceof EBoolean" + ":" + ((Element)Plus.plus(s3, s4) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(s3, s4) instanceof EInteger" + ":" + ((Element)Plus.plus(s3, s4) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(s3, s4) instanceof EString" + ":" + ((Element)Plus.plus(s3, s4) instanceof EString) + ":");
        // mixed tests
        
             System.out.print( "Plus.plus(i1, i2)" + ":"); 
             System.out.print(Plus.plus(i1, i2)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(i1, i2) instanceof EBoolean" + ":" + ((Element)Plus.plus(i1, i2) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(i1, i2) instanceof EInteger" + ":" + ((Element)Plus.plus(i1, i2) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(i1, i2) instanceof EString" + ":" + ((Element)Plus.plus(i1, i2) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(b1, b2)" + ":"); 
             System.out.print(Plus.plus(b1, b2)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(b1, b2) instanceof EBoolean" + ":" + ((Element)Plus.plus(b1, b2) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(b1, b2) instanceof EInteger" + ":" + ((Element)Plus.plus(b1, b2) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(b1, b2) instanceof EString" + ":" + ((Element)Plus.plus(b1, b2) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(s1, s1)" + ":"); 
             System.out.print(Plus.plus(s1, s1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(s1, s1) instanceof EBoolean" + ":" + ((Element)Plus.plus(s1, s1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(s1, s1) instanceof EInteger" + ":" + ((Element)Plus.plus(s1, s1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(s1, s1) instanceof EString" + ":" + ((Element)Plus.plus(s1, s1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(s3, s1)" + ":"); 
             System.out.print(Plus.plus(s3, s1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(s3, s1) instanceof EBoolean" + ":" + ((Element)Plus.plus(s3, s1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(s3, s1) instanceof EInteger" + ":" + ((Element)Plus.plus(s3, s1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(s3, s1) instanceof EString" + ":" + ((Element)Plus.plus(s3, s1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(s3, s4)" + ":"); 
             System.out.print(Plus.plus(s3, s4)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(s3, s4) instanceof EBoolean" + ":" + ((Element)Plus.plus(s3, s4) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(s3, s4) instanceof EInteger" + ":" + ((Element)Plus.plus(s3, s4) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(s3, s4) instanceof EString" + ":" + ((Element)Plus.plus(s3, s4) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(b1, s1)" + ":"); 
             System.out.print(Plus.plus(b1, s1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(b1, s1) instanceof EBoolean" + ":" + ((Element)Plus.plus(b1, s1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(b1, s1) instanceof EInteger" + ":" + ((Element)Plus.plus(b1, s1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(b1, s1) instanceof EString" + ":" + ((Element)Plus.plus(b1, s1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(b1, s2)" + ":"); 
             System.out.print(Plus.plus(b1, s2)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(b1, s2) instanceof EBoolean" + ":" + ((Element)Plus.plus(b1, s2) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(b1, s2) instanceof EInteger" + ":" + ((Element)Plus.plus(b1, s2) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(b1, s2) instanceof EString" + ":" + ((Element)Plus.plus(b1, s2) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(b1, s3)" + ":"); 
             System.out.print(Plus.plus(b1, s3)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(b1, s3) instanceof EBoolean" + ":" + ((Element)Plus.plus(b1, s3) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(b1, s3) instanceof EInteger" + ":" + ((Element)Plus.plus(b1, s3) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(b1, s3) instanceof EString" + ":" + ((Element)Plus.plus(b1, s3) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(s1, b1)" + ":"); 
             System.out.print(Plus.plus(s1, b1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(s1, b1) instanceof EBoolean" + ":" + ((Element)Plus.plus(s1, b1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(s1, b1) instanceof EInteger" + ":" + ((Element)Plus.plus(s1, b1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(s1, b1) instanceof EString" + ":" + ((Element)Plus.plus(s1, b1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(s2, b1)" + ":"); 
             System.out.print(Plus.plus(s2, b1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(s2, b1) instanceof EBoolean" + ":" + ((Element)Plus.plus(s2, b1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(s2, b1) instanceof EInteger" + ":" + ((Element)Plus.plus(s2, b1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(s2, b1) instanceof EString" + ":" + ((Element)Plus.plus(s2, b1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(s3, b1)" + ":"); 
             System.out.print(Plus.plus(s3, b1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(s3, b1) instanceof EBoolean" + ":" + ((Element)Plus.plus(s3, b1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(s3, b1) instanceof EInteger" + ":" + ((Element)Plus.plus(s3, b1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(s3, b1) instanceof EString" + ":" + ((Element)Plus.plus(s3, b1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(i1, b1)" + ":"); 
             System.out.print(Plus.plus(i1, b1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(i1, b1) instanceof EBoolean" + ":" + ((Element)Plus.plus(i1, b1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(i1, b1) instanceof EInteger" + ":" + ((Element)Plus.plus(i1, b1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(i1, b1) instanceof EString" + ":" + ((Element)Plus.plus(i1, b1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(i1, b2)" + ":"); 
             System.out.print(Plus.plus(i1, b2)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(i1, b2) instanceof EBoolean" + ":" + ((Element)Plus.plus(i1, b2) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(i1, b2) instanceof EInteger" + ":" + ((Element)Plus.plus(i1, b2) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(i1, b2) instanceof EString" + ":" + ((Element)Plus.plus(i1, b2) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(i1, s1)" + ":"); 
             System.out.print(Plus.plus(i1, s1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(i1, s1) instanceof EBoolean" + ":" + ((Element)Plus.plus(i1, s1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(i1, s1) instanceof EInteger" + ":" + ((Element)Plus.plus(i1, s1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(i1, s1) instanceof EString" + ":" + ((Element)Plus.plus(i1, s1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(b1, i1)" + ":"); 
             System.out.print(Plus.plus(b1, i1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(b1, i1) instanceof EBoolean" + ":" + ((Element)Plus.plus(b1, i1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(b1, i1) instanceof EInteger" + ":" + ((Element)Plus.plus(b1, i1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(b1, i1) instanceof EString" + ":" + ((Element)Plus.plus(b1, i1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(b2, i1)" + ":"); 
             System.out.print(Plus.plus(b2, i1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(b2, i1) instanceof EBoolean" + ":" + ((Element)Plus.plus(b2, i1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(b2, i1) instanceof EInteger" + ":" + ((Element)Plus.plus(b2, i1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(b2, i1) instanceof EString" + ":" + ((Element)Plus.plus(b2, i1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(s1, i1)" + ":"); 
             System.out.print(Plus.plus(s1, i1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(s1, i1) instanceof EBoolean" + ":" + ((Element)Plus.plus(s1, i1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(s1, i1) instanceof EInteger" + ":" + ((Element)Plus.plus(s1, i1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(s1, i1) instanceof EString" + ":" + ((Element)Plus.plus(s1, i1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(s1, b1)" + ":"); 
             System.out.print(Plus.plus(s1, b1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(s1, b1) instanceof EBoolean" + ":" + ((Element)Plus.plus(s1, b1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(s1, b1) instanceof EInteger" + ":" + ((Element)Plus.plus(s1, b1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(s1, b1) instanceof EString" + ":" + ((Element)Plus.plus(s1, b1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(b2, s1)" + ":"); 
             System.out.print(Plus.plus(b2, s1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(b2, s1) instanceof EBoolean" + ":" + ((Element)Plus.plus(b2, s1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(b2, s1) instanceof EInteger" + ":" + ((Element)Plus.plus(b2, s1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(b2, s1) instanceof EString" + ":" + ((Element)Plus.plus(b2, s1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(s4, b1)" + ":"); 
             System.out.print(Plus.plus(s4, b1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(s4, b1) instanceof EBoolean" + ":" + ((Element)Plus.plus(s4, b1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(s4, b1) instanceof EInteger" + ":" + ((Element)Plus.plus(s4, b1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(s4, b1) instanceof EString" + ":" + ((Element)Plus.plus(s4, b1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus(b2, s4)" + ":"); 
             System.out.print(Plus.plus(b2, s4)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus(b2, s4) instanceof EBoolean" + ":" + ((Element)Plus.plus(b2, s4) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus(b2, s4) instanceof EInteger" + ":" + ((Element)Plus.plus(b2, s4) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus(b2, s4) instanceof EString" + ":" + ((Element)Plus.plus(b2, s4) instanceof EString) + ":");
        
             System.out.print( "Plus.plus( Plus.plus( Plus.plus(b1, i1), s1), i1)" + ":"); 
             System.out.print(Plus.plus( Plus.plus( Plus.plus(b1, i1), s1), i1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus( Plus.plus( Plus.plus(b1, i1), s1), i1) instanceof EBoolean" + ":" + ((Element)Plus.plus( Plus.plus( Plus.plus(b1, i1), s1), i1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus( Plus.plus( Plus.plus(b1, i1), s1), i1) instanceof EInteger" + ":" + ((Element)Plus.plus( Plus.plus( Plus.plus(b1, i1), s1), i1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus( Plus.plus( Plus.plus(b1, i1), s1), i1) instanceof EString" + ":" + ((Element)Plus.plus( Plus.plus( Plus.plus(b1, i1), s1), i1) instanceof EString) + ":");
        
             System.out.print( "Plus.plus( Plus.plus( Plus.plus(b1, i1), s2), i1)" + ":"); 
             System.out.print(Plus.plus( Plus.plus( Plus.plus(b1, i1), s2), i1)); 
             System.out.println(":"); 
             System.out.println( "(Element)Plus.plus( Plus.plus( Plus.plus(b1, i1), s2), i1) instanceof EBoolean" + ":" + ((Element)Plus.plus( Plus.plus( Plus.plus(b1, i1), s2), i1) instanceof EBoolean) + ":"); 
             System.out.println( "(Element)Plus.plus( Plus.plus( Plus.plus(b1, i1), s2), i1) instanceof EInteger" + ":" + ((Element)Plus.plus( Plus.plus( Plus.plus(b1, i1), s2), i1) instanceof EInteger) + ":"); 
             System.out.println( "(Element)Plus.plus( Plus.plus( Plus.plus(b1, i1), s2), i1) instanceof EString" + ":" + ((Element)Plus.plus( Plus.plus( Plus.plus(b1, i1), s2), i1) instanceof EString) + ":");
        EString s5 = new EString("hi");
        EString s6 = new EString("ok");
        
             System.out.print( "s5" + ":"); 
             System.out.print(s5); 
             System.out.println(":"); 
             System.out.println( "(Element)s5 instanceof EBoolean" + ":" + ((Element)s5 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)s5 instanceof EInteger" + ":" + ((Element)s5 instanceof EInteger) + ":"); 
             System.out.println( "(Element)s5 instanceof EString" + ":" + ((Element)s5 instanceof EString) + ":");
        
             System.out.print( "s6" + ":"); 
             System.out.print(s6); 
             System.out.println(":"); 
             System.out.println( "(Element)s6 instanceof EBoolean" + ":" + ((Element)s6 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)s6 instanceof EInteger" + ":" + ((Element)s6 instanceof EInteger) + ":"); 
             System.out.println( "(Element)s6 instanceof EString" + ":" + ((Element)s6 instanceof EString) + ":");
        s5 = s6;
        
             System.out.print( "s5" + ":"); 
             System.out.print(s5); 
             System.out.println(":"); 
             System.out.println( "(Element)s5 instanceof EBoolean" + ":" + ((Element)s5 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)s5 instanceof EInteger" + ":" + ((Element)s5 instanceof EInteger) + ":"); 
             System.out.println( "(Element)s5 instanceof EString" + ":" + ((Element)s5 instanceof EString) + ":");
        
             System.out.print( "s6" + ":"); 
             System.out.print(s6); 
             System.out.println(":"); 
             System.out.println( "(Element)s6 instanceof EBoolean" + ":" + ((Element)s6 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)s6 instanceof EInteger" + ":" + ((Element)s6 instanceof EInteger) + ":"); 
             System.out.println( "(Element)s6 instanceof EString" + ":" + ((Element)s6 instanceof EString) + ":");
        s5 = (EString)(Plus.plus(s6, s6));
        
             System.out.print( "s5" + ":"); 
             System.out.print(s5); 
             System.out.println(":"); 
             System.out.println( "(Element)s5 instanceof EBoolean" + ":" + ((Element)s5 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)s5 instanceof EInteger" + ":" + ((Element)s5 instanceof EInteger) + ":"); 
             System.out.println( "(Element)s5 instanceof EString" + ":" + ((Element)s5 instanceof EString) + ":");
        
             System.out.print( "s6" + ":"); 
             System.out.print(s6); 
             System.out.println(":"); 
             System.out.println( "(Element)s6 instanceof EBoolean" + ":" + ((Element)s6 instanceof EBoolean) + ":"); 
             System.out.println( "(Element)s6 instanceof EInteger" + ":" + ((Element)s6 instanceof EInteger) + ":"); 
             System.out.println( "(Element)s6 instanceof EString" + ":" + ((Element)s6 instanceof EString) + ":");
        // make sure return type declared correctly
        Element t;
        t = Plus.plus(b2, b2);
        
             System.out.print( "t" + ":"); 
             System.out.print(t); 
             System.out.println(":"); 
             System.out.println( "(Element)t instanceof EBoolean" + ":" + ((Element)t instanceof EBoolean) + ":"); 
             System.out.println( "(Element)t instanceof EInteger" + ":" + ((Element)t instanceof EInteger) + ":"); 
             System.out.println( "(Element)t instanceof EString" + ":" + ((Element)t instanceof EString) + ":");
        t = Plus.plus(i1, i2);
        
             System.out.print( "t" + ":"); 
             System.out.print(t); 
             System.out.println(":"); 
             System.out.println( "(Element)t instanceof EBoolean" + ":" + ((Element)t instanceof EBoolean) + ":"); 
             System.out.println( "(Element)t instanceof EInteger" + ":" + ((Element)t instanceof EInteger) + ":"); 
             System.out.println( "(Element)t instanceof EString" + ":" + ((Element)t instanceof EString) + ":");
        t = Plus.plus(s5, s6);
        
             System.out.print( "t" + ":"); 
             System.out.print(t); 
             System.out.println(":"); 
             System.out.println( "(Element)t instanceof EBoolean" + ":" + ((Element)t instanceof EBoolean) + ":"); 
             System.out.println( "(Element)t instanceof EInteger" + ":" + ((Element)t instanceof EInteger) + ":"); 
             System.out.println( "(Element)t instanceof EString" + ":" + ((Element)t instanceof EString) + ":");
        // list stuff
        EList l1 = new EList();
        System.out.println( "l1.capacity()" + ":" + (l1.capacity()) + ":");
        System.out.println( "l1.size()" + ":" + (l1.size()) + ":");
        System.out.println( "l1" ); 
             System.out.println(l1);
        l1.add(i1);
        System.out.println( "l1.capacity()" + ":" + (l1.capacity()) + ":");
        System.out.println( "l1.size()" + ":" + (l1.size()) + ":");
        System.out.println( "l1" ); 
             System.out.println(l1);
        l1.add(b2);
        System.out.println( "l1.capacity()" + ":" + (l1.capacity()) + ":");
        System.out.println( "l1.size()" + ":" + (l1.size()) + ":");
        System.out.println( "l1" ); 
             System.out.println(l1);
        EList l2 = new EList();
        System.out.println( "l2.capacity()" + ":" + (l2.capacity()) + ":");
        System.out.println( "l2.size()" + ":" + (l2.size()) + ":");
        System.out.println( "l2" ); 
             System.out.println(l2);
        l2.add(s4);
        System.out.println( "l2.capacity()" + ":" + (l2.capacity()) + ":");
        System.out.println( "l2.size()" + ":" + (l2.size()) + ":");
        System.out.println( "l2" ); 
             System.out.println(l2);
        l2.add(s1);
        System.out.println( "l2.capacity()" + ":" + (l2.capacity()) + ":");
        System.out.println( "l2.size()" + ":" + (l2.size()) + ":");
        System.out.println( "l2" ); 
             System.out.println(l2);
        l1.add(b1);
        System.out.println( "l1.capacity()" + ":" + (l1.capacity()) + ":");
        System.out.println( "l1.size()" + ":" + (l1.size()) + ":");
        System.out.println( "l1" ); 
             System.out.println(l1);
        for (int k = 101; k < 120; k++) {
            l1.add(new EInteger(k));
            System.out.println( "l1.capacity()" + ":" + (l1.capacity()) + ":");
            System.out.println( "l1.size()" + ":" + (l1.size()) + ":");
            System.out.println( "l1" ); 
             System.out.println(l1);
        }
        EList l3 = new EList();
        System.out.println( "l3.capacity()" + ":" + (l3.capacity()) + ":");
        System.out.println( "l3.size()" + ":" + (l3.size()) + ":");
        System.out.println( "l3" ); 
             System.out.println(l3);
        l3.add(b1);
        l3.add(b1);
        l3.add(b1);
        l3.add(b1);
        l3.add(b2);
        l3.add(b1);
        l3.add(b1);
        l3.add(b1);
        l3.add(b1);
        l3.add(b1);
        System.out.println( "l3.capacity()" + ":" + (l3.capacity()) + ":");
        System.out.println( "l3.size()" + ":" + (l3.size()) + ":");
        System.out.println( "l3" ); 
             System.out.println(l3);
        // test iterators
        System.out.println( "myprint(l1)" ); 
             myprint(l1);
        System.out.println( "myprint(l2)" ); 
             myprint(l2);
        System.out.println( "myprint(l3)" ); 
             myprint(l3);
        System.out.println( "cross(l2, l2)" ); 
             cross(l2, l2);
        System.out.println( "cross(l1, l2)" ); 
             cross(l1, l2);
        System.out.println( "cross(l2, l1)" ); 
             cross(l2, l1);
        System.out.println( "cross(l1, l3)" ); 
             cross(l1, l3);
        System.out.println( "cross(l3, l1)" ); 
             cross(l3, l1);
        System.out.println( "cross(l1, l1)" ); 
             cross(l1, l1);
        System.out.println( "cross(l3, l3)" ); 
             cross(l3, l3);
        System.out.println( "noSideEffects(new EList())" ); 
             noSideEffects(new EList());
        System.out.println( "noSideEffects(l1)" ); 
             noSideEffects(l1);
        System.out.println( "noSideEffects(l2)" ); 
             noSideEffects(l2);
        System.out.println( "noSideEffects(l3)" ); 
             noSideEffects(l3);
 try {
            System.out.println("test of calling EListIt"
                  +" too many times");
            EList el = new EList();
     el.add(new EInteger(61));
     el.add(new EInteger(63));
     el.add(new EInteger(62));
            EListIt ei = el.iterator();
            System.out.println( "ei.next()" + ":" + (ei.next()) + ":");
            System.out.println( "ei.next()" + ":" + (ei.next()) + ":");
            System.out.println( "ei.next()" + ":" + (ei.next()) + ":");
            System.out.println( "ei.next()" + ":" + (ei.next()) + ":");
            System.out.println( "ei.next()" + ":" + (ei.next()) + ":");
 }
        catch (UsingIteratorPastEndException e) {
            System.out.println("= caught UsingIteratorPastEndException from EListIt");
 }
 System.out.println( "EListUser.size1(new EList())" + ":" + (EListUser.size1(new EList())) + ":");
 System.out.println( "EListUser.size1(l1)" + ":" + (EListUser.size1(l1)) + ":");
 System.out.println( "EListUser.size1(l2)" + ":" + (EListUser.size1(l2)) + ":");
 System.out.println( "EListUser.size1(l3)" + ":" + (EListUser.size1(l3)) + ":");
 System.out.println( "EListUser.size2(new EList())" + ":" + (EListUser.size2(new EList())) + ":");
 System.out.println( "EListUser.size2(l1)" + ":" + (EListUser.size2(l1)) + ":");
 System.out.println( "EListUser.size2(l2)" + ":" + (EListUser.size2(l2)) + ":");
 System.out.println( "EListUser.size2(l3)" + ":" + (EListUser.size2(l3)) + ":");
 {
        EList k0 = new EList();
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        k0.add(i1);
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        k0.add(i1);
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        k0.add(i1);
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        k0.add(i1);
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        k0.add(i1);
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        k0.add(i1);
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        k0.add(b1);
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        k0.add(i1);
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        k0.add(i1);
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        k0.add(i1);
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        k0.add(i1);
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        k0.add(i1);
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        k0.add(i1);
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        k0.add(i1);
 System.out.println( "EListUser.isBalanced(k0)" + ":" + (EListUser.isBalanced(k0)) + ":");
        EList k1 = new EList();
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(b1);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(b2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(s1);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(s2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(s3);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(i2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(s2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(s2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(s2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(s2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(s2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        k1.add(s2);
 System.out.println( "EListUser.isBalanced(k1)" + ":" + (EListUser.isBalanced(k1)) + ":");
        EList k2 = new EList();
 System.out.println( "EListUser.isBalanced(k2)" + ":" + (EListUser.isBalanced(k2)) + ":");
        k2.add(b1);
 System.out.println( "EListUser.isBalanced(k2)" + ":" + (EListUser.isBalanced(k2)) + ":");
        k2.add(i1);
 System.out.println( "EListUser.isBalanced(k2)" + ":" + (EListUser.isBalanced(k2)) + ":");
        k2.add(b1);
 System.out.println( "EListUser.isBalanced(k2)" + ":" + (EListUser.isBalanced(k2)) + ":");
        k2.add(i1);
 System.out.println( "EListUser.isBalanced(k2)" + ":" + (EListUser.isBalanced(k2)) + ":");
        k2.add(b1);
 System.out.println( "EListUser.isBalanced(k2)" + ":" + (EListUser.isBalanced(k2)) + ":");
        k2.add(i1);
 System.out.println( "EListUser.isBalanced(k2)" + ":" + (EListUser.isBalanced(k2)) + ":");
        k2.add(b1);
 System.out.println( "EListUser.isBalanced(k2)" + ":" + (EListUser.isBalanced(k2)) + ":");
        k2.add(i1);
 System.out.println( "EListUser.isBalanced(k2)" + ":" + (EListUser.isBalanced(k2)) + ":");
        k2.add(b1);
 System.out.println( "EListUser.isBalanced(k2)" + ":" + (EListUser.isBalanced(k2)) + ":");
        k2.add(i1);
 System.out.println( "EListUser.isBalanced(k2)" + ":" + (EListUser.isBalanced(k2)) + ":");
        k2.add(b1);
 System.out.println( "EListUser.isBalanced(k2)" + ":" + (EListUser.isBalanced(k2)) + ":");
        k2.add(i1);
 System.out.println( "EListUser.isBalanced(k2)" + ":" + (EListUser.isBalanced(k2)) + ":");
 System.out.println( "EListUser.isBalanced(l1)" + ":" + (EListUser.isBalanced(l1)) + ":");
 System.out.println( "EListUser.isBalanced(l2)" + ":" + (EListUser.isBalanced(l2)) + ":");
 System.out.println( "EListUser.isBalanced(l3)" + ":" + (EListUser.isBalanced(l3)) + ":");
 }
        countOut();
        System.exit(0);
    }
    private static void myprint(EList l) {
        Element e;
        EListIt t = l.iterator();
        while ( t.hasNext() ) {
     try {
                System.out.print(t.next()+"!");
     }
            catch (UsingIteratorPastEndException ee) {
                System.out.println("myprint oops! caught UsingIteratorPastEndException");
            }
        }
        System.out.println();
    }
    private static void cross(EList l1, EList l2) {
        EListIt t1 = l1.iterator();
        while ( t1.hasNext() ) {
     try {
                Element e1 = t1.next();
                EListIt t2 = l2.iterator();
                while ( t2.hasNext() ) {
                     System.out.println("    " + e1 + " " + t2.next() );
                }
     }
            catch (UsingIteratorPastEndException e) {
                System.out.println("cross oops! caught UsingIteratorPastEndException");
            }
        }
    }
    // check that hasNext has no side effects.
    // this entire test uses a single iterator.
    // each "run" calls hasNext HN times
    // before printing out the next element (if there is one).
    // test w/ (at least) lists of size=0, 0<size<HN, size>HN*RUNS.
    private static void noSideEffects(EList l) {
 final int RUNS = 3;
 final int HN = 4;
        System.out.println( "myprint(l)" ); 
             myprint(l);
 System.out.println( "l.size()" + ":" + (l.size()) + ":");
        EListIt t = l.iterator();
 for (int run = 1; run <= RUNS; run++) {
     for (int k = 1; k <= HN; k++) {
         System.out.println( "t.hasNext()" + ":" + (t.hasNext()) + ":");
     }
     if ( t.hasNext() ) {
         try {
                    System.out.println( "t.next()" + ":" + (t.next()) + ":");
         }
                catch (UsingIteratorPastEndException e) {
                    System.out.println("noSideEffects oops! caught UsingIteratorPastEndException");
                }
      }
 }
    }
    private static void countOut() {
        System.out.println( "created " + Element.getCount() + " Element");
        System.out.println( "created " + EBoolean.getCount() + " EBoolean");
        System.out.println( "created " + EInteger.getCount() + " EInteger");
        System.out.println( "created " + EString.getCount() + " EString");
    }
}
