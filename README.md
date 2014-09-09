UpcIsbnConversion
=================

Converts from older book UPC codes (12+5) into ISBN 10 or 13. May be limited by vendors listed in VendorCodeConversion class.

# Usage

## Convert UPC (12+5) to ISBN 10
~~~
String upc = "07980800795574700";
String isbn13 = UpcToIsbn.getIsbn10(upc);
~~~

## Convert UPC (12+5) to ISBN 13
~~~
String upc = "07980800795574700";
String isbn10 = UpcToIsbn.getIsbn10(upc);
~~~


## Convert ISBN 13 to 10
~~~
String isbn13 = "9780394747009";
String isbn10 = UpcToIsbn.convert13to10(isbn13);
~~~

# Acknowledgements
* UpcToIsbn.convert13to10 from http://snipplr.com/view.php?codeview&id=13298
* Mod11Check, for calculating ISBN check digit, derived from http://w2.syronex.com/jmr/programming/mod11chk
