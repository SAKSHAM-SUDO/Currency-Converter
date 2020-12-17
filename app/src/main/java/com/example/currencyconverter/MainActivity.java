package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
       ImageView image;
       Button button,button2,button3;
       EditText editText;
       TextView textView;
       DecimalFormat formatter=new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image=findViewById(R.id.image);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Not Entered Amount", Toast.LENGTH_SHORT).show();
                }
                  else
                   {
                      String amount = editText.getText().toString();
                      double input=  Double.parseDouble(amount);

                      double output=input*74.11;
                     textView.setText(   formatter.format(output));

                   }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Not Entered Amount", Toast.LENGTH_SHORT).show();
                }
                else
                {

                    String amount = editText.getText().toString();
                    double input=  Double.parseDouble(amount);

                    double output=input*1.43;
                    formatter.format(output);
                    textView.setText(   formatter.format(output));
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Not Entered Amount", Toast.LENGTH_SHORT).show();
                }
                else
                {

                    String amount = editText.getText().toString();
                    double input=  Double.parseDouble(amount);
                    double output=input*1.10;

                    formatter.format(output);
                    textView.setText(   formatter.format(output));
                }

            }
        });
    }
}
