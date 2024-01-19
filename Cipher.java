import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cipher {

    private String offsetChar;
    private List<String> shiftTable;

    public final List<String> refTable = List.of(
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
        "U", "V", "W", "X", "Y", "Z",
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "(", ")", "*", "+", ",", "-", ".", "/");

    public Cipher(String offsetChar) {
        if (!refTable.contains(offsetChar)) throw new IllegalArgumentException("Invalid offset character");

        this.offsetChar = offsetChar;
        Integer offsetIndex = refTable.indexOf(offsetChar);
        Integer resetIndex = refTable.size() - offsetIndex;
        this.shiftTable = new ArrayList<>();
        this.shiftTable.addAll(refTable.subList(resetIndex, refTable.size()));
        this.shiftTable.addAll(refTable.subList(0, resetIndex));
    }

    public String getOffsetChar() {
        return this.offsetChar;
    }

    public void setOffsetChar(String offsetChar) {
        this.offsetChar = offsetChar;
    }

    public List<String> getShiftTable() {
        return this.shiftTable;
    }

    public void setShiftTable(List<String> shiftTable) {
        this.shiftTable = shiftTable;
    }

    public List<String> getRefTable() {
        return this.refTable;
    }
 
    public String encode(String plainText) {
        List<String> plainTextList = List.of(plainText.split(""));

        return this.offsetChar + plainTextList
            .stream()
            .map(code -> 
                code.equals(" ") ? " " : this.shiftTable.get(this.refTable.indexOf(code))
            )
            .collect(Collectors.joining());
    }

    public String decode(String encodedText) {
        List<String> encodedtextList = List.of(encodedText.split(""));
        if (encodedtextList.get(0).equals(this.offsetChar)) {
            encodedtextList = encodedtextList.subList(1, encodedtextList.size());
        }

        return encodedtextList
            .stream()
            .map(code -> 
                code.equals(" ") ? " " : this.refTable.get(this.shiftTable.indexOf(code))    
            )
            .collect(Collectors.joining());
    }

}