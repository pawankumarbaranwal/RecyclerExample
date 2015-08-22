package android.com.recyclerexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    List<Customer> customerList =new ArrayList<Customer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        customerList = getData();
        setContentView(R.layout.activity_main);
        RecyclerView recList = (RecyclerView) findViewById(R.id.cardList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(linearLayoutManager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(customerList);
        recList.setAdapter(adapter);
    }

    private List<Customer> getData() {
        List<Customer> list =new ArrayList<Customer>();
        Customer customer =new Customer("123","Pawan","9902765235");
        list.add(customer);
        customer =new Customer("124","Pawan","9902765235");
        list.add(customer);
        customer =new Customer("125","Sahil","5902765235");
        list.add(customer);
        customer =new Customer("126","Nikhil","9802765235");
        list.add(customer);
        customer =new Customer("127","Santosh","9990765235");
        list.add(customer);
        customer =new Customer("128","Nadeem","909777735");
        list.add(customer);
        customer =new Customer("129","Naman","870365235");
        list.add(customer);


        return list;
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
}
