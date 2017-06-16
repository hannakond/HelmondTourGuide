package com.example.android.helmondtourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        final ArrayList<Places> places = new ArrayList<Places>();

        places.add(new Places(getString(R.string.restaurant1), getString(R.string.eat_info1), getString(R.string.reasonable), R.drawable.onsloes));
        places.add(new Places(getString(R.string.restaurant2), getString(R.string.eat_info2), getString(R.string.expensive), R.drawable.kasteelport));
        places.add(new Places(getString(R.string.restaurant3), getString(R.string.eat_info3), getString(R.string.expensive), R.drawable.detraverse));
        places.add(new Places(getString(R.string.restaurant4), getString(R.string.eat_info4), getString(R.string.cheap), R.drawable.ilborgo));

        PlacesAdapter adapter = new PlacesAdapter(this, places, R.color.rest_act);

        ListView listView = (ListView) findViewById(R.id.list);

        ImageView categoryImage = (ImageView) findViewById(R.id.category_image_view);
        categoryImage.setImageResource(R.drawable.food);

        listView.setAdapter(adapter);
    }
}
