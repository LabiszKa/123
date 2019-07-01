package com.kodilla;

import com.kodilla.stream1.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text in UpperCase", text -> text.toUpperCase());
        poemBeautifier.beautify("ZBC come first", text -> text.replace('Z', 'A'));
        poemBeautifier.beautify("LOWERCASE", text -> text.toLowerCase());
        poemBeautifier.beautify("your busy", text -> text.replaceAll("your", "you are"));
        poemBeautifier.beautify("yowhat?", text -> text.substring(2));
    }
}