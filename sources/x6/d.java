package x6;

import h7.g;
import io.bidmachine.iab.vast.activity.VastActivity;
import kotlin.jvm.internal.t;
import qb.j;
import vb.i;

/* JADX INFO: compiled from: VastFullScreenAdShowListener.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements h7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f28079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t7.d f28080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t7.a f28081c;

    public d(i callback, t7.d dVar, t7.a aVar) {
        t.f(callback, "callback");
        this.f28079a = callback;
        this.f28080b = dVar;
        this.f28081c = aVar;
    }

    @Override // h7.b
    public void a(g gVar, c7.b iabError) {
        t.f(iabError, "iabError");
        this.f28079a.b(oc.g.a(iabError));
    }

    @Override // h7.b
    public void b(VastActivity vastActivity, g vastRequest) {
        t.f(vastActivity, "vastActivity");
        t.f(vastRequest, "vastRequest");
        this.f28079a.j();
    }

    @Override // h7.b
    public void c(VastActivity vastActivity, g vastRequest, g7.i iabClickCallback, String url) {
        t.f(vastActivity, "vastActivity");
        t.f(vastRequest, "vastRequest");
        t.f(iabClickCallback, "iabClickCallback");
        t.f(url, "url");
        j.c(vastActivity, url, new oc.c(this.f28079a, iabClickCallback));
    }

    @Override // h7.b
    public void d(VastActivity vastActivity, g vastRequest) {
        t.f(vastActivity, "vastActivity");
        t.f(vastRequest, "vastRequest");
        t7.d dVar = this.f28080b;
        if (dVar != null) {
            dVar.n();
        }
        this.f28079a.d();
    }

    @Override // h7.b
    public void e(VastActivity vastActivity, g gVar, boolean z10) {
        t.f(vastActivity, "vastActivity");
        t7.a aVar = this.f28081c;
        if (aVar != null) {
            aVar.n();
        }
        this.f28079a.onAdClosed();
    }
}
