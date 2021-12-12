package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class reverseTest {
    @Test
    public void testCommon(){
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>("A", "S", "Z");
        SingleLinkedListImpl<String> expected = new SingleLinkedListImpl<String>("Z", "S", "A");
        assertEquals(expected.toString(), myList.reverse().toString());
    }
    @Test
    public void testCommon2()  {
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>("A", "B");
        SingleLinkedListImpl<String> expected = new SingleLinkedListImpl<String>("B", "A");
        assertEquals(expected.toString(), myList.reverse().toString());
    }
    @Test
    public void testEmpty(){
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>();
        SingleLinkedListImpl<String> expected = new SingleLinkedListImpl<String>();
        assertEquals(expected.toString(), myList.reverse().toString());
    }
    @Test
    public void testSingleElement() {
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>("A");
        SingleLinkedListImpl<String> expected = new SingleLinkedListImpl<String>("A");
        assertEquals(expected.toString(), myList.reverse().toString());
    }
}
