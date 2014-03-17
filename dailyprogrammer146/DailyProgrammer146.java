/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyprogrammer146;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Tatu
 */
public class DailyProgrammer146 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String[] mInput = new BufferedReader(
                    new InputStreamReader(System.in)).readLine().split("\\s+"
                    );
            double mNumSides = (Double.parseDouble(mInput[0]) > 100 || Double.parseDouble(mInput[0]) > 3) ? Double.parseDouble(mInput[0]) : 0;
            double mCircumRadius = (Double.parseDouble(mInput[1]) > 100 || Double.parseDouble(mInput[1]) > 0.01) ? Double.parseDouble(mInput[1]) : 0;
            if (mNumSides == 0 | mCircumRadius == 0) {
                System.out.printf("Circumradius must be between 0.01 and 100!");
                System.out.printf("Number of sides must be between 3 and 100!");
            } else {
                double mSideLength = mCircumRadius * (2 * Math.sin(Math.PI / mNumSides));
                System.out.printf("%.3f", mSideLength * mNumSides);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
