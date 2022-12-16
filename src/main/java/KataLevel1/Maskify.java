package KataLevel1;
//Usually when you buy something, you're asked whether your credit card number, phone number
// or answer to your most secret question is still correct. However, since someone could look
// over your shoulder, you don't want that shown on your screen. Instead, we mask it.
//
//Your task is to write a function maskify, which changes all but the last four characters into '#'.
//
//Examples
//"4556364607935616" --> "############5616"
//     "64607935616" -->      "#######5616"
//               "1" -->                "1"
//                "" -->                 ""
//
//// "What was the name of your first pet?"
//
//"Skippy" --> "##ippy"
//
//"Nananananananananananananananana Batman!"
//-->
//"####################################man!"

public class Maskify {
    public static String maskify(String str) {
        if (str.length()<4) return str;
        String end = str.substring(str.length()-4,str.length());
        String mask = "";
        for (int i = 0; i < str.length()-4; i++) {
            mask +="#";
        }
        return mask+end;

//        return str.replaceAll(".(?=.{4})", "#");
//  return str.length() < 5 ? str : "#".repeat(str.length() - 4) + str.substring(str.length() - 4);
//        int len = str.length();
//        if(len <= 4)
//          return str;
//        return "#".repeat(len-4) + str.substring(len-4,len);
//   return (str.substring(0,str.length()-4).replaceAll(".","#") + str.substring(str.length()-4));

    }

    public static void main(String[] args) {
        String card = "Skippy";
        System.out.println("maskify(card) = " + maskify(card));

    }

}
