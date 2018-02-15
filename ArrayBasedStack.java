import java.util.*;
public class ArrayBasedStack<T> implements StackInterface<T>{



private int topOfStack;
private int INITIAL_CAPACITY;
private boolean initialized;
private T[] data;


 ArrayBasedStack(int capacity){
 if(capacity <= 0)
 {
 throw new IllegalArgumentException("Cannot create array less than 0");
 }
 else{
 
 T[] array = (T[]) new Object[capacity];
topOfStack = 0;
INITIAL_CAPACITY = 5;
initialized = true;
}
}

public void push(T newEntry){
   if(topOfStack == data.length)
   throw new IllegalArgumentException(" ...");
   
   topOfStack++;
   data[topOfStack] = newEntry;
   }
  
   /** Removes and returns this stack's top entry.
       @return  The object at the top of the stack. 
       @throws  EmptyStackException if the stack is empty before the operation. */
   public T pop(){
   
   
   if(data.length == 0)
   throw new IllegalArgumentException("Array is empty");
   
   T temp = data[topOfStack - 1];
   data[topOfStack - 1] = null;
   topOfStack--;
   return temp;
   }
  
   /** Retrieves this stack's top entry.
       @return  The object at the top of the stack.
       @throws  EmptyStackException if the stack is empty. */
   public T peek(){
   if(data.length == 0)
   throw new IllegalArgumentException("Array is empty");
   return data[topOfStack];
   }
  
   /** Detects whether this stack is empty.
       @return  True if the stack is empty. */
   public boolean isEmpty(){
   if(data.length == 0)
   return true;
   else
   return false;
   }
  
   /** Removes all entries from this stack. */
   public void clear(){
   
   }





}