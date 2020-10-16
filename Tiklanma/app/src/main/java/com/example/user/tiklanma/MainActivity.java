package com.example.user.tiklanma;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView sayac;
    Button tikla,tikla2;
    Uri imageUri;
    public int say=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sayac=findViewById(R.id.tikla);
        sayac.setText("0");

        tikla=findViewById(R.id.button);
        tikla2=findViewById(R.id.button2);



        tikla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kamera_int=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);




                startActivityForResult(kamera_int,44);
            }
        });

        tikla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent galery_int=new Intent(Intent.ACTION_GET_CONTENT);
                galery_int.setType("image/*");
               // galery_int.setAction(Intent.ACTION_GET_CONTENT);
               // galery_int.addCategory(Intent.CATEGORY_OPENABLE);

                startActivityForResult(galery_int,45);

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode==44)
        {

            Bitmap image=(Bitmap)data.getExtras().get("data");
            ImageView resim=(ImageView)findViewById(R.id.imageView);

            resim.setImageBitmap(image);


        }
        if(requestCode==45 && resultCode==RESULT_OK)
        {

            ImageView resim2=(ImageView)findViewById(R.id.imageView2);
            imageUri=data.getData();
            resim2.setImageURI(imageUri);
        }


        //super.onActivityResult(requestCode, resultCode, data);
    }
}
