package KataLevel1;

import java.util.stream.Collectors;
//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
//
//For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//Note: The function accepts an integer and returns an integer
public class SquareEveryDigit {
    public int squareDigits(int n) {
        // TODO Implement me
//        int result=0;
//        String resultString ="";
//        String digits = Integer.toString(n) ;
//        String[] digArr = digits.split("");
//        int[] resArr = new int[digArr.length];
//        for (int i = 0; i < digArr.length; i++) {
//            resArr[i] = Integer.valueOf(digArr[i]);
//            resArr[i] *= resArr[i];
//            System.out.println(resArr[i]);
//            resultString += Integer.toString(resArr[i]);
//        }
//        System.out.println(resultString);
//        result = Integer.valueOf(resultString);
//        return result;

//        return Integer.parseInt(String.valueOf(n)
//                .chars()
//                .map(i -> Integer.parseInt(String.valueOf((char) i)))
//                .map(i -> i * i)
//                .mapToObj(String::valueOf)
//                .collect(Collectors.joining("")));

//        String strDigits = String.valueOf(n);
//        String result = "";
//
//        for (char c : strDigits.toCharArray()) {
//            int digit = Character.digit(c, 10);
//            result += digit * digit;
//        }
//        return Integer.parseInt(result);

//        //Use StringBuffer due to performance
//        final StringBuffer result = new StringBuffer();
//        int x = 0;
//
//        //As long as we have digits left.
//        while (n > 0) {
//
//            //Take the next digit (we are in the decimal system).
//            x = n % 10;
//
//            //Delete this digit.
//            n = n / 10;
//
//            //Insert at the first position is necessary otherwise we would get a wrong order.
//            result.insert(0, x * x);
//        }
//        return Integer.parseInt(result.toString());





        return Integer.parseInt((String) String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i*i)
                .mapToObj(i -> Integer.toString(i))
                .collect(Collectors.joining(""))
        );

    }

    public static void main(String[] args) {
        SquareEveryDigit digit1 = new SquareEveryDigit();
        System.out.println("digit1.squareDigits(9119) = " + digit1.squareDigits(9119));

    }
}
