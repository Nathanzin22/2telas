package br.unigran.atividade2telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {

        EditText campoNome;
        Button botaoEnviar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            campoNome = findViewById(R.id.campoNome);
            botaoEnviar = findViewById(R.id.botaoEnviar);

            acoesComponentes();
    }

        private void acoesComponentes() {
            botaoEnviar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                    intent.putExtra("nome", campoNome.getText().toString());

                    startActivity(intent);
            }
        });
    }
}