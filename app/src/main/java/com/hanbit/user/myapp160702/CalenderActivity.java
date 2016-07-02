package com.hanbit.user.myapp160702;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalenderActivity extends Activity implements View.OnClickListener {
    Button bthome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);
        bthome = (Button) findViewById(R.id.btHome);

        bthome.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btHome:
                this.startActivity(new Intent(this,MainActivity.class));
                break;


        }
    }
}