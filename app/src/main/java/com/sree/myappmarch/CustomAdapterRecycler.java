package com.sree.myappmarch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapterRecycler extends  RecyclerView.Adapter<CustomAdapterRecycler.MyViewHolder> {

    ArrayList<Integer> foodimages;
    ArrayList<String> foodnames;
    Context context;

    public CustomAdapterRecycler(Context applicationContext, ArrayList<Integer> foodimages, ArrayList<String> foodnames) {
         context = applicationContext;
         this.foodimages = foodimages;
         this.foodnames  = foodnames;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.secondrecycler, parent ,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.fnames.setText(foodnames.get(position));
        holder.fimage.setImageResource(foodimages.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context.getApplicationContext(), foodnames.get(position),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return foodnames.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView fnames;
        ImageView fimage;

        public MyViewHolder(View itemView) {//v
            super(itemView);
            fnames =(TextView)itemView.findViewById(R.id.fname);
            fimage =(ImageView)itemView.findViewById(R.id.fimage);
        }
    }
}
