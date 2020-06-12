package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;
import java.text.Format;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonkmtomile = (Button) findViewById(R.id.button1kmtomile);
        buttonkmtomile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText milestextBox = (EditText) findViewById(R.id.editTextval1);
                EditText kilometertextsBox = (EditText) findViewById(R.id.editTextval2);
                double valmiles = Double.valueOf(milestextBox.getText().toString());
                double valkms = valmiles / 0.62137;
                DecimalFormat declimit = new DecimalFormat("##.##");
                kilometertextsBox.setText(declimit.format(valkms));

            }
        });

        Button buttonmiletokm = (Button) findViewById(R.id.button2milestokm);
        buttonmiletokm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText milestextBox = (EditText) findViewById(R.id.editTextval1);
                EditText kilometertextsBox = (EditText) findViewById(R.id.editTextval2);
                double valkms = Double.valueOf(kilometertextsBox.getText().toString());
                double valmiles = valkms * 0.62137;
                DecimalFormat declimit = new DecimalFormat("##.##");
                milestextBox.setText(declimit.format(valmiles));

            }
        });

    }
}

