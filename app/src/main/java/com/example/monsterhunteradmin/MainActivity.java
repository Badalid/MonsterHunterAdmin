package com.example.monsterhunteradmin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();

        String monsterKey = ref.child("monsters/data").push().getKey();
        ref.child("monsters/data").child(monsterKey).setValue(new Monster("Rathalos", "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/rathalos.png?alt=media&token=e0b4be4b-11b9-429a-b517-9c79535af234"));
        ref.child("monsters/all").child(monsterKey).setValue(true);

        monsterKey = ref.child("monsters/data").push().getKey();
        ref.child("monsters/data").child(monsterKey).setValue(new Monster("Anjanath", "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/anjanath.png?alt=media&token=f818b3b9-044d-42cb-9b17-e839b221e405"));
        ref.child("monsters/all").child(monsterKey).setValue(true);

        monsterKey = ref.child("monsters/data").push().getKey();
        ref.child("monsters/data").child(monsterKey).setValue(new Monster("Nergigante", "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/nergigante.png?alt=media&token=65b463c6-2c2e-496c-9c9a-40241e9267ff"));
        ref.child("monsters/all").child(monsterKey).setValue(true);

    }
}
