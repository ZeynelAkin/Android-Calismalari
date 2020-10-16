package com.example.bz.mydiary;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main1Activity extends Activity {

    Button show;
    Spinner spinner;
    TextView myDay;
    Button add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        instalize_elements();

        getDateName(); //TO GIVE THE VALUES TO SPINNER



        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedDate= String.valueOf(spinner.getSelectedItem());
                try {
                    String data=getData(selectedDate);
                    myDay.setText(data);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            private String getData(String selectedDate) throws IOException {
                String value="";
                FileInputStream fis=openFileInput(selectedDate);
                byte[] input=new byte[fis.available()];
                while(fis.read(input)!=-1)
                {
                    value += new String(input);
                }
                fis.close();
                return  value;
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent add = new Intent(Main1Activity.this, Main2Activity.class);
                startActivity(add);
            }
        });


    }
    private void getDateName() {
        String[] dateName = getApplicationContext().fileList(); // created an array
        List<String> list = new ArrayList<String>(); //transformed to an array list
        for(int i=0; i<dateName.length; i++) //the loop is for spinner
        {
            list.add(dateName[i]); //add to list
        }

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,list);
        spinner.setAdapter(adapter); //to transform data to spinner

    }



    private void instalize_elements()
    {
        spinner=(Spinner) findViewById(R.id.spinner);
        show=(Button) findViewById(R.id.show);
        myDay=(TextView) findViewById(R.id.myDay);
        add=(Button) findViewById(R.id.add);
    }


}
