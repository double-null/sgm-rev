package o7;

import io.bidmachine.AdProcessCallback;
import io.bidmachine.ExpirationHandler;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: CreativeLoadingTimeoutListener.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements ExpirationHandler.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdProcessCallback f23127a;

    public f(AdProcessCallback adProcessCallback) {
        t.f(adProcessCallback, "adProcessCallback");
        this.f23127a = adProcessCallback;
    }

    @Override // io.bidmachine.ExpirationHandler.Listener
    public void onExpired() {
        this.f23127a.processLoadFail(new oc.a(oc.a.f23334f, -1, "Creative loading timeout reached"));
    }
}
