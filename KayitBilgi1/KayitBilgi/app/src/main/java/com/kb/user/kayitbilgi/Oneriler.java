package com.kb.user.kayitbilgi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 16.08.2017.
 */

public class Oneriler extends AppCompatActivity

{
                private Bundle birdenFazlaVeriöneriler;
                public Bundle birdenFazlaVeriGöndermeAdetSayisi=new Bundle();

                public TextView oneri1a;
                public TextView oneri2a;

                Button btnGenelCozumler;
                Button btnRapor;

                Spinner spinner2;
                Spinner spinner1;

                String gönderilecekAdetSayisi1;
                String gönderilecekAdetSayisi2;

                int i;
                int görünsün1 =0;
                int görünsün2 =0;

                TextView spinnerverisi1;
                TextView spinnerverisi2;

    protected void onCreate(Bundle as)
    {
        super.onCreate(as);
        setContentView(R.layout.oneriler);

        oneri1a=(TextView)findViewById(R.id.oneri1); // birinci çözüm için
        oneri2a=(TextView)findViewById(R.id.oneri2); // önerıler sayfasına yolladıgımız 1 ı tutması ıcın

        spinnerverisi1 =(TextView)findViewById(R.id.spinnerverisitext1);
        spinnerverisi2 =(TextView)findViewById(R.id.spinnerverisitext2);

        btnGenelCozumler =(Button)findViewById(R.id.genelCozumler);
        btnRapor=(Button)findViewById(R.id.BtnRapor);

        Intent intentdegisken=getIntent(); //intent sınıfından degısken olusturduk

        birdenFazlaVeriöneriler=getIntent().getExtras();

       final String ad=birdenFazlaVeriöneriler.getString("soru1"); // veri'nin içindekini(0-1) ad'a atıyor. ad degıskenı olusturuldu. final: Değiştirilemeyen sabit değişkenler.
       final String ad1=birdenFazlaVeriöneriler.getString("soru2");

        spinner1=(Spinner)findViewById(R.id.spinner1);
        spinner2=(Spinner)findViewById(R.id.spinner2);



        ArrayList<String> list=new ArrayList<>();

        for ( i=0;i<=20;i++)
        {
            list.add(""+i+"");
        }
            ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,list);

            spinner1.setAdapter(adapter);
            spinner2.setAdapter(adapter);

        btnGenelCozumler.setOnClickListener(new View.OnClickListener() //button5 e tıklayınca oolacaklar
        {

            public void onClick(View view)
            {
                if (ad.equals("1")) //ad 1'e eşitse
                {
                    oneri1a.setVisibility(View.VISIBLE);
                    spinner1.setVisibility(View.VISIBLE);
                }
                if (ad1.equals("1"))
                {
                    oneri2a.setVisibility(View.VISIBLE);
                    spinner2.setVisibility(View.VISIBLE);
                }
            }
        });






        btnRapor.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view)
            {
                  gönderilecekAdetSayisi1 =spinner1.getSelectedItem().toString();
                  gönderilecekAdetSayisi2 =spinner2.getSelectedItem().toString();

                  spinnerverisi1.setText(gönderilecekAdetSayisi1);
                  spinnerverisi2.setText(gönderilecekAdetSayisi2);

                birdenFazlaVeriGöndermeAdetSayisi.putString("adet1",spinnerverisi1.getText().toString());
                birdenFazlaVeriGöndermeAdetSayisi.putString("adet2",spinnerverisi2.getText().toString());

                Intent raporSayfası=new Intent(Oneriler.this,Rapor.class);
                raporSayfası.putExtras(birdenFazlaVeriGöndermeAdetSayisi);
                startActivity(raporSayfası);
            }
        });

    }


}
