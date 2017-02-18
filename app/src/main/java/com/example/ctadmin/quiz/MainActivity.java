package com.example.ctadmin.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button gotoButton = (Button) findViewById(R.id.button);


        gotoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(gotoIntent);
            }
        });
    }
}
