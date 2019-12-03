package com.example.uts_progmob;

import androidx.appcompat.app.AppCompatActivity;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;


public class DataDosenAPI extends AppCompatActivity {

    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_dosen_api);

        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Melakukan sesuatu");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        private Handler handler = new Handler(){
            public void handleMessage(android.os.Message msg){
                progressDialog.dismiss();
            }
        };

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);
                    handler.sendEmptyExceptionMessage(0);
                }catch (InterruptedException e){
                    //TODO  Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

    }
}
