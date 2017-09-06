package prob1.Assignment7.data;

public class SList <T> {

//SListIterator<T> N = new SListIterator<T>();
	
	public String toString(SListIterator<T> N) {
	    String list = "";
	    
	    Node<T> curr = N.head;
	    while (curr != null){
	        list += "[" + curr.getValue() + "]\n";
	        curr = curr.getNextRef();
//	        System.out.println();
	    }
	    return list;
	}
	 public SListIterator<T> iterator(){
		        return new SListIterator<T>();
		     }
}
