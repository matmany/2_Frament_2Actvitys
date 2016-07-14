package com.example_frag.mamani.flexib_ui_fragment_layout;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mamani on 14/07/16.
 */
public class AnotherActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent();
        int data = intent.getIntExtra("data",0);
        fragment_B f2 = (fragment_B) getFragmentManager().findFragmentById(R.id.fragment2);

        if(f2 !=null)
        f2.change_data(data);

    }


}
