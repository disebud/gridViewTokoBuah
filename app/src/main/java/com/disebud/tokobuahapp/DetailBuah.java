package com.disebud.tokobuahapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBuah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buah);


        ImageView img = findViewById(R.id.iv_detail);
        TextView tv = findViewById(R.id.namaBuah);

        // mengambil nilai parameter yang diberikan dari activity Main (GridView)
        Integer Image = getIntent().getIntExtra("imgBuah",0);
        String Nama = getIntent().getStringExtra("namaBuah");

        img.setImageResource(Image);
        tv.setText(Nama);

    }

    public void goHome(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }

    public void goWebview(View view) {
        String URL = getIntent().getStringExtra("urlWeb");
        Intent i = new Intent(getApplicationContext(), WebMediaOnline.class);
        i.putExtra("urlWeb", URL);
        startActivity(i);
    }
}