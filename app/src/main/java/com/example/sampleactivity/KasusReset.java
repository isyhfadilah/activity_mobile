package com.example.sampleactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class KasusReset extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kasus_reset);
    }

    public void ubahText(View v) {
        final TextView txtHello = findViewById(R.id.txtHello);
        txtHello.setText("Halo Dunia!");
    }

    public void resetText(View v) {
        final EditText resetText = findViewById(R.id.inputNilaiB);
        resetText.setText("");
    }
}