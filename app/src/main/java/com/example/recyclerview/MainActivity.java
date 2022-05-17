package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //created object of recycler view
        RecyclerView programingList=findViewById(R.id.recyclerView);
        //we have to set layout our view so that recycler view know hoe to position data
        programingList.setLayoutManager(new LinearLayoutManager(this));
        //this is our data part where we have added data to array and then we pass this data to adapter
        String[] languge={"1","b","c","d","r","f","g","h","d","s","s","s","sd","ds"};
        //basic job of adapter is convert data so it will show to our recycler view
        programingList.setAdapter(new addAdapter(languge));

    }
}