package com.nazim.myapplication.list;

import android.util.Log;
import com.nazim.myapplication.model.Menu;
import com.nazim.myapplication.repository.MenuRepository;
import javax.inject.Inject;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class MenuListPresenter {

    private static final String TAG = "MenuListPresenter";

    private final CompositeSubscription compositeSubscription;
    private MenuRepository menuRepository;

    @Inject
    MenuListPresenter(final MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
        compositeSubscription = new CompositeSubscription();
    }

    void loadData(final MenuListAdapter repoListAdapter) {
        Observable<Menu> repoObservable = menuRepository.getMenus();
        compositeSubscription.add(repoObservable.subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(new Subscriber<Menu>() {
                @Override
                public void onCompleted() {

                }

                @Override
                public void onError(Throwable e) {
                    Log.e(TAG, "Error", e);
                }

                @Override
                public void onNext(Menu menus) {
                    repoListAdapter.setData(menus.getEvents());
                    repoListAdapter.notifyDataSetChanged();
                }
            }));
    }

    void unbind() {
        if (!compositeSubscription.isUnsubscribed()) {
            compositeSubscription.unsubscribe();
        }
    }
}
