package com.codepath.tajoirial.simpletodo;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> items;
    Button btnAdd;
    EditText etItem;
    RecyclerView rvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        etItem = findViewById(R.id.etItem);
        rvItems = findViewById(R.id.rvItems);

        etItem.setText(text)

        items = new ArrayList<>();
        items.add("Buy Milk");
        items.add("Go to the gym");
        items.add("Have fun!");

        ItemsAdapter itemsAdapter = new ItemsAdapter(items);
        rvItems.setAdapter(itemAdapter);
        rvItems.setLayoutManager( context: this));
btnAdd.setOnClickListener(new View.OnclickListener() {
    @Override
public void onClick(View c) {
    String todoItem = etItem.getText().toString();
    //Add item to the model
        items.add(todoitem);
        //notify adapter that an item is inserted
        itemsAdapter.notifyItemInserted( postion: item.size() - 1);
        etItem.setText("");
        Toast.makeText(getApplicationCOntext(), text: "Item was added", Toast.LENGTH_SHORT).show();
    }
});

    }
}