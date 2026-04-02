package com.example.sampleactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class KasusSatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kasus_satu);
    }

    public void ubahText(View v) {
        final TextView txtHello = findViewById(R.id.txtHello);
        txtHello.setText("Halo Dunia!");
    }

    public void tampilkanText(View v) {
        final EditText editText = findViewById(R.id.inputNilaiB);
        final TextView result = findViewById(R.id.result);
        result.setText(editText.getText().toString());
    }
}