package com.lacovid19project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import com.lacovid19project.Adapter.GridAdapter;

public class HealthCareActivity extends AppCompatActivity {


    private GridView Grid_View;

    String[] web = {
            "Category-I",
            "Category-II",
            "Category-III"

    };
    int[] imageId = {
            R.drawable.healthcarecenters,
            R.drawable.healthcarecenters,
            R.drawable.healthcarecenters

    };

    private ImageView Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_care);
        Back = findViewById(R.id.toolbar_icon);

        Grid_View = findViewById(R.id.grid_view);
        GridAdapter adapter = new GridAdapter(HealthCareActivity.this, web, imageId);
        Grid_View.setAdapter(adapter);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Grid_View.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(HealthCareActivity.this, HealthCareListActivity.class);
                        intent0.putExtra("type", "c1");
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(HealthCareActivity.this, HealthCareListActivity.class);
                        intent1.putExtra("type", "c2");
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(HealthCareActivity.this, HealthCareListActivity.class);
                        intent2.putExtra("type", "c3");
                        startActivity(intent2);
                        break;

                }

            }
        });


    }
}