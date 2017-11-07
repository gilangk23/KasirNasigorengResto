package com.example.gilang.kasirsuperresto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText telur, ayam, babat, sosis, petai, ruwet, seafood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("PESAN NASI GORENG");

        telur = (EditText) findViewById(R.id.nasgor_telur);
        ayam = (EditText) findViewById(R.id.nasgor_ayam);
        babat = (EditText) findViewById(R.id.nasgor_babat);
        sosis = (EditText) findViewById(R.id.nasgor_sosis);
        petai = (EditText) findViewById(R.id.nasgor_petai);
        ruwet = (EditText) findViewById(R.id.nasgor_ruwet);
        seafood = (EditText) findViewById(R.id.nasgor_seafood);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.setting_harga, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.setting) {
            startActivity(new Intent(this, SettingActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void hitung(View view) {
        Intent intent = new Intent(this, StrukActivity.class);
        intent.putExtra("telur", Integer.parseInt(telur.getText().toString()));
        intent.putExtra("ayam", Integer.parseInt(telur.getText().toString()));
        intent.putExtra("babat", Integer.parseInt(telur.getText().toString()));
        intent.putExtra("sosis", Integer.parseInt(telur.getText().toString()));
        intent.putExtra("petai", Integer.parseInt(telur.getText().toString()));
        intent.putExtra("ruwet", Integer.parseInt(telur.getText().toString()));
        intent.putExtra("seafood", Integer.parseInt(telur.getText().toString()));
        startActivity(intent);
    }
}
