package com.example.sergio.autismgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AustismMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_austism_main);
    }
    @Override
    public boolean  onCreateOptionMenu(Menu menu) {
        // Iflate the menu; adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu;main_main, menu);
        return true;
    }

    @Override
    public boolean onOptionItemSelected(MenuItem item){
        // Handle action bar item clicks here. the action bar will
        // automatically hand cliks on the home/up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id= item.getItemId();

        /
    }
}
