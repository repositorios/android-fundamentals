package br.com.thread;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    public TextView titulo;

    private Handler mainHandler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titulo = findViewById(R.id.title);


    }


    public void tarefaMesmaThread(View view) {
        tarefaLenta(1000);
    }

    public void tarefaNovaThread(View view) {

        ExampleThread obj = new ExampleThread(1000);
        obj.start();

    }

    public void tarefaLenta(int tempo) {


        for (int i = 0; i < 10; i++) {
            if (i == 5) {

                mainHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        titulo.setText("50% completos");
                    }
                });
            }

            Log.i(TAG, "tarefaLenta: " + i);
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}


