package com.example.pierwszy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mojtekst;
    Button przycisk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mojtekst=findViewById(R.id.tekst);
        przycisk=findViewById(R.id.but);

        przycisk.setOnClickListener(e -> {
            mojtekst.setText("Goodbye world!");

        });
    }
}