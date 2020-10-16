package com.kb.user.kayitbilgi;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
 * Created by USER on 23.08.2017.
 */
public class Rapor extends AppCompatActivity
{
    Bundle gelenAdetSayisi;

    TextView urunAdi1, urunAdedi1, urunFiyati1;
    TextView urunAdi2, urunAdedi2, urunFiyati2;
    TextView toplamText;

    int sayiAdedi1 =0;
    int fiyatSayisi1 =0;

    int sayiAdedi2 =0;
    int fiyatSayisi2=0;

    Button hesapla;

    protected void onCreate(Bundle rapor)
    {
        super.onCreate(rapor);
        setContentView(R.layout.rapor);

        urunAdedi1 =(TextView)findViewById(R.id.rprText5);
        urunFiyati1 =(TextView)findViewById(R.id.rprText6);

        urunAdedi2 =(TextView)findViewById(R.id.rprText8);
        urunFiyati2 =(TextView)findViewById(R.id.rprText9);

        toplamText=(TextView) findViewById(R.id.toplamtext);

        gelenAdetSayisi=getIntent().getExtras();

        final String adet1=gelenAdetSayisi.getString("adet1");
        final String adet2=gelenAdetSayisi.getString("adet2");

        urunAdedi1.setText(adet1);
        urunAdedi2.setText(adet2);
    }
    public void Hesapla(View v)
    {   int toplam;
        
        sayiAdedi1 =Integer.parseInt(urunAdedi1.getText().toString());
        fiyatSayisi1 =Integer.parseInt(urunFiyati1.getText().toString());

        sayiAdedi2 =Integer.parseInt(urunAdedi2.getText().toString());
        fiyatSayisi2 =Integer.parseInt(urunFiyati2.getText().toString());

        toplam= (sayiAdedi1 * fiyatSayisi1)+(sayiAdedi2*fiyatSayisi2);
        toplamText.setText("Toplam Tutar : "+String.valueOf(toplam)+"  ₺");

    }
}
