package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.b;
import c0.IbU.elEbP;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.GmsClientFlags;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public class GoogleApiManager implements Handler.Callback {
    private static GoogleApiManager zak;
    private TelemetryData zah;
    private TelemetryLoggingClient zai;
    private com.google.android.gms.common.internal.zag zaj;
    private final Context zam;
    private final GoogleApiAvailability zan;
    private final com.google.android.gms.common.internal.zav zao;
    private final Handler zax;
    private volatile boolean zay;
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
    static final Status zab = new Status(23, "API call is throttled.");
    private static final Status zac = new Status(4, "The user must be signed in to make this API call.");
    private static final Object zaf = new Object();
    private static final Object zag = new Object();
    private static volatile boolean zal = false;
    private long zad = 10000;
    private boolean zae = false;
    private final AtomicInteger zap = new AtomicInteger(1);
    private final AtomicInteger zaq = new AtomicInteger(0);
    private final Map zar = new ConcurrentHashMap(5, 0.75f, 1);
    private zaab zas = null;
    private final Set zat = new b();
    private final Set zau = new b();
    private final Set zav = Collections.newSetFromMap(new WeakHashMap());
    private final Set zaw = Collections.newSetFromMap(new WeakHashMap());

    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zay = true;
        this.zam = context;
        com.google.android.gms.internal.base.zas zasVar = new com.google.android.gms.internal.base.zas(looper, this);
        this.zax = zasVar;
        this.zan = googleApiAvailability;
        this.zao = new com.google.android.gms.common.internal.zav(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.zay = false;
        }
        zasVar.sendMessage(zasVar.obtainMessage(6));
    }

    public static void reportSignOut() {
        synchronized (zaf) {
            GoogleApiManager googleApiManager = zak;
            if (googleApiManager != null) {
                googleApiManager.zaq.incrementAndGet();
                Handler handler = googleApiManager.zax;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    private final zabk zaM(GoogleApi googleApi) {
        Map map = this.zar;
        ApiKey apiKey = googleApi.getApiKey();
        zabk zabkVar = (zabk) map.get(apiKey);
        if (zabkVar == null) {
            zabkVar = new zabk(this, googleApi);
            map.put(apiKey, zabkVar);
            this.zav.remove(apiKey);
            this.zaw.remove(apiKey);
        }
        if (zabkVar.zap()) {
            this.zau.add(apiKey);
        }
        zabkVar.zam();
        return zabkVar;
    }

    private final void zaN(TaskCompletionSource taskCompletionSource, int i10, GoogleApi googleApi) {
        zabx zabxVarZaa;
        if (i10 == 0 || (zabxVarZaa = zabx.zaa(this, i10, googleApi.getApiKey())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        final Handler handler = this.zax;
        Objects.requireNonNull(handler);
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.zabo
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, zabxVarZaa);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status zaO(ApiKey apiKey, ConnectionResult connectionResult) {
        String strZaa = apiKey.zaa();
        String strValueOf = String.valueOf(connectionResult);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZaa).length() + 63 + strValueOf.length());
        sb2.append("API: ");
        sb2.append(strZaa);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(strValueOf);
        return new Status(connectionResult, sb2.toString());
    }

    private final void zaP() {
        TelemetryData telemetryData = this.zah;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zam()) {
                zaQ().log(telemetryData);
            }
            this.zah = null;
        }
    }

    private final TelemetryLoggingClient zaQ() {
        if (this.zai == null) {
            this.zai = TelemetryLogging.getClient(this.zam);
        }
        return this.zai;
    }

    public static GoogleApiManager zaa(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (zaf) {
            if (zak == null) {
                Looper looper = GmsClientSupervisor.getOrStartHandlerThread().getLooper();
                boolean zIsBindServiceOptimizationEnabled = GmsClientFlags.isBindServiceOptimizationEnabled(context.getPackageName());
                zal = zIsBindServiceOptimizationEnabled;
                GoogleApiManager googleApiManager2 = new GoogleApiManager(context.getApplicationContext(), looper, GoogleApiAvailability.getInstance());
                if (zIsBindServiceOptimizationEnabled) {
                    GmsClient.zag(com.google.android.gms.common.internal.zas.zaa(googleApiManager2.zam));
                }
                zak = googleApiManager2;
            }
            googleApiManager = zak;
        }
        return googleApiManager;
    }

    public static GoogleApiManager zab() {
        GoogleApiManager googleApiManager;
        synchronized (zaf) {
            Preconditions.checkNotNull(zak, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zak;
        }
        return googleApiManager;
    }

    public static boolean zat() {
        return zal;
    }

    static /* synthetic */ Status zaw(ApiKey apiKey, Feature feature) {
        ConnectionResult connectionResult = new ConnectionResult(26);
        String strZaa = apiKey.zaa();
        String string = feature.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZaa).length() + 55 + string.length());
        sb2.append("API: ");
        sb2.append(strZaa);
        sb2.append(" is not available on this device. missing feature ");
        sb2.append(string);
        return new Status(connectionResult, sb2.toString());
    }

    final /* synthetic */ Context zaB() {
        return this.zam;
    }

    final /* synthetic */ GoogleApiAvailability zaC() {
        return this.zan;
    }

    final /* synthetic */ com.google.android.gms.common.internal.zav zaD() {
        return this.zao;
    }

    final /* synthetic */ Map zaE() {
        return this.zar;
    }

    final /* synthetic */ zaab zaF() {
        return this.zas;
    }

    final /* synthetic */ Set zaG() {
        return this.zat;
    }

    final /* synthetic */ Set zaH() {
        return this.zau;
    }

    final /* synthetic */ Set zaI() {
        return this.zav;
    }

    final /* synthetic */ Set zaJ() {
        return this.zaw;
    }

    final /* synthetic */ Handler zaK() {
        return this.zax;
    }

    final /* synthetic */ boolean zaL() {
        return this.zay;
    }

    public final int zac() {
        return this.zap.getAndIncrement();
    }

    public final void zad(GoogleApi googleApi) {
        Handler handler = this.zax;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    public final void zae(zaab zaabVar) {
        synchronized (zaf) {
            if (this.zas != zaabVar) {
                this.zas = zaabVar;
                this.zat.clear();
            }
            this.zat.addAll(zaabVar.zab());
        }
    }

    final void zaf(zaab zaabVar) {
        synchronized (zaf) {
            if (this.zas == zaabVar) {
                this.zas = null;
                this.zat.clear();
            }
        }
    }

    final zabk zag(ApiKey apiKey) {
        return (zabk) this.zar.get(apiKey);
    }

    public final Task zah(Iterable iterable) {
        zal zalVar = new zal(iterable);
        Handler handler = this.zax;
        handler.sendMessage(handler.obtainMessage(2, zalVar));
        return zalVar.zac();
    }

    public final void zai() {
        Handler handler = this.zax;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final Task zaj(GoogleApi googleApi) {
        zaac zaacVar = new zaac(googleApi.getApiKey());
        Handler handler = this.zax;
        handler.sendMessage(handler.obtainMessage(14, zaacVar));
        return zaacVar.zab().getTask();
    }

    public final void zak(GoogleApi googleApi, int i10, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zacb zacbVar = new zacb(new zae(i10, apiMethodImpl), this.zaq.get(), googleApi);
        Handler handler = this.zax;
        handler.sendMessage(handler.obtainMessage(4, zacbVar));
    }

    public final void zal(GoogleApi googleApi, int i10, TaskApiCall taskApiCall, TaskCompletionSource taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        zaN(taskCompletionSource, taskApiCall.zab(), googleApi);
        zacb zacbVar = new zacb(new zag(i10, taskApiCall, taskCompletionSource, statusExceptionMapper), this.zaq.get(), googleApi);
        Handler handler = this.zax;
        handler.sendMessage(handler.obtainMessage(4, zacbVar));
    }

    final boolean zam() {
        if (this.zae) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int iZab = this.zao.zab(this.zam, 203400000);
        return iZab == -1 || iZab == 0;
    }

    public final Task zan(GoogleApi googleApi, RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaN(taskCompletionSource, registerListenerMethod.zab(), googleApi);
        zacb zacbVar = new zacb(new zaf(new zacc(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource), this.zaq.get(), googleApi);
        Handler handler = this.zax;
        handler.sendMessage(handler.obtainMessage(8, zacbVar));
        return taskCompletionSource.getTask();
    }

    public final Task zao(GoogleApi googleApi, ListenerHolder.ListenerKey listenerKey, int i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaN(taskCompletionSource, i10, googleApi);
        zacb zacbVar = new zacb(new zah(listenerKey, taskCompletionSource), this.zaq.get(), googleApi);
        Handler handler = this.zax;
        handler.sendMessage(handler.obtainMessage(13, zacbVar));
        return taskCompletionSource.getTask();
    }

    public final Handler zap() {
        return this.zax;
    }

    final boolean zaq(ConnectionResult connectionResult, int i10) {
        GoogleApiAvailability googleApiAvailability = this.zan;
        if (googleApiAvailability.zaj(connectionResult.getErrorCode())) {
            return googleApiAvailability.zad(this.zam, connectionResult, i10);
        }
        Log.w("GoogleApiManager", "Not showing notification since connectionResult is not user-facing: ".concat(String.valueOf(connectionResult)));
        return false;
    }

    public final void zar(ConnectionResult connectionResult, int i10) {
        if (zaq(connectionResult, i10)) {
            return;
        }
        Handler handler = this.zax;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
    }

    final void zas(MethodInvocation methodInvocation, int i10, long j10, int i11) {
        zaby zabyVar = new zaby(methodInvocation, i10, j10, i11);
        Handler handler = this.zax;
        handler.sendMessage(handler.obtainMessage(18, zabyVar));
    }

    final /* synthetic */ boolean zau(ApiKey apiKey) {
        boolean z10;
        synchronized (zaf) {
            z10 = false;
            if (this.zas != null && this.zat.contains(apiKey)) {
                z10 = true;
            }
        }
        return z10;
    }

    final /* synthetic */ long zay() {
        return this.zad;
    }

    final /* synthetic */ void zaz(boolean z10) {
        this.zae = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:67:0x020d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0213  */
    /* JADX WARN: Code duplicated, block: B:70:0x0258  */
    /* JADX WARN: Code duplicated, block: B:71:0x0265  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        zabk zabkVar = null;
        switch (i10) {
            case 1:
                this.zad = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                Handler handler = this.zax;
                handler.removeMessages(12);
                Iterator it = this.zar.keySet().iterator();
                while (it.hasNext()) {
                    handler.sendMessageDelayed(handler.obtainMessage(12, (ApiKey) it.next()), this.zad);
                }
                return true;
            case 2:
                zal zalVar = (zal) message.obj;
                for (ApiKey apiKey : zalVar.zaa()) {
                    zabk zabkVarZaM = (zabk) this.zar.get(apiKey);
                    if (zabkVarZaM == null) {
                        if (this.zav.contains(apiKey) || this.zaw.contains(apiKey)) {
                            HasApiKey hasApiKeyZab = zalVar.zab(apiKey);
                            if (hasApiKeyZab instanceof GoogleApi) {
                                zabkVarZaM = zaM((GoogleApi) hasApiKeyZab);
                            }
                        }
                        if (zabkVarZaM == null) {
                            zalVar.zad(apiKey, new ConnectionResult(13), null);
                        }
                    }
                    if (zabkVarZaM.zao()) {
                        zalVar.zad(apiKey, ConnectionResult.RESULT_SUCCESS, zabkVarZaM.zaf().getEndpointPackageName());
                    } else {
                        ConnectionResult connectionResultZai = zabkVarZaM.zai();
                        if (connectionResultZai != null) {
                            zalVar.zad(apiKey, connectionResultZai, null);
                        } else {
                            zabkVarZaM.zan(zalVar);
                            zabkVarZaM.zam();
                        }
                    }
                }
                return true;
            case 3:
                for (zabk zabkVar2 : this.zar.values()) {
                    zabkVar2.zah();
                    zabkVar2.zam();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zacb zacbVar = (zacb) message.obj;
                Map map = this.zar;
                GoogleApi googleApi = zacbVar.zac;
                zabk zabkVarZaM2 = (zabk) map.get(googleApi.getApiKey());
                if (zabkVarZaM2 == null) {
                    zabkVarZaM2 = zaM(googleApi);
                }
                if (!zabkVarZaM2.zap() || this.zaq.get() == zacbVar.zab) {
                    zabkVarZaM2.zad(zacbVar.zaa);
                } else {
                    zacbVar.zaa.zad(zaa);
                    zabkVarZaM2.zae();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                for (zabk zabkVar3 : this.zar.values()) {
                    if (zabkVar3.zaq() == i11) {
                        zabkVar = zabkVar3;
                        if (zabkVar != null) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 65);
                            sb2.append("Could not find API instance ");
                            sb2.append(i11);
                            sb2.append(" while trying to fail enqueued calls.");
                            Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                        } else if (connectionResult.getErrorCode() == 13) {
                            String errorString = this.zan.getErrorString(connectionResult.getErrorCode());
                            String errorMessage = connectionResult.getErrorMessage();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(errorMessage).length());
                            sb3.append("Error resolution was canceled by the user, original error message: ");
                            sb3.append(errorString);
                            sb3.append(elEbP.lgoGndIh);
                            sb3.append(errorMessage);
                            zabkVar.zav(new Status(17, sb3.toString()));
                        } else {
                            zabkVar.zav(zaO(zabkVar.zaA(), connectionResult));
                        }
                        return true;
                    }
                }
                if (zabkVar != null) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 65);
                    sb4.append("Could not find API instance ");
                    sb4.append(i11);
                    sb4.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb4.toString(), new Exception());
                } else if (connectionResult.getErrorCode() == 13) {
                    String errorString2 = this.zan.getErrorString(connectionResult.getErrorCode());
                    String errorMessage2 = connectionResult.getErrorMessage();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(errorString2).length() + 69 + String.valueOf(errorMessage2).length());
                    sb5.append("Error resolution was canceled by the user, original error message: ");
                    sb5.append(errorString2);
                    sb5.append(elEbP.lgoGndIh);
                    sb5.append(errorMessage2);
                    zabkVar.zav(new Status(17, sb5.toString()));
                } else {
                    zabkVar.zav(zaO(zabkVar.zaA(), connectionResult));
                }
                return true;
            case 6:
                Context context = this.zam;
                if (context.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) context.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new zabf(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zad = 300000L;
                    }
                }
                return true;
            case 7:
                zaM((GoogleApi) message.obj);
                return true;
            case 9:
                Map map2 = this.zar;
                if (map2.containsKey(message.obj)) {
                    ((zabk) map2.get(message.obj)).zaj();
                }
                return true;
            case 10:
                Set set = this.zau;
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    zabk zabkVar4 = (zabk) this.zar.remove((ApiKey) it2.next());
                    if (zabkVar4 != null) {
                        zabkVar4.zae();
                    }
                }
                set.clear();
                this.zav.clear();
                return true;
            case 11:
                Map map3 = this.zar;
                if (map3.containsKey(message.obj)) {
                    ((zabk) map3.get(message.obj)).zak();
                }
                return true;
            case 12:
                Map map4 = this.zar;
                if (map4.containsKey(message.obj)) {
                    ((zabk) map4.get(message.obj)).zal();
                }
                return true;
            case 14:
                zaac zaacVar = (zaac) message.obj;
                ApiKey apiKeyZaa = zaacVar.zaa();
                Map map5 = this.zar;
                if (map5.containsKey(apiKeyZaa)) {
                    zaacVar.zab().setResult(Boolean.valueOf(((zabk) map5.get(apiKeyZaa)).zaw(false)));
                } else {
                    zaacVar.zab().setResult(Boolean.FALSE);
                }
                return true;
            case 15:
                zabl zablVar = (zabl) message.obj;
                Map map6 = this.zar;
                if (map6.containsKey(zablVar.zaa())) {
                    ((zabk) map6.get(zablVar.zaa())).zax(zablVar);
                }
                return true;
            case 16:
                zabl zablVar2 = (zabl) message.obj;
                Map map7 = this.zar;
                if (map7.containsKey(zablVar2.zaa())) {
                    ((zabk) map7.get(zablVar2.zaa())).zay(zablVar2);
                }
                return true;
            case 17:
                zaP();
                return true;
            case 18:
                zaby zabyVar = (zaby) message.obj;
                long j10 = zabyVar.zac;
                if (j10 == 0) {
                    zaQ().log(new TelemetryData(zabyVar.zab, Arrays.asList(zabyVar.zaa)));
                } else {
                    TelemetryData telemetryData = this.zah;
                    if (telemetryData != null) {
                        List listZab = telemetryData.zab();
                        if (telemetryData.zaa() != zabyVar.zab || (listZab != null && listZab.size() >= zabyVar.zad)) {
                            this.zax.removeMessages(17);
                            zaP();
                        } else {
                            this.zah.zac(zabyVar.zaa);
                        }
                    }
                    if (this.zah == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zabyVar.zaa);
                        this.zah = new TelemetryData(zabyVar.zab, arrayList);
                        Handler handler2 = this.zax;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), j10);
                    }
                }
                return true;
            case 19:
                this.zae = false;
                return true;
            case 20:
                return true;
            case 21:
                long j11 = ((zacp) message.obj).zab;
                com.google.android.gms.common.internal.zai zaiVar = new com.google.android.gms.common.internal.zai(Arrays.asList(null));
                Context context2 = this.zam;
                if (this.zaj == null) {
                    this.zaj = new com.google.android.gms.common.internal.service.zav(context2);
                }
                this.zaj.zaa(zaiVar);
                return true;
            default:
                StringBuilder sb6 = new StringBuilder(String.valueOf(i10).length() + 20);
                sb6.append("Unknown message id: ");
                sb6.append(i10);
                Log.w("GoogleApiManager", sb6.toString());
                return false;
        }
    }
}
