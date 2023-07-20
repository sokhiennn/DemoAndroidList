package sg.edu.rp.c346.id22013179.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //step 2: declare a field for the listview
    ListView listView;

    ArrayList<AndroidVersion> items = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 3: link the field to the UI element
        listView = findViewById(R.id.listView);

        // set up the contents of the ArrayList
        //items.add("Pie - 9.0");
        //items.add("Oreo - 8.0 - 8.1");
        //items.add("Nougat - 7.0 - 7.1.2");

        items.add(new AndroidVersion("Pie","9.0"));
        items.add(new AndroidVersion("Oreo","8.0 - 8.1"));
        items.add(new AndroidVersion("Nougat","7.0 - 7.1.2"));

        //step 4 : create the array adapter
        CustomAdapter adapter = new CustomAdapter(this,R.layout.row,items);

        // ArrayAdapter<AndroidVersion> adapter = new ArrayAdapter<AndroidVersion>(this, android.R.layout.simple_list_item_1, items);
        // step 5: link the adapter to the list view
        listView.setAdapter(adapter);
    }
}

