package com.android.denverrocksv2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.denverrocksv2.Data.DataModel;
import com.android.denverrocksv2.DataAdapter.EventAdapter;

import java.util.ArrayList;

public class FunFragment extends Fragment {


    public FunFragment() {

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.denver_list, container, false);

        final ArrayList<DataModel> funDataArrayList = new ArrayList<DataModel>();

        funDataArrayList.add(new DataModel("Union Station", "#1 in Denver", "Transportation/Resturant", "Denver Union Station", "1 to 2 hours", "2", R.drawable.unionstation));
        funDataArrayList.add(new DataModel("Denver Art Museum", "#2 in Denver", "Museums Type", "", "1 to 2 hours", "2", R.drawable.unionstation));
        funDataArrayList.add(new DataModel("Red Rocks Park and Amphitheatre", "#3 in Denver", "Entertainment and Nightlife", "", "1 to 2 hours", "2", R.drawable.sloan));
        funDataArrayList.add(new DataModel("Larimer Square", "#4 in Denver", "Entertainment and Nightlife", "", "1 to 2 hours", "2", R.drawable.chatfield));
        funDataArrayList.add(new DataModel("Denver Botanic Gardens", "#5 in Denver", "Parks and Gardens", "", "4 hours", "2", R.drawable.botantic_garden));
        funDataArrayList.add(new DataModel("Denver Museum of Nature & Science", "#6 in Denver", "Museums", "", "3 hours", "2", R.drawable.wash_park));
        funDataArrayList.add(new DataModel("Coors Field", "#7 in Denver", "Sports", "", "2 hours", "2", R.drawable.city_park));


        EventAdapter funAdapter = new EventAdapter(getActivity(), 0, funDataArrayList);
        ListView funListView = rootView.findViewById(R.id.list);
        funListView.setAdapter(funAdapter);

        return rootView;
    }

}
