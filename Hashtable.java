package Projekt;

public class Hashtable {

	private Element[] hasharray; // [index]
	//public Element value;
	
	public Hashtable(int capacity) {
		hasharray = new Element[capacity];	
	}
	public void insert(Element artist) {
		 int index = hashCode(artist.key);
	        while (hasharray[index] != null) {
	            index++;
	            index = index % hasharray.length;
	        }
	        hasharray[index] = artist;
		
	}
	public int hashCode(String key) {
		
		int sum = 0;
		for(int i=0;i<key.length(); i++) {
			//System.out.println(key.charAt(i) + "   " + (int)key.charAt(i));
			sum = sum + (int)key.charAt(i);
		}
		//return Integer.parseInt(sum)%hasharray.length;
		sum = sum % hasharray.length;
		return sum;
	}
	 public Element get(String key) {
	        int index = hashCode(key);
	        while (hasharray[index].key.compareTo(key) != 0) {
	            index++;
	            index = index % hasharray.length;
	        }
	        return hasharray[index];
	    }
	 public void remove(String key) {
		 int index = hashCode(key);
		 while (hasharray[index].key.compareTo(key) != 0) {
			 index++;
			 index = index % hasharray.length;
		 }
		 hasharray[index] = null;
	 }
	 public int size() {
		 int size = 0;
		 for(int i = 0; i<hasharray.length;i++) {
			 if(hasharray[i]!=null) {
				 size++;
			 }
		 }
		 return size;
	 }
	 //
	 
	/*public boolean containsKey(Object arg0
	 * public boolean containsValue(Object arg0) {
	 * isempty

}
*/


    public static void main(String[] args) {
        Hashtable hash = new Hashtable(11);
        // hash.insert("Mia");
        // hash.insert("Tim");
        // hash.insert("Bea");
        // hash.insert("Zoe");
        // hash.insert("Sue");
        // hash.insert("Len");
        // hash.insert("Moe");
        // hash.insert("Lou");
        // hash.insert("Rae");
        // hash.insert("Max");
        // hash.insert("Tod");
        // hash.print();
        // Element a = hash.get("Len");
        // System.out.println(" key(" + a.key + "): ||| " + a.song);

        // hash.insert("Mia", "M");
        // hash.insert("Tim", "M");
        // hash.insert("Bea", "M");
        // hash.insert("Zoe", "M");
        // hash.insert("Sue", "M");
        // hash.insert("Len", "M");
        // hash.insert("Moe", "M");
        // hash.insert("Lou", "M");
        // hash.insert("Rae", "M");
        // hash.insert("Max", "M");
        // hash.insert("Tod", "M");
        // hash.print();
        // System.out.println(" get('Len'): " + hash.get("Len")[0] + " : " + hash.get("Len")[1]);
    }

    public void print() {
        for (int i = 0; i < hasharray.length; i++) {
            System.out.print(hasharray[i].key + ",");
        }
        System.out.println();
    }

}