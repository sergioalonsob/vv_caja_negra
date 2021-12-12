
package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class indexOfTest {
    private SingleLinkedListImpl<String> myList;

    @BeforeEach
    public void setup(){
        this.myList = new SingleLinkedListImpl<String>("F", "E", "F", "M", "P");
    }


    @Test
    public void testNotIn() throws java.util.NoSuchElementException {
        assertThrows(java.util.NoSuchElementException.class, () -> {
            this.myList.indexOf("S");
        });
    }
    @Test
    public void testRight()  {
        assertEquals(2, this.myList.indexOf("E"));
    }


    @Test
    public void testDuplicatedRight()  {
        assertEquals(1, this.myList.indexOf("F"));
    }

    @Test
    public void testDuplicatedWrong()  {
        assertNotEquals(3, this.myList.indexOf("F"));
    }
}
