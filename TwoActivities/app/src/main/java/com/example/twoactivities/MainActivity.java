package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity; import android.content.Intent; import android.os.Bundle; import android.view.View;
public class MainActivity extends AppCompatActivity{
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
    }
    public void execute(View view){
        Intent i = new Intent(getApplicationContext(),SecondActivity.class);
        i.putExtra("Value1","Called the Second Activity using Main Activity");
        i.putExtra("Value2","Explicit Intent Example"); startActivity(i);
    }
}