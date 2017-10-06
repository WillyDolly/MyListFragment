package com.popland.pop.mylistfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hai on 17/07/2016.
 */
public class MyListFragment extends ListFragment {
    ArrayList<Physists> arrl;
    CustomBaseAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.listfragment,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        arrl = new ArrayList<Physists>();
        arrl.add(new Physists("Newton", 67, "gravitational law"));
        arrl.add(new Physists("Enstein",59,"Relativity theory"));
        arrl.add(new Physists("Stephen hawking",65,"Hawking Radiation"));
        adapter = new CustomBaseAdapter(getActivity(),R.layout.custom_layout,arrl);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        arrl.remove(position);
        adapter.notifyDataSetChanged();
    }
}
