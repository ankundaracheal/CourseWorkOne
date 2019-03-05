package com.techsplint.ahscomplearn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"App State Started",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "App State Paused", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"App State Stopped",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"App State Ended",Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.home:
                Intent i = new Intent(MainActivity.this, MainActivity.class);
                MainActivity.this.startActivity(i);
                break;
            case R.id.course:
                Intent j = new Intent(MainActivity.this, Courses.class);
                MainActivity.this.startActivity(j);
                break;
            case R.id.logout:
                Intent k = new Intent(MainActivity.this, Login.class);
                MainActivity.this.startActivity(k);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void goCourse(View view) {
        Intent i = new Intent(MainActivity.this, Courses.class);
        MainActivity.this.startActivity(i);
    }

}
