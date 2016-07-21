package com.example.sortedbroadcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/*
 * BroadcastReceiver���ڽ��ճ�����������Broadcast Intent,��Ӧ�ó�������Activity��Service��ͬ���ǣ���������BroadcastReceiverҲֻ��Ҫ������
 * 1��������Ҫ������BroadcastReceiver��Intent.
 * 2������Context��sendBroadcast()��sendOrderedBoradcast()����������ָ����BroadcastReceiver��
 */

public class SortedBroadcast extends Activity {
	
	Button send;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        send = (Button)findViewById(R.id.send);
        send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(); //����Intent����
				intent.setAction("com.helloworld.winson.HELLO_BROADCAST");
				intent.putExtra("msg", "�򵥵���Ϣ");
				sendOrderedBroadcast(intent, null); //��������Ĺ㲥
			}
		});
    }
}
