package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.vungle.ads.internal.protos.Sdk;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfyz {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfza zzc;
    private final zzfxg zzd;
    private final zzfxb zze;
    private final boolean zzf;
    private zzfyo zzg;
    private final Object zzh = new Object();

    public zzfyz(Context context, zzfza zzfzaVar, zzfxg zzfxgVar, zzfxb zzfxbVar, boolean z10) {
        this.zzb = context;
        this.zzc = zzfzaVar;
        this.zzd = zzfxgVar;
        this.zze = zzfxbVar;
        this.zzf = z10;
    }

    private final synchronized Class zzd(zzfyp zzfypVar) throws zzfyy {
        if (zzfypVar.zza() == null) {
            throw new zzfyy(4010, "mc");
        }
        String strZza = zzfypVar.zza().zza();
        HashMap map = zza;
        Class cls = (Class) map.get(strZza);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfypVar.zzb())) {
                throw new zzfyy(2026, "VM did not pass signature verification");
            }
            try {
                File fileZzc = zzfypVar.zzc();
                if (!fileZzc.exists()) {
                    fileZzc.mkdirs();
                }
                Class<?> clsLoadClass = new DexClassLoader(zzfypVar.zzb().getAbsolutePath(), fileZzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                map.put(strZza, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e10) {
                throw new zzfyy(2008, e10);
            }
        } catch (GeneralSecurityException e11) {
            throw new zzfyy(2026, e11);
        }
    }

    public final boolean zza(zzfyp zzfypVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfyo zzfyoVar = new zzfyo(zzd(zzfypVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfypVar.zzd(), null, new Bundle(), 2), zzfypVar, this.zzc, this.zzd, this.zzf);
                if (!zzfyoVar.zzf()) {
                    throw new zzfyy(Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, "init failed");
                }
                int iZzh = zzfyoVar.zzh();
                if (iZzh != 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzh).length() + 4);
                    sb2.append("ci: ");
                    sb2.append(iZzh);
                    throw new zzfyy(4001, sb2.toString());
                }
                synchronized (this.zzh) {
                    zzfyo zzfyoVar2 = this.zzg;
                    if (zzfyoVar2 != null) {
                        try {
                            zzfyoVar2.zzg();
                        } catch (zzfyy e10) {
                            this.zzd.zzc(e10.zza(), -1L, e10);
                        }
                        this.zzg = zzfyoVar;
                    } else {
                        this.zzg = zzfyoVar;
                    }
                    throw th;
                }
                this.zzd.zzb(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e11) {
                throw new zzfyy(2004, e11);
            }
        } catch (zzfyy e12) {
            this.zzd.zzc(e12.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e13);
            return false;
        }
    }

    public final zzfxj zzb() {
        zzfyo zzfyoVar;
        synchronized (this.zzh) {
            zzfyoVar = this.zzg;
        }
        return zzfyoVar;
    }

    public final zzfyp zzc() {
        synchronized (this.zzh) {
            zzfyo zzfyoVar = this.zzg;
            if (zzfyoVar == null) {
                return null;
            }
            return zzfyoVar.zze();
        }
    }
}
