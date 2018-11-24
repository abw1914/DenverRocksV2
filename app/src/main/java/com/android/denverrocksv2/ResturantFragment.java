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

public class ResturantFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.denver_list, container, false);


        ArrayList<DataModel> resturantDataArrayList = new ArrayList<DataModel>();

        resturantDataArrayList.add(new DataModel("MARIA EMPANADA",
                this.getString(R.string.maria_empanada), this.getString(R.string.maria_address), "303.934.2221", R.drawable.empanadas ));

        resturantDataArrayList.add(new DataModel("Olive and Finch",
                this.getString(R.string.olive), this.getString(R.string.olive_address), "303.934.2221", R.drawable.olivefinch ));

        resturantDataArrayList.add(new DataModel("Gurad and Grace",
                this.getString(R.string.guardgrace), this.getString(R.string.guardgrace_address), "303.934.2221", R.drawable.guard_grace ));

        resturantDataArrayList.add(new DataModel("Fruition",
                this.getString(R.string.fruiton), this.getString(R.string.fruiton_address), "303.934.2221", R.drawable.fruition ));

        resturantDataArrayList.add(new DataModel("Bistro",
                this.getString(R.string.bistro), this.getString(R.string.bistro_address), "303.934.2221", R.drawable.bistro ));

        resturantDataArrayList.add(new DataModel("Acorn",
                this.getString(R.string.acron), this.getString(R.string.acron_address), "303.934.2221", R.drawable.acorn ));

        resturantDataArrayList.add(new DataModel("MARIA EMPANADA",
                this.getString(R.string.maria_empanada), this.getString(R.string.maria_address), "303.934.2221", R.drawable.empanadas ));


        EventAdapter resturantAdapter = new EventAdapter(getActivity(), 0, resturantDataArrayList);
        ListView resturantListView = rootView.findViewById(R.id.list);
        resturantListView.setAdapter(resturantAdapter);

        return rootView;
    }
}
