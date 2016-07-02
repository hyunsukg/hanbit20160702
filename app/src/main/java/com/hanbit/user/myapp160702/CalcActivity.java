package com.hanbit.user.myapp160702;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends Activity implements View.OnClickListener{
    EditText et1,et2;
    Button btPlus,btminus,btdivide,btmulti,bthome;
    TextView tvresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        btdivide = (Button) findViewById(R.id.btdivide);
        btminus = (Button) findViewById(R.id.btminus);
        btmulti = (Button) findViewById(R.id.btmulti);
        btPlus = (Button) findViewById(R.id.btPlus);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tvresult = (TextView) findViewById(R.id.tvresult);
        bthome = (Button) findViewById(R.id.btHome);

        bthome.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btCalc :
                this.startActivity(new Intent(this,CalcActivity.class));
                break;
            case R.id.calender:
                this.startActivity(new Intent(this,CalenderActivity.class));
                break;
            case R.id.btHome :
                this.startActivity(new Intent(this,MainActivity.class));
                break;
        }

    }
}
