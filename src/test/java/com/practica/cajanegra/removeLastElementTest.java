package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class removeLastElementTest {

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
            "A, SZ",
            "S, AZ",
            "Z, AS"
    })
    public void testCommon(String element, String expected) throws EmptyCollectionException {
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>("A", "S", "Z");
        myList.removeLast(element);
        assertEquals(convert(expected), myList.toString());
    }
    @ParameterizedTest
    @CsvSource({
            "A, ABC",
            "B, AAC",
            "C, AAB"
    })
    public void testCommonWithDuplicated(String element, String expected) throws EmptyCollectionException {
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>("A", "A", "B", "C");
        myList.removeLast(element);
        assertEquals(convert(expected), myList.toString());
    }

    @Test
    public void testNotIn() throws EmptyCollectionException{
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>("A", "B");
        SingleLinkedListImpl<String> expected = new SingleLinkedListImpl<String>("A", "B");
        myList.removeLast("C");
        assertEquals(expected.toString(),myList.toString());
    }
    @Test
    public void testEmptyList(){
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>();
        assertThrows(EmptyCollectionException.class, () -> {
            myList.removeLast("C");
        });
    }

}
