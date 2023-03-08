package com.example.greeting_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText)findViewById(R.id.edmsg);
        tv1 = (TextView)findViewById(R.id.txtMsg);
        tv2 = (TextView)findViewById(R.id.txtmsg);


    }

    public void Show(View view){
        String s;
        s = "Good Morning " + ed1.getText().toString();
        tv1.setText(s);
    }
}