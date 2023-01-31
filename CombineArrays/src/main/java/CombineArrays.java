
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[] concatenateInt = combineInt(arr1, arr2);
        System.out.println("concatenated Int array : " + Arrays.toString(concatenateInt));
    }
}



 //int[]a = {0};
//int[]b = {0};
//int[]c = c.concat(a+b);
//for(int i=0; i<c.length; i++)
//System.out.print(c[i]+" ");