package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import java.util.Locale;

/* JADX INFO: compiled from: CrashlyticsAnalyticsListener.java */
/* JADX INFO: loaded from: classes4.dex */
class e implements v2.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a3.a f12030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a3.a f12031b;

    e() {
    }

    private static void b(a3.a aVar, String str, Bundle bundle) {
        if (aVar == null) {
            return;
        }
        aVar.b(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f12030a : this.f12031b, str, bundle);
    }

    @Override // v2.a.b
    public void a(int i10, Bundle bundle) {
        String string;
        z2.f.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle(NativeProtocol.WEB_DIALOG_PARAMS);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(a3.a aVar) {
        this.f12031b = aVar;
    }

    public void e(a3.a aVar) {
        this.f12030a = aVar;
    }
}
