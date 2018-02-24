package com.oji.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Details extends AppCompatActivity {
    ImageView isiBotol;
    TextView liter;
    int level = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent i = getIntent();
        int gambar = i.getExtras().getInt("gambar");     // get attribute yang di oper dari activity sebelumnya
        String nama = i.getStringExtra("nama");
        String harga = i.getStringExtra("harga");
        String komposisis = i.getStringExtra("komposisi");
        ImageView gambarDetail = (ImageView) findViewById(R.id.detailGambar);
        TextView namaMenu = (TextView) findViewById(R.id.detailNama);
        //TextView hargaMenu = (TextView) findViewById(R.id.hargaMenu);
        TextView komposisi = (TextView) findViewById(R.id.detailDeskripsi);


        gambarDetail.setImageResource(gambar);
        namaMenu.setText(nama);                             // set attribute ke textView
        //hargaMenu.setText(harga);
        komposisi.setText(komposisis);



        isiBotol = (ImageView) findViewById(R.id.isiBotol);
        liter = (TextView) findViewById(R.id.liter);
        liter();
    }

    public void liter(){
        switch (level){
            case 0:liter.setText("1L");break;
            case 1:liter.setText("2L");break;
            case 2:liter.setText("3L");break;
            case 3:liter.setText("4L");break;
            case 4:liter.setText("5L");break;
            case 5:liter.setText("Full");break;

        }

    }
    public void plus(View view) {
        if (level < 5) {
            level++;
            isiBotol.setImageLevel(level);
        } else {
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Sudah Penuh, tidak bisa diisi", Toast.LENGTH_SHORT);
            toast.show();
        }
        liter();
    }

    public void minus(View view) {
        if (level > 0) {
            level--;
            isiBotol.setImageLevel(level);
        } else  {
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Batas minimum pengisian!!", Toast.LENGTH_SHORT);
            toast.show();
        }
        liter();
    }
}
