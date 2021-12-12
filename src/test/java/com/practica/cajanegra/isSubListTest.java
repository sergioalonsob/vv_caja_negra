package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class isSubListTest {
    private SingleLinkedListImpl<String> myList;


    @BeforeEach
    public void setup() {

        this.myList = new SingleLinkedListImpl<String>("A", "S", "Z");

    }

    @Test
    public void testIn1() {
        SingleLinkedListImpl<String> subList = new SingleLinkedListImpl<String>("A");
        assertEquals(1, this.myList.isSubList(subList));
    }

    @Test
    public void testIn2() {
        SingleLinkedListImpl<String> subList = new SingleLinkedListImpl<String>("S", "Z");
        assertEquals(2, this.myList.isSubList(subList));
    }

    @Test
    public void testIn3() {
        SingleLinkedListImpl<String> subList = new SingleLinkedListImpl<String>("A", "S", "Z");
        assertEquals(1, this.myList.isSubList(subList));
    }



    @Test
    public void testNotIn1(){
        SingleLinkedListImpl<String> subList = new SingleLinkedListImpl<String>("B");
        assertEquals(-1, this.myList.isSubList(subList));
    }

    @Test
    public void testNotIn2(){
        SingleLinkedListImpl<String> subList = new SingleLinkedListImpl<String>("A", "S", "Z", "A");
        assertEquals(-1, this.myList.isSubList(subList));

    }
    @Test
    public void testNotIn3(){
        SingleLinkedListImpl<String> subList = new SingleLinkedListImpl<String>("A", "A", "S", "Z");
        assertEquals(-1, this.myList.isSubList(subList));

    }
    @Test
    public void testNotIn4(){
        SingleLinkedListImpl<String> subList = new SingleLinkedListImpl<String>("");
        assertEquals(-1, this.myList.isSubList(subList));

    }
    @Test
    public void testNotIn5(){
        SingleLinkedListImpl<String> EmptyList = new SingleLinkedListImpl<String>();
        SingleLinkedListImpl<String> subList = new SingleLinkedListImpl<String>("A");
        assertEquals(-1, EmptyList.isSubList(subList));

    }
}

