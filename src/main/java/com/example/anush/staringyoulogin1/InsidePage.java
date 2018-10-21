package com.example.anush.staringyoulogin1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InsidePage extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_page);

        button = (Button) findViewById(R.id.nextbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpage1();
            }
        });
    }

    public void openpage1(){

        Intent intent = new Intent(this, Page1.class);
        startActivity(intent);
    }
}
