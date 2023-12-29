package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PAdapter.ItemSelected {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager manager;
    RecyclerView.Adapter myAdapter;

    ArrayList<P> pr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        // Use GridLayoutManager for a grid view with 2 columns (you can change this)
        manager = new GridLayoutManager(this, 2); // Change 2 to the number of columns you want
        recyclerView.setLayoutManager(manager);

        pr = new ArrayList<>();
        pr.add(new P("laptop bag", "black RS1000", "lp"));
        pr.add(new P("shoes", "blue RS1599", "s"));
        pr.add(new P("earbuds", "black RS1299", "eb"));
        pr.add(new P("Headphones", "black RS1100", "h"));
        pr.add(new P("laptop bag", "black RS1000", "lp"));
        pr.add(new P("shoes", "blue RS1599", "s"));
        pr.add(new P("earbuds", "black RS1299", "eb"));
        pr.add(new P("Headphones", "black RS1100", "h"));
        pr.add(new P("laptop bag", "black RS1000", "lp"));
        pr.add(new P("shoes", "blue RS1599", "s"));
        pr.add(new P("earbuds", "black RS1299", "eb"));
        pr.add(new P("Headphones", "black RS1100", "h"));











        myAdapter = new PAdapter(this, pr);
        recyclerView.setAdapter(myAdapter);
    }

    @Override
    public void onItemClicked(int index) {
        Toast.makeText(this, pr.get(index).getName(), Toast.LENGTH_SHORT).show();
    }
}
