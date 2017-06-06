package com.example.derplist;

import java.util.ArrayList;

/**
 * Created by aadi on 26/5/17.
 */

public class DerpData {
    private static final String[] titles = {"Historic Places", "Temples", "Gardens and parks", "Cafes and Lounge", "Places Nearby"};

    private static final String[] subTitles = {"Explore the beauty of jaipur", "shradha", "Greenry", " Rest", "Explore"};


    public static ArrayList<ListItem> getListData(){
        ArrayList<ListItem> data = new ArrayList<>();

        //Repeat the process many times so that our list may become scrollable RecyclerView/


            // Repeating it four times for the sake of above comment
            for(int j =0; j<titles.length&&j<subTitles.length; j++){
                ListItem item = new ListItem();
                item.setTitle(titles[j]);
                item.setSubtile(subTitles[j]);

                data.add(item);
            }

        return data;
    }

}
