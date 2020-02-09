package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
     TextView t1;
     Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        t1=findViewById(R.id.textView3);
        b1=findViewById(R.id.button4);
        t1.setText("WELCOME TO LAST SCREEN OF MY APP");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ThirdActivity.this,SecondActivity.class);
                startActivity(i);
            }
        });
    }

}
