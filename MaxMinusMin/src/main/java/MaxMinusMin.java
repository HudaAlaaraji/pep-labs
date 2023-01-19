

import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
    for (int i = 0; i < totalCount; i++) {
        if (numberList.get(i) > max) {
                max = numberList.get(i);
            }
            if (numberList.get(i) < min) {
                min = numberList.get(i);
                return max- min;
