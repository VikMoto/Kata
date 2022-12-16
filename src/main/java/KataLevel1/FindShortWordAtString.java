package KataLevel1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class FindShortWordAtString{
    public static int findShort(String s) {
//       String[] arrS = s.split(" ");
//       int lengthS = arrS[0].length();
//        for (int i = 0; i < arrS.length; i++) {
//            if (arrS[i].length() < lengthS) lengthS = arrS[i].length();
//            System.out.println("lengthS" + lengthS);
//        }


//        int count = stream(s.split(" "))
//                .mapToInt(String::length)
//                .min()
//                .getAsInt();
//       return count;


        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();

    }

    public static void main(String[] args) {
        String s = "bitcoin take over the world maybe who knows perhaps";
        System.out.println("\nfindShort(s) = " + findShort(s));
    }


}
