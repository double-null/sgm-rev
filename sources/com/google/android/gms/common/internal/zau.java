package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zau implements Handler.Callback {
    private final zat zab;
    private final Handler zah;
    private final ArrayList zac = new ArrayList();
    final ArrayList zaa = new ArrayList();
    private final ArrayList zad = new ArrayList();
    private volatile boolean zae = false;
    private final AtomicInteger zaf = new AtomicInteger(0);
    private boolean zag = false;
    private final Object zai = new Object();

    public zau(Looper looper, zat zatVar) {
        this.zab = zatVar;
        this.zah = new com.google.android.gms.internal.base.zas(looper, this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 34);
            sb2.append("Don't know how to handle message: ");
            sb2.append(i10);
            Log.wtf("GmsClientEvents", sb2.toString(), new Exception());
            return false;
        }
        GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
        synchronized (this.zai) {
            if (this.zae && this.zab.isConnected() && this.zac.contains(connectionCallbacks)) {
                connectionCallbacks.onConnected(null);
            }
        }
        return true;
    }

    public final void zaa() {
        this.zae = false;
        this.zaf.incrementAndGet();
    }

    public final void zab() {
        this.zae = true;
    }

    public final void zac(Bundle bundle) {
        Handler handler = this.zah;
        Preconditions.checkHandlerThread(handler, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.zai) {
            Preconditions.checkState(!this.zag);
            handler.removeMessages(1);
            this.zag = true;
            ArrayList arrayList = this.zaa;
            Preconditions.checkState(arrayList.isEmpty());
            ArrayList<GoogleApiClient.ConnectionCallbacks> arrayList2 = new ArrayList(this.zac);
            AtomicInteger atomicInteger = this.zaf;
            int i10 = atomicInteger.get();
            for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList2) {
                if (!this.zae || !this.zab.isConnected() || atomicInteger.get() != i10) {
                    break;
                    break;
                    break;
                } else if (!arrayList.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(bundle);
                }
            }
            arrayList.clear();
            this.zag = false;
        }
    }

    public final void zad(int i10) {
        Handler handler = this.zah;
        Preconditions.checkHandlerThread(handler, "onUnintentionalDisconnection must only be called on the Handler thread");
        handler.removeMessages(1);
        synchronized (this.zai) {
            this.zag = true;
            ArrayList arrayList = this.zac;
            ArrayList<GoogleApiClient.ConnectionCallbacks> arrayList2 = new ArrayList(arrayList);
            AtomicInteger atomicInteger = this.zaf;
            int i11 = atomicInteger.get();
            for (GoogleApiClient.ConnectionCallbacks connectionCallbacks : arrayList2) {
                if (!this.zae || atomicInteger.get() != i11) {
                    break;
                } else if (arrayList.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnectionSuspended(i10);
                }
            }
            this.zaa.clear();
            this.zag = false;
        }
    }

    public final void zae(ConnectionResult connectionResult) {
        Handler handler = this.zah;
        Preconditions.checkHandlerThread(handler, "onConnectionFailure must only be called on the Handler thread");
        handler.removeMessages(1);
        synchronized (this.zai) {
            ArrayList arrayList = this.zad;
            ArrayList<GoogleApiClient.OnConnectionFailedListener> arrayList2 = new ArrayList(arrayList);
            AtomicInteger atomicInteger = this.zaf;
            int i10 = atomicInteger.get();
            for (GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener : arrayList2) {
                if (this.zae && atomicInteger.get() == i10) {
                    if (arrayList.contains(onConnectionFailedListener)) {
                        onConnectionFailedListener.onConnectionFailed(connectionResult);
                    }
                }
                return;
            }
        }
    }

    public final void zaf(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            ArrayList arrayList = this.zac;
            if (arrayList.contains(connectionCallbacks)) {
                String strValueOf = String.valueOf(connectionCallbacks);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 62);
                sb2.append("registerConnectionCallbacks(): listener ");
                sb2.append(strValueOf);
                sb2.append(" is already registered");
                Log.w("GmsClientEvents", sb2.toString());
            } else {
                arrayList.add(connectionCallbacks);
            }
        }
        if (this.zab.isConnected()) {
            Handler handler = this.zah;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final boolean zag(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        boolean zContains;
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            zContains = this.zac.contains(connectionCallbacks);
        }
        return zContains;
    }

    public final void zah(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.checkNotNull(connectionCallbacks);
        synchronized (this.zai) {
            if (!this.zac.remove(connectionCallbacks)) {
                String strValueOf = String.valueOf(connectionCallbacks);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 52);
                sb2.append("unregisterConnectionCallbacks(): listener ");
                sb2.append(strValueOf);
                sb2.append(" not found");
                Log.w("GmsClientEvents", sb2.toString());
            } else if (this.zag) {
                this.zaa.add(connectionCallbacks);
            }
        }
    }

    public final void zai(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            ArrayList arrayList = this.zad;
            if (arrayList.contains(onConnectionFailedListener)) {
                String strValueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 67);
                sb2.append("registerConnectionFailedListener(): listener ");
                sb2.append(strValueOf);
                sb2.append(" is already registered");
                Log.w("GmsClientEvents", sb2.toString());
            } else {
                arrayList.add(onConnectionFailedListener);
            }
        }
    }

    public final boolean zaj(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        boolean zContains;
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            zContains = this.zad.contains(onConnectionFailedListener);
        }
        return zContains;
    }

    public final void zak(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(onConnectionFailedListener);
        synchronized (this.zai) {
            if (!this.zad.remove(onConnectionFailedListener)) {
                String strValueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 57);
                sb2.append("unregisterConnectionFailedListener(): listener ");
                sb2.append(strValueOf);
                sb2.append(" not found");
                Log.w("GmsClientEvents", sb2.toString());
            }
        }
    }
}
