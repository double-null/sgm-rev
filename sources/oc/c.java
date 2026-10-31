package oc;

import kotlin.jvm.internal.t;
import wb.u;

/* JADX INFO: compiled from: ClickPostMethod.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements u<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vb.c f23356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g7.i f23357b;

    public c(vb.c callback, g7.i iabClickCallback) {
        t.f(callback, "callback");
        t.f(iabClickCallback, "iabClickCallback");
        this.f23356a = callback;
        this.f23357b = iabClickCallback;
    }

    @Override // wb.u
    public /* bridge */ /* synthetic */ void a(Boolean bool) {
        c(bool.booleanValue());
    }

    public void c(boolean z10) {
        if (z10) {
            this.f23357b.b();
            this.f23356a.onAdClicked();
        }
        this.f23357b.c();
    }
}
