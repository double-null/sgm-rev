package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import sc.NfwM.XDucgbzInpQa;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class zak extends zap {
    private final SparseArray zad;

    public static zak zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(lifecycleActivity);
        zak zakVar = (zak) fragment.getCallbackOrNull("AutoManageHelper", zak.class);
        return zakVar != null ? zakVar : new zak(fragment);
    }

    private final zaj zai(int i10) {
        SparseArray sparseArray = this.zad;
        if (sparseArray.size() <= i10) {
            return null;
        }
        return (zaj) sparseArray.get(sparseArray.keyAt(i10));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i10 = 0; i10 < this.zad.size(); i10++) {
            zaj zajVarZai = zai(i10);
            if (zajVarZai != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(zajVarZai.zaa);
                printWriter.println(":");
                zajVarZai.zab.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        SparseArray sparseArray = this.zad;
        boolean z10 = this.zaa;
        String strValueOf = String.valueOf(sparseArray);
        StringBuilder sb2 = new StringBuilder(String.valueOf(z10).length() + 9 + strValueOf.length());
        sb2.append("onStart ");
        sb2.append(z10);
        sb2.append(" ");
        sb2.append(strValueOf);
        Log.d("AutoManageHelper", sb2.toString());
        if (this.zab.get() == null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                zaj zajVarZai = zai(i10);
                if (zajVarZai != null) {
                    zajVarZai.zab.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i10 = 0; i10 < this.zad.size(); i10++) {
            zaj zajVarZai = zai(i10);
            if (zajVarZai != null) {
                zajVarZai.zab.disconnect();
            }
        }
    }

    public final void zab(int i10, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        SparseArray sparseArray = this.zad;
        int iIndexOfKey = sparseArray.indexOfKey(i10);
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 43);
        sb2.append("Already managing a GoogleApiClient with id ");
        sb2.append(i10);
        Preconditions.checkState(iIndexOfKey < 0, sb2.toString());
        zam zamVar = (zam) this.zab.get();
        boolean z10 = this.zaa;
        String strValueOf = String.valueOf(zamVar);
        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 32 + String.valueOf(z10).length() + 1 + strValueOf.length());
        sb3.append("starting AutoManage for client ");
        sb3.append(i10);
        sb3.append(" ");
        sb3.append(z10);
        sb3.append(" ");
        sb3.append(strValueOf);
        Log.d("AutoManageHelper", sb3.toString());
        zaj zajVar = new zaj(this, i10, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(zajVar);
        sparseArray.put(i10, zajVar);
        if (this.zaa && zamVar == null) {
            Log.d("AutoManageHelper", "connecting ".concat(googleApiClient.toString()));
            googleApiClient.connect();
        }
    }

    public final void zac(int i10) {
        SparseArray sparseArray = this.zad;
        zaj zajVar = (zaj) sparseArray.get(i10);
        sparseArray.remove(i10);
        if (zajVar != null) {
            GoogleApiClient googleApiClient = zajVar.zab;
            googleApiClient.unregisterConnectionFailedListener(zajVar);
            googleApiClient.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zad(ConnectionResult connectionResult, int i10) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        zaj zajVar = (zaj) this.zad.get(i10);
        if (zajVar != null) {
            zac(i10);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zajVar.zac;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zae() {
        for (int i10 = 0; i10 < this.zad.size(); i10++) {
            zaj zajVarZai = zai(i10);
            if (zajVarZai != null) {
                zajVarZai.zab.connect();
            }
        }
    }

    private zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.zad = new SparseArray();
        this.mLifecycleFragment.addCallback(XDucgbzInpQa.cNh, this);
    }
}
