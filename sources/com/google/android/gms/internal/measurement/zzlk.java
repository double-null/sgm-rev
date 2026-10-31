package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.applovin.impl.sdk.i0;
import com.google.common.base.m;
import com.google.common.base.p;
import com.google.common.base.w;
import com.google.common.base.x;
import com.google.common.util.concurrent.f0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import kotlin.jvm.internal.t;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlk {
    public static final /* synthetic */ int zza = 0;
    private static final Object zzb = new Object();
    private static final AtomicReference zzc = new AtomicReference();
    private static volatile zzlk zzd = null;
    private static volatile zzlk zze = null;
    private static final w zzf = x.a(zzlp.zza);
    private final zzoh zzg = new zzol();
    private final Context zzh;
    private final w zzi;
    private final w zzj;
    private final w zzk;
    private final w zzl;
    private final zzrf zzm;
    private final w zzn;
    private final zzqe zzo;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
    public interface zza {
        m zza();
    }

    /* synthetic */ zzlk(Context context, w wVar, w wVar2, final w wVar3, w wVar4, w wVar5, byte[] bArr) {
        Context applicationContext = context.getApplicationContext();
        p.l(applicationContext);
        p.l(wVar);
        p.l(wVar2);
        p.l(wVar3);
        p.l(wVar4);
        p.l(wVar5);
        w wVarA = x.a(wVar);
        w wVarA2 = x.a(wVar2);
        w wVarA3 = x.a(new w() { // from class: com.google.android.gms.internal.measurement.zzlq
            @Override // com.google.common.base.w
            public final /* synthetic */ Object get() {
                int i10 = zzlk.zza;
                return (zzqm) ((m) wVar3.get()).h();
            }
        });
        w wVarA4 = x.a(wVar4);
        w wVarA5 = x.a(wVar5);
        this.zzh = applicationContext;
        this.zzi = wVarA;
        this.zzj = wVarA2;
        this.zzk = wVarA3;
        this.zzl = wVarA4;
        this.zzm = new zzrf(applicationContext, wVarA, wVarA4, wVarA2);
        this.zzn = wVarA5;
        this.zzo = new zzqe(applicationContext, wVarA, wVarA3, wVarA2);
    }

    public static void zza(Context context) {
        Context applicationContext;
        if (zzc.get() != null) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
        } catch (NullPointerException unused) {
            zzl();
            zzlz.zza(Level.WARNING, (Executor) zzf.get(), "context.getApplicationContext() yielded NullPointerException", new Object[0]);
            applicationContext = null;
        }
        if (applicationContext != null) {
            i0.a(zzc, null, applicationContext);
        }
    }

    public static boolean zzl() {
        zzls.zzb();
        if (zzc.get() == null) {
            zzls.zzd();
        }
        return false;
    }

    public final Context zzc() {
        return this.zzh;
    }

    public final zzrf zzd() {
        return this.zzm;
    }

    public final m zze() {
        return (m) this.zzn.get();
    }

    public final zzqe zzf() {
        return this.zzo;
    }

    public final f0 zzg() {
        return (f0) this.zzi.get();
    }

    public final zzmj zzh() {
        return (zzmj) this.zzj.get();
    }

    public final zzru zzi() {
        return (zzru) this.zzl.get();
    }

    public final zzqm zzj() {
        return (zzqm) this.zzk.get();
    }

    public final zzoh zzk() {
        return this.zzg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzlk zzb() {
        boolean z10;
        zzls.zza();
        zzls.zzc();
        Context context = (Context) zzc.get();
        if (context != null) {
            zzlk zzlkVar = zzd;
            if (zzlkVar == null) {
                final Context context2 = context.getApplicationContext();
                try {
                    t.f(context2, "context");
                    t.f(zza.class, TwDPD.NVEqGSe);
                    Object applicationContext = context2.getApplicationContext();
                    t.e(applicationContext, "getApplicationContext(...)");
                    if (applicationContext instanceof zzagp) {
                        try {
                            Object objCast = zza.class.cast(((zzagp) applicationContext).zza());
                            t.c(objCast);
                            m mVarZza = ((zza) objCast).zza();
                            z10 = true;
                            try {
                                if (mVarZza.e()) {
                                    return (zzlk) mVarZza.c();
                                }
                            } catch (IllegalStateException unused) {
                            }
                        } catch (ClassCastException e10) {
                            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e10);
                        }
                    } else {
                        Class<?> cls = applicationContext.getClass();
                        new StringBuilder(String.valueOf(cls).length() + 72);
                        cls.toString();
                        throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
                    }
                } catch (IllegalStateException unused2) {
                    z10 = false;
                }
                synchronized (zzb) {
                    if (zzd != null) {
                        return zzd;
                    }
                    m mVarB = m.b();
                    boolean z11 = context2 instanceof zza;
                    if (z11) {
                        mVarB = ((zza) context2).zza();
                    }
                    zzlk zzlkVar2 = (zzlk) mVarB.g(new w() { // from class: com.google.android.gms.internal.measurement.zzll
                        @Override // com.google.common.base.w
                        public final /* synthetic */ Object get() {
                            int i10 = zzlk.zza;
                            zzlj zzljVar = new zzlj(null);
                            zzljVar.zza(context2);
                            return zzljVar.zzb();
                        }
                    });
                    zzd = zzlkVar2;
                    if (!z10 && !z11) {
                        zzlz.zza(Level.CONFIG, zzlkVar2.zzg(), "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                    }
                    return zzlkVar2;
                }
            }
            return zzlkVar;
        }
        zzls.zzb();
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
