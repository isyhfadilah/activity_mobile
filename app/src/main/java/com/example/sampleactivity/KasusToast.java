package com.example.sampleactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class KasusToast extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kasus_toast);
    }

    public void tampilkanToast(View v) {
        final EditText input = findViewById(R.id.inputNilaiB);
        String dataInput = input.getText().toString();

        Toast.makeText(this, dataInput, Toast.LENGTH_SHORT).show();
    }
}