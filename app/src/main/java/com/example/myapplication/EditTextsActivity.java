package com.example.myapplication;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class EditTextsActivity extends AppCompatActivity {

    //Declaring a variable
    Button BtnImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_texts);

        // Initializing View Variables
        BtnImage = findViewById(R.id.btnImage);

        //Setting an onclick listener for the button
        BtnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage= new Intent(EditTextsActivity.this,ImagesActivity.class);
                startActivity(nextPage);
            }
        });
    }
}