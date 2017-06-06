package com.example.derplist;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private RecyclerView mrecView;
    private DerpAdapter mderpAdapter;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ArrayList<ListItem> listdata = DerpData.getListData();


        mrecView = (RecyclerView)findViewById(R.id.rec_view);
        mrecView.setLayoutManager(new LinearLayoutManager(this));/* Setting up the rec. view*/

        mderpAdapter = new DerpAdapter(this, listdata);
        mrecView.setAdapter(mderpAdapter);


       toolbar.setPadding(0, getStatusBarHeight(), 0, 0);
    }

    private int getStatusBarHeight() {
        int height;

        Resources myResources = getResources();
        int idStatusBarHeight = myResources.getIdentifier(
                "status_bar_height", "dimen", "android");
        if (idStatusBarHeight > 0) {
            height = getResources().getDimensionPixelSize(idStatusBarHeight);
            Toast.makeText(this,
                    "Status Bar Height = " + height,
                    Toast.LENGTH_LONG).show();
        }else{
            height = 0;
            Toast.makeText(this,
                    "Resources NOT found",
                    Toast.LENGTH_LONG).show();
        }

        return height;
    }
}
