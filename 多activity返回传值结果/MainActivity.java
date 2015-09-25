package com.example.ykai.myapplication;

        import android.app.Activity;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends Activity {
    private Button btn1;
    private TextView tv1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)this.findViewById(R.id.btn1);
        tv1 = (TextView)this.findViewById(R.id.tv1);
        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, OtherActivity.class);
                startActivityForResult(intent, 100); //requestcode=100

            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==100&&resultCode==200){
            Bundle bundle = data.getExtras();
            String response = bundle.getString("response");
            tv1.setText(response);
        }
        }


}