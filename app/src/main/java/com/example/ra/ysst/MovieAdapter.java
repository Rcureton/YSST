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
        if(currentMovie.getMovieName().equals("ScarFace")){
            movieView.setImageResource(R.drawable.scarface);
        }
        if (currentMovie.getMovieName().equals("Gladiator")){
            movieView.setImageResource(R.drawable.gladiator);
        }
        if(currentMovie.getMovieName().equals("Blood Diamond")){
            movieView.setImageResource(R.drawable.blooddiamond);
        }
        if(currentMovie.getMovieName().equals("Boyz N The Hood")){
            movieView.setImageResource(R.drawable.boyz);
        }
        if(currentMovie.getMovieName().equals("Casino")){
            movieView.setImageResource(R.drawable.casino);
        }
        if(currentMovie.getMovieName().equals("The Godfather")){
            movieView.setImageResource(R.drawable.godfather);
        }
        if(currentMovie.getMovieName().equals("Crash")){
            movieView.setImageResource(R.drawable.crash);
        }
        if(currentMovie.getMovieName().equals("Do The Right Thing")){
            movieView.setImageResource(R.drawable.dothe);
        }
        if(currentMovie.getMovieName().equals("Goodfellas")){
            movieView.setImageResource(R.drawable.goodfellas);
        }
        if(currentMovie.getMovieName().equals("Fight Club")){
            movieView.setImageResource(R.drawable.fightclub);
        }
        if(currentMovie.getMovieName().equals("Inglorius Basterds")){
            movieView.setImageResource(R.drawable.inglorius);
        }
        if(currentMovie.getMovieName().equals("The Matrix")){
            movieView.setImageResource(R.drawable.matrix);
        }
        if(currentMovie.getMovieName().equals("Pulp Fiction")){
            movieView.setImageResource(R.drawable.pulp);
        }
        if(currentMovie.getMovieName().equals("The Departed")){
            movieView.setImageResource(R.drawable.thedeparted);
        }
        if(currentMovie.getMovieName().equals("Training Day")){
            movieView.setImageResource(R.drawable.trainingday);
        }
        if(currentMovie.getMovieName().equals("Straight Out Of Compton")){
            movieView.setImageResource(R.drawable.straightouttacompton);
        }
        if(currentMovie.getMovieName().equals("Star Wars: A New Hope")){
            movieView.setImageResource(R.drawable.starwars);
        }
        if(currentMovie.getMovieName().equals("The Shawshank Redemption")){
            movieView.setImageResource(R.drawable.shawshankr);
        }
        if(currentMovie.getMovieName().equals("Rocky")){
            movieView.setImageResource(R.drawable.rocky);
        }

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
