//Arpita Abrol
//APCS2 pd10
//HW28 -- All Hands on Deque!
//2016-04-07

/*****************************************************
 * class RQueue
 * A linked-list-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linked list points opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 *
 *
 * maintains these invariants: 
 * dequeuing removes/returns a random element
 * _front always points to next item to be removed
 ******************************************************/


public class Deque<T> implements Queue<T> 
{
    private DLLNode<T> _front, _end;
    private int _size;


    // default constructor creates an empty queue
    public Deque() { 
	_front = _end = null;
	_size = 0;
    }


    public void enqueueEnd( T enQVal ) 
    {
	//special case: when enqueuing to an empty list, 
	//make _front && _end point to same node
	if ( isEmpty() ) {
	    _front = _end = new DLLNode<T>( enQVal, null, null );
	}
	else {
	    _end.setNext( new DLLNode<T>( enQVal, _end, null ) );
	    _end = _end.getNext();
	}
	_size++;
    }

    public void enqueueFront( T enQVal ) 
    {
	//special case: when enqueuing to an empty list, 
	//make _front && _end point to same node
	if ( isEmpty() ) {
	    _end = _front = new DLLNode<T>( enQVal, null, null );
	}
	else {
	    _front.setPrev( new DLLNode<T>( enQVal, _end, null ) );
	    _front = _front.getPrev();
	}
	_size++;
    }


    // remove and return thing at front of queue, then reorder elements
    // assume _queue ! empty
    public T dequeueFront() 
    { 
	T retVal = _front.getCargo();
	_front = _front.getNext();

	if ( _front == null ) //just moved past last node
	    _end = null;      //update _end to reflect emptiness

	_size--;

	if ( _size > 1 )  sample();

	return retVal;
    }

    public T dequeueEnd() 
    { 
	T retVal = _end.getCargo();
	_end = _end.getPrev();

	if ( _end == null ) //just moved past last node
	    _front = null;      //update _end to reflect emptiness

	_size--;

	if ( _size > 1 )  sample();

	return retVal;
    }


    //return next item to be dequeued
    public T peekFront() 
    {
	return _front.getCargo();
    }

    public T peekEnd() 
    {
	return _end.getCargo();
    }


    /******************************************
     * void sample() -- a means of "shuffling" the queue
     * Algo:
     * Move front element to end, x times. (x==random int)
     *  ( 0 <= x < queue size - 1 )
     ******************************************/
    public void sample () 
    {
	int cycles = (int)( _size * Math.random() );
	for( int i = 0; i < cycles; i++ )
	    enqueueEnd( dequeueFront() );
    }

    public void sampleReverse () 
    {
	int cycles = (int)( _size * Math.random() );
	for( int i = 0; i < cycles; i++ )
	    enqueueFront( dequeueEnd() );
    }


    public boolean isEmpty() { return _front == null; }//O(1)


    // print each node, separated by spaces
    public String toString() 
    { 
	String foo = "";
	DLLNode<T> tmp = _front;
	while ( tmp != null ) {
	    foo += tmp.getCargo() + " ";
	    tmp = tmp.getNext();
	}
	return foo;
    }



    //main method for testing
    public static void main( String[] args ) {

	Queue<String> PirateQueue = new Deque<String>();

	System.out.println("\nnow enqueuing..."); 
	PirateQueue.enqueueEnd("Dread");
	PirateQueue.enqueueEnd("Pirate");
	PirateQueue.enqueueEnd("Robert");
	PirateQueue.enqueueEnd("Blackbeard");
	PirateQueue.enqueueEnd("Peter");
	PirateQueue.enqueueEnd("Stuyvesant");

	System.out.println("\nnow testing toString()..."); 
	System.out.println( PirateQueue ); //for testing toString()...

	System.out.println("\nnow dequeuing..."); 
	System.out.println( PirateQueue.dequeueFront() );
	System.out.println( PirateQueue.dequeueFront() );
	System.out.println( PirateQueue.dequeueFront() );
	System.out.println( PirateQueue.dequeueFront() );
	System.out.println( PirateQueue.dequeueFront() );
	System.out.println( PirateQueue.dequeueFront() );

	System.out.println("\nnow dequeuing fr empty queue..."); 
	System.out.println( PirateQueue.dequeueFront() );

    }//end main

}//end class RQueue
