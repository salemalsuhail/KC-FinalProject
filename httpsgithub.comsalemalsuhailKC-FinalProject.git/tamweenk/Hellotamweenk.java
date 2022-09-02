package com.tamweenk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Hellotamweenk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellotamweenk);

        TextView textView = findViewById(R.id.textView2);
        EditText editText = findViewById(R.id.editTextTextPersonName4);
        int imageView = (R.id.imageView3);
        EditText editText1 = findViewById(R.id.editTextTextPersonName5);
        Button Next = findViewById(R.id.button2);


        Intent intent = new Intent(Hellotamweenk.this,paytamweenl.class);
        startActivity(intent);
    }
}