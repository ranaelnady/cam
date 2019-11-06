package com.example.cam;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    TextView txt_forget_password, txt_create_account;
    EditText ed_username, ed_password;
    Button btu_signin, btu_show_password;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //////////// textviews
        txt_forget_password = findViewById(R.id.txt_forget_password);
        txt_create_account = findViewById(R.id.txt_create_account);
        /////////// edittexts
        ed_username = findViewById(R.id.ed_username);
        ed_password = findViewById(R.id.ed_password);
        /////////// buttons
        btu_signin = findViewById(R.id.btu_signin);
        btu_show_password = findViewById(R.id.btu_show_password);

        ///////////////  make underline in text forget password , create account
        txt_forget_password.setPaintFlags(txt_forget_password.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        txt_create_account.setPaintFlags(txt_create_account.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        /////////////// get username and password
        final String username = ed_username.getText().toString();
        final String password = ed_password.getText().toString();
        /////////////// go to sign up page
        txt_create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup = new Intent(login.this, SignUp.class);
                startActivity(signup);
            }
        });

        /////////////// go to forget password page
        txt_forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent signup=new Intent(login.this,SignUp.class);
                // startActivity(signup);
            }
        });
        /////////////// show and hide password
        btu_show_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                if (counter % 2 == 0) {
                    ed_password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    btu_show_password.setBackgroundResource(R.drawable.show_password);
                } else {

                    ed_password.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    btu_show_password.setBackgroundResource(R.drawable.show_password_off);
                }
            }
        });
        /////////////// signin and go to
        btu_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (username.equals("") || password.equals("")) {
                    Toast.makeText(login.this, "the password or username is empty", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
