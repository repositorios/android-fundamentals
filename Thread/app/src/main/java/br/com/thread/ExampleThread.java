package br.com.thread;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;

public class ExampleThread extends Thread {

    private static final String TAG = "ExampleThread";
    private int tempo = 1;


    public ExampleThread(int tempo) {
        this.tempo = tempo;
    }

    @Override
    public void run() {
        tarefaLenta(this.tempo);
    }


    public void tarefaLenta(int tempo) {

        for (int i = 0; i < 10; i++) {


            if (i == 5) {
                Handler localHandler = new Handler(Looper.getMainLooper());

                localHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        // titulo.setText("50% completos");
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
