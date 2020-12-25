package com.disebud.tokobuahapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    GridView listBuah; // mendeklarasikan variabel listBuah untuk komponen GridView

    // menyiapkan data-data buah ke dalam variabel array daftarBuah
    String[] daftarBuah = {
            "JERUK","APEL","DURIAN","SALAK","ANGGUR","MANGGA","RAMBUTAN",
            "KELAPA","NANGKA","PEAR"
    };

    Integer[] gmbrBuah = {
            R.drawable.jeruk,R.drawable.apel,R.drawable.durian,R.drawable.salak,R.drawable.anggur,R.drawable.mangga,R.drawable.rambutan,
            R.drawable.kelapa,R.drawable.nangka,R.drawable.pear
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mendefinisikan variabel listBuah ke komponen GridView pada desain dengan menggunakan atribut id gridListBuah
        listBuah = findViewById(R.id.gridListBuah);

        // menampung data-data yang terdapat pada variabel array daftarBuah ke fungsi ArrayAdapter
        ArrayAdapter<String> daftarBuahAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, daftarBuah);

        // mengaktifkan tampungan data array di daftarBuahAdapter ke GridView pada desain
        listBuah.setAdapter(daftarBuahAdapter);

        // menambahkan event untuk menampilkan alert ketika salah satu daftar buah  pada GridView di klik
        listBuah.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            // fungsi untuk menampilkan alert ketika salah satu nama portal media online di klik
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(getApplicationContext(), "Buah :  " + ((TextView) v).getText() + " di pilih. ", Toast.LENGTH_LONG).show();

                pilihListBuah(position);
            }
        });

    }

    // fungsi untuk memberikan nilai untuk data daftar buah di GridView
    private void pilihListBuah(int posisi){
        String urlweb = ""; // variabel untuk menampung nilai alamat web
        Integer imgBuah = null; // variabel untuk menampung nilai
        String namaBuah = ""; // variabel untuk menampung nilai

        // posisi merupakan nilai array data dari variable daftarBuah, dimulai dari 0 dari kiri
        // ke kanan pada layar mobile
        switch(posisi){
            case 0: // untuk data buah di GridView
                imgBuah = gmbrBuah[0];
                namaBuah = daftarBuah[0];
                urlweb = "https://carisayur.com/product?page=1&limit=20&category=dwxev678j5 /";
                break;

            case 1: // untuk data buah di GridView
                imgBuah = gmbrBuah[1];
                namaBuah = daftarBuah[1];
                urlweb = "https://carisayur.com/product?page=1&limit=20&category=dwxev678j5 /";
                break;

            case 2: // untuk data buah di GridView
                imgBuah = gmbrBuah[2];
                namaBuah = daftarBuah[2];
                urlweb = "https://carisayur.com/product?page=1&limit=20&category=dwxev678j5 /";
                break;

            case 3: // untuk data buah di GridView
                imgBuah = gmbrBuah[3];
                namaBuah = daftarBuah[3];
                urlweb = "https://carisayur.com/product?page=1&limit=20&category=dwxev678j5 /";
                break;

            case 4: // untuk data buah di GridView
                imgBuah = gmbrBuah[4];
                namaBuah = daftarBuah[4];
                urlweb = "https://carisayur.com/product?page=1&limit=20&category=dwxev678j5 /";
                break;

            case 5: // untuk data buah di GridView
                imgBuah = gmbrBuah[5];
                namaBuah = daftarBuah[5];
                urlweb = "https://carisayur.com/product?page=1&limit=20&category=dwxev678j5 /";
                break;

            case 6: // untuk data buah di GridView
                imgBuah = gmbrBuah[6];
                namaBuah = daftarBuah[6];
                urlweb = "https://carisayur.com/product?page=1&limit=20&category=dwxev678j5 /";
                break;

            case 7: // untuk data buah di GridView
                imgBuah = gmbrBuah[7];
                namaBuah = daftarBuah[7];
                urlweb = "https://carisayur.com/product?page=1&limit=20&category=dwxev678j5 /";
                break;

            case 8: // untuk data buah di GridView
                imgBuah = gmbrBuah[8];
                namaBuah = daftarBuah[8];
                urlweb = "https://carisayur.com/product?page=1&limit=20&category=dwxev678j5 /";
                break;

            case 9: // untuk data buah di GridView
                imgBuah = gmbrBuah[9];
                namaBuah = daftarBuah[9];
                urlweb = "https://carisayur.com/product?page=1&limit=20&category=dwxev678j5 /";
                break;

            case 10: // untuk data buah di GridView
                imgBuah = gmbrBuah[10];
                namaBuah = daftarBuah[10];
                urlweb = "https://carisayur.com/product?page=1&limit=20&category=dwxev678j5 /";
                break;
            // ------ seterusnya hingga posisi terakhir data di grid view

            default: // jika data buah tidak di set nilai maka, akan otomatis ke bagian default
                imgBuah = null;
                namaBuah = null;
                urlweb = "https://www.google.com/";
                break;
        }

        Intent i = new Intent(getApplicationContext(), DetailBuah.class);
        i.putExtra("urlWeb", urlweb);
        i.putExtra("imgBuah", imgBuah);
        i.putExtra("namaBuah", namaBuah);
        startActivity(i);


    }

    public void close(View view) {
        finish();
//        onBackPressed();
    }
}