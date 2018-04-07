package br.eti.eduardomacedo.mobile.cadastropessoas.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.eti.eduardomacedo.mobile.cadastropessoas.R;
import br.eti.eduardomacedo.mobile.cadastropessoas.entity.Pessoa;

public class PessoaAdapter extends BaseAdapter {

    Context context;
    List<Pessoa> colecao;
    LayoutInflater inflater;

    public PessoaAdapter(final Context applicationContext,
                         final List<Pessoa> colecao,
                         final LayoutInflater inflater) {
        this.context = applicationContext;
        this.colecao = colecao;
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return (colecao != null) ? colecao.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return (colecao != null) ? colecao.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.item_pessoa, parent, false);
        }

        Pessoa pessoa = (Pessoa) getItem(position);

        TextView campoNome, campoEmail;

        campoNome = convertView.findViewById(R.id.txtItemNome);
        campoEmail = convertView.findViewById(R.id.txtItemEmail);

        campoNome.setText(pessoa.getNome());
        campoEmail.setText(pessoa.getEmail());

        return convertView;
    }
}
