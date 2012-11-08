public class GenericStack<N extends Number> implements Stack<N> {
	private List<N> contents;
	
	/*
     * Pushes a new number onto the stack
     */
    void push(N newNumber);

    /*
     * Retrieves the last element from the stack and returns it. 
     * If the stack is empty, returns null.
     */
    N pop();

    /*
     * Returns the last element from the stack (does not remove it).
     * If the stack is empty, returns null.
     */
    N peek();

    /* 
     * Returns true if the stack contains no elements, 
     * false otherwise. 
     */
    boolean isEmpty();
}