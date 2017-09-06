package prob1.Assignment7.data;

public class Node<T> {

		 public T value;
	     public Node<T> nextRef;
	     
		public void setValue(T value) {
		this.value = value;
		}
		public T getValue() {
			return value;
			}
		public void setNextRef(Node<T> ref) {
			this.nextRef = ref;
			}
		public Node<T> getNextRef() {
		return nextRef;
		}
		

}
