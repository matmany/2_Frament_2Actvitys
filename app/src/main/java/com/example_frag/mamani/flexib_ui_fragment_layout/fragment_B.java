package com.example_frag.mamani.flexib_ui_fragment_layout;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by mamani on 14/07/16.
 */
public class fragment_B extends Fragment {

    TextView text;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_frag_b,container,false);
        text = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    public void change_data(int i)
    {
        String[] descriptions = getResources().getStringArray(R.array.discription);

        text.setText(descriptions[i]);
    }
}
