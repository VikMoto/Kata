package KataLevel1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.stream.IntStream;


//You will be given an array of numbers. You have to sort the odd numbers in ascending
// order while leaving the even numbers at their original positions.
//
//Examples
//[7, 1]  =>  [1, 7]
//[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
//[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]


 class OddUpSort {
     public static boolean isOdd(final int n) {
         return n % 2 != 0;
     }
        public static int[] sortArray(int[] array) {

//            PrimitiveIterator.OfInt sortedOdds = IntStream
//                    .of(array)
//                    .filter(i -> i % 2 == 1)
//                    .sorted()
//                    .iterator();
//
//            return IntStream
//                    .of(array)
//                    .map(i -> i % 2 == 0 ? i : sortedOdds.nextInt())
//                    .toArray();
//            final Iterator<Integer> sortedOdds = IntStream.of(array)
//                    .filter(OddUpSort::isOdd)
//                    .sorted()
//                    .iterator();
//            return IntStream.of(array)
//                    .map(n -> isOdd(n) ? sortedOdds.next() : n)
//                    .toArray();


            ArrayList<Integer> temp2 = new ArrayList<>();
            int[] result = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 !=0){
                    temp2.add(array[i]);
                }
            }
            temp2.sort((a1,a2) -> a1-a2);
            System.out.println(temp2);
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 !=0){
                    result[i] = temp2.get(index++);
                }
                else result[i] = array[i];
                System.out.print(result[i]);
            }

        return result;
        }




    public static void main(String[] args) {
        int[] arr = new int[]{5, 8, 6, 3, 4};
        sortArray(arr);

    }


}
