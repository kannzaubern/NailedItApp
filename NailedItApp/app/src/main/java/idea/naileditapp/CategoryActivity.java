package idea.naileditapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import it.sephiroth.android.library.widget.HListView;

public class CategoryActivity extends Activity implements AdapterView.OnItemClickListener {

    private List<String> categories = new ArrayList<String>();
    private List<Integer> ids = new ArrayList<Integer>();
    private HListView horizontalListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_activity);
        categories.add("Animals");
        categories.add("pantomime");
        categories.add("Acting it out");
        categories.add("Movies");
        categories.add("Accents");
        categories.add("Books");
        categories.add("Tv Series");
        categories.add("Animals");
        categories.add("Celebrities");
        categories.add("Acting it out");
        categories.add("Movies");
        categories.add("Accents");
        categories.add("Books");
        categories.add("Tv Series");
        categories.add("Animals");
        categories.add("Celebrities");
        categories.add("Acting it out");
        categories.add("Movies");
        categories.add("Accents");
        categories.add("Books");
        categories.add("Tv Series");
        categories.add("Animals");
        categories.add("Celebrities");
        categories.add("Acting it out");
        categories.add("Movies");
        categories.add("Accents");
        categories.add("Books");
        categories.add("Tv Series");
        categories.add("Animals");
        categories.add("Celebrities");
        categories.add("Acting it out");
        categories.add("Movies");
        categories.add("Accents");
        categories.add("Books");
        categories.add("Tv Series");
        categories.add("Animals");
        categories.add("Celebrities");
        categories.add("Acting it out");
        categories.add("Movies");
        categories.add("Accents");
        categories.add("Books");
        categories.add("Tv Series");
        categories.add("Animals");
        categories.add("Celebrities");
        categories.add("Acting it out");
        categories.add("Movies");
        categories.add("Accents");
        categories.add("Books");
        categories.add("Tv Series");
        ids.add(R.drawable.pantomime);
        ids.add(R.drawable.stars);
        ids.add(R.drawable.akzente);
        horizontalListView = (HListView) findViewById(R.id.grid_view);
        horizontalListView.setAdapter(new CategoryAdapter(this, ids));
        // horizontalListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            Intent intent = new Intent(this, GameActivity.class);
            intent.putExtra("listId", R.array.animals);
            startActivity(intent);


        } else if (position == 1) {
            Intent intent = new Intent(this, GameActivity.class);
            intent.putExtra("listId", R.array.pantomime);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Sorry this isn't working right now, try animals or pantomime :)", Toast.LENGTH_SHORT).show();
        }
    }
    public void selectOnClick(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("listId", R.array.pantomime);
        startActivity(intent);
    }
}

