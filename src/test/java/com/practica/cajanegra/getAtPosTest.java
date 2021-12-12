package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class getAtPosTest {
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

            "0",
            "6"

    })

    public void testOutOfBounds(int n) throws java.lang.IllegalArgumentException {
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            this.myList.getAtPos(n);
        });
    }

    @ParameterizedTest
    @CsvSource({

            "1, B",
            "2, E",
            "3, F",
            "4, M",
            "5, P",



    })

    public void test_getAtPosRight(int pos,  String expected)  {
        String result = myList.getAtPos(pos);
        assertEquals(expected, result);
    }
}

