//Arpita Abrol
//APCS2 pd10
//HW17 - Iteratorator
//2016-03-22

/*****************************************************
 * class ItrWork -- skeleton
 * Allows for familiarization with iterators
 *****************************************************/

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork {

    //using FOREACH loop
    //returns a boolean to indicate whether key is present in L
    public static boolean foundA( Integer key, List<Integer> L ) { 
	/*** YOUR IMPLEMENTATION HERE ***/
	for( Integer x:L ) {
	    if( x.equals(key) ) {
		return true;
	    }
	}
	return false;
    }

    //explicitly using an iterator i.e. for() (NOT foreach), while()
    //returns a boolean to indicate whether key is present in L
    public static boolean foundB( Integer key, List<Integer> L ) { 
	/*** YOUR IMPLEMENTATION HERE ***/
	for( int x = 0; x < L.size(); x++ ) {
	    if( L.get(x).equals(key) ) {
		return true;
	    }
	}
	return false;
    }

    //using FOREACH loop
    //returns a list containing the odd numbers in L
    public static List<Integer> oddsA( List<Integer> L ) { 
	/*** YOUR IMPLEMENTATION HERE ***/
	List<Integer> oddL = new ArrayList<Integer>();
	for( Integer x : L ) {
	    if( L.get(x)%2 != 0 ) {
		oddL.add(x);
	    }
	}
	return oddL;
    }

    //explicitly using an iterator
    //returns a list containing the odd numbers in L
    public static List<Integer> oddsB( List<Integer> L ) { 
	/*** YOUR IMPLEMENTATION HERE ***/
	List<Integer> oddL = new ArrayList<Integer>();
	for( int x = 0; x < L.size(); x++ ) {
	    if( L.get(x)%2 != 0 ) {
		oddL.add(x);
	    }
	}
	return oddL;
    }


    //explicitly using an iterator
    //modifies L s.t. it contains no evens
    public static void removeEvens( List<Integer> L ) { 
	/*** YOUR IMPLEMENTATION HERE ***/
	for( int x = 0; x < L.size(); x++ ) {
	    if( L.get(x)%2 == 0 ) {
		L.remove(x);
		x--;
	    }
	}
    }


    public static void main( String [] args ) {

	//var type: List   obj type: ArrayList	
	List<Integer> L = new ArrayList<Integer>();

	for( int i = 0; i < 10; i++ )
	    L.add(i);

	System.out.println( "List L...\n" + L );

	// TASK: write code to print the contents of ArrayList L...

	
	// a) using a FOREACH loop


	// b) explicitly using an iterator


	System.out.println("\nTesting foundA...");
	System.out.println("9 in L? -> " + foundA(9,L) );   //true
	System.out.println("13 in L? -> " + foundA(13,L) ); //false

	System.out.println("\nTesting foundB...");
	System.out.println("9 in L? -> " + foundB(9,L) );   //true
	System.out.println("13 in L? -> " + foundB(13,L) ); //false

	System.out.println("\nTesting oddsA...");
	List<Integer> A = oddsA(L);
	for( int n : A ) System.out.println(n);             //[1,3,5,7,9]

	System.out.println("\nTesting oddsB...");
	List<Integer> B = oddsB(L);
	for( int n : B ) System.out.println(n);             //[1,3,5,7,9]

	System.out.println("\nTesting removeEvens...");
	removeEvens(L);
	for( int n : L ) System.out.println(n);             //[1,3,5,7,9]
	/*~~~~~~~~~~~~~~~m~o~v~e~~m~e~~d~o~w~n~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main

}//end class ItrWork

