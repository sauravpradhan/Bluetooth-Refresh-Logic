package com.example.bt_demo;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBTReceiver extends BroadcastReceiver{
	BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Log.d("Saurav:BT", "Inside BT Event Changed");

		int state = intent.getIntExtra(BluetoothAdapter.EXTRA_STATE,
				-1);

		switch(state){
		case BluetoothAdapter.STATE_CONNECTED:
			Toast.makeText(context,
					"BT State:STATE_CONNECTED",
					Toast.LENGTH_SHORT).show();
			break;
		case BluetoothAdapter.STATE_CONNECTING:
			Toast.makeText(context,
					"BT State: STATE_CONNECTING",
					Toast.LENGTH_SHORT).show();
			break;
		case BluetoothAdapter.STATE_DISCONNECTED:
			Toast.makeText(context,
					"BT State: STATE_DISCONNECTED",
					Toast.LENGTH_SHORT).show();
			break;
		case BluetoothAdapter.STATE_DISCONNECTING:
			Toast.makeText(context,
					"BT State: STATE_DISCONNECTING",
					Toast.LENGTH_SHORT).show();
			break;
		case BluetoothAdapter.STATE_OFF:
			Toast.makeText(context,
					"BT State: STATE_OFF",
					Toast.LENGTH_SHORT).show();
			Toast.makeText(context,
					"Re-enabling BT to Refresh...",
					Toast.LENGTH_SHORT).show();
			
					mBluetoothAdapter.enable();
			break;
		case BluetoothAdapter.STATE_ON:
			Toast.makeText(context,
					"BT State: STATE_ON",
					Toast.LENGTH_SHORT).show();
			break;
		case BluetoothAdapter.STATE_TURNING_OFF:
			Toast.makeText(context,
					"BT State: STATE_TURNING_OFF",
					Toast.LENGTH_SHORT).show();
			break;
		case BluetoothAdapter.STATE_TURNING_ON:
			Toast.makeText(context,
					"BT State: STATE_TURNING_ON",
					Toast.LENGTH_SHORT).show();
			break;
		}
	}

}
