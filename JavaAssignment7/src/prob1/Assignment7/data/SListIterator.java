package prob1.Assignment7.data;

public class SListIterator<T> {
	
	  Node<T> head;
	  Node<T> curr;
	  
	public int size = 0;
	public SListIterator() {
			head = null;
		} 
//	  public void next() {
//		  this.current = this.current.nextRef;
//	  
//	  }
	  public void add(T data) {

	      Node<T> temp = new Node<T>();
	      temp.setValue(data);
	      
	      if (head == null) {
	    	  
	         head = temp;
	         System.out.println("Adding: " +head.getValue());
	      } else {
	    	  
	    	  Node<T> curr = head;
	          while (curr.getNextRef() != null) {
	              curr = curr.getNextRef();
	          }
	          curr.setNextRef(temp);
	          curr = curr.getNextRef();
	          System.out.println("Adding: " +curr.getValue());
	      }
	      size++;
	  }
	  
	  public void deleteLast(){
		  if ( size  == 0){
			  System.out.println("You Can't throw when you have nothing");
		  }
		  else{
			  Node<T> del = new Node<T>();
			  del = head;
			  
			  if(del.nextRef==null ){
				  head = null;
			  }
			  try{
			  while(del.nextRef.nextRef!=null){
				  del = del.nextRef; }
			  }catch(NullPointerException e){System.out.println("List is empty");}
			  
			  del.nextRef = null;
			  size--;
		  }
	  }
	  
	  public void deleteFirst(){
		  if (head == null){
			  System.out.println("You Can't delete first element when you have nothing");}
		  else {
			  if (head.nextRef == null){
				  head = null;
			  }
			  try{
			  head = head.nextRef;
			  }catch(NullPointerException e){System.out.println("List is empty");}
		  }
			size--;    
	  }  
	  }

