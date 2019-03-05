package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }


    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    protected T[] removeDuplicates(T[] output, int maxNumberOfDuplications){
        int index =0;
        for (int i = 0; i < array.length; i++) {
            if (countDuplicates(array[i]) < maxNumberOfDuplications) {
                output[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOf(output,index);
    }


    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);
    protected T[] removeDuplicatesExactly(T[] output, int exactNumberOfDuplications){
        int index =0;
        for (int i = 0; i < array.length; i++) {
            if (countDuplicates(array[i]) != exactNumberOfDuplications) {
                output[index] = array[i];
                index++;
            }
        }
        return Arrays.copyOf(output,index);
    }

    public int countDuplicates(T value){
        int counter = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i].equals(value)){
                counter += 1;
            }
        }
        return counter;
    }





}
