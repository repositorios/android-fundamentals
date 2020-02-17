package br.com.activityresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Bundle bundle = getIntent().getExtras();

        String nome = bundle.getString("NOME");
        String sobrenome = bundle.getString("SOBRENOME");


        Toast.makeText(this, nome + " - " + sobrenome,Toast.LENGTH_LONG).show();


    }


    public void sendResponse(View view){

        TextView txtResposta = findViewById(R.id.txtResposta);

        Intent intent = new Intent();
        intent.putExtra("RESPOSTA", txtResposta.getText().toString());

        setResult(1, intent);
        finish();
    }
}

