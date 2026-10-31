package com.unity.androidnotifications;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.android.gms.ads.AdError;
import com.unity3d.player.UnityPlayer;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class UnityNotificationManager extends BroadcastReceiver {
    public static final String KEY_BIG_CONTENT_DESCRIPTION = "com.unity.BigContentDescription";
    public static final String KEY_BIG_CONTENT_TITLE = "com.unity.BigContentTytle";
    public static final String KEY_BIG_LARGE_ICON = "com.unity.BigLargeIcon";
    public static final String KEY_BIG_PICTURE = "com.unity.BigPicture";
    public static final String KEY_BIG_SHOW_WHEN_COLLAPSED = "com.unity.BigShowWhenCollapsed";
    public static final String KEY_BIG_SUMMARY_TEXT = "com.unity.BigSummaryText";
    public static final String KEY_CHANNEL_ID = "channelID";
    public static final String KEY_FIRE_TIME = "fireTime";
    public static final String KEY_ID = "id";
    public static final String KEY_INTENT_DATA = "data";
    public static final String KEY_LARGE_ICON = "largeIcon";
    public static final String KEY_NOTIFICATION = "unityNotification";
    public static final String KEY_NOTIFICATION_DISMISSED = "com.unity.NotificationDismissed";
    public static final String KEY_NOTIFICATION_ID = "com.unity.NotificationID";
    public static final String KEY_REPEAT_INTERVAL = "repeatInterval";
    public static final String KEY_SHOW_IN_FOREGROUND = "com.unity.showInForeground";
    public static final String KEY_SMALL_ICON = "smallIcon";
    static final String NOTIFICATION_CHANNELS_SHARED_PREFS = "UNITY_NOTIFICATIONS";
    static final String NOTIFICATION_CHANNELS_SHARED_PREFS_KEY = "ChannelIDs";
    static final String NOTIFICATION_IDS_SHARED_PREFS = "UNITY_STORED_NOTIFICATION_IDS";
    static final String NOTIFICATION_IDS_SHARED_PREFS_KEY = "UNITY_NOTIFICATION_IDS";
    private static final int PERMISSION_STATUS_ALLOWED = 1;
    private static final int PERMISSION_STATUS_DENIED = 2;
    private static final int PERMISSION_STATUS_NOTIFICATIONS_BLOCKED_FOR_APP = 5;
    static final String TAG_UNITY = "UnityNotifications";
    static UnityNotificationManager mUnityNotificationManager;
    private UnityNotificationBackgroundThread mBackgroundThread;
    private NotificationCallback mNotificationCallback;
    private Random mRandom;
    private ConcurrentHashMap<Integer, Notification.Builder> mScheduledNotifications;
    private HashSet<Integer> mVisibleNotifications;
    private Context mContext = null;
    private Activity mActivity = null;
    private Class mOpenActivity = null;
    private int mExactSchedulingSetting = -1;

    private Notification buildNotificationForSending(Class cls, Notification.Builder builder) {
        int i10 = builder.getExtras().getInt("id", -1);
        Intent intent = new Intent(this.mContext, (Class<?>) cls);
        intent.addFlags(805306368);
        intent.putExtra(KEY_NOTIFICATION_ID, i10);
        builder.setContentIntent(getActivityPendingIntent(i10, intent, 0));
        finalizeNotificationForDisplay(builder);
        return builder.build();
    }

    private Intent buildNotificationIntent() {
        Intent intent = new Intent(this.mContext, (Class<?>) UnityNotificationManager.class);
        intent.setFlags(268468224);
        return intent;
    }

    private boolean canScheduleExactAlarms(AlarmManager alarmManager) {
        Bundle appMetadata;
        int i10 = Build.VERSION.SDK_INT;
        if (this.mExactSchedulingSetting < 0 && (appMetadata = getAppMetadata()) != null) {
            this.mExactSchedulingSetting = appMetadata.getInt("com.unity.androidnotifications.exact_scheduling", 1);
        }
        if (this.mExactSchedulingSetting == 0) {
            return false;
        }
        if (i10 < 31) {
            return true;
        }
        return alarmManager.canScheduleExactAlarms();
    }

    private Notification.Builder deserializeNotificationBuilder(Integer num) {
        Object objDeserializeNotification = UnityNotificationUtilities.deserializeNotification(this.mContext, this.mContext.getSharedPreferences(getSharedPrefsNameByNotificationId(num.toString()), 0));
        if (objDeserializeNotification == null) {
            return null;
        }
        return objDeserializeNotification instanceof Notification ? UnityNotificationUtilities.recoverBuilder(this.mContext, (Notification) objDeserializeNotification) : (Notification.Builder) objDeserializeNotification;
    }

    private void finalizeNotificationForDisplay(Notification.Builder builder) {
        String string = builder.getExtras().getString(KEY_SMALL_ICON);
        Object iconForUri = getIconForUri(string);
        if (iconForUri != null) {
            builder.setSmallIcon((Icon) iconForUri);
        } else {
            int iFindResourceIdInContextByName = UnityNotificationUtilities.findResourceIdInContextByName(this.mContext, string);
            if (iFindResourceIdInContextByName == 0) {
                iFindResourceIdInContextByName = this.mContext.getApplicationInfo().icon;
            }
            builder.setSmallIcon(iFindResourceIdInContextByName);
        }
        Object icon = getIcon(builder.getExtras().getString(KEY_LARGE_ICON));
        if (icon != null) {
            if (icon instanceof Icon) {
                builder.setLargeIcon((Icon) icon);
            } else {
                builder.setLargeIcon((Bitmap) icon);
            }
        }
        setupBigPictureStyle(builder);
    }

    private Set<String> findInvalidNotificationIds(Set<String> set) {
        Intent intentBuildNotificationIntent = buildNotificationIntent();
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (getBroadcastPendingIntent(Integer.valueOf(str).intValue(), intentBuildNotificationIntent, 536870912) == null) {
                hashSet.add(str);
            }
        }
        for (StatusBarNotification statusBarNotification : getNotificationManager().getActiveNotifications()) {
            hashSet.remove(String.valueOf(statusBarNotification.getId()));
        }
        Activity activity = UnityPlayer.currentActivity;
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent.hasExtra(KEY_NOTIFICATION_ID)) {
                hashSet.remove(String.valueOf(intent.getExtras().getInt(KEY_NOTIFICATION_ID)));
            }
        }
        return hashSet;
    }

    private int generateUniqueId() {
        int iNextInt = 0;
        do {
            iNextInt += this.mRandom.nextInt(1000);
        } while (this.mScheduledNotifications.containsKey(Integer.valueOf(iNextInt)));
        return iNextInt;
    }

    private PendingIntent getActivityPendingIntent(int i10, Intent intent, int i11) {
        return PendingIntent.getActivity(this.mContext, i10, intent, i11 | 67108864);
    }

    private Bundle getAppMetadata() {
        try {
            return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private PendingIntent getBroadcastPendingIntent(int i10, Intent intent, int i11) {
        return PendingIntent.getBroadcast(this.mContext, i10, intent, i11 | 67108864);
    }

    private Object getIcon(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return BitmapFactory.decodeFile(str);
        }
        Object iconForUri = getIconForUri(str);
        return iconForUri != null ? iconForUri : getIconFromResources(str, false);
    }

    private Object getIconForUri(String str) {
        if (str == null || str.length() == 0 || str.indexOf("://") <= 0) {
            return null;
        }
        return Icon.createWithContentUri(str);
    }

    private Object getIconFromResources(String str, boolean z10) {
        int iFindResourceIdInContextByName = UnityNotificationUtilities.findResourceIdInContextByName(this.mContext, str);
        if (iFindResourceIdInContextByName != 0) {
            return !z10 ? Icon.createWithResource(this.mContext, iFindResourceIdInContextByName) : BitmapFactory.decodeResource(this.mContext.getResources(), iFindResourceIdInContextByName);
        }
        return null;
    }

    public static String getNotificationChannelId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    public static Integer getNotificationColor(Notification notification) {
        if (Build.VERSION.SDK_INT < 26 || notification.extras.containsKey("android.colorized")) {
            return Integer.valueOf(notification.color);
        }
        return null;
    }

    public static int getNotificationGroupAlertBehavior(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    static synchronized UnityNotificationManager getNotificationManagerImpl(Context context) {
        if (mUnityNotificationManager == null) {
            UnityNotificationManager unityNotificationManager = new UnityNotificationManager();
            mUnityNotificationManager = unityNotificationManager;
            unityNotificationManager.mVisibleNotifications = new HashSet<>();
            mUnityNotificationManager.mScheduledNotifications = new ConcurrentHashMap<>();
        }
        mUnityNotificationManager.mContext = context.getApplicationContext();
        return mUnityNotificationManager;
    }

    private Object getNotificationOrBuilderForIntent(Intent intent) {
        Object notificationOrIdForIntent = getNotificationOrIdForIntent(intent);
        if (!(notificationOrIdForIntent instanceof Integer)) {
            return notificationOrIdForIntent;
        }
        Integer num = (Integer) notificationOrIdForIntent;
        Notification.Builder builder = this.mScheduledNotifications.get(num);
        return builder == null ? deserializeNotificationBuilder(num) : builder;
    }

    private Object getNotificationOrIdForIntent(Intent intent) {
        if (intent.hasExtra(KEY_NOTIFICATION_ID)) {
            return Integer.valueOf(intent.getExtras().getInt(KEY_NOTIFICATION_ID));
        }
        if (intent.hasExtra(KEY_NOTIFICATION)) {
            return intent.getParcelableExtra(KEY_NOTIFICATION);
        }
        return null;
    }

    private synchronized Set<String> getScheduledNotificationIDs() {
        return this.mContext.getSharedPreferences(NOTIFICATION_IDS_SHARED_PREFS, 0).getStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, new HashSet());
    }

    private static String getSharedPrefsNameByChannelId(String str) {
        return String.format("unity_notification_channel_%s", str);
    }

    static String getSharedPrefsNameByNotificationId(String str) {
        return String.format("u_notification_data_%s", str);
    }

    private void initialize(Activity activity, NotificationCallback notificationCallback) {
        this.mContext = activity.getApplicationContext();
        this.mActivity = activity;
        this.mNotificationCallback = notificationCallback;
        if (this.mScheduledNotifications == null) {
            this.mScheduledNotifications = new ConcurrentHashMap<>();
        }
        UnityNotificationBackgroundThread unityNotificationBackgroundThread = this.mBackgroundThread;
        if (unityNotificationBackgroundThread == null || !unityNotificationBackgroundThread.isAlive()) {
            this.mBackgroundThread = new UnityNotificationBackgroundThread(this, this.mScheduledNotifications);
        }
        if (this.mRandom == null) {
            this.mRandom = new Random();
        }
        if (this.mVisibleNotifications == null) {
            this.mVisibleNotifications = new HashSet<>();
        }
        getAppMetadata();
        Class<?> openAppActivity = UnityNotificationUtilities.getOpenAppActivity(this.mContext);
        this.mOpenActivity = openAppActivity;
        if (openAppActivity == null) {
            throw new RuntimeException("Failed to determine Activity to be opened when tapping notification");
        }
        if (this.mBackgroundThread.isAlive()) {
            return;
        }
        this.mBackgroundThread.start();
    }

    private static boolean isInForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i10 = runningAppProcessInfo.importance;
        return i10 == 100 || i10 == 200;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNotification$0(Integer num) {
        Notification.Builder builderDeserializeNotificationBuilder = deserializeNotificationBuilder(num);
        if (builderDeserializeNotificationBuilder == null) {
            Log.e(TAG_UNITY, "Failed to recover builder, can't send notification");
        } else {
            notify(num.intValue(), builderDeserializeNotificationBuilder);
        }
    }

    private Bitmap loadBitmap(String str) {
        try {
            return BitmapFactory.decodeStream(this.mContext.getContentResolver().openInputStream(Uri.parse(str)));
        } catch (Exception e10) {
            Log.e(TAG_UNITY, "Failed to load image " + str, e10);
            return null;
        }
    }

    private static NotificationChannelWrapper notificationChannelToWrapper(Object obj) {
        NotificationChannel notificationChannel = (NotificationChannel) obj;
        NotificationChannelWrapper notificationChannelWrapper = new NotificationChannelWrapper();
        notificationChannelWrapper.f12703id = notificationChannel.getId();
        notificationChannelWrapper.name = notificationChannel.getName().toString();
        notificationChannelWrapper.importance = notificationChannel.getImportance();
        notificationChannelWrapper.description = notificationChannel.getDescription();
        notificationChannelWrapper.enableLights = notificationChannel.shouldShowLights();
        notificationChannelWrapper.enableVibration = notificationChannel.shouldVibrate();
        notificationChannelWrapper.canBypassDnd = notificationChannel.canBypassDnd();
        notificationChannelWrapper.canShowBadge = notificationChannel.canShowBadge();
        notificationChannelWrapper.vibrationPattern = notificationChannel.getVibrationPattern();
        notificationChannelWrapper.lockscreenVisibility = notificationChannel.getLockscreenVisibility();
        notificationChannelWrapper.group = notificationChannel.getGroup();
        return notificationChannelWrapper;
    }

    private void scheduleNotificationIntentAlarm(long j10, long j11, PendingIntent pendingIntent) {
        AlarmManager alarmManager = (AlarmManager) this.mContext.getSystemService("alarm");
        if (j10 > 0) {
            alarmManager.setInexactRepeating(0, j11, j10, pendingIntent);
        } else if (canScheduleExactAlarms(alarmManager)) {
            alarmManager.setExactAndAllowWhileIdle(0, j11, pendingIntent);
        } else {
            alarmManager.set(0, j11, pendingIntent);
        }
    }

    public static void setNotificationColor(Notification.Builder builder, int i10) {
        if (i10 != 0) {
            builder.setColor(i10);
            if (Build.VERSION.SDK_INT >= 26) {
                builder.setColorized(true);
            }
        }
    }

    public static void setNotificationGroupAlertBehavior(Notification.Builder builder, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setGroupAlertBehavior(i10);
        }
    }

    public static void setNotificationIcon(Notification.Builder builder, String str, String str2) {
        if (str2 == null || (str2.length() == 0 && builder.getExtras().getString(str) != null)) {
            builder.getExtras().remove(str);
        } else {
            builder.getExtras().putString(str, str2);
        }
    }

    public static void setNotificationUsesChronometer(Notification.Builder builder, boolean z10) {
        builder.setUsesChronometer(z10);
    }

    private void showNotification(Intent intent) {
        Object notificationOrIdForIntent = getNotificationOrIdForIntent(intent);
        if (notificationOrIdForIntent == null) {
            return;
        }
        if (notificationOrIdForIntent instanceof Notification) {
            Notification notification = (Notification) notificationOrIdForIntent;
            notify(notification.extras.getInt("id", -1), notification);
            return;
        }
        final Integer num = (Integer) notificationOrIdForIntent;
        Notification.Builder builder = this.mScheduledNotifications.get(num);
        if (builder != null) {
            notify(num.intValue(), builder);
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.unity.androidnotifications.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12705a.lambda$showNotification$0(num);
                }
            });
        }
    }

    public int areNotificationsEnabled() {
        boolean z10 = Build.VERSION.SDK_INT < 33 || this.mContext.checkCallingOrSelfPermission("android.permission.POST_NOTIFICATIONS") == 0;
        boolean zAreNotificationsEnabled = getNotificationManager().areNotificationsEnabled();
        if (z10) {
            return zAreNotificationsEnabled ? 1 : 5;
        }
        return 2;
    }

    public void cancelAllNotifications() {
        getNotificationManager().cancelAll();
    }

    public void cancelAllPendingNotificationIntents() {
        this.mBackgroundThread.enqueueCancelAllNotifications();
    }

    public void cancelDisplayedNotification(int i10) {
        getNotificationManager().cancel(i10);
    }

    public void cancelPendingNotification(int i10) {
        this.mBackgroundThread.enqueueCancelNotification(i10);
    }

    void cancelPendingNotificationIntent(int i10) {
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(i10, new Intent(this.mContext, (Class<?>) UnityNotificationManager.class), 536870912);
        if (broadcastPendingIntent != null) {
            ((AlarmManager) this.mContext.getSystemService("alarm")).cancel(broadcastPendingIntent);
            broadcastPendingIntent.cancel();
        }
    }

    public boolean checkIfPendingNotificationIsRegistered(int i10) {
        return getBroadcastPendingIntent(i10, new Intent(this.mActivity, (Class<?>) UnityNotificationManager.class), 536870912) != null;
    }

    public int checkNotificationStatus(int i10) {
        for (StatusBarNotification statusBarNotification : getNotificationManager().getActiveNotifications()) {
            if (i10 == statusBarNotification.getId()) {
                return 2;
            }
        }
        return (this.mScheduledNotifications.containsKey(Integer.valueOf(i10)) || checkIfPendingNotificationIsRegistered(i10)) ? 1 : 0;
    }

    public Notification.Builder createNotificationBuilder(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Notification.Builder(this.mContext, str);
        }
        Notification.Builder builder = new Notification.Builder(this.mContext);
        NotificationChannelWrapper notificationChannel = getNotificationChannel(str);
        long[] jArr = notificationChannel.vibrationPattern;
        int i10 = -1;
        if (jArr == null || jArr.length <= 0) {
            builder.setDefaults(-1);
        } else {
            builder.setDefaults(5);
            builder.setVibrate(notificationChannel.vibrationPattern);
        }
        builder.setVisibility(notificationChannel.lockscreenVisibility);
        int i11 = notificationChannel.importance;
        if (i11 == 0) {
            i10 = -2;
        } else if (i11 != 2) {
            i10 = (i11 == 3 || i11 != 4) ? 0 : 2;
        }
        builder.setPriority(i10);
        builder.getExtras().putString(KEY_CHANNEL_ID, str);
        return builder;
    }

    synchronized void deleteExpiredNotificationIntent(String str) {
        this.mContext.getSharedPreferences(getSharedPrefsNameByNotificationId(str), 0).edit().clear().apply();
    }

    public void deleteNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            getNotificationManager().deleteNotificationChannel(str);
            return;
        }
        SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(NOTIFICATION_CHANNELS_SHARED_PREFS, 0);
        Set<String> stringSet = sharedPreferences.getStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, new HashSet());
        if (stringSet.contains(str)) {
            HashSet hashSet = new HashSet(stringSet);
            hashSet.remove(str);
            SharedPreferences.Editor editorClear = sharedPreferences.edit().clear();
            editorClear.putStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, hashSet);
            editorClear.apply();
            this.mContext.getSharedPreferences(getSharedPrefsNameByChannelId(str), 0).edit().clear().apply();
        }
    }

    public void deleteNotificationChannelGroup(String str) {
        if (str == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            getNotificationManager().deleteNotificationChannelGroup(str);
            return;
        }
        for (NotificationChannelWrapper notificationChannelWrapper : getNotificationChannels()) {
            if (str.equals(notificationChannelWrapper.group)) {
                deleteNotificationChannel(notificationChannelWrapper.f12703id);
            }
        }
    }

    public NotificationChannelWrapper[] getNotificationChannels() {
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            List notificationChannels = getNotificationManager().getNotificationChannels();
            if (notificationChannels.size() == 0) {
                return null;
            }
            NotificationChannelWrapper[] notificationChannelWrapperArr = new NotificationChannelWrapper[notificationChannels.size()];
            Iterator it = notificationChannels.iterator();
            while (it.hasNext()) {
                notificationChannelWrapperArr[i10] = notificationChannelToWrapper((NotificationChannel) it.next());
                i10++;
            }
            return notificationChannelWrapperArr;
        }
        Set<String> stringSet = this.mContext.getSharedPreferences(NOTIFICATION_CHANNELS_SHARED_PREFS, 0).getStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, new HashSet());
        if (stringSet.size() == 0) {
            return null;
        }
        NotificationChannelWrapper[] notificationChannelWrapperArr2 = new NotificationChannelWrapper[stringSet.size()];
        Iterator<String> it2 = stringSet.iterator();
        while (it2.hasNext()) {
            notificationChannelWrapperArr2[i10] = getNotificationChannel(it2.next());
            i10++;
        }
        return notificationChannelWrapperArr2;
    }

    public Notification getNotificationFromIntent(Intent intent) {
        if (intent.hasExtra(KEY_NOTIFICATION_ID)) {
            int i10 = intent.getExtras().getInt(KEY_NOTIFICATION_ID);
            for (StatusBarNotification statusBarNotification : getNotificationManager().getActiveNotifications()) {
                if (statusBarNotification.getId() == i10) {
                    return statusBarNotification.getNotification();
                }
            }
        }
        Object notificationOrBuilderForIntent = getNotificationOrBuilderForIntent(intent);
        if (notificationOrBuilderForIntent == null) {
            return null;
        }
        return notificationOrBuilderForIntent instanceof Notification ? (Notification) notificationOrBuilderForIntent : ((Notification.Builder) notificationOrBuilderForIntent).build();
    }

    public NotificationManager getNotificationManager() {
        return (NotificationManager) this.mContext.getSystemService("notification");
    }

    public int getTargetSdk() {
        return this.mContext.getApplicationInfo().targetSdkVersion;
    }

    synchronized List<Notification.Builder> loadSavedNotifications() {
        ArrayList arrayList;
        Set<String> scheduledNotificationIDs = getScheduledNotificationIDs();
        arrayList = new ArrayList();
        HashSet<String> hashSet = new HashSet();
        for (String str : scheduledNotificationIDs) {
            Object objDeserializeNotification = UnityNotificationUtilities.deserializeNotification(this.mContext, this.mContext.getSharedPreferences(getSharedPrefsNameByNotificationId(str), 0));
            Notification.Builder builderRecoverBuilder = objDeserializeNotification != null ? objDeserializeNotification instanceof Notification.Builder ? (Notification.Builder) objDeserializeNotification : UnityNotificationUtilities.recoverBuilder(this.mContext, (Notification) objDeserializeNotification) : null;
            if (builderRecoverBuilder != null) {
                arrayList.add(builderRecoverBuilder);
            } else {
                hashSet.add(str);
            }
        }
        if (hashSet.size() > 0) {
            HashSet hashSet2 = new HashSet(scheduledNotificationIDs);
            for (String str2 : hashSet) {
                hashSet2.remove(str2);
                deleteExpiredNotificationIntent(str2);
            }
            saveScheduledNotificationIDs(hashSet2);
        }
        return arrayList;
    }

    void notify(int i10, Notification.Builder builder) {
        Class<?> openAppActivity = this.mOpenActivity;
        if (openAppActivity == null && (openAppActivity = UnityNotificationUtilities.getOpenAppActivity(this.mContext)) == null) {
            Log.e(TAG_UNITY, "Activity not found, cannot show notification");
            return;
        }
        Notification notificationBuildNotificationForSending = buildNotificationForSending(openAppActivity, builder);
        if (notificationBuildNotificationForSending != null) {
            notify(i10, notificationBuildNotificationForSending);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        getNotificationManagerImpl(context).onReceive(intent);
    }

    void performNotificationHousekeeping(Set<String> set) {
        Log.d(TAG_UNITY, "Checking for invalid notification IDs still hanging around");
        Set<String> setFindInvalidNotificationIds = findInvalidNotificationIds(set);
        HashSet hashSet = new HashSet(set);
        for (String str : setFindInvalidNotificationIds) {
            hashSet.remove(str);
            this.mScheduledNotifications.remove(str);
        }
        Iterator<String> it = setFindInvalidNotificationIds.iterator();
        while (it.hasNext()) {
            deleteExpiredNotificationIntent(it.next());
        }
    }

    void performNotificationScheduling(int i10, Notification.Builder builder, boolean z10) {
        Bundle extras = builder.getExtras();
        long j10 = extras.getLong(KEY_REPEAT_INTERVAL, -1L);
        long j11 = extras.getLong(KEY_FIRE_TIME, -1L);
        boolean z11 = j11 - Calendar.getInstance().getTime().getTime() < 1000;
        if (!z11 || j10 > 0) {
            if (z11) {
                j11 += j10;
            }
            Intent intentBuildNotificationIntent = buildNotificationIntent();
            if (intentBuildNotificationIntent != null) {
                saveNotification(builder.build(), z10);
                scheduleAlarmWithNotification(builder, intentBuildNotificationIntent, j11);
            }
        }
        if (z11) {
            notify(i10, buildNotificationForSending(this.mOpenActivity, builder));
        }
    }

    public void registerNotificationChannel(String str, String str2, int i10, String str3, boolean z10, boolean z11, boolean z12, boolean z13, long[] jArr, int i11, String str4) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, i10);
            notificationChannel.setDescription(str3);
            notificationChannel.enableLights(z10);
            notificationChannel.enableVibration(z11);
            notificationChannel.setBypassDnd(z12);
            notificationChannel.setShowBadge(z13);
            notificationChannel.setVibrationPattern(jArr);
            notificationChannel.setLockscreenVisibility(i11);
            notificationChannel.setGroup(str4);
            getNotificationManager().createNotificationChannel(notificationChannel);
            return;
        }
        SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(NOTIFICATION_CHANNELS_SHARED_PREFS, 0);
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, new HashSet()));
        hashSet.add(str);
        SharedPreferences.Editor editorClear = sharedPreferences.edit().clear();
        editorClear.putStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, hashSet);
        editorClear.apply();
        SharedPreferences.Editor editorEdit = this.mContext.getSharedPreferences(getSharedPrefsNameByChannelId(str), 0).edit();
        editorEdit.putString("title", str2);
        editorEdit.putInt("importance", i10);
        editorEdit.putString("description", str3);
        editorEdit.putBoolean("enableLights", z10);
        editorEdit.putBoolean("enableVibration", z11);
        editorEdit.putBoolean("canBypassDnd", z12);
        editorEdit.putBoolean("canShowBadge", z13);
        editorEdit.putString("vibrationPattern", Arrays.toString(jArr));
        editorEdit.putInt("lockscreenVisibility", i11);
        editorEdit.putString("group", str4);
        editorEdit.apply();
    }

    public void registerNotificationChannelGroup(String str, String str2, String str3) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(str, str2);
            if (i10 >= 28) {
                notificationChannelGroup.setDescription(str3);
            }
            getNotificationManager().createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    synchronized void saveNotification(Notification notification, boolean z10) {
        UnityNotificationUtilities.serializeNotification(this.mContext.getSharedPreferences(getSharedPrefsNameByNotificationId(Integer.toString(notification.extras.getInt("id", -1))), 0), notification, z10);
    }

    synchronized void saveScheduledNotificationIDs(Set<String> set) {
        SharedPreferences.Editor editorClear = this.mContext.getSharedPreferences(NOTIFICATION_IDS_SHARED_PREFS, 0).edit().clear();
        editorClear.putStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, set);
        editorClear.apply();
    }

    void scheduleAlarmWithNotification(Notification.Builder builder, Intent intent, long j10) {
        Bundle extras = builder.getExtras();
        int i10 = extras.getInt("id", -1);
        long j11 = extras.getLong(KEY_REPEAT_INTERVAL, -1L);
        this.mScheduledNotifications.put(Integer.valueOf(i10), builder);
        intent.putExtra(KEY_NOTIFICATION_ID, i10);
        scheduleNotificationIntentAlarm(j11, j10, getBroadcastPendingIntent(i10, intent, 134217728));
    }

    public int scheduleNotification(Notification.Builder builder, boolean z10) {
        int i10;
        Bundle extras = builder.getExtras();
        if (extras.containsKey("id")) {
            i10 = builder.getExtras().getInt("id", -1);
        } else {
            int iGenerateUniqueId = generateUniqueId();
            extras.putInt("id", iGenerateUniqueId);
            i10 = iGenerateUniqueId;
        }
        this.mBackgroundThread.enqueueNotification(i10, builder, z10, this.mScheduledNotifications.putIfAbsent(Integer.valueOf(i10), builder) == null);
        return i10;
    }

    public void setupBigPictureStyle(Notification.Builder builder, String str, String str2, String str3, String str4, String str5, boolean z10) {
        Bundle extras = builder.getExtras();
        if (str2 == null || str2.length() == 0) {
            return;
        }
        extras.putString(KEY_BIG_LARGE_ICON, str);
        extras.putString(KEY_BIG_PICTURE, str2);
        extras.putString(KEY_BIG_CONTENT_TITLE, str3);
        extras.putString(KEY_BIG_SUMMARY_TEXT, str5);
        extras.putString(KEY_BIG_CONTENT_DESCRIPTION, str4);
        extras.putBoolean(KEY_BIG_SHOW_WHEN_COLLAPSED, z10);
    }

    public void showNotificationSettings(String str) {
        Intent intent;
        if (Build.VERSION.SDK_INT < 26) {
            intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.mContext.getPackageName(), null));
        } else {
            if (str == null || str.length() <= 0) {
                intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            } else {
                Intent intent2 = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                intent2.putExtra("android.provider.extra.CHANNEL_ID", str);
                intent = intent2;
            }
            intent.putExtra("android.provider.extra.APP_PACKAGE", this.mContext.getPackageName());
        }
        intent.addFlags(268435456);
        this.mActivity.startActivity(intent);
    }

    public NotificationChannelWrapper getNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = getNotificationManagerImpl(this.mContext).getNotificationManager().getNotificationChannel(str);
            if (notificationChannel == null) {
                return null;
            }
            return notificationChannelToWrapper(notificationChannel);
        }
        SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(getSharedPrefsNameByChannelId(str), 0);
        NotificationChannelWrapper notificationChannelWrapper = new NotificationChannelWrapper();
        notificationChannelWrapper.f12703id = str;
        notificationChannelWrapper.name = sharedPreferences.getString(cTJaRZ.jsuW, AdError.UNDEFINED_DOMAIN);
        notificationChannelWrapper.importance = sharedPreferences.getInt("importance", 3);
        notificationChannelWrapper.description = sharedPreferences.getString("description", AdError.UNDEFINED_DOMAIN);
        notificationChannelWrapper.enableLights = sharedPreferences.getBoolean("enableLights", false);
        notificationChannelWrapper.enableVibration = sharedPreferences.getBoolean("enableVibration", false);
        notificationChannelWrapper.canBypassDnd = sharedPreferences.getBoolean("canBypassDnd", false);
        notificationChannelWrapper.canShowBadge = sharedPreferences.getBoolean("canShowBadge", false);
        notificationChannelWrapper.lockscreenVisibility = sharedPreferences.getInt("lockscreenVisibility", 1);
        notificationChannelWrapper.group = sharedPreferences.getString("group", null);
        String[] strArrSplit = sharedPreferences.getString("vibrationPattern", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI).split(",");
        int length = strArrSplit.length;
        long[] jArr = new long[length];
        if (length > 1) {
            for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                try {
                    jArr[i10] = Long.parseLong(strArrSplit[i10]);
                } catch (NumberFormatException unused) {
                    jArr[i10] = 1;
                }
            }
        }
        notificationChannelWrapper.vibrationPattern = length > 1 ? jArr : null;
        return notificationChannelWrapper;
    }

    public void onReceive(Intent intent) {
        showNotification(intent);
    }

    private void notify(int i10, Notification notification) {
        boolean z10 = notification.extras.getBoolean(KEY_SHOW_IN_FOREGROUND, true);
        if (!isInForeground() || z10) {
            getNotificationManager().notify(i10, notification);
        }
        if (notification.extras.getLong(KEY_REPEAT_INTERVAL, -1L) <= 0) {
            this.mScheduledNotifications.remove(Integer.valueOf(i10));
            cancelPendingNotificationIntent(i10);
        }
        try {
            NotificationCallback notificationCallback = this.mNotificationCallback;
            if (notificationCallback != null) {
                notificationCallback.onSentNotification(notification);
            }
        } catch (RuntimeException unused) {
            Log.w(TAG_UNITY, "Can not invoke OnNotificationReceived event when the app is not running!");
        }
    }

    public static synchronized UnityNotificationManager getNotificationManagerImpl(Activity activity, NotificationCallback notificationCallback) {
        if (mUnityNotificationManager == null) {
            mUnityNotificationManager = new UnityNotificationManager();
        }
        mUnityNotificationManager.initialize(activity, notificationCallback);
        return mUnityNotificationManager;
    }

    public boolean canScheduleExactAlarms() {
        return canScheduleExactAlarms((AlarmManager) this.mContext.getSystemService("alarm"));
    }

    void scheduleAlarmWithNotification(Notification.Builder builder) {
        scheduleAlarmWithNotification(builder, buildNotificationIntent(), builder.getExtras().getLong(KEY_FIRE_TIME, 0L));
    }

    private void setupBigPictureStyle(Notification.Builder builder) {
        Bundle extras = builder.getExtras();
        String string = extras.getString(KEY_BIG_PICTURE);
        if (string == null) {
            return;
        }
        Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
        Object icon = getIcon(extras.getString(KEY_BIG_LARGE_ICON));
        if (icon != null) {
            if (icon instanceof Icon) {
                bigPictureStyle.bigLargeIcon((Icon) icon);
            } else {
                bigPictureStyle.bigLargeIcon((Bitmap) icon);
            }
        }
        if (string.charAt(0) == '/') {
            bigPictureStyle.bigPicture(BitmapFactory.decodeFile(string));
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (string.indexOf("://") <= 0) {
                Object iconFromResources = getIconFromResources(string, i10 < 31);
                if (i10 >= 31 && (iconFromResources instanceof Icon)) {
                    bigPictureStyle.bigPicture((Icon) iconFromResources);
                } else if (iconFromResources instanceof Bitmap) {
                    bigPictureStyle.bigPicture((Bitmap) iconFromResources);
                }
            } else if (i10 >= 31) {
                bigPictureStyle.bigPicture(Icon.createWithContentUri(string));
            } else {
                Bitmap bitmapLoadBitmap = loadBitmap(string);
                if (bitmapLoadBitmap != null) {
                    bigPictureStyle.bigPicture(bitmapLoadBitmap);
                }
            }
        }
        bigPictureStyle.setBigContentTitle(extras.getString(KEY_BIG_CONTENT_TITLE));
        bigPictureStyle.setSummaryText(extras.getString(KEY_BIG_SUMMARY_TEXT));
        if (Build.VERSION.SDK_INT >= 31) {
            bigPictureStyle.setContentDescription(extras.getString(KEY_BIG_CONTENT_DESCRIPTION));
            bigPictureStyle.showBigPictureWhenCollapsed(extras.getBoolean(KEY_BIG_SHOW_WHEN_COLLAPSED, false));
        }
        builder.setStyle(bigPictureStyle);
    }
}
