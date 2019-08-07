package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
    {
    Button hal2;
    Button hal3;
    Button hal4;
    Button hal5;
    Button hal6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hal2 = (Button)findViewById(R.id.hal2);
        hal2.setOnClickListener(this);
        hal3 = (Button)findViewById(R.id.hal3);
        hal3.setOnClickListener(this);
        hal4 = (Button)findViewById(R.id.hal4);
        hal4.setOnClickListener(this);
        hal5 = (Button)findViewById(R.id.hal5);
        hal5.setOnClickListener(this);
        hal6 = (Button)findViewById(R.id.hal6);
        hal6.setOnClickListener(this);
    }
    @Override
        public void onClick(View v){
        switch (v.getId()){

            case R.id.hal2:
                Intent hal2 = new Intent(MainActivity.this, Intent_activity.class);
                startActivity(hal2);
                break;
            case R.id.hal3:
                Intent hal3 = new Intent(MainActivity.this, Intent_activity2.class);
                startActivity(hal3);
                break;
            case R.id.hal4:
                Intent hal4 = new Intent(MainActivity.this, Intent_activity3.class);
                startActivity(hal4);
                break;
            case R.id.hal5:
                Intent hal5 = new Intent(MainActivity.this, Intent_activity4.class);
                startActivity(hal5);
                break;
            case R.id.hal6:
                Intent hal6 = new Intent(MainActivity.this, Intent_activity5.class);
                startActivity(hal6);
                break;
                default:
                    break;
        }


    }
}
