package com.example.kuwako.rsskuwako;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kuwako on 2016/08/01.
 */
public class RssListAdapter extends ArrayAdapter<Item>{
    private LayoutInflater mInflater;
    private TextView mTitle;
    private TextView mBody;

    public RssListAdapter(Context context, List<Item> itemlist) {
        super(context, 0, itemlist);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = converView;

        if (converView == null) {
            view = mInflater.inflate(R.layout.item_row, parent);
        }

        Item item = this.getItem(position);
        if (item != null) {
            mTitle = (TextView) view.findViewById(R.id.itemTitle);
            mTitle.setText(item.getTitle());
            mBody = (TextView) view.findViewById(R.id.itemBody);
            mBody.setText(item.getBody());
        }

        return view;
    }
}
