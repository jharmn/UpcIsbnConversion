package com.harmon.isbn;

import org.junit.Test;

import static org.junit.Assert.*;

public class Mod11CheckTests {
    @Test
    public void calculates_mod11_checksum() {
        String mod = Mod11Check.calc("039474700");
        assertEquals("3", mod);
    }
}
