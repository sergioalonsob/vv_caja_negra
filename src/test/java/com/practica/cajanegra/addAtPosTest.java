package com.practica.cajanegra;
import com.cajanegra.SingleLinkedListImpl;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class addAtPosTest {
    private SingleLinkedListImpl<String> myList;

    @BeforeEach
    public void setup(){
        this.myList = new SingleLinkedListImpl<String>("B", "E", "F", "M", "P");
    }
    public String convert(String str){
        String strArray[] = str.split("");
        String result = "[";
        for (int i = 0; i < strArray.length; i++) {
            result+=(strArray[i]);
            if(i!=strArray.length-1){
                result += ", ";
            }
        }

        result+="]";
        return result;
    }

    @ParameterizedTest
    @CsvSource({
            "@,  0",
            "A,  0",
            "B,  0",
            "S,  0",
            "Y,  0",
            "Z,  0",
            "[,  0",

    })

    public void testOutOfBounds(String element, int position) throws java.lang.IllegalArgumentException {
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            this.myList.addAtPos(element, position);
        });
    }
    @ParameterizedTest
    @CsvSource({
            "@,  1, BEFMP",
            "A,  1, ABEFMP",
            "B,  1, BBEFMP",
            "S,  1, SBEFMP",
            "Y,  1, YBEFMP",
            "Z,  1, ZBEFMP",
            "[,  1, BEFMP",

            "@,  2, BEFMP",
            "A,  2, BAEFMP",
            "B,  2, BBEFMP",
            "S,  2, BSEFMP",
            "Y,  2, BYEFMP",
            "Z,  2, BZEFMP",
            "[,  2, BEFMP",

            "@,  3, BEFMP",
            "A,  3, BEAFMP",
            "B,  3, BEBFMP",
            "S,  3, BESFMP",
            "Y,  3, BEYFMP",
            "Z,  3, BEZFMP",
            "[,  3, BEFMP",

            "@,  4, BEFMP",
            "A,  4, BEFAMP",
            "B,  4, BEFBMP",
            "S,  4, BEFSMP",
            "Y,  4, BEFYMP",
            "Z,  4, BEFZMP",
            "[,  4, BEFMP",

            "@,  5, BEFMP",
            "A,  5, BEFMAP",
            "B,  5, BEFMBP",
            "S,  5, BEFMSP",
            "Y,  5, BEFMYP",
            "Z,  5, BEFMZP",
            "[,  5, BEFMP",

            "@,  6, BEFMP",
            "A,  6, BEFMPA",
            "B,  6, BEFMPB",
            "S,  6, BEFMPS",
            "Y,  6, BEFMPY",
            "Z,  6, BEFMPZ",
            "[,  6, BEFMP",


    })
    public void testInserting(String element, int position, String expected)  {
        myList.addAtPos(element, position);
        assertEquals(convert(expected), this.myList.toString());
    }


}

