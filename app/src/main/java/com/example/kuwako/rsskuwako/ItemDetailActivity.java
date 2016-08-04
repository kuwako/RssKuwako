package com.example.kuwako.rsskuwako;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ItemDetailActivity extends AppCompatActivity {

    private TextView mTitle;
    private TextView mBody;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        Intent intent = getIntent();

        String title = intent.getStringExtra("title");
        mTitle = (TextView) findViewById(R.id.item_detail_title);
        mTitle.setText(title);
        String body = intent.getStringExtra("body");
        mBody = (TextView) findViewById(R.id.item_detail_body);
        mBody.setText(body);
    }
}

