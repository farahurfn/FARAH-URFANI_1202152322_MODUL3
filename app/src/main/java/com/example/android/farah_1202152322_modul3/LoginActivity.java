package com.example.android.farah_1202152322_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //inisiasi variabel
    private EditText user;
    private EditText pwd;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //pemanggilan id dari xml
        user = (EditText) findViewById(R.id.username);
        pwd = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
    }
    public void login(View view) { //method onClick
        if (user.getText().toString().equals("EAD")&& pwd.getText().toString().equals("MOBILE") ) { //set password dan username
            Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show(); //jika password dan username sesuai maka muncul toast login berhasil
            Intent intentlogin = new Intent(this, MainActivity.class); // pindah ke halaman selanjutnya
            startActivity(intentlogin);
        } else {
            Toast.makeText(this,"Login Gagal", Toast.LENGTH_SHORT).show(); //jika gagal login akan muncul toast login gagal
        }
    }
}
