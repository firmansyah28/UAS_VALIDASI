package com.example.uts_progmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public void GoToDialog(View view){
            Intent intent  = new Intent(MainActivity.this,DialogKRSActivity.class);
        }
    }
}
