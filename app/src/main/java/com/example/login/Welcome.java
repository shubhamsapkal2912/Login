package com.example.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;

public class Welcome extends Activity {
    private TextView txt;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.welcome);
        txt=findViewById(R.id.ans);
        String name=getIntent().getStringExtra("name");
        txt.setText("Welcome: "+name);

    }
}
