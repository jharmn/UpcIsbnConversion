package com.harmon.isbn;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendorCodeConversionTests {
    @Test
    public void converts_upc_vendor_to_isbn_vendor() {
        String upc = "079808";
        String isbn10 = "0394";
        assertEquals(isbn10, VendorCodeConversion.getIsbnFromUpc(upc));
    }
}
