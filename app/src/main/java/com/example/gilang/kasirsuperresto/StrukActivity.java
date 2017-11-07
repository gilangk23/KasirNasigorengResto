package com.example.gilang.kasirsuperresto;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StrukActivity extends AppCompatActivity {

    TextView telur, ayam, babat, sosis, petai, ruwet, seafood, total;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struk);

        getSupportActionBar().setTitle("TOTAL PEMBAYARAN");

        telur = (TextView) findViewById(R.id.t_nasgor_telur);
        ayam = (TextView) findViewById(R.id.t_nasgor_ayam);
        babat = (TextView) findViewById(R.id.t_nasgor_babat);
        sosis = (TextView) findViewById(R.id.t_nasgor_sosis);
        petai = (TextView) findViewById(R.id.t_nasgor_petai);
        ruwet = (TextView) findViewById(R.id.t_nasgor_ruwet);
        seafood = (TextView) findViewById(R.id.t_nasgor_seafood);
        total = (TextView) findViewById(R.id.total);

        sharedPreferences = getSharedPreferences(SettingActivity.prefsHarga, 0);
        Intent intent = getIntent();

        int harga_telur, harga_ayam, harga_babat, harga_sosis, harga_petai, harga_ruwet, harga_seafood, total_bayar;
        harga_telur = sharedPreferences.getInt("telur", 0) * intent.getIntExtra("telur", 0);
        harga_ayam = sharedPreferences.getInt("ayam", 0) * intent.getIntExtra("ayam", 0);
        harga_babat = sharedPreferences.getInt("babat", 0) * intent.getIntExtra("babat", 0);
        harga_sosis = sharedPreferences.getInt("sosis", 0) * intent.getIntExtra("sosis", 0);
        harga_petai = sharedPreferences.getInt("petai", 0) * intent.getIntExtra("petai", 0);
        harga_ruwet = sharedPreferences.getInt("ruwet", 0) * intent.getIntExtra("ruwet", 0);
        harga_seafood = sharedPreferences.getInt("seafood", 0) * intent.getIntExtra("seafood", 0);

        telur.setText(harga_telur + "");
        ayam.setText(harga_ayam + "");
        babat.setText(harga_babat + "");
        sosis.setText(harga_sosis + "");
        petai.setText(harga_petai + "");
        ruwet.setText(harga_ruwet + "");
        seafood.setText(harga_seafood + "");

        total_bayar = harga_ayam + harga_telur + harga_babat + harga_sosis + harga_petai + harga_ruwet + harga_seafood;

        total.setText(total_bayar + "");
    }
}
