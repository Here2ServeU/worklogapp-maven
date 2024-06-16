package com.t2s;

import static org.junit.Assert.*;
import org.junit.Test;

import java.io.*;
import java.util.*;

public class WorkLogAppTest {
    @Test
    public void testLogHours() {
        WorkLogApp app = new WorkLogApp();
        Scanner scanner = new Scanner(new ByteArrayInputStream("8\n8\n8\n8\n8\n".getBytes()));
        app.logHours(scanner);

        try (BufferedReader br = new BufferedReader(new FileReader("worklog.txt"))) {
            for (String day : WorkLogApp.DAYS) {
                String line = br.readLine();
                assertNotNull(line);
                assertTrue(line.contains(day));
                assertTrue(line.contains("8.0"));
            }
        } catch (IOException e) {
            fail("Error reading from file: " + e.getMessage());
        }
    }

    @Test
    public void testViewLoggedHours() {
        // Assuming logHours test runs first and successfully logs hours
        WorkLogApp app = new WorkLogApp();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        app.viewLoggedHours();

        String output = outContent.toString();
        for (String day : WorkLogApp.DAYS) {
            assertTrue(output.contains(day));
            assertTrue(output.contains("8.0"));
        }
    }
}
