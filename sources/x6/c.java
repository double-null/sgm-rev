package x6;

import h7.g;
import h7.h;
import kotlin.jvm.internal.t;
import vb.i;

/* JADX INFO: compiled from: VastFullScreenAdLoadListener.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f28078a;

    public c(i callback) {
        t.f(callback, "callback");
        this.f28078a = callback;
    }

    @Override // h7.h
    public void a(g vastRequest) {
        t.f(vastRequest, "vastRequest");
        this.f28078a.onAdLoaded();
    }

    @Override // h7.h
    public void b(g vastRequest, c7.b iabError) {
        t.f(vastRequest, "vastRequest");
        t.f(iabError, "iabError");
        if (iabError.c() == 6) {
            this.f28078a.a();
        } else {
            this.f28078a.c(oc.g.a(iabError));
        }
    }
}
