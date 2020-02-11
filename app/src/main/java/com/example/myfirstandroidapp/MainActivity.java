package com.example.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String DEBUG_TAG= "MyFirstAppLogging";

    public void forceError(){
        if(true){
            throw new Error("Whoops");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //forceError();
        Log.i(DEBUG_TAG,
                "In the onCreate() method of MyFirstAndroidAppActivity Class");
    }
}
