package com.practica.cajanegra;


import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class toStringTest {
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
    @Test
    public void testCommon() throws EmptyCollectionException {
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>("A", "S", "Z");
        String str = "ASZ";
        assertEquals(convert(str), myList.toString());
    }
    @Test
    public void testCommon2() throws EmptyCollectionException {
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>("A", "B");
        String str = "AB";
        assertEquals(convert(str), myList.toString());
    }
    @Test
    public void testEmpty(){
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>();
        String str = "";
        assertEquals(convert(str), myList.toString());
    }
    @Test
    public void testSingleElement() throws EmptyCollectionException {
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>("A");
        String str = "A";
        assertEquals(convert(str), myList.toString());
    }
}
