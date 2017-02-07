package com.example.resume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView aboutme = (TextView) findViewById(R.id.idaboutme);
        TextView academics = (TextView) findViewById(R.id.idacademics);
        TextView experience = (TextView) findViewById(R.id.idexperience);
        TextView skills = (TextView) findViewById(R.id.idskills);
        TextView events = (TextView) findViewById(R.id.idevents);
        TextView strength = (TextView) findViewById(R.id.idstrength);



        aboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutMe.class);
                startActivity(intent);
            }
        });

        academics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Academics.class);
                startActivity(intent);
            }
        });
    }
}
