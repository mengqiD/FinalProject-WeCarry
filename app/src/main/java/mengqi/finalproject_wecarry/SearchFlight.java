package mengqi.finalproject_wecarry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SearchFlight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_flight);
        setTitle("Carry Me");
    }

    public void SearchResult(View view) {
        Intent intent = new Intent(SearchFlight.this, SearchResult.class);
        startActivity(intent);
    }
}