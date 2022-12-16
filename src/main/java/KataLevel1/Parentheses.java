package KataLevel1;
/**Write a function that takes a string of parentheses, and determines if the order of
// the parentheses is valid. The function should return true if the string is valid,
// and false if it's invalid.
//
//Examples
//"()"              =>  true
//")(()))"          =>  false
//"("               =>  false
//"(())((()())())"  =>  true
//Constraints
//0 <= input.length <= 100
//
//Along with opening (() and closing ()) parenthesis, input may contain any valid ASCII
// characters. Furthermore, the input string may be empty and/or not contain any
// parentheses at all. Do not treat other forms of brackets as parentheses
// (e.g. [], {}, <>).*/
public class Parentheses {
    public static boolean validParentheses(String parens)
    {
        //Put code below
       int count = 0;
        System.out.println(parens);
        //if (parens.equals("")) return false;
       String[] inpArr = parens.split("");
        for (int i = 0; i < inpArr.length && inpArr.length <= 100; i++) {
            if (inpArr[i].equals(")")) count--;
            if (count<0) return count == 0;
            if (inpArr[i].equals("(")) count++;
        }
        return count == 0;
    }
    public static void main(String[] args) {
        String str = ")(()))";
        System.out.println("validParentheses(str) = " + validParentheses(str));
    }
}
