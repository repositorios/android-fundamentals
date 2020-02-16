package br.com.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openIntentOne(View view) {
        Intent in = new Intent("ABRIR_INTENT_1");
        in.addCategory(Intent.CATEGORY_DEFAULT);

        startActivity(in);
       // finish();

    }

    public void openIntentTwo(View view) {
        Intent in = new Intent("ABRIR_INTENT_2");
        in.addCategory(Intent.CATEGORY_DEFAULT);

        startActivity(in);
        //finish();
    }

    public void openYoutube(View view) {

        Uri uri = Uri.parse("https://www.youtube.com");

        Intent in = new Intent(Intent.ACTION_VIEW);
        in.setData(uri);


        startActivity(in);
        //finish();
    }
}
