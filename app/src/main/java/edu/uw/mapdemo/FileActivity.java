package edu.uw.mapdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FileActivity extends AppCompatActivity {

    private static final String TAG = "** FILE DEMO **";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);
    }


    //external button
    public void handleSaveFile(View v){
        Log.v(TAG, "Save button clicked");


    }


    //internal button
    public void handleReadFile(View v){
        Log.v(TAG, "Read button clicked");


    }


    //share button
    public void handleShareFile(View v){
        Log.v(TAG, "Share button clicked");


    }


}
