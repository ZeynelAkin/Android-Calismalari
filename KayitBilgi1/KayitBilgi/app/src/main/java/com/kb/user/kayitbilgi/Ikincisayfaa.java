package com.kb.user.kayitbilgi;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Ikincisayfaa extends AppCompatActivity
{
        EditText edtxAd,edtxSoyad,edtxYas,edtxKonum,edtxTelefon,edtxUlaşım,edtxKacinciKat,edtxOdaSayisi,edtxTc;
        String ad,soyad,yas,konum,telefon,ulasim,kacinciKat,odaSayisi,tc;
    protected void onCreate(Bundle as)
    {
        super.onCreate(as);
        setContentView(R.layout.ikinci);
        // id atamaları
        edtxAd=(EditText)findViewById(R.id.edtxAd);
        edtxSoyad=(EditText)findViewById(R.id.edtxSoyad);
        edtxYas=(EditText)findViewById(R.id.edtxYas);
        edtxKonum=(EditText)findViewById(R.id.edtxKonum);
        edtxTelefon=(EditText)findViewById(R.id.edtxTelefon);
        edtxUlaşım=(EditText)findViewById(R.id.edtxUlasim);
        edtxKacinciKat=(EditText)findViewById(R.id.edtxKacinciKat);
        edtxOdaSayisi=(EditText)findViewById(R.id.edtxOdaSayisi);
        edtxTc=(EditText)findViewById(R.id.edtxTc);
        // string atamaları
        ad=edtxAd.getText().toString();
        soyad=edtxSoyad.getText().toString();
        yas=edtxYas.getText().toString();
        konum=edtxKonum.getText().toString();
        telefon=edtxTelefon.getText().toString();
        ulasim=edtxUlaşım.getText().toString();
        kacinciKat=edtxKacinciKat.getText().toString();
        odaSayisi=edtxOdaSayisi.getText().toString();
        tc= edtxTc.getText().toString();
    }
    public void onclikkk(View v) //2.sayfaydakı kaydet butonuna tıklayınca genel sorular sayfasına yonlendırıyor
    {
       /* Kayit kayit=new Kayit(ad,soyad,tc,yas,konum,telefon,ulasim,kacinciKat,odaSayisi);
        veriTabani db = new veriTabani(getApplicationContext());
        long id = db.ekleKayit(kayit);
        if (id>0)
        {
            Toast.makeText(getApplicationContext(),"Kayıt Başarılı! ID=" + id, Toast.LENGTH_LONG).show();
            Intent bagla = new Intent(Ikincisayfaa.this, Genelsorular.class);//Butonun nereden nereye gideceğini belirtik
            startActivity(bagla);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Kayıt Başarısız! ", Toast.LENGTH_LONG).show();
            Intent bagla = new Intent(Ikincisayfaa.this, Genelsorular.class);//Butonun nereden nereye gideceğini belirtik
            startActivity(bagla);
        }
      */if(edtxAd.getText().toString().trim().equals("")||edtxSoyad.getText().toString().trim().equals("")||edtxYas.getText().toString().trim().equals("")||edtxKonum.getText().toString().trim().equals("")||edtxTelefon.getText().toString().trim().equals("")||edtxUlaşım.getText().toString().trim().equals("")||edtxKacinciKat.getText().toString().trim().equals("")||edtxOdaSayisi.getText().toString().trim().equals(""))
        {
            Toast.makeText(getApplicationContext(),"Lütfen Boş Alanları Giriniz",Toast.LENGTH_LONG).show();
        }else
       { Toast.makeText(getApplicationContext(),"Kayıt Başarılı! " , Toast.LENGTH_LONG).show();
 Intent bagla = new Intent(Ikincisayfaa.this, Genelsorular.class);//Butonun nereden nereye gideceğini belirtik
        startActivity(bagla);
       }
    }
}
