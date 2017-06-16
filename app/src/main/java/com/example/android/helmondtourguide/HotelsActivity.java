package com.example.android.helmondtourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        final ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places(getString(R.string.hotel1), getString(R.string.sleep_info1), getString(R.string.reasonable), R.drawable.hampshire));
        places.add(new Places(getString(R.string.hotel2), getString(R.string.sleep_info2), getString(R.string.expensive), R.drawable.stlambert));
        places.add(new Places(getString(R.string.hotel3), getString(R.string.sleep_info3), getString(R.string.expensive), R.drawable.goldentulip));

        PlacesAdapter adapter = new PlacesAdapter(this, places, R.color.hotels_act);

        ListView listView = (ListView) findViewById(R.id.list);

        ImageView categoryImage = (ImageView) findViewById(R.id.category_image_view);
        categoryImage.setImageResource(R.drawable.hotels);

        listView.setAdapter(adapter);
    }
}
