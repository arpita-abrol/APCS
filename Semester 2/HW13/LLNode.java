/*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 *****************************************************/

public class LLNode {

    private String _cargo;    //cargo may only be of type String
    private LLNode _nextNode; //pointer to next LLNode


    // constructor -- initializes instance vars
    public LLNode( String value, LLNode next ) {
	_cargo = value;
	_nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public String getCargo() { return _cargo; }

    public LLNode getNext() { return _nextNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo ) {
	String foo = getCargo();
	_cargo = newCargo;
	return foo;
    }

    public LLNode setNext( LLNode newNext ) {
	LLNode foo = getNext();
	_nextNode = newNext;
	return foo;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }


    //main method for testing
    public static void main( String[] args ) {

	//Below is an exercise in creating a linked list...

	//Create a node
	LLNode first = new LLNode( "cat", null );

	//Create a new node after the first
	first.setNext( new LLNode( "dog", null ) );

	//Create a third node after the second
	first.getNext().setNext( new LLNode( "cow", null ) );

	/* A naive list traversal, has side effect of destroying list
	while( first != null ) {
	    System.out.println( first );
	    first = first.getNext();
	}
	*/

	//Q: when head ptr moves to next node in list, what happens to the node it just left?
	//A: garbage collector reclaims that memory

	//...so better: (w/o moving first pointer)
	LLNode temp = first; //create ptr to first so JGC doesn't take it
	while( temp != null ) {
	    System.out.println( temp );
	    temp = temp.getNext();
	}

    }//end main

}//end class LLNode
