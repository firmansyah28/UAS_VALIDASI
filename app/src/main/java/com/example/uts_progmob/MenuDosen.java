package com.example.uts_progmob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuDosen extends AppCompatActivity {
    Button btn_datadiri,btn_daftarkrs,btn_lihatkelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_dosen);

        btn_datadiri = (Button) findViewById(R.id.btn_datadiri);
        btn_datadiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Anda Menekan Tombol Data Diri",Toast.LENGTH_SHORT).show();

            }
        });

        btn_daftarkrs = (Button) findViewById(R.id.btn_daftarkrs);
        btn_daftarkrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Anda Menekan Tombol Daftar KRS",Toast.LENGTH_SHORT).show();

            }
        });

        btn_lihatkelas = (Button) findViewById(R.id.btn_lihatkelas);
        btn_lihatkelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Anda Menekan Tombol Lihat Kelas",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
