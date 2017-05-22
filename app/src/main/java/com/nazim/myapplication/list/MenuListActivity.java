package com.nazim.myapplication.list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.nazim.myapplication.R;
import com.nazim.myapplication.common.ImageLoader;
import com.nazim.myapplication.repository.MenuRepository;
import javax.inject.Inject;

public class MenuListActivity extends AppCompatActivity {

    @Inject MenuRepository menuRepository;
    private MenuListAdapter repoListAdapter;
    @Inject MenuListPresenter repoListPresenter;
    @Inject ImageLoader imageLoader;

    @BindView(R.id.recycler_view) RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        MenuListComponent component = DaggerMenuListComponent.builder().build();
        component.inject(this);

        initView();

        repoListPresenter.loadData(repoListAdapter);
    }

    private void initView() {
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        repoListAdapter = new MenuListAdapter(this, imageLoader);
        recyclerView.setAdapter(repoListAdapter);
    }

    @Override
    protected void onDestroy() {
        repoListPresenter.unbind();
        super.onDestroy();
    }
}
