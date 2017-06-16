package com.example.android.helmondtourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        final ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places(getString(R.string.attraction1), getString(R.string.go_info1), R.drawable.castle));
        places.add(new Places(getString(R.string.attraction2), getString(R.string.go_info2), R.drawable.theatre));
        places.add(new Places(getString(R.string.attraction3), getString(R.string.go_info3), R.drawable.warandeprk));
        places.add(new Places(getString(R.string.attraction4), getString(R.string.go_info4), R.drawable.museum));
        places.add(new Places(getString(R.string.attraction5), getString(R.string.go_info5), R.drawable.church));

        PlacesAdapter adapter = new PlacesAdapter(this, places, R.color.attr_act);

        ListView listView = (ListView) findViewById(R.id.list);

        ImageView categoryImage = (ImageView) findViewById(R.id.category_image_view);
        categoryImage.setImageResource(R.drawable.attractions1);

        listView.setAdapter(adapter);
    }
}
