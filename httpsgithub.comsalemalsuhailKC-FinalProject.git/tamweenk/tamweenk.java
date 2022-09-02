package com.tamweenk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class tamweenk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.idtamweenk);


        EditText editText = findViewById(R.id.editTextTextPersonName);
        TextView textView = findViewById(R.id.textView);
        EditText editText1 = findViewById(R.id.editTextTextPersonName2);
        Button Next = findViewById(R.id.button);
        ImageView imageView = findViewById(R.id.imageView);



        Intent intent = new Intent(tamweenk.this,Hellotamweenk.class);
        startActivity(intent);
    }
}