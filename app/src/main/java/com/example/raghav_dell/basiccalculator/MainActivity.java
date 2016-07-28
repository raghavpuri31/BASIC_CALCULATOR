package com.example.raghav_dell.basiccalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.lang.*;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2,b3,b4,b5,b6;
    Double sum,divide,multiply,power,sub,root,n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show();
    }
    public void show()
    {
      e1=(EditText)findViewById(R.id.editText);
      e2=(EditText)findViewById(R.id.editText2);
      b1=(Button)findViewById(R.id.button);
      b2=(Button)findViewById(R.id.button2);
      b3=(Button)findViewById(R.id.button3);
      b4=(Button)findViewById(R.id.button4);
      b5=(Button)findViewById(R.id.button5);
      b6=(Button)findViewById(R.id.button6);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(String.valueOf(e1.getText()));
                n2=Double.parseDouble(String.valueOf(e2.getText()));
                sum=n1+n2;
                Toast.makeText(MainActivity.this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(String.valueOf(e1.getText()));
                n2=Double.parseDouble(String.valueOf(e2.getText()));
                divide=n1/n2;
                Toast.makeText(MainActivity.this, String.valueOf(divide), Toast.LENGTH_SHORT).show();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(String.valueOf(e1.getText()));
                n2=Double.parseDouble(String.valueOf(e2.getText()));
                multiply=n1*n2;
                Toast.makeText(MainActivity.this, String.valueOf(multiply), Toast.LENGTH_SHORT).show();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(String.valueOf(e1.getText()));
                n2=Double.parseDouble(String.valueOf(e2.getText()));
                power=Math.pow(n1,n2);
                Toast.makeText(MainActivity.this, String.valueOf(power), Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(String.valueOf(e1.getText()));
                n2=Double.parseDouble(String.valueOf(e2.getText()));
                sub=n1-n2;
                Toast.makeText(MainActivity.this, String.valueOf(sub), Toast.LENGTH_SHORT).show();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=Double.parseDouble(String.valueOf(e1.getText()));
                n2=Double.parseDouble(String.valueOf(e2.getText()));
                root=Math.sqrt(n1);
                Toast.makeText(MainActivity.this, String.valueOf(root), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
