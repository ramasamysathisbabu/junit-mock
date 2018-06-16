package com.example.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.example.data.api.TodoService;
import com.example.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub(){
		
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);

		List<String> springList = todoBusinessImpl.retreieveTodosRelatedToSpring("someUser");
		assertEquals(2, springList.size());
	}
}
