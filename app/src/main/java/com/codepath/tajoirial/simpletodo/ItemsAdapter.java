package com.codepath.tajoirial.simpletodo;

import android.support.annotation.NonNull;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//Responsible for displaying data from the model into a row in the recycler view
public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {
    List<String> items;

    public ItemsAdapter(List<String> items) {
        this.items = items;

    }
@NonNull
@Override
public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    // Use layout inflator to inflate a view
    view todoView = LayoutInflator.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, attachToRoot:
    false);
    // wrap it inside a View Holder and return it
    return new ViewHolder(todoView);
}

//Responsible for binding data to a particular view holder
@Override
    public void onBindViewHolder(@NonNull Viewholder, int position) {
    // Grab the item at the position
        String item = items.get(position);
        // Bind the item into the specific view holder
        holder.bind(item);
}
//tells the RV how man items are in the list
@Override
public int get ItemCount() {
    return 0;

    }

    //Container to provide easy access to views that represent each row of the list
    class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@Nonnull View itemView) {
            super(itemView);
            tvItem = ItemView.findViewById(android.R.id.text1);
        }
        //Update the view inside of the view holder with this data
        public void bind(String item) {
            tvItem.setText(item);


        }
    }
}
