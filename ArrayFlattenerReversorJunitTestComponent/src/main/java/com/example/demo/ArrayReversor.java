package com.example.demo;

import com.example.demo.Service.ArrayFlattenerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ArrayReversor {

    private ArrayFlattenerService flattenerService;

    public ArrayReversor(ArrayFlattenerService flattenerService) {
        this.flattenerService = flattenerService;
    }

    public int[] reverseArray(int[][] a) {
        int[] a_flat = flattenerService.flattenArray(a);

        if (a_flat != null) {
            // Then, Reverse it
            int i = 0;
            int j = a_flat.length - 1;
            while (i < j) {
                int temp = a_flat[i];
                a_flat[i] = a_flat[j];
                a_flat[j] = temp;
                i++;
                --j;
            }

        }
        return a_flat;
    }
}
