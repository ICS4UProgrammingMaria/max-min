package maxmin;



/*
 * Created by: Maria Temu
 * Created on: 11-Feb-2020
 * Created for: ICS4U
 * Day #6 (Max & Min)
 * This program acts as a simple calculator,
 * letting the user input numbers and either multiply,
 * divide, subtract or add
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;
import java.util.stream.IntStream;

public class maxmin {
    private JButton btnGenerate;
    private JTextArea txtField;
    private JLabel lblMin;
    private JLabel lblMax;
    private JPanel maxminPanel;


    public static void main(String[] args) {
        JFrame frame = new JFrame("max & min");
        frame.setContentPane((new maxmin().maxminPanel));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


    public maxmin() {
        btnGenerate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //int max =
                String listOfNumbersAsString = "";
                Random objGenerator = new Random();
                int[] listOfNumbers = new int[10];

                // creating list of random numbers with a range of 100
                for (int iCount = 0; iCount < 10; iCount++) {
                    // Generating the next random number
                    int randomNumber = objGenerator.nextInt(100);

                    //adding a random number to the array
                    listOfNumbers[iCount] = randomNumber;

                    //Adding random number to string
                    listOfNumbersAsString = listOfNumbersAsString + Integer.toString(randomNumber) + "\n\r";

                }

                //Displaying String in text field
                txtField.setText(listOfNumbersAsString);
                txtField.setEditable(true);

                //
                int maxNum = listOfNumbers[0];
                for (int icount = 1; icount < 10; icount++)
                {
                    if (maxNum < listOfNumbers[icount])
                    {
                            maxNum = listOfNumbers[icount];
                    }
                }

                int minNum = listOfNumbers[0];
                for (int icount = 1; icount > 10;)

                lblMax.setText(Integer.toString(maxNum));


            }
            });
    };
}




                    //System.out.println( randomNumber);
                   // String strrandom = Double.toString(randomNumber);
                    //txtField.setText (strrandom);
                //System.out.println("Min is" + Math.min());
