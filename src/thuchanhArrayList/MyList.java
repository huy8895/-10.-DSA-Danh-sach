package thuchanhArrayList;

import java.util.Arrays;

public class MyList<E> {
   public int size = 0;
   private static final int DEFAULT_CAPACITY = 2;
   private E elements[];

   public MyList(){
       elements = (E[]) new Object[DEFAULT_CAPACITY];
   }
   private void ensureCapa(){
       int newSize = elements.length*2;
       elements = Arrays.copyOf(elements,newSize);
   }
   public void add(E e){
       if (size == elements.length){
           ensureCapa();
       }
       elements[size ++] = e;
   }
    public E get(int i) {
        if (i>= size || i <0) {
            return (E) ("IndexOutOfBoundsException");
        } else {return (E) elements[i];}


    }

}
