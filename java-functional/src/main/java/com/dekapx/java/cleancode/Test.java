package com.dekapx.java.cleancode;



public class Test {
    public static void main(String[] args) {
        Writer writer = getWriter();
        System.out.println(writer.getClass().getTypeName());
    }
    
    private static Writer getWriter() {
        return new TextFileWriter();
    }
}
