package id.giansar.example;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);

        if (findViewById(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {
                return;
            }
        }

        WelcomeFragment welcomeFragment = new WelcomeFragment();
        getFragmentManager().beginTransaction().add(R.id.fragment_container, welcomeFragment).commit();
    }
}
