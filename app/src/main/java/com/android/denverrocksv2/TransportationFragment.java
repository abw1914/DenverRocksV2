package com.android.denverrocksv2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.denverrocksv2.Data.DataModel;
import com.android.denverrocksv2.DataAdapter.EventAdapter;

import java.util.ArrayList;

public class TransportationFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootview =  inflater.inflate(R.layout.denver_list, container, false);


        ArrayList<DataModel> transportationDataArrayList = new ArrayList<DataModel>();

        transportationDataArrayList.add(new DataModel("Airport", "Union Station", "# Travel", "transit is best",
                R.drawable.bike_rentals));
        transportationDataArrayList.add(new DataModel("A Rail Line to the Airport", this.getString(R.string.union_station_description), "#2 Way to Travel", "transit is best",
                R.drawable.rtd));
        transportationDataArrayList.add(new DataModel("A Rail Line to the Airport", this.getString(R.string.union_station_description), "#3 Way to Travel", "transit is best",
                R.drawable.denver_rail));
        transportationDataArrayList.add(new DataModel("A Rail Line to the Airport", this.getString(R.string.union_station_description), "#4 Way to Travel", "transit is best",
                R.drawable.unionstation));
        transportationDataArrayList.add(new DataModel("A Rail Line to the Airport", this.getString(R.string.union_station_description), "#5 Way to Travel", "transit is best",
                R.drawable.denver_rail));
        transportationDataArrayList.add(new DataModel("A Rail Line to the Airport", this.getString(R.string.union_station_description), "#6 Way to Travel", "transit is best",
                R.drawable.denver_rail));

        EventAdapter transportationAdapter = new EventAdapter(getActivity(),  0, transportationDataArrayList);
        ListView transportationListView = rootview.findViewById(R.id.list);
        transportationListView.setAdapter(transportationAdapter);

        return rootview;
    }
}
