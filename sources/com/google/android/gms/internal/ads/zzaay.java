package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaay extends zzabe implements zznb {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgyg zzc = zzgyg.zzc(zzaah.zza);
    public final Context zza;
    private final Object zzd;
    private zzaam zze;
    private Thread zzf;
    private zzacm zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzzt zzj;

    public zzaay(Context context) {
        zzzt zzztVar = new zzzt();
        zzaam zzaamVar = zzaam.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzztVar;
        if (zzaamVar instanceof zzaam) {
            this.zze = zzaamVar;
        } else {
            zzaal zzaalVar = new zzaal(zzaamVar, bArr);
            zzaalVar.zzx((zzbl) zzaamVar);
            this.zze = new zzaam(zzaalVar, bArr);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzeg.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    private static Pair zzA(zzaaz[] zzaazVarArr, int i10) {
        for (int i11 = 0; i11 < 2; i11++) {
            zzaaz zzaazVar = zzaazVarArr[i11];
            if (zzaazVar != null && zzaazVar.zza.zzc == i10) {
                return Pair.create(zzaazVar, Integer.valueOf(i11));
            }
        }
        return null;
    }

    private static final Pair zzB(int i10, zzabd zzabdVar, int[][][] iArr, zzaap zzaapVar, Comparator comparator) {
        RandomAccess randomAccessZzj;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 2; i11++) {
            if (i10 == zzabdVar.zza(i11)) {
                zzzn zzznVarZzb = zzabdVar.zzb(i11);
                for (int i12 = 0; i12 < zzznVarZzb.zzb; i12++) {
                    zzbg zzbgVarZza = zzznVarZzb.zza(i12);
                    List listZza = zzaapVar.zza(i11, zzbgVarZza, iArr[i11][i12]);
                    int i13 = zzbgVarZza.zza;
                    boolean[] zArr = new boolean[i13];
                    int i14 = 0;
                    while (i14 < i13) {
                        int i15 = i14 + 1;
                        zzaaq zzaaqVar = (zzaaq) listZza.get(i14);
                        int iZza = zzaaqVar.zza();
                        if (!zArr[i14] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessZzj = zzgwm.zzj(zzaaqVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzaaqVar);
                                for (int i16 = i15; i16 < i13; i16++) {
                                    zzaaq zzaaqVar2 = (zzaaq) listZza.get(i16);
                                    if (zzaaqVar2.zza() == 2 && zzaaqVar.zzc(zzaaqVar2)) {
                                        arrayList2.add(zzaaqVar2);
                                        z10 = true;
                                        zArr[i16] = true;
                                    } else {
                                        z10 = true;
                                    }
                                }
                                randomAccessZzj = arrayList2;
                            }
                            arrayList.add(randomAccessZzj);
                        }
                        i14 = i15;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((zzaaq) list.get(i17)).zzc;
        }
        zzaaq zzaaqVar3 = (zzaaq) list.get(0);
        return Pair.create(new zzaaz(zzaaqVar3.zzb, iArr2, 0), Integer.valueOf(zzaaqVar3.zza));
    }

    protected static String zzi(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int zzj(zzv zzvVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String strZzi = zzi(str);
        String strZzi2 = zzi(zzvVar.zzd);
        if (strZzi2 == null || strZzi == null) {
            return (z10 && strZzi2 == null) ? 1 : 0;
        }
        if (strZzi2.startsWith(strZzi) || strZzi.startsWith(strZzi2)) {
            return 3;
        }
        String str2 = zzfl.zza;
        return strZzi2.split("-", 2)[0].equals(strZzi.split("-", 2)[0]) ? 2 : 0;
    }

    static /* synthetic */ int zzm(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    static /* synthetic */ int zzn(zzv zzvVar, zzgwm zzgwmVar) {
        for (int i10 = 0; i10 < zzgwmVar.size(); i10++) {
            int i11 = 0;
            while (true) {
                List list = zzvVar.zzc;
                if (i11 < list.size()) {
                    if (((zzx) list.get(i11)).zzb.equals(zzgwmVar.get(i10))) {
                        return i10;
                    }
                    i11++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    protected static final zzaaz zzp(int i10, zzzn zzznVar, int[][] iArr, zzaam zzaamVar) throws zzjk {
        int i11 = zzaamVar.zzw.zzb;
        int i12 = 0;
        zzbg zzbgVar = null;
        zzaak zzaakVar = null;
        for (int i13 = 0; i13 < zzznVar.zzb; i13++) {
            zzbg zzbgVarZza = zzznVar.zza(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < zzbgVarZza.zza; i14++) {
                if (zznc.zzac(iArr2[i14], zzaamVar.zzV)) {
                    zzaak zzaakVar2 = new zzaak(zzbgVarZza.zza(i14), iArr2[i14]);
                    if (zzaakVar == null || zzaakVar2.compareTo(zzaakVar) > 0) {
                        zzbgVar = zzbgVarZza;
                        i12 = i14;
                        zzaakVar = zzaakVar2;
                    }
                }
            }
        }
        if (zzbgVar == null) {
            return null;
        }
        return new zzaaz(zzbgVar, new int[]{i12}, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzk() {
        boolean z10;
        zzacm zzacmVar;
        synchronized (this.zzd) {
            z10 = false;
            if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzacmVar = this.zzg) != null && zzacmVar.zzb()) {
                z10 = true;
            }
        }
        if (z10) {
            zzt();
        }
    }

    private static void zzw(zzabd zzabdVar, zzbl zzblVar, zzaaz[] zzaazVarArr) {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < 2; i10++) {
            zzx(zzabdVar.zzb(i10), zzblVar, map);
        }
        zzx(zzabdVar.zze(), zzblVar, map);
        for (int i11 = 0; i11 < 2; i11++) {
            if (((zzbh) map.get(Integer.valueOf(zzabdVar.zza(i11)))) != null) {
                throw null;
            }
        }
    }

    private static void zzx(zzzn zzznVar, zzbl zzblVar, Map map) {
        for (int i10 = 0; i10 < zzznVar.zzb; i10++) {
            if (((zzbh) zzblVar.zzH.get(zzznVar.zza(i10))) != null) {
                throw null;
            }
        }
    }

    private static void zzy(zzabd zzabdVar, zzaam zzaamVar, zzaaz[] zzaazVarArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzzn zzznVarZzb = zzabdVar.zzb(i10);
            if (zzaamVar.zzb(i10, zzznVarZzb)) {
                if (zzaamVar.zzc(i10, zzznVarZzb) != null) {
                    throw null;
                }
                zzaazVarArr[i10] = null;
            }
        }
    }

    private static void zzz(zzabd zzabdVar, zzaam zzaamVar, zzaaz[] zzaazVarArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            int iZza = zzabdVar.zza(i10);
            if (zzaamVar.zza(i10) || zzaamVar.zzI.contains(Integer.valueOf(iZza))) {
                zzaazVarArr[i10] = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final void zza(zzna zznaVar) {
        synchronized (this.zzd) {
            boolean z10 = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzb() {
        zzacm zzacmVar;
        synchronized (this.zzd) {
            Thread thread = this.zzf;
            if (thread != null) {
                zzgtj.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzacmVar = this.zzg) != null) {
            zzacmVar.zzg();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzaam zzc() {
        zzaam zzaamVar;
        synchronized (this.zzd) {
            zzaamVar = this.zze;
        }
        return zzaamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzk();
    }

    public final void zzf(zzaal zzaalVar) {
        boolean z10;
        zzaam zzaamVar = new zzaam(zzaalVar, null);
        synchronized (this.zzd) {
            z10 = !this.zze.equals(zzaamVar);
            this.zze = zzaamVar;
        }
        if (z10) {
            if (zzaamVar.zzU && this.zza == null) {
                zzeg.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzt();
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x022d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0233  */
    /* JADX WARN: Code duplicated, block: B:133:0x024f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0254  */
    /* JADX WARN: Code duplicated, block: B:137:0x026d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0271  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:161:0x02dc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x0251 -> B:119:0x0227). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.android.gms.internal.ads.zzabe
    protected final android.util.Pair zzh(com.google.android.gms.internal.ads.zzabd r24, int[][][] r25, final int[] r26, com.google.android.gms.internal.ads.zzxk r27, com.google.android.gms.internal.ads.zzbf r28) throws com.google.android.gms.internal.ads.zzjk {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaay.zzh(com.google.android.gms.internal.ads.zzabd, int[][][], int[], com.google.android.gms.internal.ads.zzxk, com.google.android.gms.internal.ads.zzbf):android.util.Pair");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final /* synthetic */ boolean zzl(zzaam zzaamVar, zzv zzvVar) {
        zzacm zzacmVar;
        zzacm zzacmVar2;
        if (!zzaamVar.zzU) {
            return true;
        }
        Boolean bool = this.zzi;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        int i10 = zzvVar.zzH;
        byte b10 = -1;
        if (i10 == -1 || i10 <= 2) {
            return true;
        }
        String str = zzvVar.zzp;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        b10 = 2;
                    }
                    break;
                case 187078296:
                    if (str.equals("audio/ac3")) {
                        b10 = 0;
                    }
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        b10 = 3;
                    }
                    break;
                case 1504578661:
                    if (str.equals("audio/eac3")) {
                        b10 = 1;
                    }
                    break;
            }
            if ((b10 == 0 || b10 == 1 || b10 == 2 || b10 == 3) && (Build.VERSION.SDK_INT < 32 || (zzacmVar2 = this.zzg) == null || !zzacmVar2.zzb())) {
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzacmVar = this.zzg) != null && zzacmVar.zzb() && zzacmVar.zzc() && this.zzg.zzd()) {
            return this.zzg.zze(this.zzh, zzvVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final zznb zzg() {
        return this;
    }
}
