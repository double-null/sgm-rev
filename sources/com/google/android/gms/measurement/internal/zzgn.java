package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgn {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzgm zzd;

    public zzgn(zzgm zzgmVar) {
        this.zzd = zzgmVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjm.zzf, zzjm.zza, zza);
    }

    protected final String zzb(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjn.zzb, zzjn.zza, zzb);
    }

    protected final String zzc(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return zzg(str, zzjo.zzb, zzjo.zza, zzc);
        }
        return "experiment_id(" + str + ")";
    }

    protected final String zzd(zzbh zzbhVar) {
        String string;
        zzgm zzgmVar = this.zzd;
        if (!zzgmVar.zza()) {
            return zzbhVar.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(zzbhVar.zzc);
        sb2.append(",name=");
        sb2.append(zza(zzbhVar.zza));
        sb2.append(",params=");
        zzbf zzbfVar = zzbhVar.zzb;
        if (zzbfVar == null) {
            string = null;
        } else {
            string = !zzgmVar.zza() ? zzbfVar.toString() : zze(zzbfVar.zzf());
        }
        sb2.append(string);
        return sb2.toString();
    }

    protected final String zze(Bundle bundle) {
        String strZzf;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(zzb(str));
            sb2.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strZzf = zzf(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strZzf = zzf((Object[]) obj);
            } else {
                strZzf = obj instanceof ArrayList ? zzf(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb2.append(strZzf);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    protected final String zzf(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : objArr) {
            String strZze = obj instanceof Bundle ? zze((Bundle) obj) : String.valueOf(obj);
            if (strZze != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(strZze);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
