package com.example.sampleactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FrameLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_frame_layout);
    }
    public void Penjumlahan(View v) {
        final EditText a = findViewById(R.id.inputNilaiB);
        final EditText b = findViewById(R.id.inputNilaib);
        final TextView result = findViewById(R.id.hasil);

        int dataResult = Integer.parseInt(a.getText().toString()) + Integer.parseInt(b.getText().toString());
        result.setText("Hasil: " + dataResult);
    }

    public void Pengurangan(View v) {
        final EditText a = findViewById(R.id.inputNilaiB);
        final EditText b = findViewById(R.id.inputNilaib);
        final TextView result = findViewById(R.id.hasil);

        int dataResult = Integer.parseInt(a.getText().toString()) - Integer.parseInt(b.getText().toString());
        result.setText("Hasil: " + dataResult);
    }

    public void Perkalian(View v) {
        final EditText a = findViewById(R.id.inputNilaiB);
        final EditText b = findViewById(R.id.inputNilaib);
        final TextView result = findViewById(R.id.hasil);

        int dataResult = Integer.parseInt(a.getText().toString()) * Integer.parseInt(b.getText().toString());
        result.setText("Hasil: " + dataResult);
    }

    public void Pembagian(View v) {
        final EditText a = findViewById(R.id.inputNilaiB);
        final EditText b = findViewById(R.id.inputNilaib);
        final TextView result = findViewById(R.id.hasil);

        int dataResult = Integer.parseInt(a.getText().toString()) / Integer.parseInt(b.getText().toString());
        result.setText("Hasil: " + dataResult);
    }

    public void Mod(View v) {
        final EditText a = findViewById(R.id.inputNilaiB);
        final EditText b = findViewById(R.id.inputNilaib);
        final TextView result = findViewById(R.id.hasil);

        int dataResult = Integer.parseInt(a.getText().toString()) % Integer.parseInt(b.getText().toString());
        result.setText("Hasil: " + dataResult);
    }

    public void Pangkat(View v) {
        final EditText a = findViewById(R.id.inputNilaiB);
        final EditText b = findViewById(R.id.inputNilaib);
        final TextView result = findViewById(R.id.hasil);

        int dataResult = (int) Math.pow(Double.parseDouble(a.getText().toString()), Double.parseDouble(b.getText().toString()));
        result.setText("Hasil: " + dataResult);
    }
}