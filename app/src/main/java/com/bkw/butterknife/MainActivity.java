package com.bkw.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.bkw.butterknife.annotation.BindView;
import com.bkw.butterknife.annotation.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick(R.id.text)
    public void onClick(View view) {
        if (view.getId() == R.id.text) {

        }
    }
}
