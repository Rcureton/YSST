package com.example.ra.ysst;

import android.graphics.drawable.Drawable;
import android.media.Image;

/**
 * Created by Ra on 1/31/16.
 */
public class MoviesList {

    public static MoviesList instance;

    private String mMovieName;
    private double mMovieRating;
    private String mMovieTime;
    private String mMovieDescription;
    private String mMovieYear;


    public MoviesList(String movieName, double movieRating, String movieTime, String movieDescription, String year){
        mMovieName=movieName;
        mMovieRating= movieRating;
        mMovieTime= movieTime;
        mMovieDescription= movieDescription;
        mMovieYear= year;




    }

    public String getMovieName() {
        return mMovieName;
    }

    public void setMovieName(String mMovieName) {
        this.mMovieName = mMovieName;
    }

    public double getMovieRating() {
        return mMovieRating;
    }

    public void setMovieRating(double mMovieRating) {
        this.mMovieRating = mMovieRating;
    }

    public String getMovieTime() {
        return mMovieTime;
    }

    public void setMovieTime(String mMovieTime) {
        this.mMovieTime = mMovieTime;
    }

    public String getMovieDescription() {
        return mMovieDescription;
    }

    public void setMovieDescription(String mMovieDescription) {
        this.mMovieDescription = mMovieDescription;
    }

    public String getMovieYear() {
        return mMovieYear;
    }

    public void setMovieYear(String mMovieYear) {
        this.mMovieYear = mMovieYear;
    }

    @Override
    public String toString(){return mMovieName;}
}
