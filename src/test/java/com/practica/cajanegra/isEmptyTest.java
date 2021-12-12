
package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class isEmptyTest {
    private SingleLinkedListImpl<String> myList;
    private SingleLinkedListImpl<String> myEmptyList;
    private SingleLinkedListImpl<String> mySingleList;
    private SingleLinkedListImpl<String> myDoubleList;
    private SingleLinkedListImpl<String> myOtherList;

    @BeforeEach
    public void setup(){

        this.myList = new SingleLinkedListImpl<String>("F", "E", "F", "M", "P");
        this.myEmptyList = new SingleLinkedListImpl<String>( );
        this.mySingleList = new SingleLinkedListImpl<String>("A" );
        this.myDoubleList = new SingleLinkedListImpl<String>("A", "B" );
        this.myOtherList = new SingleLinkedListImpl<String>("F", "E", "F", "M", "P", "A", "X");
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

    @Test
    public void testIsNotEmptyNoWay() {
        assertFalse(myList.isEmpty());
    }
    @Test
    public void testIsAbsolutlyNotEmpty() {
        assertFalse(myList.isEmpty());
    }


}

