package KataLevel1;
//Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the
// "instructions" for the development and functioning of living organisms.
//
//If you want to know more: http://en.wikipedia.org/wiki/DNA
//
//In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your
// function receives one side of the DNA (string, except for Haskell); you need to return
// the other complementary side. DNA strand is never empty or there is no DNA at all (again,
// except for Haskell).
//
//More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)
//
//Example: (input --> output)
//
//"ATTGC" --> "TAACG"
//"GTAT" --> "CATA"


//public class DnaStrand {
//    public static String makeComplement(String dna) {
//        char[] chars = dna.toCharArray();
//        for(int i = 0; i < chars.length; i++) {
//            chars[i] = getComplement(chars[i]);
//        }
//        return new String(chars);
//    }
//    private static char getComplement(char c) {
//        switch(c) {
//            case 'A': return 'T';
//            case 'T': return 'A';
//            case 'C': return 'G';
//            case 'G': return 'C';
//        }
//        return c;

//        return dna.replace("A","B")
//                .replace("C","D")
//                .replace("T","A")
//                .replace("G","C")
//                .replace("B","T")
//                .replace("D","G");


//        String result = "";
//        for (char c : dna.toCharArray()) {
//            if(c == 'A') result += 'T';
//            else if(c == 'T')  result += 'A';
//            if(c == 'C')  result += 'G';
//            else if(c == 'G')  result += 'C';
//        }
//        return result;
//    }

//    public static void main(String[] args) {
//        System.out.println("makeComplement(\"GTAT\") = " + makeComplement("GTAT"));
//    }
//}
