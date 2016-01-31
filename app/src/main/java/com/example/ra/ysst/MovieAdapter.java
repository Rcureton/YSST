package com.example.ra.ysst;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ra on 1/31/16.
 */
public class MovieAdapter extends ArrayAdapter<MoviesList> {

    ArrayList<MoviesList> mMovieArrayList;


    public MovieAdapter(Context context, ArrayList<MoviesList> movieList){
        super(context, -1);
        mMovieArrayList= new ArrayList<MoviesList>();
        mMovieArrayList=movieList;


        mMovieArrayList.addAll(movieList);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context= getContext();


        LayoutInflater inflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View currentMovieView= inflater.inflate(R.layout.movies_adapter,parent, false);

        ImageView movieView= (ImageView)currentMovieView.findViewById(R.id.imageView);

        TextView movieName= (TextView)currentMovieView.findViewById(R.id.movieName);
        TextView movieRating= (TextView)currentMovieView.findViewById(R.id.movieRating);
        TextView movieTime= (TextView)currentMovieView.findViewById(R.id.movieTime);
        TextView movieDescription= (TextView)currentMovieView.findViewById(R.id.movieDescription);
        TextView movieYear= (TextView)currentMovieView.findViewById(R.id.movieYear);

        MoviesList currentMovie= mMovieArrayList.get(position);
        movieName.setText(currentMovie.getMovieName());
        movieRating.setText(Double.toString(currentMovie.getMovieRating()));
        movieTime.setText(currentMovie.getMovieTime());
        movieDescription.setText(currentMovie.getMovieDescription());
        movieYear.setText(currentMovie.getMovieYear());

        return currentMovieView;
    }

    @Override
    public int getCount() {
        return mMovieArrayList.size();

    }
}
