package com.ilordtony.navigationoptions;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
    }

    public void onClickButtonTab(View view){
        Log.d(TAG, "onClickButtonTab");
        Toast.makeText(this, "onClickButtonTab", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, TabsActivity.class);
        startActivity(intent);
    }

    public void onClickButtonSliding(View view){
        Log.d(TAG, "onClickButtonSliding");
        Toast.makeText(this, "onClickButtonSliding", Toast.LENGTH_SHORT).show();
    }

    public void onClickButtonSwipe(View view){
        Log.d(TAG, "onClickButtonSwipe");
        Toast.makeText(this, "onClickButtonSwipe", Toast.LENGTH_SHORT).show();
    }

}
