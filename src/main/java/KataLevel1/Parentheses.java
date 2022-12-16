package KataLevel1;

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
        String str = "";
        System.out.println("validParentheses(str) = " + validParentheses(str));
    }
}
