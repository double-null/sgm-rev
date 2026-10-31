package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: compiled from: FragmentHostCallback.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class k<E> extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f2644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f2645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f2646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final n f2648e;

    k(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.g
    public View c(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.g
    public boolean d() {
        return true;
    }

    Activity e() {
        return this.f2644a;
    }

    Context f() {
        return this.f2645b;
    }

    Handler g() {
        return this.f2646c;
    }

    public abstract E h();

    public LayoutInflater i() {
        return LayoutInflater.from(this.f2645b);
    }

    public boolean k(Fragment fragment) {
        return true;
    }

    public boolean l(String str) {
        return false;
    }

    public void m(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.j(this.f2645b, intent, bundle);
    }

    @Deprecated
    public void n(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.w(this.f2644a, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    k(Activity activity, Context context, Handler handler, int i10) {
        this.f2648e = new o();
        this.f2644a = activity;
        this.f2645b = (Context) w.h.d(context, "context == null");
        this.f2646c = (Handler) w.h.d(handler, "handler == null");
        this.f2647d = i10;
    }

    public void o() {
    }

    @Deprecated
    public void j(Fragment fragment, String[] strArr, int i10) {
    }
}
