package relran;

import java.util.Comparator;
import java.util.Iterator;

public interface OurList <E> extends Iterable<E>{
    /**
     * the method returns the element by index
     * @param index
     * @return the element if the index is between 0 and size -1
     * @throws IndexOutOfBoundsException otherwise
     */
    public E get (int index) ;

    /**
     * add an element to the list
     * @param elt
     */
    public void add(E elt);

    /**
     * removes the element by the index from the collection
     * @param index
     * @return element to be removed
     */
    public E remove(int index);

    /**
     * removes the element if found in the collection
     * @param elt to remove
     * @return true if found and removed false otherwise
     */
    public boolean remove(E elt);

    /**
     *
     * @return size of the collection
     */
    public int size();

    /**
     * put the element by the index
     * @param index
     * @param elt
     * @return
     * @throws  IndexOutOfBoundsException if the index is incorrect
     */
    public  E set (int index, E elt);

    /**
     *
     * @param elt
     * @return true if the element is found in the collection
     */
    public  boolean contains (E elt);
    public void sort(Comparator <E> comparator);
    public Iterator<E> backwardIterator();
}
