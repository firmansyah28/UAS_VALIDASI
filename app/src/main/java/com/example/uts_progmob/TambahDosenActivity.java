package com.example.uts_progmob;

import androidx.annotation.NonNull;
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

public class TambahDosenActivity extends AppCompatActivity {
    private EditText txtnama, txtnidn, txtalamat, txtgelar, txtemail, txtfoto;
    private ImageView imageViewdosen;
    private ProgressDialog progressDialog;
    private static final int GALERI_REQUEST_CODE = 58;
    private static final int FILE_ACCESS_REQUEST_CODE = 58;
    private String stringImg = "";
    private Boolean isUpdate = false;
    private String idDosen = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_dosen);


        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.READ_EXTERNAL_STORAGE) != PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.READ_EXTERNAL_STORAGE
            }, FILE_ACCESS_REQUEST_CODE);
        }

        txtnama = findViewById(R.id.editTextnama);
        txtalamat = findViewById(R.id.editTextalamat);
        txtemail = findViewById(R.id.editTextemail);
        txtgelar = findViewById(R.id.editTextgelar);
        txtnidn = findViewById(R.id.editTextnidn);
        imageViewdosen = findViewById(R.id.imageViewdosen);
        txtfoto = findViewById(R.id.editTextfoto);

        if(txtnidn.getText().toString().length()== 0){
            txtnidn.setError("harap isi nidn anda");
        }
        if (txtnama.getText().toString().length()== 0){
            txtnama.setError("harap isi nama anda");
        }
        if(txtalamat.getText().toString().length()== 0){
            txtalamat.setError("harap isi alamat anda");
        }
        if (txtgelar.getText().toString().length() == 0){
            txtgelar.setError("harap isi gelar anda");
        }
        if (txtemail.getText().toString().length() == 0){
            txtemail.setError("harap isi email anda");
        }
        if (txtfoto.getText().toString().length() == 0){
            txtfoto.setError("isi kan foto anda");
        }
        else {
            Toast.makeText(TambahDosenActivity.this,"data berhasil dditambahkan",Toast.LENGTH_SHORT).show();
        }

        final Button btnUpload = findViewById(R.id.btnUpload);
        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                String[] mimeTypes = ("image/jpeg");
                intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes);
                startActivityForResult(intent, GALERI_REQUEST_CODE);
            }

            ;


            @Override
            public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
                switch (requestCode) {
                    case FILE_ACCESS_REQUEST_CODE:
                        if (grantResults.length > 0 && grantResults[0] == PERMISSION_GRANTED) {
                            //permissiion granted
                        }
                        break;
                }
            }
        });
    }
}
