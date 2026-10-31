package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzabw;
import com.google.android.gms.internal.measurement.zzabx;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.c1;
import com.google.common.collect.v;
import com.google.common.collect.w;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.x;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import com.vungle.ads.internal.model.Cookie;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import wc.g0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@23.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzlj extends zzg {
    protected zzky zza;
    final zzx zzb;
    protected boolean zzc;
    private zzjp zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private boolean zzi;
    private int zzj;
    private zzaz zzk;
    private zzaz zzl;
    private PriorityQueue zzm;
    private zzjl zzn;
    private final AtomicLong zzo;
    private long zzp;
    private zzaz zzq;
    private SharedPreferences.OnSharedPreferenceChangeListener zzr;
    private zzaz zzs;
    private final zzpo zzt;

    protected zzlj(zzic zzicVar) {
        super(zzicVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzi = false;
        this.zzj = 1;
        this.zzc = true;
        this.zzt = new zzkn(this);
        this.zzg = new AtomicReference();
        this.zzn = zzjl.zza;
        this.zzp = -1L;
        this.zzo = new AtomicLong(0L);
        this.zzb = new zzx(zzicVar);
    }

    private final zzlr zzap(final zzom zzomVar) {
        try {
            URL url = new URI(zzomVar.zzc).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strZzl = this.zzu.zzv().zzl();
            zzic zzicVar = this.zzu;
            zzgs zzgsVarZzk = zzicVar.zzaW().zzk();
            Long lValueOf = Long.valueOf(zzomVar.zza);
            zzgsVarZzk.zzd("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.zzc, Integer.valueOf(zzomVar.zzb.length));
            if (!TextUtils.isEmpty(zzomVar.zzg)) {
                zzicVar.zzaW().zzk().zzc("[sgtm] Uploading data from app. row_id", lValueOf, zzomVar.zzg);
            }
            HashMap map = new HashMap();
            Bundle bundle = zzomVar.zzd;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            zzlo zzloVarZzn = zzicVar.zzn();
            byte[] bArr = zzomVar.zzb;
            zzll zzllVar = new zzll() { // from class: com.google.android.gms.measurement.internal.zzkz
                /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r11
                  0x002e: PHI (r11v7 int) = (r11v1 int), (r11v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x0064  */
                /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                @Override // com.google.android.gms.measurement.internal.zzll
                public final /* synthetic */ void zza(String str2, int i10, Throwable th, byte[] bArr2, Map map2) {
                    zzlr zzlrVar;
                    zzlj zzljVar = this.zza;
                    zzljVar.zzg();
                    zzom zzomVar2 = zzomVar;
                    if (i10 == 200 || i10 == 204) {
                        if (th == null) {
                            zzljVar.zzu.zzaW().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.zza));
                            zzlrVar = zzlr.SUCCESS;
                        } else {
                            zzljVar.zzu.zzaW().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i10), th);
                            if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i10))) {
                                zzlrVar = zzlr.BACKOFF;
                            } else {
                                zzlrVar = zzlr.FAILURE;
                            }
                        }
                    } else if (i10 == 304) {
                        i10 = 304;
                        if (th == null) {
                            zzljVar.zzu.zzaW().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.zza));
                            zzlrVar = zzlr.SUCCESS;
                        } else {
                            zzljVar.zzu.zzaW().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i10), th);
                            if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i10))) {
                                zzlrVar = zzlr.BACKOFF;
                            } else {
                                zzlrVar = zzlr.FAILURE;
                            }
                        }
                    } else {
                        zzljVar.zzu.zzaW().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i10), th);
                        if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i10))) {
                            zzlrVar = zzlr.BACKOFF;
                        } else {
                            zzlrVar = zzlr.FAILURE;
                        }
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    zznl zznlVarZzt = zzljVar.zzu.zzt();
                    long j10 = zzomVar2.zza;
                    zznlVarZzt.zzy(new zzaf(j10, zzlrVar.zza(), zzomVar2.zzf));
                    zzljVar.zzu.zzaW().zzk().zzc("[sgtm] Updated status for row_id", Long.valueOf(j10), zzlrVar);
                    synchronized (atomicReference2) {
                        atomicReference2.set(zzlrVar);
                        atomicReference2.notifyAll();
                    }
                }
            };
            zzloVarZzn.zzw();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(bArr);
            Preconditions.checkNotNull(zzllVar);
            zzloVarZzn.zzu.zzaX().zzm(new zzln(zzloVarZzn, strZzl, url, bArr, map, zzllVar));
            try {
                zzic zzicVar2 = zzicVar.zzk().zzu;
                long jCurrentTimeMillis = zzicVar2.zzba().currentTimeMillis() + 60000;
                synchronized (atomicReference) {
                    for (long jCurrentTimeMillis2 = 60000; atomicReference.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - zzicVar2.zzba().currentTimeMillis()) {
                        try {
                            atomicReference.wait(jCurrentTimeMillis2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.zzu.zzaW().zze().zza("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? zzlr.UNKNOWN : (zzlr) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            this.zzu.zzaW().zzb().zzd("[sgtm] Bad upload url for row_id", zzomVar.zzc, Long.valueOf(zzomVar.zza), e10);
            return zzlr.FAILURE;
        }
    }

    private final void zzaq(Boolean bool, boolean z10) {
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzj().zzb("Setting app measurement enabled (FE)", bool);
        zzicVar.zzd().zzh(bool);
        if (z10) {
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzic zzicVar2 = zzhhVarZzd.zzu;
            zzhhVarZzd.zzg();
            SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.zzu.zzE() || !(bool == null || bool.booleanValue())) {
            zzak();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
    public final void zzak() {
        zzg();
        zzic zzicVar = this.zzu;
        String strZza = zzicVar.zzd().zzh.zza();
        if (strZza != null) {
            if ("unset".equals(strZza)) {
                zzM("app", "_npa", null, zzicVar.zzba().currentTimeMillis());
            } else {
                zzM("app", "_npa", Long.valueOf(true != ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(strZza) ? 0L : 1L), zzicVar.zzba().currentTimeMillis());
            }
        }
        if (!this.zzu.zzB() || !this.zzc) {
            zzicVar.zzaW().zzj().zza("Updating Scion state (FE)");
            this.zzu.zzt().zzi();
        } else {
            zzicVar.zzaW().zzj().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzT();
            this.zzu.zzh().zza.zza();
            zzicVar.zzaX().zzj(new zzjz(this));
        }
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        zzic zzicVar = this.zzu;
        zzB(str, str2, bundle, true, true, zzicVar.zzba().currentTimeMillis(), zzicVar.zzc().zzp(null, zzfy.zzbe) ? zzicVar.zzba().elapsedRealtime() : 0L);
    }

    public final void zzB(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10, long j11) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, "screen_view")) {
            zzic zzicVar = this.zzu;
            zzicVar.zzs().zzj(bundle2, j10, true != zzicVar.zzc().zzp(null, zzfy.zzbe) ? 0L : j11);
        } else {
            zzI(str == null ? "app" : str, str2, j10, true != this.zzu.zzc().zzp(null, zzfy.zzbe) ? 0L : j11, bundle2, z11, !z11 || this.zzd == null || zzpp.zzac(str2), z10, null);
        }
    }

    public final void zzD() {
        zzg();
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzj().zza("Register tcfPrefChangeListener.");
        if (this.zzr == null) {
            this.zzs = new zzkb(this, this.zzu);
            this.zzr = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.zza.zzaf(sharedPreferences, str);
                }
            };
        }
        zzicVar.zzd().zze().registerOnSharedPreferenceChangeListener(this.zzr);
    }

    final void zzE(String str, String str2, Bundle bundle) {
        zzg();
        zzic zzicVar = this.zzu;
        zzF(str, str2, zzicVar.zzba().currentTimeMillis(), zzicVar.zzc().zzp(null, zzfy.zzbe) ? zzicVar.zzba().elapsedRealtime() : 0L, bundle);
    }

    final void zzF(String str, String str2, long j10, long j11, Bundle bundle) {
        zzg();
        zzG(str, str2, j10, j11, bundle, true, this.zzd == null || zzpp.zzac(str2), true, null);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x010b  */
    protected final void zzG(String str, String str2, long j10, long j11, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        Bundle bundle2;
        long j12;
        Object obj;
        Bundle[] bundleArr;
        int i10;
        String str4 = str2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        if (!zzicVar.zzB()) {
            this.zzu.zzaW().zzj().zza("Event not sent since app measurement is disabled");
            return;
        }
        List listZzp = this.zzu.zzv().zzp();
        if (listZzp != null && !listZzp.contains(str4)) {
            this.zzu.zzaW().zzj().zzc("Dropping non-safelisted event. event name, origin", str4, str);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!zzicVar.zzp() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzu.zzaZ().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzu.zzaZ());
                } catch (Exception e10) {
                    this.zzu.zzaW().zze().zzb("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.zzu.zzaW().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        zzic zzicVar2 = this.zzu;
        if (!zzicVar2.zzc().zzp(null, zzfy.zzaZ) && "_cmp".equals(str4) && bundle.containsKey("gclid")) {
            zzicVar2.zzaV();
            zzM("auto", "_lgclid", bundle.getString("gclid"), zzicVar2.zzba().currentTimeMillis());
        }
        zzicVar2.zzaV();
        if (z10 && zzpp.zzai(str2)) {
            zzicVar2.zzk().zzK(bundle, zzicVar2.zzd().zzt.zza());
        }
        if (!z12) {
            zzicVar2.zzaV();
            if (!"_iap".equals(str4)) {
                zzic zzicVar3 = this.zzu;
                zzpp zzppVarZzk = zzicVar3.zzk();
                if (zzppVarZzk.zzk("event", str4)) {
                    zzic zzicVar4 = zzppVarZzk.zzu;
                    if (zzppVarZzk.zzm("event", zzjm.zza, zzicVar4.zzc().zzp(null, zzfy.zzbf) ? zzjm.zzc : zzjm.zzb, str4)) {
                        zzicVar4.zzc();
                        if (zzppVarZzk.zzn("event", 40, str4)) {
                            i10 = 0;
                        } else {
                            i10 = 2;
                        }
                    } else {
                        i10 = 13;
                    }
                } else {
                    i10 = 2;
                }
                if (i10 != 0) {
                    zzicVar2.zzaW().zzd().zzb("Invalid public event name. Event will not be logged (FE)", zzicVar2.zzl().zza(str4));
                    zzpp zzppVarZzk2 = zzicVar3.zzk();
                    zzicVar3.zzc();
                    zzicVar3.zzk().zzP(this.zzt, null, i10, "_ev", zzppVarZzk2.zzE(str4, 40, true), str4 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzicVar2.zzaV();
        zzic zzicVar5 = this.zzu;
        zzlu zzluVarZzh = zzicVar5.zzs().zzh(false);
        if (zzluVarZzh != null && !bundle.containsKey("_sc")) {
            zzluVarZzh.zzd = true;
        }
        zzpp.zzay(zzluVarZzh, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str);
        boolean zZzac = zzpp.zzac(str2);
        if (!z10 || this.zzd == null || zZzac) {
            z13 = zEquals;
        } else {
            if (!zEquals) {
                zzicVar2.zzaW().zzj().zzc("Passing event to registered event handler (FE)", zzicVar2.zzl().zza(str4), zzicVar2.zzl().zze(bundle));
                Preconditions.checkNotNull(this.zzd);
                this.zzd.interceptEvent(str, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        zzic zzicVar6 = this.zzu;
        if (zzicVar6.zzH()) {
            int iZzp = zzicVar2.zzk().zzp(str4);
            if (iZzp != 0) {
                zzicVar2.zzaW().zzd().zzb("Invalid event name. Event will not be logged (FE)", zzicVar2.zzl().zza(str4));
                zzpp zzppVarZzk3 = zzicVar2.zzk();
                zzicVar2.zzc();
                zzicVar6.zzk().zzP(this.zzt, str3, iZzp, "_ev", zzppVarZzk3.zzE(str4, 40, true), str4 != null ? str2.length() : 0);
                return;
            }
            String str5 = "_o";
            Bundle bundleZzH = zzicVar2.zzk().zzH(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z12);
            Preconditions.checkNotNull(bundleZzH);
            zzicVar2.zzaV();
            if (zzicVar5.zzs().zzh(false) != null && "_ae".equals(str4)) {
                zzoa zzoaVar = zzicVar5.zzh().zzb;
                long jElapsedRealtime = zzoaVar.zzc.zzu.zzba().elapsedRealtime();
                long j13 = jElapsedRealtime - zzoaVar.zzb;
                zzoaVar.zzb = jElapsedRealtime;
                if (j13 > 0) {
                    zzicVar2.zzk().zzan(bundleZzH, j13);
                }
            }
            String str6 = str;
            if (!"auto".equals(str6) && "_ssr".equals(str4)) {
                zzpp zzppVarZzk4 = zzicVar2.zzk();
                String string = bundleZzH.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                zzic zzicVar7 = zzppVarZzk4.zzu;
                if (Objects.equals(string, zzicVar7.zzd().zzq.zza())) {
                    zzicVar7.zzaW().zzj().zza("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zzicVar7.zzd().zzq.zzb(string);
            } else if ("_ae".equals(str4)) {
                String strZza = zzicVar2.zzk().zzu.zzd().zzq.zza();
                if (!TextUtils.isEmpty(strZza)) {
                    bundleZzH.putString("_ffr", strZza);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleZzH);
            boolean zZzi = zzicVar2.zzc().zzp(null, zzfy.zzaS) ? zzicVar5.zzh().zzi() : zzicVar2.zzd().zzn.zza();
            if (zzicVar2.zzd().zzk.zza() <= 0) {
                bundle2 = bundleZzH;
                j12 = 0;
            } else if (zzicVar2.zzd().zzo(j10) && zZzi) {
                zzicVar2.zzaW().zzk().zza("Current session is expired, remove the session number, ID, and engagement time");
                j12 = 0;
                bundle2 = bundleZzH;
                zzM("auto", "_sid", null, zzicVar2.zzba().currentTimeMillis());
                zzM("auto", "_sno", null, zzicVar2.zzba().currentTimeMillis());
                zzM("auto", "_se", null, zzicVar2.zzba().currentTimeMillis());
                zzicVar2.zzd().zzl.zzb(0L);
            } else {
                bundle2 = bundleZzH;
                j12 = 0;
            }
            if (bundle2.getLong("extend_session", j12) == 1) {
                zzicVar2.zzaW().zzk().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                zzicVar6.zzh().zza.zzb(j10, j11, true);
            }
            ArrayList arrayList2 = new ArrayList(bundle2.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                String str7 = (String) arrayList2.get(i11);
                if (str7 != null) {
                    zzicVar2.zzk();
                    Object obj2 = bundle2.get(str7);
                    if (obj2 instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj2};
                    } else if (obj2 instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj2;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj2 instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj2;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundle2.putParcelableArray(str7, bundleArr);
                    }
                }
            }
            boolean z14 = true;
            boolean z15 = false;
            int i12 = 0;
            while (i12 < arrayList.size()) {
                Bundle bundleZzae = (Bundle) arrayList.get(i12);
                String str8 = i12 != 0 ? "_ep" : str4;
                bundleZzae.putString(str5, str6);
                if (z11) {
                    obj = null;
                    bundleZzae = zzicVar2.zzk().zzae(bundleZzae, null);
                } else {
                    obj = null;
                }
                Bundle bundle3 = bundleZzae;
                String str9 = str5;
                zzic zzicVar8 = zzicVar5;
                boolean z16 = z15;
                ArrayList arrayList4 = arrayList;
                String str10 = str4;
                zzicVar8.zzt().zzn(new zzbh(str8, new zzbf(bundle3), str, j10, j11), str3);
                if (!z13) {
                    Iterator it = this.zze.iterator();
                    while (it.hasNext()) {
                        ((zzjq) it.next()).onEvent(str, str2, new Bundle(bundle3), j10);
                        bundle3 = bundle3;
                        str10 = str10;
                        z16 = z16;
                        z14 = z14;
                    }
                }
                i12++;
                str4 = str10;
                z14 = z14;
                arrayList = arrayList4;
                zzicVar5 = zzicVar8;
                str6 = str;
                z15 = z16;
                str5 = str9;
            }
            boolean z17 = z14;
            zzic zzicVar9 = zzicVar5;
            String str11 = str4;
            zzicVar2.zzaV();
            if (zzicVar9.zzs().zzh(z15) == null || !"_ae".equals(str11)) {
                return;
            }
            zzicVar9.zzh().zzb.zzd(z17, z17, zzicVar2.zzba().elapsedRealtime());
        }
    }

    public final void zzH(String str, String str2, Bundle bundle, String str3) {
        zzic.zzL();
        zzic zzicVar = this.zzu;
        zzI("auto", str2, zzicVar.zzba().currentTimeMillis(), zzicVar.zzc().zzp(null, zzfy.zzbe) ? zzicVar.zzba().elapsedRealtime() : 0L, bundle, false, true, true, str3);
    }

    protected final void zzI(String str, String str2, long j10, long j11, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        int i10 = zzpp.zza;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i11 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i11 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i11];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i11] = new Bundle((Bundle) parcelable);
                        }
                        i11++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i11 < list.size()) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                        i11++;
                    }
                }
            }
        }
        this.zzu.zzaX().zzj(new zzkc(this, str, str2, j10, j11, bundle2, z10, z11, z12, str3));
    }

    public final void zzJ(String str, String str2, Object obj, boolean z10) {
        zzK("auto", "_ldl", obj, true, this.zzu.zzba().currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    public final void zzK(String str, String str2, Object obj, boolean z10, long j10) {
        int i10;
        int iZzs;
        String str3;
        zzic zzicVar;
        int iZzM;
        Object objZzN;
        if (!z10) {
            zzpp zzppVarZzk = this.zzu.zzk();
            if (!zzppVarZzk.zzk("user property", str2)) {
                i10 = 6;
            } else if (zzppVarZzk.zzm("user property", zzjo.zza, null, str2)) {
                zzppVarZzk.zzu.zzc();
                if (zzppVarZzk.zzn("user property", 24, str2)) {
                    i10 = 0;
                } else {
                    i10 = 6;
                }
            } else {
                iZzs = 15;
            }
            if (i10 != 0) {
                zzic zzicVar2 = this.zzu;
                zzpp zzppVarZzk2 = zzicVar2.zzk();
                zzicVar2.zzc();
                this.zzu.zzk().zzP(this.zzt, null, i10, "_ev", zzppVarZzk2.zzE(str2, 24, true), str2 != null ? str2.length() : 0);
                return;
            }
            if (str == null) {
                str3 = "app";
            } else {
                str3 = str;
            }
            if (obj != null) {
                zzL(str3, str2, j10, null);
                return;
            }
            zzicVar = this.zzu;
            iZzM = zzicVar.zzk().zzM(str2, obj);
            if (iZzM != 0) {
                objZzN = zzicVar.zzk().zzN(str2, obj);
                if (objZzN != null) {
                    zzL(str3, str2, j10, objZzN);
                    return;
                }
                return;
            }
            zzpp zzppVarZzk3 = zzicVar.zzk();
            zzicVar.zzc();
            this.zzu.zzk().zzP(this.zzt, null, iZzM, "_ev", zzppVarZzk3.zzE(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
        }
        iZzs = this.zzu.zzk().zzs(str2);
        i10 = iZzs;
        if (i10 != 0) {
            zzic zzicVar3 = this.zzu;
            zzpp zzppVarZzk4 = zzicVar3.zzk();
            zzicVar3.zzc();
            if (str2 != null) {
            }
            this.zzu.zzk().zzP(this.zzt, null, i10, "_ev", zzppVarZzk4.zzE(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            zzL(str3, str2, j10, null);
            return;
        }
        zzicVar = this.zzu;
        iZzM = zzicVar.zzk().zzM(str2, obj);
        if (iZzM != 0) {
            objZzN = zzicVar.zzk().zzN(str2, obj);
            if (objZzN != null) {
                zzL(str3, str2, j10, objZzN);
                return;
            }
            return;
        }
        zzpp zzppVarZzk5 = zzicVar.zzk();
        zzicVar.zzc();
        if (obj instanceof String) {
        }
        this.zzu.zzk().zzP(this.zzt, null, iZzM, "_ev", zzppVarZzk5.zzE(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
    }

    final void zzL(String str, String str2, long j10, Object obj) {
        this.zzu.zzaX().zzj(new zzkd(this, str, str2, obj, j10));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    final void zzM(String str, String str2, Object obj, long j10) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzb();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j11 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    zzic zzicVar = this.zzu;
                    Long lValueOf = Long.valueOf(j11);
                    zzicVar.zzd().zzh.zzb(lValueOf.longValue() == 1 ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    this.zzu.zzd().zzh.zzb("unset");
                }
                str2 = "_npa";
            } else if (obj == null) {
                this.zzu.zzd().zzh.zzb("unset");
                str2 = "_npa";
            }
            this.zzu.zzaW().zzk().zzc("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        String str4 = str2;
        Object obj2 = obj;
        zzic zzicVar2 = this.zzu;
        if (!zzicVar2.zzB()) {
            this.zzu.zzaW().zzk().zza("User property not set since app measurement is disabled");
        } else if (zzicVar2.zzH()) {
            this.zzu.zzt().zzA(new zzpl(str4, j10, obj2, str));
        }
    }

    public final List zzN(boolean z10) {
        zzb();
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzk().zza("Getting user properties (FE)");
        if (zzicVar.zzaX().zze()) {
            zzicVar.zzaW().zzb().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        zzicVar.zzaV();
        if (zzae.zza()) {
            zzicVar.zzaW().zzb().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaX().zzk(atomicReference, 5000L, "get user properties", new zzkf(this, atomicReference, z10));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzicVar.zzaW().zzb().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z10));
        return Collections.emptyList();
    }

    public final Map zzO(String str, String str2, boolean z10) {
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaX().zze()) {
            zzicVar.zzaW().zzb().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        zzicVar.zzaV();
        if (zzae.zza()) {
            zzicVar.zzaW().zzb().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaX().zzk(atomicReference, 5000L, "get user properties", new zzkl(this, atomicReference, null, str, str2, z10));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            zzicVar.zzaW().zzb().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        androidx.collection.a aVar = new androidx.collection.a(list.size());
        for (zzpl zzplVar : list) {
            Object objZza = zzplVar.zza();
            if (objZza != null) {
                aVar.put(zzplVar.zzb, objZza);
            }
        }
        return aVar;
    }

    public final String zzP() {
        return (String) this.zzg.get();
    }

    final void zzQ(String str) {
        this.zzg.set(str);
    }

    public final void zzR() {
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzo.zza()) {
            zzicVar.zzaW().zzj().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jZza = zzicVar.zzd().zzp.zza();
        zzicVar.zzd().zzp.zzb(1 + jZza);
        zzicVar.zzc();
        if (jZza >= 5) {
            zzicVar.zzaW().zze().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzicVar.zzd().zzo.zzb(true);
        } else {
            if (this.zzq == null) {
                this.zzq = new zzkg(this, this.zzu);
            }
            this.zzq.zzb(0L);
        }
    }

    public final void zzS(long j10, long j11) {
        this.zzg.set(null);
        this.zzu.zzaX().zzj(new zzkh(this, j10));
    }

    public final void zzT() {
        zzg();
        zzb();
        if (this.zzu.zzH()) {
            zzic zzicVar = this.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            zzalVarZzc.zzu.zzaV();
            Boolean boolZzr = zzalVarZzc.zzr("google_analytics_deferred_deep_link_enabled");
            if (boolZzr != null && boolZzr.booleanValue()) {
                zzicVar.zzaW().zzj().zza("Deferred Deep Link feature enabled.");
                zzicVar.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlh
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzR();
                    }
                });
            }
            this.zzu.zzt().zzE();
            this.zzc = false;
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzhhVarZzd.zzg();
            String string = zzhhVarZzd.zzd().getString("previous_os_version", null);
            zzhhVarZzd.zzu.zzu().zzw();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            zzicVar.zzu().zzw();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzE("auto", "_ou", bundle);
        }
    }

    public final void zzU(zzjp zzjpVar) {
        zzjp zzjpVar2;
        zzg();
        zzb();
        if (zzjpVar != null && zzjpVar != (zzjpVar2 = this.zzd)) {
            Preconditions.checkState(zzjpVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzjpVar;
    }

    public final void zzV(zzjq zzjqVar) {
        zzb();
        Preconditions.checkNotNull(zzjqVar);
        if (this.zze.add(zzjqVar)) {
            return;
        }
        this.zzu.zzaW().zze().zza("OnEventListener already registered");
    }

    public final void zzW(zzjq zzjqVar) {
        zzb();
        Preconditions.checkNotNull(zzjqVar);
        if (this.zze.remove(zzjqVar)) {
            return;
        }
        this.zzu.zzaW().zze().zza("OnEventListener had not been registered");
    }

    public final int zzX(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzu.zzc();
        return 25;
    }

    public final void zzY(Bundle bundle) {
        zzZ(bundle, this.zzu.zzba().currentTimeMillis());
    }

    public final void zzZ(Bundle bundle, long j10) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzu.zzaW().zze().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzjh.zzb(bundle2, "app_id", String.class, null);
        zzjh.zzb(bundle2, "origin", String.class, null);
        zzjh.zzb(bundle2, "name", String.class, null);
        zzjh.zzb(bundle2, "value", Object.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        zzic zzicVar = this.zzu;
        if (zzicVar.zzk().zzs(string) != 0) {
            zzicVar.zzaW().zzb().zzb("Invalid conditional user property name", zzicVar.zzl().zzc(string));
            return;
        }
        if (zzicVar.zzk().zzM(string, obj) != 0) {
            zzicVar.zzaW().zzb().zzc("Invalid conditional user property value", zzicVar.zzl().zzc(string), obj);
            return;
        }
        Object objZzN = zzicVar.zzk().zzN(string, obj);
        if (objZzN == null) {
            zzicVar.zzaW().zzb().zzc("Unable to normalize conditional user property value", zzicVar.zzl().zzc(string), obj);
            return;
        }
        zzjh.zza(bundle2, objZzN);
        long j11 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            zzicVar.zzc();
            if (j11 > 15552000000L || j11 < 1) {
                zzicVar.zzaW().zzb().zzc("Invalid conditional user property timeout", zzicVar.zzl().zzc(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        zzicVar.zzc();
        if (j12 > 15552000000L || j12 < 1) {
            zzicVar.zzaW().zzb().zzc("Invalid conditional user property time to live", zzicVar.zzl().zzc(string), Long.valueOf(j12));
        } else {
            zzicVar.zzaX().zzj(new zzki(this, bundle2));
        }
    }

    public final void zzaa(String str, String str2, Bundle bundle) {
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzba().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzicVar.zzaX().zzj(new zzkj(this, bundle2));
    }

    public final ArrayList zzab(String str, String str2) {
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaX().zze()) {
            zzicVar.zzaW().zzb().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        zzicVar.zzaV();
        if (zzae.zza()) {
            zzicVar.zzaW().zzb().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaX().zzk(atomicReference, 5000L, "get conditional user properties", new zzkk(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzpp.zzav(list);
        }
        zzicVar.zzaW().zzb().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String zzac() {
        zzlu zzluVarZzl = this.zzu.zzs().zzl();
        if (zzluVarZzl != null) {
            return zzluVarZzl.zza;
        }
        return null;
    }

    public final String zzad() {
        zzlu zzluVarZzl = this.zzu.zzs().zzl();
        if (zzluVarZzl != null) {
            return zzluVarZzl.zzb;
        }
        return null;
    }

    public final String zzae() {
        try {
            return zzlt.zza(this.zzu.zzaZ(), "google_app_id", this.zzu.zzq());
        } catch (IllegalStateException e10) {
            this.zzu.zzaW().zzb().zzb("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    final /* synthetic */ void zzaf(SharedPreferences sharedPreferences, String str) {
        if (Objects.equals(str, Cookie.IABTCF_TC_STRING) || Objects.equals(str, Cookie.IABTCF_GDPR_APPLIES) || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            this.zzu.zzaW().zzk().zza("IABTCF_TCString change picked up in listener.");
            ((zzaz) Preconditions.checkNotNull(this.zzs)).zzb(500L);
        }
    }

    final /* synthetic */ void zzag(Bundle bundle) {
        int i10;
        if (!bundle.isEmpty()) {
            zzic zzicVar = this.zzu;
            Bundle bundle2 = new Bundle(zzicVar.zzd().zzt.zza());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (zzicVar.zzk().zzz(obj)) {
                        zzicVar.zzk().zzP(this.zzt, null, 27, null, null, 0);
                    }
                    zzicVar.zzaW().zzh().zzc("Invalid default event parameter type. Name, value", next, obj);
                } else if (zzpp.zzac(next)) {
                    zzicVar.zzaW().zzh().zzb("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (zzicVar.zzk().zzA("param", next, zzicVar.zzc().zze(null, false), obj)) {
                    zzicVar.zzk().zzO(bundle2, next, obj);
                }
            }
            zzicVar.zzk();
            int iZzc = zzicVar.zzc().zzc();
            if (bundle2.size() > iZzc) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i10++;
                    if (i10 > iZzc) {
                        bundle2.remove(str);
                    }
                }
                zzicVar.zzk().zzP(this.zzt, null, 26, null, null, 0);
                zzicVar.zzaW().zzh().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            bundle = bundle2;
        }
        this.zzu.zzd().zzt.zzb(bundle);
        this.zzu.zzt().zzH(bundle);
    }

    final /* synthetic */ void zzah(int i10) {
        if (this.zzk == null) {
            this.zzk = new zzjx(this, this.zzu);
        }
        this.zzk.zzb(((long) i10) * 1000);
    }

    final /* synthetic */ void zzai(Boolean bool, boolean z10) {
        zzaq(bool, true);
    }

    final /* synthetic */ void zzaj(zzjl zzjlVar, long j10, boolean z10, boolean z11) {
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        zzjl zzjlVarZzl = zzicVar.zzd().zzl();
        if (j10 <= this.zzp && zzjl.zzu(zzjlVarZzl.zzb(), zzjlVar.zzb())) {
            zzicVar.zzaW().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzjlVar);
            return;
        }
        zzhh zzhhVarZzd = zzicVar.zzd();
        zzic zzicVar2 = zzhhVarZzd.zzu;
        zzhhVarZzd.zzg();
        int iZzb = zzjlVar.zzb();
        if (!zzhhVarZzd.zzk(iZzb)) {
            zzicVar.zzaW().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzjlVar.zzb()));
            return;
        }
        zzic zzicVar3 = this.zzu;
        SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
        editorEdit.putString("consent_settings", zzjlVar.zzl());
        editorEdit.putInt("consent_source", iZzb);
        editorEdit.apply();
        zzicVar.zzaW().zzk().zzb("Setting storage consent(FE)", zzjlVar);
        this.zzp = j10;
        if (zzicVar3.zzt().zzP()) {
            zzicVar3.zzt().zzk(z10);
        } else {
            zzicVar3.zzt().zzj(z10);
        }
        if (z11) {
            zzicVar3.zzt().zzC(new AtomicReference());
        }
    }

    final /* synthetic */ void zzal(boolean z10) {
        this.zzi = false;
    }

    final /* synthetic */ int zzam() {
        return this.zzj;
    }

    final /* synthetic */ void zzan(int i10) {
        this.zzj = i10;
    }

    final /* synthetic */ zzaz zzao() {
        return this.zzq;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return false;
    }

    public final void zzh() {
        zzic zzicVar = this.zzu;
        if (!(zzicVar.zzaZ().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) zzicVar.zzaZ().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzu.zzaX().zzk(atomicReference, 15000L, "boolean test flag value", new zzke(this, atomicReference));
    }

    public final String zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzu.zzaX().zzk(atomicReference, 15000L, "String test flag value", new zzko(this, atomicReference));
    }

    public final Long zzk() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzu.zzaX().zzk(atomicReference, 15000L, "long test flag value", new zzkp(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzu.zzaX().zzk(atomicReference, 15000L, "int test flag value", new zzkq(this, atomicReference));
    }

    public final Double zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzu.zzaX().zzk(atomicReference, 15000L, "double test flag value", new zzkr(this, atomicReference));
    }

    public final void zzn(Boolean bool) {
        zzb();
        this.zzu.zzaX().zzj(new zzks(this, bool));
    }

    final void zzp(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        zzb();
        zzjl zzjlVar = zzjl.zza;
        zzjk[] zzjkVarArrZzb = zzjj.STORAGE.zzb();
        int length = zzjkVarArrZzb.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str = zzjkVarArrZzb[i11].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaW().zzh().zzb("Ignoring invalid consent setting", obj);
            zzicVar.zzaW().zzh().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean zZze = this.zzu.zzaX().zze();
        zzjl zzjlVarZze = zzjl.zze(bundle, i10);
        if (zzjlVarZze.zzc()) {
            zzs(zzjlVarZze, zZze);
        }
        zzba zzbaVarZzh = zzba.zzh(bundle, i10);
        if (zzbaVarZzh.zzd()) {
            zzq(zzbaVarZzh, zZze);
        }
        Boolean boolZzi = zzba.zzi(bundle);
        if (boolZzi != null) {
            String str2 = i10 == -30 ? "tcf" : "app";
            if (zZze) {
                zzM(str2, "allow_personalized_ads", boolZzi.toString(), j10);
            } else {
                zzK(str2, "allow_personalized_ads", boolZzi.toString(), false, j10);
            }
        }
    }

    final void zzq(zzba zzbaVar, boolean z10) {
        zzkt zzktVar = new zzkt(this, zzbaVar);
        if (!z10) {
            this.zzu.zzaX().zzj(zzktVar);
        } else {
            zzg();
            zzktVar.run();
        }
    }

    public final void zzs(zzjl zzjlVar, boolean z10) {
        boolean z11;
        zzjl zzjlVar2;
        boolean zZzr;
        boolean z12;
        zzb();
        int iZzb = zzjlVar.zzb();
        if (iZzb != -10) {
            zzji zzjiVarZzp = zzjlVar.zzp();
            zzji zzjiVar = zzji.UNINITIALIZED;
            if (zzjiVarZzp == zzjiVar && zzjlVar.zzq() == zzjiVar) {
                this.zzu.zzaW().zzh().zza("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.zzh) {
            z11 = false;
            if (zzjl.zzu(iZzb, this.zzn.zzb())) {
                zZzr = zzjlVar.zzr(this.zzn);
                zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                if (zzjlVar.zzo(zzjkVar) && !this.zzn.zzo(zzjkVar)) {
                    z11 = true;
                }
                zzjl zzjlVarZzt = zzjlVar.zzt(this.zzn);
                this.zzn = zzjlVarZzt;
                zzjlVar2 = zzjlVarZzt;
                z12 = z11;
                z11 = true;
            } else {
                zzjlVar2 = zzjlVar;
                zZzr = false;
                z12 = false;
            }
        }
        if (!z11) {
            this.zzu.zzaW().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzjlVar2);
            return;
        }
        long andIncrement = this.zzo.getAndIncrement();
        if (zZzr) {
            this.zzg.set(null);
            zzku zzkuVar = new zzku(this, zzjlVar2, andIncrement, z12);
            if (!z10) {
                this.zzu.zzaX().zzl(zzkuVar);
                return;
            } else {
                zzg();
                zzkuVar.run();
                return;
            }
        }
        zzkv zzkvVar = new zzkv(this, zzjlVar2, andIncrement, z12);
        if (z10) {
            zzg();
            zzkvVar.run();
        } else if (iZzb == 30 || iZzb == -10) {
            this.zzu.zzaX().zzl(zzkvVar);
        } else {
            this.zzu.zzaX().zzj(zzkvVar);
        }
    }

    final void zzt(Runnable runnable) {
        zzb();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaX().zze()) {
            zzicVar.zzaW().zzb().zza("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (zzicVar.zzaX().zzf()) {
            zzicVar.zzaW().zzb().zza("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        zzicVar.zzaV();
        if (zzae.zza()) {
            zzicVar.zzaW().zzb().zza("Cannot retrieve and upload batches from main thread");
            return;
        }
        zzicVar.zzaW().zzk().zza("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int size = 0;
        int i10 = 0;
        while (!z10) {
            zzicVar.zzaW().zzk().zza("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzicVar.zzaX().zzk(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzli
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu.zzt().zzx(atomicReference, zzoo.zza(zzls.SGTM_CLIENT));
                }
            });
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.zza;
            if (!list.isEmpty()) {
                zzicVar.zzaW().zzk().zzb("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                size += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    zzlr zzlrVarZzap = zzap((zzom) it.next());
                    if (zzlrVarZzap == zzlr.SUCCESS) {
                        i10++;
                    } else if (zzlrVarZzap == zzlr.BACKOFF) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        zzicVar.zzaW().zzk().zzc("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i10));
        runnable.run();
    }

    final void zzu(long j10) {
        zzg();
        if (this.zzl == null) {
            this.zzl = new zzju(this, this.zzu);
        }
        this.zzl.zzb(j10);
    }

    final void zzv() {
        zzg();
        zzaz zzazVar = this.zzl;
        if (zzazVar != null) {
            zzazVar.zzd();
        }
    }

    final void zzw() {
        zzaif.zza();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzp(null, zzfy.zzaP)) {
            if (zzicVar.zzaX().zze()) {
                zzicVar.zzaW().zzb().zza("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            zzicVar.zzaV();
            if (zzae.zza()) {
                zzicVar.zzaW().zzb().zza("Cannot get trigger URIs from main thread");
                return;
            }
            zzb();
            zzicVar.zzaW().zzk().zza("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzicVar.zzaX().zzk(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzla
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzlj zzljVar = this.zza;
                    zzljVar.zzu.zzt().zzw(atomicReference, zzljVar.zzu.zzd().zzi.zza());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzicVar.zzaW().zzd().zza("Timed out waiting for get trigger URIs");
            } else {
                zzicVar.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzlj zzljVar = this.zza;
                        zzljVar.zzg();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<zzoh> list2 = list;
                        SparseArray sparseArrayZzf = zzljVar.zzu.zzd().zzf();
                        for (zzoh zzohVar : list2) {
                            int i10 = zzohVar.zzc;
                            if (!sparseArrayZzf.contains(i10) || ((Long) sparseArrayZzf.get(i10)).longValue() < zzohVar.zzb) {
                                zzljVar.zzx().add(zzohVar);
                            }
                        }
                        zzljVar.zzy();
                    }
                });
            }
        }
    }

    final PriorityQueue zzx() {
        if (this.zzm == null) {
            this.zzm = new PriorityQueue(Comparator.comparing(zzlc.zza, zzld.zza));
        }
        return this.zzm;
    }

    final void zzy() {
        zzoh zzohVar;
        zzg();
        if (zzx().isEmpty() || this.zzi || (zzohVar = (zzoh) zzx().poll()) == null) {
            return;
        }
        zzic zzicVar = this.zzu;
        q0.a aVarZzV = zzicVar.zzk().zzV();
        if (aVarZzV != null) {
            this.zzi = true;
            zzgs zzgsVarZzk = zzicVar.zzaW().zzk();
            String str = zzohVar.zza;
            zzgsVarZzk.zzb("Registering trigger URI", str);
            ListenableFuture<g0> listenableFutureD = aVarZzV.d(Uri.parse(str));
            if (listenableFutureD != null) {
                x.a(listenableFutureD, new zzjw(this, zzohVar), new zzjv(this));
            } else {
                this.zzi = false;
                zzx().add(zzohVar);
            }
        }
    }

    final void zzz(zzjl zzjlVar) {
        zzg();
        boolean z10 = (zzjlVar.zzo(zzjk.ANALYTICS_STORAGE) && zzjlVar.zzo(zzjk.AD_STORAGE)) || this.zzu.zzt().zzO();
        zzic zzicVar = this.zzu;
        if (z10 != zzicVar.zzE()) {
            zzicVar.zzD(z10);
            zzhh zzhhVarZzd = this.zzu.zzd();
            zzic zzicVar2 = zzhhVarZzd.zzu;
            zzhhVarZzd.zzg();
            Boolean boolValueOf = zzhhVarZzd.zzd().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzhhVarZzd.zzd().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                zzaq(Boolean.valueOf(z10), false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzC() {
        zzod zzodVar;
        zzabx zzabxVar;
        zzg();
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzj().zza("Handle tcf update.");
        SharedPreferences sharedPreferencesZze = zzicVar.zzd().zze();
        int i10 = zzof.zzb;
        zzabw zzabwVar = zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        zzoe zzoeVar = zzoe.CONSENT;
        zzabw zzabwVar2 = zzabw.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
        zzoe zzoeVar2 = zzoe.FLEXIBLE_LEGITIMATE_INTEREST;
        v vVarX = v.x(zzabwVar, zzoeVar, zzabwVar2, zzoeVar2, zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, zzoeVar, zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, zzoeVar, zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, zzoeVar2, zzabw.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, zzoeVar2, zzabw.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, zzoeVar2);
        w wVarF = w.F("CH");
        char[] cArr = new char[5];
        boolean zContains = sharedPreferencesZze.contains(Cookie.IABTCF_TC_STRING);
        int iZzb = zzof.zzb(sharedPreferencesZze, "IABTCF_CmpSdkID");
        int iZzb2 = zzof.zzb(sharedPreferencesZze, "IABTCF_PolicyVersion");
        int iZzb3 = zzof.zzb(sharedPreferencesZze, Cookie.IABTCF_GDPR_APPLIES);
        int iZzb4 = zzof.zzb(sharedPreferencesZze, "IABTCF_PurposeOneTreatment");
        int iZzb5 = zzof.zzb(sharedPreferencesZze, "IABTCF_EnableAdvertiserConsentMode");
        String strZza = zzof.zza(sharedPreferencesZze, "IABTCF_PublisherCC");
        v.a aVarB = v.b();
        c1 it = vVarX.keySet().iterator();
        while (it.hasNext()) {
            zzabw zzabwVar3 = (zzabw) it.next();
            int iZza = zzabwVar3.zza();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 28);
            sb2.append("IABTCF_PublisherRestrictions");
            sb2.append(iZza);
            String strZza2 = zzof.zza(sharedPreferencesZze, sb2.toString());
            if (TextUtils.isEmpty(strZza2) || strZza2.length() < 755) {
                zzabxVar = zzabx.zzd;
            } else {
                int iDigit = Character.digit(strZza2.charAt(754), 10);
                if (iDigit < 0 || iDigit > zzabx.values().length || iDigit == 0) {
                    zzabxVar = zzabx.PURPOSE_RESTRICTION_NOT_ALLOWED;
                } else if (iDigit != 1) {
                    zzabxVar = iDigit != 2 ? zzabx.zzd : zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                } else {
                    zzabxVar = zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
            }
            aVarB.g(zzabwVar3, zzabxVar);
        }
        v vVarD = aVarB.d();
        String strZza3 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeConsents");
        String strZza4 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorConsents");
        boolean z10 = !TextUtils.isEmpty(strZza4) && strZza4.length() >= 755 && strZza4.charAt(754) == '1';
        String strZza5 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeLegitimateInterests");
        String strZza6 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorLegitimateInterests");
        boolean z11 = !TextUtils.isEmpty(strZza6) && strZza6.length() >= 755 && strZza6.charAt(754) == '1';
        cArr[0] = '2';
        zzod zzodVar2 = new zzod(zzof.zzd(vVarX, vVarD, wVarF, cArr, iZzb, iZzb5, iZzb3, iZzb2, iZzb4, strZza, strZza3, strZza5, z10, z11, zContains));
        zzicVar.zzaW().zzk().zzb("Tcf preferences read", zzodVar2);
        zzhh zzhhVarZzd = zzicVar.zzd();
        zzhhVarZzd.zzg();
        String string = zzhhVarZzd.zzd().getString("stored_tcf_param", "");
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(string)) {
            zzodVar = new zzod(map);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && zzof.zza.contains(strArrSplit[0])) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            zzodVar = new zzod(map);
        }
        zzhh zzhhVarZzd2 = zzicVar.zzd();
        zzhhVarZzd2.zzg();
        String string2 = zzhhVarZzd2.zzd().getString("stored_tcf_param", "");
        String strZza7 = zzodVar2.zza();
        if (strZza7.equals(string2)) {
            return;
        }
        SharedPreferences.Editor editorEdit = zzhhVarZzd2.zzd().edit();
        editorEdit.putString("stored_tcf_param", strZza7);
        editorEdit.apply();
        Bundle bundleZzb = zzodVar2.zzb();
        zzicVar.zzaW().zzk().zzb("Consent generated from Tcf", bundleZzb);
        if (bundleZzb != Bundle.EMPTY) {
            zzp(bundleZzb, -30, zzicVar.zzba().currentTimeMillis());
        }
        Bundle bundle = new Bundle();
        bundle.putString(UICvx.FLNYCWMWnbIbVYz, zzodVar2.zzd(zzodVar));
        bundle.putString("_tcfd2", zzodVar2.zzc());
        bundle.putString("_tcfd", zzodVar2.zze());
        zzE("auto", "_tcf", bundle);
    }
}
