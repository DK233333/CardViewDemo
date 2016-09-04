package com.example.administrator.cardviewdemo;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    CardView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cv = (CardView) findViewById(R.id.cardview);
        cv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.cardview:
                Snackbar.make(view,"是不是觉得很文艺..",Snackbar.LENGTH_SHORT).setAction("23333", this).show();
                break;
        }
    }

}
