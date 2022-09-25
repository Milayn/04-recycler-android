package jti.polinema.ac.id.a04androidrecyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    String[] subjects = {
            "List 1", "List 2", "List 3", "List 5",
            "List 6", "List 7", "List 8", "List 9",
            "List 10", "List 11", "List 12", "List 13",
            "List 14", "List 15", "List 16", "List 17",
            "List 18", "List 19", "List 20", "List 21",
            "List 22", "List 23", "List 24", "List 25",
            "List 26", "List 27", "List 28", "List 29",
            "List 30", "List 31", "List 32", "List 33",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        recyclerView = findViewById(R.id.recyclerView);
        recylerViewLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerViewAdapter = new AdapterRecyclerView(context, subjects);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}