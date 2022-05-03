package com.example.projeto_final.holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projeto_final.R;

public class UsuarioHolder extends RecyclerView.ViewHolder {
    public textView txtEmail;
    public textView txtNome;

    public UsuarioHolder(@NonNull View itemView) {
        super(itemView);
        txtEmail = (TextView)itemView.findViewById(R.id.textEmail);
        txtNome = (TextView)itemView.findViewById(R.id.textNome);
    }
}
