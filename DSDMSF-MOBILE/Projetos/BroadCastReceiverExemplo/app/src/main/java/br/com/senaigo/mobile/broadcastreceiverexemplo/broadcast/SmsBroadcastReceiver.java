package br.com.senaigo.mobile.broadcastreceiverexemplo.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

import java.util.Objects;

import br.com.senaigo.mobile.broadcastreceiverexemplo.activities.SmsActivity;

/**
 * Created by bruno on 02/04/2016.
 */
public class SmsBroadcastReceiver extends BroadcastReceiver {

    //http://www.simplecodestuffs.com/what-is-pdu-in-android/
    public static final String SMS_BUNDLE = "pdus";

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();

        if(bundle!=null){
            Object[] sms = (Object[]) bundle.get(SMS_BUNDLE);
            String smsMessageStr = "";
            for(int i= 0; i<sms.length;i++){
                //SmsMessage smsMessage =
                // SmsMessage.createFromPdu((byte[]) sms[i],"3gpp"); //API 23

                SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) sms[i]);

                String smsBody = smsMessage.getMessageBody().toString();
                String address = smsMessage.getOriginatingAddress();

                smsMessageStr += "SMS From: " + address + "\n";
                smsMessageStr += smsBody + "\n";
            }

            Toast.makeText(context,smsMessageStr, Toast.LENGTH_SHORT).show();

            //Iremos atualizar a interface com a mensagem
            SmsActivity inst = SmsActivity.instance();
            inst.updateList(smsMessageStr);
        }
    }
}