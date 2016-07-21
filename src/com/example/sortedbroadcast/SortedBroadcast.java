package com.example.sortedbroadcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/*
 * BroadcastReceiver用于接收程序所发出的Broadcast Intent,与应用程序启动Activity、Service相同的是，程序启动BroadcastReceiver也只需要两步：
 * 1、创建需要启动的BroadcastReceiver的Intent.
 * 2、调用Context的sendBroadcast()或sendOrderedBoradcast()方法来启动指定的BroadcastReceiver。
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
				Intent intent = new Intent(); //创建Intent对象
				intent.setAction("com.helloworld.winson.HELLO_BROADCAST");
				intent.putExtra("msg", "简单的消息");
				sendOrderedBroadcast(intent, null); //发送有序的广播
			}
		});
    }
}
