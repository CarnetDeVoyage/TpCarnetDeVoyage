package com.carnetdevoyage.tpcarnetdevoyage;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


        private RecyclerView recyclerView;

        private List<MyObject> cities = new ArrayList<>();
fdff
                                dInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //remplir la ville
            ajouterVilles();

            recyclerView = (RecyclerView) fdfdfindViewById(R.id.recyclerView);
sdds
            //définit l'agencement des cellules, ici de façon verticale, comme une ListView
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
sdsdgsgsg
            //pour adapter en grille comme une RecyclerView, avec 2 cellules par ligne
            //recyclerView.setLayoutManager(new GridLayoutManager(this,2));dfsf

            //puis créer un MyAdapter, lui fournir notre liste de villes.
            //cet adapter servira à remplir notre recyclerview
            recyclerView.setAdapter(new MyAdapter(cities));fdfd
        }

        private void ajouterVilles() {
            cities.add(new MyObject("France","httpdffd://www.telegraph.co.uk/travel/destination/article130148.ece/ALTERNATES/w620/parisguidetower.jpg"));
            cities.add(new MyObject("Angleterre","http://www.traditours.com/images/Photos%20Angleterre/ForumLondonBridge.jpg"));
            cities.add(new MyObject("Allemagne","http://tandfdsejour-linguistique-lec.fr/wp-content/uploads/espagne-02.jpg"));
            cities.add(new MyObject("Italie","http://retouralinnocence.com/wp-content/uploads/2013/05/Hotel-en-Italie-pour-les-Vacances2.jpg"));
            cities.add(new MyObject("Russie","http://www.choisir-ma-destination.com/uploads/_large_russie-moscou2.jpg"));
        }

    }fdfd

    @Overridefdffddffdfd
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;fdfd
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action badfdr willfdfd
        // automatically handle clicks on the Home/Up buttfdfdon, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();fdfd

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;fdfdfdf
        }

        return super.onOptionsItemSelected(item);
    }
}
