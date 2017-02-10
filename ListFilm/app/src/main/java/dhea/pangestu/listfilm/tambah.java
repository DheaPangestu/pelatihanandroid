package dhea.pangestu.listfilm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class tambah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        String [] rating = {"5.5","6.0","6.5","7.0","7.5","8.0","8.5","9.0","9.5"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);

        Spinner spinner = (Spinner) findViewById(R.id.spin_rating);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.pil_rating, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void addFilm(View view){
        String title = ((EditText) findViewById(R.id.txt_title)).getText().toString();
        int year = Integer.parseInt(((EditText) findViewById(R.id.txt_year)).getText().toString());
        double rating = Double.parseDouble(((Spinner) findViewById(R.id.spin_rating)).getSelectedItem().toString());
        String descpription = ((EditText) findViewById(R.id.txt_description)).getText().toString();

        Movie movie = new Movie(title, descpription, rating, year);

        Intent intent = new Intent();
        intent.putExtra("listfilm.result", movie);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
