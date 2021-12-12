package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class addNTimesTest {
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

    public void testOutOfBounds(String element, int n) throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> {
            this.myList.addNTimes(element, n);
        });
    }
    @ParameterizedTest
    @CsvSource({

            "@,  1, BEFMP",
            "A,  1, BEFMPA",
            "B,  1, BEFMPB",
            "S,  1, BEFMPS",
            "Y,  1, BEFMPY",
            "Z,  1, BEFMPZ",
            "[,  1, BEFMP",

            "@,  2, BEFMP",
            "A,  2, BEFMPAA",
            "B,  2, BEFMPBB",
            "S,  2, BEFMPSS",
            "Y,  2, BEFMPYY",
            "Z,  2, BEFMPZZ",
            "[,  2, BEFMP",

            "@,  3, BEFMP",
            "A,  3, BEFMPAAA",
            "B,  3, BEFMPBBB",
            "S,  3, BEFMPSSS",
            "Y,  3, BEFMPYYY",
            "Z,  3, BEFMPZZZ",
            "[,  3, BEFMP",

            "@,  10, BEFMP",
            "A,  10, BEFMPAAAAAAAAAA",
            "B,  10, BEFMPBBBBBBBBBB",
            "S,  10, BEFMPSSSSSSSSSS",
            "Y,  10, BEFMPYYYYYYYYYY",
            "Z,  10, BEFMPZZZZZZZZZZ",
            "[,  10, BEFMP",

    })
    public void test_addNTimes(String element, int n, String expected)  {
        myList.addNTimes(element, n);
        assertEquals(convert(expected), this.myList.toString());
    }


}

