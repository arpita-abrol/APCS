//Arpita Abrol
//APCS2 pd10
//HW12a -- We Got a Big Ol' Convoy...
//2016-03-15

public class LLNode{

    //instance vars
    private String val;
    private Node nextVal;

    public Node( String x ){
	val = x
    }

    public Node( Node x ){
	nextVal = x;
    }

    public String get{
	return val;
    }

    public String set( String x ){
	String t = val;
	val = x;
	return t;
    }

    public Node getNext{
	return nextVal;
    }

    public void setNext( node n ){
	nextVal = n;
    }

    public String toString(){
	return val;
    }


} //end class
