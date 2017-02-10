package dhea.pangestu.listfilm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    private String [] filmTitles = {"The Thor","Harry Potter","Inception",
//            "Will Of Wallstreet","Django Unchained",
//            "Titanic","Captain America","Doctor Strange",
//            "X-Men Apocalypse","Shutter Island"};

    private ArrayList<Movie> movies = new ArrayList<>();

    ListView listView;
    ArrayAdapter<Movie> adapter;
    private void initMovies(){
        movies.add(new Movie("The Thor", "Film tentang super hero Thor yang turun ke bumi",7.5,2001));
        movies.add(new Movie("Harry Potter", "Film Tentang Asrama Penyihir dan Dunia penuh keajaiban",8.5, 2007));
        movies.add(new Movie("Captain America", "Film Tentang Seorang Prajurit America yang Berjiwa Patriot"+
                "yang telah diuji disebuah laboratorium dan hidup muda menjadi seorang pahlawan ",8.3, 2011));
        movies.add(new Movie("Doctor Strange", "Film Tentang SuperHero Berkekuatan magic terkuat dalam marvel",8.5, 2016));
        movies.add(new Movie("The Avanger", "Film Tentang Pahlawan Marvel Bergabung Menjadi Satu",7.8, 2011));
        movies.add(new Movie("Fantastic Beast & where to Find Them", "Film Tentang Petualangan Penyihir Mencari Hewan Langka",8.6, 2016));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMovies();

         adapter = new ArrayAdapter<Movie>(this,
                android.R.layout.simple_list_item_1, movies);
         listView = (ListView) findViewById(R.id.list_film);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int postion, long id){

//                String item = ((TextView)view).getText().toString();
//                Toast.makeText(getBaseContext(), item, Toast.LENGTH_SHORT).show();

               Movie selectedMovie = movies.get(postion);
                Intent intent= new Intent(getBaseContext(), DetailActivity.class);
                intent.putExtra("dhea.pangestu.listfilm", selectedMovie);
                startActivity(intent);
            }
        });

    }
    public void formTambah(View view){
        Intent intent = new Intent(this, tambah.class);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == 1){
            if (resultCode == Activity.RESULT_OK){
                Movie newMovie = (Movie) data.getSerializableExtra("listfilm.result");
                movies.add(newMovie);
                adapter.notifyDataSetChanged();
            }
        }
    }
}
