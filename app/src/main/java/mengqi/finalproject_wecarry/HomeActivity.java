package mengqi.finalproject_wecarry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void SearchGoods(View view) {
        Intent intent = new Intent(HomeActivity.this, SearchGoods.class);
        startActivity(intent);
    }

    public void SearchFlight(View view) {
        Intent intent = new Intent(HomeActivity.this, SearchFlight.class);
        startActivity(intent);
    }
}
