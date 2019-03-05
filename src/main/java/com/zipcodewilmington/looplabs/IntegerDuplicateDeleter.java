package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        Integer[] removed = new Integer[array.length];
        return removeDuplicates(removed, maxNumberOfDuplications);

    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Integer[] removed = new Integer[array.length];
        return removeDuplicatesExactly(removed,exactNumberOfDuplications);

    }

}
