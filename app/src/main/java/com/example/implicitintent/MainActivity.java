package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void open(View v){
        textURL=findViewById(R.id.editTextTextPersonName);
        String URL1 = textURL.getText().toString();
        Toast.makeText(this, URL1, Toast.LENGTH_SHORT).show();
        //Intent in = new Intent(this,MainActivity2.class);
        //startActivity(in);
        //code for open url

        //Uri is a class and webpageE is a object which open url(URL1)
        Uri webpageE = Uri.parse(URL1);
        //create intent
        //here, action is ACTION_VIEW which used to open web browser
        Intent intent = new Intent(Intent.ACTION_VIEW, webpageE);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }
}