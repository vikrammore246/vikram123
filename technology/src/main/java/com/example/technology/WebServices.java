package com.example.technology;

import android.content.Context;
import android.view.View;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by vikram on 25/1/17.
 */

public class WebServices {

    private static RequestQueue queue;

    public static RequestQueue q(Context context){
        if (queue == null) queue = Volley.newRequestQueue(context);
        return queue;
    }

}
