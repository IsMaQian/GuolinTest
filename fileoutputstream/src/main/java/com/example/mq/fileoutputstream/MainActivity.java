package com.example.mq.fileoutputstream;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    EditText edit;
    String content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = (EditText) findViewById(R.id.edit);
        String input = load();
        if (!TextUtils.isEmpty(input)) {
            edit.setText(input);
            edit.setSelection(input.length());
            Toast.makeText(this, "Restoring succeeded", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        content = edit.getText().toString();
        save(content);
    }

    public String load() {
        FileInputStream in= null;
        BufferedReader br= null;
        StringBuilder content = new StringBuilder();
        try {
            in = openFileInput("Data");
            br = new BufferedReader(new InputStreamReader(in));
            String line = "";
            while ((line = br.readLine())!= null) {
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return content.toString();
    }

    public void save(String content) {
        FileOutputStream out = null;
        BufferedWriter br = null;
        try {
            out = openFileOutput("Data", Context.MODE_PRIVATE);
            br = new BufferedWriter(new OutputStreamWriter(out));
            br.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
