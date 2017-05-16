package ng.com.techdepo.customspinner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    TextView textView;
    ImageView imageView;
    ArrayList<SpinnerModel> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);

        list.add(new SpinnerModel("Flower",R.drawable.ic_action_flower));
        list.add(new SpinnerModel("Folder",R.drawable.ic_action_test));
        list.add(new SpinnerModel("Flash",R.drawable.ic_action_name));
        Spinner sp = ( Spinner)findViewById(R.id.spinner);
        SpinnerAdapter adapter = new SpinnerAdapter(this,
                R.layout.spinner_layout,R.id.txt,list);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(this);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        SpinnerModel spinnerModel = list.get(i);
        String item = spinnerModel.getText();
        int image = spinnerModel.getImageId();


        textView.setText(item);
        imageView.setImageResource(image);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
