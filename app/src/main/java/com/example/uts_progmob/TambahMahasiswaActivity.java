package com.example.uts_progmob;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import static android.content.pm.PackageManager.PERMISSION_GRANTED;

public class TambahMahasiswaActivity extends AppCompatActivity {
    private EditText txtNama,txtnim,txtfoto,txtalamat,txtemail;
    private ImageView imageViewmhs;
    private ProgressDialog progressDialog;
    private static final int GALERI_REQUEST_CODE = 58;
    private static final int FILE_ACCESS_REQUEST_CODE = 58;
    private String stringImg = "";
    private Boolean isUpdate = false;
    private String idmhs = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_mahasiswa);

        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.READ_EXTERNAL_STORAGE) != PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.READ_EXTERNAL_STORAGE
            }, FILE_ACCESS_REQUEST_CODE);
        }

        txtNama = findViewById(R.id.editTextnama);
        txtalamat = findViewById(R.id.editTextalamat);
        txtemail = findViewById(R.id.editTextemail);
        txtnim = findViewById(R.id.editTextnidn);
        imageViewmhs = findViewById(R.id.imageViewmhs);
        txtfoto = findViewById(R.id.editTextfoto);

        if(txtnim.getText().toString().length()== 0){
            txtnim.setError("harap isi nim anda");
        }
        if (txtNama.getText().toString().length()== 0){
            txtNama.setError("harap isi nama anda");
        }
        if(txtalamat.getText().toString().length()== 0){
            txtalamat.setError("harap isi alamat anda");
        }

        if (txtemail.getText().toString().length() == 0){
            txtemail.setError("harap isi email anda");
        }
        if (txtfoto.getText().toString().length() == 0){
            txtfoto.setError("isi kan foto anda");
        }
        else {
            Toast.makeText(TambahMahasiswaActivity.this,"data berhasil dditambahkan",Toast.LENGTH_SHORT).show();
        }



    }

}
