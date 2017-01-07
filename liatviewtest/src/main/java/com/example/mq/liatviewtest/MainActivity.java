package com.example.mq.liatviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,
                R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new ClickListener());
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.icon);
            fruitList.add(apple);
            Fruit banana = new Fruit("banana", R.drawable.icon);
            fruitList.add(banana);
            Fruit orange = new Fruit("orange", R.drawable.icon);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("watermelon", R.drawable.icon);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("pear", R.drawable.icon);
            fruitList.add(pear);
            Fruit grape = new Fruit("grape", R.drawable.icon);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("pineapple", R.drawable.icon);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("strawberry", R.drawable.icon);
            fruitList.add(strawberry);
            Fruit mango = new Fruit("mango", R.drawable.icon);
            fruitList.add(mango);
        }
    }

    private class ClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Fruit fruit = fruitList.get(i);
            Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_LONG).show();
        }
    }
}
