package com.example.dragonis.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by dragonis on 03.06.17.
 */

public class FragmentList extends ListFragment {

    String countries[] = {"Australia", "Belgium", "China", "India", "Pakistan",
            "South Africa", "Japan","Canada","Egypt", "France", "Germany",
            "Iran", "Iraq", "Japan", "Turkey","United Kindom", "United States", "Poland" };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(),android.R.layout.simple_list_item_1,countries
        );
        setListAdapter(adapter);
    }
}
