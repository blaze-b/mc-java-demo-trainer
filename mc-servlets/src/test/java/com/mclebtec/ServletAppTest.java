package com.mclebtec;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServletAppTest {

    @Test
    public void servlet_init_test() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ServletApp.main(new String[]{"Alice"});

        assertEquals("Hello, Alice", outContent.toString().trim());
    }

}
