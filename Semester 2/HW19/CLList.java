

/*****************************************************
 * skeleton for class CLList 
 * implements a circularly-linked list of doubly-linked nodes
 ******************************************************/

public class CLList<T> {

    // only 1 head/tail/front/end pointer is necessary,
    // since the list is circularly-linked
    private DLLNode<T> _head;
    private int _size = 0;

    public CLList(){
	_head = new DLLNode<T>(null, _head, _head);
    }

    public int size() { return _size; }

    public boolean add( T x ){
	if( _size == 0) {
	    _head.setCargo(x);
	}
	else{
	    DLLNode<T> _tail = new DLLNode<T>(x,_head.getPrev(),_head);
	    _head.getPrev().setNext(_tail);
	    _head.setPrev(_tail);
	    _size ++;
	}
	return true;
    }


    public T get( int index ){
	DLLNode<T> val = _head;
	if( index > _size ) {
	    throw new IndexOutOfBoundsException("index too large");
	}
	for( int x = 0; x <= index; x++ ) {
	    val = val.getNext();
	}
	return val.getCargo();
    }


    public T set( int index, T newVal ){
	DLLNode<T> val = _head;
	if( index > _size ) {
	    throw new IndexOutOfBoundsException("index too large");
	}
	for( int x = 0; x <= index; x++ ) {
	    val = val.getNext();
	}
	return newVal;
    }


    public String toString(){
	DLLNode<T> val = _head;
	String ans = "[";
	for( int x = _size; x > 0; x++ ) {
	    ans += val.getCargo() + ",";
	    val = val.getNext();
	}
	return ans + "]";
    }


    //main method for testing
    public static void main( String[] args ) {
	
	CLList<String> liz = new CLList<String>();

	liz.add("kenneth");
	liz.add("jack");
	liz.add("tracy");

	System.out.println(liz);

	System.out.println("\ntesting get()...");
	for( int i = 0; i < liz._size; i++ ) {
	    System.out.println("node " + i + " contains " + liz.get(i) );
	    System.out.println(liz);
	}
	/* **********************
	System.out.println("\ntesting set()...");
	for( int i = 0; i < liz._size; i++ ) {
	    System.out.println( liz.set( i, "rock"+i ) );
	    System.out.println(liz);
	}
		
	********************** */
    }//end main

}//end class CLList
