package com.example.administrator.activitytest1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstAvtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Log.d("FirstAvtivity","onCreate execute");

        Button btn = findViewById(R.id.button_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //通用式写法(显示Intent)
                Intent it  = new Intent(v.getContext(),Third_Activity.class);
                Toast.makeText(FirstAvtivity.this,"You clicked Button 1",Toast.LENGTH_SHORT).show();
                startActivity(it);
                //隐式Intent（妙用）
//                Intent it = new Intent(Intent.ACTION_VIEW);
//                it.setData(Uri.parse("tel:15111833197"));
//                startActivity(it);
            }
        });
        Button btn1 = findViewById(R.id.button_6);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //通用式写法(显示Intent)
                Intent it  = new Intent(v.getContext(),MainActivity.class);
                Toast.makeText(FirstAvtivity.this,"You clicked Button 1",Toast.LENGTH_SHORT).show();
                startActivity(it);
                //隐式Intent（妙用）
//                Intent it1 = new Intent(Intent.ACTION_VIEW);
//                it1.setData(Uri.parse("tel:15111833197"));
//                startActivity(it1);
            }
        });
        //设置到菜单栏上的按钮
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
            case R.id.add_item:
                Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
                default:
        }
        return true;
    }
}
