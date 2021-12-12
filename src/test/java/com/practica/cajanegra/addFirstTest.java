package com.practica.cajanegra;
import com.cajanegra.SingleLinkedListImpl;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class addFirstTest {
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
            "A, ABEFMP",
            "B, BBEFMP",
            "S, SBEFMP",
            "Y, YBEFMP",
            "Z, ZBEFMP",
            "[, BEFMP",

    })

    public void test_addFirst(String element,  String expected)  {
        myList.addFirst(element);
        assertEquals(convert(expected), this.myList.toString());
    }
}

