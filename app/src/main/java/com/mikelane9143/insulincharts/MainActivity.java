package com.mikelane9143.insulincharts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner insulinSpinner = (Spinner) findViewById(R.id.insulinTypeSpinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> insulinAdapter = ArrayAdapter.createFromResource(this,
                R.array.insulinTypeArray, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        insulinAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        insulinSpinner.setAdapter(insulinAdapter);

        Spinner chartSpinner = (Spinner) findViewById(R.id.chartIndexSpinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> chartAdapter = ArrayAdapter.createFromResource(this,
                R.array.novoRapIndexArray, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        chartAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        chartSpinner.setAdapter(chartAdapter);

        Insulin insulin = new Insulin();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private boolean isBGLValid(float bgl){
        // Determine if the value of bgl is valid
        // Has a value actually been put into the field, or is it still 0.0?
        if (bgl < 0.1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    private boolean isExchangesValid(float exch){
        // Determine if the value of bgl is valid
        // Has a value actually been put into the field, or is it still 0.0?
        if (exch < 0.5)
        {
            return false;
        }
        else
        {
            if ((exch % 0.5) > 0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
    }

    private String lookupDosage(String exchanges, String bgl, String chart)
    {
        String dosageValue = "1";
        //AlertDialog chartAlert = new AlertDialog("Hello");
        return dosageValue;
    }
}
