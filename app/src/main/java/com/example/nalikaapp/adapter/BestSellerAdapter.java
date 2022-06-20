package com.example.nalikaapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nalikaapp.R;
import com.example.nalikaapp.model.BestSeller;

public class BestSellerAdapter extends RecyclerView.Adapter<BestSellerAdapter.BestSellerViewHolder>{

    Context context;
    list<BestSeller> BestSellerList;

    public BestSellerAdapter(Context context, list<BestSeller> bestSellerList) {
        this.context = context;
        BestSellerList = bestSellerList;
    }

    @NonNull
    @Override
    public BestSellerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.best_seller_row_item, parent, false);
        return new BestSellerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BestSellerViewHolder holder, int position) {

        holder.foodfoto.setImageResource(bestSellerList.get(position).getimgurl());
        holder.nama.setText(bestSellerList.get(position).getnama());
        holder.harga.setText(bestSellerList.get(position).getharga);
    }

    @Override
    public int getItemCount() {
        return bestSellerList.size();
    }

    public static final class BestSellerViewHolder extends RecyclerView.ViewHolder{

        ImageView foodfoto;
        TextView harga, nama;

        public BestSellerViewHolder(@NonNull View itemView){
            super(itemView);

            foodfoto = itemView.findViewById(R.id.foto1);
            harga = itemView.findViewById(R.id.harga1);
            nama = itemView.findViewById(R.id.nasi1);
        }


    }

}
