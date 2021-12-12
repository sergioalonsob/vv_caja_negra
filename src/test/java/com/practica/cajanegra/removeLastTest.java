package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class removeLastTest {


    @Test
    public void testCommon() throws EmptyCollectionException {
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>("A", "S", "Z");
        SingleLinkedListImpl<String> expected = new SingleLinkedListImpl<String>("A", "S");
        assertEquals("Z", myList.removeLast());
        assertEquals(expected.toString(), myList.toString());
    }
    @Test
    public void testECException(){
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>();
        assertThrows(EmptyCollectionException.class, () -> {
            myList.removeLast();
        });
    }
    @Test
    public void testSingleElement() throws EmptyCollectionException {
        SingleLinkedListImpl<String> myList = new SingleLinkedListImpl<String>("A");
        SingleLinkedListImpl<String> expected = new SingleLinkedListImpl<String>();
        assertEquals("A", myList.removeLast());
        assertEquals(expected.toString(), myList.toString());
    }

}
