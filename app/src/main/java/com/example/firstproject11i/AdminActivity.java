package com.example.firstproject11i;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class AdminActivity extends AppCompatActivity {

    ImageView imgv;
    ConstraintLayout container;
    List<Contacts> contactsList;
    RecyclerView rv_contacts;
    ContactsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        imgv = findViewById(R.id.imgv_admin);
        container = findViewById(R.id.container);
        rv_contacts = findViewById(R.id.rv);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_scale_animation);
        container.startAnimation(animation);

        contactsList = new ArrayList<>();
        contactsList.add(new Contacts(R.drawable.ic_contact, "Вася"));
        contactsList.add(new Contacts(R.drawable.ic_contact, "Коля"));
        contactsList.add(new Contacts(R.drawable.ic_contact, "Витя"));
        contactsList.add(new Contacts(R.drawable.ic_contact, "Олег"));
        contactsList.add(new Contacts(R.drawable.ic_contact, "Игорь"));
        contactsList.add(new Contacts(R.drawable.ic_contact, "Иван"));

        adapter = new ContactsAdapter(contactsList, this);
        rv_contacts.setAdapter(adapter);
    }
}
