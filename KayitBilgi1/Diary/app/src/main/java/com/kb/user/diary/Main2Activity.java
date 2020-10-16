package com.kb.user.diary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    Spinner sp;
    Button bt;


    ArrayList<String> names=new ArrayList<String>();
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sp=(Spinner)findViewById(R.id.spinner);
        bt=(Button)findViewById(R.id.button);

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice,names);
    }
            }
