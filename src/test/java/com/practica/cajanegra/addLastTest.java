package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class addLastTest {
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
            "@, BEFMP",
            "A, BEFMPA",
            "B, BEFMPB",
            "S, BEFMPS",
            "Y, BEFMPY",
            "Z, BEFMPZ",
            "[, BEFMP",

    })

    public void test_addLast(String element,  String expected)  {
        myList.addFirst(element);
        assertEquals(convert(expected), this.myList.toString());
    }
}

