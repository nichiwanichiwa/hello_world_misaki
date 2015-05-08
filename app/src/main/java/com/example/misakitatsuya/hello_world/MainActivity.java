package com.example.misakitatsuya.hello_world;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Calendar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //日付表示
        Calendar cal = Calendar.getInstance();
        TextView tv = (TextView) findViewById(R.id.textView3);
        tv.setText(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DATE) + "日");

        //非常食合計
        SharedPreferences hijopref = getSharedPreferences("Preferences",MODE_PRIVATE);
        int a = hijopref.getInt("retorutogohan_num",0);
        int b = hijopref.getInt("kandume_num",0);
        int c = hijopref.getInt("kanmen_num",0);
        int d = hijopref.getInt("kanpan_num",0);
        int e = hijopref.getInt("kandume2_num",0);
        int f = hijopref.getInt("retoruto_num",0);
        int g = hijopref.getInt("freaze_num",0);
        int h = hijopref.getInt("mizu_num",0);
        int i = hijopref.getInt("pokari_num",0);
        int j = hijopref.getInt("karori_num",0);
        int k = hijopref.getInt("okasi_num",0);
        int hijosum = a+b+c+d+e+f+g+h+i+j+k;
        String hijostr = "非常食の合計　"+String.valueOf(hijosum)+"個";
        TextView hijosum_tv = (TextView)findViewById(R.id.hijosum);
        hijosum_tv.setText(hijostr);

        //備蓄品合計
        SharedPreferences bichikupref = getSharedPreferences("Preferences",MODE_PRIVATE);
        int l = bichikupref.getInt("pop1num",0);
        int m = bichikupref.getInt("pop2num",0);
        int n = bichikupref.getInt("pop3num",0);
        int o = bichikupref.getInt("pop4num",0);
        int p = bichikupref.getInt("pop5num",0);
        int q = bichikupref.getInt("pop6num",0);
        int r = bichikupref.getInt("pop7num",0);
        int s = bichikupref.getInt("pop8num",0);
        int bichikusum = l+m+n+o+p+q+r+s;
        String bichikustr = "備蓄品の合計　"+String.valueOf(bichikusum)+"個";
        TextView bichikusum_tv = (TextView)findViewById(R.id.bichikusum);
        bichikusum_tv.setText(bichikustr);

        //ボタンの場所指定(設定)
        Button btnsetting = (Button)findViewById(R.id.button_segue);

        btnsetting.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.misakitatsuya.hello_world", "com.example.misakitatsuya.hello_world.setting");
                startActivity(intent);//画面を出す
            }
        });

        //ボタン場所指定(備蓄品)
        Button btnbichiku = (Button)findViewById(R.id.button3);

        btnbichiku.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.misakitatsuya.hello_world", "com.example.misakitatsuya.hello_world.bichiku");
                startActivity(intent);//画面を出す
            }
        });

        //ボタン場所指定(非常食)
        Button btnhijo = (Button)findViewById(R.id.button2);

        btnhijo.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.misakitatsuya.hello_world", "com.example.misakitatsuya.hello_world.hijo");
                startActivity(intent);//画面を出す
            }
        });
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
