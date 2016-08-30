package com.curvilinearllc;

/**
 * @author dandy.taylor
 */
public class LinearSearch {

    /**
     *
     * @param <T>
     * @param searchArgument
     * @param itemsToSearch
     * @return Integer
     */
    public static <T extends Comparable<T>> Integer Linear(T searchArgument, T[] itemsToSearch) {
        for (int i = 0; i < itemsToSearch.length; i++) {
            if (itemsToSearch[i] == null) {
                continue;
            }

            if (searchArgument.compareTo(itemsToSearch[i]) == 0) {
                return i;
            }

        }

        return -1;

    }

}
