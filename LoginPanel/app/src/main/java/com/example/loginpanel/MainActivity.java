package com.example.loginpanel;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText haslo;
    Button przycisk;
    TextView tekst;
    TextView tekst2;
    EditText login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        haslo=findViewById(R.id.editTextTextPassword);
        haslo.getText();                        //pobieranie tekstu z haslo?
        tekst=findViewById(R.id.textView4);     //ustawienie zmiennej tekst na textView4?
        login=findViewById(R.id.editTextText);
        login.getText();                        //pobieranie tekstu z login?
        tekst2=findViewById(R.id.textView7); //ustawienie zmiennej tekst na textView7?
        przycisk=findViewById(R.id.button);

        przycisk.setOnClickListener(e -> {

            tekst.setText(haslo.getText()); //ustawienie tekstu w textView4?
            tekst2.setText(login.getText());    //ustawienie tekstu w textView7?
        });
    }
}