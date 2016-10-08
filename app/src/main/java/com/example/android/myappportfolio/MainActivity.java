package com.example.android.myappportfolio;

import android.content.Context;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.button;
import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {
    int duration = Toast.LENGTH_SHORT;
    Toast toast;
    Context context;
    CharSequence text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMovies(View v) {
        Button button = (Button) findViewById(v.getId());
        context = getApplicationContext();
        text = String.format("%s %s apps!", getText(R.string.toast_message).toString(), button.getText().toString().toLowerCase());
        toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
