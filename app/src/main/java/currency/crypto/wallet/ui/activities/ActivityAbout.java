package currency.crypto.wallet.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import currency.crypto.wallet.R;

public class ActivityAbout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
