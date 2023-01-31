
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[]c = new int[arr1.length+arr2.length];
        int count = 0;
        for(int i = 0; i<arr1.length; i++) {
           c[i] = arr1[i];
           count++;
        }
        for(int j = 0;j<arr2.length;j++) {
           c[count++] = arr2[j];
        }
        for(int i = 0;i<c.length;i++)
        System.out.print(c[i]+" ");
     }
  }
