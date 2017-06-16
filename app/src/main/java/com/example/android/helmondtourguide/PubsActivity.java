package com.example.android.helmondtourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class PubsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        final ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places(getString(R.string.pub1), getString(R.string.see_info1), getString(R.string.expensive),R.drawable.muziekcafe));
        places.add(new Places(getString(R.string.pub2), getString(R.string.see_info2), getString(R.string.expensive),R.drawable.lokaal42));
        places.add(new Places(getString(R.string.pub3), getString(R.string.see_info3), getString(R.string.cheap),R.drawable.zusje));
        places.add(new Places(getString(R.string.pub4), getString(R.string.see_info4), getString(R.string.reasonable),R.drawable.bonneville));

        PlacesAdapter adapter = new PlacesAdapter(this, places, R.color.pub_act);

        ListView listView = (ListView) findViewById(R.id.list);

        ImageView categoryImage = (ImageView) findViewById(R.id.category_image_view);
        categoryImage.setImageResource(R.drawable.pubs);

        listView.setAdapter(adapter);
    }
}
