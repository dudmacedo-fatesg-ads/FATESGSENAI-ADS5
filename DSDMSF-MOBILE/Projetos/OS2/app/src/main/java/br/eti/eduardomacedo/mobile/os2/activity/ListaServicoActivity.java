package br.eti.eduardomacedo.mobile.os2.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.eti.eduardomacedo.mobile.os2.R;
import br.eti.eduardomacedo.mobile.os2.adapter.ExpandableListAdapter;

public class ListaServicoActivity extends Activity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servico_listar);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Rota 01");
        listDataHeader.add("Rota 02");
        listDataHeader.add("Rota 03");

        // Adding child data
        List<String> rota01 = new ArrayList<String>();
        rota01.add("863275-6 - Recadastro BCC");
        rota01.add("863276-1 - Recadastro BCC");
        rota01.add("863435-6 - Vistoria Esgoto");
        rota01.add("871049-1 - Recadastro BCC");

        List<String> rota02 = new ArrayList<String>();
        rota02.add("863275-6 - Recadastro BCC");
        rota02.add("863276-1 - Recadastro BCC");
        rota02.add("863435-6 - Vistoria Esgoto");
        rota02.add("871049-1 - Recadastro BCC");

        List<String> rota03 = new ArrayList<String>();
        rota03.add("863275-6 - Recadastro BCC");
        rota03.add("863276-1 - Recadastro BCC");
        rota03.add("863435-6 - Vistoria Esgoto");
        rota03.add("871049-1 - Recadastro BCC");

        listDataChild.put(listDataHeader.get(0), rota01); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rota02);
        listDataChild.put(listDataHeader.get(2), rota03);
    }
}
