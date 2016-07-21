package com.example.sortedbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/*
 * ������㲥��˵�����ᰴ���ȼ����δ���ÿ��BroadcastReceiver��onReceiver()����
 * �����ǵ�һ��BroadcastReceiver
 */

public class MyReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) 
	{
		// TODO Auto-generated method stub
		Toast.makeText(context, 
				"���յ���Intent��ActionΪ�� " + intent.getAction() + "\n��Ϣ�����ǣ� " + intent.getStringExtra("msg"), 5000).show();
		Bundle bundle = new Bundle();      //����һ��Bundle���󣬲���������
		bundle.putString("first", "��һ��BroadcastReceiver�������Ϣ");
		setResultExtras(bundle);     //��bundle��������
		abortBroadcast();      //ȡ��Broadcast����������ע�͵���һ��
	}

}
