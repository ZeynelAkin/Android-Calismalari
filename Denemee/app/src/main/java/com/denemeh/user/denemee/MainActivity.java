package com.denemeh.user.denemee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    TextView text1;
    Button  button1;

    protected void onCreate(Bundle BZ) {
        super.onCreate(BZ);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button2);
        text1=(TextView)findViewById(R.id.textView2);
        edit1=(EditText)findViewById(R.id.editText3);


        button1.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View v)
            {

                text1.setText("İsminiz: "+edit1.getText().toString());

            }

        }
        );




    }
}
