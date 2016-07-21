package com.example.sortedbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/*
 * 对有序广播来说，它会按优先级依次触发每个BroadcastReceiver的onReceiver()方法
 * 下面是第二个BroadcastReceiver
 */

public class MyReceiver2 extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub

		Bundle bundle = getResultExtras(true);
		String first = bundle.getString("first"); //解析前一个BroadcastReceiver所存入的key为first的消息
		Toast.makeText(context, "第一个Broadcast存入的消息为：" + first, Toast.LENGTH_LONG).show();
	}

}
