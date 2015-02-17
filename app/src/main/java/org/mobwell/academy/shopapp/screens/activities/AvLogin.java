package org.mobwell.academy.shopapp.screens.activities;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.mobwell.academy.shopapp.R;

public class AvLogin extends Activity {

    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_av_login);

        username = (EditText) findViewById(R.id.shopapp_login_user);
        password = (EditText) findViewById(R.id.shopapp_login_pass);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_av_login, menu);
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

    public void onClickRegister(View view) {
        Intent srcRegister = new Intent(this, AvSignUp.class);
        startActivity(srcRegister);
    }

    public void onClickLogin(View view) {
        if (username.getText().toString().trim().isEmpty() || username.getText().toString().trim().isEmpty()) {
            Toast.makeText(this, this.getString(R.string.login_incomplete), Toast.LENGTH_SHORT).show();
        } else {

            // TODO : Código de Login

            Intent srcEnter = new Intent(this, AvLoja.class);
            startActivity(srcEnter);
        }
    }
}
