public class EListIt {
	int size = 0; 
	int pos = 0; 
	Element [] list; 

       EListIt(EList e){ 
    		size = e.size();
		list = e.ar; 		
	} 
	public boolean hasNext() {
		return pos < size; 
	}
	public Element next() throws UsingIteratorPastEndException {		
		if(!hasNext()) {		 
			//System.err.println("EListIt called past end"); 
			throw new UsingIteratorPastEndException();
		}
		return list[pos++];
	}
}