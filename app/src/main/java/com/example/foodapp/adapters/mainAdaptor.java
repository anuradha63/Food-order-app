package com.example.foodapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;

import java.util.ArrayList;

public class mainAdaptor extends RecyclerView.Adapter<mainAdaptor.viewholder> {

   ArrayList<mainModel> list;
   Context context;
   public mainAdaptor(ArrayList<mainModel> list,Context context)
    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public viewholder onCreateViewHolder(@NonNull @org.jetbrains.annotat ions.NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_food ,parent ,false);
        return new viewholder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull mainAdaptor.viewholder holder, int position) {
        final mainModel model = list.get(position);
        holder.foodimage.setImageResource(model.getImage());
        holder.mainName.setText(model.getName());
        holder.price.setText(model.getPrice());
        holder.description.setText(model.getDescription());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView foodimage ;
        TextView mainName ,price ,description;
        public viewholder(@NonNull View itemView){
            super(itemView);
            foodimage = itemView.findViewById(R.id.image);
            mainName = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            description = itemView.findViewById(R.id.description);

        }
    }
}
