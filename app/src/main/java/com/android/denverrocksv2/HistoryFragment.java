package com.android.denverrocksv2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.denverrocksv2.Data.DataModel;
import com.android.denverrocksv2.DataAdapter.EventAdapter;

import java.util.ArrayList;

public class HistoryFragment extends Fragment {


    public HistoryFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.denver_list, container, false);


        ArrayList<DataModel> historicalDataArrayList = new ArrayList<DataModel>();

        historicalDataArrayList.add(new DataModel("Bent’s Old Fort National Historic Site",
                "Located in southeastern Colorado, east of the town of La Junta.", "Founded in 1960", "Best Fort is nice", R.drawable.maxwell));
        historicalDataArrayList.add(new DataModel("Colorado National Monument",
                "Located in western Colorado, near Grand Junction.", "Founded in 1911", "National Monument is nice", R.drawable.botantic_garden));
        historicalDataArrayList.add(new DataModel("Curecanti National Recreation Area",
                "Located in southeastern Colorado, east of the town of La Junta.", "Founded in 1945", "National Monument is nice", R.drawable.maxwell));
        historicalDataArrayList.add(new DataModel("Dinosaur National Monument",
                "Located in southeastern Colorado, east of the town of La Junta.", "Founded in 1915.", "National Monument is nice", R.drawable.dinosaur));
        historicalDataArrayList.add(new DataModel("Florissant Fossil Beds National Monument",
                "Located in southeastern Colorado, east of the town of La Junta.", "Founded in 1960", "National Monument is nice", R.drawable.redrocks));
        historicalDataArrayList.add(new DataModel("Hovenweep National Monument",
                "Located on the southern border of Colorado and Utah.", "Founded in 1923", "Hovenweep Monument", R.drawable.sloan));
        historicalDataArrayList.add(new DataModel("Sand Creek Massacre National Historic Site",
                "Located in southeastern Colorado, 24 miles from the town of Eads.", "Founded in 2007", "Sand Creek Massacre", R.drawable.roxbororgh));
        historicalDataArrayList.add(new DataModel("Yucca House National Monument",
                "Located in southwestern Colorado, near the town of Cortez.", "Founded in 1919", "Yucca House National Monument", R.drawable.chatfield));

        EventAdapter historicalAdapter = new EventAdapter(getActivity(),  0, historicalDataArrayList);
        ListView historicalListView = rootView.findViewById(R.id.list);
        historicalListView.setAdapter(historicalAdapter);

        return rootView;
    }


}


