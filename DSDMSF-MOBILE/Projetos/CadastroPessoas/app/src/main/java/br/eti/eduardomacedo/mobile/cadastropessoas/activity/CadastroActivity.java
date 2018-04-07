package br.eti.eduardomacedo.mobile.cadastropessoas.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SimpleAdapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

import br.eti.eduardomacedo.mobile.cadastropessoas.R;
import br.eti.eduardomacedo.mobile.cadastropessoas.entity.Pessoa;

public class CadastroActivity extends AppCompatActivity {

    protected ListView minhaLista;
    private EditText txtNome;
    private EditText txtEmail;
    private EditText txtTelefone;
    private EditText txtSenha;
    private EditText txtConfirmaSenha;
    private List<Pessoa> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void adicionar(View view) {
//        adicionarArrayAdapter();
        adicionarSimpleAdapter();
}

//    public void adicionarArrayAdapter() {
//        txtNome = findViewById(R.id.txtNome);
//        txtEmail = findViewById(R.id.txtEmail);
//        txtTelefone = findViewById(R.id.txtTelefone);
//        txtSenha = findViewById(R.id.txtSenha);
//        txtConfirmaSenha = findViewById(R.id.txtConfirmaSenha);
//
//        String nome, email, telefone, senha, confirmaSenha;
//
//        nome = txtNome.getText().toString();
//        email = txtEmail.getText().toString();
//        telefone = txtTelefone.getText().toString();
//        senha = txtSenha.getText().toString();
//        confirmaSenha = txtConfirmaSenha.getText().toString();
//
//        Pessoa pessoa = new Pessoa(nome, email, telefone, senha);
//
//        lista.add(pessoa);
//
//        // Convertendo lista
//
//        List<String> colecaoArrayAdapter = new ArrayList<>();
//        List<HashMap<String, String>> colecao = new ArrayList<>();
//        for (Pessoa p : lista) {
//            HashMap<String, String> map = new HashMap<>();
//            map.put("nome", p.getNome());
//            map.put("email", p.getEmail());
//            map.put("telefone", p.getTelefone());
//            map.put("senha", p.getSenha());
//
//            colecao.add(map);
//            colecaoArrayAdapter.add(p.getNome());
//        }
//
//        // Fazer o mapeamento da coleção com o layout do item
//        String[] de = {"nome", "email", "telefone"};
//        int[] para = {R.id.txtItemNome, R.id.txtItemEmail, R.id.txtItemTelefone};
//
//        // SAIDA
//
//        // ARRAY ADAPTER
//        ArrayAdapter<String> arrayAdapter =
//                new ArrayAdapter<String>(this, R.layout.item, colecaoArrayAdapter);
//        minhaLista.setAdapter(arrayAdapter);
//    }

    public void adicionarSimpleAdapter() {
        txtNome = findViewById(R.id.txtNome);
        txtEmail = findViewById(R.id.txtEmail);
        txtTelefone = findViewById(R.id.txtTelefone);
        txtSenha = findViewById(R.id.txtSenha);
        txtConfirmaSenha = findViewById(R.id.txtConfirmaSenha);

        String nome, email, telefone, senha, confirmaSenha;

        nome = txtNome.getText().toString();
        email = txtEmail.getText().toString();
        telefone = txtTelefone.getText().toString();
        senha = txtSenha.getText().toString();
        confirmaSenha = txtConfirmaSenha.getText().toString();

        Pessoa pessoa = new Pessoa(nome, email, telefone, senha);

        lista.add(pessoa);

        // Convertendo lista
        List<HashMap<String, String>> colecao = new ArrayList<>();
        for (Pessoa p : lista) {
            HashMap<String, String> map = new HashMap<>();
            map.put("nome", p.getNome());
            map.put("email", p.getEmail());
            map.put("telefone", p.getTelefone());
            map.put("senha", p.getSenha());

            colecao.add(map);
        }

        // Fazer o mapeamento da coleção com o layout do item
        String[] de = {"nome", "email", "telefone"};
        int[] para = {R.id.txtItemNome, R.id.txtItemEmail, R.id.txtItemTelefone};

        // SAIDA

        // SIMPLE ADAPTER
        SimpleAdapter adapter = new SimpleAdapter(this, colecao, R.layout.item, de, para);

        minhaLista = findViewById(R.id.minhaLista);
        minhaLista.setAdapter(adapter);
    }

    public void carregar(View view) {

    }
}
