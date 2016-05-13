package com.example.maryamch.github;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Product> productList;
    GridView gvProducts;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        gvProducts = (GridView) findViewById(R.id.gridview_products);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        productList = new ArrayList<>();
        productList.add(new Product("khaadi", R.mipmap.ic_launcher));
        productList.add(new Product("nishat linen", R.mipmap.ic_launcher));
        productList.add(new Product("J.", R.mipmap.ic_launcher));
        productList.add(new Product("Sana Safina's", R.mipmap.ic_launcher));
        productList.add(new Product("Maria B.", R.mipmap.ic_launcher));
        productList.add(new Product("Nicky and Nina", R.mipmap.ic_launcher));
        productList.add(new Product("HSY", R.mipmap.ic_launcher));
        productList.add(new Product("Vaneez Lawn", R.mipmap.ic_launcher));
        productList.add(new Product("Almira", R.mipmap.ic_launcher));

        productAdapter = new ProductAdapter(MainActivity.this, productList);
        gvProducts.setAdapter(productAdapter);
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

    private void funcion1() {

    }
}
