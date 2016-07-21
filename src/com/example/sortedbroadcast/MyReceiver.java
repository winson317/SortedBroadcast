package com.example.sortedbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/*
 * 对有序广播来说，它会按优先级依次触发每个BroadcastReceiver的onReceiver()方法
 * 下面是第一个BroadcastReceiver
 */

public class MyReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) 
	{
		// TODO Auto-generated method stub
		Toast.makeText(context, 
				"接收到的Intent的Action为： " + intent.getAction() + "\n消息内容是： " + intent.getStringExtra("msg"), 5000).show();
		Bundle bundle = new Bundle();      //创建一个Bundle对象，并存入数据
		bundle.putString("first", "第一个BroadcastReceiver存入的消息");
		setResultExtras(bundle);     //将bundle存入结果中
		abortBroadcast();      //取消Broadcast继续传播。注释掉试一试
	}

}
