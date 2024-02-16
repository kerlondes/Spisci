package com.example.tupovseeto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Product> Strashna = new ArrayList<Product>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Product> products = new ArrayList<Product>();

        products.add(new Product("Bugaty", "шт.","Самая дорогая в мире машина", R.drawable.bugaty));
        products.add(new Product("Mersedes", "шт.","Самая деловая машина в мире", R.drawable.mersedes));
        products.add(new Product("Rodster", "шт.","Самая не популярная машина в мире", R.drawable.rodster));
        Strashna =  products;
        ListView productList = findViewById(R.id.productList);
        ProductAdapter adapter = new ProductAdapter(this, R.layout.list_item, products);
        productList.setAdapter(adapter);
    }
    public void add(View view){
        EditText userName = findViewById(R.id.userName);
        String user = userName.getText().toString();
        if(!user.isEmpty()){
            Strashna.add(new Product(""+user, "шт. ","Нет информации", R.drawable.beloe));
            userName.setText("");
            ListView productList = findViewById(R.id.productList);
            ProductAdapter adapter = new ProductAdapter(this, R.layout.list_item, Strashna);
            productList.setAdapter(adapter);
        }
    }
    public void remove(View view){
        ListView productList = findViewById(R.id.productList);
        ProductAdapter adapter = new ProductAdapter(this, R.layout.list_item, Strashna);
        adapter.clear();
        productList.setAdapter(adapter);
    }
}