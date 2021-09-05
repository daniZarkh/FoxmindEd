package ua.com.foxminded.anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @BeforeEach
    void setUp() {
        Anagram anagram = new Anagram();
    }

    @Test
    void reverseText() {
        Anagram anagram = new Anagram();
        String text = "a1bcd efg!h";
        String outcome = anagram.reverseText(text);
        assertEquals("d1cba hgf!e ", outcome);
    }

    @Test
    void reverseWord() {
        Anagram anagram = new Anagram();
        String word = "a1bcd";
        assertEquals("d1cba", anagram.reverseWord(word));
    }

    @Test
    void reverseTextIfEmptyLine() {
        Anagram anagram = new Anagram();
        String text = "";
        String outcome = anagram.reverseText(text);
        assertEquals(" ", outcome);
    }

    @Test
    void reverseWordIfEmptyLine() {
        Anagram anagram = new Anagram();
        String word = "";
        assertEquals("", anagram.reverseWord(word));
    }
}