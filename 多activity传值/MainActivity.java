package com.example.ykai.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
    private Button b1;
    private EditText e1;
    private TextView tv1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.b1);
        e1 = (EditText)findViewById(R.id.e1);
        tv1 = (TextView)findViewById(R.id.tv1);
        Intent i = this.getIntent();
        if(i.getStringExtra("2")!=null){
            tv1.setText(i.getStringExtra("2"));
        }
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this,OtherActivity.class);
        intent.putExtra("1", e1.getText().toString());
        this.startActivity(intent);
    }
}