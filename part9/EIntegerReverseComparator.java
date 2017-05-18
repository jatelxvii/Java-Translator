// this skeleton is so you can translate and run previous subparts
// before you work on this subpart.

import java.util.Comparator;

public class EIntegerReverseComparator implements Comparator<EInteger> {

    public int compare(EInteger e1, EInteger e2) {
    
        return e2.n - e1.n; // if e2 is greater than e1 then a positive number	
    }				// is returned

}
