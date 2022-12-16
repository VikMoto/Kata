package KataLevel1;

//You are going to be given an array of integers. Your job is to take that array and find an index N
// where the sum of the integers to the left of N is equal to the sum of the integers to the right of N.
// If there is no index that would make this happen, return -1.
//
//For example:
//
//Let's say you are given the array {1,2,3,4,3,2,1}:
//Your function will return the index 3, because at the 3rd position of the array, the sum of left side of
// the index ({1,2,3}) and the sum of the right side of the index ({3,2,1}) both equal 6.
//
//Let's look at another one.
//You are given the array {1,100,50,-51,1,1}:
//Your function will return the index 1, because at the 1st position of the array, the sum of left side of
// the index ({1}) and the sum of the right side of the index ({50,-51,1,1}) both equal 1.
//
//Last one:
//You are given the array {20,10,-80,10,10,15,35}
//At index 0 the left side is {}
//The right side is {10,-80,10,10,15,35}
//They both are equal to 0 when added. (Empty arrays are equal to 0 in this problem)
//Index 0 is the place where the left side and right side are equal.
//
//Note: Please remember that in most programming/scripting languages the index of an array starts at 0.
//
//Input:
//An integer array of length 0 < arr < 1000. The numbers in the array can be any integer positive or negative.
//
//Output:
//The lowest index N where the side to the left of N is equal to the side to the right of N. If you do not
// find an index that fits these rules, then you will return -1.
//
//Note:
//If you are given an array with multiple answers, return the lowest correct index.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindEvenIndex {
    public static int findEvenIndex(int[] arr) {
        // your code
//        List<Integer> indexes = new ArrayList<>();
//        List<Integer> inputArr = new ArrayList<>();
//
//        int index = arr.length/2;
//        Integer  result;
//        int sumLeft = 0;
//        int sumRight = 0;
//        boolean end = true;
//        for (int i = 0; i < arr.length; i++) {
//            inputArr.add(arr[i]);
//        }
//        if (arr.length == 2) {
//            if (arr[1] == 0) return 0;
//            if (arr[0] == 0) return 1;
//            if (arr[0] !=0 && arr[1] !=0) return -1;
//        }
//
//        do {
//            for (int i = 0; i < index ; i++) {
//                sumLeft += arr[i];
//            }
//            for (int i = index+1 ; i < arr.length; i++) {
//                sumRight += arr[i];
//            }
//            if (sumLeft == sumRight || sumLeft == 0 ) {
//                indexes.add(index);
//            }
//            sumLeft = 0;
//            sumRight = 0;
//            index++;
//
//            if(index > arr.length-1) end = false;
//        }while (end);
//
//        end = true;
//        index = arr.length/2;
//        if (index ==1) index = 0;
//        do {
//            for (int i = 0; i < index ; i++) {
//                sumLeft += arr[i];
//            }
//            for (int i = index+1 ; i < arr.length; i++) {
//                sumRight += arr[i];
//            }
//            if (sumLeft == sumRight || sumRight == 0) {
//               indexes.add(index);
//
//            }
//            sumLeft = 0;
//            sumRight = 0;
//            index--;
//
//
//            if(index < 0) end = false;
//        }while (end);
//
//        //find less index in case several results
//        System.out.println("indexes.size() = " + indexes.size());
//        if(indexes.size() != 0) {
//            result = indexes.stream().min(Integer::compare).get();
//
//        } else result = -1;
//        System.out.println("indexes = " + indexes);
//        System.out.println("inputArr = " + inputArr);
//        System.out.println("result = " + result);
//        return result;

//        for(int i = 0; i < arr.length; i++){
//            if(leftSum(arr, i) == rightSum(arr, i))
//                return i;
//        }
//
//        return -1;
//    }
//
//    public static long leftSum(int[] arr,int idx){
//        long result = 0;
//
//        for(int i = 0; i < idx; i++){
//            result += arr[i];
//        }
//
//        return result;
//    }
//
//    public static long rightSum(int[] arr, int idx){
//        long result = 0;
//
//        for(int i = idx + 1; i < arr.length; i++){
//            result += arr[i];
//        }
//
//        return result;


//        int left = 0;
//        int right = Arrays.stream(arr).sum();
//        for (int i=0; i<arr.length; i++){
//            right -= arr[i];
//            if (left == right) return i;
//            left += arr[i];
//        }
//        return -1;

        return IntStream.range(0, arr.length)
                .filter(n -> IntStream.of(arr).limit(n).peek(System.out::println).sum() == IntStream.of(arr).peek(System.out::println).skip(n + 1).sum())

                .findFirst().orElse(-1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10,0,8};
        System.out.println("findEvenIndex(arr) = " + findEvenIndex(arr));
    }

}
