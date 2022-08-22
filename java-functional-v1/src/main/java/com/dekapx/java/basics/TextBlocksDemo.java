package com.dekapx.java.basics;

public class TextBlocksDemo {
    public static void main(String[] args) {
        String textBlock = """
                            <person>
                                <firstName>Foo</firstName>
                                <lastName>Bar</lastName>
                                <email>foo.bar@dummy.com</email>
                             </person>
                           """;
        System.out.println(textBlock);
    }
}
