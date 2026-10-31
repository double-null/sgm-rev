package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzau {
    final /* synthetic */ zzaw zza;
    private final String zzb;
    private long zzc;

    public zzau(zzaw zzawVar, String str) {
        Objects.requireNonNull(zzawVar);
        this.zza = zzawVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List zza() {
        List arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 1;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = this.zza.zze().query("raw_events", new String[]{"rowid", "name", SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP, "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{this.zzb, String.valueOf(this.zzc)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        long j10 = cursorQuery.getLong(i10);
                        long j11 = cursorQuery.getLong(3);
                        boolean z10 = cursorQuery.getLong(5) == 1 ? i11 : i10;
                        long j12 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j10 > this.zzc) {
                            this.zzc = j10;
                        }
                        try {
                            com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzp(), blob);
                            String string = cursorQuery.getString(i11);
                            if (string == null) {
                                string = "";
                            }
                            zzhrVar.zzl(string);
                            zzhrVar.zzo(cursorQuery.getLong(2));
                            zzhrVar.zzw(j12);
                            arrayList.add(new zzat(j10, j11, z10, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbd()));
                        } catch (IOException e10) {
                            this.zza.zzu.zzaW().zzb().zzc("Data loss. Failed to merge raw event. appId", zzgu.zzl(this.zzb), e10);
                        }
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        i10 = 0;
                        i11 = 1;
                    }
                } else {
                    arrayList = Collections.emptyList();
                }
            } catch (SQLiteException e11) {
                this.zza.zzu.zzaW().zzb().zzc("Data loss. Error querying raw events batch. appId", zzgu.zzl(this.zzb), e11);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public zzau(zzaw zzawVar, String str, long j10) {
        Objects.requireNonNull(zzawVar);
        this.zza = zzawVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = zzawVar.zzaj("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }
}
