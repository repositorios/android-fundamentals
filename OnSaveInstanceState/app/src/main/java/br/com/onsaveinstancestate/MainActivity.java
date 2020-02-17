package br.com.onsaveinstancestate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public static String TXT_KEY = "CHAVE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    // quando aletarar as configurações (girar tela) seta esse texto
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        TextView txtRecuperado = findViewById(R.id.txtRecuperado);
        txtRecuperado.setText(savedInstanceState.getString(TXT_KEY));
    }


    // salva algum dados no Bundle para sobreviver ao ciclo de vida
    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString(TXT_KEY, "Valor que quiser salvar " + Math.random());
        super.onSaveInstanceState(outState);

    }

}
