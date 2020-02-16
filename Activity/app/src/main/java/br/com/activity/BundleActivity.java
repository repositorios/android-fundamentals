package br.com.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BundleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);

        TextView txtNome = findViewById(R.id.txtNome);
        TextView txtSobrenome = findViewById(R.id.txtSobrenome);
        TextView txtIdade = findViewById(R.id.txtIdade);

        Intent in = getIntent();
         Bundle bundle = in.getExtras();

        txtNome.setText(bundle.getString("NOME"));
        txtSobrenome.setText(bundle.getString("SOBRENOME"));
        txtIdade.setText( String.valueOf(bundle.getInt("IDADE")) );

    }
}

