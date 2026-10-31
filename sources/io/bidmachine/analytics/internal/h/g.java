package io.bidmachine.analytics.internal.h;

import kotlin.jvm.internal.u;
import wc.g0;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends u implements id.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ io.bidmachine.analytics.internal.p002a.a f16955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Throwable f16957c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(io.bidmachine.analytics.internal.p002a.a aVar, String str, Throwable th) {
        super(0);
        this.f16955a = aVar;
        this.f16956b = str;
        this.f16957c = th;
    }

    public final void a() {
        e.f16938a.a(this.f16955a, this.f16956b, this.f16957c);
    }

    @Override // id.a
    public /* bridge */ /* synthetic */ Object invoke() {
        a();
        return g0.f27756a;
    }
}
