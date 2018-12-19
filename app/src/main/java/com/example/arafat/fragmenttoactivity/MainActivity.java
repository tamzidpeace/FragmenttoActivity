package com.example.arafat.fragmenttoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text1, text2;
    private FragmentA fragmentA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text);
        text2 = findViewById(R.id.text2);

        fragmentA = new FragmentA();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,fragmentA)
                .commit();

    }

    public void sendInformation(String country_name, String capital) {

        text1.setText(country_name);
        text2.setText(capital);
    }
}
