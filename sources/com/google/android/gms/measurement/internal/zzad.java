package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzahn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzad extends zzos {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzad(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final zzy zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i10, int i11) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i10));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i11);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0299 A[Catch: all -> 0x02cd, SQLiteException -> 0x02d0, LOOP:11: B:103:0x0299->B:502:?, LOOP_START, TryCatch #23 {all -> 0x02cd, blocks: (B:101:0x0293, B:103:0x0299, B:105:0x02aa, B:106:0x02b2, B:109:0x02c8, B:122:0x02dc), top: B:452:0x0281 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02aa A[Catch: all -> 0x02cd, SQLiteException -> 0x02d0, TryCatch #23 {all -> 0x02cd, blocks: (B:101:0x0293, B:103:0x0299, B:105:0x02aa, B:106:0x02b2, B:109:0x02c8, B:122:0x02dc), top: B:452:0x0281 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c8 A[Catch: all -> 0x02cd, SQLiteException -> 0x02d0, TRY_ENTER, TRY_LEAVE, TryCatch #23 {all -> 0x02cd, blocks: (B:101:0x0293, B:103:0x0299, B:105:0x02aa, B:106:0x02b2, B:109:0x02c8, B:122:0x02dc), top: B:452:0x0281 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0309  */
    /* JADX WARN: Code duplicated, block: B:131:0x0317  */
    /* JADX WARN: Code duplicated, block: B:133:0x0333  */
    /* JADX WARN: Code duplicated, block: B:153:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:160:0x0404  */
    /* JADX WARN: Code duplicated, block: B:164:0x0411  */
    /* JADX WARN: Code duplicated, block: B:166:0x0436  */
    /* JADX WARN: Code duplicated, block: B:172:0x044b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0465  */
    /* JADX WARN: Code duplicated, block: B:177:0x046e  */
    /* JADX WARN: Code duplicated, block: B:181:0x047a  */
    /* JADX WARN: Code duplicated, block: B:187:0x048f  */
    /* JADX WARN: Code duplicated, block: B:194:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:197:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:199:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:201:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:202:0x0500  */
    /* JADX WARN: Code duplicated, block: B:207:0x051d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:235:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:237:0x05da  */
    /* JADX WARN: Code duplicated, block: B:241:0x0601  */
    /* JADX WARN: Code duplicated, block: B:249:0x064d  */
    /* JADX WARN: Code duplicated, block: B:256:0x0675 A[Catch: SQLiteException -> 0x069e, all -> 0x06aa, TryCatch #6 {all -> 0x06aa, blocks: (B:247:0x0647, B:251:0x0650, B:252:0x0654, B:254:0x0665, B:256:0x0675, B:257:0x067d, B:260:0x0693, B:259:0x0682, B:282:0x06c5, B:266:0x06a2), top: B:429:0x0647 }] */
    /* JADX WARN: Code duplicated, block: B:265:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:267:0x06a6 A[PHI: r0 r5 r16 r29
      0x06a6: PHI (r0v72 java.util.Map) = (r0v74 java.util.Map), (r0v81 java.util.Map) binds: [B:283:0x06da, B:266:0x06a2] A[DONT_GENERATE, DONT_INLINE]
      0x06a6: PHI (r5v39 android.database.Cursor) = (r5v40 android.database.Cursor), (r5v42 android.database.Cursor) binds: [B:283:0x06da, B:266:0x06a2] A[DONT_GENERATE, DONT_INLINE]
      0x06a6: PHI (r16v14 long) = (r16v15 long), (r16v18 long) binds: [B:283:0x06da, B:266:0x06a2] A[DONT_GENERATE, DONT_INLINE]
      0x06a6: PHI (r29v7 java.lang.String) = (r29v8 java.lang.String), (r29v10 java.lang.String) binds: [B:283:0x06da, B:266:0x06a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:289:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:293:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:299:0x0734  */
    /* JADX WARN: Code duplicated, block: B:301:0x075f A[LOOP:10: B:297:0x072e->B:301:0x075f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x077b  */
    /* JADX WARN: Code duplicated, block: B:310:0x0799  */
    /* JADX WARN: Code duplicated, block: B:313:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:316:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:318:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:326:0x0807 A[Catch: SQLiteException -> 0x0864, all -> 0x0891, LOOP:3: B:326:0x0807->B:472:?, LOOP_START, TRY_LEAVE, TryCatch #14 {SQLiteException -> 0x0864, blocks: (B:324:0x0801, B:326:0x0807, B:327:0x080c, B:329:0x081d, B:331:0x082d, B:333:0x0838, B:336:0x0851, B:335:0x083d, B:339:0x085c), top: B:441:0x0801 }] */
    /* JADX WARN: Code duplicated, block: B:331:0x082d A[Catch: SQLiteException -> 0x0864, all -> 0x0891, TryCatch #14 {SQLiteException -> 0x0864, blocks: (B:324:0x0801, B:326:0x0807, B:327:0x080c, B:329:0x081d, B:331:0x082d, B:333:0x0838, B:336:0x0851, B:335:0x083d, B:339:0x085c), top: B:441:0x0801 }] */
    /* JADX WARN: Code duplicated, block: B:332:0x0836  */
    /* JADX WARN: Code duplicated, block: B:339:0x085c A[Catch: SQLiteException -> 0x0864, all -> 0x0891, TRY_ENTER, TRY_LEAVE, TryCatch #14 {SQLiteException -> 0x0864, blocks: (B:324:0x0801, B:326:0x0807, B:327:0x080c, B:329:0x081d, B:331:0x082d, B:333:0x0838, B:336:0x0851, B:335:0x083d, B:339:0x085c), top: B:441:0x0801 }] */
    /* JADX WARN: Code duplicated, block: B:340:0x0860 A[PHI: r0 r3 r31
      0x0860: PHI (r0v140 java.util.Map) = (r0v139 java.util.Map), (r0v147 java.util.Map) binds: [B:353:0x088a, B:339:0x085c] A[DONT_GENERATE, DONT_INLINE]
      0x0860: PHI (r3v61 android.database.Cursor) = (r3v60 android.database.Cursor), (r3v65 android.database.Cursor) binds: [B:353:0x088a, B:339:0x085c] A[DONT_GENERATE, DONT_INLINE]
      0x0860: PHI (r31v10 java.util.Iterator) = (r31v9 java.util.Iterator), (r31v12 java.util.Iterator) binds: [B:353:0x088a, B:339:0x085c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:361:0x0899  */
    /* JADX WARN: Code duplicated, block: B:365:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:368:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:371:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:373:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:375:0x090a  */
    /* JADX WARN: Code duplicated, block: B:376:0x0917  */
    /* JADX WARN: Code duplicated, block: B:378:0x0945  */
    /* JADX WARN: Code duplicated, block: B:381:0x094f  */
    /* JADX WARN: Code duplicated, block: B:390:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:391:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:395:0x09ba A[PHI: r16 r32
      0x09ba: PHI (r16v22 java.lang.String) = (r16v23 java.lang.String), (r1v26 java.lang.String) binds: [B:394:0x09b8, B:392:0x09aa] A[DONT_GENERATE, DONT_INLINE]
      0x09ba: PHI (r32v6 java.util.Map) = (r32v7 java.util.Map), (r32v9 java.util.Map) binds: [B:394:0x09b8, B:392:0x09aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:401:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:406:0x0a49 A[Catch: SQLiteException -> 0x0a5d, TRY_LEAVE, TryCatch #11 {SQLiteException -> 0x0a5d, blocks: (B:404:0x0a3f, B:406:0x0a49), top: B:438:0x0a3f }] */
    /* JADX WARN: Code duplicated, block: B:415:0x0a79  */
    /* JADX WARN: Code duplicated, block: B:473:0x08c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x09c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x09b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x098c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0a74 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x0793 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x0793 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x05f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0723 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x0715 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x0777 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x076d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x057b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x049b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x0489 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0174  */
    /* JADX WARN: Code duplicated, block: B:540:0x020d A[EDGE_INSN: B:540:0x020d->B:74:0x020d BREAK  A[LOOP:20: B:63:0x01c1->B:75:0x0213], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01ae A[Catch: SQLiteException -> 0x021e, all -> 0x0a7f, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x021e, blocks: (B:58:0x01a8, B:60:0x01ae, B:62:0x01bc, B:63:0x01c1, B:64:0x01cb, B:65:0x01db, B:67:0x01ea), top: B:437:0x01a8 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01bc A[Catch: SQLiteException -> 0x021e, all -> 0x0a7f, TRY_ENTER, TryCatch #10 {SQLiteException -> 0x021e, blocks: (B:58:0x01a8, B:60:0x01ae, B:62:0x01bc, B:63:0x01c1, B:64:0x01cb, B:65:0x01db, B:67:0x01ea), top: B:437:0x01a8 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0213 A[LOOP:20: B:63:0x01c1->B:75:0x0213, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x0247  */
    /* JADX WARN: Code duplicated, block: B:93:0x0252  */
    /* JADX WARN: Code duplicated, block: B:95:0x025a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0265  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v191, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r4v30, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v60, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v64, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    final List zzb(String str, List list, List list2, Long l10, Long l11, boolean z10) throws Throwable {
        int i10;
        int i11;
        boolean z11;
        ?? r10;
        Map map;
        Cursor cursor;
        String str2;
        Cursor cursorQuery;
        Map map2;
        Map map3;
        Iterator it;
        String str3;
        int iIntValue;
        com.google.android.gms.internal.measurement.zzii zziiVar;
        BitSet bitSet;
        BitSet bitSet2;
        androidx.collection.a aVar;
        List<com.google.android.gms.internal.measurement.zzff> list3;
        int i12;
        String str4;
        Long lValueOf;
        String str5;
        Map aVar2;
        ?? Zze;
        Cursor cursorRawQuery;
        androidx.collection.a aVar3;
        Iterator it2;
        Integer numValueOf;
        com.google.android.gms.internal.measurement.zzii zziiVar2;
        List list4;
        Map map4;
        Iterator it3;
        Integer numValueOf2;
        List arrayList;
        String str6;
        String str7;
        String str8;
        zzz zzzVar;
        androidx.collection.a aVar4;
        Iterator it4;
        com.google.android.gms.internal.measurement.zzhs zzhsVar;
        com.google.android.gms.internal.measurement.zzhs zzhsVarZza;
        zzpg zzpgVar;
        zzbd zzbdVarZzah;
        long j10;
        String strZzd;
        Map mapEmptyMap;
        long j11;
        String str9;
        Iterator it5;
        int iIntValue2;
        Set set;
        Integer numValueOf3;
        Iterator it6;
        boolean zZzd;
        long j12;
        zzaa zzaaVar;
        zzaw zzawVarZzj;
        String str10;
        androidx.collection.a aVar5;
        String str11;
        Cursor cursorQuery2;
        Integer numValueOf4;
        List arrayList2;
        String str12;
        String str13;
        ArrayList arrayList3;
        Iterator it7;
        zzaw zzawVarZzj2;
        String str14;
        ContentValues contentValues;
        androidx.collection.a aVar6;
        Iterator it8;
        String strZzc;
        Map mapEmptyMap2;
        Iterator it9;
        String str15;
        Iterator it10;
        int iIntValue3;
        Set set2;
        Integer numValueOf5;
        Iterator it11;
        boolean zZzd2;
        com.google.android.gms.internal.measurement.zzfn zzfnVar;
        zzic zzicVar;
        Integer numValueOf6;
        zzac zzacVar;
        Integer numValueOf7;
        zzaw zzawVarZzj3;
        String str16;
        androidx.collection.a aVar7;
        Cursor cursor2;
        Cursor cursorQuery3;
        Integer numValueOf8;
        List list5;
        List arrayList4;
        androidx.collection.a aVar8;
        int i13;
        Cursor cursorQuery4;
        List arrayList5;
        String str17 = "current_results";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new androidx.collection.a();
        this.zzd = l10;
        this.zze = l11;
        Iterator it12 = list.iterator();
        while (true) {
            i10 = 0;
            i11 = 1;
            if (!it12.hasNext()) {
                z11 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it12.next()).zzd())) {
                z11 = true;
                break;
            }
        }
        zzahn.zza();
        zzic zzicVar2 = this.zzu;
        boolean zZzp = zzicVar2.zzc().zzp(this.zza, zzfy.zzaF);
        zzahn.zza();
        boolean zZzp2 = zzicVar2.zzc().zzp(this.zza, zzfy.zzaE);
        if (z11) {
            zzaw zzawVarZzj4 = this.zzg.zzj();
            String str18 = this.zza;
            zzawVarZzj4.zzay();
            zzawVarZzj4.zzg();
            Preconditions.checkNotEmpty(str18);
            ?? contentValues2 = new ContentValues();
            ?? r11 = 0;
            contentValues2.put("current_session_count", r11);
            try {
                r11 = "events";
                zzawVarZzj4.zze().update("events", contentValues2, "app_id = ?", new String[]{str18});
                r10 = "events";
            } catch (SQLiteException e10) {
                zzawVarZzj4.zzu.zzaW().zzb().zzc("Error resetting session-scoped event counts. appId", zzgu.zzl(str18), e10);
                r10 = r11;
            }
        }
        Map mapEmptyMap3 = Collections.emptyMap();
        String str19 = "Failed to merge filter. appId";
        String str20 = "data";
        String str21 = "audience_id";
        if (zZzp2 && zZzp) {
            zzaw zzawVarZzj5 = this.zzg.zzj();
            String str22 = this.zza;
            Preconditions.checkNotEmpty(str22);
            androidx.collection.a aVar9 = new androidx.collection.a();
            try {
                try {
                    cursorQuery4 = zzawVarZzj5.zze().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str22}, null, null, null);
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery4.getBlob(i11))).zzbd();
                                    if (zzffVar.zzh()) {
                                        Integer numValueOf9 = Integer.valueOf(cursorQuery4.getInt(i10));
                                        List list6 = (List) aVar9.get(numValueOf9);
                                        if (list6 == null) {
                                            arrayList5 = new ArrayList();
                                            aVar9.put(numValueOf9, arrayList5);
                                        } else {
                                            arrayList5 = list6;
                                        }
                                        arrayList5.add(zzffVar);
                                    }
                                } catch (IOException e11) {
                                    zzawVarZzj5.zzu.zzaW().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str22), e11);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i10 = 0;
                                i11 = 1;
                            }
                            cursorQuery4.close();
                            map = aVar9;
                        } else {
                            mapEmptyMap3 = Collections.emptyMap();
                            cursorQuery4.close();
                            map = mapEmptyMap3;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        zzawVarZzj5.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str22), e);
                        mapEmptyMap3 = Collections.emptyMap();
                        if (cursorQuery4 != null) {
                        }
                        map = mapEmptyMap3;
                        zzaw zzawVarZzj6 = this.zzg.zzj();
                        String str23 = this.zza;
                        zzawVarZzj6.zzay();
                        zzawVarZzj6.zzg();
                        Preconditions.checkNotEmpty(str23);
                        cursorQuery = zzawVarZzj6.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str23}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    aVar8 = new androidx.collection.a();
                                    while (true) {
                                        i13 = cursorQuery.getInt(0);
                                        try {
                                            aVar8.put(Integer.valueOf(i13), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzj(), cursorQuery.getBlob(1))).zzbd());
                                            str2 = str21;
                                        } catch (IOException e13) {
                                            str2 = str21;
                                            try {
                                                zzawVarZzj6.zzu.zzaW().zzb().zzd("Failed to merge filter results. appId, audienceId, error", zzgu.zzl(str23), Integer.valueOf(i13), e13);
                                            } catch (SQLiteException e14) {
                                                e = e14;
                                                str20 = str20;
                                                zzawVarZzj6.zzu.zzaW().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str23), e);
                                                Map mapEmptyMap4 = Collections.emptyMap();
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = mapEmptyMap4;
                                                if (map2.isEmpty()) {
                                                    str3 = "Failed to merge filter. appId";
                                                } else {
                                                    HashSet hashSet = new HashSet(map2.keySet());
                                                    if (z11) {
                                                        String str24 = this.zza;
                                                        zzaw zzawVarZzj7 = this.zzg.zzj();
                                                        str5 = this.zza;
                                                        zzawVarZzj7.zzay();
                                                        zzawVarZzj7.zzg();
                                                        Preconditions.checkNotEmpty(str5);
                                                        aVar2 = new androidx.collection.a();
                                                        Zze = zzawVarZzj7.zze();
                                                        try {
                                                            try {
                                                                cursorRawQuery = Zze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str5, str5});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) aVar2.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                aVar2.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        aVar2 = Collections.emptyMap();
                                                                    }
                                                                } catch (SQLiteException e15) {
                                                                    e = e15;
                                                                    zzawVarZzj7.zzu.zzaW().zzb().zzc("Database error querying scoped filters. appId", zzgu.zzl(str5), e);
                                                                    aVar2 = Collections.emptyMap();
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    Preconditions.checkNotEmpty(str24);
                                                                    Preconditions.checkNotNull(map2);
                                                                    aVar3 = new androidx.collection.a();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            int iIntValue4 = ((Integer) it2.next()).intValue();
                                                                            numValueOf = Integer.valueOf(iIntValue4);
                                                                            zziiVar2 = (com.google.android.gms.internal.measurement.zzii) map2.get(numValueOf);
                                                                            list4 = (List) aVar2.get(numValueOf);
                                                                            if (list4 != null) {
                                                                                map4 = aVar2;
                                                                                it3 = it2;
                                                                                aVar3.put(numValueOf, zziiVar2);
                                                                                aVar2 = map4;
                                                                                it2 = it3;
                                                                            } else {
                                                                                map4 = aVar2;
                                                                                it3 = it2;
                                                                                aVar3.put(numValueOf, zziiVar2);
                                                                                aVar2 = map4;
                                                                                it2 = it3;
                                                                            }
                                                                        }
                                                                    }
                                                                    map3 = aVar3;
                                                                    it = hashSet.iterator();
                                                                    while (it.hasNext()) {
                                                                        iIntValue = ((Integer) it.next()).intValue();
                                                                        zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(Integer.valueOf(iIntValue));
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        aVar = new androidx.collection.a();
                                                                        if (zziiVar != null) {
                                                                            for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.zze()) {
                                                                                if (zzhqVar.zza()) {
                                                                                    Integer numValueOf10 = Integer.valueOf(zzhqVar.zzb());
                                                                                    if (zzhqVar.zzc()) {
                                                                                        lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    aVar.put(numValueOf10, lValueOf);
                                                                                }
                                                                            }
                                                                        }
                                                                        androidx.collection.a aVar10 = new androidx.collection.a();
                                                                        if (zziiVar != null) {
                                                                            for (com.google.android.gms.internal.measurement.zzik zzikVar : zziiVar.zzh()) {
                                                                                if (!zzikVar.zza()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map5 = map3;
                                                                        if (zziiVar != null) {
                                                                            i12 = 0;
                                                                            while (i12 < zziiVar.zzb() * 64) {
                                                                                if (zzpk.zzn(zziiVar.zza(), i12)) {
                                                                                    str4 = str19;
                                                                                    this.zzu.zzaW().zzk().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i12));
                                                                                    bitSet2.set(i12);
                                                                                    if (zzpk.zzn(zziiVar.zzc(), i12)) {
                                                                                        bitSet.set(i12);
                                                                                    }
                                                                                    i12++;
                                                                                    str19 = str4;
                                                                                } else {
                                                                                    str4 = str19;
                                                                                }
                                                                                aVar.remove(Integer.valueOf(i12));
                                                                                i12++;
                                                                                str19 = str4;
                                                                            }
                                                                        }
                                                                        String str25 = str19;
                                                                        Integer numValueOf11 = Integer.valueOf(iIntValue);
                                                                        com.google.android.gms.internal.measurement.zzii zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(numValueOf11);
                                                                        if (!zZzp2) {
                                                                        }
                                                                        this.zzc.put(Integer.valueOf(iIntValue), new zzy(this, this.zza, zziiVar3, bitSet, bitSet2, aVar, aVar10, null));
                                                                        str19 = str25;
                                                                        map = map;
                                                                        map3 = map5;
                                                                        map2 = map2;
                                                                    }
                                                                    str3 = str19;
                                                                    str6 = str2;
                                                                    str7 = str20;
                                                                    str8 = "Skipping failed audience ID";
                                                                    if (!list.isEmpty()) {
                                                                        zzzVar = new zzz(this, null);
                                                                        aVar4 = new androidx.collection.a();
                                                                        it4 = list.iterator();
                                                                        while (it4.hasNext()) {
                                                                            zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                                                            zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                                                            if (zzhsVarZza != null) {
                                                                                zzpgVar = this.zzg;
                                                                                zzbdVarZzah = zzpgVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.zzd());
                                                                                zzpgVar.zzj().zzh(zzbdVarZzah);
                                                                                if (!z10) {
                                                                                    j10 = zzbdVarZzah.zzc;
                                                                                    strZzd = zzhsVarZza.zzd();
                                                                                    mapEmptyMap = (Map) aVar4.get(strZzd);
                                                                                    if (mapEmptyMap == null) {
                                                                                        zzawVarZzj = zzpgVar.zzj();
                                                                                        str10 = this.zza;
                                                                                        zzawVarZzj.zzay();
                                                                                        zzawVarZzj.zzg();
                                                                                        Preconditions.checkNotEmpty(str10);
                                                                                        Preconditions.checkNotEmpty(strZzd);
                                                                                        aVar5 = new androidx.collection.a();
                                                                                        str9 = str6;
                                                                                        str11 = str7;
                                                                                        try {
                                                                                            try {
                                                                                                str7 = str11;
                                                                                                try {
                                                                                                    cursorQuery2 = zzawVarZzj.zze().query("event_filters", new String[]{str9, str11}, "app_id=? AND event_name=?", new String[]{str10, strZzd}, null, null, null);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                                                j11 = j10;
                                                                                                                do {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            com.google.android.gms.internal.measurement.zzff zzffVar2 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbd();
                                                                                                                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                            arrayList2 = (List) aVar5.get(numValueOf4);
                                                                                                                            if (arrayList2 == null) {
                                                                                                                                arrayList2 = new ArrayList();
                                                                                                                                aVar5.put(numValueOf4, arrayList2);
                                                                                                                            }
                                                                                                                            arrayList2.add(zzffVar2);
                                                                                                                        } catch (IOException e16) {
                                                                                                                            zzawVarZzj.zzu.zzaW().zzb().zzc(str3, zzgu.zzl(str10), e16);
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e17) {
                                                                                                                        e = e17;
                                                                                                                        zzawVarZzj.zzu.zzaW().zzb().zzc(r8, zzgu.zzl(str10), e);
                                                                                                                        mapEmptyMap = Collections.emptyMap();
                                                                                                                        if (cursorQuery2 != null) {
                                                                                                                            cursorQuery2.close();
                                                                                                                        }
                                                                                                                    }
                                                                                                                } while (cursorQuery2.moveToNext());
                                                                                                                cursorQuery2.close();
                                                                                                                mapEmptyMap = aVar5;
                                                                                                            } else {
                                                                                                                j11 = j10;
                                                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                                                cursorQuery2.close();
                                                                                                            }
                                                                                                        } catch (Throwable th) {
                                                                                                            th = th;
                                                                                                            if (cursorQuery2 != null) {
                                                                                                                cursorQuery2.close();
                                                                                                            }
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (SQLiteException e18) {
                                                                                                        e = e18;
                                                                                                        j11 = j10;
                                                                                                    }
                                                                                                } catch (SQLiteException e19) {
                                                                                                    e = e19;
                                                                                                    j11 = j10;
                                                                                                    cursorQuery2 = null;
                                                                                                    zzawVarZzj.zzu.zzaW().zzb().zzc(r8, zzgu.zzl(str10), e);
                                                                                                    mapEmptyMap = Collections.emptyMap();
                                                                                                    if (cursorQuery2 != null) {
                                                                                                        cursorQuery2.close();
                                                                                                    }
                                                                                                    aVar4.put(strZzd, mapEmptyMap);
                                                                                                    it5 = mapEmptyMap.keySet().iterator();
                                                                                                    while (it5.hasNext()) {
                                                                                                        iIntValue2 = ((Integer) it5.next()).intValue();
                                                                                                        set = this.zzb;
                                                                                                        numValueOf3 = Integer.valueOf(iIntValue2);
                                                                                                        if (set.contains(numValueOf3)) {
                                                                                                            this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", numValueOf3);
                                                                                                        } else {
                                                                                                            it6 = ((List) mapEmptyMap.get(numValueOf3)).iterator();
                                                                                                            zZzd = true;
                                                                                                            while (true) {
                                                                                                                if (!it6.hasNext()) {
                                                                                                                    j12 = j11;
                                                                                                                    break;
                                                                                                                }
                                                                                                                com.google.android.gms.internal.measurement.zzff zzffVar3 = (com.google.android.gms.internal.measurement.zzff) it6.next();
                                                                                                                zzaaVar = new zzaa(this, this.zza, iIntValue2, zzffVar3);
                                                                                                                j12 = j11;
                                                                                                                zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbdVarZzah, zzd(iIntValue2, zzffVar3.zzb()));
                                                                                                                if (!zZzd) {
                                                                                                                    this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                                    break;
                                                                                                                }
                                                                                                                zzc(Integer.valueOf(iIntValue2)).zza(zzaaVar);
                                                                                                                j11 = j12;
                                                                                                            }
                                                                                                            if (!zZzd) {
                                                                                                                this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                            }
                                                                                                            j11 = j12;
                                                                                                        }
                                                                                                    }
                                                                                                    zzzVar = zzzVar;
                                                                                                    it4 = it4;
                                                                                                    str6 = str9;
                                                                                                    str17 = str17;
                                                                                                }
                                                                                            } catch (Throwable th2) {
                                                                                                th = th2;
                                                                                                cursorQuery2 = null;
                                                                                            }
                                                                                        } catch (SQLiteException e20) {
                                                                                            e = e20;
                                                                                            str7 = str11;
                                                                                        }
                                                                                        aVar4.put(strZzd, mapEmptyMap);
                                                                                    } else {
                                                                                        j11 = j10;
                                                                                        str9 = str6;
                                                                                    }
                                                                                    it5 = mapEmptyMap.keySet().iterator();
                                                                                    while (it5.hasNext()) {
                                                                                        iIntValue2 = ((Integer) it5.next()).intValue();
                                                                                        set = this.zzb;
                                                                                        numValueOf3 = Integer.valueOf(iIntValue2);
                                                                                        if (set.contains(numValueOf3)) {
                                                                                            this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", numValueOf3);
                                                                                        } else {
                                                                                            it6 = ((List) mapEmptyMap.get(numValueOf3)).iterator();
                                                                                            zZzd = true;
                                                                                            while (true) {
                                                                                                if (!it6.hasNext()) {
                                                                                                    j12 = j11;
                                                                                                    break;
                                                                                                }
                                                                                                com.google.android.gms.internal.measurement.zzff zzffVar4 = (com.google.android.gms.internal.measurement.zzff) it6.next();
                                                                                                zzaaVar = new zzaa(this, this.zza, iIntValue2, zzffVar4);
                                                                                                j12 = j11;
                                                                                                zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbdVarZzah, zzd(iIntValue2, zzffVar4.zzb()));
                                                                                                if (!zZzd) {
                                                                                                    this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                    break;
                                                                                                }
                                                                                                zzc(Integer.valueOf(iIntValue2)).zza(zzaaVar);
                                                                                                j11 = j12;
                                                                                            }
                                                                                            if (!zZzd) {
                                                                                                this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                            }
                                                                                            j11 = j12;
                                                                                        }
                                                                                    }
                                                                                    zzzVar = zzzVar;
                                                                                    it4 = it4;
                                                                                    str6 = str9;
                                                                                    str17 = str17;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    str12 = str17;
                                                                    str13 = str6;
                                                                    if (!z10) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        aVar6 = new androidx.collection.a();
                                                                        it8 = list2.iterator();
                                                                        while (it8.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it8.next();
                                                                            strZzc = zziuVar.zzc();
                                                                            mapEmptyMap2 = (Map) aVar6.get(strZzc);
                                                                            if (mapEmptyMap2 == null) {
                                                                                zzawVarZzj3 = this.zzg.zzj();
                                                                                str16 = this.zza;
                                                                                zzawVarZzj3.zzay();
                                                                                zzawVarZzj3.zzg();
                                                                                Preconditions.checkNotEmpty(str16);
                                                                                Preconditions.checkNotEmpty(strZzc);
                                                                                aVar7 = new androidx.collection.a();
                                                                                str15 = str7;
                                                                                try {
                                                                                    try {
                                                                                        it9 = it8;
                                                                                        try {
                                                                                            cursorQuery3 = zzawVarZzj3.zze().query("property_filters", new String[]{str13, str15}, "app_id=? AND property_name=?", new String[]{str16, strZzc}, null, null, null);
                                                                                            try {
                                                                                                try {
                                                                                                    if (cursorQuery3.moveToFirst()) {
                                                                                                        do {
                                                                                                            try {
                                                                                                                com.google.android.gms.internal.measurement.zzfn zzfnVar2 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzj(), cursorQuery3.getBlob(1))).zzbd();
                                                                                                                numValueOf8 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                                list5 = (List) aVar7.get(numValueOf8);
                                                                                                                if (list5 == null) {
                                                                                                                    arrayList4 = new ArrayList();
                                                                                                                    aVar7.put(numValueOf8, arrayList4);
                                                                                                                } else {
                                                                                                                    arrayList4 = list5;
                                                                                                                }
                                                                                                                arrayList4.add(zzfnVar2);
                                                                                                            } catch (IOException e21) {
                                                                                                                zzawVarZzj3.zzu.zzaW().zzb().zzc("Failed to merge filter", zzgu.zzl(str16), e21);
                                                                                                            }
                                                                                                        } while (cursorQuery3.moveToNext());
                                                                                                        cursorQuery3.close();
                                                                                                        mapEmptyMap2 = aVar7;
                                                                                                    } else {
                                                                                                        mapEmptyMap2 = Collections.emptyMap();
                                                                                                        cursorQuery3.close();
                                                                                                    }
                                                                                                } catch (SQLiteException e22) {
                                                                                                    e = e22;
                                                                                                    zzawVarZzj3.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str16), e);
                                                                                                    mapEmptyMap2 = Collections.emptyMap();
                                                                                                    if (cursorQuery3 != null) {
                                                                                                        cursorQuery3.close();
                                                                                                    }
                                                                                                }
                                                                                                aVar6.put(strZzc, mapEmptyMap2);
                                                                                            } catch (Throwable th3) {
                                                                                                th = th3;
                                                                                                cursor2 = cursorQuery3;
                                                                                                if (cursor2 != null) {
                                                                                                    cursor2.close();
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (SQLiteException e23) {
                                                                                            e = e23;
                                                                                            cursorQuery3 = null;
                                                                                            zzawVarZzj3.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str16), e);
                                                                                            mapEmptyMap2 = Collections.emptyMap();
                                                                                            if (cursorQuery3 != null) {
                                                                                                cursorQuery3.close();
                                                                                            }
                                                                                            aVar6.put(strZzc, mapEmptyMap2);
                                                                                            it10 = mapEmptyMap2.keySet().iterator();
                                                                                            while (it10.hasNext()) {
                                                                                                iIntValue3 = ((Integer) it10.next()).intValue();
                                                                                                set2 = this.zzb;
                                                                                                numValueOf5 = Integer.valueOf(iIntValue3);
                                                                                                if (set2.contains(numValueOf5)) {
                                                                                                    this.zzu.zzaW().zzk().zzb(str8, numValueOf5);
                                                                                                    break;
                                                                                                }
                                                                                                it11 = ((List) mapEmptyMap2.get(numValueOf5)).iterator();
                                                                                                zZzd2 = true;
                                                                                                while (true) {
                                                                                                    if (it11.hasNext()) {
                                                                                                        zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it11.next();
                                                                                                        zzicVar = this.zzu;
                                                                                                        if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                                                                                            zzgs zzgsVarZzk = zzicVar.zzaW().zzk();
                                                                                                            Integer numValueOf12 = Integer.valueOf(iIntValue3);
                                                                                                            if (zzfnVar.zza()) {
                                                                                                                numValueOf7 = Integer.valueOf(zzfnVar.zzb());
                                                                                                            } else {
                                                                                                                numValueOf7 = null;
                                                                                                            }
                                                                                                            zzgsVarZzk.zzd("Evaluating filter. audience, filter, property", numValueOf12, numValueOf7, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                                                                            zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                                                        } else {
                                                                                                            mapEmptyMap2 = mapEmptyMap2;
                                                                                                        }
                                                                                                        if (zzfnVar.zza()) {
                                                                                                        }
                                                                                                        zzgs zzgsVarZze = zzicVar.zzaW().zze();
                                                                                                        Object objZzl = zzgu.zzl(this.zza);
                                                                                                        if (zzfnVar.zza()) {
                                                                                                            numValueOf6 = Integer.valueOf(zzfnVar.zzb());
                                                                                                        } else {
                                                                                                            numValueOf6 = null;
                                                                                                        }
                                                                                                        zzgsVarZze.zzc("Invalid property filter ID. appId, id", objZzl, String.valueOf(numValueOf6));
                                                                                                        this.zzb.add(Integer.valueOf(iIntValue3));
                                                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                                                        str8 = str8;
                                                                                                    } else {
                                                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                                                        str8 = str8;
                                                                                                    }
                                                                                                    if (!zZzd2) {
                                                                                                        this.zzb.add(Integer.valueOf(iIntValue3));
                                                                                                    }
                                                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                                                    str8 = str8;
                                                                                                    zzc(Integer.valueOf(iIntValue3)).zza(zzacVar);
                                                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                                                    str8 = str8;
                                                                                                }
                                                                                            }
                                                                                            it8 = it9;
                                                                                            str7 = str15;
                                                                                        }
                                                                                    } catch (Throwable th4) {
                                                                                        th = th4;
                                                                                        cursor2 = null;
                                                                                    }
                                                                                } catch (SQLiteException e24) {
                                                                                    e = e24;
                                                                                    it9 = it8;
                                                                                }
                                                                            } else {
                                                                                it9 = it8;
                                                                                str15 = str7;
                                                                            }
                                                                            it10 = mapEmptyMap2.keySet().iterator();
                                                                            while (it10.hasNext()) {
                                                                                iIntValue3 = ((Integer) it10.next()).intValue();
                                                                                set2 = this.zzb;
                                                                                numValueOf5 = Integer.valueOf(iIntValue3);
                                                                                if (set2.contains(numValueOf5)) {
                                                                                    this.zzu.zzaW().zzk().zzb(str8, numValueOf5);
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it11 = ((List) mapEmptyMap2.get(numValueOf5)).iterator();
                                                                                zZzd2 = true;
                                                                                while (true) {
                                                                                    if (it11.hasNext()) {
                                                                                        zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it11.next();
                                                                                        zzicVar = this.zzu;
                                                                                        if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                                                                            zzgs zzgsVarZzk2 = zzicVar.zzaW().zzk();
                                                                                            Integer numValueOf13 = Integer.valueOf(iIntValue3);
                                                                                            if (zzfnVar.zza()) {
                                                                                                numValueOf7 = Integer.valueOf(zzfnVar.zzb());
                                                                                            } else {
                                                                                                numValueOf7 = null;
                                                                                            }
                                                                                            zzgsVarZzk2.zzd("Evaluating filter. audience, filter, property", numValueOf13, numValueOf7, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                                                            zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                                        } else {
                                                                                            mapEmptyMap2 = mapEmptyMap2;
                                                                                        }
                                                                                        if (zzfnVar.zza()) {
                                                                                        }
                                                                                        zzgs zzgsVarZze2 = zzicVar.zzaW().zze();
                                                                                        Object objZzl2 = zzgu.zzl(this.zza);
                                                                                        if (zzfnVar.zza()) {
                                                                                            numValueOf6 = Integer.valueOf(zzfnVar.zzb());
                                                                                        } else {
                                                                                            numValueOf6 = null;
                                                                                        }
                                                                                        zzgsVarZze2.zzc("Invalid property filter ID. appId, id", objZzl2, String.valueOf(numValueOf6));
                                                                                        this.zzb.add(Integer.valueOf(iIntValue3));
                                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                                        str8 = str8;
                                                                                    } else {
                                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                                        str8 = str8;
                                                                                    }
                                                                                    if (!zZzd2) {
                                                                                        this.zzb.add(Integer.valueOf(iIntValue3));
                                                                                    }
                                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                                    str8 = str8;
                                                                                    zzc(Integer.valueOf(iIntValue3)).zza(zzacVar);
                                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                                    str8 = str8;
                                                                                }
                                                                            }
                                                                            it8 = it9;
                                                                            str7 = str15;
                                                                        }
                                                                    }
                                                                    arrayList3 = new ArrayList();
                                                                    Set setKeySet = this.zzc.keySet();
                                                                    setKeySet.removeAll(this.zzb);
                                                                    it7 = setKeySet.iterator();
                                                                    while (it7.hasNext()) {
                                                                        int iIntValue5 = ((Integer) it7.next()).intValue();
                                                                        Map map6 = this.zzc;
                                                                        Integer numValueOf14 = Integer.valueOf(iIntValue5);
                                                                        zzy zzyVar = (zzy) map6.get(numValueOf14);
                                                                        Preconditions.checkNotNull(zzyVar);
                                                                        com.google.android.gms.internal.measurement.zzhg zzhgVarZzb = zzyVar.zzb(iIntValue5);
                                                                        arrayList3.add(zzhgVarZzb);
                                                                        zzawVarZzj2 = this.zzg.zzj();
                                                                        str14 = this.zza;
                                                                        com.google.android.gms.internal.measurement.zzii zziiVarZzc = zzhgVarZzb.zzc();
                                                                        zzawVarZzj2.zzay();
                                                                        zzawVarZzj2.zzg();
                                                                        Preconditions.checkNotEmpty(str14);
                                                                        Preconditions.checkNotNull(zziiVarZzc);
                                                                        byte[] bArrZzcd = zziiVarZzc.zzcd();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str14);
                                                                        contentValues.put(str13, numValueOf14);
                                                                        String str26 = str12;
                                                                        contentValues.put(str26, bArrZzcd);
                                                                        try {
                                                                            try {
                                                                                if (zzawVarZzj2.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    zzawVarZzj2.zzu.zzaW().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str14));
                                                                                }
                                                                            } catch (SQLiteException e25) {
                                                                                e = e25;
                                                                                zzawVarZzj2.zzu.zzaW().zzb().zzc("Error storing filter results. appId", zzgu.zzl(str14), e);
                                                                            }
                                                                        } catch (SQLiteException e26) {
                                                                            e = e26;
                                                                        }
                                                                        str12 = str26;
                                                                    }
                                                                    return arrayList3;
                                                                }
                                                            } catch (SQLiteException e27) {
                                                                e = e27;
                                                                cursorRawQuery = null;
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                Zze = 0;
                                                                if (Zze != 0) {
                                                                    Zze.close();
                                                                }
                                                                throw th;
                                                            }
                                                            cursorRawQuery.close();
                                                            Preconditions.checkNotEmpty(str24);
                                                            Preconditions.checkNotNull(map2);
                                                            aVar3 = new androidx.collection.a();
                                                            if (!map2.isEmpty()) {
                                                                it2 = map2.keySet().iterator();
                                                                while (it2.hasNext()) {
                                                                    int iIntValue6 = ((Integer) it2.next()).intValue();
                                                                    numValueOf = Integer.valueOf(iIntValue6);
                                                                    zziiVar2 = (com.google.android.gms.internal.measurement.zzii) map2.get(numValueOf);
                                                                    list4 = (List) aVar2.get(numValueOf);
                                                                    if (list4 != null) {
                                                                        map4 = aVar2;
                                                                        it3 = it2;
                                                                        aVar3.put(numValueOf, zziiVar2);
                                                                        aVar2 = map4;
                                                                        it2 = it3;
                                                                    } else {
                                                                        map4 = aVar2;
                                                                        it3 = it2;
                                                                        aVar3.put(numValueOf, zziiVar2);
                                                                        aVar2 = map4;
                                                                        it2 = it3;
                                                                    }
                                                                }
                                                            }
                                                            map3 = aVar3;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                        }
                                                    } else {
                                                        map3 = map2;
                                                    }
                                                    it = hashSet.iterator();
                                                    while (it.hasNext()) {
                                                        iIntValue = ((Integer) it.next()).intValue();
                                                        zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(Integer.valueOf(iIntValue));
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        aVar = new androidx.collection.a();
                                                        if (zziiVar != null) {
                                                            while (r2.hasNext()) {
                                                                if (zzhqVar.zza()) {
                                                                    Integer numValueOf15 = Integer.valueOf(zzhqVar.zzb());
                                                                    if (zzhqVar.zzc()) {
                                                                        lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    aVar.put(numValueOf15, lValueOf);
                                                                }
                                                            }
                                                        }
                                                        androidx.collection.a aVar11 = new androidx.collection.a();
                                                        if (zziiVar != null) {
                                                            while (r2.hasNext()) {
                                                                if (!zzikVar.zza()) {
                                                                }
                                                            }
                                                        }
                                                        Map map7 = map3;
                                                        if (zziiVar != null) {
                                                            i12 = 0;
                                                            while (i12 < zziiVar.zzb() * 64) {
                                                                if (zzpk.zzn(zziiVar.zza(), i12)) {
                                                                    str4 = str19;
                                                                    this.zzu.zzaW().zzk().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i12));
                                                                    bitSet2.set(i12);
                                                                    if (zzpk.zzn(zziiVar.zzc(), i12)) {
                                                                        bitSet.set(i12);
                                                                    }
                                                                    i12++;
                                                                    str19 = str4;
                                                                } else {
                                                                    str4 = str19;
                                                                }
                                                                aVar.remove(Integer.valueOf(i12));
                                                                i12++;
                                                                str19 = str4;
                                                            }
                                                        }
                                                        String str27 = str19;
                                                        Integer numValueOf16 = Integer.valueOf(iIntValue);
                                                        com.google.android.gms.internal.measurement.zzii zziiVar4 = (com.google.android.gms.internal.measurement.zzii) map2.get(numValueOf16);
                                                        if (!zZzp2) {
                                                        }
                                                        this.zzc.put(Integer.valueOf(iIntValue), new zzy(this, this.zza, zziiVar4, bitSet, bitSet2, aVar, aVar11, null));
                                                        str19 = str27;
                                                        map = map;
                                                        map3 = map7;
                                                        map2 = map2;
                                                    }
                                                    str3 = str19;
                                                }
                                                str6 = str2;
                                                str7 = str20;
                                                str8 = "Skipping failed audience ID";
                                                if (!list.isEmpty()) {
                                                    zzzVar = new zzz(this, null);
                                                    aVar4 = new androidx.collection.a();
                                                    it4 = list.iterator();
                                                    while (it4.hasNext()) {
                                                        zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                                        zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                                        if (zzhsVarZza != null) {
                                                            zzpgVar = this.zzg;
                                                            zzbdVarZzah = zzpgVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.zzd());
                                                            zzpgVar.zzj().zzh(zzbdVarZzah);
                                                            if (!z10) {
                                                                j10 = zzbdVarZzah.zzc;
                                                                strZzd = zzhsVarZza.zzd();
                                                                mapEmptyMap = (Map) aVar4.get(strZzd);
                                                                if (mapEmptyMap == null) {
                                                                    zzawVarZzj = zzpgVar.zzj();
                                                                    str10 = this.zza;
                                                                    zzawVarZzj.zzay();
                                                                    zzawVarZzj.zzg();
                                                                    Preconditions.checkNotEmpty(str10);
                                                                    Preconditions.checkNotEmpty(strZzd);
                                                                    aVar5 = new androidx.collection.a();
                                                                    str9 = str6;
                                                                    str11 = str7;
                                                                    str7 = str11;
                                                                    cursorQuery2 = zzawVarZzj.zze().query("event_filters", new String[]{str9, str11}, "app_id=? AND event_name=?", new String[]{str10, strZzd}, null, null, null);
                                                                    if (cursorQuery2.moveToFirst()) {
                                                                        j11 = j10;
                                                                        do {
                                                                            com.google.android.gms.internal.measurement.zzff zzffVar5 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbd();
                                                                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                            arrayList2 = (List) aVar5.get(numValueOf4);
                                                                            if (arrayList2 == null) {
                                                                                arrayList2 = new ArrayList();
                                                                                aVar5.put(numValueOf4, arrayList2);
                                                                            }
                                                                            arrayList2.add(zzffVar5);
                                                                        } while (cursorQuery2.moveToNext());
                                                                        cursorQuery2.close();
                                                                        mapEmptyMap = aVar5;
                                                                    } else {
                                                                        j11 = j10;
                                                                        mapEmptyMap = Collections.emptyMap();
                                                                        cursorQuery2.close();
                                                                    }
                                                                    aVar4.put(strZzd, mapEmptyMap);
                                                                } else {
                                                                    j11 = j10;
                                                                    str9 = str6;
                                                                }
                                                                it5 = mapEmptyMap.keySet().iterator();
                                                                while (it5.hasNext()) {
                                                                    iIntValue2 = ((Integer) it5.next()).intValue();
                                                                    set = this.zzb;
                                                                    numValueOf3 = Integer.valueOf(iIntValue2);
                                                                    if (set.contains(numValueOf3)) {
                                                                        this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", numValueOf3);
                                                                    } else {
                                                                        it6 = ((List) mapEmptyMap.get(numValueOf3)).iterator();
                                                                        zZzd = true;
                                                                        while (true) {
                                                                            if (!it6.hasNext()) {
                                                                                j12 = j11;
                                                                                break;
                                                                            }
                                                                            com.google.android.gms.internal.measurement.zzff zzffVar6 = (com.google.android.gms.internal.measurement.zzff) it6.next();
                                                                            zzaaVar = new zzaa(this, this.zza, iIntValue2, zzffVar6);
                                                                            j12 = j11;
                                                                            zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbdVarZzah, zzd(iIntValue2, zzffVar6.zzb()));
                                                                            if (!zZzd) {
                                                                                this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                break;
                                                                            }
                                                                            zzc(Integer.valueOf(iIntValue2)).zza(zzaaVar);
                                                                            j11 = j12;
                                                                        }
                                                                        if (!zZzd) {
                                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                                        }
                                                                        j11 = j12;
                                                                    }
                                                                }
                                                                zzzVar = zzzVar;
                                                                it4 = it4;
                                                                str6 = str9;
                                                                str17 = str17;
                                                            }
                                                        }
                                                    }
                                                }
                                                str12 = str17;
                                                str13 = str6;
                                                if (!z10) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    aVar6 = new androidx.collection.a();
                                                    it8 = list2.iterator();
                                                    while (it8.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zziu zziuVar2 = (com.google.android.gms.internal.measurement.zziu) it8.next();
                                                        strZzc = zziuVar2.zzc();
                                                        mapEmptyMap2 = (Map) aVar6.get(strZzc);
                                                        if (mapEmptyMap2 == null) {
                                                            zzawVarZzj3 = this.zzg.zzj();
                                                            str16 = this.zza;
                                                            zzawVarZzj3.zzay();
                                                            zzawVarZzj3.zzg();
                                                            Preconditions.checkNotEmpty(str16);
                                                            Preconditions.checkNotEmpty(strZzc);
                                                            aVar7 = new androidx.collection.a();
                                                            str15 = str7;
                                                            it9 = it8;
                                                            cursorQuery3 = zzawVarZzj3.zze().query("property_filters", new String[]{str13, str15}, "app_id=? AND property_name=?", new String[]{str16, strZzc}, null, null, null);
                                                            if (cursorQuery3.moveToFirst()) {
                                                                do {
                                                                    com.google.android.gms.internal.measurement.zzfn zzfnVar3 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzj(), cursorQuery3.getBlob(1))).zzbd();
                                                                    numValueOf8 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                    list5 = (List) aVar7.get(numValueOf8);
                                                                    if (list5 == null) {
                                                                        arrayList4 = new ArrayList();
                                                                        aVar7.put(numValueOf8, arrayList4);
                                                                    } else {
                                                                        arrayList4 = list5;
                                                                    }
                                                                    arrayList4.add(zzfnVar3);
                                                                } while (cursorQuery3.moveToNext());
                                                                cursorQuery3.close();
                                                                mapEmptyMap2 = aVar7;
                                                            } else {
                                                                mapEmptyMap2 = Collections.emptyMap();
                                                                cursorQuery3.close();
                                                            }
                                                            aVar6.put(strZzc, mapEmptyMap2);
                                                        } else {
                                                            it9 = it8;
                                                            str15 = str7;
                                                        }
                                                        it10 = mapEmptyMap2.keySet().iterator();
                                                        while (it10.hasNext()) {
                                                            iIntValue3 = ((Integer) it10.next()).intValue();
                                                            set2 = this.zzb;
                                                            numValueOf5 = Integer.valueOf(iIntValue3);
                                                            if (set2.contains(numValueOf5)) {
                                                                this.zzu.zzaW().zzk().zzb(str8, numValueOf5);
                                                                break;
                                                                break;
                                                            }
                                                            it11 = ((List) mapEmptyMap2.get(numValueOf5)).iterator();
                                                            zZzd2 = true;
                                                            while (true) {
                                                                if (it11.hasNext()) {
                                                                    zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it11.next();
                                                                    zzicVar = this.zzu;
                                                                    if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                                                        zzgs zzgsVarZzk3 = zzicVar.zzaW().zzk();
                                                                        Integer numValueOf17 = Integer.valueOf(iIntValue3);
                                                                        if (zzfnVar.zza()) {
                                                                            numValueOf7 = Integer.valueOf(zzfnVar.zzb());
                                                                        } else {
                                                                            numValueOf7 = null;
                                                                        }
                                                                        zzgsVarZzk3.zzd("Evaluating filter. audience, filter, property", numValueOf17, numValueOf7, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                                        zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                    } else {
                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                    }
                                                                    if (zzfnVar.zza()) {
                                                                    }
                                                                    zzgs zzgsVarZze3 = zzicVar.zzaW().zze();
                                                                    Object objZzl3 = zzgu.zzl(this.zza);
                                                                    if (zzfnVar.zza()) {
                                                                        numValueOf6 = Integer.valueOf(zzfnVar.zzb());
                                                                    } else {
                                                                        numValueOf6 = null;
                                                                    }
                                                                    zzgsVarZze3.zzc("Invalid property filter ID. appId, id", objZzl3, String.valueOf(numValueOf6));
                                                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                    str8 = str8;
                                                                } else {
                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                    str8 = str8;
                                                                }
                                                                if (!zZzd2) {
                                                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                                                }
                                                                mapEmptyMap2 = mapEmptyMap2;
                                                                str8 = str8;
                                                                zzc(Integer.valueOf(iIntValue3)).zza(zzacVar);
                                                                mapEmptyMap2 = mapEmptyMap2;
                                                                str8 = str8;
                                                            }
                                                        }
                                                        it8 = it9;
                                                        str7 = str15;
                                                    }
                                                }
                                                arrayList3 = new ArrayList();
                                                Set setKeySet2 = this.zzc.keySet();
                                                setKeySet2.removeAll(this.zzb);
                                                it7 = setKeySet2.iterator();
                                                while (it7.hasNext()) {
                                                    int iIntValue7 = ((Integer) it7.next()).intValue();
                                                    Map map8 = this.zzc;
                                                    Integer numValueOf18 = Integer.valueOf(iIntValue7);
                                                    zzy zzyVar2 = (zzy) map8.get(numValueOf18);
                                                    Preconditions.checkNotNull(zzyVar2);
                                                    com.google.android.gms.internal.measurement.zzhg zzhgVarZzb2 = zzyVar2.zzb(iIntValue7);
                                                    arrayList3.add(zzhgVarZzb2);
                                                    zzawVarZzj2 = this.zzg.zzj();
                                                    str14 = this.zza;
                                                    com.google.android.gms.internal.measurement.zzii zziiVarZzc2 = zzhgVarZzb2.zzc();
                                                    zzawVarZzj2.zzay();
                                                    zzawVarZzj2.zzg();
                                                    Preconditions.checkNotEmpty(str14);
                                                    Preconditions.checkNotNull(zziiVarZzc2);
                                                    byte[] bArrZzcd2 = zziiVarZzc2.zzcd();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str14);
                                                    contentValues.put(str13, numValueOf18);
                                                    String str28 = str12;
                                                    contentValues.put(str28, bArrZzcd2);
                                                    if (zzawVarZzj2.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        zzawVarZzj2.zzu.zzaW().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str14));
                                                    }
                                                    str12 = str28;
                                                }
                                                return arrayList3;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            aVar8 = aVar8;
                                            str21 = str2;
                                            str20 = str20;
                                        } catch (SQLiteException e28) {
                                            e = e28;
                                            zzawVarZzj6.zzu.zzaW().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str23), e);
                                            Map mapEmptyMap5 = Collections.emptyMap();
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = mapEmptyMap5;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = aVar8;
                                } else {
                                    Map mapEmptyMap6 = Collections.emptyMap();
                                    cursorQuery.close();
                                    map2 = mapEmptyMap6;
                                    str2 = "audience_id";
                                    str20 = "data";
                                }
                            } catch (SQLiteException e29) {
                                e = e29;
                                str2 = "audience_id";
                            }
                            if (map2.isEmpty()) {
                                str3 = "Failed to merge filter. appId";
                            } else {
                                HashSet hashSet2 = new HashSet(map2.keySet());
                                if (z11) {
                                    String str29 = this.zza;
                                    zzaw zzawVarZzj8 = this.zzg.zzj();
                                    str5 = this.zza;
                                    zzawVarZzj8.zzay();
                                    zzawVarZzj8.zzg();
                                    Preconditions.checkNotEmpty(str5);
                                    aVar2 = new androidx.collection.a();
                                    Zze = zzawVarZzj8.zze();
                                    cursorRawQuery = Zze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str5, str5});
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                            arrayList = (List) aVar2.get(numValueOf2);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                aVar2.put(numValueOf2, arrayList);
                                            }
                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        aVar2 = Collections.emptyMap();
                                    }
                                    cursorRawQuery.close();
                                    Preconditions.checkNotEmpty(str29);
                                    Preconditions.checkNotNull(map2);
                                    aVar3 = new androidx.collection.a();
                                    if (!map2.isEmpty()) {
                                        it2 = map2.keySet().iterator();
                                        while (it2.hasNext()) {
                                            int iIntValue8 = ((Integer) it2.next()).intValue();
                                            numValueOf = Integer.valueOf(iIntValue8);
                                            zziiVar2 = (com.google.android.gms.internal.measurement.zzii) map2.get(numValueOf);
                                            list4 = (List) aVar2.get(numValueOf);
                                            if (list4 != null) {
                                                map4 = aVar2;
                                                it3 = it2;
                                                aVar3.put(numValueOf, zziiVar2);
                                                aVar2 = map4;
                                                it2 = it3;
                                            } else {
                                                map4 = aVar2;
                                                it3 = it2;
                                                aVar3.put(numValueOf, zziiVar2);
                                                aVar2 = map4;
                                                it2 = it3;
                                            }
                                        }
                                    }
                                    map3 = aVar3;
                                } else {
                                    map3 = map2;
                                }
                                it = hashSet2.iterator();
                                while (it.hasNext()) {
                                    iIntValue = ((Integer) it.next()).intValue();
                                    zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(Integer.valueOf(iIntValue));
                                    bitSet = new BitSet();
                                    bitSet2 = new BitSet();
                                    aVar = new androidx.collection.a();
                                    if (zziiVar != null) {
                                        while (r2.hasNext()) {
                                            if (zzhqVar.zza()) {
                                                Integer numValueOf19 = Integer.valueOf(zzhqVar.zzb());
                                                if (zzhqVar.zzc()) {
                                                    lValueOf = Long.valueOf(zzhqVar.zzd());
                                                } else {
                                                    lValueOf = null;
                                                }
                                                aVar.put(numValueOf19, lValueOf);
                                            }
                                        }
                                    }
                                    androidx.collection.a aVar12 = new androidx.collection.a();
                                    if (zziiVar != null) {
                                        while (r2.hasNext()) {
                                            if (!zzikVar.zza()) {
                                            }
                                        }
                                    }
                                    Map map9 = map3;
                                    if (zziiVar != null) {
                                        i12 = 0;
                                        while (i12 < zziiVar.zzb() * 64) {
                                            if (zzpk.zzn(zziiVar.zza(), i12)) {
                                                str4 = str19;
                                                this.zzu.zzaW().zzk().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i12));
                                                bitSet2.set(i12);
                                                if (zzpk.zzn(zziiVar.zzc(), i12)) {
                                                    bitSet.set(i12);
                                                }
                                                i12++;
                                                str19 = str4;
                                            } else {
                                                str4 = str19;
                                            }
                                            aVar.remove(Integer.valueOf(i12));
                                            i12++;
                                            str19 = str4;
                                        }
                                    }
                                    String str210 = str19;
                                    Integer numValueOf110 = Integer.valueOf(iIntValue);
                                    com.google.android.gms.internal.measurement.zzii zziiVar5 = (com.google.android.gms.internal.measurement.zzii) map2.get(numValueOf110);
                                    if (!zZzp2) {
                                    }
                                    this.zzc.put(Integer.valueOf(iIntValue), new zzy(this, this.zza, zziiVar5, bitSet, bitSet2, aVar, aVar12, null));
                                    str19 = str210;
                                    map = map;
                                    map3 = map9;
                                    map2 = map2;
                                }
                                str3 = str19;
                            }
                            str6 = str2;
                            str7 = str20;
                            str8 = "Skipping failed audience ID";
                            if (!list.isEmpty()) {
                                zzzVar = new zzz(this, null);
                                aVar4 = new androidx.collection.a();
                                it4 = list.iterator();
                                while (it4.hasNext()) {
                                    zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                    zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                    if (zzhsVarZza != null) {
                                        zzpgVar = this.zzg;
                                        zzbdVarZzah = zzpgVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.zzd());
                                        zzpgVar.zzj().zzh(zzbdVarZzah);
                                        if (!z10) {
                                            j10 = zzbdVarZzah.zzc;
                                            strZzd = zzhsVarZza.zzd();
                                            mapEmptyMap = (Map) aVar4.get(strZzd);
                                            if (mapEmptyMap == null) {
                                                zzawVarZzj = zzpgVar.zzj();
                                                str10 = this.zza;
                                                zzawVarZzj.zzay();
                                                zzawVarZzj.zzg();
                                                Preconditions.checkNotEmpty(str10);
                                                Preconditions.checkNotEmpty(strZzd);
                                                aVar5 = new androidx.collection.a();
                                                str9 = str6;
                                                str11 = str7;
                                                str7 = str11;
                                                cursorQuery2 = zzawVarZzj.zze().query("event_filters", new String[]{str9, str11}, "app_id=? AND event_name=?", new String[]{str10, strZzd}, null, null, null);
                                                if (cursorQuery2.moveToFirst()) {
                                                    j11 = j10;
                                                    do {
                                                        com.google.android.gms.internal.measurement.zzff zzffVar7 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbd();
                                                        numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                        arrayList2 = (List) aVar5.get(numValueOf4);
                                                        if (arrayList2 == null) {
                                                            arrayList2 = new ArrayList();
                                                            aVar5.put(numValueOf4, arrayList2);
                                                        }
                                                        arrayList2.add(zzffVar7);
                                                    } while (cursorQuery2.moveToNext());
                                                    cursorQuery2.close();
                                                    mapEmptyMap = aVar5;
                                                } else {
                                                    j11 = j10;
                                                    mapEmptyMap = Collections.emptyMap();
                                                    cursorQuery2.close();
                                                }
                                                aVar4.put(strZzd, mapEmptyMap);
                                            } else {
                                                j11 = j10;
                                                str9 = str6;
                                            }
                                            it5 = mapEmptyMap.keySet().iterator();
                                            while (it5.hasNext()) {
                                                iIntValue2 = ((Integer) it5.next()).intValue();
                                                set = this.zzb;
                                                numValueOf3 = Integer.valueOf(iIntValue2);
                                                if (set.contains(numValueOf3)) {
                                                    this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", numValueOf3);
                                                } else {
                                                    it6 = ((List) mapEmptyMap.get(numValueOf3)).iterator();
                                                    zZzd = true;
                                                    while (true) {
                                                        if (!it6.hasNext()) {
                                                            j12 = j11;
                                                            break;
                                                        }
                                                        com.google.android.gms.internal.measurement.zzff zzffVar8 = (com.google.android.gms.internal.measurement.zzff) it6.next();
                                                        zzaaVar = new zzaa(this, this.zza, iIntValue2, zzffVar8);
                                                        j12 = j11;
                                                        zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbdVarZzah, zzd(iIntValue2, zzffVar8.zzb()));
                                                        if (!zZzd) {
                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                            break;
                                                        }
                                                        zzc(Integer.valueOf(iIntValue2)).zza(zzaaVar);
                                                        j11 = j12;
                                                    }
                                                    if (!zZzd) {
                                                        this.zzb.add(Integer.valueOf(iIntValue2));
                                                    }
                                                    j11 = j12;
                                                }
                                            }
                                            zzzVar = zzzVar;
                                            it4 = it4;
                                            str6 = str9;
                                            str17 = str17;
                                        }
                                    }
                                }
                            }
                            str12 = str17;
                            str13 = str6;
                            if (!z10) {
                                return new ArrayList();
                            }
                            if (!list2.isEmpty()) {
                                aVar6 = new androidx.collection.a();
                                it8 = list2.iterator();
                                while (it8.hasNext()) {
                                    com.google.android.gms.internal.measurement.zziu zziuVar3 = (com.google.android.gms.internal.measurement.zziu) it8.next();
                                    strZzc = zziuVar3.zzc();
                                    mapEmptyMap2 = (Map) aVar6.get(strZzc);
                                    if (mapEmptyMap2 == null) {
                                        zzawVarZzj3 = this.zzg.zzj();
                                        str16 = this.zza;
                                        zzawVarZzj3.zzay();
                                        zzawVarZzj3.zzg();
                                        Preconditions.checkNotEmpty(str16);
                                        Preconditions.checkNotEmpty(strZzc);
                                        aVar7 = new androidx.collection.a();
                                        str15 = str7;
                                        it9 = it8;
                                        cursorQuery3 = zzawVarZzj3.zze().query("property_filters", new String[]{str13, str15}, "app_id=? AND property_name=?", new String[]{str16, strZzc}, null, null, null);
                                        if (cursorQuery3.moveToFirst()) {
                                            do {
                                                com.google.android.gms.internal.measurement.zzfn zzfnVar4 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzj(), cursorQuery3.getBlob(1))).zzbd();
                                                numValueOf8 = Integer.valueOf(cursorQuery3.getInt(0));
                                                list5 = (List) aVar7.get(numValueOf8);
                                                if (list5 == null) {
                                                    arrayList4 = new ArrayList();
                                                    aVar7.put(numValueOf8, arrayList4);
                                                } else {
                                                    arrayList4 = list5;
                                                }
                                                arrayList4.add(zzfnVar4);
                                            } while (cursorQuery3.moveToNext());
                                            cursorQuery3.close();
                                            mapEmptyMap2 = aVar7;
                                        } else {
                                            mapEmptyMap2 = Collections.emptyMap();
                                            cursorQuery3.close();
                                        }
                                        aVar6.put(strZzc, mapEmptyMap2);
                                    } else {
                                        it9 = it8;
                                        str15 = str7;
                                    }
                                    it10 = mapEmptyMap2.keySet().iterator();
                                    while (it10.hasNext()) {
                                        iIntValue3 = ((Integer) it10.next()).intValue();
                                        set2 = this.zzb;
                                        numValueOf5 = Integer.valueOf(iIntValue3);
                                        if (set2.contains(numValueOf5)) {
                                            this.zzu.zzaW().zzk().zzb(str8, numValueOf5);
                                            break;
                                            break;
                                        }
                                        it11 = ((List) mapEmptyMap2.get(numValueOf5)).iterator();
                                        zZzd2 = true;
                                        while (true) {
                                            if (it11.hasNext()) {
                                                zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it11.next();
                                                zzicVar = this.zzu;
                                                if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                                    zzgs zzgsVarZzk4 = zzicVar.zzaW().zzk();
                                                    Integer numValueOf111 = Integer.valueOf(iIntValue3);
                                                    if (zzfnVar.zza()) {
                                                        numValueOf7 = Integer.valueOf(zzfnVar.zzb());
                                                    } else {
                                                        numValueOf7 = null;
                                                    }
                                                    zzgsVarZzk4.zzd("Evaluating filter. audience, filter, property", numValueOf111, numValueOf7, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                    zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                } else {
                                                    mapEmptyMap2 = mapEmptyMap2;
                                                }
                                                if (zzfnVar.zza()) {
                                                }
                                                zzgs zzgsVarZze4 = zzicVar.zzaW().zze();
                                                Object objZzl4 = zzgu.zzl(this.zza);
                                                if (zzfnVar.zza()) {
                                                    numValueOf6 = Integer.valueOf(zzfnVar.zzb());
                                                } else {
                                                    numValueOf6 = null;
                                                }
                                                zzgsVarZze4.zzc("Invalid property filter ID. appId, id", objZzl4, String.valueOf(numValueOf6));
                                                this.zzb.add(Integer.valueOf(iIntValue3));
                                                mapEmptyMap2 = mapEmptyMap2;
                                                str8 = str8;
                                            } else {
                                                mapEmptyMap2 = mapEmptyMap2;
                                                str8 = str8;
                                            }
                                            if (!zZzd2) {
                                                this.zzb.add(Integer.valueOf(iIntValue3));
                                            }
                                            mapEmptyMap2 = mapEmptyMap2;
                                            str8 = str8;
                                            zzc(Integer.valueOf(iIntValue3)).zza(zzacVar);
                                            mapEmptyMap2 = mapEmptyMap2;
                                            str8 = str8;
                                        }
                                    }
                                    it8 = it9;
                                    str7 = str15;
                                }
                            }
                            arrayList3 = new ArrayList();
                            Set setKeySet3 = this.zzc.keySet();
                            setKeySet3.removeAll(this.zzb);
                            it7 = setKeySet3.iterator();
                            while (it7.hasNext()) {
                                int iIntValue9 = ((Integer) it7.next()).intValue();
                                Map map10 = this.zzc;
                                Integer numValueOf112 = Integer.valueOf(iIntValue9);
                                zzy zzyVar3 = (zzy) map10.get(numValueOf112);
                                Preconditions.checkNotNull(zzyVar3);
                                com.google.android.gms.internal.measurement.zzhg zzhgVarZzb3 = zzyVar3.zzb(iIntValue9);
                                arrayList3.add(zzhgVarZzb3);
                                zzawVarZzj2 = this.zzg.zzj();
                                str14 = this.zza;
                                com.google.android.gms.internal.measurement.zzii zziiVarZzc3 = zzhgVarZzb3.zzc();
                                zzawVarZzj2.zzay();
                                zzawVarZzj2.zzg();
                                Preconditions.checkNotEmpty(str14);
                                Preconditions.checkNotNull(zziiVarZzc3);
                                byte[] bArrZzcd3 = zziiVarZzc3.zzcd();
                                contentValues = new ContentValues();
                                contentValues.put("app_id", str14);
                                contentValues.put(str13, numValueOf112);
                                String str211 = str12;
                                contentValues.put(str211, bArrZzcd3);
                                if (zzawVarZzj2.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                    zzawVarZzj2.zzu.zzaW().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str14));
                                }
                                str12 = str211;
                            }
                            return arrayList3;
                        } catch (Throwable th7) {
                            th = th7;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (r10 != 0) {
                        r10.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e30) {
                e = e30;
                cursorQuery4 = null;
            } catch (Throwable th9) {
                th = th9;
                r10 = 0;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } else {
            map = mapEmptyMap3;
        }
        zzaw zzawVarZzj9 = this.zzg.zzj();
        String str212 = this.zza;
        zzawVarZzj9.zzay();
        zzawVarZzj9.zzg();
        Preconditions.checkNotEmpty(str212);
        try {
            cursorQuery = zzawVarZzj9.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str212}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map mapEmptyMap7 = Collections.emptyMap();
                cursorQuery.close();
                map2 = mapEmptyMap7;
                str2 = "audience_id";
                str20 = "data";
            } else {
                aVar8 = new androidx.collection.a();
                while (true) {
                    i13 = cursorQuery.getInt(0);
                    aVar8.put(Integer.valueOf(i13), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzj(), cursorQuery.getBlob(1))).zzbd());
                    str2 = str21;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    aVar8 = aVar8;
                    str21 = str2;
                    str20 = str20;
                }
                cursorQuery.close();
                map2 = aVar8;
            }
        } catch (SQLiteException e31) {
            e = e31;
            str2 = "audience_id";
            str20 = "data";
            cursorQuery = null;
        } catch (Throwable th10) {
            th = th10;
            cursor = null;
        }
        if (map2.isEmpty()) {
            str3 = "Failed to merge filter. appId";
        } else {
            HashSet hashSet3 = new HashSet(map2.keySet());
            if (z11) {
                String str213 = this.zza;
                zzaw zzawVarZzj10 = this.zzg.zzj();
                str5 = this.zza;
                zzawVarZzj10.zzay();
                zzawVarZzj10.zzg();
                Preconditions.checkNotEmpty(str5);
                aVar2 = new androidx.collection.a();
                Zze = zzawVarZzj10.zze();
                cursorRawQuery = Zze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str5, str5});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) aVar2.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            aVar2.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    aVar2 = Collections.emptyMap();
                }
                cursorRawQuery.close();
                Preconditions.checkNotEmpty(str213);
                Preconditions.checkNotNull(map2);
                aVar3 = new androidx.collection.a();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        int iIntValue10 = ((Integer) it2.next()).intValue();
                        numValueOf = Integer.valueOf(iIntValue10);
                        zziiVar2 = (com.google.android.gms.internal.measurement.zzii) map2.get(numValueOf);
                        list4 = (List) aVar2.get(numValueOf);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = aVar2;
                            it3 = it2;
                            aVar3.put(numValueOf, zziiVar2);
                        } else {
                            zzpg zzpgVar2 = this.zzg;
                            map4 = aVar2;
                            List listZzq = zzpgVar2.zzp().zzq(zziiVar2.zzc(), list4);
                            if (listZzq.isEmpty()) {
                                aVar2 = map4;
                            } else {
                                com.google.android.gms.internal.measurement.zzih zzihVar = (com.google.android.gms.internal.measurement.zzih) zziiVar2.zzco();
                                zzihVar.zzd();
                                zzihVar.zzc(listZzq);
                                List listZzq2 = zzpgVar2.zzp().zzq(zziiVar2.zza(), list4);
                                zzihVar.zzb();
                                zzihVar.zza(listZzq2);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it13 = zziiVar2.zze().iterator();
                                while (it13.hasNext()) {
                                    Iterator it14 = it2;
                                    com.google.android.gms.internal.measurement.zzhq zzhqVar2 = (com.google.android.gms.internal.measurement.zzhq) it13.next();
                                    Iterator it15 = it13;
                                    if (!list4.contains(Integer.valueOf(zzhqVar2.zzb()))) {
                                        arrayList6.add(zzhqVar2);
                                    }
                                    it2 = it14;
                                    it13 = it15;
                                }
                                it3 = it2;
                                zzihVar.zzf();
                                zzihVar.zze(arrayList6);
                                ArrayList arrayList7 = new ArrayList();
                                for (com.google.android.gms.internal.measurement.zzik zzikVar2 : zziiVar2.zzh()) {
                                    if (!list4.contains(Integer.valueOf(zzikVar2.zzb()))) {
                                        arrayList7.add(zzikVar2);
                                    }
                                }
                                zzihVar.zzh();
                                zzihVar.zzg(arrayList7);
                                aVar3.put(Integer.valueOf(iIntValue10), (com.google.android.gms.internal.measurement.zzii) zzihVar.zzbd());
                            }
                        }
                        aVar2 = map4;
                        it2 = it3;
                    }
                }
                map3 = aVar3;
            } else {
                map3 = map2;
            }
            it = hashSet3.iterator();
            while (it.hasNext()) {
                iIntValue = ((Integer) it.next()).intValue();
                zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(Integer.valueOf(iIntValue));
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                aVar = new androidx.collection.a();
                if (zziiVar != null && zziiVar.zzf() != 0) {
                    while (r2.hasNext()) {
                        if (zzhqVar.zza()) {
                            Integer numValueOf113 = Integer.valueOf(zzhqVar.zzb());
                            if (zzhqVar.zzc()) {
                                lValueOf = Long.valueOf(zzhqVar.zzd());
                            } else {
                                lValueOf = null;
                            }
                            aVar.put(numValueOf113, lValueOf);
                        }
                    }
                }
                androidx.collection.a aVar13 = new androidx.collection.a();
                if (zziiVar != null && zziiVar.zzi() != 0) {
                    while (r2.hasNext()) {
                        if (!zzikVar.zza() && zzikVar.zzd() > 0) {
                            aVar13.put(Integer.valueOf(zzikVar.zzb()), Long.valueOf(zzikVar.zze(zzikVar.zzd() - 1)));
                            map3 = map3;
                        }
                    }
                }
                Map map11 = map3;
                if (zziiVar != null) {
                    i12 = 0;
                    while (i12 < zziiVar.zzb() * 64) {
                        if (zzpk.zzn(zziiVar.zza(), i12)) {
                            str4 = str19;
                            this.zzu.zzaW().zzk().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i12));
                            bitSet2.set(i12);
                            if (zzpk.zzn(zziiVar.zzc(), i12)) {
                                bitSet.set(i12);
                            }
                            i12++;
                            str19 = str4;
                        } else {
                            str4 = str19;
                        }
                        aVar.remove(Integer.valueOf(i12));
                        i12++;
                        str19 = str4;
                    }
                }
                String str214 = str19;
                Integer numValueOf114 = Integer.valueOf(iIntValue);
                com.google.android.gms.internal.measurement.zzii zziiVar6 = (com.google.android.gms.internal.measurement.zzii) map2.get(numValueOf114);
                if (!zZzp2 && zZzp && (list3 = (List) map.get(numValueOf114)) != null && this.zze != null && this.zzd != null) {
                    for (com.google.android.gms.internal.measurement.zzff zzffVar9 : list3) {
                        int iZzb = zzffVar9.zzb();
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzffVar9.zzk()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf20 = Integer.valueOf(iZzb);
                        if (aVar.containsKey(numValueOf20)) {
                            aVar.put(numValueOf20, Long.valueOf(jLongValue));
                        }
                        if (aVar13.containsKey(numValueOf20)) {
                            aVar13.put(numValueOf20, Long.valueOf(jLongValue));
                        }
                    }
                }
                this.zzc.put(Integer.valueOf(iIntValue), new zzy(this, this.zza, zziiVar6, bitSet, bitSet2, aVar, aVar13, null));
                str19 = str214;
                map = map;
                map3 = map11;
                map2 = map2;
            }
            str3 = str19;
        }
        str6 = str2;
        str7 = str20;
        str8 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            zzzVar = new zzz(this, null);
            aVar4 = new androidx.collection.a();
            it4 = list.iterator();
            while (it4.hasNext()) {
                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                if (zzhsVarZza != null) {
                    zzpgVar = this.zzg;
                    zzbdVarZzah = zzpgVar.zzj().zzah(this.zza, zzhsVar, zzhsVarZza.zzd());
                    zzpgVar.zzj().zzh(zzbdVarZzah);
                    if (!z10) {
                        j10 = zzbdVarZzah.zzc;
                        strZzd = zzhsVarZza.zzd();
                        mapEmptyMap = (Map) aVar4.get(strZzd);
                        if (mapEmptyMap == null) {
                            zzawVarZzj = zzpgVar.zzj();
                            str10 = this.zza;
                            zzawVarZzj.zzay();
                            zzawVarZzj.zzg();
                            Preconditions.checkNotEmpty(str10);
                            Preconditions.checkNotEmpty(strZzd);
                            aVar5 = new androidx.collection.a();
                            str9 = str6;
                            str11 = str7;
                            str7 = str11;
                            cursorQuery2 = zzawVarZzj.zze().query("event_filters", new String[]{str9, str11}, "app_id=? AND event_name=?", new String[]{str10, strZzd}, null, null, null);
                            if (cursorQuery2.moveToFirst()) {
                                j11 = j10;
                                do {
                                    com.google.android.gms.internal.measurement.zzff zzffVar10 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbd();
                                    numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                    arrayList2 = (List) aVar5.get(numValueOf4);
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                        aVar5.put(numValueOf4, arrayList2);
                                    }
                                    arrayList2.add(zzffVar10);
                                } while (cursorQuery2.moveToNext());
                                cursorQuery2.close();
                                mapEmptyMap = aVar5;
                            } else {
                                j11 = j10;
                                mapEmptyMap = Collections.emptyMap();
                                cursorQuery2.close();
                            }
                            aVar4.put(strZzd, mapEmptyMap);
                        } else {
                            j11 = j10;
                            str9 = str6;
                        }
                        it5 = mapEmptyMap.keySet().iterator();
                        while (it5.hasNext()) {
                            iIntValue2 = ((Integer) it5.next()).intValue();
                            set = this.zzb;
                            numValueOf3 = Integer.valueOf(iIntValue2);
                            if (set.contains(numValueOf3)) {
                                this.zzu.zzaW().zzk().zzb("Skipping failed audience ID", numValueOf3);
                            } else {
                                it6 = ((List) mapEmptyMap.get(numValueOf3)).iterator();
                                zZzd = true;
                                while (true) {
                                    if (!it6.hasNext()) {
                                        j12 = j11;
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.zzff zzffVar11 = (com.google.android.gms.internal.measurement.zzff) it6.next();
                                    zzaaVar = new zzaa(this, this.zza, iIntValue2, zzffVar11);
                                    j12 = j11;
                                    zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j12, zzbdVarZzah, zzd(iIntValue2, zzffVar11.zzb()));
                                    if (!zZzd) {
                                        this.zzb.add(Integer.valueOf(iIntValue2));
                                        break;
                                    }
                                    zzc(Integer.valueOf(iIntValue2)).zza(zzaaVar);
                                    j11 = j12;
                                }
                                if (!zZzd) {
                                    this.zzb.add(Integer.valueOf(iIntValue2));
                                }
                                j11 = j12;
                            }
                        }
                        zzzVar = zzzVar;
                        it4 = it4;
                        str6 = str9;
                        str17 = str17;
                    }
                }
            }
        }
        str12 = str17;
        str13 = str6;
        if (!z10) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            aVar6 = new androidx.collection.a();
            it8 = list2.iterator();
            while (it8.hasNext()) {
                com.google.android.gms.internal.measurement.zziu zziuVar4 = (com.google.android.gms.internal.measurement.zziu) it8.next();
                strZzc = zziuVar4.zzc();
                mapEmptyMap2 = (Map) aVar6.get(strZzc);
                if (mapEmptyMap2 == null) {
                    zzawVarZzj3 = this.zzg.zzj();
                    str16 = this.zza;
                    zzawVarZzj3.zzay();
                    zzawVarZzj3.zzg();
                    Preconditions.checkNotEmpty(str16);
                    Preconditions.checkNotEmpty(strZzc);
                    aVar7 = new androidx.collection.a();
                    str15 = str7;
                    it9 = it8;
                    cursorQuery3 = zzawVarZzj3.zze().query("property_filters", new String[]{str13, str15}, "app_id=? AND property_name=?", new String[]{str16, strZzc}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        do {
                            com.google.android.gms.internal.measurement.zzfn zzfnVar5 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzj(), cursorQuery3.getBlob(1))).zzbd();
                            numValueOf8 = Integer.valueOf(cursorQuery3.getInt(0));
                            list5 = (List) aVar7.get(numValueOf8);
                            if (list5 == null) {
                                arrayList4 = new ArrayList();
                                aVar7.put(numValueOf8, arrayList4);
                            } else {
                                arrayList4 = list5;
                            }
                            arrayList4.add(zzfnVar5);
                        } while (cursorQuery3.moveToNext());
                        cursorQuery3.close();
                        mapEmptyMap2 = aVar7;
                    } else {
                        mapEmptyMap2 = Collections.emptyMap();
                        cursorQuery3.close();
                    }
                    aVar6.put(strZzc, mapEmptyMap2);
                } else {
                    it9 = it8;
                    str15 = str7;
                }
                it10 = mapEmptyMap2.keySet().iterator();
                while (it10.hasNext()) {
                    iIntValue3 = ((Integer) it10.next()).intValue();
                    set2 = this.zzb;
                    numValueOf5 = Integer.valueOf(iIntValue3);
                    if (set2.contains(numValueOf5)) {
                        this.zzu.zzaW().zzk().zzb(str8, numValueOf5);
                        break;
                        break;
                    }
                    it11 = ((List) mapEmptyMap2.get(numValueOf5)).iterator();
                    zZzd2 = true;
                    while (true) {
                        if (it11.hasNext()) {
                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it11.next();
                            zzicVar = this.zzu;
                            if (Log.isLoggable(zzicVar.zzaW().zzn(), 2)) {
                                zzgs zzgsVarZzk5 = zzicVar.zzaW().zzk();
                                Integer numValueOf115 = Integer.valueOf(iIntValue3);
                                if (zzfnVar.zza()) {
                                    numValueOf7 = Integer.valueOf(zzfnVar.zzb());
                                } else {
                                    numValueOf7 = null;
                                }
                                zzgsVarZzk5.zzd("Evaluating filter. audience, filter, property", numValueOf115, numValueOf7, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                zzicVar.zzaW().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                            } else {
                                mapEmptyMap2 = mapEmptyMap2;
                            }
                            if (zzfnVar.zza() || zzfnVar.zzb() > 256) {
                                zzgs zzgsVarZze5 = zzicVar.zzaW().zze();
                                Object objZzl5 = zzgu.zzl(this.zza);
                                if (zzfnVar.zza()) {
                                    numValueOf6 = Integer.valueOf(zzfnVar.zzb());
                                } else {
                                    numValueOf6 = null;
                                }
                                zzgsVarZze5.zzc("Invalid property filter ID. appId, id", objZzl5, String.valueOf(numValueOf6));
                                this.zzb.add(Integer.valueOf(iIntValue3));
                                mapEmptyMap2 = mapEmptyMap2;
                                str8 = str8;
                            } else {
                                zzacVar = new zzac(this, this.zza, iIntValue3, zzfnVar);
                                zZzd2 = zzacVar.zzd(this.zzd, this.zze, zziuVar4, zzd(iIntValue3, zzfnVar.zzb()));
                                if (zZzd2) {
                                    zzc(Integer.valueOf(iIntValue3)).zza(zzacVar);
                                    mapEmptyMap2 = mapEmptyMap2;
                                    str8 = str8;
                                } else {
                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                }
                            }
                        } else {
                            mapEmptyMap2 = mapEmptyMap2;
                            str8 = str8;
                        }
                        if (!zZzd2) {
                            this.zzb.add(Integer.valueOf(iIntValue3));
                        }
                        mapEmptyMap2 = mapEmptyMap2;
                        str8 = str8;
                    }
                }
                it8 = it9;
                str7 = str15;
            }
        }
        arrayList3 = new ArrayList();
        Set setKeySet4 = this.zzc.keySet();
        setKeySet4.removeAll(this.zzb);
        it7 = setKeySet4.iterator();
        while (it7.hasNext()) {
            int iIntValue11 = ((Integer) it7.next()).intValue();
            Map map12 = this.zzc;
            Integer numValueOf116 = Integer.valueOf(iIntValue11);
            zzy zzyVar4 = (zzy) map12.get(numValueOf116);
            Preconditions.checkNotNull(zzyVar4);
            com.google.android.gms.internal.measurement.zzhg zzhgVarZzb4 = zzyVar4.zzb(iIntValue11);
            arrayList3.add(zzhgVarZzb4);
            zzawVarZzj2 = this.zzg.zzj();
            str14 = this.zza;
            com.google.android.gms.internal.measurement.zzii zziiVarZzc4 = zzhgVarZzb4.zzc();
            zzawVarZzj2.zzay();
            zzawVarZzj2.zzg();
            Preconditions.checkNotEmpty(str14);
            Preconditions.checkNotNull(zziiVarZzc4);
            byte[] bArrZzcd4 = zziiVarZzc4.zzcd();
            contentValues = new ContentValues();
            contentValues.put("app_id", str14);
            contentValues.put(str13, numValueOf116);
            String str215 = str12;
            contentValues.put(str215, bArrZzcd4);
            if (zzawVarZzj2.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                zzawVarZzj2.zzu.zzaW().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str14));
            }
            str12 = str215;
        }
        return arrayList3;
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    protected final boolean zzbc() {
        return false;
    }
}
