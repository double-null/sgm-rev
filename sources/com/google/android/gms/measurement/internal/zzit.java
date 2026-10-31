package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzair;
import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzit implements Callable {
    final /* synthetic */ zzbh zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjd zzc;

    zzit(zzjd zzjdVar, zzbh zzbhVar, String str) {
        this.zza = zzbhVar;
        this.zzb = str;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x03ef A[Catch: all -> 0x0545, TryCatch #4 {all -> 0x0545, blocks: (B:101:0x03cc, B:102:0x03e9, B:104:0x03ef, B:106:0x0400, B:107:0x040b, B:109:0x0454, B:110:0x0462, B:112:0x046a, B:113:0x046d, B:115:0x0475, B:118:0x047e, B:121:0x0495, B:122:0x0498, B:117:0x047b, B:134:0x0527, B:63:0x01fd, B:65:0x0205, B:67:0x020b), top: B:148:0x01fd, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0454 A[Catch: all -> 0x0545, TryCatch #4 {all -> 0x0545, blocks: (B:101:0x03cc, B:102:0x03e9, B:104:0x03ef, B:106:0x0400, B:107:0x040b, B:109:0x0454, B:110:0x0462, B:112:0x046a, B:113:0x046d, B:115:0x0475, B:118:0x047e, B:121:0x0495, B:122:0x0498, B:117:0x047b, B:134:0x0527, B:63:0x01fd, B:65:0x0205, B:67:0x020b), top: B:148:0x01fd, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x046a A[Catch: all -> 0x0545, TryCatch #4 {all -> 0x0545, blocks: (B:101:0x03cc, B:102:0x03e9, B:104:0x03ef, B:106:0x0400, B:107:0x040b, B:109:0x0454, B:110:0x0462, B:112:0x046a, B:113:0x046d, B:115:0x0475, B:118:0x047e, B:121:0x0495, B:122:0x0498, B:117:0x047b, B:134:0x0527, B:63:0x01fd, B:65:0x0205, B:67:0x020b), top: B:148:0x01fd, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0475 A[Catch: all -> 0x0545, TryCatch #4 {all -> 0x0545, blocks: (B:101:0x03cc, B:102:0x03e9, B:104:0x03ef, B:106:0x0400, B:107:0x040b, B:109:0x0454, B:110:0x0462, B:112:0x046a, B:113:0x046d, B:115:0x0475, B:118:0x047e, B:121:0x0495, B:122:0x0498, B:117:0x047b, B:134:0x0527, B:63:0x01fd, B:65:0x0205, B:67:0x020b), top: B:148:0x01fd, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0479 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x047b A[Catch: all -> 0x0545, TryCatch #4 {all -> 0x0545, blocks: (B:101:0x03cc, B:102:0x03e9, B:104:0x03ef, B:106:0x0400, B:107:0x040b, B:109:0x0454, B:110:0x0462, B:112:0x046a, B:113:0x046d, B:115:0x0475, B:118:0x047e, B:121:0x0495, B:122:0x0498, B:117:0x047b, B:134:0x0527, B:63:0x01fd, B:65:0x0205, B:67:0x020b), top: B:148:0x01fd, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0493 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x03e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x01cc A[Catch: all -> 0x0547, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0547, blocks: (B:8:0x0059, B:10:0x0064, B:13:0x007e, B:15:0x0084, B:16:0x0096, B:18:0x00ad, B:19:0x00b4, B:21:0x00be, B:22:0x00cb, B:24:0x00d5, B:25:0x00e2, B:27:0x00ed, B:28:0x00f5, B:30:0x010d, B:31:0x0110, B:33:0x012a, B:35:0x013a, B:37:0x0142, B:39:0x0148, B:40:0x014b, B:42:0x015a, B:44:0x0160, B:46:0x016a, B:49:0x0171, B:51:0x0183, B:53:0x0189, B:55:0x0193, B:56:0x01a4, B:58:0x01a8, B:60:0x01b3, B:50:0x017a, B:62:0x01cc, B:63:0x01fd, B:65:0x0205, B:67:0x020b, B:68:0x0222, B:70:0x022c, B:71:0x0239, B:72:0x024b, B:74:0x0251, B:81:0x0269, B:84:0x0292, B:85:0x0299, B:87:0x029f, B:88:0x02d3, B:83:0x026d), top: B:152:0x0059, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0205 A[Catch: SecurityException -> 0x0524, all -> 0x0547, TryCatch #2 {SecurityException -> 0x0524, blocks: (B:63:0x01fd, B:65:0x0205, B:67:0x020b), top: B:148:0x01fd, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x022c A[Catch: all -> 0x0547, TryCatch #5 {all -> 0x0547, blocks: (B:8:0x0059, B:10:0x0064, B:13:0x007e, B:15:0x0084, B:16:0x0096, B:18:0x00ad, B:19:0x00b4, B:21:0x00be, B:22:0x00cb, B:24:0x00d5, B:25:0x00e2, B:27:0x00ed, B:28:0x00f5, B:30:0x010d, B:31:0x0110, B:33:0x012a, B:35:0x013a, B:37:0x0142, B:39:0x0148, B:40:0x014b, B:42:0x015a, B:44:0x0160, B:46:0x016a, B:49:0x0171, B:51:0x0183, B:53:0x0189, B:55:0x0193, B:56:0x01a4, B:58:0x01a8, B:60:0x01b3, B:50:0x017a, B:62:0x01cc, B:63:0x01fd, B:65:0x0205, B:67:0x020b, B:68:0x0222, B:70:0x022c, B:71:0x0239, B:72:0x024b, B:74:0x0251, B:81:0x0269, B:84:0x0292, B:85:0x0299, B:87:0x029f, B:88:0x02d3, B:83:0x026d), top: B:152:0x0059, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0251 A[Catch: all -> 0x0547, TryCatch #5 {all -> 0x0547, blocks: (B:8:0x0059, B:10:0x0064, B:13:0x007e, B:15:0x0084, B:16:0x0096, B:18:0x00ad, B:19:0x00b4, B:21:0x00be, B:22:0x00cb, B:24:0x00d5, B:25:0x00e2, B:27:0x00ed, B:28:0x00f5, B:30:0x010d, B:31:0x0110, B:33:0x012a, B:35:0x013a, B:37:0x0142, B:39:0x0148, B:40:0x014b, B:42:0x015a, B:44:0x0160, B:46:0x016a, B:49:0x0171, B:51:0x0183, B:53:0x0189, B:55:0x0193, B:56:0x01a4, B:58:0x01a8, B:60:0x01b3, B:50:0x017a, B:62:0x01cc, B:63:0x01fd, B:65:0x0205, B:67:0x020b, B:68:0x0222, B:70:0x022c, B:71:0x0239, B:72:0x024b, B:74:0x0251, B:81:0x0269, B:84:0x0292, B:85:0x0299, B:87:0x029f, B:88:0x02d3, B:83:0x026d), top: B:152:0x0059, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0269 A[Catch: all -> 0x0547, TryCatch #5 {all -> 0x0547, blocks: (B:8:0x0059, B:10:0x0064, B:13:0x007e, B:15:0x0084, B:16:0x0096, B:18:0x00ad, B:19:0x00b4, B:21:0x00be, B:22:0x00cb, B:24:0x00d5, B:25:0x00e2, B:27:0x00ed, B:28:0x00f5, B:30:0x010d, B:31:0x0110, B:33:0x012a, B:35:0x013a, B:37:0x0142, B:39:0x0148, B:40:0x014b, B:42:0x015a, B:44:0x0160, B:46:0x016a, B:49:0x0171, B:51:0x0183, B:53:0x0189, B:55:0x0193, B:56:0x01a4, B:58:0x01a8, B:60:0x01b3, B:50:0x017a, B:62:0x01cc, B:63:0x01fd, B:65:0x0205, B:67:0x020b, B:68:0x0222, B:70:0x022c, B:71:0x0239, B:72:0x024b, B:74:0x0251, B:81:0x0269, B:84:0x0292, B:85:0x0299, B:87:0x029f, B:88:0x02d3, B:83:0x026d), top: B:152:0x0059, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x026d A[Catch: all -> 0x0547, TryCatch #5 {all -> 0x0547, blocks: (B:8:0x0059, B:10:0x0064, B:13:0x007e, B:15:0x0084, B:16:0x0096, B:18:0x00ad, B:19:0x00b4, B:21:0x00be, B:22:0x00cb, B:24:0x00d5, B:25:0x00e2, B:27:0x00ed, B:28:0x00f5, B:30:0x010d, B:31:0x0110, B:33:0x012a, B:35:0x013a, B:37:0x0142, B:39:0x0148, B:40:0x014b, B:42:0x015a, B:44:0x0160, B:46:0x016a, B:49:0x0171, B:51:0x0183, B:53:0x0189, B:55:0x0193, B:56:0x01a4, B:58:0x01a8, B:60:0x01b3, B:50:0x017a, B:62:0x01cc, B:63:0x01fd, B:65:0x0205, B:67:0x020b, B:68:0x0222, B:70:0x022c, B:71:0x0239, B:72:0x024b, B:74:0x0251, B:81:0x0269, B:84:0x0292, B:85:0x0299, B:87:0x029f, B:88:0x02d3, B:83:0x026d), top: B:152:0x0059, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x029f A[Catch: all -> 0x0547, LOOP:1: B:85:0x0299->B:87:0x029f, LOOP_END, TryCatch #5 {all -> 0x0547, blocks: (B:8:0x0059, B:10:0x0064, B:13:0x007e, B:15:0x0084, B:16:0x0096, B:18:0x00ad, B:19:0x00b4, B:21:0x00be, B:22:0x00cb, B:24:0x00d5, B:25:0x00e2, B:27:0x00ed, B:28:0x00f5, B:30:0x010d, B:31:0x0110, B:33:0x012a, B:35:0x013a, B:37:0x0142, B:39:0x0148, B:40:0x014b, B:42:0x015a, B:44:0x0160, B:46:0x016a, B:49:0x0171, B:51:0x0183, B:53:0x0189, B:55:0x0193, B:56:0x01a4, B:58:0x01a8, B:60:0x01b3, B:50:0x017a, B:62:0x01cc, B:63:0x01fd, B:65:0x0205, B:67:0x020b, B:68:0x0222, B:70:0x022c, B:71:0x0239, B:72:0x024b, B:74:0x0251, B:81:0x0269, B:84:0x0292, B:85:0x0299, B:87:0x029f, B:88:0x02d3, B:83:0x026d), top: B:152:0x0059, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x033a A[Catch: all -> 0x0520, TryCatch #0 {all -> 0x0520, blocks: (B:90:0x030e, B:92:0x033a, B:93:0x034e, B:95:0x035a, B:97:0x03af, B:96:0x0392), top: B:144:0x030e }] */
    /* JADX WARN: Code duplicated, block: B:95:0x035a A[Catch: all -> 0x0520, TryCatch #0 {all -> 0x0520, blocks: (B:90:0x030e, B:92:0x033a, B:93:0x034e, B:95:0x035a, B:97:0x03af, B:96:0x0392), top: B:144:0x030e }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0392 A[Catch: all -> 0x0520, TryCatch #0 {all -> 0x0520, blocks: (B:90:0x030e, B:92:0x033a, B:93:0x034e, B:95:0x035a, B:97:0x03af, B:96:0x0392), top: B:144:0x030e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.measurement.internal.zzbh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.measurement.internal.zzol] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        zzpg zzpgVar;
        String strZzc;
        zzpg zzpgVar2;
        List listZzn;
        Iterator it;
        zzpn zzpnVar;
        com.google.android.gms.internal.measurement.zziu[] zziuVarArr;
        int i10;
        zzic zzicVar;
        Bundle bundle;
        String str;
        zzbd zzbdVarZzf;
        Object obj;
        zzbd zzbdVarZza;
        long j10;
        com.google.android.gms.internal.measurement.zzhr zzhrVarZzp;
        zzbf zzbfVar;
        zzbe zzbeVar;
        long jZzp;
        long jZzn;
        String strZzh;
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn;
        Object objZza;
        zzaw zzawVarZzj;
        zzjd zzjdVar = this.zzc;
        zzjdVar.zzL().zzaa();
        zzlp zzlpVarZzn = zzjdVar.zzL().zzn();
        zzlpVarZzn.zzg();
        zzic zzicVar2 = zzlpVarZzn.zzu;
        zzic.zzL();
        ?? r10 = this.zza;
        Preconditions.checkNotNull(r10);
        String str2 = this.zzb;
        Preconditions.checkNotEmpty(str2);
        String str3 = r10.zza;
        if (!"_iap".equals(str3) && !vgmm.GEPqxXAT.equals(str3)) {
            zzlpVarZzn.zzu.zzaW().zzj().zzc("Generating a payload for this event is not available. package_name, event_name", str2, str3);
            return null;
        }
        zzpg zzpgVar3 = zzlpVarZzn.zzg;
        com.google.android.gms.internal.measurement.zzhz zzhzVarZzi = com.google.android.gms.internal.measurement.zzib.zzi();
        zzpgVar3.zzj().zzb();
        try {
            zzh zzhVarZzu = zzpgVar3.zzj().zzu(str2);
            if (zzhVarZzu != null) {
                if (zzhVarZzu.zzD()) {
                    com.google.android.gms.internal.measurement.zzic zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                    zzicVarZzaE.zza(1);
                    zzicVarZzaE.zzC("android");
                    if (!TextUtils.isEmpty(zzhVarZzu.zzc())) {
                        zzicVarZzaE.zzL(zzhVarZzu.zzc());
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzv())) {
                        zzicVarZzaE.zzJ((String) Preconditions.checkNotNull(zzhVarZzu.zzv()));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzr())) {
                        zzicVarZzaE.zzM((String) Preconditions.checkNotNull(zzhVarZzu.zzr()));
                    }
                    if (zzhVarZzu.zzt() != -2147483648L) {
                        zzicVarZzaE.zzaj((int) zzhVarZzu.zzt());
                    }
                    zzicVarZzaE.zzN(zzhVarZzu.zzx());
                    zzicVarZzaE.zzar(zzhVarZzu.zzB());
                    String strZzf = zzhVarZzu.zzf();
                    if (!TextUtils.isEmpty(strZzf)) {
                        zzicVarZzaE.zzad(strZzf);
                    }
                    zzicVarZzaE.zzay(zzhVarZzu.zzak());
                    zzjl zzjlVarZzB = zzlpVarZzn.zzg.zzB(str2);
                    zzicVarZzaE.zzY(zzhVarZzu.zzz());
                    if (zzicVar2.zzB() && zzlpVarZzn.zzu.zzc().zzC(zzicVarZzaE.zzK()) && zzjlVarZzB.zzo(zzjk.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzicVarZzaE.zzam(null);
                    }
                    zzicVarZzaE.zzat(zzjlVarZzB.zzk());
                    zzjk zzjkVar = zzjk.AD_STORAGE;
                    if (zzjlVarZzB.zzo(zzjkVar) && zzhVarZzu.zzac()) {
                        Pair pairZzd = (zzjlVarZzB.zzo(zzjkVar) && zzhVarZzu.zzac()) ? zzpgVar3.zzq().zzd(zzhVarZzu.zzc()) : new Pair("", Boolean.FALSE);
                        if (!zzhVarZzu.zzac() || TextUtils.isEmpty((CharSequence) pairZzd.first)) {
                            zzic zzicVar3 = zzlpVarZzn.zzu;
                            zzicVar3.zzu().zzw();
                            zzicVarZzaE.zzF(Build.MODEL);
                            zzicVar3.zzu().zzw();
                            zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                            zzicVarZzaE.zzI((int) zzicVar3.zzu().zzb());
                            zzicVarZzaE.zzH(zzicVar3.zzu().zzc());
                            if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE)) {
                                zzicVarZzaE.zzW(zzlp.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(r10.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpgVar2 = zzlpVarZzn.zzg;
                            listZzn = zzpgVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpnVar = null;
                                    break;
                                }
                                zzpnVar = (zzpn) it.next();
                            } while (!"_lte".equals(zzpnVar.zzc));
                            if (zzpnVar != null) {
                                zzpn zzpnVar2 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar2);
                                zzpgVar2.zzj().zzl(zzpnVar2);
                            } else {
                                zzpn zzpnVar3 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar3);
                                zzpgVar2.zzj().zzl(zzpnVar3);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            for (i10 = 0; i10 < listZzn.size(); i10++) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm.zzb(((zzpn) listZzn.get(i10)).zzc);
                                zzitVarZzm.zza(((zzpn) listZzn.get(i10)).zzd);
                                zzpgVar2.zzp().zzc(zzitVarZzm, ((zzpn) listZzn.get(i10)).zze);
                                zziuVarArr[i10] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbd();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            zzpg zzpgVar4 = zzlpVarZzn.zzg;
                            zzpgVar4.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpgVar4.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgv zzgvVarZza = zzgv.zza(r10);
                            zzicVar = zzlpVarZzn.zzu;
                            zzpp zzppVarZzk = zzicVar.zzk();
                            bundle = zzgvVarZza.zze;
                            zzppVarZzk.zzK(bundle, zzpgVar2.zzj().zzV(str2));
                            zzicVar.zzk().zzI(zzgvVarZza, zzicVar.zzc().zzd(str2));
                            bundle.putLong("_c", 1L);
                            zzicVar.zzaW().zzj().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            String str4 = r10.zzc;
                            bundle.putString("_o", str4);
                            if (zzicVar.zzk().zzad(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                zzicVar.zzk().zzO(bundle, "_dbg", 1L);
                                zzicVar.zzk().zzO(bundle, "_r", 1L);
                            }
                            zzaw zzawVarZzj2 = zzpgVar2.zzj();
                            str = r10.zza;
                            zzbdVarZzf = zzawVarZzj2.zzf(str2, str);
                            if (zzbdVarZzf == null) {
                                obj = null;
                                zzbdVarZza = new zzbd(str2, str, 0L, 0L, 0L, r10.zzd, 0L, null, null, null, null);
                                j10 = 0;
                            } else {
                                obj = null;
                                long j11 = zzbdVarZzf.zzf;
                                zzbdVarZza = zzbdVarZzf.zza(r10.zzd);
                                j10 = j11;
                            }
                            zzpgVar2.zzj().zzh(zzbdVarZza);
                            zzbc zzbcVar = new zzbc(zzlpVarZzn.zzu, str4, str2, str, r10.zzd, 0L, j10, bundle);
                            zzhrVarZzp = com.google.android.gms.internal.measurement.zzhs.zzp();
                            zzhrVarZzp.zzo(zzbcVar.zzd);
                            zzhrVarZzp.zzl(zzbcVar.zzb);
                            zzhrVarZzp.zzq(zzbcVar.zzf);
                            zzbfVar = zzbcVar.zzg;
                            zzbeVar = new zzbe(zzbfVar);
                            while (zzbeVar.hasNext()) {
                                String next = zzbeVar.next();
                                zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb(next);
                                objZza = zzbfVar.zza(next);
                                if (objZza != null) {
                                    zzpgVar2.zzp().zzd(zzhvVarZzn, objZza);
                                    zzhrVarZzp.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzp);
                            com.google.android.gms.internal.measurement.zzie zzieVarZza = com.google.android.gms.internal.measurement.zzig.zza();
                            com.google.android.gms.internal.measurement.zzht zzhtVarZza = com.google.android.gms.internal.measurement.zzhu.zza();
                            zzhtVarZza.zzb(zzbdVarZza.zzc);
                            zzhtVarZza.zza(str);
                            zzieVarZza.zza(zzhtVarZza);
                            zzicVarZzaE.zzap(zzieVarZza);
                            zzicVarZzaE.zzaf(zzpgVar2.zzm().zzb(zzhVarZzu.zzc(), Collections.emptyList(), zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzp.zzn()), Long.valueOf(zzhrVarZzp.zzn()), false));
                            if (zzhrVarZzp.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzp.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzp.zzn());
                            }
                            jZzp = zzhVarZzu.zzp();
                            if (jZzp != 0) {
                                zzicVarZzaE.zzA(jZzp);
                            }
                            jZzn = zzhVarZzu.zzn();
                            if (jZzn != 0) {
                                zzicVarZzaE.zzy(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarZzaE.zzy(jZzp);
                            }
                            strZzh = zzhVarZzu.zzh();
                            zzair.zza();
                            if (zzicVar.zzc().zzp(str2, zzfy.zzaM)) {
                                zzicVarZzaE.zzau(strZzh);
                            }
                            zzhVarZzu.zzL();
                            zzicVarZzaE.zzZ((int) zzhVarZzu.zzG());
                            zzicVar.zzc().zzi();
                            zzicVarZzaE.zzO(161000L);
                            zzicVarZzaE.zzs(zzicVar.zzba().currentTimeMillis());
                            zzicVarZzaE.zzae(true);
                            zzpgVar4.zzS(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVarZzi.zze(zzicVarZzaE);
                            zzhVarZzu.zzo(zzicVarZzaE.zzu());
                            zzhVarZzu.zzq(zzicVarZzaE.zzw());
                            zzpgVar2.zzj().zzv(zzhVarZzu, false, false);
                            zzpgVar2.zzj().zzc();
                            zzpgVar2.zzj().zzd();
                            return zzpgVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVarZzi.zzbd()).zzcd());
                        }
                        try {
                            zzicVarZzaE.zzQ(zzlp.zzc((String) pairZzd.first, Long.toString(r10.zzd)));
                            Object obj2 = pairZzd.second;
                            if (obj2 != null) {
                                zzicVarZzaE.zzT(((Boolean) obj2).booleanValue());
                            }
                            zzic zzicVar4 = zzlpVarZzn.zzu;
                            zzicVar4.zzu().zzw();
                            zzicVarZzaE.zzF(Build.MODEL);
                            zzicVar4.zzu().zzw();
                            zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                            zzicVarZzaE.zzI((int) zzicVar4.zzu().zzb());
                            zzicVarZzaE.zzH(zzicVar4.zzu().zzc());
                            if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE)) {
                                zzicVarZzaE.zzW(zzlp.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(r10.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpgVar2 = zzlpVarZzn.zzg;
                            listZzn = zzpgVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpnVar = null;
                                    break;
                                }
                                zzpnVar = (zzpn) it.next();
                            } while (!"_lte".equals(zzpnVar.zzc));
                            if (zzpnVar != null) {
                                zzpn zzpnVar4 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar4);
                                zzpgVar2.zzj().zzl(zzpnVar4);
                            } else {
                                zzpn zzpnVar5 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar5);
                                zzpgVar2.zzj().zzl(zzpnVar5);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            while (i10 < listZzn.size()) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm2 = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm2.zzb(((zzpn) listZzn.get(i10)).zzc);
                                zzitVarZzm2.zza(((zzpn) listZzn.get(i10)).zzd);
                                zzpgVar2.zzp().zzc(zzitVarZzm2, ((zzpn) listZzn.get(i10)).zze);
                                zziuVarArr[i10] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm2.zzbd();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            zzpg zzpgVar5 = zzlpVarZzn.zzg;
                            zzpgVar5.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpgVar5.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgv zzgvVarZza2 = zzgv.zza(r10);
                            zzicVar = zzlpVarZzn.zzu;
                            zzpp zzppVarZzk2 = zzicVar.zzk();
                            bundle = zzgvVarZza2.zze;
                            zzppVarZzk2.zzK(bundle, zzpgVar2.zzj().zzV(str2));
                            zzicVar.zzk().zzI(zzgvVarZza2, zzicVar.zzc().zzd(str2));
                            bundle.putLong("_c", 1L);
                            zzicVar.zzaW().zzj().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            String str5 = r10.zzc;
                            bundle.putString("_o", str5);
                            if (zzicVar.zzk().zzad(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                zzicVar.zzk().zzO(bundle, "_dbg", 1L);
                                zzicVar.zzk().zzO(bundle, "_r", 1L);
                            }
                            zzaw zzawVarZzj3 = zzpgVar2.zzj();
                            str = r10.zza;
                            zzbdVarZzf = zzawVarZzj3.zzf(str2, str);
                            if (zzbdVarZzf == null) {
                                obj = null;
                                zzbdVarZza = new zzbd(str2, str, 0L, 0L, 0L, r10.zzd, 0L, null, null, null, null);
                                j10 = 0;
                            } else {
                                obj = null;
                                long j12 = zzbdVarZzf.zzf;
                                zzbdVarZza = zzbdVarZzf.zza(r10.zzd);
                                j10 = j12;
                            }
                            zzpgVar2.zzj().zzh(zzbdVarZza);
                            zzbc zzbcVar2 = new zzbc(zzlpVarZzn.zzu, str5, str2, str, r10.zzd, 0L, j10, bundle);
                            zzhrVarZzp = com.google.android.gms.internal.measurement.zzhs.zzp();
                            zzhrVarZzp.zzo(zzbcVar2.zzd);
                            zzhrVarZzp.zzl(zzbcVar2.zzb);
                            zzhrVarZzp.zzq(zzbcVar2.zzf);
                            zzbfVar = zzbcVar2.zzg;
                            zzbeVar = new zzbe(zzbfVar);
                            while (zzbeVar.hasNext()) {
                                String next2 = zzbeVar.next();
                                zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb(next2);
                                objZza = zzbfVar.zza(next2);
                                if (objZza != null) {
                                    zzpgVar2.zzp().zzd(zzhvVarZzn, objZza);
                                    zzhrVarZzp.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzp);
                            com.google.android.gms.internal.measurement.zzie zzieVarZza2 = com.google.android.gms.internal.measurement.zzig.zza();
                            com.google.android.gms.internal.measurement.zzht zzhtVarZza2 = com.google.android.gms.internal.measurement.zzhu.zza();
                            zzhtVarZza2.zzb(zzbdVarZza.zzc);
                            zzhtVarZza2.zza(str);
                            zzieVarZza2.zza(zzhtVarZza2);
                            zzicVarZzaE.zzap(zzieVarZza2);
                            zzicVarZzaE.zzaf(zzpgVar2.zzm().zzb(zzhVarZzu.zzc(), Collections.emptyList(), zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzp.zzn()), Long.valueOf(zzhrVarZzp.zzn()), false));
                            if (zzhrVarZzp.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzp.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzp.zzn());
                            }
                            jZzp = zzhVarZzu.zzp();
                            if (jZzp != 0) {
                                zzicVarZzaE.zzA(jZzp);
                            }
                            jZzn = zzhVarZzu.zzn();
                            if (jZzn != 0) {
                                zzicVarZzaE.zzy(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarZzaE.zzy(jZzp);
                            }
                            strZzh = zzhVarZzu.zzh();
                            zzair.zza();
                            if (zzicVar.zzc().zzp(str2, zzfy.zzaM)) {
                                zzicVarZzaE.zzau(strZzh);
                            }
                            zzhVarZzu.zzL();
                            zzicVarZzaE.zzZ((int) zzhVarZzu.zzG());
                            zzicVar.zzc().zzi();
                            zzicVarZzaE.zzO(161000L);
                            zzicVarZzaE.zzs(zzicVar.zzba().currentTimeMillis());
                            zzicVarZzaE.zzae(true);
                            zzpgVar5.zzS(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVarZzi.zze(zzicVarZzaE);
                            zzhVarZzu.zzo(zzicVarZzaE.zzu());
                            zzhVarZzu.zzq(zzicVarZzaE.zzw());
                            zzpgVar2.zzj().zzv(zzhVarZzu, false, false);
                            zzpgVar2.zzj().zzc();
                            zzpgVar2.zzj().zzd();
                            return zzpgVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVarZzi.zzbd()).zzcd());
                        } catch (SecurityException e10) {
                            zzlpVarZzn.zzu.zzaW().zzj().zzb("Resettable device id encryption failed", e10.getMessage());
                            bArr = new byte[0];
                            zzpgVar = zzlpVarZzn.zzg;
                            zzawVarZzj = zzpgVar.zzj();
                            zzawVarZzj.zzd();
                            return bArr;
                        }
                    }
                    zzic zzicVar5 = zzlpVarZzn.zzu;
                    zzicVar5.zzu().zzw();
                    zzicVarZzaE.zzF(Build.MODEL);
                    zzicVar5.zzu().zzw();
                    zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                    zzicVarZzaE.zzI((int) zzicVar5.zzu().zzb());
                    zzicVarZzaE.zzH(zzicVar5.zzu().zzc());
                    try {
                        try {
                            if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE) && zzhVarZzu.zzd() != null) {
                                zzicVarZzaE.zzW(zzlp.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(r10.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpgVar2 = zzlpVarZzn.zzg;
                            listZzn = zzpgVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpnVar = null;
                                    break;
                                }
                                zzpnVar = (zzpn) it.next();
                            } while (!"_lte".equals(zzpnVar.zzc));
                            if (zzpnVar != null || zzpnVar.zze == null) {
                                zzpn zzpnVar6 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar6);
                                zzpgVar2.zzj().zzl(zzpnVar6);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            while (i10 < listZzn.size()) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm3 = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm3.zzb(((zzpn) listZzn.get(i10)).zzc);
                                zzitVarZzm3.zza(((zzpn) listZzn.get(i10)).zzd);
                                zzpgVar2.zzp().zzc(zzitVarZzm3, ((zzpn) listZzn.get(i10)).zze);
                                zziuVarArr[i10] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm3.zzbd();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            zzpg zzpgVar6 = zzlpVarZzn.zzg;
                            zzpgVar6.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpgVar6.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgv zzgvVarZza3 = zzgv.zza(r10);
                            zzicVar = zzlpVarZzn.zzu;
                            zzpp zzppVarZzk3 = zzicVar.zzk();
                            bundle = zzgvVarZza3.zze;
                            zzppVarZzk3.zzK(bundle, zzpgVar2.zzj().zzV(str2));
                            zzicVar.zzk().zzI(zzgvVarZza3, zzicVar.zzc().zzd(str2));
                            try {
                                bundle.putLong("_c", 1L);
                                zzicVar.zzaW().zzj().zza("Marking in-app purchase as real-time");
                                bundle.putLong("_r", 1L);
                                String str6 = r10.zzc;
                                bundle.putString("_o", str6);
                                if (zzicVar.zzk().zzad(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                    zzicVar.zzk().zzO(bundle, "_dbg", 1L);
                                    zzicVar.zzk().zzO(bundle, "_r", 1L);
                                }
                                zzaw zzawVarZzj4 = zzpgVar2.zzj();
                                str = r10.zza;
                                zzbdVarZzf = zzawVarZzj4.zzf(str2, str);
                                if (zzbdVarZzf == null) {
                                    obj = null;
                                    zzbdVarZza = new zzbd(str2, str, 0L, 0L, 0L, r10.zzd, 0L, null, null, null, null);
                                    j10 = 0;
                                } else {
                                    obj = null;
                                    long j13 = zzbdVarZzf.zzf;
                                    zzbdVarZza = zzbdVarZzf.zza(r10.zzd);
                                    j10 = j13;
                                }
                                zzpgVar2.zzj().zzh(zzbdVarZza);
                                try {
                                    zzbc zzbcVar3 = new zzbc(zzlpVarZzn.zzu, str6, str2, str, r10.zzd, 0L, j10, bundle);
                                    zzhrVarZzp = com.google.android.gms.internal.measurement.zzhs.zzp();
                                    zzhrVarZzp.zzo(zzbcVar3.zzd);
                                    zzhrVarZzp.zzl(zzbcVar3.zzb);
                                    zzhrVarZzp.zzq(zzbcVar3.zzf);
                                    zzbfVar = zzbcVar3.zzg;
                                    zzbeVar = new zzbe(zzbfVar);
                                    while (zzbeVar.hasNext()) {
                                        String next3 = zzbeVar.next();
                                        zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                        zzhvVarZzn.zzb(next3);
                                        objZza = zzbfVar.zza(next3);
                                        if (objZza != null) {
                                            zzpgVar2.zzp().zzd(zzhvVarZzn, objZza);
                                            zzhrVarZzp.zzg(zzhvVarZzn);
                                        }
                                    }
                                    zzicVarZzaE.zzg(zzhrVarZzp);
                                    com.google.android.gms.internal.measurement.zzie zzieVarZza3 = com.google.android.gms.internal.measurement.zzig.zza();
                                    com.google.android.gms.internal.measurement.zzht zzhtVarZza3 = com.google.android.gms.internal.measurement.zzhu.zza();
                                    zzhtVarZza3.zzb(zzbdVarZza.zzc);
                                    zzhtVarZza3.zza(str);
                                    zzieVarZza3.zza(zzhtVarZza3);
                                    zzicVarZzaE.zzap(zzieVarZza3);
                                    zzicVarZzaE.zzaf(zzpgVar2.zzm().zzb(zzhVarZzu.zzc(), Collections.emptyList(), zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzp.zzn()), Long.valueOf(zzhrVarZzp.zzn()), false));
                                    if (zzhrVarZzp.zzm()) {
                                        zzicVarZzaE.zzv(zzhrVarZzp.zzn());
                                        zzicVarZzaE.zzx(zzhrVarZzp.zzn());
                                    }
                                    jZzp = zzhVarZzu.zzp();
                                    if (jZzp != 0) {
                                        zzicVarZzaE.zzA(jZzp);
                                    }
                                    jZzn = zzhVarZzu.zzn();
                                    if (jZzn != 0) {
                                        zzicVarZzaE.zzy(jZzn);
                                    } else if (jZzp != 0) {
                                        zzicVarZzaE.zzy(jZzp);
                                    }
                                    strZzh = zzhVarZzu.zzh();
                                    zzair.zza();
                                    if (zzicVar.zzc().zzp(str2, zzfy.zzaM) && strZzh != null) {
                                        zzicVarZzaE.zzau(strZzh);
                                    }
                                    zzhVarZzu.zzL();
                                    zzicVarZzaE.zzZ((int) zzhVarZzu.zzG());
                                    zzicVar.zzc().zzi();
                                    zzicVarZzaE.zzO(161000L);
                                    zzicVarZzaE.zzs(zzicVar.zzba().currentTimeMillis());
                                    zzicVarZzaE.zzae(true);
                                    zzpgVar6.zzS(zzicVarZzaE.zzK(), zzicVarZzaE);
                                    zzhzVarZzi.zze(zzicVarZzaE);
                                    zzhVarZzu.zzo(zzicVarZzaE.zzu());
                                    zzhVarZzu.zzq(zzicVarZzaE.zzw());
                                    zzpgVar2.zzj().zzv(zzhVarZzu, false, false);
                                    zzpgVar2.zzj().zzc();
                                    zzpgVar2.zzj().zzd();
                                    try {
                                        return zzpgVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVarZzi.zzbd()).zzcd());
                                    } catch (IOException e11) {
                                        zzlpVarZzn.zzu.zzaW().zzb().zzc("Data loss. Failed to bundle and serialize. appId", zzgu.zzl(str2), e11);
                                        return obj;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    r10 = zzlpVarZzn;
                                    r10.zzg.zzj().zzd();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                r10 = zzlpVarZzn;
                            }
                        } catch (SecurityException e12) {
                            zzlpVarZzn.zzu.zzaW().zzj().zzb("app instance id encryption failed", e12.getMessage());
                            bArr = new byte[0];
                            zzpgVar = zzlpVarZzn.zzg;
                            zzawVarZzj = zzpgVar.zzj();
                            zzawVarZzj.zzd();
                            return bArr;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    zzlpVarZzn.zzu.zzaW().zzj().zzb("Log and bundle disabled. package_name", str2);
                    bArr = new byte[0];
                }
                zzawVarZzj.zzd();
                return bArr;
            }
            zzlpVarZzn.zzu.zzaW().zzj().zzb("Log and bundle not available. package_name", str2);
            bArr = new byte[0];
            zzawVarZzj = zzpgVar3.zzj();
            zzawVarZzj.zzd();
            return bArr;
        } catch (Throwable th4) {
            th = th4;
            r10 = zzlpVarZzn;
            r10.zzg.zzj().zzd();
            throw th;
        }
    }
}
