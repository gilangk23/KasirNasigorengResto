package com.example.gilang.kasirsuperresto;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SettingActivity extends AppCompatActivity {

    public final static String prefsHarga = "file.setting.harga";

    EditText telur, ayam, babat, sosis, petai, ruwet, seafood;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        getSupportActionBar().setTitle("SETTING HARGA");

        telur = (EditText) findViewById(R.id.s_nasgor_telur);
        ayam = (EditText) findViewById(R.id.s_nasgor_ayam);
        babat = (EditText) findViewById(R.id.s_nasgor_babat);
        sosis = (EditText) findViewById(R.id.s_nasgor_sosis);
        petai = (EditText) findViewById(R.id.s_nasgor_petai);
        ruwet = (EditText) findViewById(R.id.s_nasgor_ruwet);
        seafood = (EditText) findViewById(R.id.s_nasgor_seafood);

        sharedPreferences = getSharedPreferences(prefsHarga, 0);

        telur.setText(sharedPreferences.getInt("telur", 0) + "");
        ayam.setText(sharedPreferences.getInt("ayam", 0) + "");
        babat.setText(sharedPreferences.getInt("babat", 0) + "");
        sosis.setText(sharedPreferences.getInt("sosis", 0) + "");
        petai.setText(sharedPreferences.getInt("petai", 0) + "");
        ruwet.setText(sharedPreferences.getInt("ruwet", 0) + "");
        seafood.setText(sharedPreferences.getInt("seafood", 0) + "");
    }

    public void simpan(View view) {
        editor = sharedPreferences.edit();
        editor.putInt("telur", Integer.parseInt(telur.getText().toString()));
        editor.putInt("ayam", Integer.parseInt(ayam.getText().toString()));
        editor.putInt("babat", Integer.parseInt(babat.getText().toString()));
        editor.putInt("sosis", Integer.parseInt(sosis.getText().toString()));
        editor.putInt("petai", Integer.parseInt(petai.getText().toString()));
        editor.putInt("ruwet", Integer.parseInt(ruwet.getText().toString()));
        editor.putInt("seafood", Integer.parseInt(seafood.getText().toString()));
        editor.apply();

        Toast.makeText(this, "Data Tersimpan", Toast.LENGTH_LONG).show();
    }
}
