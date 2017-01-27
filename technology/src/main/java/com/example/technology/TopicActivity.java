package com.example.technology;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

public class TopicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        findViewById(R.id.btnHit).setOnClickListener(this::click);

    }

    private void click(View view) {
        get();

    }

    private void get(){
        WebServices.q(this)
                .add(new StringRequest("http://api.icndb.com/jokes/random/3",
                this::onJoke,
                this::onJokeError));
    }

    private void onJokeError(VolleyError volleyError) {
        Log.i("@codekul","volley Error - "+volleyError.toString());
    }

    private void onJoke(String s) {
        Log.i("@codekul","Json - "+s);

    }


}
