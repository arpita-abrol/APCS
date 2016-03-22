/*****************************************************
 * interface List
 * Specifies actions a List must be able to perform.
 * Now generically typed. 
 * (T is a placeholder, to be replaced at time of instantiation. )
 *****************************************************/

public interface List<T> 
{ 
    //add element to end of list
    //always return true
    public boolean add( T x ); 

    //insert element T at index i
    public void add( int i, T newVal );

    //remove element at index i
    public T remove( int i );

    //return element at index i
    public T get( int i ); 

    //overwrite element at index i, return old element at index i
    public T set( int i, T x ); 

    //return number of meaningful elements in i
    public int size(); 
}//end interface
