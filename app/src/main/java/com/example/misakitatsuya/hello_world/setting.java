package com.example.misakitatsuya.hello_world;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class setting extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //プリファレンスの生成
        SharedPreferences adult_pref = getSharedPreferences("adult_pref",MODE_PRIVATE);
        SharedPreferences children_pref = getSharedPreferences("children_pref",MODE_PRIVATE);
        SharedPreferences baby_pref = getSharedPreferences("baby_pref",MODE_PRIVATE);
        SharedPreferences limit_pref = getSharedPreferences("limit_pref",MODE_PRIVATE);
        SharedPreferences setting_pref = getSharedPreferences("setting_pref",MODE_PRIVATE);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        a = adult_pref.getInt("adult_key", a);
        b = children_pref.getInt("children_key", b);
        c = baby_pref.getInt("baby_key", c);
        d = limit_pref.getInt("limit_key", d);
        e = setting_pref.getInt("setting_key", e);

        String adult_str = String.valueOf(a);
        String children_str = String.valueOf(b);
        String baby_str = String.valueOf(c);
        String limit_str = String.valueOf(d);
        String setting_str = String.valueOf(e);

        EditText adult_et = (EditText) findViewById(R.id.adulttext);
        EditText children_et = (EditText) findViewById(R.id.childrentext);
        EditText baby_et = (EditText) findViewById(R.id.babytext);
        EditText limit_et = (EditText) findViewById(R.id.limittext);
        EditText setting_et = (EditText) findViewById(R.id.settingtext);

        adult_et.setText(adult_str);
        children_et.setText(children_str);
        baby_et.setText(baby_str);
        limit_et.setText(limit_str);
        setting_et.setText(setting_str);

        Button btnhome = (Button)findViewById(R.id.button5);
        btnhome.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            SharedPreferences adult_pref = getSharedPreferences("adult_pref", MODE_PRIVATE);
            SharedPreferences children_pref = getSharedPreferences("children_pref", MODE_PRIVATE);
            SharedPreferences baby_pref = getSharedPreferences("baby_pref", MODE_PRIVATE);
            SharedPreferences limit_pref = getSharedPreferences("limit_pref", MODE_PRIVATE);
            SharedPreferences setting_pref = getSharedPreferences("setting_pref", MODE_PRIVATE);

            EditText adult_et = (EditText) findViewById(R.id.adulttext);
            EditText children_et = (EditText) findViewById(R.id.childrentext);
            EditText baby_et = (EditText) findViewById(R.id.babytext);
            EditText limit_et = (EditText) findViewById(R.id.limittext);
            EditText setting_et = (EditText) findViewById(R.id.settingtext);

            String adult_str = adult_et.getText().toString();
            String children_str = children_et.getText().toString();
            String baby_str = baby_et.getText().toString();
            String limit_str = limit_et.getText().toString();
            String setting_str = setting_et.getText().toString();

            if(adult_str.length() <= 0) {
                adult_str = "0";
            }
            if(children_str.length() <= 0) {
                children_str = "0";
            }
            if(baby_str.length() <= 0){
                baby_str = "0";
            }
            if(limit_str.length() <= 0){
                limit_str = "0";
            }
            if(setting_str.length() <= 0){
                setting_str = "0";
            }

            int a = Integer.parseInt(adult_str);
            int b = Integer.parseInt(children_str);
            int c = Integer.parseInt(baby_str);
            int d = Integer.parseInt(limit_str);
            int e = Integer.parseInt(setting_str);

            SharedPreferences.Editor adult_e = adult_pref.edit();
            SharedPreferences.Editor children_e = children_pref.edit();
            SharedPreferences.Editor baby_e = baby_pref.edit();
            SharedPreferences.Editor limit_e = limit_pref.edit();
            SharedPreferences.Editor setting_e = setting_pref.edit();

            adult_e.putInt("adult_key", a);
            children_e.putInt("children_key", b);
            baby_e.putInt("baby_key", c);
            limit_e.putInt("limit_key", d);
            setting_e.putInt("setting_key", e);

            adult_e.commit();
            children_e.commit();
            baby_e.commit();
            limit_e.commit();
            setting_e.commit();

            Intent intent = new Intent();
            intent.setClassName("com.example.misakitatsuya.hello_world", "com.example.misakitatsuya.hello_world.MainActivity");
            startActivity(intent);
            }
        });


        //ボタン場所指定(非常食)
        Button btnhijo = (Button)findViewById(R.id.button6);
        btnhijo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            SharedPreferences adult_pref = getSharedPreferences("adult_pref",MODE_PRIVATE);
            SharedPreferences children_pref = getSharedPreferences("children_pref",MODE_PRIVATE);
            SharedPreferences baby_pref = getSharedPreferences("baby_pref",MODE_PRIVATE);
            SharedPreferences limit_pref = getSharedPreferences("limit_pref",MODE_PRIVATE);
            SharedPreferences setting_pref = getSharedPreferences("setting_pref",MODE_PRIVATE);

            EditText adult_et = (EditText)findViewById(R.id.adulttext);
            EditText children_et = (EditText)findViewById(R.id.childrentext);
            EditText baby_et = (EditText)findViewById(R.id.babytext);
            EditText limit_et = (EditText)findViewById(R.id.limittext);
            EditText setting_et = (EditText)findViewById(R.id.settingtext);

            String adult_str = adult_et.getText().toString();
            String children_str = children_et.getText().toString();
            String baby_str = baby_et.getText().toString();
            String limit_str = limit_et.getText().toString();
            String setting_str = setting_et.getText().toString();

            if(adult_str.length() <= 0) {
                adult_str = "0";
            }
            if(children_str.length() <= 0) {
                children_str = "0";
            }
            if(baby_str.length() <= 0){
                baby_str = "0";
            }
            if(limit_str.length() <= 0){
                limit_str = "0";
            }
            if(setting_str.length() <= 0){
                setting_str = "0";
            }

            int a = Integer.parseInt(adult_str);
            int b = Integer.parseInt(children_str);
            int c = Integer.parseInt(baby_str);
            int d = Integer.parseInt(limit_str);
            int e = Integer.parseInt(setting_str);

            SharedPreferences.Editor adult_e = adult_pref.edit();
            SharedPreferences.Editor children_e = children_pref.edit();
            SharedPreferences.Editor baby_e = baby_pref.edit();
            SharedPreferences.Editor limit_e = limit_pref.edit();
            SharedPreferences.Editor setting_e = setting_pref.edit();

            adult_e.putInt("adult_key",a);
            children_e.putInt("children_key",b);
            baby_e.putInt("baby_key",c);
            limit_e.putInt("limit_key",d);
            setting_e.putInt("setting_key",e);

            adult_e.commit();
            children_e.commit();
            baby_e.commit();
            limit_e.commit();
            setting_e.commit();

            Intent intent = new Intent();
            intent.setClassName("com.example.misakitatsuya.hello_world", "com.example.misakitatsuya.hello_world.hijo");
            startActivity(intent);
        }
        });

        //ボタン場所指定(備蓄品)
        Button btnbichiku = (Button)findViewById(R.id.button7);
        btnbichiku.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
            SharedPreferences adult_pref = getSharedPreferences("adult_pref", MODE_PRIVATE);
            SharedPreferences children_pref = getSharedPreferences("children_pref", MODE_PRIVATE);
            SharedPreferences baby_pref = getSharedPreferences("baby_pref", MODE_PRIVATE);
            SharedPreferences limit_pref = getSharedPreferences("limit_pref", MODE_PRIVATE);
            SharedPreferences setting_pref = getSharedPreferences("setting_pref", MODE_PRIVATE);

            EditText adult_et = (EditText) findViewById(R.id.adulttext);
            EditText children_et = (EditText) findViewById(R.id.childrentext);
            EditText baby_et = (EditText) findViewById(R.id.babytext);
            EditText limit_et = (EditText) findViewById(R.id.limittext);
            EditText setting_et = (EditText) findViewById(R.id.settingtext);

            String adult_str = adult_et.getText().toString();
            String children_str = children_et.getText().toString();
            String baby_str = baby_et.getText().toString();
            String limit_str = limit_et.getText().toString();
            String setting_str = setting_et.getText().toString();

            if(adult_str.length() <= 0) {
                adult_str = "0";
            }
            if(children_str.length() <= 0) {
                children_str = "0";
            }
            if(baby_str.length() <= 0){
                baby_str = "0";
            }
            if(limit_str.length() <= 0){
                limit_str = "0";
            }
            if(setting_str.length() <= 0){
                setting_str = "0";
            }

            int a = Integer.parseInt(adult_str);
            int b = Integer.parseInt(children_str);
            int c = Integer.parseInt(baby_str);
            int d = Integer.parseInt(limit_str);
            int e = Integer.parseInt(setting_str);

            SharedPreferences.Editor adult_e = adult_pref.edit();
            SharedPreferences.Editor children_e = children_pref.edit();
            SharedPreferences.Editor baby_e = baby_pref.edit();
            SharedPreferences.Editor limit_e = limit_pref.edit();
            SharedPreferences.Editor setting_e = setting_pref.edit();

            adult_e.putInt("adult_key", a);
            children_e.putInt("children_key", b);
            baby_e.putInt("baby_key", c);
            limit_e.putInt("limit_key", d);
            setting_e.putInt("setting_key", e);

            adult_e.commit();
            children_e.commit();
            baby_e.commit();
            limit_e.commit();
            setting_e.commit();

            Intent intent = new Intent();
            intent.setClassName("com.example.misakitatsuya.hello_world", "com.example.misakitatsuya.hello_world.bichiku");
            startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_setting, menu);
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
