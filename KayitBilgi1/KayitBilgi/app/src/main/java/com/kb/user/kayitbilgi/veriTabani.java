package com.kb.user.kayitbilgi;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;

public class veriTabani extends SQLiteOpenHelper {

    private static final String veritabani_adi=" veritabani_ecare ";
    private static final String kayitTablosu=" kayitTablosu ";
    private static final int veritabaniVersiyon = 1;

    public veriTabani(Context context) {
        super(context, veritabani_adi, null, veritabaniVersiyon);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        //Tabloları oluşturacağız
        String sql_kayitTablosuOlusturma= " CREATE TABLE " + kayitTablosu + "(ad Text,soyad text,tc int primary key,yas int,  konum text, telefon int, ulasim text, kacinciKat int, odaSayisi int)" ;
        db.execSQL(sql_kayitTablosuOlusturma);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS" + kayitTablosu);
    }

    public long ekleKayit(Kayit kayit)
    {
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put("ad",kayit.getAd());
        cv.put("soyad",kayit.getSoyad());
        cv.put("tc",kayit.getTc());
        cv.put("yas",kayit.getYas());
        cv.put("konum",kayit.getKonum());
        cv.put("telefon",kayit.getTelefon());
        cv.put("ulasim",kayit.getUlasim());
        cv.put("kacinciKat",kayit.getKacinciKat());
        cv.put("odaSayisi",kayit.getOdaSayisi());

        long id = db.insert(kayitTablosu,null,cv);
        return id;
    }
}
