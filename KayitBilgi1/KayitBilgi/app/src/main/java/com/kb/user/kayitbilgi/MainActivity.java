package com.kb.user.kayitbilgi;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
         Button btn1;
         Button kayitara;
        EditText deneme;
    protected void onCreate(Bundle as)
    {
        super.onCreate(as);

        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.button);

        kayitara=(Button)findViewById(R.id.button5);

        deneme=(EditText)findViewById(R.id.editText5);

        final String hintMesaj;

        hintMesaj= (String) deneme.getText().toString();

        kayitara.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"kafdszvmlx",Toast.LENGTH_LONG);
            }
        });
        btn1.setOnClickListener
                (new   OnClickListener()
        {

            public void onClick(View v)
            {
                Intent bagla=new Intent(MainActivity.this,Ikincisayfaa.class);//Butonun nereden nereye gideceğini belirtik
                startActivity(bagla);
            }
        }
        ) ;

    }
}
