package com.kb.user.kayitbilgi;

import android.content.Intent;
import android.graphics.RadialGradient;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by USER on 14.08.2017.
 */

public class Genelsorular extends AppCompatActivity
{
    Oneriler oneriler;

    public Bundle birdenFazlaVeri=new Bundle();

    public TextView txtdeneme;
    public TextView soru2text;

    public Button btn,btn3,btn4;
    public TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;
    public int say=0,sayy=0,say1=0,say2=0,say3=0,say4=0,say5=0,say6=0,say7=0,say8=0;
    public RadioButton rdb1,rdb2,rdb3,rdb4,rdb5,rdb6,rdb7,rdb8,rdb9,rdb10,rdb11,rdb12,rdb13,rdb14,rdb15,rdb16;
    public RadioGroup radioGroup1,radioGroup2;

    protected void onCreate(Bundle as)
    {
        super.onCreate(as);
        setContentView(R.layout.genelsorular);

        btn=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);

        txt1=(TextView)findViewById(R.id.textView11);
        txt2=(TextView)findViewById(R.id.textView12);
        txt3=(TextView)findViewById(R.id.textView13);
        txt4=(TextView)findViewById(R.id.textView14);
        txt5=(TextView)findViewById(R.id.textView15);
        txt6=(TextView)findViewById(R.id.textView16);
        txt7=(TextView)findViewById(R.id.textView17);
        txt8=(TextView)findViewById(R.id.textView18);

        txtdeneme=(TextView)findViewById(R.id.textView4); // genel sorulardakı verinin bulundugu yer
        soru2text=(TextView)findViewById(R.id.textView10);

        rdb1=(RadioButton)findViewById(R.id.radioButton);
        rdb2=(RadioButton)findViewById(R.id.radioButton2);
        rdb3=(RadioButton)findViewById(R.id.radioButton3);
        rdb4=(RadioButton)findViewById(R.id.radioButton4);
        rdb5=(RadioButton)findViewById(R.id.radioButton5);
        rdb6=(RadioButton)findViewById(R.id.radioButton6);
        rdb7=(RadioButton)findViewById(R.id.radioButton7);
        rdb8=(RadioButton)findViewById(R.id.radioButton8);
        rdb9=(RadioButton)findViewById(R.id.radioButton9);
        rdb10=(RadioButton)findViewById(R.id.radioButton10);
        rdb11=(RadioButton)findViewById(R.id.radioButton11);
        rdb12=(RadioButton)findViewById(R.id.radioButton12);
        rdb13=(RadioButton)findViewById(R.id.radioButton13);
        rdb14=(RadioButton)findViewById(R.id.radioButton14);
        rdb15=(RadioButton)findViewById(R.id.radioButton15);
        rdb16=(RadioButton)findViewById(R.id.radioButton16);

        radioGroup1=(RadioGroup)findViewById(R.id.rg1);
        radioGroup2=(RadioGroup)findViewById(R.id.rg2);

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

           public void onCheckedChanged(RadioGroup radioGroup,  int i) {

                RadioButton rb=(RadioButton)radioGroup.findViewById(i); //RadioGroup'un içindeki RadioButton'ların id'sini alır

               switch (rb.getId())
               {
                   case R.id.radioButton:
                       txtdeneme.setText("1");
                       break;
                   case R.id.radioButton2:
                       txtdeneme.setText("0");
                       break;
               }

           }
       });

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            public void onCheckedChanged(RadioGroup radioGroup,  int i) {

                RadioButton rb=(RadioButton)radioGroup.findViewById(i);

                switch (rb.getId()) // buraya gelen id case1 e eşitse case1 , case'ye eşitse case2 çalışır
                {
                    case R.id.radioButton3:
                        soru2text.setText("1");
                        break;
                    case R.id.radioButton4:
                        soru2text.setText("0");
                        break;
                }

            }
        });

        txt1.setOnClickListener(new View.OnClickListener( )
        {

            public void onClick(View v)
        {
            if (say1 == 0)   // ılk tıklayısınsa
            {
                rdb1.setVisibility(View.VISIBLE);
                rdb2.setVisibility(View.VISIBLE);

                rdb3.setVisibility(View.GONE);
                rdb4.setVisibility(View.GONE);

                rdb5.setVisibility(View.GONE);
                rdb6.setVisibility(View.GONE);

                rdb7.setVisibility(View.GONE);
                rdb8.setVisibility(View.GONE);

                say2=0; //radıo butonları gorunmuyor
                say3=0;
                say4=0;

                say1++;
            } else //ıkıncı tıklayıssa
            {
                rdb1.setVisibility(View.GONE);
                rdb2.setVisibility(View.GONE);
                say1--; // text1 ın butonlarını gorunmez yaptık
            }

        }
});
        txt2.setOnClickListener(new View.OnClickListener( ){




            public void onClick(View v)
            {
                if (say2 == 0)
                {
                    rdb3.setVisibility(View.VISIBLE);
                    rdb4.setVisibility(View.VISIBLE);

                    rdb1.setVisibility(View.GONE);
                    rdb2.setVisibility(View.GONE);

                    rdb5.setVisibility(View.GONE);
                    rdb6.setVisibility(View.GONE);

                    rdb7.setVisibility(View.GONE);
                    rdb8.setVisibility(View.GONE);

                    say1=0;
                    say3=0;
                    say4=0;

                    say2++;
                } else
                {
                    rdb3.setVisibility(View.GONE);
                    rdb4.setVisibility(View.GONE);
                    say2--;
                }
            }
        });
        txt3.setOnClickListener(new View.OnClickListener( ){




            public void onClick(View v)
            {
                if (say3 == 0)
                {
                    rdb5.setVisibility(View.VISIBLE);
                    rdb6.setVisibility(View.VISIBLE);

                    rdb3.setVisibility(View.GONE);
                    rdb4.setVisibility(View.GONE);

                    rdb1.setVisibility(View.GONE);
                    rdb2.setVisibility(View.GONE);

                    rdb7.setVisibility(View.GONE);
                    rdb8.setVisibility(View.GONE);

                    say1=0;
                    say2=0;
                    say4=0;

                    say3++;
                } else
                {
                    rdb5.setVisibility(View.GONE);
                    rdb6.setVisibility(View.GONE);
                    say3--;
                }
            }
        });
        txt4.setOnClickListener(new View.OnClickListener( ){




            public void onClick(View v)   //buton2 nın clıcl ı (genel)
            {
                if (say4 == 0)
                {
                    rdb7.setVisibility(View.VISIBLE);
                    rdb8.setVisibility(View.VISIBLE);

                    rdb1.setVisibility(View.GONE);
                    rdb2.setVisibility(View.GONE);

                    rdb3.setVisibility(View.GONE);
                    rdb4.setVisibility(View.GONE);

                    rdb5.setVisibility(View.GONE);
                    rdb6.setVisibility(View.GONE);

                    say2=0;
                    say3=0;
                    say1=0;

                    say4++;
                } else //texte ıkıncı tıkladıgında
                {
                    rdb7.setVisibility(View.GONE);
                    rdb8.setVisibility(View.GONE);
                    say4--;
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener()    //buton3 un click ı
          {
              public void onClick(View v)
              {

                  if (sayy == 0)  // ilk tıklama

                  {
                      txt5.setVisibility(View.VISIBLE);
                      txt6.setVisibility(View.VISIBLE);
                      txt7.setVisibility(View.VISIBLE);
                      txt8.setVisibility(View.VISIBLE);

                      rdb9.setVisibility(View.GONE);
                      rdb10.setVisibility(View.GONE);

                      rdb11.setVisibility(View.GONE);
                      rdb12.setVisibility(View.GONE);

                      rdb13.setVisibility(View.GONE);
                      rdb14.setVisibility(View.GONE);

                      rdb15.setVisibility(View.GONE);
                      rdb16.setVisibility(View.GONE);

                      say5=0;
                      say6=0;
                      say7=0;
                      say8=0;

                      sayy++;
                  } else  //ıkıncı tıklama

                  {
                      txt5.setVisibility(View.GONE);
                      txt6.setVisibility(View.GONE);
                      txt7.setVisibility(View.GONE);
                      txt8.setVisibility(View.GONE);

                      rdb9.setVisibility(View.GONE);
                      rdb10.setVisibility(View.GONE);

                      rdb11.setVisibility(View.GONE);
                      rdb12.setVisibility(View.GONE);

                      rdb13.setVisibility(View.GONE);
                      rdb14.setVisibility(View.GONE);

                      rdb15.setVisibility(View.GONE);
                      rdb16.setVisibility(View.GONE);

                      say5=0;
                      say6=0;
                      say7=0;
                      say8=0;

                      sayy--;
                  }
              }


          }

        );

        txt5.setOnClickListener(new View.OnClickListener( ){


            public void onClick(View v)
            {
                if (say5 == 0)
                {
                    rdb9.setVisibility(View.VISIBLE);
                    rdb10.setVisibility(View.VISIBLE);

                    rdb11.setVisibility(View.GONE);
                    rdb12.setVisibility(View.GONE);

                    rdb13.setVisibility(View.GONE);
                    rdb14.setVisibility(View.GONE);

                    rdb15.setVisibility(View.GONE);
                    rdb16.setVisibility(View.GONE);

                    say6=0;
                    say7=0;
                    say8=0;

                    say5++;
                } else //texte ıkıncı tıkladıgında
                {
                    rdb9.setVisibility(View.GONE);
                    rdb10.setVisibility(View.GONE);
                    say5--;
                }

            }
        });

        txt6.setOnClickListener(new View.OnClickListener( ){


            public void onClick(View v)
            {
                if (say6 == 0)
                {
                    rdb11.setVisibility(View.VISIBLE);
                    rdb12.setVisibility(View.VISIBLE);

                    rdb9.setVisibility(View.GONE);
                    rdb10.setVisibility(View.GONE);

                    rdb13.setVisibility(View.GONE);
                    rdb14.setVisibility(View.GONE);

                    rdb15.setVisibility(View.GONE);
                    rdb16.setVisibility(View.GONE);

                    say5=0;
                    say7=0;
                    say8=0;

                    say6++;
                } else //texte ıkıncı tıkladıgında
                {
                    rdb11.setVisibility(View.GONE);
                    rdb12.setVisibility(View.GONE);
                    say6--;
                }

            }
        });

        txt7.setOnClickListener(new View.OnClickListener( ){


            public void onClick(View v)
            {
                if (say7 == 0)
                {
                    rdb13.setVisibility(View.VISIBLE);
                    rdb14.setVisibility(View.VISIBLE);

                    rdb11.setVisibility(View.GONE);
                    rdb12.setVisibility(View.GONE);

                    rdb9.setVisibility(View.GONE);
                    rdb10.setVisibility(View.GONE);

                    rdb15.setVisibility(View.GONE);
                    rdb16.setVisibility(View.GONE);

                    say5=0;
                    say6=0;
                    say8=0;

                    say7++;
                } else //texte ıkıncı tıkladıgında
                {
                    rdb13.setVisibility(View.GONE);
                    rdb14.setVisibility(View.GONE);
                    say7--;
                }

            }
        });

        txt8.setOnClickListener(new View.OnClickListener( ){


            public void onClick(View v)
            {
                if (say8 == 0)
                {
                    rdb15.setVisibility(View.VISIBLE);
                    rdb16.setVisibility(View.VISIBLE);

                    rdb11.setVisibility(View.GONE);
                    rdb12.setVisibility(View.GONE);

                    rdb13.setVisibility(View.GONE);
                    rdb14.setVisibility(View.GONE);

                    rdb9.setVisibility(View.GONE);
                    rdb10.setVisibility(View.GONE);

                    say6=0;
                    say7=0;
                    say5=0;

                    say8++;
                } else //texte ıkıncı tıkladıgında
                {
                    rdb15.setVisibility(View.GONE);
                    rdb16.setVisibility(View.GONE);
                    say8--;
                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener()  //öneriler butonu. *Secilen RadioButton'lar ıle Onerıler sayfasındaki baglantı kuruldu asagıda
        {
            public void onClick(View v)
            {

                birdenFazlaVeri.putString("soru1",txtdeneme.getText().toString());
                birdenFazlaVeri.putString("soru2",soru2text.getText().toString());

                Intent bagla=new Intent(Genelsorular.this,Oneriler.class);//Butonun nereden nereye gideceğini belirtik
                bagla.putExtras(birdenFazlaVeri); //genel sorulardan önerıler sayfasına verı gonderme ıslemı. txtdeneme kutucugundakı verıyı alıp veri'nin içine yazıyor ve karşı tarafa yolluyor
                startActivity(bagla); //bagla nesnesını calıstırır
            }
        }
        );
    }

    public void onClickk(View v)
    {

        if (say == 0)  // ilk tıklama

        {
            txt1.setVisibility(View.VISIBLE);
            txt2.setVisibility(View.VISIBLE);
            txt3.setVisibility(View.VISIBLE);
            txt4.setVisibility(View.VISIBLE);

            rdb1.setVisibility(View.GONE);
            rdb2.setVisibility(View.GONE);

            rdb3.setVisibility(View.GONE);
            rdb4.setVisibility(View.GONE);

            rdb5.setVisibility(View.GONE);
            rdb6.setVisibility(View.GONE);

            rdb7.setVisibility(View.GONE);
            rdb8.setVisibility(View.GONE);

            say1=0;
            say2=0;
            say3=0;
            say4=0;

            say++;
        } else  //ıkıncı tıklama

        {
            txt1.setVisibility(View.GONE);
            txt2.setVisibility(View.GONE);
            txt3.setVisibility(View.GONE);
            txt4.setVisibility(View.GONE);

            rdb1.setVisibility(View.GONE);
            rdb2.setVisibility(View.GONE);

            rdb3.setVisibility(View.GONE);
            rdb4.setVisibility(View.GONE);

            rdb5.setVisibility(View.GONE);
            rdb6.setVisibility(View.GONE);

            rdb7.setVisibility(View.GONE);
            rdb8.setVisibility(View.GONE);

            say1=0;
            say2=0;
            say3=0;
            say4=0;

            say--;
        }
    }
}
