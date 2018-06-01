//package com.example.monsterhunteradmin;
//
//import android.content.res.AssetManager;
//import android.net.Uri;
//import android.provider.ContactsContract;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//import com.google.android.gms.tasks.OnFailureListener;
//import com.google.android.gms.tasks.OnSuccessListener;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.storage.FirebaseStorage;
//import com.google.firebase.storage.StorageReference;
//import com.google.firebase.storage.UploadTask;
//
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.UUID;
//
//public class UploadActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_upload);
//
//        //EditText nombreMonstruo
//        //Button abrirGaleria
//        //
//
//        try {
//            for(String filePath : getAssets().list("MonsterImages")){
//                StorageReference imageRef = FirebaseStorage.getInstance().getReference().child("MonsterImages/" + file);
//
//                // is =>> InputStream del filePath
//
//                UploadTask uploadTask = imageRef.putStream(is);
//
//                uploadTask.addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
//                    @Override
//                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
//                        Uri downloadUrl = taskSnapshot.getDownloadUrl();
//                        FirebaseDatabase.getInstance().getReference().child("imagenes").child(fileName --- jpg);
//                    }
//                });
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
