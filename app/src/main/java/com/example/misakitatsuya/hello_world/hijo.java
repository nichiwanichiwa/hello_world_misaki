package com.example.misakitatsuya.hello_world;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Calendar;


public class hijo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijo);

        //レトルトご飯ポップ
        ImageButton btnretorutogohan = (ImageButton)findViewById(R.id.ImageButton);
        btnretorutogohan.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // アラートダイアログの出力
                AlertDialog.Builder alert = new AlertDialog.Builder(hijo.this);
                alert.setTitle("レトルトご飯、炊き込みご飯");
                LayoutInflater inflater = LayoutInflater.from(hijo.this);
                final View viw = inflater.inflate(R.layout.activity_retorutogohan, null);
                // プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences",MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("retorutogohan_num",i);
                String str = String.valueOf(i);
                // 必ずView変数で生成したデータを使うこと
                EditText et = (EditText)viw.findViewById(R.id.retorutogohantext);
                // 値をいれる
                et.setText(str);

                //人数の表示
                SharedPreferences adult_pref = getSharedPreferences("adult_pref",MODE_PRIVATE);
                SharedPreferences children_pref = getSharedPreferences("children_pref",MODE_PRIVATE);
                SharedPreferences baby_pref = getSharedPreferences("baby_pref",MODE_PRIVATE);
                int a = adult_pref.getInt("adult_key",0);
                int b = children_pref.getInt("children_key",0);
                int c = baby_pref.getInt("baby_key",0);
                String adult_str = "大人"+String.valueOf(a)+"人";
                String children_str = "小人"+String.valueOf(b)+"人";
                String baby_str = "幼児"+String.valueOf(c)+"人";
                TextView adult_tv = (TextView)viw.findViewById(R.id.adulttext);
                TextView children_tv = (TextView)viw.findViewById(R.id.childrentext);
                TextView baby_tv = (TextView)viw.findViewById(R.id.babytext);
                adult_tv.setText(adult_str);
                children_tv.setText(children_str);
                baby_tv.setText(baby_str);

                // 決定ボタンを押された時の処理
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences pref = getSharedPreferences("Preferences",MODE_PRIVATE);
                        EditText et = (EditText)viw.findViewById(R.id.retorutogohantext);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = pref.edit();
                        e.putInt("retorutogohan_num",i);
                        e.commit();
                    }
                });
                Calendar cal = Calendar.getInstance();
                TextView tv = (TextView)viw.findViewById(R.id.textView30);
                tv.setText(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DATE) + "日");
                alert.setView(viw);
                alert.show();
            }
        });

        //缶詰ポップ
        ImageButton btnkandume = (ImageButton)findViewById(R.id.kandumebutton);
        btnkandume.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // アラートダイアログの出力
                AlertDialog.Builder alert = new AlertDialog.Builder(hijo.this);
                alert.setTitle("缶詰（ご飯）");
                LayoutInflater inflater = LayoutInflater.from(hijo.this);
                final View viw = inflater.inflate(R.layout.activity_kandume, null);
                // プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences",MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("kandume_num",i);
                String str = String.valueOf(i);
                // 必ずView変数で生成したデータを使うこと
                EditText et = (EditText)viw.findViewById(R.id.kandumetext);
                // 値をいれる
                et.setText(str);

                //人数の表示
                SharedPreferences adult_pref = getSharedPreferences("adult_pref",MODE_PRIVATE);
                SharedPreferences children_pref = getSharedPreferences("children_pref",MODE_PRIVATE);
                SharedPreferences baby_pref = getSharedPreferences("baby_pref",MODE_PRIVATE);
                int a = adult_pref.getInt("adult_key",0);
                int b = children_pref.getInt("children_key",0);
                int c = baby_pref.getInt("baby_key",0);
                String adult_str = "大人"+String.valueOf(a)+"人";
                String children_str = "小人"+String.valueOf(b)+"人";
                String baby_str = "幼児"+String.valueOf(c)+"人";
                TextView adult_tv = (TextView)viw.findViewById(R.id.adulttext);
                TextView children_tv = (TextView)viw.findViewById(R.id.childrentext);
                TextView baby_tv = (TextView)viw.findViewById(R.id.babytext);
                adult_tv.setText(adult_str);
                children_tv.setText(children_str);
                baby_tv.setText(baby_str);

                // 決定ボタンを押された時の処理
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences pref = getSharedPreferences("Preferences",MODE_PRIVATE);
                        EditText et = (EditText)viw.findViewById(R.id.kandumetext);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = pref.edit();
                        e.putInt("kandume_num",i);
                        e.commit();
                    }
                });
                Calendar cal = Calendar.getInstance();
                TextView tv = (TextView)viw.findViewById(R.id.textView30);
                tv.setText(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DATE) + "日");
                alert.setView(viw);
                alert.show();
            }
        });

        //乾麺ポップ
        ImageButton btnkanmen = (ImageButton)findViewById(R.id.kanmenbutton);
        btnkanmen.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // アラートダイアログの出力
                AlertDialog.Builder alert = new AlertDialog.Builder(hijo.this);
                alert.setTitle("乾麺、即席めん、カップ麺");
                LayoutInflater inflater = LayoutInflater.from(hijo.this);
                final View viw = inflater.inflate(R.layout.activity_kanmen, null);
                // プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences",MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("kanmen_num",i);
                String str = String.valueOf(i);
                // 必ずView変数で生成したデータを使うこと
                EditText et = (EditText)viw.findViewById(R.id.kanmentext);
                // 値をいれる
                et.setText(str);

                //人数の表示
                SharedPreferences adult_pref = getSharedPreferences("adult_pref",MODE_PRIVATE);
                SharedPreferences children_pref = getSharedPreferences("children_pref",MODE_PRIVATE);
                SharedPreferences baby_pref = getSharedPreferences("baby_pref",MODE_PRIVATE);
                int a = adult_pref.getInt("adult_key",0);
                int b = children_pref.getInt("children_key",0);
                int c = baby_pref.getInt("baby_key",0);
                String adult_str = "大人"+String.valueOf(a)+"人";
                String children_str = "小人"+String.valueOf(b)+"人";
                String baby_str = "幼児"+String.valueOf(c)+"人";
                TextView adult_tv = (TextView)viw.findViewById(R.id.adulttext);
                TextView children_tv = (TextView)viw.findViewById(R.id.childrentext);
                TextView baby_tv = (TextView)viw.findViewById(R.id.babytext);
                adult_tv.setText(adult_str);
                children_tv.setText(children_str);
                baby_tv.setText(baby_str);

                // 決定ボタンを押された時の処理
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences pref = getSharedPreferences("Preferences",MODE_PRIVATE);
                        EditText et = (EditText)viw.findViewById(R.id.kanmentext);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = pref.edit();
                        e.putInt("kanmen_num",i);
                        e.commit();
                    }
                });
                Calendar cal = Calendar.getInstance();
                TextView tv = (TextView)viw.findViewById(R.id.textView30);
                tv.setText(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DATE) + "日");
                alert.setView(viw);
                alert.show();
            }
        });

        //乾パンポップ
        ImageButton btnkanpan = (ImageButton)findViewById(R.id.kanpanbutton);
        btnkanpan.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // アラートダイアログの出力
                AlertDialog.Builder alert = new AlertDialog.Builder(hijo.this);
                alert.setTitle("乾パン");
                LayoutInflater inflater = LayoutInflater.from(hijo.this);
                final View viw = inflater.inflate(R.layout.activity_kanpan, null);
                // プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences",MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("kanpan_num",i);
                String str = String.valueOf(i);
                // 必ずView変数で生成したデータを使うこと
                EditText et = (EditText)viw.findViewById(R.id.kanpantext);
                // 値をいれる
                et.setText(str);

                //人数の表示
                SharedPreferences adult_pref = getSharedPreferences("adult_pref",MODE_PRIVATE);
                SharedPreferences children_pref = getSharedPreferences("children_pref",MODE_PRIVATE);
                SharedPreferences baby_pref = getSharedPreferences("baby_pref",MODE_PRIVATE);
                int a = adult_pref.getInt("adult_key",0);
                int b = children_pref.getInt("children_key",0);
                int c = baby_pref.getInt("baby_key",0);
                String adult_str = "大人"+String.valueOf(a)+"人";
                String children_str = "小人"+String.valueOf(b)+"人";
                String baby_str = "幼児"+String.valueOf(c)+"人";
                TextView adult_tv = (TextView)viw.findViewById(R.id.adulttext);
                TextView children_tv = (TextView)viw.findViewById(R.id.childrentext);
                TextView baby_tv = (TextView)viw.findViewById(R.id.babytext);
                adult_tv.setText(adult_str);
                children_tv.setText(children_str);
                baby_tv.setText(baby_str);

                // 決定ボタンを押された時の処理
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences pref = getSharedPreferences("Preferences",MODE_PRIVATE);
                        EditText et = (EditText)viw.findViewById(R.id.kanpantext);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = pref.edit();
                        e.putInt("kanpan_num",i);
                        e.commit();
                    }
                });
                Calendar cal = Calendar.getInstance();
                TextView tv = (TextView)viw.findViewById(R.id.textView30);
                tv.setText(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DATE) + "日");
                alert.setView(viw);
                alert.show();
            }
        });

        //缶詰主菜ポップ
        ImageButton btnkandume2 = (ImageButton)findViewById(R.id.kandumebutton2);
        btnkandume2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // アラートダイアログの出力
                AlertDialog.Builder alert = new AlertDialog.Builder(hijo.this);
                alert.setTitle("肉・魚・豆などの缶詰");
                LayoutInflater inflater = LayoutInflater.from(hijo.this);
                final View viw = inflater.inflate(R.layout.activity_kandume_syusai, null);
                // プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences",MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("kandume2_num",i);
                String str = String.valueOf(i);
                // 必ずView変数で生成したデータを使うこと
                EditText et = (EditText)viw.findViewById(R.id.kandume_syusaitext);
                // 値をいれる
                et.setText(str);

                //人数の表示
                SharedPreferences adult_pref = getSharedPreferences("adult_pref",MODE_PRIVATE);
                SharedPreferences children_pref = getSharedPreferences("children_pref",MODE_PRIVATE);
                SharedPreferences baby_pref = getSharedPreferences("baby_pref",MODE_PRIVATE);
                int a = adult_pref.getInt("adult_key",0);
                int b = children_pref.getInt("children_key",0);
                int c = baby_pref.getInt("baby_key",0);
                String adult_str = "大人"+String.valueOf(a)+"人";
                String children_str = "小人"+String.valueOf(b)+"人";
                String baby_str = "幼児"+String.valueOf(c)+"人";
                TextView adult_tv = (TextView)viw.findViewById(R.id.adulttext);
                TextView children_tv = (TextView)viw.findViewById(R.id.childrentext);
                TextView baby_tv = (TextView)viw.findViewById(R.id.babytext);
                adult_tv.setText(adult_str);
                children_tv.setText(children_str);
                baby_tv.setText(baby_str);

                // 決定ボタンを押された時の処理
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences pref = getSharedPreferences("Preferences",MODE_PRIVATE);
                        EditText et = (EditText)viw.findViewById(R.id.kandume_syusaitext);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = pref.edit();
                        e.putInt("kandume2_num",i);
                        e.commit();
                    }
                });
                Calendar cal = Calendar.getInstance();
                TextView tv = (TextView)viw.findViewById(R.id.textView30);
                tv.setText(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DATE) + "日");
                alert.setView(viw);
                alert.show();
            }
        });

        //レトルトポップ
        ImageButton btnretoruto = (ImageButton)findViewById(R.id.retorutobutton);
        btnretoruto.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // アラートダイアログの出力
                AlertDialog.Builder alert = new AlertDialog.Builder(hijo.this);
                alert.setTitle("レトルト食品");
                LayoutInflater inflater = LayoutInflater.from(hijo.this);
                final View viw = inflater.inflate(R.layout.activity_retoruto, null);
                // プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences",MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("retoruto_num",i);
                String str = String.valueOf(i);
                // 必ずView変数で生成したデータを使うこと
                EditText et = (EditText)viw.findViewById(R.id.retorutotext);
                // 値をいれる
                et.setText(str);

                //人数の表示
                SharedPreferences adult_pref = getSharedPreferences("adult_pref",MODE_PRIVATE);
                SharedPreferences children_pref = getSharedPreferences("children_pref",MODE_PRIVATE);
                SharedPreferences baby_pref = getSharedPreferences("baby_pref",MODE_PRIVATE);
                int a = adult_pref.getInt("adult_key",0);
                int b = children_pref.getInt("children_key",0);
                int c = baby_pref.getInt("baby_key",0);
                String adult_str = "大人"+String.valueOf(a)+"人";
                String children_str = "小人"+String.valueOf(b)+"人";
                String baby_str = "幼児"+String.valueOf(c)+"人";
                TextView adult_tv = (TextView)viw.findViewById(R.id.adulttext);
                TextView children_tv = (TextView)viw.findViewById(R.id.childrentext);
                TextView baby_tv = (TextView)viw.findViewById(R.id.babytext);
                adult_tv.setText(adult_str);
                children_tv.setText(children_str);
                baby_tv.setText(baby_str);

                // 決定ボタンを押された時の処理
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences pref = getSharedPreferences("Preferences",MODE_PRIVATE);
                        EditText et = (EditText)viw.findViewById(R.id.retorutotext);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = pref.edit();
                        e.putInt("retoruto_num",i);
                        e.commit();
                    }
                });
                Calendar cal = Calendar.getInstance();
                TextView tv = (TextView)viw.findViewById(R.id.textView30);
                tv.setText(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DATE) + "日");
                alert.setView(viw);
                alert.show();
            }
        });

        //フリーズドライポップ
        ImageButton btnfreaze = (ImageButton)findViewById(R.id.freazedry_button);
        btnfreaze.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // アラートダイアログの出力
                AlertDialog.Builder alert = new AlertDialog.Builder(hijo.this);
                alert.setTitle("フリーズドライ");
                LayoutInflater inflater = LayoutInflater.from(hijo.this);
                final View viw = inflater.inflate(R.layout.activity_freaze, null);
                // プリファレンスの生成
                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                int i = 0;
                i = pref.getInt("freaze_num", i);
                String str = String.valueOf(i);
                // 必ずView変数で生成したデータを使うこと
                EditText et = (EditText) viw.findViewById(R.id.freazetext);
                // 値をいれる
                et.setText(str);

                //人数の表示
                SharedPreferences adult_pref = getSharedPreferences("adult_pref", MODE_PRIVATE);
                SharedPreferences children_pref = getSharedPreferences("children_pref", MODE_PRIVATE);
                SharedPreferences baby_pref = getSharedPreferences("baby_pref", MODE_PRIVATE);
                int a = adult_pref.getInt("adult_key", 0);
                int b = children_pref.getInt("children_key", 0);
                int c = baby_pref.getInt("baby_key", 0);
                String adult_str = "大人" + String.valueOf(a) + "人";
                String children_str = "小人" + String.valueOf(b) + "人";
                String baby_str = "幼児" + String.valueOf(c) + "人";
                TextView adult_tv = (TextView) viw.findViewById(R.id.adulttext);
                TextView children_tv = (TextView) viw.findViewById(R.id.childrentext);
                TextView baby_tv = (TextView) viw.findViewById(R.id.babytext);
                adult_tv.setText(adult_str);
                children_tv.setText(children_str);
                baby_tv.setText(baby_str);

                // 決定ボタンを押された時の処理
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                        EditText et = (EditText) viw.findViewById(R.id.freazetext);
                        String str = et.getText().toString();
                        int i = Integer.parseInt(str);

                        SharedPreferences.Editor e = pref.edit();
                        e.putInt("freaze_num", i);
                        e.commit();
                    }
                });
                Calendar cal = Calendar.getInstance();
                TextView tv = (TextView) viw.findViewById(R.id.textView30);
                tv.setText(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DATE) + "日");
                alert.setView(viw);
                alert.show();

                //カレンダー
                Button calbutton = (Button) viw.findViewById(R.id.calbutton);
                calbutton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 日付設定時のリスナ作成
                        DatePickerDialog.OnDateSetListener DateSetListener = new DatePickerDialog.OnDateSetListener() {
                            public void onDateSet(android.widget.DatePicker datePicker, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                // 省略
                            }
                        };

                        // 日付情報の初期設定
                        Calendar calendar = Calendar.getInstance();
                        int year = calendar.get(Calendar.YEAR); // 年
                        int monthOfYear = calendar.get(Calendar.MONTH); // 月
                        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // 日

                        // 日付設定ダイアログの作成・リスナの登録
                        DatePickerDialog datePickerDialog = new DatePickerDialog(hijo.this, DateSetListener, year, monthOfYear, dayOfMonth);

                        // 日付設定ダイアログの表示
                        datePickerDialog.show();
                    }
                });

                //水ポップ
                ImageButton btnmizu = (ImageButton) findViewById(R.id.mizu_button);
                btnmizu.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
                        // アラートダイアログの出力
                        AlertDialog.Builder alert = new AlertDialog.Builder(hijo.this);
                        alert.setTitle("水");
                        LayoutInflater inflater = LayoutInflater.from(hijo.this);
                        final View viw = inflater.inflate(R.layout.activity_mizu, null);
                        // プリファレンスの生成
                        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                        int i = 0;
                        i = pref.getInt("mizu_num", i);
                        String str = String.valueOf(i);
                        // 必ずView変数で生成したデータを使うこと
                        EditText et = (EditText) viw.findViewById(R.id.mizutext);
                        // 値をいれる
                        et.setText(str);

                        //人数の表示
                        SharedPreferences adult_pref = getSharedPreferences("adult_pref", MODE_PRIVATE);
                        SharedPreferences children_pref = getSharedPreferences("children_pref", MODE_PRIVATE);
                        SharedPreferences baby_pref = getSharedPreferences("baby_pref", MODE_PRIVATE);
                        int a = adult_pref.getInt("adult_key", 0);
                        int b = children_pref.getInt("children_key", 0);
                        int c = baby_pref.getInt("baby_key", 0);
                        String adult_str = "大人" + String.valueOf(a) + "人";
                        String children_str = "小人" + String.valueOf(b) + "人";
                        String baby_str = "幼児" + String.valueOf(c) + "人";
                        TextView adult_tv = (TextView) viw.findViewById(R.id.adulttext);
                        TextView children_tv = (TextView) viw.findViewById(R.id.childrentext);
                        TextView baby_tv = (TextView) viw.findViewById(R.id.babytext);
                        adult_tv.setText(adult_str);
                        children_tv.setText(children_str);
                        baby_tv.setText(baby_str);

                        // 決定ボタンを押された時の処理
                        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                                EditText et = (EditText) viw.findViewById(R.id.mizutext);
                                String str = et.getText().toString();
                                int i = Integer.parseInt(str);

                                SharedPreferences.Editor e = pref.edit();
                                e.putInt("mizu_num", i);
                                e.commit();
                            }
                        });
                        Calendar cal = Calendar.getInstance();
                        TextView tv = (TextView) viw.findViewById(R.id.textView30);
                        tv.setText(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DATE) + "日");
                        alert.setView(viw);
                        alert.show();
                    }
                });

                //ポカリポップ
                ImageButton btnpokari = (ImageButton) findViewById(R.id.pokaributton);
                btnpokari.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
                        // アラートダイアログの出力
                        AlertDialog.Builder alert = new AlertDialog.Builder(hijo.this);
                        alert.setTitle("ポカリスエット（粉末）");
                        LayoutInflater inflater = LayoutInflater.from(hijo.this);
                        final View viw = inflater.inflate(R.layout.activity_pokari, null);
                        // プリファレンスの生成
                        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                        int i = 0;
                        i = pref.getInt("pokari_num", i);
                        String str = String.valueOf(i);
                        // 必ずView変数で生成したデータを使うこと
                        EditText et = (EditText) viw.findViewById(R.id.pokaritext);
                        // 値をいれる
                        et.setText(str);

                        //人数の表示
                        SharedPreferences adult_pref = getSharedPreferences("adult_pref", MODE_PRIVATE);
                        SharedPreferences children_pref = getSharedPreferences("children_pref", MODE_PRIVATE);
                        SharedPreferences baby_pref = getSharedPreferences("baby_pref", MODE_PRIVATE);
                        int a = adult_pref.getInt("adult_key", 0);
                        int b = children_pref.getInt("children_key", 0);
                        int c = baby_pref.getInt("baby_key", 0);
                        String adult_str = "大人" + String.valueOf(a) + "人";
                        String children_str = "小人" + String.valueOf(b) + "人";
                        String baby_str = "幼児" + String.valueOf(c) + "人";
                        TextView adult_tv = (TextView) viw.findViewById(R.id.adulttext);
                        TextView children_tv = (TextView) viw.findViewById(R.id.childrentext);
                        TextView baby_tv = (TextView) viw.findViewById(R.id.babytext);
                        adult_tv.setText(adult_str);
                        children_tv.setText(children_str);
                        baby_tv.setText(baby_str);

                        // 決定ボタンを押された時の処理
                        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                                EditText et = (EditText) viw.findViewById(R.id.pokaritext);
                                String str = et.getText().toString();
                                int i = Integer.parseInt(str);

                                SharedPreferences.Editor e = pref.edit();
                                e.putInt("pokari_num", i);
                                e.commit();
                            }
                        });
                        Calendar cal = Calendar.getInstance();
                        TextView tv = (TextView) viw.findViewById(R.id.textView30);
                        tv.setText(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DATE) + "日");
                        alert.setView(viw);
                        alert.show();
                    }
                });

                //カロリポップ
                ImageButton btnkarori = (ImageButton) findViewById(R.id.karoributton);
                btnkarori.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
                        // アラートダイアログの出力
                        AlertDialog.Builder alert = new AlertDialog.Builder(hijo.this);
                        alert.setTitle("カロリーメイト（ロングライフ版）");
                        LayoutInflater inflater = LayoutInflater.from(hijo.this);
                        final View viw = inflater.inflate(R.layout.activity_karori, null);
                        // プリファレンスの生成
                        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                        int i = 0;
                        i = pref.getInt("karori_num", i);
                        String str = String.valueOf(i);
                        // 必ずView変数で生成したデータを使うこと
                        EditText et = (EditText) viw.findViewById(R.id.karoritext);
                        // 値をいれる
                        et.setText(str);

                        //人数の表示
                        SharedPreferences adult_pref = getSharedPreferences("adult_pref", MODE_PRIVATE);
                        SharedPreferences children_pref = getSharedPreferences("children_pref", MODE_PRIVATE);
                        SharedPreferences baby_pref = getSharedPreferences("baby_pref", MODE_PRIVATE);
                        int a = adult_pref.getInt("adult_key", 0);
                        int b = children_pref.getInt("children_key", 0);
                        int c = baby_pref.getInt("baby_key", 0);
                        String adult_str = "大人" + String.valueOf(a) + "人";
                        String children_str = "小人" + String.valueOf(b) + "人";
                        String baby_str = "幼児" + String.valueOf(c) + "人";
                        TextView adult_tv = (TextView) viw.findViewById(R.id.adulttext);
                        TextView children_tv = (TextView) viw.findViewById(R.id.childrentext);
                        TextView baby_tv = (TextView) viw.findViewById(R.id.babytext);
                        adult_tv.setText(adult_str);
                        children_tv.setText(children_str);
                        baby_tv.setText(baby_str);

                        // 決定ボタンを押された時の処理
                        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                                EditText et = (EditText) viw.findViewById(R.id.karoritext);
                                String str = et.getText().toString();
                                int i = Integer.parseInt(str);

                                SharedPreferences.Editor e = pref.edit();
                                e.putInt("karori_num", i);
                                e.commit();
                            }
                        });
                        Calendar cal = Calendar.getInstance();
                        TextView tv = (TextView) viw.findViewById(R.id.textView30);
                        tv.setText(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DATE) + "日");
                        alert.setView(viw);
                        alert.show();
                    }
                });

                //お菓子ポップ
                ImageButton btnokasi = (ImageButton) findViewById(R.id.okasibutton);
                btnokasi.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
                        // アラートダイアログの出力
                        AlertDialog.Builder alert = new AlertDialog.Builder(hijo.this);
                        alert.setTitle("菓子類（チョコレート、飴、ビスケット...）");
                        LayoutInflater inflater = LayoutInflater.from(hijo.this);
                        final View viw = inflater.inflate(R.layout.activity_okasi, null);
                        // プリファレンスの生成
                        SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                        int i = 0;
                        i = pref.getInt("okasi_num", i);
                        String str = String.valueOf(i);
                        // 必ずView変数で生成したデータを使うこと
                        EditText et = (EditText) viw.findViewById(R.id.okasitext);
                        // 値をいれる
                        et.setText(str);

                        //人数の表示
                        SharedPreferences adult_pref = getSharedPreferences("adult_pref", MODE_PRIVATE);
                        SharedPreferences children_pref = getSharedPreferences("children_pref", MODE_PRIVATE);
                        SharedPreferences baby_pref = getSharedPreferences("baby_pref", MODE_PRIVATE);
                        int a = adult_pref.getInt("adult_key", 0);
                        int b = children_pref.getInt("children_key", 0);
                        int c = baby_pref.getInt("baby_key", 0);
                        String adult_str = "大人" + String.valueOf(a) + "人";
                        String children_str = "小人" + String.valueOf(b) + "人";
                        String baby_str = "幼児" + String.valueOf(c) + "人";
                        TextView adult_tv = (TextView) viw.findViewById(R.id.adulttext);
                        TextView children_tv = (TextView) viw.findViewById(R.id.childrentext);
                        TextView baby_tv = (TextView) viw.findViewById(R.id.babytext);
                        adult_tv.setText(adult_str);
                        children_tv.setText(children_str);
                        baby_tv.setText(baby_str);

                        // 決定ボタンを押された時の処理
                        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences pref = getSharedPreferences("Preferences", MODE_PRIVATE);
                                EditText et = (EditText) viw.findViewById(R.id.okasitext);
                                String str = et.getText().toString();
                                int i = Integer.parseInt(str);

                                SharedPreferences.Editor e = pref.edit();
                                e.putInt("okasi_num", i);
                                e.commit();
                            }
                        });
                        Calendar cal = Calendar.getInstance();
                        TextView tv = (TextView) viw.findViewById(R.id.textView30);
                        tv.setText(cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH) + 1) + "月" + cal.get(Calendar.DATE) + "日");
                        alert.setView(viw);
                        alert.show();
                    }
                });

                //ボタン場所指定(ホーム)
                Button btnhome = (Button) findViewById(R.id.button4);
                btnhome.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setClassName("com.example.misakitatsuya.hello_world", "com.example.misakitatsuya.hello_world.MainActivity");
                        startActivity(intent);
                    }
                });

                //ボタン場所指定(備蓄品)
                Button btnbichiku = (Button) findViewById(R.id.button10);
                btnbichiku.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setClassName("com.example.misakitatsuya.hello_world", "com.example.misakitatsuya.hello_world.bichiku");
                        startActivity(intent);
                    }
                });

                //ボタン場所指定(設定)
                Button btnsetting = (Button) findViewById(R.id.button11);
                btnsetting.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setClassName("com.example.misakitatsuya.hello_world", "com.example.misakitatsuya.hello_world.setting");
                        startActivity(intent);
                    }
                });
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hijo, menu);
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