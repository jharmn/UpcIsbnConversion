package com.harmon.isbn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpcToIsbnTests {
    @Test
    public void converts_13isbn_to_10isbn() {
        String isbn13 = "9780470913024";
        assertEquals("0470913029", UpcToIsbn.convert13to10(isbn13));
    }

    @Test
    public void converts_upc_to_isbn10() {
        String upc = "07980800795574700";
        assertEquals("0394747003", UpcToIsbn.getIsbn10(upc));

        upc = "07099900395531571";
        assertEquals("0345315715", UpcToIsbn.getIsbn10(upc));
    }

    @Test
    public void converts_upc_to_isbn13() {
        String upc = "07980800795574700";
        assertEquals("9780394747009", UpcToIsbn.getIsbn13(upc));

        upc = "07099900395531571";
        assertEquals("9780345315717", UpcToIsbn.getIsbn13(upc));
    }
}
