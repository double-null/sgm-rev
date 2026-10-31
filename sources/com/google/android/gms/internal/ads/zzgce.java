package com.google.android.gms.internal.ads;

import java.util.List;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgce implements zzgau {
    private final ud.o0 zza;
    private final zzgsm zzb;
    private final de.a zzc;
    private final de.a zzd;
    private final de.a zze;
    private boolean zzf;
    private zzgas zzg;
    private boolean zzh;
    private final e0.k zzi;
    private final zzdww zzj;

    public zzgce(e0.k adQualityDataStore, zzgbg coroutineScopeProvider, zzdww dataPinger, zzgbd clock) {
        kotlin.jvm.internal.t.f(adQualityDataStore, "adQualityDataStore");
        kotlin.jvm.internal.t.f(coroutineScopeProvider, "coroutineScopeProvider");
        kotlin.jvm.internal.t.f(dataPinger, "dataPinger");
        kotlin.jvm.internal.t.f(clock, "clock");
        this.zzj = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = new zzgsm();
        this.zzc = de.g.b(false, 1, null);
        this.zzd = de.g.b(false, 1, null);
        this.zze = de.g.b(false, 1, null);
        this.zzi = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzA(zc.f fVar) throws Throwable {
        zzgbm zzgbmVar;
        de.a aVar;
        de.a aVar2;
        Throwable th;
        if (fVar instanceof zzgbm) {
            zzgbmVar = (zzgbm) fVar;
            int i10 = zzgbmVar.zzd;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgbmVar.zzd = i10 - Integer.MIN_VALUE;
            } else {
                zzgbmVar = new zzgbm(this, fVar);
            }
        } else {
            zzgbmVar = new zzgbm(this, fVar);
        }
        Object obj = zzgbmVar.zzb;
        Object objF = ad.d.f();
        int i11 = zzgbmVar.zzd;
        try {
            if (i11 == 0) {
                wc.s.b(obj);
                aVar = this.zze;
                zzgbmVar.zza = aVar;
                zzgbmVar.zzd = 1;
                if (aVar.d(null, zzgbmVar) != objF) {
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (de.a) zzgbmVar.zza;
                try {
                    wc.s.b(obj);
                    aVar2.c(null);
                    return wc.g0.f27756a;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.c(null);
                    throw th;
                }
            }
            de.a aVar3 = (de.a) zzgbmVar.zza;
            wc.s.b(obj);
            aVar = aVar3;
            e0.k kVar = this.zzi;
            zzgbn zzgbnVar = new zzgbn(null);
            zzgbmVar.zza = aVar;
            zzgbmVar.zzd = 2;
            Object objA = kVar.a(zzgbnVar, zzgbmVar);
            if (objA != objF) {
                aVar2 = aVar;
                obj = objA;
                aVar2.c(null);
                return wc.g0.f27756a;
            }
            return objF;
        } catch (Throwable th3) {
            aVar2 = aVar;
            th = th3;
            aVar2.c(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzB(long j10, zc.f fVar) throws Throwable {
        zzgbl zzgblVar;
        de.a aVar;
        if (fVar instanceof zzgbl) {
            zzgblVar = (zzgbl) fVar;
            int i10 = zzgblVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgblVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzgblVar = new zzgbl(this, fVar);
            }
        } else {
            zzgblVar = new zzgbl(this, fVar);
        }
        Object obj = zzgblVar.zzc;
        Object objF = ad.d.f();
        int i11 = zzgblVar.zze;
        if (i11 == 0) {
            wc.s.b(obj);
            de.a aVar2 = this.zzc;
            zzgblVar.zzb = aVar2;
            zzgblVar.zza = j10;
            zzgblVar.zze = 1;
            if (aVar2.d(null, zzgblVar) == objF) {
                return objF;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = zzgblVar.zza;
            aVar = (de.a) zzgblVar.zzb;
            wc.s.b(obj);
        }
        try {
            zzgas zzgasVar = this.zzg;
            if (zzgasVar == null) {
                kotlin.jvm.internal.t.u("adQualityDataBuilder");
                zzgasVar = null;
            }
            zzgas zzgasVar2 = this.zzg;
            if (zzgasVar2 == null) {
                kotlin.jvm.internal.t.u("adQualityDataBuilder");
                zzgasVar2 = null;
            }
            long jZzi = j10 - zzgasVar2.zzi();
            zzgas zzgasVar3 = this.zzg;
            if (zzgasVar3 == null) {
                kotlin.jvm.internal.t.u("adQualityDataBuilder");
                zzgasVar3 = null;
            }
            zzgasVar.zzb(jZzi - zzgasVar3.zzg());
            return wc.g0.f27756a;
        } finally {
            aVar.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzC(zc.f fVar) throws Throwable {
        zzgbq zzgbqVar;
        de.a aVar;
        de.a aVar2;
        zzgat zzgatVar;
        de.a aVar3;
        if (fVar instanceof zzgbq) {
            zzgbqVar = (zzgbq) fVar;
            int i10 = zzgbqVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgbqVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzgbqVar = new zzgbq(this, fVar);
            }
        } else {
            zzgbqVar = new zzgbq(this, fVar);
        }
        Object objA = zzgbqVar.zzc;
        Object objF = ad.d.f();
        int i11 = zzgbqVar.zze;
        try {
            if (i11 == 0) {
                wc.s.b(objA);
                aVar = this.zzc;
                zzgbqVar.zza = aVar;
                zzgbqVar.zze = 1;
                if (aVar.d(null, zzgbqVar) != objF) {
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (de.a) zzgbqVar.zza;
                    try {
                        wc.s.b(objA);
                        aVar3.c(null);
                        return wc.g0.f27756a;
                    } catch (Throwable th) {
                        th = th;
                        aVar3.c(null);
                        throw th;
                    }
                }
                aVar2 = (de.a) zzgbqVar.zzb;
                zzgatVar = (zzgat) zzgbqVar.zza;
                wc.s.b(objA);
                try {
                    e0.k kVar = this.zzi;
                    zzgbr zzgbrVar = new zzgbr(zzgatVar, null);
                    zzgbqVar.zza = aVar2;
                    zzgbqVar.zzb = null;
                    zzgbqVar.zze = 3;
                    objA = kVar.a(zzgbrVar, zzgbqVar);
                    if (objA != objF) {
                        aVar3 = aVar2;
                        aVar3.c(null);
                        return wc.g0.f27756a;
                    }
                    return objF;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3 = aVar2;
                    aVar3.c(null);
                    throw th;
                }
            }
            aVar = (de.a) zzgbqVar.zza;
            wc.s.b(objA);
            zzgas zzgasVar = this.zzg;
            if (zzgasVar == null) {
                kotlin.jvm.internal.t.u("adQualityDataBuilder");
                zzgasVar = null;
            }
            zzgat zzgatVar2 = (zzgat) zzgasVar.zzbu();
            aVar.c(null);
            kotlin.jvm.internal.t.c(zzgatVar2);
            aVar2 = this.zze;
            zzgbqVar.zza = zzgatVar2;
            zzgbqVar.zzb = aVar2;
            zzgbqVar.zze = 2;
            if (aVar2.d(null, zzgbqVar) != objF) {
                zzgatVar = zzgatVar2;
                e0.k kVar2 = this.zzi;
                zzgbr zzgbrVar2 = new zzgbr(zzgatVar, null);
                zzgbqVar.zza = aVar2;
                zzgbqVar.zzb = null;
                zzgbqVar.zze = 3;
                objA = kVar2.a(zzgbrVar2, zzgbqVar);
                if (objA != objF) {
                    aVar3 = aVar2;
                    aVar3.c(null);
                    return wc.g0.f27756a;
                }
            }
            return objF;
        } catch (Throwable th3) {
            aVar.c(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    private static final boolean zzD(zzgat zzgatVar) {
        boolean z10;
        List listZzk = zzgatVar.zzk();
        Long l10 = listZzk != null ? (Long) kotlin.collections.b0.Y(listZzk) : null;
        boolean z11 = zzgatVar.zzl() > zzgatVar.zzm() && !zzgatVar.zzd();
        if (l10 != null) {
            if (zzgatVar.zzi() - l10.longValue() > 5000) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return z11 || z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (zzA(r0) == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [de.a] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [de.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzgce] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzs(zc.f r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgce.zzs(zc.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzt(String str, zc.f fVar) throws Throwable {
        zzgbt zzgbtVar;
        String str2;
        de.a aVar;
        long j10;
        if (fVar instanceof zzgbt) {
            zzgbtVar = (zzgbt) fVar;
            int i10 = zzgbtVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgbtVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzgbtVar = new zzgbt(this, fVar);
            }
        } else {
            zzgbtVar = new zzgbt(this, fVar);
        }
        Object obj = zzgbtVar.zzc;
        Object objF = ad.d.f();
        int i11 = zzgbtVar.zze;
        if (i11 == 0) {
            wc.s.b(obj);
            de.a aVar2 = this.zzc;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgbtVar.zzf = str;
            zzgbtVar.zza = aVar2;
            zzgbtVar.zzb = jCurrentTimeMillis;
            zzgbtVar.zze = 1;
            if (aVar2.d(null, zzgbtVar) == objF) {
                return objF;
            }
            str2 = str;
            aVar = aVar2;
            j10 = jCurrentTimeMillis;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = zzgbtVar.zzb;
            aVar = (de.a) zzgbtVar.zza;
            str2 = zzgbtVar.zzf;
            wc.s.b(obj);
        }
        try {
            if (this.zzf) {
                return wc.g0.f27756a;
            }
            this.zzf = true;
            zzidy zzidyVarZzcc = zzgat.zzp().zzcc();
            kotlin.jvm.internal.t.e(zzidyVarZzcc, "toBuilder(...)");
            zzgas zzgasVar = (zzgas) zzidyVarZzcc;
            this.zzg = zzgasVar;
            if (zzgasVar == null) {
                kotlin.jvm.internal.t.u("adQualityDataBuilder");
                zzgasVar = null;
            }
            zzgasVar.zza(str2);
            zzgasVar.zzj(j10);
            return wc.g0.f27756a;
        } finally {
            aVar.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:31:0x0085, B:33:0x0089, B:34:0x008f), top: B:50:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        if (zzC(r0) != r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzu(zc.f r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.internal.ads.zzgbp
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.gms.internal.ads.zzgbp r0 = (com.google.android.gms.internal.ads.zzgbp) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgbp r0 = new com.google.android.gms.internal.ads.zzgbp
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.zzc
            java.lang.Object r1 = ad.b.f()
            int r2 = r0.zze
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L52
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            wc.s.b(r11)
            goto La8
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3c:
            wc.s.b(r11)
            goto La0
        L40:
            long r5 = r0.zzb
            java.lang.Object r2 = r0.zza
            de.a r2 = (de.a) r2
            wc.s.b(r11)
            goto L85
        L4a:
            java.lang.Object r2 = r0.zza
            de.a r2 = (de.a) r2
            wc.s.b(r11)
            goto L61
        L52:
            wc.s.b(r11)
            de.a r2 = r10.zzd
            r0.zza = r2
            r0.zze = r6
            java.lang.Object r11 = r2.d(r7, r0)
            if (r11 == r1) goto Lb5
        L61:
            boolean r11 = r10.zzh     // Catch: java.lang.Throwable -> Lb0
            if (r11 == 0) goto L6b
            wc.g0 r11 = wc.g0.f27756a     // Catch: java.lang.Throwable -> Lb0
            r2.c(r7)
            return r11
        L6b:
            r10.zzh = r6     // Catch: java.lang.Throwable -> Lb0
            wc.g0 r11 = wc.g0.f27756a     // Catch: java.lang.Throwable -> Lb0
            r2.c(r7)
            de.a r2 = r10.zzc
            long r8 = java.lang.System.currentTimeMillis()
            r0.zza = r2
            r0.zzb = r8
            r0.zze = r5
            java.lang.Object r11 = r2.d(r7, r0)
            if (r11 == r1) goto Lb5
            r5 = r8
        L85:
            com.google.android.gms.internal.ads.zzgas r11 = r10.zzg     // Catch: java.lang.Throwable -> Lab
            if (r11 != 0) goto L8f
            java.lang.String r11 = "adQualityDataBuilder"
            kotlin.jvm.internal.t.u(r11)     // Catch: java.lang.Throwable -> Lab
            r11 = r7
        L8f:
            r11.zzo(r5)     // Catch: java.lang.Throwable -> Lab
            r2.c(r7)
            r0.zza = r7
            r0.zze = r4
            java.lang.Object r11 = r10.zzB(r5, r0)
            if (r11 != r1) goto La0
            goto Lb5
        La0:
            r0.zze = r3
            java.lang.Object r11 = r10.zzC(r0)
            if (r11 == r1) goto Lb5
        La8:
            wc.g0 r11 = wc.g0.f27756a
            return r11
        Lab:
            r11 = move-exception
            r2.c(r7)
            throw r11
        Lb0:
            r11 = move-exception
            r2.c(r7)
            throw r11
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgce.zzu(zc.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x007e A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008e A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d9 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010d A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:28:0x0078, B:31:0x007e, B:32:0x0082, B:35:0x008a, B:37:0x008e, B:38:0x0092, B:40:0x00ae, B:41:0x00b2, B:43:0x00bb, B:45:0x00bf, B:46:0x00c3, B:47:0x00cb, B:49:0x00cf, B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:55:0x00e1, B:57:0x00fd, B:58:0x0101, B:59:0x0109, B:61:0x010d, B:62:0x0111), top: B:72:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzv(zc.f fVar) throws Throwable {
        zzgcd zzgcdVar;
        de.a aVar;
        de.a aVar2;
        long j10;
        zzgas zzgasVar;
        zzgas zzgasVar2;
        zzgas zzgasVar3;
        zzgas zzgasVar4;
        zzgas zzgasVar5;
        zzgas zzgasVar6;
        long jLongValue;
        zzgas zzgasVar7;
        zzgas zzgasVar8;
        if (fVar instanceof zzgcd) {
            zzgcdVar = (zzgcd) fVar;
            int i10 = zzgcdVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgcdVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzgcdVar = new zzgcd(this, fVar);
            }
        } else {
            zzgcdVar = new zzgcd(this, fVar);
        }
        Object obj = zzgcdVar.zzc;
        Object objF = ad.d.f();
        int i11 = zzgcdVar.zze;
        try {
            if (i11 == 0) {
                wc.s.b(obj);
                aVar = this.zzd;
                zzgcdVar.zza = aVar;
                zzgcdVar.zze = 1;
                if (aVar.d(null, zzgcdVar) != objF) {
                }
                return objF;
            }
            if (i11 == 1) {
                aVar = (de.a) zzgcdVar.zza;
                wc.s.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = zzgcdVar.zzb;
                aVar2 = (de.a) zzgcdVar.zza;
                wc.s.b(obj);
            }
            try {
                zzgasVar = this.zzg;
                if (zzgasVar == null) {
                    kotlin.jvm.internal.t.u("adQualityDataBuilder");
                    zzgasVar = null;
                }
                if (zzgasVar.zzr() > 0) {
                    zzgasVar6 = this.zzg;
                    if (zzgasVar6 == null) {
                        kotlin.jvm.internal.t.u("adQualityDataBuilder");
                        zzgasVar6 = null;
                    }
                    List listZzq = zzgasVar6.zzq();
                    kotlin.jvm.internal.t.e(listZzq, "getAdClickTimestampsMsList(...)");
                    Object objX = kotlin.collections.b0.X(listZzq);
                    kotlin.jvm.internal.t.e(objX, "last(...)");
                    jLongValue = j10 - ((Number) objX).longValue();
                    zzgasVar7 = this.zzg;
                    if (zzgasVar7 == null) {
                        kotlin.jvm.internal.t.u("adQualityDataBuilder");
                        zzgasVar7 = null;
                    }
                    zzgasVar7.zzt();
                    if (jLongValue < 5000) {
                        zzgasVar8 = this.zzg;
                        if (zzgasVar8 == null) {
                            kotlin.jvm.internal.t.u("adQualityDataBuilder");
                            zzgasVar8 = null;
                        }
                        zzgasVar8.zzd(zzgasVar8.zzc() + 1);
                    }
                }
                zzgasVar2 = this.zzg;
                if (zzgasVar2 == null) {
                    kotlin.jvm.internal.t.u("adQualityDataBuilder");
                    zzgasVar2 = null;
                }
                if (zzgasVar2.zzn() > 0) {
                    zzgasVar4 = this.zzg;
                    if (zzgasVar4 == null) {
                        kotlin.jvm.internal.t.u("adQualityDataBuilder");
                        zzgasVar4 = null;
                    }
                    List listZzm = zzgasVar4.zzm();
                    kotlin.jvm.internal.t.e(listZzm, "getAppBackgroundTimestampsMsList(...)");
                    Object objX2 = kotlin.collections.b0.X(listZzm);
                    kotlin.jvm.internal.t.e(objX2, "last(...)");
                    long jLongValue2 = j10 - ((Number) objX2).longValue();
                    zzgasVar5 = this.zzg;
                    if (zzgasVar5 == null) {
                        kotlin.jvm.internal.t.u("adQualityDataBuilder");
                        zzgasVar5 = null;
                    }
                    zzgasVar5.zzh(zzgasVar5.zzg() + jLongValue2);
                }
                zzgasVar3 = this.zzg;
                if (zzgasVar3 == null) {
                    kotlin.jvm.internal.t.u("adQualityDataBuilder");
                    zzgasVar3 = null;
                }
                zzgasVar3.zzp(j10);
                return wc.g0.f27756a;
            } finally {
                aVar2.c(null);
            }
            if (!this.zzh) {
                wc.g0 g0Var = wc.g0.f27756a;
                aVar.c(null);
                return g0Var;
            }
            this.zzh = false;
            wc.g0 g0Var2 = wc.g0.f27756a;
            aVar.c(null);
            de.a aVar3 = this.zzc;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgcdVar.zza = aVar3;
            zzgcdVar.zzb = jCurrentTimeMillis;
            zzgcdVar.zze = 2;
            if (aVar3.d(null, zzgcdVar) != objF) {
                aVar2 = aVar3;
                j10 = jCurrentTimeMillis;
                zzgasVar = this.zzg;
                if (zzgasVar == null) {
                    kotlin.jvm.internal.t.u("adQualityDataBuilder");
                    zzgasVar = null;
                }
                if (zzgasVar.zzr() > 0) {
                    zzgasVar6 = this.zzg;
                    if (zzgasVar6 == null) {
                        kotlin.jvm.internal.t.u("adQualityDataBuilder");
                        zzgasVar6 = null;
                    }
                    List listZzq2 = zzgasVar6.zzq();
                    kotlin.jvm.internal.t.e(listZzq2, "getAdClickTimestampsMsList(...)");
                    Object objX3 = kotlin.collections.b0.X(listZzq2);
                    kotlin.jvm.internal.t.e(objX3, "last(...)");
                    jLongValue = j10 - ((Number) objX3).longValue();
                    zzgasVar7 = this.zzg;
                    if (zzgasVar7 == null) {
                        kotlin.jvm.internal.t.u("adQualityDataBuilder");
                        zzgasVar7 = null;
                    }
                    zzgasVar7.zzt();
                    if (jLongValue < 5000) {
                        zzgasVar8 = this.zzg;
                        if (zzgasVar8 == null) {
                            kotlin.jvm.internal.t.u("adQualityDataBuilder");
                            zzgasVar8 = null;
                        }
                        zzgasVar8.zzd(zzgasVar8.zzc() + 1);
                    }
                }
                zzgasVar2 = this.zzg;
                if (zzgasVar2 == null) {
                    kotlin.jvm.internal.t.u("adQualityDataBuilder");
                    zzgasVar2 = null;
                }
                if (zzgasVar2.zzn() > 0) {
                    zzgasVar4 = this.zzg;
                    if (zzgasVar4 == null) {
                        kotlin.jvm.internal.t.u("adQualityDataBuilder");
                        zzgasVar4 = null;
                    }
                    List listZzm2 = zzgasVar4.zzm();
                    kotlin.jvm.internal.t.e(listZzm2, "getAppBackgroundTimestampsMsList(...)");
                    Object objX4 = kotlin.collections.b0.X(listZzm2);
                    kotlin.jvm.internal.t.e(objX4, "last(...)");
                    long jLongValue3 = j10 - ((Number) objX4).longValue();
                    zzgasVar5 = this.zzg;
                    if (zzgasVar5 == null) {
                        kotlin.jvm.internal.t.u("adQualityDataBuilder");
                        zzgasVar5 = null;
                    }
                    zzgasVar5.zzh(zzgasVar5.zzg() + jLongValue3);
                }
                zzgasVar3 = this.zzg;
                if (zzgasVar3 == null) {
                    kotlin.jvm.internal.t.u("adQualityDataBuilder");
                    zzgasVar3 = null;
                }
                zzgasVar3.zzp(j10);
                return wc.g0.f27756a;
            }
            return objF;
        } catch (Throwable th) {
            aVar.c(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0091 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:32:0x008b, B:35:0x0091, B:36:0x0095, B:38:0x0099, B:39:0x009d, B:41:0x00a7, B:42:0x00ab, B:44:0x00b7, B:45:0x00bb, B:47:0x00c2, B:48:0x00c6), top: B:67:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f6, code lost:
    
        if (zzz(r14, r0) == r1) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzw(zc.f r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgce.zzw(zc.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[Catch: all -> 0x0106, TRY_ENTER, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0098 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1 A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc A[Catch: all -> 0x0106, TryCatch #0 {all -> 0x0106, blocks: (B:31:0x008a, B:34:0x0090, B:35:0x0094, B:37:0x0098, B:38:0x009c, B:40:0x00a6, B:41:0x00aa, B:43:0x00b6, B:44:0x00ba, B:46:0x00c1, B:47:0x00c5, B:49:0x00cc, B:50:0x00d0), top: B:68:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
    
        if (zzz(r15, r0) == r1) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzx(zc.f r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgce.zzx(zc.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzy(zc.f fVar) throws Throwable {
        zzgbv zzgbvVar;
        de.a aVar;
        long j10;
        if (fVar instanceof zzgbv) {
            zzgbvVar = (zzgbv) fVar;
            int i10 = zzgbvVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgbvVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzgbvVar = new zzgbv(this, fVar);
            }
        } else {
            zzgbvVar = new zzgbv(this, fVar);
        }
        Object obj = zzgbvVar.zzc;
        Object objF = ad.d.f();
        int i11 = zzgbvVar.zze;
        if (i11 == 0) {
            wc.s.b(obj);
            de.a aVar2 = this.zzc;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgbvVar.zzb = aVar2;
            zzgbvVar.zza = jCurrentTimeMillis;
            zzgbvVar.zze = 1;
            if (aVar2.d(null, zzgbvVar) == objF) {
                return objF;
            }
            aVar = aVar2;
            j10 = jCurrentTimeMillis;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = zzgbvVar.zza;
            aVar = (de.a) zzgbvVar.zzb;
            wc.s.b(obj);
        }
        try {
            zzgas zzgasVar = this.zzg;
            if (zzgasVar == null) {
                kotlin.jvm.internal.t.u("adQualityDataBuilder");
                zzgasVar = null;
            }
            zzgasVar.zzs(j10);
            return wc.g0.f27756a;
        } finally {
            aVar.c(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zza() {
        ud.k.d(this.zza, null, null, new zzgby(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzb(String gwsQueryId) {
        kotlin.jvm.internal.t.f(gwsQueryId, "gwsQueryId");
        zzgsp.zza(this.zza, this.zzb, new zzgbs(this, gwsQueryId, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzc() {
        zzgsp.zza(this.zza, this.zzb, new zzgbo(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzd() {
        zzgsp.zza(this.zza, this.zzb, new zzgcc(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zze() {
        zzgsp.zza(this.zza, this.zzb, new zzgbw(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzf() {
        zzgsp.zza(this.zza, this.zzb, new zzgca(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzg() {
        zzgsp.zza(this.zza, this.zzb, new zzgbu(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzz(String str, zc.f fVar) throws Throwable {
        zzgbj zzgbjVar;
        de.a aVar;
        Throwable th;
        de.a aVar2;
        if (fVar instanceof zzgbj) {
            zzgbjVar = (zzgbj) fVar;
            int i10 = zzgbjVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgbjVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzgbjVar = new zzgbj(this, fVar);
            }
        } else {
            zzgbjVar = new zzgbj(this, fVar);
        }
        Object obj = zzgbjVar.zzc;
        Object objF = ad.d.f();
        int i11 = zzgbjVar.zze;
        try {
            if (i11 == 0) {
                wc.s.b(obj);
                aVar = this.zze;
                zzgbjVar.zza = str;
                zzgbjVar.zzb = aVar;
                zzgbjVar.zze = 1;
                if (aVar.d(null, zzgbjVar) != objF) {
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException(oqHAiWkeGzWld.MyF);
                }
                aVar2 = (de.a) zzgbjVar.zza;
                try {
                    wc.s.b(obj);
                    aVar2.c(null);
                    return wc.g0.f27756a;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.c(null);
                    throw th;
                }
            }
            de.a aVar3 = (de.a) zzgbjVar.zzb;
            String str2 = (String) zzgbjVar.zza;
            wc.s.b(obj);
            aVar = aVar3;
            str = str2;
            e0.k kVar = this.zzi;
            zzgbk zzgbkVar = new zzgbk(str, null);
            zzgbjVar.zza = aVar;
            zzgbjVar.zzb = null;
            zzgbjVar.zze = 2;
            Object objA = kVar.a(zzgbkVar, zzgbjVar);
            if (objA != objF) {
                de.a aVar4 = aVar;
                obj = objA;
                aVar2 = aVar4;
                aVar2.c(null);
                return wc.g0.f27756a;
            }
            return objF;
        } catch (Throwable th3) {
            de.a aVar5 = aVar;
            th = th3;
            aVar2 = aVar5;
            aVar2.c(null);
            throw th;
        }
    }
}
