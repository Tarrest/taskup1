package chisw.com;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Solution {

    @Test
    public void AssertionTest() throws IOException {
        InputData test = new InputData();
        test.readInputData();
    }
}


class InputData {

    private double sum = 0;
    private List<String> listInput;
    private List<String> listRezExp;
    private List<String> listRez;
    private BufferedReader reader;

    public void readInputData() throws IOException {
        listInput = new ArrayList<>();
        reader = new BufferedReader(new FileReader(new File("C:\\project1\\taskup1\\Object_task_up_input.log")));
        listInput = reader.lines().collect(Collectors.toList());
        System.out.println("rez");
        for (int i = 1; i < listInput.size(); i++) {
            String str = listInput.get(i).toString();
            double[] nums = Arrays.stream(str.split("\t")).mapToDouble(Double::parseDouble).toArray();
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j];
            }

            if (sum > 1000) {
                System.out.println("5");
            } else {
                System.out.println("6");
            }
            sum = 0;

        }

    }
}