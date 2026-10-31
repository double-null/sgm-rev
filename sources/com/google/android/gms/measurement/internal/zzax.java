package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzax {
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    static void zza(zzgu zzguVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        SQLiteException e10;
        Cursor cursorQuery;
        if (zzguVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            try {
                try {
                    boolean zMoveToFirst = cursorQuery.moveToFirst();
                    cursorQuery.close();
                    if (!zMoveToFirst) {
                        sQLiteDatabase.execSQL(str2);
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    zzguVar.zze().zzc("Error querying for table", str, e10);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        try {
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder(str.length() + 22);
            sb2.append("SELECT * FROM ");
            sb2.append(str);
            sb2.append(" LIMIT 0");
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb2.toString(), null);
            try {
                Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                cursorRawQuery.close();
                for (String str4 : str3.split(",")) {
                    if (!hashSet.remove(str4)) {
                        StringBuilder sb3 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                        sb3.append("Table ");
                        sb3.append(str);
                        sb3.append(" is missing required column: ");
                        sb3.append(str4);
                        throw new SQLiteException(sb3.toString());
                    }
                }
                if (strArr != null) {
                    for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                        if (!hashSet.remove(strArr[i10])) {
                            sQLiteDatabase.execSQL(strArr[i10 + 1]);
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                zzguVar.zze().zzc("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
            } catch (Throwable th3) {
                cursorRawQuery.close();
                throw th3;
            }
        } catch (SQLiteException e13) {
            zzguVar.zzb().zzb("Failed to verify columns on table that was just created", str);
            throw e13;
        }
    }

    static void zzb(zzgu zzguVar, SQLiteDatabase sQLiteDatabase) {
        if (zzguVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        com.google.android.gms.internal.measurement.zzby.zza();
        String path = sQLiteDatabase.getPath();
        int i10 = com.google.android.gms.internal.measurement.zzcd.zza;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            zzguVar.zze().zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzguVar.zze().zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzguVar.zze().zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzguVar.zze().zza("Failed to turn on database write permission for owner");
    }
}
