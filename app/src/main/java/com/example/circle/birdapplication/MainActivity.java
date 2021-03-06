package com.example.circle.birdapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Button _loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        _loginBtn = (Button) findViewById(R.id.btn_login);
        _loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CheckEditActivity.class);
                startActivity(intent);
            }
        });
        */
    }

    public void sendInfo (View view) {
        Intent intent = new Intent(this, CheckEditActivity.class);

        EditText username = (EditText) findViewById(R.id.fld_username);
        EditText password = (EditText) findViewById(R.id.fld_pwd);

        StringBuilder sb = new StringBuilder("Username is ");
        sb.append(username.getText().toString());
        sb.append(". Password is ");
        sb.append(password.getText().toString());
        sb.append(".");
        String s = sb.toString();

        intent.putExtra(EXTRA_MESSAGE, s);

        startActivity(intent);
    }

    // public, private, protected; final; static;
    public final static String EXTRA_MESSAGE = "com.example.circle.birdapplication";

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
