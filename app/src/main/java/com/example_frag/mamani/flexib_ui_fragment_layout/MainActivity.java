package com.example_frag.mamani.flexib_ui_fragment_layout;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements fragment_A.Comunicator {

    fragment_A f1;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager=getFragmentManager();
        f1 = (fragment_A) manager.findFragmentById(R.id.fragment);
        f1.setComunicator(this);

    }


    @Override
    public void respond(int i) {
        fragment_B f2;
        f2 = (fragment_B) manager.findFragmentById(R.id.fragment2);

        if(f2 != null && f2.isVisible())
        {
            f2.change_data(i);
        }
        else
        {
            Intent intent = new Intent(this,AnotherActivity.class);
            intent.putExtra("data",i);
            startActivity(intent);
        }
    }
}
