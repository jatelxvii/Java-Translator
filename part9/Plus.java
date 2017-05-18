public class Plus {
    public static Element plus(Element a, Element b) {
    Element var = null;

        if(a instanceof EString) {
            String string = ((EString)a).r;
     
            if(b instanceof EBoolean)
                string += ((EBoolean)b).toString();

            else if(b instanceof EInteger)
                string += ((EInteger)b).toString();

	     else
		  string += ((EString)b).toString();
            var = new EString(string);
        }
        else if(b instanceof EString) {
            String string = "";

            if(a instanceof EBoolean) 
                string = ((EBoolean)a).toString();
            
            else if(a instanceof EInteger)
	         string = ((EInteger)a).toString();

            var = new EString(string + ((EString)b).toString());
        }
        else if(a instanceof EBoolean) {
            
            if(b instanceof EBoolean) {
                
                if(((EBoolean)a).b || ((EBoolean)b).b)
                    var = new EBoolean(1);
                else
                    var = new EBoolean(0);  
            }
            else if(b instanceof EInteger) {
                
                if(((EBoolean)a).b)
                    var = new EInteger(((EInteger)b).n + 1);
                else 
                    var = new EInteger(((EInteger)b).n);
            }
            
        }
        else if(a instanceof EInteger) {
            
            if(b instanceof EBoolean) {
                if(((EBoolean)b).b) 
                    var = new EInteger(((EInteger)a).n + 1);
                else
                    var = new EInteger(((EInteger)a).n);
            }
            else {
                int sum = ((EInteger)a).n + ((EInteger)b).n;
                var = new EInteger(sum);
            }
                
        }
        
    return var;
    }
}
