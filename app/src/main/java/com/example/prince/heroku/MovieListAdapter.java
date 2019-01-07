package com.example.prince.heroku;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder> {

    List<Movies> dataset;
    private ArrayList<Movies> arrayList;

    public MovieListAdapter(List<Movies> dataset) {
        this.dataset = dataset;
        this.arrayList = new ArrayList<Movies>();
        this.arrayList.addAll(dataset);

    }

    @NonNull
    @Override
    public MovieListAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
        MovieViewHolder cvh = new MovieViewHolder(v);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieListAdapter.MovieViewHolder holder, int position) {
        final Movies movie = dataset.get(position);

        String imgURL = movie.getPoster();
        Picasso.get().load(imgURL).fit().into((ImageView) holder.img.findViewById(R.id.movie_img));
        holder.title.setText(movie.getTitle());
        holder.year.setText(movie.getYear());
    }

    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        dataset.clear();

        if (charText.length() == 0) {
            dataset.addAll(arrayList);
        }
        else {
            for (Movies movie : arrayList) {

                String movieGenre  = movie.getGenre().toLowerCase();
                String movieTitle  = movie.getTitle().toLowerCase();

                if(movieTitle.contains(charText) || movieGenre.contains(charText)){
                    dataset.add(movie);
                }

            }
        }

        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }


    class MovieViewHolder extends RecyclerView.ViewHolder{
        View layout;
        ImageView img;
        TextView title, year;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.root_view);
            img = itemView.findViewById(R.id.movie_img);
            title = itemView.findViewById(R.id.movies_title);
            year = itemView.findViewById(R.id.movies_year);
        }
    }
}
