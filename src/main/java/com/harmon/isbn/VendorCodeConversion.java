package com.harmon.isbn;


import java.util.HashMap;

public class VendorCodeConversion {
    private static final HashMap<String, String> vendorMap = new HashMap<String, String>();

    static {
        //UPC vendor code | ISBN vendor code
        vendorMap.put("018926", "0445");
        vendorMap.put("027778", "0449");
        vendorMap.put("037145", "0812");
        vendorMap.put("042799", "0785");
        vendorMap.put("043144", "0688");
        vendorMap.put("044903", "0312");
        vendorMap.put("045863", "0517");
        vendorMap.put("046594", "0694");
        vendorMap.put("047132", "0152");
        vendorMap.put("051487", "0816");
        vendorMap.put("051488", "0140");
        vendorMap.put("060771", "0002");
        vendorMap.put("065373", "0373");
        vendorMap.put("070992", "0523");
        vendorMap.put("070993", "0446");
        vendorMap.put("070999", "0345");
        vendorMap.put("071001", "0380");
        vendorMap.put("071009", "0440");
        vendorMap.put("071125", "0886");
        vendorMap.put("071136", "0451");
        vendorMap.put("071149", "0451");
        vendorMap.put("071152", "0515");
        vendorMap.put("071162", "0451");
        vendorMap.put("071268", "0821");
        vendorMap.put("071831", "0425");
        vendorMap.put("071842", "0843");
        vendorMap.put("072742", "0441");
        vendorMap.put("076714", "0671");
        vendorMap.put("076783", "0553");
        vendorMap.put("076814", "0449");
        vendorMap.put("078021", "0872");
        vendorMap.put("079808", "0394");
        vendorMap.put("090129", "0679");
        vendorMap.put("099455", "0061");
        vendorMap.put("099769", "0451");
        vendorMap.put("034057", "093187");
        vendorMap.put("034057", "155560");
        vendorMap.put("037145", "0765");
        vendorMap.put("050694", "0345");
        vendorMap.put("076714", "0743");
        vendorMap.put("077434", "0743");
        vendorMap.put("645573", "1595");
    }

    /**
     * Converts UPC vendor codes on older books into ISBN-compliant vendor code
     */
    public static String getIsbnFromUpc(String upc) {
        return vendorMap.get(upc);
    }
}
