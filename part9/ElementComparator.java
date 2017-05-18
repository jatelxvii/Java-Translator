// this skeleton is so you can translate and run previous subparts
// before you work on this subpart.

import java.util.Comparator;

public class ElementComparator implements Comparator<Element> {

    public int compare(Element e1, Element e2) {
        int num = 0;

        if(e1 instanceof EBoolean) {
            
	     if(e2 instanceof EBoolean)
	         num = ((EBoolean)e1).compareTo( (EBoolean)e2 );

	     else // EBoolean comes before other Elements
		  num = -1;
        }
	 else if(e1 instanceof EInteger) {

	     if(e2 instanceof EBoolean) // EInteger > EBoolean
	         num = 1;
	     else if(e2 instanceof EString) // EInteger < EString
		  num = -1;
	     else
		  num = ((EInteger)e1).compareTo( (EInteger)e2 ); // EInteger & EInteger
	 }
	 else { // must be EString

            if(e2 instanceof EString)
	         num = ((EString)e1).compareTo( (EString)e2 );
	     else
		  num = 1; // EString comes after everything else
	 }
	 return num; 
    }

}