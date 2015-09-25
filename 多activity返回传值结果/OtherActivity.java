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

public class OtherActivity extends Activity {
    private TextView view ;
    private Button b2;
    private EditText e2;
    private TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.mylayout);
        tv2 = (TextView)this.findViewById(R.id.tv2);
        Intent intent = new Intent();  //创建一个Intent
        intent.putExtra("response", "来自2");
        setResult(200,intent);  //返回码为200
        finish();
    }

}