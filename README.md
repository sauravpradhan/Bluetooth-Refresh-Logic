# Bluetooth-Refresh-Logic
Logic to Refresh Stale bluetooth connection in Android.
Don't use the application directly(You have to have your device paired first). It is just a demo to show how BT connetcion can be refreshed in case it gets stale.

Background:
=============
Sometimes in android when the connection is kept idle for long and we start StartBluetoothSco() we directly get disconnection.
In this case audio won't be routed to BT. From my observation I found that refreshing the BT connection solves the problem.
But dependency is, we have to wait till we get the bluetooth connected receiver.
Use this code in such situation. This is a rare case and I couldn't find any direct android API for refreshing the connction. So I wrote one.


How to use the Demo APP
=============
APK Link:https://drive.google.com/file/d/0Byaspar4S5SEeGhCYTJoQWVoZXM/view?usp=sharing

Pair your device with the BT accessory.
Now open the app and press the refresh button.
You can observe the BT notification in status bar goes off and on. There are even toast messages for the BT events.

If this code is of any use to anybody do star and mention the username:kodered  at least in comments ;) !
