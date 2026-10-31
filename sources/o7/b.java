package o7;

import io.bidmachine.AdProcessCallback;
import io.bidmachine.core.j;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: BaseUnifiedAdCallback.kt */
/* JADX INFO: loaded from: classes4.dex */
public class b implements vb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdProcessCallback f23118a;

    public b(AdProcessCallback adProcessCallback) {
        t.f(adProcessCallback, "adProcessCallback");
        this.f23118a = adProcessCallback;
    }

    @Override // vb.c
    public void a() {
        this.f23118a.processExpired();
    }

    @Override // vb.c
    public void b(oc.a error) {
        t.f(error, "error");
        this.f23118a.processShowFail(error);
    }

    @Override // vb.c
    public void c(oc.a error) {
        t.f(error, "error");
        this.f23118a.processLoadFail(error);
    }

    @Override // vb.c
    public void f(mc.a actionEvent, oc.a aVar) {
        t.f(actionEvent, "actionEvent");
        this.f23118a.onNetworkViewabilityEvent(actionEvent, aVar);
    }

    public final AdProcessCallback g() {
        return this.f23118a;
    }

    @Override // vb.c
    public void j() {
        this.f23118a.processShown();
    }

    @Override // vb.c
    public void onAdClicked() {
        this.f23118a.processClicked();
    }

    @Override // vb.c
    public void onBrokenCreativeEvent(Map<String, Object> map) {
        this.f23118a.onBrokenCreativeEvent(map);
    }

    @Override // vb.c
    public void setVisibilitySource(j visibilitySource) {
        t.f(visibilitySource, "visibilitySource");
        this.f23118a.setVisibilitySource(visibilitySource);
    }
}
