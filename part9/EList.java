public class EList {
    int size = 0;
    int capacity = 2;
    Element [] ar = new Element[2];

    int size() { return size; } 
    int capacity() { return capacity; } 
	
    void add(Element e) {

        if(size >= capacity) {
            int length = capacity; // store old length
            capacity *= 2; // double the capacity
            Element [] temp = new Element[capacity]; // temp array that's twice the size
            System.arraycopy(ar, 0, temp, 0, length); // copy into temp
            ar = temp; 
        }
        ar[size++] = e;
    }
    public String toString() {
        System.out.println("++++");
        
        for(int i = 0; i < size; i++) 
            System.out.println(ar[i].toString());
        System.out.print("----");

     return ""; 
        
    }

    public EListIt iterator() {
		return new EListIt(this); 
    }
}
