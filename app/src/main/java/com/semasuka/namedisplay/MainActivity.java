package com.semasuka.namedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void show(View view){

        EditText myname = (EditText)findViewById(R.id.name);
        Toast.makeText(getApplicationContext(),"hi "+myname.getText().toString(),Toast.LENGTH_SHORT).show();
        Log.i("name is",myname.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
