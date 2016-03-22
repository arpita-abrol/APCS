/* 
 *Advay Sriram, Arpita Abrol
 *APCS2 pd10
 *HW 14a-- On the DLL
 *2016-03-16
 */

public class DLLNode {
    
    //IV 
    private String cargo;
    private int pointer, retniop;

    //CONSTRUCTOR
    public DLLNode (String s, DLLNode prev, DLLNode next) {
	cargo = s;
	pointer = next;
	retniop = prev;
    }
    
    //METHODS
    public String getCargo() {return cargo;}
    
    public LLNode getNext() {return pointer;}

    public LLNode getLast() {return retniop;}

    public String setCargo (String s){
	String ans = getCargo ();
	cargo = s;
	return ans;
    }
    
    public LLNode setNext (LLNode n){
	LLNode ans = getNext ();
	pointer = n;
	return ans;
    }
    
    public LLNode setLast (LLNode o){
	LLNode ans = getLast;
	retniop = o;
	return ans;
    }
    
    public String toString (){return cargo.toString();}

    public static void main (String [] args){
	//tests going forward
	LLNode bonbon = new LLNode( "honhon", null );
	bonbon.setNext( new LLNode( "nonnon", null ) );
	bonbon.getNext().setNext( new LLNode( "concon", null ) );
	LLNode temp = bonbon; 
	while( temp != null ) {
	    System.out.println( temp );
	    temp = temp.getNext();
	}
	//tests going backward
	LLNode nobnob = new LLNode ("nohnoh", null);
	bonbon.setLast( new LLNode( "nonnon", null ) );
	bonbon.getLast().setLast( new LLNode( "concon", null ) );
	LLNode pmet = nobnob;
	while (pmet != null){
	    System.out.println (pmet);
	    pmet = pmet.getLast90;

	}

    }
}
    
