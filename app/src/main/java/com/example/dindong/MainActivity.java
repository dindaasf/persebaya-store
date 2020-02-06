package com.example.dindong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonwani(View view) {
        Toast wani = Toast.makeText(this,"WANI!", Toast.LENGTH_SHORT);
        wani.show();

    }
}
