package com.unity.androidnotifications;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.internal.AnalyticsEvents;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import zb.ZTs.GEmOVMyH;

/* JADX INFO: loaded from: classes4.dex */
class UnityNotificationUtilities {
    private static final int INTENT_SERIALIZATION_VERSION = 0;
    private static final int NOTIFICATION_SERIALIZATION_VERSION = 3;
    static final String SAVED_NOTIFICATION_FALLBACK_KEY = "fallback.data";
    static final String SAVED_NOTIFICATION_PRIMARY_KEY = "data";
    static final byte[] UNITY_MAGIC_NUMBER = {85, 77, 78, 78};
    private static final byte[] UNITY_MAGIC_NUMBER_PARCELLED = {85, 77, 78, 80};

    UnityNotificationUtilities() {
    }

    protected static Object deserializeNotification(Context context, SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("data", "");
        if (string != null && string.length() > 0) {
            Object objDeserializeNotification = deserializeNotification(context, Base64.decode(string, 0));
            if (objDeserializeNotification != null) {
                return objDeserializeNotification;
            }
            String string2 = sharedPreferences.getString(SAVED_NOTIFICATION_FALLBACK_KEY, "");
            if (string2 != null && string2.length() > 0) {
                return deserializeNotification(context, Base64.decode(string2, 0));
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x013e A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0143  */
    /* JADX WARN: Code duplicated, block: B:40:0x0169 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x016e  */
    /* JADX WARN: Code duplicated, block: B:44:0x017e A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0184 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x019b A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x01aa A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01b5 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c9 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ce A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01d5 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01e4 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ed A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01f4 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0229 A[Catch: OutOfMemoryError -> 0x0233, Exception -> 0x0239, TRY_LEAVE, TryCatch #3 {Exception -> 0x0239, OutOfMemoryError -> 0x0233, blocks: (B:34:0x0134, B:36:0x013e, B:38:0x0145, B:40:0x0169, B:42:0x0170, B:44:0x017e, B:56:0x01c9, B:58:0x01ce, B:61:0x01d5, B:65:0x01ed, B:67:0x01f4, B:68:0x01f9, B:70:0x0205, B:72:0x020b, B:73:0x0210, B:75:0x021c, B:77:0x0222, B:79:0x0229, B:63:0x01e4, B:45:0x0184, B:47:0x019b, B:50:0x01aa, B:53:0x01b5, B:54:0x01bc), top: B:96:0x0134 }] */
    private static Notification.Builder deserializeNotificationCustom(Context context, DataInputStream dataInputStream) {
        String str;
        String str2;
        long j10;
        boolean z10;
        String str3;
        String str4;
        String str5;
        String strDeserializeString;
        String strDeserializeString2;
        int i10;
        boolean z11;
        String str6;
        String str7;
        String str8;
        String str9;
        long j11;
        String str10;
        boolean z12;
        String string;
        boolean z13;
        long j12;
        boolean z14;
        int i11;
        int i12;
        String strDeserializeString3;
        String strDeserializeString4;
        long j13;
        long j14;
        UnityNotificationManager notificationManagerImpl;
        Notification.Builder builderCreateNotificationBuilder;
        long j15;
        String str11;
        String str12;
        try {
            if (!readAndCheckMagicNumber(dataInputStream, UNITY_MAGIC_NUMBER)) {
                return null;
            }
            int i13 = dataInputStream.readInt();
            if (i13 >= 0 && i13 <= 3) {
                Bundle bundle = i13 < 2 ? (Bundle) deserializeParcelable(dataInputStream) : null;
                try {
                    if (bundle == null) {
                        int i14 = dataInputStream.readInt();
                        String strDeserializeString5 = deserializeString(dataInputStream);
                        String strDeserializeString6 = deserializeString(dataInputStream);
                        String strDeserializeString7 = deserializeString(dataInputStream);
                        String strDeserializeString8 = deserializeString(dataInputStream);
                        j10 = dataInputStream.readLong();
                        long j16 = dataInputStream.readLong();
                        String strDeserializeString9 = deserializeString(dataInputStream);
                        boolean z15 = dataInputStream.readBoolean();
                        z10 = dataInputStream.readBoolean();
                        String strDeserializeString10 = deserializeString(dataInputStream);
                        boolean z16 = i13 > 0 ? dataInputStream.readBoolean() : true;
                        if (i13 >= 3) {
                            String strDeserializeString11 = deserializeString(dataInputStream);
                            if (strDeserializeString11 == null || strDeserializeString11.length() <= 0) {
                                str4 = strDeserializeString11;
                                str3 = null;
                                str5 = null;
                            } else {
                                String strDeserializeString12 = deserializeString(dataInputStream);
                                String strDeserializeString13 = deserializeString(dataInputStream);
                                str7 = strDeserializeString6;
                                str8 = strDeserializeString7;
                                str9 = strDeserializeString8;
                                j11 = j16;
                                str10 = strDeserializeString9;
                                z12 = z15;
                                string = strDeserializeString10;
                                z13 = z16;
                                strDeserializeString = deserializeString(dataInputStream);
                                strDeserializeString2 = deserializeString(dataInputStream);
                                z11 = dataInputStream.readBoolean();
                                str4 = strDeserializeString11;
                                str3 = strDeserializeString12;
                                i10 = i14;
                                str6 = strDeserializeString5;
                                j12 = j10;
                                str5 = strDeserializeString13;
                            }
                            String strDeserializeString14 = deserializeString(dataInputStream);
                            z14 = dataInputStream.readBoolean();
                            if (z14) {
                                i11 = dataInputStream.readInt();
                            } else {
                                i11 = 0;
                            }
                            i12 = dataInputStream.readInt();
                            boolean z17 = dataInputStream.readBoolean();
                            strDeserializeString3 = deserializeString(dataInputStream);
                            boolean z18 = dataInputStream.readBoolean();
                            int i15 = dataInputStream.readInt();
                            strDeserializeString4 = deserializeString(dataInputStream);
                            if (z10) {
                                j13 = dataInputStream.readLong();
                            } else {
                                j13 = 0;
                            }
                            j14 = j13;
                            notificationManagerImpl = UnityNotificationManager.getNotificationManagerImpl(context);
                            builderCreateNotificationBuilder = notificationManagerImpl.createNotificationBuilder(strDeserializeString14);
                            if (bundle != null) {
                                builderCreateNotificationBuilder.setExtras(bundle);
                            } else {
                                builderCreateNotificationBuilder.getExtras().putInt("id", i10);
                                UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_SMALL_ICON, str8);
                                UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_LARGE_ICON, str9);
                                if (j12 != -1) {
                                    builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, j12);
                                }
                                j15 = j11;
                                if (j15 != -1) {
                                    builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, j15);
                                }
                                str11 = string;
                                if (str11 != null) {
                                    builderCreateNotificationBuilder.getExtras().putString("data", str11);
                                }
                                builderCreateNotificationBuilder.getExtras().putBoolean(UnityNotificationManager.KEY_SHOW_IN_FOREGROUND, z13);
                            }
                            if (str6 != null) {
                                builderCreateNotificationBuilder.setContentTitle(str6);
                            }
                            if (str7 != null) {
                                builderCreateNotificationBuilder.setContentText(str7);
                            }
                            str12 = str10;
                            if (str12 != null) {
                                builderCreateNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(str12));
                            } else if (str4 != null) {
                                notificationManagerImpl.setupBigPictureStyle(builderCreateNotificationBuilder, str3, str4, str5, strDeserializeString, strDeserializeString2, z11);
                            }
                            if (z14) {
                                UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, i11);
                            }
                            if (i12 >= 0) {
                                builderCreateNotificationBuilder.setNumber(i12);
                            }
                            builderCreateNotificationBuilder.setAutoCancel(z17);
                            UnityNotificationManager.setNotificationUsesChronometer(builderCreateNotificationBuilder, z12);
                            if (strDeserializeString3 != null && strDeserializeString3.length() > 0) {
                                builderCreateNotificationBuilder.setGroup(strDeserializeString3);
                            }
                            builderCreateNotificationBuilder.setGroupSummary(z18);
                            UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, i15);
                            if (strDeserializeString4 != null && strDeserializeString4.length() > 0) {
                                builderCreateNotificationBuilder.setSortKey(strDeserializeString4);
                            }
                            if (z10) {
                                builderCreateNotificationBuilder.setShowWhen(true);
                                builderCreateNotificationBuilder.setWhen(j14);
                            }
                            return builderCreateNotificationBuilder;
                        }
                        str3 = null;
                        str4 = null;
                        str5 = null;
                        strDeserializeString = str5;
                        strDeserializeString2 = strDeserializeString;
                        z11 = false;
                        i10 = i14;
                        str6 = strDeserializeString5;
                        str7 = strDeserializeString6;
                        str8 = strDeserializeString7;
                        str9 = strDeserializeString8;
                        j11 = j16;
                        str10 = strDeserializeString9;
                        z12 = z15;
                        string = strDeserializeString10;
                        z13 = z16;
                    } else {
                        String string2 = bundle.getString("android.title");
                        String string3 = bundle.getString("android.text");
                        String string4 = bundle.getString(UnityNotificationManager.KEY_SMALL_ICON);
                        String string5 = bundle.getString(UnityNotificationManager.KEY_LARGE_ICON);
                        j10 = bundle.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L);
                        long j17 = bundle.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L);
                        String string6 = bundle.getString("android.bigText");
                        boolean z19 = bundle.getBoolean("android.showChronometer", false);
                        z10 = bundle.getBoolean("android.showWhen", false);
                        str3 = null;
                        str4 = null;
                        str5 = null;
                        strDeserializeString = null;
                        strDeserializeString2 = null;
                        i10 = 0;
                        z11 = false;
                        str6 = string2;
                        str7 = string3;
                        str8 = string4;
                        str9 = string5;
                        j11 = j17;
                        str10 = string6;
                        z12 = z19;
                        string = bundle.getString("data");
                        z13 = true;
                    }
                    String strDeserializeString15 = deserializeString(dataInputStream);
                    z14 = dataInputStream.readBoolean();
                    if (z14) {
                        i11 = dataInputStream.readInt();
                    } else {
                        i11 = 0;
                    }
                    i12 = dataInputStream.readInt();
                    boolean z110 = dataInputStream.readBoolean();
                    strDeserializeString3 = deserializeString(dataInputStream);
                    boolean z111 = dataInputStream.readBoolean();
                    int i16 = dataInputStream.readInt();
                    strDeserializeString4 = deserializeString(dataInputStream);
                    if (z10) {
                        j13 = dataInputStream.readLong();
                    } else {
                        j13 = 0;
                    }
                    j14 = j13;
                    notificationManagerImpl = UnityNotificationManager.getNotificationManagerImpl(context);
                    builderCreateNotificationBuilder = notificationManagerImpl.createNotificationBuilder(strDeserializeString15);
                    if (bundle != null) {
                        builderCreateNotificationBuilder.setExtras(bundle);
                    } else {
                        builderCreateNotificationBuilder.getExtras().putInt("id", i10);
                        UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_SMALL_ICON, str8);
                        UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_LARGE_ICON, str9);
                        if (j12 != -1) {
                            builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, j12);
                        }
                        j15 = j11;
                        if (j15 != -1) {
                            builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, j15);
                        }
                        str11 = string;
                        if (str11 != null) {
                            builderCreateNotificationBuilder.getExtras().putString("data", str11);
                        }
                        builderCreateNotificationBuilder.getExtras().putBoolean(UnityNotificationManager.KEY_SHOW_IN_FOREGROUND, z13);
                    }
                    if (str6 != null) {
                        builderCreateNotificationBuilder.setContentTitle(str6);
                    }
                    if (str7 != null) {
                        builderCreateNotificationBuilder.setContentText(str7);
                    }
                    str12 = str10;
                    if (str12 != null) {
                        builderCreateNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(str12));
                    } else if (str4 != null) {
                        notificationManagerImpl.setupBigPictureStyle(builderCreateNotificationBuilder, str3, str4, str5, strDeserializeString, strDeserializeString2, z11);
                    }
                    if (z14) {
                        UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, i11);
                    }
                    if (i12 >= 0) {
                        builderCreateNotificationBuilder.setNumber(i12);
                    }
                    builderCreateNotificationBuilder.setAutoCancel(z110);
                    UnityNotificationManager.setNotificationUsesChronometer(builderCreateNotificationBuilder, z12);
                    if (strDeserializeString3 != null) {
                        builderCreateNotificationBuilder.setGroup(strDeserializeString3);
                    }
                    builderCreateNotificationBuilder.setGroupSummary(z111);
                    UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, i16);
                    if (strDeserializeString4 != null) {
                        builderCreateNotificationBuilder.setSortKey(strDeserializeString4);
                    }
                    if (z10) {
                        builderCreateNotificationBuilder.setShowWhen(true);
                        builderCreateNotificationBuilder.setWhen(j14);
                    }
                    return builderCreateNotificationBuilder;
                } catch (Exception e10) {
                    e = e10;
                    str2 = "UnityNotifications";
                    Log.e(str2, "Failed to deserialize notification", e);
                    return null;
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    str = r2;
                    Log.e(str, "Failed to deserialize notification", e);
                    return null;
                }
                j12 = j10;
            }
            return null;
        } catch (Exception e12) {
            e = e12;
            str2 = "UnityNotifications";
        } catch (OutOfMemoryError e13) {
            e = e13;
            str = "UnityNotifications";
        }
    }

    private static Notification deserializeNotificationParcelable(DataInputStream dataInputStream) {
        int i10;
        try {
            if (readAndCheckMagicNumber(dataInputStream, UNITY_MAGIC_NUMBER_PARCELLED) && (i10 = dataInputStream.readInt()) >= 0 && i10 <= 0) {
                return (Notification) ((Intent) deserializeParcelable(dataInputStream)).getParcelableExtra(UnityNotificationManager.KEY_NOTIFICATION);
            }
            return null;
        } catch (Exception e10) {
            Log.e("UnityNotifications", "Failed to deserialize notification intent", e10);
            return null;
        } catch (OutOfMemoryError e11) {
            Log.e("UnityNotifications", "Failed to deserialize notification intent", e11);
            return null;
        }
    }

    private static <T extends Parcelable> T deserializeParcelable(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        if (i10 <= 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        if (dataInputStream.read(bArr) != i10) {
            throw new IOException("Insufficient amount of bytes read");
        }
        try {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArr, 0, i10);
            parcelObtain.setDataPosition(0);
            Bundle bundle = (Bundle) parcelObtain.readParcelable(UnityNotificationUtilities.class.getClassLoader());
            parcelObtain.recycle();
            if (bundle != null) {
                return (T) bundle.getParcelable("obj");
            }
        } catch (Exception e10) {
            Log.e("UnityNotifications", "Failed to deserialize parcelable", e10);
        } catch (OutOfMemoryError e11) {
            Log.e("UnityNotifications", "Failed to deserialize parcelable", e11);
        }
        return null;
    }

    private static String deserializeString(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        if (i10 <= 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        if (dataInputStream.read(bArr) == i10) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        throw new IOException("Insufficient amount of bytes read");
    }

    private static Notification.Builder deserializedFromOldIntent(Context context, byte[] bArr) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = new Bundle();
            bundle.readFromParcel(parcelObtain);
            int i10 = bundle.getInt("id", -1);
            String string = bundle.getString(UnityNotificationManager.KEY_CHANNEL_ID);
            String string2 = bundle.getString("textTitle");
            String string3 = bundle.getString("textContent");
            String string4 = bundle.getString("smallIconStr");
            boolean z10 = bundle.getBoolean("autoCancel", false);
            boolean z11 = bundle.getBoolean("usesChronometer", false);
            long j10 = bundle.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L);
            long j11 = bundle.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L);
            try {
                String string5 = bundle.getString("largeIconStr");
                try {
                    int i11 = bundle.getInt(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, -1);
                    int i12 = bundle.getInt("color", 0);
                    int i13 = bundle.getInt("number", 0);
                    String string6 = bundle.getString("data");
                    String string7 = bundle.getString("group");
                    boolean z12 = bundle.getBoolean("groupSummary", false);
                    String string8 = bundle.getString("sortKey");
                    int i14 = bundle.getInt("groupAlertBehaviour", -1);
                    boolean z13 = bundle.getBoolean("showTimestamp", false);
                    Notification.Builder builderCreateNotificationBuilder = UnityNotificationManager.getNotificationManagerImpl(context).createNotificationBuilder(string);
                    builderCreateNotificationBuilder.getExtras().putInt("id", i10);
                    builderCreateNotificationBuilder.setContentTitle(string2);
                    builderCreateNotificationBuilder.setContentText(string3);
                    UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_SMALL_ICON, string4);
                    builderCreateNotificationBuilder.setAutoCancel(z10);
                    builderCreateNotificationBuilder.setUsesChronometer(z11);
                    builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, j10);
                    builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, j11);
                    UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_LARGE_ICON, string5);
                    if (i11 == 2) {
                        builderCreateNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(string3));
                    }
                    if (i12 != 0) {
                        UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, i12);
                    }
                    if (i13 >= 0) {
                        builderCreateNotificationBuilder.setNumber(i13);
                    }
                    if (string6 != null) {
                        builderCreateNotificationBuilder.getExtras().putString("data", string6);
                    }
                    if (string7 != null && string7.length() > 0) {
                        builderCreateNotificationBuilder.setGroup(string7);
                    }
                    builderCreateNotificationBuilder.setGroupSummary(z12);
                    if (string8 != null && string8.length() > 0) {
                        builderCreateNotificationBuilder.setSortKey(string8);
                    }
                    UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, i14);
                    builderCreateNotificationBuilder.setShowWhen(z13);
                    return builderCreateNotificationBuilder;
                } catch (Exception e10) {
                    e = e10;
                    str3 = "Failed to deserialize old style notification";
                    str4 = "UnityNotifications";
                    Log.e(str4, str3, e);
                    return null;
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    str = "Failed to deserialize old style notification";
                    str2 = "UnityNotifications";
                    Log.e(str2, str, e);
                    return null;
                }
            } catch (Exception e12) {
                e = e12;
                str4 = "UnityNotifications";
                str3 = "Failed to deserialize old style notification";
            } catch (OutOfMemoryError e13) {
                e = e13;
                str2 = "UnityNotifications";
                str = "Failed to deserialize old style notification";
            }
        } catch (Exception e14) {
            e = e14;
            str3 = "Failed to deserialize old style notification";
            str4 = "UnityNotifications";
        } catch (OutOfMemoryError e15) {
            e = e15;
            str = "Failed to deserialize old style notification";
            str2 = "UnityNotifications";
        }
    }

    protected static int findResourceIdInContextByName(Context context, String str) {
        if (str == null) {
            return 0;
        }
        try {
            Resources resources = context.getResources();
            if (resources != null) {
                int identifier = resources.getIdentifier(str, "mipmap", context.getPackageName());
                return identifier == 0 ? resources.getIdentifier(str, "drawable", context.getPackageName()) : identifier;
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    protected static Class<?> getOpenAppActivity(Context context) {
        try {
            try {
                PackageManager packageManager = context.getPackageManager();
                Bundle bundle = packageManager.getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("custom_notification_android_activity")) {
                    try {
                        return Class.forName(bundle.getString("custom_notification_android_activity"));
                    } catch (ClassNotFoundException e10) {
                        Log.e("UnityNotifications", "Specified activity class for notifications not found: " + e10.getMessage());
                    }
                }
                Log.w("UnityNotifications", "No custom_notification_android_activity found, attempting to find app activity class");
                boolean z10 = true;
                ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(context.getPackageName(), 1).activities;
                if (activityInfoArr == null) {
                    Log.e("UnityNotifications", "Could not get package activities");
                    return null;
                }
                int length = activityInfoArr.length;
                String str = null;
                int i10 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    if (i10 >= length) {
                        z10 = z12;
                        break;
                    }
                    ActivityInfo activityInfo = activityInfoArr[i10];
                    if (activityInfo.enabled && activityInfo.targetActivity == null) {
                        boolean zIsUnityActivity = isUnityActivity(activityInfo.name);
                        if (str == null) {
                            str = activityInfo.name;
                        } else if (z11 == zIsUnityActivity) {
                            if (z11 && zIsUnityActivity) {
                                break;
                            }
                            z12 = true;
                        } else if (zIsUnityActivity) {
                            str = activityInfo.name;
                            z12 = false;
                        }
                        z11 = zIsUnityActivity;
                    }
                    i10++;
                }
                if (z10) {
                    Log.e("UnityNotifications", "Multiple choices for activity for notifications, set activity explicitly in Notification Settings");
                    return null;
                }
                if (str != null) {
                    return Class.forName(str);
                }
                Log.e("UnityNotifications", "Activity class for notifications not found");
                return null;
            } catch (PackageManager.NameNotFoundException e11) {
                e11.printStackTrace();
                return null;
            }
        } catch (ClassNotFoundException e12) {
            Log.e("UnityNotifications", "Failed to find activity class: " + e12.getMessage());
            return null;
        }
    }

    private static boolean isUnityActivity(String str) {
        return str.endsWith(".UnityPlayerActivity") || str.endsWith(".UnityPlayerGameActivity");
    }

    private static boolean readAndCheckMagicNumber(DataInputStream dataInputStream, byte[] bArr) {
        for (byte b10 : bArr) {
            try {
                if (dataInputStream.readByte() != b10) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    protected static Notification.Builder recoverBuilder(Context context, Notification notification) {
        try {
            Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, notification);
            builderRecoverBuilder.setExtras(notification.extras);
            return builderRecoverBuilder;
        } catch (Exception e10) {
            Log.e("UnityNotifications", "Failed to recover builder for notification!", e10);
            return recoverBuilderCustom(context, notification);
        } catch (OutOfMemoryError e11) {
            Log.e("UnityNotifications", "Failed to recover builder for notification!", e11);
            return recoverBuilderCustom(context, notification);
        }
    }

    private static Notification.Builder recoverBuilderCustom(Context context, Notification notification) {
        Notification.Builder builderCreateNotificationBuilder = UnityNotificationManager.getNotificationManagerImpl(context).createNotificationBuilder(notification.extras.getString(UnityNotificationManager.KEY_CHANNEL_ID));
        UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_SMALL_ICON, notification.extras.getString(UnityNotificationManager.KEY_SMALL_ICON));
        String string = notification.extras.getString(UnityNotificationManager.KEY_LARGE_ICON);
        if (string != null && !string.isEmpty()) {
            UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_LARGE_ICON, string);
        }
        builderCreateNotificationBuilder.setContentTitle(notification.extras.getString("android.title"));
        builderCreateNotificationBuilder.setContentText(notification.extras.getString("android.text"));
        builderCreateNotificationBuilder.setAutoCancel((notification.flags & 16) != 0);
        int i10 = notification.number;
        if (i10 >= 0) {
            builderCreateNotificationBuilder.setNumber(i10);
        }
        String string2 = notification.extras.getString("android.bigText");
        if (string2 != null) {
            builderCreateNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(string2));
        }
        builderCreateNotificationBuilder.setWhen(notification.when);
        String group = notification.getGroup();
        if (group != null && !group.isEmpty()) {
            builderCreateNotificationBuilder.setGroup(group);
        }
        builderCreateNotificationBuilder.setGroupSummary((notification.flags & 512) != 0);
        String sortKey = notification.getSortKey();
        if (sortKey != null && !sortKey.isEmpty()) {
            builderCreateNotificationBuilder.setSortKey(sortKey);
        }
        builderCreateNotificationBuilder.setShowWhen(notification.extras.getBoolean("android.showWhen", false));
        Integer notificationColor = UnityNotificationManager.getNotificationColor(notification);
        if (notificationColor != null) {
            UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, notificationColor.intValue());
        }
        UnityNotificationManager.setNotificationUsesChronometer(builderCreateNotificationBuilder, notification.extras.getBoolean("android.showChronometer", false));
        UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, UnityNotificationManager.getNotificationGroupAlertBehavior(notification));
        builderCreateNotificationBuilder.getExtras().putInt("id", notification.extras.getInt("id", 0));
        builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, notification.extras.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, 0L));
        builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, notification.extras.getLong(UnityNotificationManager.KEY_FIRE_TIME, 0L));
        String string3 = notification.extras.getString("data");
        if (string3 != null && !string3.isEmpty()) {
            builderCreateNotificationBuilder.getExtras().putString("data", string3);
        }
        return builderCreateNotificationBuilder;
    }

    protected static void serializeNotification(SharedPreferences sharedPreferences, Notification notification, boolean z10) {
        String strEncodeToString;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (z10) {
                Intent intent = new Intent();
                intent.putExtra(UnityNotificationManager.KEY_NOTIFICATION, notification);
                if (!serializeNotificationParcel(intent, dataOutputStream)) {
                    return;
                }
                dataOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                strEncodeToString = Base64.encodeToString(byteArray, 0, byteArray.length, 0);
            } else {
                if (!serializeNotificationCustom(notification, dataOutputStream)) {
                    return;
                }
                dataOutputStream.flush();
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                strEncodeToString = Base64.encodeToString(byteArray2, 0, byteArray2.length, 0);
            }
            SharedPreferences.Editor editorClear = sharedPreferences.edit().clear();
            editorClear.putString("data", strEncodeToString);
            editorClear.apply();
        } catch (Exception e10) {
            Log.e("UnityNotifications", "Failed to serialize notification", e10);
        }
    }

    private static boolean serializeNotificationCustom(Notification notification, DataOutputStream dataOutputStream) {
        try {
            dataOutputStream.write(UNITY_MAGIC_NUMBER);
            dataOutputStream.writeInt(3);
            boolean z10 = notification.extras.getBoolean("android.showWhen", false);
            dataOutputStream.writeInt(notification.extras.getInt("id"));
            serializeString(dataOutputStream, notification.extras.getString("android.title"));
            serializeString(dataOutputStream, notification.extras.getString("android.text"));
            serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_SMALL_ICON));
            serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_LARGE_ICON));
            dataOutputStream.writeLong(notification.extras.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L));
            dataOutputStream.writeLong(notification.extras.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L));
            serializeString(dataOutputStream, notification.extras.getString("android.bigText"));
            dataOutputStream.writeBoolean(notification.extras.getBoolean("android.showChronometer", false));
            dataOutputStream.writeBoolean(z10);
            serializeString(dataOutputStream, notification.extras.getString("data"));
            dataOutputStream.writeBoolean(notification.extras.getBoolean(UnityNotificationManager.KEY_SHOW_IN_FOREGROUND, true));
            String string = notification.extras.getString(UnityNotificationManager.KEY_BIG_PICTURE);
            serializeString(dataOutputStream, string);
            if (string != null && string.length() > 0) {
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_LARGE_ICON));
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_CONTENT_TITLE));
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_CONTENT_DESCRIPTION));
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_SUMMARY_TEXT));
                dataOutputStream.writeBoolean(notification.extras.getBoolean(UnityNotificationManager.KEY_BIG_SHOW_WHEN_COLLAPSED, false));
            }
            serializeString(dataOutputStream, Build.VERSION.SDK_INT < 26 ? null : notification.getChannelId());
            Integer notificationColor = UnityNotificationManager.getNotificationColor(notification);
            dataOutputStream.writeBoolean(notificationColor != null);
            if (notificationColor != null) {
                dataOutputStream.writeInt(notificationColor.intValue());
            }
            dataOutputStream.writeInt(notification.number);
            dataOutputStream.writeBoolean((notification.flags & 16) != 0);
            serializeString(dataOutputStream, notification.getGroup());
            dataOutputStream.writeBoolean((notification.flags & 512) != 0);
            dataOutputStream.writeInt(UnityNotificationManager.getNotificationGroupAlertBehavior(notification));
            serializeString(dataOutputStream, notification.getSortKey());
            if (z10) {
                dataOutputStream.writeLong(notification.when);
            }
            return true;
        } catch (Exception e10) {
            Log.e("UnityNotifications", "Failed to serialize notification", e10);
            return false;
        }
    }

    static boolean serializeNotificationParcel(Intent intent, DataOutputStream dataOutputStream) {
        try {
            byte[] bArrSerializeParcelable = serializeParcelable(intent);
            if (bArrSerializeParcelable != null && bArrSerializeParcelable.length != 0) {
                dataOutputStream.write(UNITY_MAGIC_NUMBER_PARCELLED);
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(bArrSerializeParcelable.length);
                dataOutputStream.write(bArrSerializeParcelable);
                return true;
            }
            return false;
        } catch (Exception e10) {
            Log.e("UnityNotifications", "Failed to serialize notification as Parcel", e10);
            return false;
        } catch (OutOfMemoryError e11) {
            Log.e("UnityNotifications", "Failed to serialize notification as Parcel", e11);
            return false;
        }
    }

    static void serializeString(DataOutputStream dataOutputStream, String str) throws IOException {
        if (str == null || str.length() == 0) {
            dataOutputStream.writeInt(0);
            return;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
    }

    static byte[] serializeParcelable(Parcelable parcelable) {
        try {
            Parcel parcelObtain = Parcel.obtain();
            Bundle bundle = new Bundle();
            bundle.putParcelable(GEmOVMyH.dnYBKlLY, parcelable);
            parcelObtain.writeParcelable(bundle, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Exception e10) {
            Log.e("UnityNotifications", "Failed to serialize Parcelable", e10);
            return null;
        } catch (OutOfMemoryError e11) {
            Log.e("UnityNotifications", "Failed to serialize Parcelable", e11);
            return null;
        }
    }

    private static Object deserializeNotification(Context context, byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        Notification notificationDeserializeNotificationParcelable = deserializeNotificationParcelable(dataInputStream);
        if (notificationDeserializeNotificationParcelable != null) {
            return notificationDeserializeNotificationParcelable;
        }
        byteArrayInputStream.reset();
        Notification.Builder builderDeserializeNotificationCustom = deserializeNotificationCustom(context, dataInputStream);
        return builderDeserializeNotificationCustom == null ? deserializedFromOldIntent(context, bArr) : builderDeserializeNotificationCustom;
    }
}
