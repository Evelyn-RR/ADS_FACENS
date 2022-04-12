package com.example.exemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EnviarMensagemActivity extends AppCompatActivity {

    EditText textMensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_mensagem);
        textMensagem = (EditText) findViewById(R.id.textMensagem);
    }

    public void btnEnviarMensagemClick(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, textMensagem.getText().toString());
        startActivity(intent);
    }

    public void btnVoltarClick(View view) {
        finish();
    }


}