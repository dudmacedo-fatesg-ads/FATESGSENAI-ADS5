package br.com.senaigo.mobile.broadcastreceiverexemplo.activities;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.senaigo.mobile.broadcastreceiverexemplo.R;

public class SmsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private static final String TAG = "SMS_SENAI";

    private static SmsActivity instancia;
    List<String> smsMessageList = new ArrayList<String>();
    ListView smsListView;
    ArrayAdapter arrayAdapter;

    public static SmsActivity instance(){
        return instancia;
    }

    public void onStart(){
        super.onStart();
        instancia = this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        smsListView = (ListView)findViewById(R.id.listView);
        //Parâmetros para o método ArrayAdapater
        //São 3 parâmetros campeão.
        //1. Contexto (this)
        //2. Layout (Você importa da classe R, porque a referencia é um inteiro(int)
        //3. List ou coleção de objetos
        arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,smsMessageList);

        //Popula a coleção de valores na listview do xml via API.
        smsListView.setAdapter(arrayAdapter);

        //Passo o contexto da view para o método para que ao
        //clicar em um item da lista, podemos executar uma ação.
        smsListView.setOnItemClickListener(this);

        refreshSmsInbox();

    }

    /**
     * http://www.androiddesignpatterns.com/2012/06/content-resolvers-and-content-providers.html
     */
    private void refreshSmsInbox() {
        //iremos trabalhar com contentResolver que é primo do
        //Content Provider
        ContentResolver contentResolver = getContentResolver();
        Cursor smsInboxCursor = contentResolver.query(
                Uri.parse("content://sms/inbox"), null, null, null, null);
        int indexBody = smsInboxCursor.getColumnIndex("body");
        int indexAddress = smsInboxCursor.getColumnIndex("address");

        if(indexBody < 0 || !smsInboxCursor.moveToFirst()){
            return;
        }
        arrayAdapter.clear();

        do {
            String message = "SMS From: "+smsInboxCursor.getString(indexAddress) +
                    "\n" + smsInboxCursor.getString(indexBody)+ "\n";
            //Preenche o array com a lista de mensagens;
            arrayAdapter.add(message);

        }while(smsInboxCursor.moveToNext());

    }

    public void updateList(final String smsMessage){
        arrayAdapter.insert(smsMessage,0);
        arrayAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        try {

            String[] smsMessages = smsMessageList.get(position).split("\n");
            String address = smsMessages[0];
            String smsMessage = "";

            for (int i=1;i<smsMessage.length();i++){
                smsMessage+=smsMessages[i];
            }

            String smsMessageReceive = address + "\n" + smsMessage;

            Toast.makeText(this,smsMessageReceive,Toast.LENGTH_SHORT).show();

        }catch (Exception ex) {
            Log.e(TAG,"Erro: "+ex.getMessage());
        }

    }
}
