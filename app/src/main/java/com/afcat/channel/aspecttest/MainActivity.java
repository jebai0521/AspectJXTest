package com.afcat.channel.aspecttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.afcat.channel.library.ClassA;
import com.afcat.channel.libraryaar.ClassAAR;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toggleAspect(View view) {
        Toast.makeText(this, "123", Toast.LENGTH_LONG).show();
    }

    public void toggleAspectLibrary(View view) {
        ClassA a = new ClassA();
        a.setBusinessName("hehe");
        Toast.makeText(this, "toggleAspectLibrary", Toast.LENGTH_LONG).show();
    }

    public void toggleAspectLibraryAAR(View view) {
        ClassAAR a = new ClassAAR();
        a.setBusinessNameAAR("xixi");
        Toast.makeText(this, "toggleAspectLibraryAAR", Toast.LENGTH_LONG).show();
    }
}
