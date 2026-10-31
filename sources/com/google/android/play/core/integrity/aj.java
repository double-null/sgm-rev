package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f11246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f11247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f11249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final at f11250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f11251f;

    aj(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) {
        this.f11248c = context.getPackageName();
        this.f11247b = sVar;
        this.f11250e = atVar;
        this.f11251f = kVar;
        this.f11249d = context;
        if (com.google.android.play.integrity.internal.ai.b(context)) {
            this.f11246a = new com.google.android.play.integrity.internal.ae(context, sVar, "IntegrityService", ak.f11252a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.ae
                @Override // com.google.android.play.integrity.internal.z
                public final Object a(IBinder iBinder) {
                    return com.google.android.play.integrity.internal.m.b(iBinder);
                }
            }, null);
        } else {
            sVar.b("Phonesky is not installed.", new Object[0]);
            this.f11246a = null;
        }
    }

    static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f11248c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        if (parcelable != null) {
            bundle.putParcelable("network", parcelable);
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    final Task b(Activity activity, Bundle bundle) {
        if (this.f11246a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i10 = bundle.getInt("dialog.intent.type");
        this.f11247b.d("requestAndShowDialog(%s, %s)", this.f11248c, Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f11246a.t(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f11246a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        if (com.google.android.play.integrity.internal.ai.a(this.f11249d) < 82380000) {
            return Tasks.forException(new IntegrityServiceException(-14, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f11247b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f11246a.t(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
