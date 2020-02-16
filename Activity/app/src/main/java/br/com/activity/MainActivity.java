package br.com.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void secondActivity(View view) {
        Intent in = new Intent(this, SecondActivity.class);
        startActivity(in);
    }

    public void dataActivity(View view) {
        Intent in = new Intent(this, DataActivity.class);
        in.putExtra("TEXTO", "Renato");
        startActivity(in);

    }

    public void BundleDataActivity(View view) {

        Bundle bundle = new Bundle();
        bundle.putString("NOME", "Renato");
        bundle.putString("SOBRENOME", "TAVARES");
        bundle.putInt("IDADE", 32);


        Intent in = new Intent(this, BundleActivity.class);
        in.putExtras(bundle);
        startActivity(in);

    }


}
