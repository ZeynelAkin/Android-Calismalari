package com.example.bz.mydiary;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button first= (Button) findViewById(R.id.button1);
        final TextView enterP =(TextView) findViewById(R.id.enterP) ;
        final EditText password=(EditText)findViewById(R.id.password);



        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if(password.getText().toString().equals("busraaa"))
            {
                Intent ilk = new Intent(MainActivity.this, Main1Activity.class);
                startActivity(ilk);
            }
            else
            {

                Toast.makeText(MainActivity.this, "Password is not true ! ", Toast.LENGTH_LONG).show();
            }
            }
        });


    }



}
