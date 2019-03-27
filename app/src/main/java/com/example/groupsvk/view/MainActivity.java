package com.example.groupsvk.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.groupsvk.R;
import com.example.groupsvk.model.models.Item;
import com.example.groupsvk.model.network.Interactor;
import com.example.groupsvk.presenter.Presenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IView, View.OnClickListener {
    private Presenter presenter;
    private RecyclerView recViewGroups;
    private EditText chooseGroups;
    private Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this, new Interactor());
        initViews();
    }

        private void initViews() {
            chooseGroups = findViewById(R.id.choose_groups);
            search = findViewById(R.id.click_to_search);
            recViewGroups = findViewById(R.id.recView);
            search.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        presenter.loadDataFromServer(chooseGroups.getText().toString());
    }

    @Override
    public void setGroupsForView(List<Item> groupsList) {
        recViewGroups.setLayoutManager(new LinearLayoutManager(this));
        recViewGroups.setHasFixedSize(false);
        GroupsAdapter groupsAdapter = new GroupsAdapter(groupsList);
        recViewGroups.setAdapter(groupsAdapter);

    }
}
