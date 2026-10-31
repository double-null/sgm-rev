package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import c0.IbU.elEbP;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzatt implements zzasx {
    protected final zzatv zza;
    private final zzats zzb;

    public zzatt(zzats zzatsVar) {
        zzatv zzatvVar = new zzatv(4096);
        this.zzb = zzatsVar;
        this.zza = zzatvVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:117:0x0228  */
    /* JADX WARN: Code duplicated, block: B:144:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d0  */
    @Override // com.google.android.gms.internal.ads.zzasx
    public zzata zza(zzate zzateVar) throws Throwable {
        zzauc zzaucVar;
        byte[] bArr;
        int iZza;
        zzatn zzaszVar;
        String str;
        zzata zzataVar;
        int iZzo;
        Map mapEmptyMap;
        byte[] byteArray;
        byte[] bArrZza;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                zzasn zzasnVarZzk = zzateVar.zzk();
                if (zzasnVarZzk == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    String str2 = zzasnVarZzk.zzb;
                    if (str2 != null) {
                        map.put("If-None-Match", str2);
                    }
                    long j10 = zzasnVarZzk.zzd;
                    if (j10 > 0) {
                        map.put("If-Modified-Since", zzaub.zzc(j10));
                    }
                    mapEmptyMap = map;
                }
                zzauc zzaucVarZza = this.zzb.zza(zzateVar, mapEmptyMap);
                try {
                    int iZza2 = zzaucVarZza.zza();
                    List listZzb = zzaucVarZza.zzb();
                    if (iZza2 == 304) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        zzasn zzasnVarZzk2 = zzateVar.zzk();
                        if (zzasnVarZzk2 == null) {
                            return new zzata(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, (byte[]) null, true, jElapsedRealtime2, listZzb);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!listZzb.isEmpty()) {
                            Iterator it = listZzb.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((zzasw) it.next()).zza());
                            }
                        }
                        ArrayList arrayList = new ArrayList(listZzb);
                        List list = zzasnVarZzk2.zzh;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (zzasw zzaswVar : zzasnVarZzk2.zzh) {
                                    if (!treeSet.contains(zzaswVar.zza())) {
                                        arrayList.add(zzaswVar);
                                    }
                                }
                            }
                        } else if (!zzasnVarZzk2.zzg.isEmpty()) {
                            for (Map.Entry entry : zzasnVarZzk2.zzg.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzasw((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new zzata(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, zzasnVarZzk2.zza, true, jElapsedRealtime2, (List) arrayList);
                    }
                    InputStream inputStreamZzd = zzaucVarZza.zzd();
                    if (inputStreamZzd != null) {
                        int iZzc = zzaucVarZza.zzc();
                        zzatv zzatvVar = this.zza;
                        zzaug zzaugVar = new zzaug(zzatvVar, iZzc);
                        try {
                            bArrZza = zzatvVar.zza(1024);
                            while (true) {
                                try {
                                    int i10 = inputStreamZzd.read(bArrZza);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    zzaugVar.write(bArrZza, 0, i10);
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        inputStreamZzd.close();
                                    } catch (IOException unused) {
                                        zzatq.zza("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzatvVar.zzb(bArrZza);
                                    zzaugVar.close();
                                    throw th;
                                }
                            }
                            byteArray = zzaugVar.toByteArray();
                            try {
                                inputStreamZzd.close();
                            } catch (IOException unused2) {
                                zzatq.zza("Error occurred when closing InputStream", new Object[0]);
                            }
                            zzatvVar.zzb(bArrZza);
                            zzaugVar.close();
                        } catch (Throwable th2) {
                            th = th2;
                            bArrZza = null;
                        }
                    } else {
                        byteArray = new byte[0];
                    }
                    byte[] bArr2 = byteArray;
                    try {
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (zzatq.zzb || jElapsedRealtime3 > 3000) {
                            Object[] objArr = new Object[5];
                            objArr[0] = zzateVar;
                            objArr[1] = Long.valueOf(jElapsedRealtime3);
                            objArr[2] = bArr2 != null ? Integer.valueOf(bArr2.length) : "null";
                            objArr[3] = Integer.valueOf(iZza2);
                            objArr[4] = Integer.valueOf(zzateVar.zzy().zzb());
                            zzatq.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                        }
                        if (iZza2 < 200 || iZza2 > 299) {
                            throw new IOException();
                        }
                        return new zzata(iZza2, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzb);
                    } catch (IOException e10) {
                        e = e10;
                        bArr = bArr2;
                        zzaucVar = zzaucVarZza;
                        if (e instanceof SocketTimeoutException) {
                            zzaszVar = new zzatm();
                            str = elEbP.nUTClqIiDeEuFWV;
                        } else {
                            if (!(e instanceof MalformedURLException)) {
                                throw new RuntimeException("Bad URL ".concat(String.valueOf(zzateVar.zzh())), e);
                            }
                            if (zzaucVar != null) {
                                throw new zzatb(e);
                            }
                            iZza = zzaucVar.zza();
                            zzatq.zzc(oqHAiWkeGzWld.txmQLn, Integer.valueOf(iZza), zzateVar.zzh());
                            if (bArr != null) {
                                zzataVar = new zzata(iZza, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzaucVar.zzb());
                                if (iZza == 401 && iZza != 403) {
                                    if (iZza < 400 || iZza > 499) {
                                        throw new zzatl(zzataVar);
                                    }
                                    throw new zzasr(zzataVar);
                                }
                                zzaszVar = new zzasm(zzataVar);
                                str = "auth";
                            } else {
                                zzaszVar = new zzasz();
                                str = "network";
                            }
                        }
                        zzass zzassVarZzy = zzateVar.zzy();
                        iZzo = zzateVar.zzo();
                        try {
                            zzassVarZzy.zzc(zzaszVar);
                            zzateVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
                        } catch (zzatn e11) {
                            zzateVar.zzc(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(iZzo)));
                            throw e11;
                        }
                    }
                } catch (IOException e12) {
                    e = e12;
                    zzaucVar = zzaucVarZza;
                    bArr = null;
                    if (e instanceof SocketTimeoutException) {
                        zzaszVar = new zzatm();
                        str = elEbP.nUTClqIiDeEuFWV;
                    } else {
                        if (!(e instanceof MalformedURLException)) {
                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzateVar.zzh())), e);
                        }
                        if (zzaucVar != null) {
                            throw new zzatb(e);
                        }
                        iZza = zzaucVar.zza();
                        zzatq.zzc(oqHAiWkeGzWld.txmQLn, Integer.valueOf(iZza), zzateVar.zzh());
                        if (bArr != null) {
                            zzataVar = new zzata(iZza, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzaucVar.zzb());
                            if (iZza == 401) {
                            }
                            zzaszVar = new zzasm(zzataVar);
                            str = "auth";
                        } else {
                            zzaszVar = new zzasz();
                            str = "network";
                        }
                    }
                    zzass zzassVarZzy2 = zzateVar.zzy();
                    iZzo = zzateVar.zzo();
                    zzassVarZzy2.zzc(zzaszVar);
                    zzateVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
                }
            } catch (IOException e13) {
                e = e13;
                zzaucVar = null;
            }
            zzateVar.zzc(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(iZzo)));
        }
    }
}
