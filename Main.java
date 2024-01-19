public class Main {
    public static void main(String[] args) {
        Cipher cipher;
        String encodedText;
        String plainText;
        
        System.out.println("Hi, welcome to the cipher!");
        while (true) {
            System.out.println("Do you wish to [e]ncode, [d]ecode?: ");
    
            String method = System.console().readLine().strip().toUpperCase();
            if (method.startsWith("E")) {
                System.out.println("Indicate the offset character: ");
                String offsetChar = System.console().readLine().strip().toUpperCase();
                System.out.println("Input text to encode: ");
                plainText = System.console().readLine().strip().toUpperCase();

                System.out.println("Encoding text..");
                cipher = new Cipher(offsetChar.toUpperCase());
                encodedText = cipher.encode(plainText);

                System.out.println("Encoded text: " + encodedText);

            } else if (method.startsWith("D")) {
                System.out.println("Input text to decode: ");
                encodedText = System.console().readLine().strip().toUpperCase();

                System.out.println("Decoding text..");
                cipher = new Cipher(encodedText.substring(0, 1));
                plainText = cipher.decode(encodedText);

                System.out.println("Decoded text: " + plainText);

            } else {
                System.out.println("Unrecognised input");
            }
        }
    }
}
