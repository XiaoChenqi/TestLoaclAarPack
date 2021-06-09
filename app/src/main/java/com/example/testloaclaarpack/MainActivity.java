package com.example.testloaclaarpack;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.localaar1.DataUtils;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView mMethodTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListeners();
    }

    String TAG="周杨,林晓旭,易霖";
    private void initListeners() {
        mMethodTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp =  DataUtils.getVoiceLineWight(10000);
                Log.d(TAG, "onClick: "+temp);
            }
        });
    }

    private void initView() {
        mMethodTv = (TextView) findViewById(R.id.methodTv);
    }
}
