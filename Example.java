public class Example {
    
    public static void main(String[] args) {
        String plainText = "HELLO WORLD";
        System.out.println("Encoding [" + plainText + "]..");

        // Example 1
        String offsetChar1 = "B";
        String expectedEncodedText1 = "BGDKKN VNQKC";
        System.out.println("## Example 1: For offset character [" + offsetChar1 + "]:");

        Cipher cipher1 = new Cipher(offsetChar1);
        String encodedText1 = cipher1.encode(plainText);
        System.out.println("Encoded: [" + encodedText1 + "]");
        System.out.println("Expected: [" + expectedEncodedText1 + "]");
        String decodedText1 = cipher1.decode(encodedText1);
        System.out.println("Decoded: [" + decodedText1 + "]");
        System.out.println("Expected: [" + plainText + "]");


        // Example 2
        String offsetChar2 = "F";
        String expectedEncodedText2 = "FC/GGJ RJMG.";
        System.out.println("## Example 2: For offset character [" + offsetChar2 + "]:");
        
        Cipher cipher2 = new Cipher(offsetChar2);
        String encodedText2 = cipher2.encode(plainText);
        System.out.println("Encoded: [" + encodedText2 + "]");
        System.out.println("Expected: [" + expectedEncodedText2 + "]");
        String decodedText2 = cipher2.decode(encodedText2);
        System.out.println("Decoded: [" + decodedText2 + "]");
        System.out.println("Expected: [" + plainText + "]");

    }
}
