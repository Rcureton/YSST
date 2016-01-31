package com.example.ra.ysst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mListView;
    TextView mTextView;
    ArrayList<MoviesList> mMovieMainList;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView=(ListView)findViewById(R.id.listView);
        mTextView=(TextView)findViewById(R.id.textView);

        populateMovie();



        MovieAdapter adapter= new MovieAdapter(MainActivity.this,mMovieMainList);

        mListView.setAdapter(adapter);}





    private void populateMovie() {

        if (mMovieMainList == null) {
            mMovieMainList = new ArrayList<MoviesList>();

        }

        MoviesList movie1 = new MoviesList("ScarFace", 8.3, "2 Hrs 45Mins", "In 1980 Miami, a determined Cuban immigrant takes over a drug cartel while succumbing to greed.", "1983");
        MoviesList movie2 = new MoviesList("The Godfather", 9.3, "2Hrs 55Mins", "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.", "1972");
        MoviesList movie3 = new MoviesList("The Shawshank Redemption", 9.4, "2Hrs 22Mins", "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.", "1994");
        MoviesList movie4 = new MoviesList("Pulp Fiction", 8.9, "2Hrs 24Mins", "The lives of two mob hit men, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption.", "1994");
        MoviesList movie5 = new MoviesList("Fight Club", 8.9, "2Hrs 19Mins", "An insomniac office worker, looking for a way to change his life, crosses paths with a devil-may-care soap maker, forming an underground fight club that evolves into something much, much more..", "1999");
        MoviesList movie6 = new MoviesList("Forrest Gump", 8.9, "2Hrs, 22Mins", "Forrest Gump, while not intelligent, has accidentally been present at many historic moments, but his true love, Jenny Curran, eludes him.", "1994");
        MoviesList movie7 = new MoviesList("GoodFellas", 8.7, "2Hrs 26Mins", "Henry Hill and his friends work their way up through the mob hierarchy.", "1990");
        MoviesList movie8 = new MoviesList("The Matrix", 8.7, "2Hrs 16Mins", "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.", "1999");
        MoviesList movie9 = new MoviesList("Training Day", 7.7, "2Hrs 2Mins", "On his first day on the job as a Los Angeles narcotics officer, a rookie cop goes on a 24-hour training course with a rogue detective who isn't what he appears.", "2001");
        MoviesList movie10 = new MoviesList("Gladiator", 8.5, "2Hrs 35Mins", "When a Roman general is betrayed and his family murdered by an emperor's corrupt son, he comes to Rome as a gladiator to seek revenge.", "2000");
        MoviesList movie11 = new MoviesList("The Departed", 8.5, "2Hrs 31Mins", "An undercover cop and a mole in the police attempt to identify each other while infiltrating an Irish gang in South Boston.", "2006");
        MoviesList movie12 = new MoviesList("Inglorius Basterds", 8.3, "2Hrs 32Mins", "In Nazi-occupied France during World War II, a plan to assassinate Nazi leaders by a group of Jewish U.S. soldiers coincides with a theatre owner's vengeful plans for the same.", "2009");
        MoviesList movie13 = new MoviesList("Casino", 8.2, "2Hrs 58Mins", "Greed, deception, money, power, and murder occur between two mobster best friends and a trophy wife over a gambling empire.", "1995");
        MoviesList movie14 = new MoviesList("Blood Diamond", 8.0, "2Hrs 23Mins", "A fisherman, a smuggler, and a syndicate of businessmen match wits over the possession of a priceless diamond.", "2006");
        MoviesList movie15 = new MoviesList("Do The Right Thing", 7.9, "2Hrs", "On the hottest day of the year on a street in the Bedford-Stuyvesant section of Brooklyn, everyone's hate and bigotry smolders and builds until it explodes into violence.", "1989");
        MoviesList movie16 = new MoviesList("Straight Out Of Compton", 8.0, "2Hrs 37Mins", "The group NWA emerges from the mean streets of Compton in Los Angeles, California, in the mid-1980s and revolutionizes Hip Hop culture with their music and tales about life in the hood.", "2015");
        MoviesList movie17 = new MoviesList("Boyz n The Hood", 7.8, "1Hr 52Mins", "Follows the lives of three young males living in the Crenshaw ghetto of Los Angeles, dissecting questions of race, relationships, violence and future prospects", "1989");
        MoviesList movie18 = new MoviesList("Star Wars: A New Hope", 8.7, "2Hr 1Min", "Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a wookiee and two droids to save the galaxy from the Empire's world-destroying battle-station, while also attempting to rescue Princess Leia from the evil Darth Vader.", "1977");
        MoviesList movie19 = new MoviesList("Rocky", 8.1, "2Hr", "Rocky Balboa, a small-time boxer, gets a supremely rare chance to fight the heavy-weight champion, Apollo Creed, in a bout in which he strives to go the distance for his self-respect.", "1976");
        MoviesList movie20 = new MoviesList("Crash", 7.9, "1Hr 52Mins", "Los Angeles citizens with vastly separate lives collide in interweaving stories of race, loss and redemption.", "2004");

        mMovieMainList.add(movie1);
        mMovieMainList.add(movie2);
        mMovieMainList.add(movie3);
        mMovieMainList.add(movie4);
        mMovieMainList.add(movie5);
        mMovieMainList.add(movie6);
        mMovieMainList.add(movie7);
        mMovieMainList.add(movie8);
        mMovieMainList.add(movie9);
        mMovieMainList.add(movie10);
        mMovieMainList.add(movie11);
        mMovieMainList.add(movie12);
        mMovieMainList.add(movie13);
        mMovieMainList.add(movie14);
        mMovieMainList.add(movie15);
        mMovieMainList.add(movie16);
        mMovieMainList.add(movie17);
        mMovieMainList.add(movie18);
        mMovieMainList.add(movie19);
        mMovieMainList.add(movie20);
    }





    }




