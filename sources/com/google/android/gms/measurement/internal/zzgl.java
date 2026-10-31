package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgl extends zzg {
    private static final String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final zzgj zzb;
    private boolean zzc;

    zzgl(zzic zzicVar) {
        super(zzicVar);
        Context contextZzaZ = this.zzu.zzaZ();
        this.zzu.zzc();
        this.zzb = new zzgj(this, contextZzaZ, "google_app_measurement_local.db");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x011b A[Catch: all -> 0x0171, TryCatch #9 {all -> 0x0171, blocks: (B:23:0x0078, B:25:0x007e, B:34:0x0097, B:35:0x009f, B:37:0x00bb, B:66:0x0115, B:68:0x011b, B:69:0x011e, B:76:0x013c, B:84:0x0150, B:45:0x00e1), top: B:100:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0132  */
    /* JADX WARN: Code duplicated, block: B:79:0x0143  */
    /* JADX WARN: Code duplicated, block: B:81:0x0148 A[PHI: r2 r8 r10
      0x0148: PHI (r2v13 java.lang.String[]) = (r2v9 java.lang.String[]), (r2v10 java.lang.String[]), (r2v14 java.lang.String[]) binds: [B:72:0x0135, B:87:0x0167, B:80:0x0146] A[DONT_GENERATE, DONT_INLINE]
      0x0148: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:72:0x0135, B:87:0x0167, B:80:0x0146] A[DONT_GENERATE, DONT_INLINE]
      0x0148: PHI (r10v8 android.database.sqlite.SQLiteDatabase) = 
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v7 android.database.sqlite.SQLiteDatabase)
      (r10v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:72:0x0135, B:87:0x0167, B:80:0x0146] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:93:0x0175  */
    /* JADX WARN: Code duplicated, block: B:95:0x017a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v4 */
    private final boolean zzs(int i10, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        String[] strArr;
        SQLiteDatabase sQLiteDatabaseZzp;
        ?? RawQuery;
        ?? r10;
        zzg();
        boolean z10 = false;
        z10 = false;
        if (!this.zzc) {
            zzic zzicVar = this.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            zzfx zzfxVar = zzfy.zzaW;
            String[] strArr2 = null;
            zzr zzrVarZzh = zzalVarZzc.zzp(null, zzfxVar) ? this.zzu.zzv().zzh(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i10));
            contentValues.put("entry", bArr);
            if (zzicVar.zzc().zzp(null, zzfxVar) && zzrVarZzh != null) {
                contentValues.put("app_version", zzrVarZzh.zzc);
                contentValues.put("app_version_int", Long.valueOf(zzrVarZzh.zzj));
            }
            zzicVar.zzc();
            int i11 = 0;
            int i12 = 5;
            for (int i13 = 5; i11 < i13; i13 = 5) {
                try {
                    sQLiteDatabaseZzp = zzp();
                    if (sQLiteDatabaseZzp == null) {
                        this.zzc = true;
                    } else {
                        try {
                            sQLiteDatabaseZzp.beginTransaction();
                            RawQuery = sQLiteDatabaseZzp.rawQuery("select count(1) from messages", strArr2);
                            long j10 = 0;
                            if (RawQuery != 0) {
                                try {
                                    if (RawQuery.moveToFirst()) {
                                        j10 = RawQuery.getLong(z10 ? 1 : 0);
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    strArr = strArr2;
                                    SystemClock.sleep(i12);
                                    i12 += 20;
                                    if (RawQuery != 0) {
                                        RawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp != null) {
                                        sQLiteDatabaseZzp.close();
                                    }
                                    i11++;
                                    strArr2 = strArr;
                                    z10 = false;
                                } catch (SQLiteFullException e10) {
                                    e = e10;
                                    strArr = strArr2;
                                    this.zzu.zzaW().zzb().zzb("Error writing entry; local database full", e);
                                    this.zzc = true;
                                    if (RawQuery != 0) {
                                        RawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp != null) {
                                        sQLiteDatabaseZzp.close();
                                    }
                                    i11++;
                                    strArr2 = strArr;
                                    z10 = false;
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    strArr = strArr2;
                                    if (sQLiteDatabaseZzp != null) {
                                        try {
                                            if (sQLiteDatabaseZzp.inTransaction()) {
                                                sQLiteDatabaseZzp.endTransaction();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            r10 = RawQuery;
                                            sQLiteDatabase = sQLiteDatabaseZzp;
                                            if (r10 != 0) {
                                                r10.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    this.zzu.zzaW().zzb().zzb("Error writing entry to local database", e);
                                    this.zzc = true;
                                    if (RawQuery != 0) {
                                        RawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp != null) {
                                        sQLiteDatabaseZzp.close();
                                    }
                                    i11++;
                                    strArr2 = strArr;
                                    z10 = false;
                                }
                            }
                            if (j10 < 100000) {
                                strArr = null;
                                sQLiteDatabaseZzp.insertOrThrow("messages", null, contentValues);
                                sQLiteDatabaseZzp.setTransactionSuccessful();
                                sQLiteDatabaseZzp.endTransaction();
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                sQLiteDatabaseZzp.close();
                                return true;
                            }
                            try {
                                zzicVar.zzaW().zzb().zza("Data loss, local db full");
                                String[] strArr3 = new String[1];
                                long j11 = (100000 - j10) + 1;
                                strArr3[z10 ? 1 : 0] = Long.toString(j11);
                                long jDelete = sQLiteDatabaseZzp.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr3);
                                if (jDelete != j11) {
                                    zzicVar.zzaW().zzb().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j11), Long.valueOf(jDelete), Long.valueOf(j11 - jDelete));
                                }
                                strArr = null;
                                try {
                                    sQLiteDatabaseZzp.insertOrThrow("messages", null, contentValues);
                                    sQLiteDatabaseZzp.setTransactionSuccessful();
                                    sQLiteDatabaseZzp.endTransaction();
                                    if (RawQuery != 0) {
                                        RawQuery.close();
                                    }
                                    sQLiteDatabaseZzp.close();
                                    return true;
                                } catch (SQLiteDatabaseLockedException unused2) {
                                    SystemClock.sleep(i12);
                                    i12 += 20;
                                    if (RawQuery != 0) {
                                        RawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp != null) {
                                        sQLiteDatabaseZzp.close();
                                    }
                                    i11++;
                                    strArr2 = strArr;
                                    z10 = false;
                                } catch (SQLiteFullException e12) {
                                    e = e12;
                                    this.zzu.zzaW().zzb().zzb("Error writing entry; local database full", e);
                                    this.zzc = true;
                                    if (RawQuery != 0) {
                                        RawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp != null) {
                                        sQLiteDatabaseZzp.close();
                                    }
                                    i11++;
                                    strArr2 = strArr;
                                    z10 = false;
                                } catch (SQLiteException e13) {
                                    e = e13;
                                    if (sQLiteDatabaseZzp != null) {
                                        if (sQLiteDatabaseZzp.inTransaction()) {
                                            sQLiteDatabaseZzp.endTransaction();
                                        }
                                    }
                                    this.zzu.zzaW().zzb().zzb("Error writing entry to local database", e);
                                    this.zzc = true;
                                    if (RawQuery != 0) {
                                        RawQuery.close();
                                    }
                                    if (sQLiteDatabaseZzp != null) {
                                        sQLiteDatabaseZzp.close();
                                    }
                                    i11++;
                                    strArr2 = strArr;
                                    z10 = false;
                                }
                            } catch (SQLiteDatabaseLockedException unused3) {
                                strArr = null;
                                SystemClock.sleep(i12);
                                i12 += 20;
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                if (sQLiteDatabaseZzp != null) {
                                    sQLiteDatabaseZzp.close();
                                }
                                i11++;
                                strArr2 = strArr;
                                z10 = false;
                            } catch (SQLiteFullException e14) {
                                e = e14;
                                strArr = null;
                                this.zzu.zzaW().zzb().zzb("Error writing entry; local database full", e);
                                this.zzc = true;
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                if (sQLiteDatabaseZzp != null) {
                                    sQLiteDatabaseZzp.close();
                                }
                                i11++;
                                strArr2 = strArr;
                                z10 = false;
                            } catch (SQLiteException e15) {
                                e = e15;
                                strArr = null;
                                if (sQLiteDatabaseZzp != null) {
                                    if (sQLiteDatabaseZzp.inTransaction()) {
                                        sQLiteDatabaseZzp.endTransaction();
                                    }
                                }
                                this.zzu.zzaW().zzb().zzb("Error writing entry to local database", e);
                                this.zzc = true;
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                if (sQLiteDatabaseZzp != null) {
                                    sQLiteDatabaseZzp.close();
                                }
                                i11++;
                                strArr2 = strArr;
                                z10 = false;
                            }
                        } catch (SQLiteDatabaseLockedException unused4) {
                            strArr = strArr2;
                            RawQuery = strArr;
                        } catch (SQLiteFullException e16) {
                            e = e16;
                            strArr = strArr2;
                            RawQuery = strArr;
                        } catch (SQLiteException e17) {
                            e = e17;
                            strArr = strArr2;
                            RawQuery = strArr;
                        } catch (Throwable th2) {
                            th = th2;
                            r10 = strArr2;
                            sQLiteDatabase = sQLiteDatabaseZzp;
                            if (r10 != 0) {
                                r10.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                        i11++;
                        strArr2 = strArr;
                        z10 = false;
                    }
                } catch (SQLiteDatabaseLockedException unused5) {
                    strArr = strArr2;
                    sQLiteDatabaseZzp = strArr;
                    RawQuery = sQLiteDatabaseZzp;
                } catch (SQLiteFullException e18) {
                    e = e18;
                    strArr = strArr2;
                    sQLiteDatabaseZzp = strArr;
                    RawQuery = sQLiteDatabaseZzp;
                } catch (SQLiteException e19) {
                    e = e19;
                    strArr = strArr2;
                    sQLiteDatabaseZzp = strArr;
                    RawQuery = sQLiteDatabaseZzp;
                } catch (Throwable th3) {
                    th = th3;
                    String[] strArr4 = strArr2;
                    sQLiteDatabase = strArr4;
                    r10 = strArr4;
                }
            }
            this.zzu.zzaW().zzk().zza("Failed to write entry to local database");
            return false;
        }
        return z10;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return false;
    }

    public final void zzh() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzp = zzp();
            if (sQLiteDatabaseZzp == null || (iDelete = sQLiteDatabaseZzp.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzu.zzaW().zzk().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e10) {
            this.zzu.zzaW().zzb().zzb("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean zzi(zzbh zzbhVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzbi.zza(zzbhVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(0, bArrMarshall);
        }
        this.zzu.zzaW().zzc().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzj(zzpl zzplVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzpm.zza(zzplVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(1, bArrMarshall);
        }
        this.zzu.zzaW().zzc().zza("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzk(zzah zzahVar) {
        zzic zzicVar = this.zzu;
        byte[] bArrZzah = zzicVar.zzk().zzah(zzahVar);
        if (bArrZzah.length <= 131072) {
            return zzs(2, bArrZzah);
        }
        zzicVar.zzaW().zzc().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzl(zzbf zzbfVar) {
        zzic zzicVar = this.zzu;
        byte[] bArrZzah = zzicVar.zzk().zzah(zzbfVar);
        if (bArrZzah == null) {
            zzicVar.zzaW().zzc().zza("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrZzah.length <= 131072) {
            return zzs(4, bArrZzah);
        }
        zzicVar.zzaW().zzc().zza("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 8501. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.util.List zzm(int r29) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgl.zzm(int):java.util.List");
    }

    public final boolean zzn() {
        return zzs(3, new byte[0]);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b A[PHI: r4
      0x006b: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v4 int) binds: [B:34:0x007e, B:28:0x0062, B:31:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean zzo() {
        zzg();
        if (!this.zzc && zzq()) {
            int i10 = 5;
            for (int i11 = 0; i11 < 5; i11++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseZzp = zzp();
                            if (sQLiteDatabaseZzp != null) {
                                sQLiteDatabaseZzp.beginTransaction();
                                sQLiteDatabaseZzp.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                sQLiteDatabaseZzp.setTransactionSuccessful();
                                sQLiteDatabaseZzp.endTransaction();
                                sQLiteDatabaseZzp.close();
                                return true;
                            }
                            this.zzc = true;
                        } catch (SQLiteDatabaseLockedException unused) {
                            SystemClock.sleep(i10);
                            i10 += 20;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteException e10) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        this.zzu.zzaW().zzb().zzb("Error deleting app launch break from local database", e10);
                        this.zzc = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e11) {
                    this.zzu.zzaW().zzb().zzb("Error deleting app launch break from local database", e11);
                    this.zzc = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.zzu.zzaW().zze().zza("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    final SQLiteDatabase zzp() throws SQLiteException {
        if (this.zzc) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzc = true;
        return null;
    }

    final boolean zzq() {
        zzic zzicVar = this.zzu;
        Context contextZzaZ = zzicVar.zzaZ();
        zzicVar.zzc();
        return contextZzaZ.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
