package com.harmon.isbn;


public class UpcToIsbn {
    private static final String ISBN_13_PREFIX = "978";

    /**
     * Converts ISBN 13 digit to 10 digit
     * From http://snipplr.com/view.php?codeview&id=13298
     */
    public static String convert13to10(String isbn13) {
        String isbn = isbn13;
        if (isbn.length() == 13 && isbn.indexOf(ISBN_13_PREFIX) == 0)
        {
            isbn = isbn.substring(3,12);
            int xsum = 0;

            for (int i = 0; i < 9; i++)
            {
                xsum += (10 - i) * Character.getNumericValue(isbn.charAt(i));
            }

            xsum %= 11;
            xsum = 11 - xsum;

            String x_val = String.valueOf(xsum);

            switch (xsum)
            {
                case 10: x_val = "X"; break;
                case 11: x_val = "0"; break;
            }

            isbn += x_val;
            return isbn;
        }
        return isbn;
    }

    /**
     * Converts older book UPC into ISBN 13
     * @param upc Older book UPC (must include all 12 + 5 extension digits)
     * @return
     */
    public static String getIsbn13(String upc) {
        String upcVendorCode = upc.substring(0, 6);
        String isbnLast = upc.substring(12);

        String isbnVendor = VendorCodeConversion.getIsbnFromUpc(upcVendorCode);


        String isbn10WithoutCheck = String.format("%s%s%s", ISBN_13_PREFIX, isbnVendor, isbnLast);
        String checkDigit = Mod11Check.calc(isbn10WithoutCheck);

        return String.format("%s%s", isbn10WithoutCheck, checkDigit);
    }

    /**
     * Converts older book UPC into ISBN 10
     * @param upc Older book UPC (must include all 12 + 5 extension digits)
     * @return
     */
    public static String getIsbn10(String upc) {
        return convert13to10(getIsbn13(upc));
    }
}

