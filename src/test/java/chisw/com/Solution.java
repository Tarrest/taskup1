package chisw.com;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Solution
{

    @Test
    public void AssertionTest ()
    {

    }
}


class InputData {

    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void readInputData() throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\project1\\taskup1\\Object_task_up_input.log")));
        String str;
        list = reader.lines().collect(Collectors.toList());
        //list.forEach(System.out::println);


        String[][] array = new String[list.size() - 1][3];

        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j <= 3; j++) {
                array[i][j] = list.get(i);
                System.out.println(array[i][j]);
            }
        }
    }
}
