package com.twigtotree.lingayatmatrimony.auth;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.quickstart.auth.R;

/**
 * Created by sgoud1 on 7/6/16.
 */

public class PersonalInfoAdapter extends RecyclerView.Adapter<PersonalInfoAdapter.ViewHolder> {
    private String[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public PersonalInfoAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public PersonalInfoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,

                                                   int viewType) {
        parent.removeAllViews();
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.personal_info_card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters


        TextView t = (TextView) v.findViewById(R.id.info_text);
        ViewHolder vh = new ViewHolder(t);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mTextView.setText(mDataset[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}

