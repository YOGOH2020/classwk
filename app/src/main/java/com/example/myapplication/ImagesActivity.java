package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class ImagesActivity extends AppCompatActivity {

    //Declaring a Variable
    Button BtnScrollPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

        BtnScrollPage = findViewById(R.id.btnNextPage);
        BtnScrollPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(ImagesActivity.this,ScrollViewActivity.class);
                startActivity(next);
            }
        });


    }
}