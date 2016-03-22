//Arpita Abrol
//APCS2 pd10
//HW12b -- Truckin' Through the Night
//2016-03-15

public class LList implements List{

    //instance vars
    private Node one;
    private Node two;

    public LinkedList(){
	one = null;
	two = null;
    }

    public boolean add{
	if( get(1) == null ) {
	    return true;
	}
	else{
	    return false;
	}
    }

    public String get( int i ){
	return getNode(i).get();
    }

    public String getNode( int i ) {
	if( one != null && i >= 0 && i < size() ) {
	    Node x = one;
	    while( i != 0 ){
		x = x.getNext();
		i--;
	    }
	    return x;
	}
	else{
	    return null;
	}
    }

    public String set( int i, String x ){
        return setNode(i,x).set();
    }

    public String setNext( int i, String x ){
		if( one != null && i >= 0 && i < size() ) {
	    Node x = one;
	    while( i != 0 ){
		x = x.setNext();
		i--;
	    }
	    return x;
	}
	else{
	    return null;
	}
    }

    public int length(){
        if (one == null)
            return 0;
        else{
	    Node t = one;
	    int ctr = 0;
	    while ( t != null ){
		t = t.getNext();
		ctr++;
	    }    
	    return ctr;
	}
    }
    


} //end class
