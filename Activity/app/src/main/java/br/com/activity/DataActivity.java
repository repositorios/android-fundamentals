package br.com.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        TextView txtData = findViewById(R.id.dataText);

        txtData.setText(getIntent().getExtras().getString("TEXTO"));
    }
}
