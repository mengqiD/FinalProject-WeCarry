package mengqi.finalproject_wecarry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    public boolean fly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void SearchGoods(View view) {
        fly = true;
        Intent intent = new Intent(HomeActivity.this, SearchGoods.class);
        startActivity(intent);
    }

    public void SearchFlight(View view) {
        fly = false;
        Intent intent = new Intent(HomeActivity.this, SearchFlight.class);
        startActivity(intent);
    }
}
