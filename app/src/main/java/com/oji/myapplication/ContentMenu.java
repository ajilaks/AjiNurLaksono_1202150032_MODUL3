package com.oji.myapplication;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ContentMenu extends AppCompatActivity {

    private List<menu> menuList = new ArrayList<>();
    private RecyclerView recyclerView;
    private menuAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_menu);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new menuAdapter(this, menuList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());       //menginisiasi adapter untuk recycleView
        recyclerView.setLayoutManager(mLayoutManager);      //menghubungkan adapter dan layout
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMenuData();

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));


    }

    private void prepareMenuData() {                                                                                    //memasukkan beberapa menu ke dalam array objek
        String[] merk_title = getResources().getStringArray(R.array.merk_tittle);
        String[] merk_deskripsi = getResources().getStringArray(R.array.merk_deskripsi);
        String[] details = getResources().getStringArray(R.array.details);
        TypedArray sportsImageResources = getResources().obtainTypedArray(R.array.sports_images);
        //Clear the existing data (to avoid duplication)
        menuList.clear();


        //Create the ArrayList of Sports objects containing the titles,
        // images and information about each sport
        for(int i=0; i<merk_title.length; i++){
            menuList.add(new menu(sportsImageResources.getResourceId(i,0),merk_title[i], merk_deskripsi[i]
                    , details[i]));
        }

        //Recycle the typed array
        sportsImageResources.recycle();

        //Notify the adapter of the change
        mAdapter.notifyDataSetChanged();



       // mAdapter.notifyDataSetChanged();
    }

}
