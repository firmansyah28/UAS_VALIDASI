package com.example.uts_progmob;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class DialogKRSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_krs);

        Button ubahButton = (Button)findViewById(R.id.btnUbah);
        ubahButton.setOnClickListener((view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DialogKRSActivity.this);

        builder.setMessage("Apakah anda yakin untuk ubah nilai krs?")
                .setNegativeButton("No", new DialogKRSActivity.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(DialogKRSActivity.this, "Tidak jadi ubah",
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("Yes", (dialogInterface, i) {
            Toast.makeText(DialogKRSActivity.this, "Ubah krs !!",
                    Toast.LENGTH_SHORT).show();


            };
    }




