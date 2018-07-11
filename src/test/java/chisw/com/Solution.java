package chisw.com;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Solution
{

    @Test
    public void AssertionTest () throws IOException {
        InputData test = new InputData();
        test.readInputData();
    }
}


class InputData {

    public void readInputData() throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\project1\\taskup1\\Object_task_up_input.log")));
        String str;
        list = reader.lines().collect(Collectors.toList());
        list.forEach(System.out::println);

    }
}
