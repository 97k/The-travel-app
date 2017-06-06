package com.example.derplist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aadi on 26/5/17.
 */

public class DerpAdapter extends RecyclerView.Adapter<DerpAdapter.DerpHolder>  {


    private List<ListItem> listdata;
    private LayoutInflater inflater;
    private Context context;

    public DerpAdapter(Activity context, List<ListItem> listdata){
        this.inflater = LayoutInflater.from(context);
        this.listdata = listdata;
        this.context = context;

    }

    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card_item, parent , false);
        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, final int position) {
        ListItem item = listdata.get(position);
        holder.title.setText(item.getTitle());
        holder.subTitle.setText(item.getSubtile());
        holder.Container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(context, Historical_Places.class);
                        context.startActivity(intent);
                        break;


                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class DerpHolder extends RecyclerView.ViewHolder {

        private TextView title, subTitle;
        private LinearLayout Container;



        public DerpHolder(View itemview){
            super(itemview);
            Container = (LinearLayout)itemview.findViewById(R.id.cardLinearLayout);
            title = (TextView)itemview.findViewById(R.id.labelTextView);
            subTitle = (TextView)itemview.findViewById(R.id.labelSubTextView);

        }


    }


//    @NonNull
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View listItemView =  convertView;
//        if(listItemView==null){
//            listItemView= LayoutInflater.from(getContext()).inflate(
//                    R.layout.list_item, parent, false);
//        }
//        final ListItem listItem = getItem(position);
//
//    }
}
