package linkedList.list;

import linkedList.node.ListNode;
import linkedList.node.SingleLinkNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * A partial implementation of the List interface.
 * This implementation only implements the T get(int index) and SingleLinkList<T> formArray(T[] array) methods,
 * and the class must, therefore be declared abstract.
 * You should implement the remaining missing methods, so as to be able to make the class no longer abstract.
 *
 * @param <T> the type of object stored in the list.
 *
 * @author Hugh Osborne
 * @version October 2020
 */
public class SingleLinkList<T> extends BasicList<SingleLinkNode<T>,T> implements List<T> {

    /**
     * Populate this list from an array.  If the list is currently empty, the populated list will be
     * equivalent to the array - it will contain exactly the same elements in the same order.  If the list is
     * not initially empty the original elements of the list will appear after the copy of the array.
     */
    public SingleLinkList<T> fromArray(T[] array) throws ListAccessError {
        for (int index = array.length-1; index >= 0; index--) {
            add(0,array[index]);
        }
        return this;
    }

    /**
     * Access the value at a given index.
     *
     * @param index the index of the value to be accessed.
     * @throws ListAccessError if there is no value with the given index.
     */
    @Override
    public T get(int index) throws ListAccessError {
        // Stub.  Implement get(int index) here.
        return null;
    }

    /**
     * Add a new value to the list at position index
     * @param index the index at which the new entry should be added.
     * @param value the value to be added.
     * @throws ListAccessError if index is an invalid index.
     */
    @Override
    public void add(int index, T value) throws ListAccessError {
        // Stub.  Implement add(int index, T value) here.
    }

    /**
     * Remove a value from the list at the index specified.
     * @param index the index of the entry to be removed.
     * @return the value removed.
     * @throws ListAccessError if index is an invalid index.
     */
    @Override
    public T remove(int index) throws ListAccessError {
        // Stub.  Implement remove(int index) here.
        return null;
    }



}
