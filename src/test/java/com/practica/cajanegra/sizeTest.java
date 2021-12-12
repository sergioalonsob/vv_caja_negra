package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sizeTest {
    @Test
    public void testCommon() {
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>("A", "S", "Z");
        assertEquals(3, myList.size());
    }
    @Test
    public void testCommon2() {
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>("A", "B");
        SingleLinkedListImpl<String> expected = new SingleLinkedListImpl<String>("B", "A");
        assertEquals(2, myList.size());
    }
    @Test
    public void testEmpty(){
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>();
        SingleLinkedListImpl<String> expected = new SingleLinkedListImpl<String>();
        assertEquals(0, myList.size());
    }
    @Test
    public void testSingleElement()  {
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>("A");
        SingleLinkedListImpl<String> expected = new SingleLinkedListImpl<String>("A");
        assertEquals(1, myList.size());
    }
}
