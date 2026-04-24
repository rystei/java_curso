package secao7.outrosTopicosJava;

import java.util.Locale;

public class FuncoesStrings {

    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG ";

        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(2);
        String s5 = original.substring(2, 6);
        String s6 = original.replace("a", "!");
        String s7 = original.replace("abc", "!+>>");
        int s8 = original.indexOf("bc");
        int s9 = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s1 + "-");
        System.out.println("toUperCase: -" + s2 + "-");
        System.out.println("trim: -" + s3 + "-");
        System.out.println("substring: -" + s4 + "-");
        System.out.println("substring: -" + s5 + "-");
        System.out.println("replace: -" + s6 + "-");
        System.out.println("replace: -" + s7 + "-");
        System.out.println("indexOf: -" + s8);
        System.out.println("lastIndexOf: -" + s9);

    }

}
