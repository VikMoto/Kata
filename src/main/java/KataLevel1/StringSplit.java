package KataLevel1;
//Complete the solution so that it splits the string into pairs of two characters.
// If the string contains an odd number of characters then it should replace the missing
// second character of the final pair with an underscore ('_').
//
//Examples:
//
//* 'abc' =>  ['ab', 'c_']
//* 'abcdef' => ['ab', 'cd', 'ef']

import java.util.ArrayList;
import java.util.List;

public class StringSplit {
    public static String[] solution(String s) {
//        //Write your code here
//        List<String> result = new ArrayList<>();
//        String end = "_";
//        String[] input = s.split("");
//        if (s.length() == 0) return new String[]{};
//        if (input.length % 2 == 0) {
//            for (int i = 0; i < input.length; i += 2) {
//                result.add(input[i] + input[i + 1]);
//            }
//        } else {
//            for (int i = 0; i < input.length-1; i += 2) {
//                result.add(input[i] + input[i + 1]);
//            }
//            result.add(input[input.length-1] + end);
//        }
//        System.out.println("result[i] = " + result);
//
//        return result.toArray(new String[result.size()]);
//*********************************************************************************************
        s = (s.length() % 2 == 0)?s:s+"_";
        return s.split("(?<=\\G.{2})");

//*********************************************************************************************
//        if(s.length()%2==1) s+="_";
//        int n=s.length()/2;
//        String[] sub=new String[n];
//        for(int i=0;i<n;++i)
//            sub[i]=""+s.charAt(i*2)+s.charAt(1+i*2);
//        return sub;
////*********************************************************************************************
//        String[] arr = s.split("(?<=\\G.{2})");
//
//        if(s.length()%2 == 1)
//            arr[arr.length-1] += "_";
//
//        return arr;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println("solution(s) = " + solution(s));


    }
}
