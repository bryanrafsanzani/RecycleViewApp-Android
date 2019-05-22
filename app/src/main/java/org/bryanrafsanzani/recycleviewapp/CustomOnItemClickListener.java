package org.bryanrafsanzani.recycleviewapp;

import android.view.View;

/**
 * Created by Bryan
 * Rafsanzani License
 * =========================================
 * RecycleViewApp
 * Copyright (C) 5/23/2019.
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
public class CustomOnItemClickListener implements View.OnClickListener {
    private int position;
    private OnItemClickCallback onItemClickCallback;

    CustomOnItemClickListener(int position, OnItemClickCallback onItemClickCallback){
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, position);

    }

    public interface OnItemClickCallback{
        void onItemClicked(View view, int position);
    }
}
