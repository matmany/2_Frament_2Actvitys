package com.example_frag.mamani.flexib_ui_fragment_layout;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by mamani on 14/07/16.
 */
public class fragment_A extends Fragment implements AdapterView.OnItemClickListener {

ListView list;
Comunicator comunicator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_frag_a,container,false);
        list = (ListView) view.findViewById(R.id.listView);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),R.array.topics,android.R.layout.simple_expandable_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
        return view;
    }

    public void setComunicator(Comunicator comunicator) {
        this.comunicator = comunicator;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        comunicator.respond(i);
    }

    public interface Comunicator{
        public void respond(int i);
    }


}
