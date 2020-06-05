package com.example.interviewtests;

// Given a string, find out if there's repeat characters in it.
public class RepeateCharacters {
    public static void main(String[] args) {
        findRepeatedCharacters("sadewiffnjcsdjqwswcxASdad");
    }

    public static void findRepeatedCharacters(String input) {

        String normalized = (input.toLowerCase()).trim();
        char[] inputCharArray = normalized.toCharArray();
        int index = 1;
        String searchStr = "";

        StringBuilder repatedCharsBuilder = new StringBuilder();
        for (char c : inputCharArray) {
            searchStr = normalized.substring(index);
            if (searchStr.contains(Character.toString(c))) {
                if (!repatedCharsBuilder.toString().contains(Character.toString(c))) {
                    repatedCharsBuilder.append(Character.toString(c));
                }
            }
            index = index + 1;
        }
        String repatedChars = repatedCharsBuilder.toString();

        if (repatedChars.length() > 0) {
            System.out.println("Repeated characters in the input string '" + input + "' are : " + repatedChars);
        } else {

            System.out.println("There are no repated characters in the input string '" + input);
        }

    }
}
