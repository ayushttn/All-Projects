package com.data.api;

import org.junit.*;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    public void letsMockListMethod() {
        List listmock = mock(List.class);
        when(listmock.size()).thenReturn(2);
        assertEquals(2, listmock.size());
    }
    @Test
    public void letsMockListSize_ReturnMultiple() {
        List listmock = mock(List.class);
        when(listmock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2, listmock.size());
        assertEquals(3, listmock.size());
    }
    @Test
    public void letsMockListGet() {
        List listmock = mock(List.class);
        when(listmock.get(0)).thenReturn("Hi").thenReturn("hello");
        assertEquals("Hi", listmock.get(0));
        assertEquals("hello", listmock.get(0));
    }
    @Test(expected = RuntimeException.class)
    public void letsMockList_throwException() {
        List listmock = mock(List.class);
        when(listmock.get(0)).thenThrow(new RuntimeException("Something"));
        listmock.get(0);

    }
}
