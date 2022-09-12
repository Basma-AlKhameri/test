package com.example.nnn;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Context context;
    ArrayList<Restuarant> data;

    public MyAdapter(Context context, ArrayList<Restuarant> data) {
        this.context=context;
        this.data = data;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= LayoutInflater.from(context);
        view=inflater.inflate(R.layout.item,null);

        ImageView ii= view.findViewById(R.id.image);
        TextView name=view.findViewById(R.id.Rname);
        TextView rating=view.findViewById(R.id.rating);
        ImageView location=view.findViewById(R.id.loc);

name.setText(data.get(i).name);
rating.setText(data.get(i).rating);
location.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(data.get(i).locationLink));
        context.startActivity(intent);
    }
});


        return view;
    }
}
