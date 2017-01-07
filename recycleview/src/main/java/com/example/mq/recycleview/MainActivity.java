package com.example.mq.recycleview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        //实现横向滚动。。和ListView相似
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //瀑布流布局
//        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(
//                3, StaggeredGridLayoutManager.VERTICAL);
        //网格式布局
        GridLayoutManager layoutManager = new GridLayoutManager(this, 4);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            //和ListView相似
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
            //瀑布流布局
//            Fruit apple = new Fruit(getRandomLengthName("Apple"), R.drawable.icon);
//            fruitList.add(apple);
//            Fruit banana = new Fruit(getRandomLengthName("banana"), R.drawable.icon);
//            fruitList.add(banana);
//            Fruit orange = new Fruit(getRandomLengthName("orange"), R.drawable.icon);
//            fruitList.add(orange);
//            Fruit watermelon = new Fruit(getRandomLengthName("watermelon"), R.drawable.icon);
//            fruitList.add(watermelon);
//            Fruit pear = new Fruit(getRandomLengthName("pear"), R.drawable.icon);
//            fruitList.add(pear);
//            Fruit grape = new Fruit(getRandomLengthName("grape"), R.drawable.icon);
//            fruitList.add(grape);
//            Fruit pineapple = new Fruit(getRandomLengthName("pineapple"), R.drawable.icon);
//            fruitList.add(pineapple);
//            Fruit strawberry = new Fruit(getRandomLengthName("strawberry"), R.drawable.icon);
//            fruitList.add(strawberry);
//            Fruit mango = new Fruit(getRandomLengthName("mango"), R.drawable.icon);
//            fruitList.add(mango);
        }
    }

    private String getRandomLengthName(String name) {
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(name);
        }
        return builder.toString();
    }
}
