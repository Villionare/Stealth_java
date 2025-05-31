package ZERO;

import java.nio.charset.Charset;

//Java primarily follows Unicode encoding, ensuring support for multiple languages and symbols.
// However, it also provides various character encoding schemes for handling text data efficiently.
//java supports multiple charsets and the default is UTF - 8, which ahs variations of utf8, utf16, utf32
//java supports other encoding systems like
//Java supports multiple encoding formats, including:
//        - UTF-8 → Variable-length encoding (1 to 4 bytes per character).
//        - UTF-16 → Fixed-length encoding (2 bytes per character).
//        - UTF-32 → Fixed-length encoding (4 bytes per character).
//        - ISO-8859-1 → Single-byte encoding for Western European languages.
//        - ASCII → Basic 7-bit encoding (limited character set).

public class UnicodeSystem {
    static char a = '\u00A9';

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println( System.getProperty("file.encoding"));
        System.out.println(Charset.availableCharsets());
        System.out.println(Charset.defaultCharset());
    }
}
