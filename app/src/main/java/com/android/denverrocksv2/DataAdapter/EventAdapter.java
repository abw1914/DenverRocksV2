package com.android.denverrocksv2.DataAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.denverrocksv2.Data.DataModel;
import com.android.denverrocksv2.R;

import java.util.ArrayList;

public class EventAdapter extends ArrayAdapter<DataModel> {


    public EventAdapter(@NonNull Context context, int resource, ArrayList<DataModel> dataModelArrayList) {
        super(context, resource, 0, dataModelArrayList);

    }
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View funListView = convertView;

                if(funListView == null) {
                    funListView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
                }


                DataModel dataModel = getItem(position);

                TextView funName = funListView.findViewById(R.id.name);
                funName.setText(dataModel.getDescription());

                TextView funRanking = funListView.findViewById(R.id.ranking);
                funRanking.setText(dataModel.getRanking());

                TextView funLocalPick = funListView.findViewById(R.id.local_pick);
                funLocalPick.setText(dataModel.getLocalPick());

                TextView funDescription = funListView.findViewById(R.id.description);
                funDescription.setText(dataModel.getDescription());

                TextView funEventType = funListView.findViewById(R.id.eventType);
                funEventType.setText(dataModel.getEventType());

                TextView funTime = funListView.findViewById(R.id.time_required);
                funTime.setText(dataModel.getTime());

                ImageView funImage = funListView.findViewById(R.id.image);
                funImage.setImageResource(dataModel.getImageResourceId());

                if(dataModel.hasImage()) {
                    funImage.setImageResource(dataModel.getImageResourceId());
                    funImage.setVisibility(View.VISIBLE);
                } else {
                    funImage.setVisibility(View.INVISIBLE);
                }


                return funListView;
    }
}
