package com.example.bt_demo;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

	BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		 registerReceiver(new MyBTReceiver(),
				 new IntentFilter(BluetoothAdapter.ACTION_STATE_CHANGED));
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button = (Button)findViewById(R.id.button1);
		
		button.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mBluetoothAdapter.disable();
			}
		});
		
	}




}
