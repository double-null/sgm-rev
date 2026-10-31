package re;

import java.io.IOException;
import kotlin.jvm.internal.t;
import me.b0;
import me.v;

/* JADX INFO: compiled from: ConnectInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25076a = new a();

    private a() {
    }

    @Override // me.v
    public b0 intercept(v.a chain) throws IOException {
        t.f(chain, "chain");
        se.g gVar = (se.g) chain;
        return se.g.c(gVar, 0, gVar.d().t(gVar), null, 0, 0, 0, 61, null).a(gVar.h());
    }
}
