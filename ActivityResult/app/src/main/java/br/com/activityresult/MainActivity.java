package br.com.activityresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String TAG = MainActivity.class.getSimpleName();
    private static int COD_TELA = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openSecondActivity(View view){

        TextView nome = findViewById(R.id.txtNome);
        TextView sobrenome = findViewById(R.id.txtSobrenome);


        Bundle bundle = new Bundle();
        bundle.putString("NOME", nome.getText().toString());
        bundle.putString("SOBRENOME", sobrenome.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtras(bundle);

        startActivityForResult(intent, COD_TELA);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Toast.makeText(this, "Cod: "+ requestCode, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "Result cod: "+ resultCode, Toast.LENGTH_LONG).show();
        Toast.makeText(this, "DATA: "+ data.getExtras().getString("RESPOSTA"), Toast.LENGTH_LONG).show();


    }
}
