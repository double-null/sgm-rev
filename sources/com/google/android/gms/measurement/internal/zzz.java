package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzz {
    final /* synthetic */ zzad zza;
    private com.google.android.gms.internal.measurement.zzhs zzb;
    private Long zzc;
    private long zzd;

    /* synthetic */ zzz(zzad zzadVar, byte[] bArr) {
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0067  */
    /* JADX WARN: Code duplicated, block: B:20:0x008c A[Catch: SQLiteException -> 0x00d9, all -> 0x01d6, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00d9, blocks: (B:18:0x0086, B:20:0x008c, B:22:0x00a0, B:23:0x00ac, B:24:0x00bc, B:27:0x00c5), top: B:76:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00a0 A[Catch: SQLiteException -> 0x00d9, all -> 0x01d6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00d9, blocks: (B:18:0x0086, B:20:0x008c, B:22:0x00a0, B:23:0x00ac, B:24:0x00bc, B:27:0x00c5), top: B:76:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6, types: [long] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v7 */
    final com.google.android.gms.internal.measurement.zzhs zza(String str, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        zzaw zzawVarZzj;
        ?? r10;
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        ?? LongValue;
        String strZzd = zzhsVar.zzd();
        List listZza = zzhsVar.zza();
        zzad zzadVar = this.zza;
        zzpg zzpgVar = zzadVar.zzg;
        zzpgVar.zzp();
        Long l10 = (Long) zzpk.zzM(zzhsVar, "_eid");
        if (l10 != null) {
            if (strZzd.equals("_ep")) {
                Preconditions.checkNotNull(l10);
                zzpgVar.zzp();
                String str2 = (String) zzpk.zzM(zzhsVar, "_en");
                if (TextUtils.isEmpty(str2)) {
                    zzadVar.zzu.zzaW().zzc().zzb("Extra parameter without an event name. eventId", l10);
                    return null;
                }
                if (this.zzb == null || this.zzc == null) {
                    zzawVarZzj = zzpgVar.zzj();
                    zzawVarZzj.zzg();
                    zzawVarZzj.zzay();
                    try {
                        try {
                            cursorRawQuery = zzawVarZzj.zze().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzp(), cursorRawQuery.getBlob(0))).zzbd(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e10) {
                                        zzawVarZzj.zzu.zzaW().zzb().zzd("Failed to merge main event. appId, eventId", zzgu.zzl(str), l10, e10);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                } else {
                                    zzawVarZzj.zzu.zzaW().zzk().zza("Main event not found");
                                    cursorRawQuery.close();
                                    pairCreate = null;
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                zzawVarZzj.zzu.zzaW().zzb().zzb("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.zza.zzu.zzaW().zzc().zzc("Extra parameter without existing main event. eventName, eventId", str2, l10);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r10 = LongValue;
                            if (r10 != 0) {
                                r10.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = 0;
                        if (r10 != 0) {
                            r10.close();
                        }
                        throw th;
                    }
                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                        this.zza.zzu.zzaW().zzc().zzc("Extra parameter without existing main event. eventName, eventId", str2, l10);
                        return null;
                    }
                    this.zzb = (com.google.android.gms.internal.measurement.zzhs) obj;
                    this.zzd = ((Long) pairCreate.second).longValue();
                    this.zza.zzg.zzp();
                    this.zzc = (Long) zzpk.zzM(this.zzb, "_eid");
                } else {
                    LongValue = l10.longValue();
                    if (LongValue != this.zzc.longValue()) {
                        zzawVarZzj = zzpgVar.zzj();
                        zzawVarZzj.zzg();
                        zzawVarZzj.zzay();
                        cursorRawQuery = zzawVarZzj.zze().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                        if (cursorRawQuery.moveToFirst()) {
                            zzawVarZzj.zzu.zzaW().zzk().zza("Main event not found");
                            cursorRawQuery.close();
                            pairCreate = null;
                        } else {
                            pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzp(), cursorRawQuery.getBlob(0))).zzbd(), Long.valueOf(cursorRawQuery.getLong(1)));
                            cursorRawQuery.close();
                        }
                        if (pairCreate != null) {
                        }
                        this.zza.zzu.zzaW().zzc().zzc("Extra parameter without existing main event. eventName, eventId", str2, l10);
                        return null;
                    }
                }
                long j10 = this.zzd - 1;
                this.zzd = j10;
                if (j10 <= 0) {
                    zzaw zzawVarZzj2 = this.zza.zzg.zzj();
                    zzawVarZzj2.zzg();
                    zzawVarZzj2.zzu.zzaW().zzk().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzawVarZzj2.zze().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e13) {
                        zzawVarZzj2.zzu.zzaW().zzb().zzb("Error clearing complex main event", e13);
                    }
                } else {
                    this.zza.zzg.zzj().zzU(str, l10, this.zzd, this.zzb);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar : this.zzb.zza()) {
                    this.zza.zzg.zzp();
                    if (zzpk.zzI(zzhsVar, zzhwVar.zzb()) == null) {
                        arrayList.add(zzhwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.zza.zzu.zzaW().zzc().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listZza);
                    listZza = arrayList;
                }
                strZzd = str2;
            } else {
                this.zzc = l10;
                this.zzb = zzhsVar;
                zzpgVar.zzp();
                long jLongValue = ((Long) zzpk.zzN(zzhsVar, "_epc", 0L)).longValue();
                this.zzd = jLongValue;
                if (jLongValue <= 0) {
                    zzadVar.zzu.zzaW().zzc().zzb("Complex event with zero extra param count. eventName", strZzd);
                } else {
                    zzpgVar.zzj().zzU(str, (Long) Preconditions.checkNotNull(l10), this.zzd, zzhsVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzhsVar.zzco();
        zzhrVar.zzl(strZzd);
        zzhrVar.zzi();
        zzhrVar.zzh(listZza);
        return (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbd();
    }
}
