package com.kb.user.kayitbilgi;
public class Kayit
{
    private String ad;
    private String soyad;
    private String yas;
    private String konum;
    private String telefon;
    private String ulasim;
    private String kacinciKat;
    private String odaSayisi;
    private String tc;

    public Kayit(String ad, String soyad, String yas, String konum, String telefon, String ulasim, String kacinciKat, String odaSayisi, String tc) {

        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.konum = konum;
        this.telefon = telefon;
        this.ulasim = ulasim;
        this.kacinciKat = kacinciKat;
        this.odaSayisi = odaSayisi;
        this.tc = tc;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public String getYas() {
        return yas;
    }
    public void setYas(String yas) {
        this.yas = yas;
    }
    public String getKonum() {
        return konum;
    }
    public void setKonum(String konum) {
        this.konum = konum;
    }
    public String getTelefon() {
        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public String getUlasim() {
        return ulasim;
    }
    public void setUlasim(String ulasim) {
        this.ulasim = ulasim;
    }
    public String getKacinciKat() {
        return kacinciKat;
    }
    public void setKacinciKat(String kacinciKat) {
        this.kacinciKat = kacinciKat;
    }
    public String getOdaSayisi() {
        return odaSayisi;
    }
    public void setOdaSayisi(String odaSayisi) {
        this.odaSayisi = odaSayisi;
    }
    public String getTc() {
        return tc;
    }
    public void setTc(String tc) {
        this.tc = tc;
    }
}
