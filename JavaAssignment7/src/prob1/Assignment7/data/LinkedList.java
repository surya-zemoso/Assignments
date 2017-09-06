package prob1.Assignment7.data;


public class LinkedList<T> {
	
	public static void main(String[] args) {

		 SList<Integer> obj=new SList<Integer>();
		 
		 SListIterator<Integer> slistiterator;
		    slistiterator = obj.iterator();
		    slistiterator.add(3);
		    slistiterator.add(32);
		    slistiterator.add(56);
		    slistiterator.add(84);
		    slistiterator.add(824);
		    slistiterator.deleteLast(); 
		    slistiterator.deleteLast();
		    slistiterator.deleteLast();
		    
		    slistiterator.deleteFirst(); 
		    slistiterator.deleteFirst();
		    slistiterator.deleteFirst();
		    
		    System.out.println("\nLinked List: \n"+ obj.toString(slistiterator));
	}
}
