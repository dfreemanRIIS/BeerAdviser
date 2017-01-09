package com.example.dfreeman.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import java.util.List;

public class FindBeerActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view){
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner)findViewById(R.id.color);

        //Get selects color
        String beerType = String.valueOf(color.getSelectedItem());

        //Display results
        List<String> brandList = expert.getBrands(beerType);
        StringBuilder brands2 = new StringBuilder();
        for (String brand: brandList) {
            brands2.append(brand).append('\n');
        }

        brands.setText(brands2);

    }
}
