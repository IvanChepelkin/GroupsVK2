package com.example.groupsvk.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.groupsvk.R;
import com.example.groupsvk.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements IView{
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this);
        presenter.loadDataFromServer();
    }
}
