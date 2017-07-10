package com.example.vivek.locare20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class SendReceive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_receive);
        Button but =(Button) findViewById(R.id.button2);
        Button but2 =(Button) findViewById(R.id.button3);

    }
    public void send(View view)
    {
        Intent i= new Intent(this,GetCurrentGPSLocation.class);
        startActivity(i);


    }

    public void receive(View view)
    {
        Intent i= new Intent(this,SMS.class);
        startActivity(i);


    }

}
