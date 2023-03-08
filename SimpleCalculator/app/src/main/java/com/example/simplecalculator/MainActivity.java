package com.example.simplecalculator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    TextView tv1;
    Integer c, d, r, b;
    String a = "0", aa;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.TextView1);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button0);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b13 = (Button) findViewById(R.id.button13);
        b14 = (Button) findViewById(R.id.button14);
        b15 = (Button) findViewById(R.id.button15);
        b16 = (Button) findViewById(R.id.button16);
        b17 = (Button) findViewById(R.id.button17);
        b18 = (Button) findViewById(R.id.button18);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "1";
                tv1.setText(a);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "2";
                tv1.setText(a);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "3";
                tv1.setText(a);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "4";
                tv1.setText(a);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "5";
                tv1.setText(a);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "6";
                tv1.setText(a);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "7";
                tv1.setText(a);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "8";
                tv1.setText(a);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "9";
                tv1.setText(a);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a = tv1.getText().toString();
                a = a + "0";
                tv1.setText(a);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aa = a;
                b = 1;
                a = "";
                tv1.setText("+");
                tv1.setText("");
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aa = a;
                b = 2;
                a = "";
                tv1.setText("-");
                tv1.setText("");
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aa = a;
                b = 3;
                a = "";
                tv1.setText("*");
                tv1.setText("");
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aa = a;
                b = 4;
                a = "";
                tv1.setText("/");
                tv1.setText("");
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (b == 1) {
                    c = Integer.parseInt(aa);
                    d = Integer.parseInt(a);
                    r = c + d;
                } else if (b == 4) {
                    c = Integer.parseInt(aa);
                    d = Integer.parseInt(a);
                    r = c / d;
                } else if (b == 2) {
                    c = Integer.parseInt(aa);
                    d = Integer.parseInt(a);
                    r = c - d;
                } else if (b == 3) {
                    c = Integer.parseInt(aa);
                    d = Integer.parseInt(a);
                    r = c * d;
                }

                String op="";
                switch (b) {
                    case 1: op=" + ";
                        break;
                    case 2: op=" - ";
                        break;
                    case 3: op=" * ";
                        break;
                    case 4: op=" / ";
                }
                tv1.setText(c + op + d + " = " + r + "\n Nitesh 1175");
                String ans=c + op + d + " = " + r;
                Toast.makeText(MainActivity.this, ans, Toast.LENGTH_LONG).show();

            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv1.setText("");
            }
        });
    }
}
