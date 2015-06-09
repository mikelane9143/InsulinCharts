package com.mikelane9143.insulincharts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Michael on 8/04/2015.
 */
public class Insulin {
    // This class is responsible for loading the chart data for the selected insulin type
    // and looking up the dosage to be administered.
    private InsulinChartParser mChartParser = new InsulinChartParser();

    public void Insulin() {
        // Need to establish input stream, open data file, then pass stream to the chartParser
        //int fileName = R.string.dataFile;
        String fileName = "NovoRapid.xml";
        FileInputStream fileInput;
        try {
            fileInput = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
