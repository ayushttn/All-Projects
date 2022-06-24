package com.business;

import com.data.api.TodoService;
import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatcher;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
//import static org.mockito.Mockito.mock;
@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplTest{

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    TodoService todoServiceMock;

    @InjectMocks
    TodoBusinessImpl todoBusinessImpl;
    @Test
    public void delete_todos(){
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        List<String> todos = Arrays.asList("Learn Spring mvc","Learn Dance","Learn Spring");
        given(todoServiceMock.retriveTodos("Dummy")).willReturn(todos);
        todoBusinessImpl.deletetodosnotrelatedtospring("Dummy");
        verify(todoServiceMock).deleteTodo(argumentCaptor.capture());
        assertThat(argumentCaptor.getValue(), is("Learn Dance"));
    }
}