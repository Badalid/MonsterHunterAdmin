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

//        String weaponKey = ref.child("weapons/data").push().getKey();
//        ref.child("weapons/data").child(weaponKey).setValue(new Monster("Great Sword",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2Fgs.png?alt=media&token=9c6c6319-1615-4a59-9e90-54f404e23d3e",
//                "gs",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FGS%2Fgsflow.png?alt=media&token=cf7346ed-4cf0-4da8-bc08-75e350ce2eb3"));
//        ref.child("weapons/data").child(weaponKey).child("weaponPics/url1").setValue("https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FGS%2Fgs2.jpg?alt=media&token=e7472ffe-5f59-463c-aff3-5a084173e44c");
//        ref.child("weapons/data").child(weaponKey).child("weaponPics/url2").setValue("https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FGS%2Fgs3.jpg?alt=media&token=db4c4e5f-1fe7-48b4-b3e0-b517780d7532");
//        ref.child("weapons/data").child(weaponKey).child("weaponPics/url3").setValue("https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FGS%2Fgs4.jpg?alt=media&token=4c278194-b508-455c-a71e-711943234370");
//        ref.child("weapons/all").child(weaponKey).setValue(true);
//
//        weaponKey = ref.child("weapons/data").push().getKey();
//        ref.child("weapons/data").child(weaponKey).setValue(new Monster("Long Sword",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2Fls.png?alt=media&token=33375cee-48bc-47d3-b215-92cad2483fb4",
//                "ls",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FLS%2Fls1.png?alt=media&token=c1e6b4d5-8a84-4a9d-b214-f2b104da97bb"));
//        ref.child("weapons/data/weaponPics").setValue("https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FGS%2Fgs4.jpg?alt=media&token=4c278194-b508-455c-a71e-711943234370");
//        ref.child("weapons/data/weaponPics").setValue("https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FGS%2Fgs4.jpg?alt=media&token=4c278194-b508-455c-a71e-711943234370");
//        ref.child("weapons/data/weaponPics").setValue("https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FGS%2Fgs4.jpg?alt=media&token=4c278194-b508-455c-a71e-711943234370");
//        ref.child("weapons/data/weaponPics").setValue("https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FGS%2Fgs4.jpg?alt=media&token=4c278194-b508-455c-a71e-711943234370");
//        ref.child("weapons/data/weaponPics").setValue("https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FGS%2Fgs4.jpg?alt=media&token=4c278194-b508-455c-a71e-711943234370");
//        ref.child("weapons/all").child(weaponKey).setValue(true);
//
//        weaponKey = ref.child("weapons/data").push().getKey();
//        ref.child("weapons/data").child(weaponKey).setValue(new Monster("Sword and Shield",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2Fsas.png?alt=media&token=c85c6459-94a3-44fa-b2e0-0813cca6c7dc",
//                "sas",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FSAS%2Fsas1.png?alt=media&token=4a4bf8f9-fb59-40bf-a0da-b68cd7f4c848"));
//        ref.child("weapons/data/weaponPics").setValue("https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FSAS%2Fsas2.jpg?alt=media&token=2dabdb60-51a3-4eb4-b7ea-a5da5ca7ca6c");
//        ref.child("weapons/data/weaponPics").setValue("https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FGS%2Fgs4.jpg?alt=media&token=4c278194-b508-455c-a71e-711943234370");
//        ref.child("weapons/data/weaponPics").setValue("https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FGS%2Fgs4.jpg?alt=media&token=4c278194-b508-455c-a71e-711943234370");
//        ref.child("weapons/data/weaponPics").setValue("https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FGS%2Fgs4.jpg?alt=media&token=4c278194-b508-455c-a71e-711943234370");
//        ref.child("weapons/data/weaponPics").setValue("https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2FWeaponPics%2FGS%2Fgs4.jpg?alt=media&token=4c278194-b508-455c-a71e-711943234370");
//        ref.child("weapons/all").child(weaponKey).setValue(true);
//
//
//        weaponKey = ref.child("weapons/data").push().getKey();
//        ref.child("weapons/data").child(weaponKey).setValue(new Monster("Dual Blades",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2Fdb.png?alt=media&token=d6ad70d8-018a-4ef2-9798-3cc005d1d859",
//                "db",
//                " "));
//        ref.child("weapons/all").child(weaponKey).setValue(true);
//
//        weaponKey = ref.child("weapons/data").push().getKey();
//        ref.child("weapons/data").child(weaponKey).setValue(new Monster("Charge Blade",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2Fcb.png?alt=media&token=5c8ce83f-3e03-4127-949f-64234aa15d89",
//                "cb",
//                " "));
//        ref.child("weapons/all").child(weaponKey).setValue(true);
//
//        weaponKey = ref.child("weapons/data").push().getKey();
//        ref.child("weapons/data").child(weaponKey).setValue(new Monster("Hammer",
//"https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2Fham.png?alt=media&token=52725891-c12d-462b-b160-48abb27e4c0f",
//                "hmmr",
//                " "));
//        ref.child("weapons/all").child(weaponKey).setValue(true);
//
//        weaponKey = ref.child("weapons/data").push().getKey();
//        ref.child("weapons/data").child(weaponKey).setValue(new Monster("Hunting Horn",
//"https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2Fhh.png?alt=media&token=4e007f6e-f907-461f-949e-591abc0a68f6",
//                "hh",
//                " "));
//        ref.child("weapons/all").child(weaponKey).setValue(true);
//
//        weaponKey = ref.child("weapons/data").push().getKey();
//        ref.child("weapons/data").child(weaponKey).setValue(new Monster("Lance",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2Flance.png?alt=media&token=4a0134e2-7f5c-4e22-a85f-489cef198edd",
//                "lance",
//                " "));
//        ref.child("weapons/all").child(weaponKey).setValue(true);
//
//        weaponKey = ref.child("weapons/data").push().getKey();
//        ref.child("weapons/data").child(weaponKey).setValue(new Monster("Gun Lance",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2Fgl.png?alt=media&token=11d4c8fd-ba68-4aca-b31d-f2afac3f9fdc",
//                "gl",
//                " "));
//        ref.child("weapons/all").child(weaponKey).setValue(true);
//
//        weaponKey = ref.child("weapons/data").push().getKey();
//
//        ref.child("weapons/data").child(weaponKey).setValue(new Monster("Switch Axe",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2Fsa.png?alt=media&token=d306c9fb-0a7a-46fd-bde3-f779be5e4064",
//                "sa",
//                " "));
//        ref.child("weapons/all").child(weaponKey).setValue(true);
//
//        weaponKey = ref.child("weapons/data").push().getKey();
//        ref.child("weapons/data").child(weaponKey).setValue(new Monster("Insect Glaive",
//"https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2Fig.png?alt=media&token=26f5d67d-b9e0-46d4-afd4-03e561cc6416",
//                "ig",
//                " "));
//        ref.child("weapons/all").child(weaponKey).setValue(true);
//
//        weaponKey = ref.child("weapons/data").push().getKey();
//        ref.child("weapons/data").child(weaponKey).setValue(new Monster("Light Bowgun",
//"https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2Flb.png?alt=media&token=77fdc73b-704c-4029-afeb-2a793a781aa3",
//                "lb",
//                " "));
//        ref.child("weapons/all").child(weaponKey).setValue(true);
//
//        weaponKey = ref.child("weapons/data").push().getKey();
//        ref.child("weapons/data").child(weaponKey).setValue(new Monster("Heavy Bowgun",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2Fhb.png?alt=media&token=73822d95-74ab-4f33-862f-b82a74e4326b",
//                "hb",
//                " "));
//        ref.child("weapons/all").child(weaponKey).setValue(true);
//
//        weaponKey = ref.child("weapons/data").push().getKey();
//        ref.child("weapons/data").child(weaponKey).setValue(new Monster("Bow",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/Weapons%2Fbow.png?alt=media&token=89497f06-e1a8-4a46-8b0a-84823a235225",
//                "b",
//                " "));
//        ref.child("weapons/all").child(weaponKey).setValue(true);

        String monsterKey = ref.child("monsters/data").push().getKey();
//        ref.child("monsters/data").child(monsterKey).setValue(new Monster("Rathalos",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/RecyclerListPics%2Frlist.jpg?alt=media&token=55cdef62-c621-4fdf-a634-ca92b04bb08f",
//                "The king of the sky",
//                " "));
//        ref.child("monsters/all").child(monsterKey).setValue(true);
//
//        monsterKey = ref.child("monsters/data").push().getKey();
//
//        ref.child("monsters/data").child(monsterKey).setValue(new Monster("Anjanath",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/RecyclerListPics%2Falist.jpg?alt=media&token=fba667db-c4ee-4d50-9a8c-e1f19b32b326",
//                "Anjanath the beast",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/DetailFragmentPic%2Famain.png?alt=media&token=12a2fb31-0b80-4508-bc1b-f73932e54fe1"));
//        ref.child("monsters/all").child(monsterKey).setValue(true);
//
//        monsterKey = ref.child("monsters/data").push().getKey();
//
//        ref.child("monsters/data").child(monsterKey).setValue(new Monster(
//                "Nergigante",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/RecyclerListPics%2Fnlist.jpg?alt=media&token=d2c30cfa-1bbb-47c6-8a20-57bbcb6efe6c",
//                "Nergigante is a dragon with a bristly appearance. It is covered in spikes that constantly regrow as they're broken off. It has two massive horns similar to a bull. The monster's hide is primarily black with purple and orange accents. \\n\\nNergigante is able to regenerate at a rapid rate. When the spikes on its tail, arms, or back are broken, they'll immediately grow back. These spikes are white in color when they regrow, but will turn black if left to harden. Once these spikes have hardened, they will deal more damage to foes and repel attacks. These spikes will also be launched from Nergigante's body when it performs certain attacks, giving these attacks more range and making them more dangerous. \\n\\nNergigante is an extremely aggressive monster that'll continue to fight, even if it means harming its own body. It'll attack anything without hesitation, especially if a creature dares attack it. Nergigante is particularly ferocious towards other Elder Dragons, since it feeds on them. \\nNergigante actively hunts and feeds on Elder Dragons to gain massive amounts of energy. Because of this, it will get into turf wars with the Elder Dragons Kushala Daora and Teostra.",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/DetailFragmentPic%2Fnmain.png?alt=media&token=095368ac-ccaf-45b5-be3d-f8c68f11c2db"));
//        ref.child("monsters/all").child(monsterKey).setValue(true);

//            ref.child("monsters/data").child(monsterKey).setValue(new Monster(
//                "Deviljho",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/RecyclerListPics%2Fdlist.png?alt=media&token=982a14ed-081c-4058-b667-174fdbb8efcf",
//                "Deviljho is a very large, bipedal Brute Wyvern characterized by its uniform forest green colouration and muscular upper body.Deviljho has a narrow snout with a large lower jaw, covered in multiple rows of teeth spreading outwards from the mouth. It has massive, powerful hind legs, but tiny, poorly developed forelegs that it rarely utilizes. When provoked, Deviljho's back and shoulder muscles swell considerably. During this period, areas of its skin will take on a bright red colouration.  \\n\\n Deviljho is armed with a powerful set of jaws that it can use to deliver bone-crunching bites to prey and foe alike. In addition, its powerful hind legs allow it to run at relatively high speed and leap considerable distances towards prey. When enraged, Deviljho is capable of producing a mysterious clouded emission which can be shot out of the mouth in a stream at prey. This substance contains the Dragon Element and can be very deadly to hunters as well as other monsters. \\nDeviljho is a nomadic monster, prone to wandering vast distances in search of prey. Its status as a super-predator allows it to overtake the territory of any monster that stands in its path. Because of the extreme amount of energy its body consumes, Deviljho is always in search of food sources. It is known to be cannibalistic, and is also prone to eating prey alive in order to waste as little time as possible in replenishing its energy. ",
//                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/DetailFragmentPic%2Fdmainpng?alt=media&token=fb4cfe53-c20c-49f4-937f-b4951abeb8c5"));
//        ref.child("monsters/all").child(monsterKey).setValue(true);

        ref.child("monsters/data").child(monsterKey).setValue(new Monster(
                "Bazelgeuse",
                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/RecyclerListPics%2Fbazlist.jpg?alt=media&token=b199c8f9-3dcf-4203-bfa7-30fc34ae9013",
                "\n" +
                        "    Elemental damages: N/A (Blast)\n" +
                        "    Weak to mhw-thunder-damageThunder element, and to mhw-dragon-damageDragon andmhw-ice-damageIce to a lesser degree\n" +
                        "    Can inflict mhw-fire-damageFireblight on hunters.\n" +
                        "    Only moderately susceptible to mhw-poison-status-effectPoison, sleep-mhw-status-effectSleep and paralysisParalysis\n" +
                        "    The head is the weakest spot, followed by the tail that hunters can cut\n" +
                        "    Hunters can also target the wings, but they are more resistant than the head and tail\n" +
                        "    The chest portion can be broken\n" +
                        "    Friction and heat cause the pods he drops to explode.  When he's red, they explode immediately. When he's black, he needs to hit them (including his dive bomb) to make them explode. You can also detonate the pods manually by firing slinger ammos or any projectile to the pods.\n" +
                        "    When in the air, will have 2-3 flying passes to drop pods on the ground, and will dive bomb you on the last run and make them explode\n" +
                        "    Has a rarely used front fire blast\n" +
                        "    Likes to dig his head in the ground and charge you, leaving him wide open for attacks when he completes the move\n" +
                        "    The scales that Bazelgeuse scatters explode with tremendous force, making them extremely deadly. Focus on its legs to knock it down, and then knock out its scale-generating organs.\n",
                "https://firebasestorage.googleapis.com/v0/b/monsterhunter-f591a.appspot.com/o/DetailFragmentPic%2Fbmain.png?alt=media&token=4733a4f5-6432-4adf-8b07-e6f798bb65e0"));
        ref.child("monsters/all").child(monsterKey).setValue(true);
    }
}