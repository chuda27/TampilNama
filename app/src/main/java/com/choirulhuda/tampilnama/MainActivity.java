package com.choirulhuda.tampilnama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtInputNama;
    private TextView tvTampilNama;
    private Button btnTampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtInputNama = findViewById(R.id.edt_name);
        tvTampilNama = findViewById(R.id.tv_name);
        btnTampil = findViewById(R.id.btn_show);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Aplikasi mulai ditampilkan (onStart)", Toast.LENGTH_SHORT).show();
        Log.d(this.getApplicationInfo().name, "onStart");
        tvTampilNama.setText("Nama Saya Huda");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Aplikasi posisi onResume (onResume)", Toast.LENGTH_SHORT).show();
        Log.d(this.getApplicationInfo().name, "onResume");
    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "Aplikasi ditutup (onStop)", Toast.LENGTH_SHORT).show();
        Log.d(this.getApplicationInfo().name, "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        //masukkan perintah
        Toast.makeText(this, "Aplikasi dimatikan (onDestroy)", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    
    public void actionShow(View view) {
        String nama = edtInputNama.getText().toString();
        if (nama != "") {
            tvTampilNama.setText("Nama saya: "+nama);
        } else {
            Toast.makeText(this, "Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show();
        }

    }
}