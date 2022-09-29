package br.unigran.atividade2telas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView viewHello;
    Button botaoVoltar;

        @Override
            protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

            viewHello = findViewById(R.id.viewHello);
            botaoVoltar = findViewById(R.id.botaoVoltar);

            viewHello.setText(String.format("Olá %s!", getIntent().getStringExtra("nome")));

            acoesComponentes();
    }

        private void acoesComponentes() {
            botaoVoltar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onBackPressed();
            }
        });
    }
}