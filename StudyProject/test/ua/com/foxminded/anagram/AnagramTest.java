package ua.com.foxminded.anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram anagram;

    @BeforeEach
    void setUp() {
        anagram = new Anagram();
    }

    @Test
    void givenNull_whenReverseText_thenNullPointerException() {
        String text = null;
        assertThrows(NullPointerException.class, () -> anagram.reverseText(text));
    }

    @Test
    void givenEmptyLine_reverseText_thenEmptyLine() {
        String text = "";
        String actual = anagram.reverseText(text);

        assertEquals(" ", actual);
    }

    @Test
    void givenWord_reverseText_thenWordReversed() {
        String text = "studies";
        String actual = anagram.reverseText(text);

        assertEquals("seiduts ", actual);
    }

    @Test
    void givenWordWithSymbols_reverseText_thenWordReversedSymbolsRemain() {
        String text = "s1tudied!";
        String actual = anagram.reverseText(text);

        assertEquals("d1eiduts! ", actual);
    }

    @Test
    void givenWordOfSymbols_reverseText_thenIdentical() {
        String text = "!@+-&%*$";
        String actual = anagram.reverseText(text);

        assertEquals("!@+-&%*$ ", actual);
    }

    @Test
    void givenText_whenReverseText_thenWordsReversed() {
        String text = "really simple text";
        String actual = anagram.reverseText(text);

        assertEquals("yllaer elpmis txet ", actual);
    }

    @Test
    void givenTextWithSymbols_whenReverseText_thenWordsReversedSymbolsRemain() {
        String text = "not12 to2o sim!ple te@9xt";
        String actual = anagram.reverseText(text);

        assertEquals("ton12 oo2t elp!mis tx@9et ", actual);
    }

    @Test
    void givenTextOfSymbols_whenReverseText_thenIdentical() {
        String text = "65@!)- ++%^#! &&&&&&";
        String actual = anagram.reverseText(text);

        assertEquals("65@!)- ++%^#! &&&&&& ", actual);
    }


}