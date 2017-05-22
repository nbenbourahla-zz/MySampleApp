package com.nazim.myapplication.list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.nazim.myapplication.R;
import com.nazim.myapplication.common.ImageLoader;
import com.nazim.myapplication.model.Event;
import com.nazim.myapplication.model.User;
import java.util.List;

class MenuListAdapter extends RecyclerView.Adapter<MenuListAdapter.ViewHolder> {

    private List<Event> events;
    private final Context context;
    private final ImageLoader imageLoader;

    MenuListAdapter(@NonNull final Context context, @NonNull final ImageLoader imageLoader) {
        this.context = context;
        this.imageLoader = imageLoader;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView menuImg;
        ImageView userAvatar;
        TextView menuTitle;
        TextView userName;
        RatingBar userRating;
        TextView price;

        ViewHolder(View view) {
            super(view);
            menuImg = (ImageView) view.findViewById(R.id.menu_img);
            userAvatar = (ImageView) view.findViewById(R.id.user_avatar);
            menuTitle = (TextView) view.findViewById(R.id.event_name);
            userName = (TextView) view.findViewById(R.id.user_name);
            userRating = (RatingBar) view.findViewById(R.id.user_rating);
            userRating.setNumStars(5);
            userRating.setStepSize(0.5f);
            price = (TextView) view.findViewById(R.id.price);
        }
    }

    public void setData(List<Event> repos) {
        this.events = repos;
    }

    @Override
    public MenuListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuListAdapter.ViewHolder holder, int position) {
        final Event event = events.get(position);
        final User user = event.getUser();
        imageLoader.loadImageInto(context, event.getCover().getPath(), holder.menuImg, R.mipmap.ic_launcher);
        imageLoader.loadImageInto(context, event.getUser().getAvatar().getPath(), holder.userAvatar,
            R.mipmap.ic_launcher);
        holder.menuTitle.setText(event.getTitle());
        holder.userName.setText(user.getFirstname());
        holder.userRating.setRating(user.getRating().getScore());
        holder.price.setText(event.getPrice() + " " + event.getCurrency().getSymbol());
    }

    @Override
    public int getItemCount() {
        if (events != null) return events.size();
        return 0;
    }
}
