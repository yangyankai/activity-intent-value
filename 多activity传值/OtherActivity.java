package com.example.ykai.myapplication;

/**
 * Created by ykai on 2015/2/3.
 */

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OtherActivity extends Activity implements OnClickListener{
    private TextView view ;
    private Button b2;
    private EditText e2;
    private TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = new TextView(this);
        setContentView(R.layout.mylayout);
        b2 = (Button)findViewById(R.id.b2);
        e2 = (EditText)findViewById(R.id.e2);
        tv2 = (TextView)findViewById(R.id.tv2);
        Intent i = this.getIntent();
       if(i.getStringExtra("1")!=null){
            tv2.setText(i.getStringExtra("1"));
        }
        b2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        Intent intent = new Intent(OtherActivity.this,MainActivity.class);
        intent.putExtra("2", e2.getText().toString());
        this.startActivity(intent);
    }

}