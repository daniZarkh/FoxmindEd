package ua.com.foxminded.anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram anagram = null;

    @BeforeEach
    void setUp() {
        anagram = new Anagram();
    }

    @Test
    void reverseText() {
        String text = "a1bcd efg!h";
        String outcome = anagram.reverseText(text);
        assertEquals("d1cba hgf!e ", outcome);
    }

    @Test
    void reverseWord() {
        String word = "a1bcd";
        assertEquals("d1cba", anagram.reverseWord(word));
    }

    @Test
    void reverseTextIfEmptyLine() {
        String text = "";
        String outcome = anagram.reverseText(text);
        assertEquals(" ", outcome);
    }

    @Test
    void reverseWordIfEmptyLine() {
        String word = "";
        assertEquals("", anagram.reverseWord(word));
    }
}