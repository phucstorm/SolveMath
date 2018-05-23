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

public class QuadraticEquation extends AppCompatActivity {
    EditText numa,numb,numc;
    TextView step,result;
    Button btStep,btResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic_equation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        numa = (EditText) findViewById(R.id.edA);
        numb = (EditText) findViewById(R.id.edB);
        numc = (EditText) findViewById(R.id.edC);
        step = (TextView) findViewById(R.id.tvStep);
        result = (TextView) findViewById(R.id.tvResult);
        btStep = (Button) findViewById(R.id.btnStep);
        btResult = (Button) findViewById(R.id.btnResult);
        btStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(numa.getText().toString());
                int b = Integer.parseInt(numb.getText().toString());
                int c = Integer.parseInt(numc.getText().toString());
                double delta = 0;
                delta = b*b - 4*a*c;

                if (delta > 0 ){
                    step.setText("Step 1: tính delta \n" +
                            "delta = b*b-4*a*c <=> delta = "+b+"*"+b+"- 4*"+a+"*"+c +
                            "\n => delta =" +delta+
                            "\n vì delta > 0 nên phương trình có 2 nghiệm phân biệt"+
                            "\n x1 = (-b + √delta)/2*a  (1)"+
                            "\n x2 = (-b - √delta)/2*a  (2)"+
                            "\n từ (1) => x1 = ( "+(-1)*b+" + √"+delta+")/2*"+a+
                            "\n từ (2) => x2 = ( "+(-1)*b+" - √"+delta+")/2*"+a);
                }else if(delta == 0 ){
                    step.setText("Step 1: tính delta \n" +
                            "delta = b*b-4*a*c <=> delta = "+b+"*"+b+"- 4*"+a+"*"+c +
                            "\n => delta =" +delta+
                            "\n vì delta = 0 nên phương trình có 1 nghiệm kép"+
                            "\n x = -b/2*a"+
                            "\n => x = -"+b+"/2*"+a);
                }else {
                    step.setText("Step 1: tính delta \n" +
                            "delta = b*b-4*a*c <=> delta = "+b+"*"+b+"- 4*"+a+"*"+c +
                            "\n => delta =" +delta+
                            "\n vì delta < 0 nên phương trình vô nghiệm");
                }
            }
        });
        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(numa.getText().toString());
                int b = Integer.parseInt(numb.getText().toString());
                int c = Integer.parseInt(numc.getText().toString());
                double delta;
                delta = b*b - 4*a*c;
                double x,x1, x2;
                x1 = ((-1)*b + Math.sqrt(delta))/(2*a);
                x2 = ((-1)*b - Math.sqrt(delta))/(2*a);
                x = (-1)*b/(2*a);
                if (delta > 0){
                    result.setText("x1 = " +x1 +"và x2 = "+x2);
                }else if(delta == 0){
                    result.setText("PT có nghiệm kép x = " +x);
                }else{
                    result.setText("PT vô nghiệm");
                }
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
