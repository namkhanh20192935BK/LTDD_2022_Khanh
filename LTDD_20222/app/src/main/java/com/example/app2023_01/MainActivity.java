package com.example.app2023_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hdsv);
    }

    public void btnOKClick(View view) {
        EditText e=findViewById(R.id.txtFullName);
        TextView tv=findViewById(R.id.txtHello);
        tv.setText("Welcome "+e.getText());
        Log.i("CUS", "btnOKClick: Yes");;
    }
}