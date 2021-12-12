
package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class isEmptyTest {
    private SingleLinkedListImpl<String> myList;
    private SingleLinkedListImpl<String> myEmptyList;
    private SingleLinkedListImpl<String> mySingleList;

    @BeforeEach
    public void setup(){

        this.myList = new SingleLinkedListImpl<String>("F", "E", "F", "M", "P");
        this.myEmptyList = new SingleLinkedListImpl<String>( );
        this.mySingleList = new SingleLinkedListImpl<String>("A" );
    }

    @Test
    public void testIsEmpty() {
        assertTrue(myEmptyList.isEmpty());
    }
    @Test
    public void testIsNotEmpty() {
        assertFalse(myList.isEmpty());
    }
    @Test
    public void testIsAlsoNotEmpty() {
        assertFalse(mySingleList.isEmpty());
    }


}

