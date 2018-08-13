package com.example.demo;

import com.example.demo.Service.ArrayFlattenerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Array2DTest {
    private ArrayReversor arrayReversor;

    private ArrayFlattenerService flattenerService=mock(ArrayFlattenerService.class);

    @Before
    public void setUp()throws Exception{
        this.arrayReversor=new ArrayReversor(flattenerService);
    }

    @After
    public void tearDown() throws Exception {
        this.arrayReversor=null;
    }

    @Test
    public final void testReverseArray(){
        int[][] a_in = new int[][] { {1,3}, {0}, {1,4,9} };

        when(flattenerService.flattenArray(a_in)).thenReturn(new int[] {1,3,0,1,4,9});

        int[] actual=arrayReversor.reverseArray(a_in);
        int[] expected={9,4,1,0,3,1};
        assertArrayEquals(expected,actual);
        verify(flattenerService).flattenArray(a_in);
    }
}
