package com.example.sonsanszar;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    MediaPlayer plyZarSesi;
    ImageView imgZar1,imgZar2;
    Button    btnZarAt;
    Random rndZarSayi1=new Random();
    Random rndZarSayi2=new Random();
    int randSayi1,randSayi2;
    int[] listViewImage=new int[]
            {R.drawable.z1,R.drawable.z2,
                    R.drawable.z3,R.drawable.z4,
                    R.drawable.z5,R.drawable.z6};
    Thread t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idAta();



        imgZar1.setImageResource(R.drawable.z1);
        imgZar2.setImageResource(R.drawable.z6);




        btnZarAt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                plyZarSesi=MediaPlayer.create(MainActivity.this,R.raw.zarrses);
                Thread t = new Thread() {
                    @Override
                    public void run() {
                        try {plyZarSesi.start();
                            for(int l=0;l<15;l++)
                            {
                                Thread.sleep(100);
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {/**/
                                        randSayi1=rndZarSayi1.nextInt(6);
                                        randSayi2=rndZarSayi2.nextInt(6);
                                        imgZar1.setImageResource(listViewImage[randSayi1]);
                                        imgZar2.setImageResource(listViewImage[randSayi2]);
                                    }
                                });

                            }plyZarSesi.stop();
                        } catch (InterruptedException e) {
                        }
                    }
                };
                t.start();



            }
        });
    }


    public void idAta()
    {
        imgZar1=(ImageView)findViewById(R.id.birinciZarId);
        imgZar2=(ImageView)findViewById(R.id.ikinciZarId);

        btnZarAt=(Button)findViewById(R.id.ZarAtId);
    }
}
