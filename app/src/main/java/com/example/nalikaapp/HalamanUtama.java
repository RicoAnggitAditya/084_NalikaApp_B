package com.example.nalikaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nalikaapp.adapter.BestSellerAdapter;
import com.example.nalikaapp.adapter.list;
import com.example.nalikaapp.model.BestSeller;

import java.util.ArrayList;

public class HalamanUtama extends AppCompatActivity {

    RecyclerView bestRecycle;
    RecyclerView bestSellerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

        list<BestSeller> bestSellerlist = new ArrayList<>();
        bestSellerlist.add(new BestSeller( nama:"Nasi Kulit Spesial 1", harga: "Rp20.000",R.drawable.bestsallerfood1));
        bestSellerlist.add(new BestSeller( nama:"Nasi Kulit Spesial 2", harga: "Rp22.000",R.drawable.bestsallerfood2));
        bestSellerlist.add(new BestSeller( nama:"Es teh", harga: "Rp3.000",R.drawable.bestsallerfood3));
        bestSellerlist.add(new BestSeller( nama:"Es Jeruk", harga: "Rp4.000",R.drawable.bestsallerfood4));

        setBestRecycle(bestSellerlist);
    }

    private void setBestRecycle(list<BestSeller> bestSellerlist{
        bestRecycle = findViewById(R.id.best_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( context: this, RecyclerView.HORIZONTAL, reverseLayout: false);
        bestSellerAdapter.setLayoutManager(layoutManager);
        bestSellerAdapter = new BestSellerAdapter( context: this, bestSellerlist);
        bestSellerAdapter. setAdapter(bestSellerAdapter);
    }
}