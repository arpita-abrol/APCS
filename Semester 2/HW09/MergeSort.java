//Arpita Abrol
//APCS2 pd10
//HW
//2016-03-07


/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: 

  ======================================*/

import java.lang.Math;

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) {
	int[] fin = new int[a.length+b.length];
	int aLen = 0;
	int bLen = 0;
	for( int i = 0; i < (a.length+b.length); i++ ) {
	    if (aLen < a.length && bLen < b.length) {
		if( a[aLen] < b[bLen] ) {
		    fin[i] = a[aLen];
		    aLen += 1;
		}
		else{
		    fin[i] = b[bLen];
		    bLen += 1;
		}
	    }
	    else if( aLen < a.length ) {
		fin[i] = a[aLen];
		aLen += 1;
	    }
	    else{
		fin[i] = b[bLen];
		bLen += 1;
	    }
	}
	return fin;
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) {
        //printArray( arr );
	if( arr.length <= 1 ) {
	    return arr;
	}
	int[] a = new int[arr.length/2];
	int[] b = new int[arr.length-a.length];
	for( int x = 0; x < a.length; x++ ) {
	    a[x] = arr[x];
	}
	for( int x = 0; x < b.length; x++ ) {
	    b[x] = arr[x+a.length];
	}
	a = sort( a );
	b = sort( b );
	//printArray(merge( a, b ));
	return merge( a,b );
	
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {

	
	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	int[] arr8 = {1,4,55,123,123,145,193};
	int[] arr9 = {2,5,11,45,122,123,222,422};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr7 );
	//mess(arr7);
	printArray( arr7 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	System.out.println("\nMerging arr8 and arr9: ");
	printArray( merge(arr8,arr9) );

	

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );
	/*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort
