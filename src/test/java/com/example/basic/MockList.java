package com.example.basic;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class MockList {

	@Test
	public void testListSize(){
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(5);
		assertEquals(5, listMock.size());
	}

	@Test
	public void testListGet(){
		List listMock = mock(List.class);
		assertEquals(null, listMock.get(0));
		when(listMock.get(anyInt())).thenReturn("one").thenReturn("two");
		assertEquals("one", listMock.get(0));
		assertEquals("two", listMock.get(0));
		verify(listMock, times(3)).get(anyInt());
	}
}
