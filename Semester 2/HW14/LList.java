//Arpita Abrol, Advay Sriram
//APCS2 pd10
//HW14 --
//2016-03-17

public class LList {
    
    //INSTANCE VARS
    private LLNode cur;
    private int sizer;
    
    // CONSTRUCTOR
    public LList (){
	cur = null;
	sizer = 0;
    }
    
    //METHODS
    public boolean add( String s ) {
	LLNode x = new LLNode (s, cur);
	cur = x;
	sizer ++;
	return true;
    }
    
    public String get( int i ) {
	LLNode x = cur;
	for (int y = 0; y < i; y ++){
	    x = x.getNext ();
	}
	String ans = x.getCargo;
	return ans;
    }
    
    public String set( int i, String s ) { 
	LLNode x = cur;
	for( int j=0; j < index; j++ )
	    x = x.getNext();
	String ans  = x.getCargo();
	x.setCargo( s );
	return s;
    }
    
    public int size () { return sizer; }

    public String remove( int i ){
	String ans;
	LLNode tmp = cur;
	if (i == 0){
	    ans = cur.getCargo ();
	    cur = cur.getNext ();
	}
	else {
	    for (int a = 0; a < i-1; a ++){
		tmp = tmp.getNext ();
	    }
	    ans = tmp.getNext().getCargo();
	    tmp.setNext(tmp.getNext().getNext());
	}
	sizer --;
	return ans;
    }
    
    //UPDATED METHODS
    public void add( int i, String s ){
	LLNode novo = new LLNode (s, null);
	if (index ==0){
	    add (s);
	}
	else {
	    LLNode tmp = cur;
	    for (int a = 0; a < i-1; a ++){
		tmp = tmp.getNext();
	    }
	    novo.setNext(tmp.getNext());
	    tmp.setNext(novo);
	}
	sizer ++;
    }
    
    //MAIN
    public static void main (String [] args){

	LList bonbon = new LList ();
	System.out.println (bonbon);
	System.out.println ("Size: " + bonbon.size());
	bonbon.add ("1");
	System.out.println (bonbon);
	System.out.println ("Size: " + bonbon.size());
	bonbon.add ("2");
	System.out.println (bonbon);
	System.out.println ("Size: " + bonbon.size());
	bonbon.add ("3");
	System.out.println (bonbon);
	System.out.println ("Size: " + bonbon.size());
	System.out.println ("Now you see a significant value... " + bonbon.get(1));
	bonbon.set (1, "0");
	System.out.println ("... and now you don't. " + bonbon.get (1));
    }
}
