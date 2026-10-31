package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.e;
import com.google.ads.mediation.ZRT.wHzciBnJlYkdX;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zaaz extends GoogleApiClient implements zabt {
    zabr zab;
    final Map zac;
    Set zad;
    final ClientSettings zae;
    final Map zaf;
    final Api.AbstractClientBuilder zag;
    Set zah;
    final zacu zai;
    private final Lock zaj;
    private final com.google.android.gms.common.internal.zau zak;
    private final int zam;
    private final Context zan;
    private final Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final zaax zas;
    private final GoogleApiAvailability zat;
    private final ListenerHolders zau;
    private final ArrayList zav;
    private Integer zaw;
    private final com.google.android.gms.common.internal.zat zax;
    private zabu zal = null;
    final Queue zaa = new LinkedList();

    public zaaz(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder abstractClientBuilder, Map map, List list, List list2, Map map2, int i10, int i11, ArrayList arrayList) {
        this.zaq = true != ClientLibraryUtils.isPackageSide() ? 120000L : 10000L;
        this.zar = 5000L;
        this.zad = new HashSet();
        this.zau = new ListenerHolders();
        this.zaw = null;
        this.zah = null;
        zaat zaatVar = new zaat(this);
        this.zax = zaatVar;
        this.zan = context;
        this.zaj = lock;
        this.zak = new com.google.android.gms.common.internal.zau(looper, zaatVar);
        this.zao = looper;
        this.zas = new zaax(this, looper);
        this.zat = googleApiAvailability;
        this.zam = i10;
        if (i10 >= 0) {
            this.zaw = Integer.valueOf(i11);
        }
        this.zaf = map;
        this.zac = map2;
        this.zav = arrayList;
        this.zai = new zacu();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.zak.zaf((GoogleApiClient.ConnectionCallbacks) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.zak.zai((GoogleApiClient.OnConnectionFailedListener) it2.next());
        }
        this.zae = clientSettings;
        this.zag = abstractClientBuilder;
    }

    public static int zaf(Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        while (it.hasNext()) {
            Api.Client client = (Api.Client) it.next();
            zRequiresSignIn |= client.requiresSignIn();
            zProvidesSignIn |= client.providesSignIn();
        }
        if (zRequiresSignIn) {
            return (zProvidesSignIn && z10) ? 2 : 1;
        }
        return 3;
    }

    static String zag(int i10) {
        if (i10 == 1) {
            return "SIGN_IN_MODE_REQUIRED";
        }
        if (i10 != 2) {
            return i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE";
        }
        return "SIGN_IN_MODE_OPTIONAL";
    }

    private final void zal(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z10) {
        Common.zaa.zaa(googleApiClient).setResultCallback(new zaaw(this, statusPendingResult, z10, googleApiClient));
    }

    private final void zam(int i10) {
        Integer num = this.zaw;
        if (num == null) {
            this.zaw = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            String strZag = zag(this.zaw.intValue());
            String strZag2 = zag(i10);
            StringBuilder sb2 = new StringBuilder(strZag2.length() + 51 + strZag.length());
            sb2.append("Cannot use sign-in mode: ");
            sb2.append(strZag2);
            sb2.append(". Mode was already set to ");
            sb2.append(strZag);
            throw new IllegalStateException(sb2.toString());
        }
        if (this.zal != null) {
            return;
        }
        Map map = this.zac;
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        for (Api.Client client : map.values()) {
            zRequiresSignIn |= client.requiresSignIn();
            zProvidesSignIn |= client.providesSignIn();
        }
        int iIntValue = this.zaw.intValue();
        if (iIntValue == 1) {
            if (!zRequiresSignIn) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (zProvidesSignIn) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (iIntValue == 2 && zRequiresSignIn) {
            this.zal = zax.zaa(this.zan, this, this.zaj, this.zao, this.zat, map, this.zae, this.zaf, this.zag, this.zav);
            return;
        }
        this.zal = new zabd(this.zan, this, this.zaj, this.zao, this.zat, map, this.zae, this.zaf, this.zag, this.zav, this);
    }

    private final void zan() {
        this.zak.zab();
        ((zabu) Preconditions.checkNotNull(this.zal)).zae();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect() {
        boolean z10 = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.zaj.lock();
        try {
            if (this.zam >= 0) {
                if (this.zaw == null) {
                    z10 = false;
                }
                Preconditions.checkState(z10, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException(wHzciBnJlYkdX.eFAN);
                }
            }
            zam(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            ConnectionResult connectionResultZaf = ((zabu) Preconditions.checkNotNull(this.zal)).zaf();
            this.zaj.unlock();
            return connectionResultZaf;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.zaw;
        boolean z10 = true;
        if (num != null && num.intValue() == 2) {
            z10 = false;
        }
        Preconditions.checkState(z10, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.zac.containsKey(Common.CLIENT_KEY)) {
            zal(this, statusPendingResult, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            zaau zaauVar = new zaau(this, atomicReference, statusPendingResult);
            zaav zaavVar = new zaav(this, statusPendingResult);
            GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.zan);
            builder.addApi(Common.API);
            builder.addConnectionCallbacks(zaauVar);
            builder.addOnConnectionFailedListener(zaavVar);
            builder.setHandler(this.zas);
            GoogleApiClient googleApiClientBuild = builder.build();
            atomicReference.set(googleApiClientBuild);
            googleApiClientBuild.connect();
        }
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        Lock lock = this.zaj;
        lock.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.zam >= 0) {
                Preconditions.checkState(this.zaw != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int iIntValue = ((Integer) Preconditions.checkNotNull(this.zaw)).intValue();
            lock.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i10 = iIntValue;
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 22);
                    sb2.append("Illegal sign-in mode: ");
                    sb2.append(i10);
                    Preconditions.checkArgument(z10, sb2.toString());
                    zam(i10);
                    zan();
                    this.zaj.unlock();
                    return;
                }
                i10 = iIntValue;
                StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 22);
                sb3.append("Illegal sign-in mode: ");
                sb3.append(i10);
                Preconditions.checkArgument(z10, sb3.toString());
                zam(i10);
                zan();
                this.zaj.unlock();
                return;
            } finally {
                this.zaj.unlock();
            }
            z10 = true;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        this.zaj.lock();
        try {
            this.zai.zab();
            zabu zabuVar = this.zal;
            if (zabuVar != null) {
                zabuVar.zah();
            }
            this.zau.zab();
            Queue<BaseImplementation.ApiMethodImpl> queue = this.zaa;
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : queue) {
                apiMethodImpl.zan(null);
                apiMethodImpl.cancel();
            }
            queue.clear();
            if (this.zal != null) {
                zad();
                this.zak.zaa();
            }
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.zan);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.zap);
        printWriter.append(" mWorkQueue.size()=").print(this.zaa.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zai.zab.size());
        zabu zabuVar = this.zal;
        if (zabuVar != null) {
            zabuVar.zan(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t10) {
        Api<?> api = t10.getApi();
        boolean zContainsKey = this.zac.containsKey(t10.getClientKey());
        String strZad = api != null ? api.zad() : "the API";
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZad).length() + 65);
        sb2.append("GoogleApiClient is not configured to use ");
        sb2.append(strZad);
        sb2.append(" required for this call.");
        Preconditions.checkArgument(zContainsKey, sb2.toString());
        this.zaj.lock();
        try {
            zabu zabuVar = this.zal;
            if (zabuVar == null) {
                this.zaa.add(t10);
            } else {
                t10 = (T) zabuVar.zab(t10);
            }
            return t10;
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t10) {
        Map map = this.zac;
        Api<?> api = t10.getApi();
        boolean zContainsKey = map.containsKey(t10.getClientKey());
        String strZad = api != null ? api.zad() : "the API";
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZad).length() + 65);
        sb2.append("GoogleApiClient is not configured to use ");
        sb2.append(strZad);
        sb2.append(" required for this call.");
        Preconditions.checkArgument(zContainsKey, sb2.toString());
        Lock lock = this.zaj;
        lock.lock();
        try {
            zabu zabuVar = this.zal;
            if (zabuVar == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (!this.zap) {
                T t11 = (T) zabuVar.zac(t10);
                this.zaj.unlock();
                return t11;
            }
            Queue queue = this.zaa;
            queue.add(t10);
            while (!queue.isEmpty()) {
                BaseImplementation.ApiMethodImpl apiMethodImpl = (BaseImplementation.ApiMethodImpl) queue.remove();
                this.zai.zaa(apiMethodImpl);
                apiMethodImpl.setFailedResult(Status.RESULT_INTERNAL_ERROR);
            }
            lock.unlock();
            return t10;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <C extends Api.Client> C getClient(Api.AnyClientKey<C> anyClientKey) {
        C c10 = (C) this.zac.get(anyClientKey);
        Preconditions.checkNotNull(c10, "Appropriate Api was not requested.");
        return c10;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult getConnectionResult(Api<?> api) {
        ConnectionResult connectionResult;
        Lock lock = this.zaj;
        lock.lock();
        try {
            if (!isConnected() && !this.zap) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.zac.containsKey(api.zac())) {
                String strZad = api.zad();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strZad).length() + 42);
                sb2.append(strZad);
                sb2.append(" was never registered with GoogleApiClient");
                throw new IllegalArgumentException(sb2.toString());
            }
            ConnectionResult connectionResultZad = ((zabu) Preconditions.checkNotNull(this.zal)).zad(api);
            if (connectionResultZad != null) {
                lock.unlock();
                return connectionResultZad;
            }
            if (this.zap) {
                connectionResult = ConnectionResult.RESULT_SUCCESS;
            } else {
                Log.w("GoogleApiClientImpl", zae());
                String strZad2 = api.zad();
                StringBuilder sb3 = new StringBuilder(String.valueOf(strZad2).length() + 100);
                sb3.append(strZad2);
                sb3.append(" requested in getConnectionResult is not connected but is not present in the failed  connections map");
                Log.wtf("GoogleApiClientImpl", sb3.toString(), new Exception());
                connectionResult = new ConnectionResult(8, null);
            }
            lock.unlock();
            return connectionResult;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.zan;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.zao;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(Api<?> api) {
        return this.zac.containsKey(api.zac());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(Api<?> api) {
        Api.Client client;
        return isConnected() && (client = (Api.Client) this.zac.get(api.zac())) != null && client.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        zabu zabuVar = this.zal;
        return zabuVar != null && zabuVar.zai();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        zabu zabuVar = this.zal;
        return zabuVar != null && zabuVar.zaj();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zak.zag(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zak.zaj(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        zabu zabuVar = this.zal;
        return zabuVar != null && zabuVar.zak(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        zabu zabuVar = this.zal;
        if (zabuVar != null) {
            zabuVar.zam();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zaf(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zai(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> ListenerHolder<L> registerListener(L l10) {
        this.zaj.lock();
        try {
            return this.zau.zaa(l10, this.zao, "NO_TYPE");
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(e eVar) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) eVar);
        int i10 = this.zam;
        if (i10 < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        zak.zaa(lifecycleActivity).zac(i10);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zah(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zak(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zaa(Bundle bundle) {
        while (true) {
            Queue queue = this.zaa;
            if (queue.isEmpty()) {
                this.zak.zac(bundle);
                return;
            }
            execute((BaseImplementation.ApiMethodImpl) queue.remove());
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zab(ConnectionResult connectionResult) {
        if (!this.zat.isPlayServicesPossiblyUpdating(this.zan, connectionResult.getErrorCode())) {
            zad();
        }
        if (this.zap) {
            return;
        }
        com.google.android.gms.common.internal.zau zauVar = this.zak;
        zauVar.zae(connectionResult);
        zauVar.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.zabt
    public final void zac(int i10, boolean z10) {
        if (i10 == 1) {
            if (!z10 && !this.zap) {
                this.zap = true;
                if (this.zab == null && !ClientLibraryUtils.isPackageSide()) {
                    try {
                        this.zab = this.zat.zag(this.zan.getApplicationContext(), new zaay(this));
                    } catch (SecurityException unused) {
                    }
                }
                zaax zaaxVar = this.zas;
                zaaxVar.sendMessageDelayed(zaaxVar.obtainMessage(1), this.zaq);
                zaaxVar.sendMessageDelayed(zaaxVar.obtainMessage(2), this.zar);
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.zai.zab.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(zacu.zaa);
        }
        com.google.android.gms.common.internal.zau zauVar = this.zak;
        zauVar.zad(i10);
        zauVar.zaa();
        if (i10 == 2) {
            zan();
        }
    }

    final boolean zad() {
        if (!this.zap) {
            return false;
        }
        this.zap = false;
        zaax zaaxVar = this.zas;
        zaaxVar.removeMessages(2);
        zaaxVar.removeMessages(1);
        zabr zabrVar = this.zab;
        if (zabrVar != null) {
            zabrVar.zab();
            this.zab = null;
        }
        return true;
    }

    final String zae() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    final /* synthetic */ void zah(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z10) {
        zal(googleApiClient, statusPendingResult, true);
    }

    final /* synthetic */ void zai() {
        this.zaj.lock();
        try {
            if (this.zap) {
                zan();
            }
        } finally {
            this.zaj.unlock();
        }
    }

    final /* synthetic */ void zaj() {
        this.zaj.lock();
        try {
            if (zad()) {
                zan();
            }
        } finally {
            this.zaj.unlock();
        }
    }

    final /* synthetic */ Context zak() {
        return this.zan;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(zacs zacsVar) {
        this.zaj.lock();
        try {
            if (this.zah == null) {
                this.zah = new HashSet();
            }
            this.zah.add(zacsVar);
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(zacs zacsVar) {
        Lock lock = this.zaj;
        lock.lock();
        try {
            Set set = this.zah;
            if (set == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (set.remove(zacsVar)) {
                lock.lock();
                try {
                    Set set2 = this.zah;
                    if (set2 == null) {
                        lock.unlock();
                    } else {
                        boolean z10 = !set2.isEmpty();
                        this.zaj.unlock();
                        if (!z10) {
                        }
                    }
                    zabu zabuVar = this.zal;
                    if (zabuVar != null) {
                        zabuVar.zal();
                    }
                } finally {
                    this.zaj.unlock();
                }
            } else {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            }
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long j10, TimeUnit timeUnit) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.zaj.lock();
        try {
            Integer num = this.zaw;
            if (num == null) {
                this.zaw = Integer.valueOf(zaf(this.zac.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zam(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            ConnectionResult connectionResultZag = ((zabu) Preconditions.checkNotNull(this.zal)).zag(j10, timeUnit);
            this.zaj.unlock();
            return connectionResultZag;
        } catch (Throwable th) {
            this.zaj.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i10) {
        this.zaj.lock();
        boolean z10 = true;
        if (i10 != 3 && i10 != 1) {
            if (i10 == 2) {
                i10 = 2;
            } else {
                z10 = false;
            }
        }
        try {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 22);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i10);
            Preconditions.checkArgument(z10, sb2.toString());
            zam(i10);
            zan();
        } finally {
            this.zaj.unlock();
        }
    }
}
