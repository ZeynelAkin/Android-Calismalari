package com.example.bz.mydiary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2Activity extends Activity {
    Button save;
    EditText text;
    TextView date;
    String dateName;
    String concent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        instalize_elements();



        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.date);
                                long date = System.currentTimeMillis();
                                SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy \nhh-mm-ss a");
                                String dateString = sdf.format(date);
                                tdate.setText(dateString);
                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };
        t.start();



        save.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                dateName = date.getText().toString();
                concent= text.getText().toString();

                try {
                    FileOutputStream fos= openFileOutput(dateName, Context.MODE_PRIVATE);
                    fos.write(concent.getBytes());
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Intent iki = new Intent(Main2Activity.this, Main1Activity.class);
                startActivity(iki);


            }
        });

    }

    private void instalize_elements()
    {
        save=(Button) findViewById(R.id.button);
        text= (EditText) findViewById(R.id.editText);
        date=(TextView) findViewById(R.id.date);
    }
}
