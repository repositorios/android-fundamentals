package org.pacote.android.apps.settings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void abrirConfiguracoes(View view){
        Intent in = new Intent(this,SettingsActivity.class);
        startActivity(in);
    }

    public void lerConfiguracoes(View view){
        SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(this /* Activity context */);
        String name = sharedPreferences.getString("signature", "");
        String reply = sharedPreferences.getString("reply", "");
        boolean sync = sharedPreferences.getBoolean("sync", false);
        boolean attachment = sharedPreferences.getBoolean("attachment", false);

    }
}
