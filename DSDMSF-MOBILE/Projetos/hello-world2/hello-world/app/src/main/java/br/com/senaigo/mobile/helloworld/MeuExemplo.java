package br.com.senaigo.mobile.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MeuExemplo extends AppCompatActivity {

    protected EditText txtNome;
    protected EditText txtEmail;
    protected EditText txtTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meu_exemplo);
    }

    public void mostrar(View view) {
        //Captura campos da tela
        this.txtNome = findViewById(R.id.txtNome);
        this.txtEmail = findViewById(R.id.txtEmail);
        this.txtTelefone = findViewById(R.id.txtTelefone);

        //Captura o texto do campo EditText
        String nome = this.txtNome.getText().toString();
        String email = this.txtEmail.getText().toString();
        String telefone = this.txtTelefone.getText().toString();

        //Formato de saída a ser exibido ao usuário
        String dados = "O dados digitados foram: %s \n %s \n %s \n";

        //Saida
        String texto = String.format(dados,nome,email,telefone);

        //Mostrar mensagem ao  usuário
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();

    }
}
