package com.hiddenvariable.utils;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.pairip.VMRunner;
import com.unity3d.player.UnityPlayer;

/* JADX INFO: loaded from: classes4.dex */
public class LocalNotifications extends BroadcastReceiver {
    private static final String kApp = "appClass";
    private static final String kId = "id";
    private static final String kImage = "image";
    private static final String kMessage = "message";
    private static final String kSmallImage = "smallImage";
    private static final String kSound = "sound";
    private static final String kTitle = "title";
    private int currentNotificationId = 0;

    private AlarmManager getAlarmManager(Context context) {
        Object systemService;
        if (context == null || (systemService = context.getSystemService("alarm")) == null || !(systemService instanceof AlarmManager)) {
            return null;
        }
        return (AlarmManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NotificationManager getNotificationManager(Context context) {
        Object systemService;
        if (context == null || (systemService = context.getSystemService("notification")) == null || !(systemService instanceof NotificationManager)) {
            return null;
        }
        return (NotificationManager) systemService;
    }

    public void cancelAll() {
        NotificationManager notificationManager = getNotificationManager(UnityPlayer.currentActivity);
        if (notificationManager == null) {
            Log.d("HVS", "Cancel all notifications failed: no NotificationManager found.");
            return;
        }
        Log.d("HVS", "Cancelling all notifications");
        notificationManager.cancelAll();
        for (int i10 = 0; i10 <= this.currentNotificationId; i10++) {
            cancelNotification(i10);
        }
        this.currentNotificationId = 0;
    }

    public void cancelNotification(int i10) {
        Activity activity = UnityPlayer.currentActivity;
        AlarmManager alarmManager = getAlarmManager(activity);
        if (alarmManager == null) {
            Log.d("HVS", "Cancel notification failed: no AlarmManager found.");
            return;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(activity, i10, new Intent(activity, (Class<?>) LocalNotifications.class), 536870912);
        if (broadcast != null) {
            Log.d("HVS", "Canceling notification " + i10);
            alarmManager.cancel(broadcast);
            broadcast.cancel();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        VMRunner.invoke("KQkKOoT9UZPtgP3e", new Object[]{this, context, intent});
    }

    public void scheduleNotification(int i10, String str, String str2, long j10, boolean z10, String str3, String str4) {
        Activity activity = UnityPlayer.currentActivity;
        Intent intent = new Intent(activity, (Class<?>) LocalNotifications.class);
        intent.putExtra("title", str);
        intent.putExtra("message", str2);
        intent.putExtra("id", i10);
        this.currentNotificationId = Math.max(this.currentNotificationId, i10);
        intent.putExtra(kSound, z10);
        int identifier = activity.getApplicationInfo().icon;
        if (str3 != null) {
            identifier = activity.getResources().getIdentifier(str3, "drawable", activity.getPackageName());
        }
        intent.putExtra("image", identifier);
        if (str4 != null) {
            identifier = activity.getResources().getIdentifier(str4, "drawable", activity.getPackageName());
        }
        intent.putExtra(kSmallImage, identifier);
        intent.putExtra(kApp, activity.getLocalClassName());
        AlarmManager alarmManager = getAlarmManager(activity);
        if (alarmManager == null) {
            Log.d("HVS", "Schedule notification failed: no AlarmManager found.");
            return;
        }
        alarmManager.set(0, System.currentTimeMillis() + j10, PendingIntent.getBroadcast(activity, i10, intent, 268435456));
        Log.d("HVS", "Setting up notification " + i10);
    }
}
