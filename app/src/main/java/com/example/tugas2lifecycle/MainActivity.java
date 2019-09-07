package com.example.tugas2lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Button btnKlik;
    TextView tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.etNama);
        btnKlik = (Button) findViewById(R.id.btnKlik);
        tvNama = (TextView) findViewById(R.id.tvNama);

    }

    public void hsndleSubmit(View view) {
        String nama = etNama.getText().toString();
        tvNama.setText("Hello " +nama);

    }
}
