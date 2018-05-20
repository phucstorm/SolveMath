package com.example.storm.solvemath;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LinearEquation extends AppCompatActivity {
    EditText numa,numb;
    TextView step,result;
    Button btStep,btResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_equation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        numa = (EditText) findViewById(R.id.edA);
        numb = (EditText) findViewById(R.id.edB);
        step = (TextView) findViewById(R.id.tvStep);
        result = (TextView) findViewById(R.id.tvResult);
        btStep = (Button) findViewById(R.id.btnStep);
        btResult = (Button) findViewById(R.id.btnResult);

        btStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(numa.getText().toString());
                int b = Integer.parseInt(numb.getText().toString());
                step.setText("Step 1: \n " +"ax = -b <=> " + a +"x = -" + b + "\n Step 2: \n x = -b/a");
            }
        });
        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(numa.getText().toString());
                int b = Integer.parseInt(numb.getText().toString());
                result.setText("x = " + (double)-b/a);
            }
        });
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
