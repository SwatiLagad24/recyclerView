package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class addAdapter extends RecyclerView.Adapter<addAdapter.addViewHolder> {
    private String[] data;
    public addAdapter(String[] data)
    {//this constructor assign data comming from mainactivity to data of this recycler view
this.data=data;

    }
    @NonNull
    @Override
    public addViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //it create view
        //what it will do is it create layout for every view
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext()) ;
        //we have created a layout file for perticuler layout so we have layout for perticular view
        //it simply make design for every view
        View view=layoutInflater.inflate(R.layout.list_item,parent,false);

        return new addViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull addViewHolder holder, int position) {
        //it bind view to our data
    String title=data[position];
    holder.textView.setText(title);

    }

    @Override
    public int getItemCount() {
        //we have to tell recycler view length of view
        return data.length;
    }

    public class addViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public addViewHolder(@NonNull View itemView) {
            super(itemView);

//this save refernce of view so we can access this views
            imageView=(ImageView)itemView.findViewById(R.id.imgitem);
            textView=(TextView)itemView.findViewById(R.id.txtid);
        }
    }
}
