/*****************************************************
 * skeleton for class LatKtS (LatKeysToSuccess)
 * Driver class for Latkes.
 * Uses a stack to reverse a text string, check for sets of matching parens.
 *****************************************************/


public class LatKtS 
{

    /**********************************************************
     * precondition:  input string has length > 0
     * postcondition: returns reversed string s
     *                flip("desserts") -> "stressed"
     **********************************************************/
    public static String flip( String s ) 
    { 
	Latkes x = new Latkes(s.length());
	for( int i = 0; i < s.length(); i++ ) {
	    x.push(s.substring(i,i+1));
	}
	String flip = "";
	while( !x.isEmpty()){
	    flip += x.pop();
	}
	return flip;
    }//end flip()


    /**********************************************************
     * precondition:  s contains only the characters {,},(,),[,]
     * postcondition: allMatched( "({}[()])" )    -> true
     *                allMatched( "([)]" )        -> false
     *                allMatched( "" )            -> true
     **********************************************************/
    public static boolean allMatched( String s ) 
    { 
	int a = 0;
	int b = 0;
	int c = 0;
	String tmp = "";
        for( int x = 0; x < s.length(); x++ ) {
	    tmp = s.substring(x,x+1);
	    if( tmp.equals("(") ) {
		a++;
		System.out.println(tmp);
	    }
	    if( tmp.equals("{") ) {
		b++;
		System.out.println(tmp);
	    }
	    if( tmp.equals("[") ) {
		c++;
		System.out.println(tmp);
	    }
	    if( tmp.equals(")") ) {
		a--;
		System.out.println(tmp);
	    }
	    if( tmp.equals("}") ) {
		b--;
		System.out.println(tmp);
	    }
	    if( tmp.equals("]") ) {
		c--;
		System.out.println(tmp);
	    }
	}
	System.out.println( a + " " + b + " " + c);
	if( a == 0 && b == 0 && c == 0 ) {
	    return true;
	}
	else{
	    return false;
	}
    }//end allMatched()


    //main method to test
    public static void main( String[] args ) { 

	
	System.out.println(flip("stressed"));
        System.out.println(allMatched( "({}[()])" )); //true
        System.out.println(allMatched( "([)]" ) ); //false
        System.out.println(allMatched( "(){([])}" ) ); //true
        System.out.println(allMatched( "](){([])}" ) ); //false
        System.out.println(allMatched( "(){([])}(" ) ); //false
        System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
	^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
    }

}//end class LatKtS
