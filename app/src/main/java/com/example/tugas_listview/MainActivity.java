package com.example.tugas_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    int[] iconList = new int[]{
            R.drawable.figma, R.drawable.adobe_xd, R.drawable.sketch, R.drawable.framer,
            R.drawable.android, R.drawable.apple, R.drawable.windows,
            R.drawable.opera, R.drawable.firefox, R.drawable.safari, R.drawable.edge,
            R.drawable.paypal, R.drawable.mastercard, R.drawable.visa,
            R.drawable.bitcoin, R.drawable.ethereum
    };

    String[] Headline = {
            "Figma", "Adobe XD", "Sketch", "Framer",
            "Android", "iOS", "Windows",
            "Opera", "Mozilla", "Safari", "Edge",
            "Paypal", "Mastercard", "Visa",
            "Bitcoin", "Ethereum"
    };

    String[] Subhead = {
            "UI Design App", "UI Design App", "UI Design App", "UI Design App",
            "Operating System", "Operating System", "Operating System",
            "Browser App", "Browser App", "Browser App", "Browser App",
            "Payment Method", "Payment Method", "Payment Method",
            "Cryptocurrency", "Cryptocurrency"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.list);
        ListAdapter listAdapter = new ListAdapter(this, iconList, Headline, Subhead);
        lv.setAdapter(listAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),
                        "You Choose : " + Headline[position],
                        Toast.LENGTH_SHORT).show();

            }
        });

    }


}