package com.example.monsterhunteradmin;

import java.util.HashMap;

/**
 * Created by dam2a on 30/01/18.
 */

public class Monster {
    public String name;
    public String desc;

    public String picUrl;
    public String mDetailPic;

    public Monster(String name, String picUrl, String desc, String mDetailPic) {
        this.name = name;
        this.picUrl = picUrl;
        this.desc = desc;
        this.mDetailPic = mDetailPic;
    }
}
