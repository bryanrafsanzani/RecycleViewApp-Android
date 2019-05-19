package org.bryanrafsanzani.recycleviewapp;

import java.util.ArrayList;

/**
 * Created by Bryan
 * Rafsanzani License
 * =========================================
 * RecycleViewApp
 * Copyright (C) 5/19/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Bryan Rafsanzani
 * E-mail   : bryanrafsanzani46@gmail.com
 * Line     : bryanraf
 * Phone    : 08777521019
 * Majors   : D3 Teknik Informatika 2016
 * Campus   : Telkom University
 * -----------------------------------------
 * id.rafsanzani.bryan
 */
public class PresidentData {
    public static String[][] data = new String[][]{
            {"Soekarno", "Presiden Pertama RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"},
            {"Soeharto", "Presiden Kedua RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/President_Suharto%2C_1993.jpg/468px-President_Suharto%2C_1993.jpg"},
            {"Bacharuddin Jusuf Habibie", "Presiden Ketiga RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Bacharuddin_Jusuf_Habibie_official_portrait.jpg/520px-Bacharuddin_Jusuf_Habibie_official_portrait.jpg"},
            {"Abdurrahman Wahid", "Presiden Keempat RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/35/President_Abdurrahman_Wahid_-_Indonesia.jpg/486px-President_Abdurrahman_Wahid_-_Indonesia.jpg"},
            {"Megawati Soekarnoputri", "Presiden Kelima RI", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/President_Megawati_Sukarnoputri_-_Indonesia.jpg/540px-President_Megawati_Sukarnoputri_-_Indonesia.jpg"},
            {"Susilo Bambang Yudhoyono", "Presiden Keenam RI", "https://upload.wikimedia.org/wikipedia/commons/5/58/Presiden_Susilo_Bambang_Yudhoyono.png"},
            {"Joko Widodo", "Presiden Ketujuh RI", "https://upload.wikimedia.org/wikipedia/commons/1/1c/Joko_Widodo_2014_official_portrait.jpg"}
    };

    public static ArrayList<President> getListData(){
        President president = null;
        ArrayList<President> list = new ArrayList<>();
        for(String[] aData : data){
            president = new President();
            president.setName(aData[0]);
            president.setRemarks(aData[1]);
            president.setPhoto(aData[2]);
            list.add(president);
        }
        return list;
    }
}
