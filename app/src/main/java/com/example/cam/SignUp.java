package com.example.cam;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
    Button btn_signup;
    EditText edt_fname, edt_lname, edt_username, edt_password, edt_confirmpassword, edt_email, edt_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        /////////// edittexts
        edt_fname = findViewById(R.id.edt_fname);
        edt_lname = findViewById(R.id.edt_lname);
        edt_username = findViewById(R.id.edt_username);
        edt_password = findViewById(R.id.edt_password);
        edt_confirmpassword = findViewById(R.id.edt_confirmpassword);
        edt_phone = findViewById(R.id.edt_phone);
        edt_email = findViewById(R.id.edt_email);

        /////////// buttons
        btn_signup = findViewById(R.id.btn_signup);

        ////////////// convert edt_fname,edt_lname,edt_username,edt_password,edt_confirmpassword,edt_email,edt_phone to strings
        final String fname = edt_fname.getText().toString();
        final String lname = edt_lname.getText().toString();
        final String username = edt_username.getText().toString();
        final String password = edt_password.getText().toString();
        final String confirmpassword = edt_confirmpassword.getText().toString();
        final String email = edt_email.getText().toString();
        final String phone = edt_phone.getText().toString();

        /////////////// signup and go to
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (username.equals("") || password.equals("") || fname.equals("") || lname.equals("") || confirmpassword.equals("") || email.equals("") || phone.equals("")) {
                    Toast.makeText(SignUp.this, "Something in the information that you must fill is empty", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
