package com.popland.pop.mylistfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by hai on 17/07/2016.
 */
public class CustomBaseAdapter extends BaseAdapter {
    Context  myContext;
    int myLayout;
    List<Physists> myItems;
    public CustomBaseAdapter(Context context,int layout,List<Physists> items){
        myContext = context;
        myLayout = layout;
        myItems = items;
    }
    @Override
    public int getCount() {
        return myItems.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout,null);

        TextView TVname = (TextView)convertView.findViewById(R.id.TVname);
        TVname.setText(myItems.get(position).name);

        TextView TVage = (TextView)convertView.findViewById(R.id.TVage);
        TVage.setText(myItems.get(position).age+"");

        TextView TVachievements = (TextView)convertView.findViewById(R.id.TVachievements);
        TVachievements.setText(myItems.get(position).achievements);
        return convertView;
    }
}
