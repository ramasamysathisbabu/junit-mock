package com.example.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.example.data.api.TodoService;

public class TodoBusinessImplMockTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAMock() {

		TodoService mockTodoService = mock(TodoService.class);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);

		List<String> todoList = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Python");

		when(mockTodoService.retrieveTodo("DummyUser")).thenReturn(todoList);

		List<String> springList = todoBusinessImpl.retreieveTodosRelatedToSpring("DummyUser");
		assertEquals(2, springList.size());
	}

	@Test
	public void testRetrieveTodosRelatedToSpring_withEmptyList() {

		TodoService mockTodoService = mock(TodoService.class);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);

		List<String> todoList = Arrays.asList();
		when(mockTodoService.retrieveTodo("someUser")).thenReturn(todoList);

		List<String> springList = todoBusinessImpl.retreieveTodosRelatedToSpring("someUser");
		assertEquals(0, springList.size());

	}
}
