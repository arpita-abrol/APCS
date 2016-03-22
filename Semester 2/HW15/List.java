/*****************************************************
 * interface List -- subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 *****************************************************/

public interface List<T> {

    //add node to list, containing input <t> as its data
    public boolean add( T x );

    //inserts a node containing s at position I
    public void add( int i, T s );

    //removes the node at position i and returns its cargo
    public T remove( int i );

    //return data in element at position i
    public T get( int i );

    //overwrite data in element at position i
    public T set( int i, T x );

    //return length of list
    public int size();

}//end interface
