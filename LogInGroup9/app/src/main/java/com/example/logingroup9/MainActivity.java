package com.example.logingroup9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);

    }

    public void verifydata(View view) {
        String strusername = username.getText().toString();
        String strpassword = password.getText().toString();


        if (strusername.equals("jenny") && strpassword.equals("20193736")){

            Intent intent = new Intent(this, JennyData.class);
            startActivity(intent);

        }else if (strusername.equals("ayessa") && strpassword.equals("20192556")){

            Intent intent = new Intent(this, AyessaData.class);
            startActivity(intent);

        }else if (strusername.equals("geomel") && strpassword.equals("20193184")){

            Intent intent = new Intent(this, GeoData.class);
            startActivity(intent);

        }else if (strusername.equals("edrian") && strpassword.equals("20191078")){

            Intent intent = new Intent(this, EdData.class);
            startActivity(intent);

        }else{

            Toast.makeText(this, "Username or Password is Incorrect!", Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}