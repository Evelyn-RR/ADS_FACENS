package com.example.curso_recyclerview.recyclercurso;


import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.curso_recyclerview.R;

public class CursoHolder extends RecyclerView.ViewHolder{
    public TextView nome;
    public TextView valor;
    public TextView dia;
    public ImageButton buttonExcluir;

    public CursoHolder (View itemView){
        super(itemView);
        nome = (TextView) itemView.findViewById(R.id.textNome);
        valor = (TextView) itemView.findViewById(R.id.textValor);
        dia = (TextView) itemView.findViewById(R.id.textDia);
        buttonExcluir = (ImageButton) itemView.findViewById(R.id.buttonExcluir);
    }

}
