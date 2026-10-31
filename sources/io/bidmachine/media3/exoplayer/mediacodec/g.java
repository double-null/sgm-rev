package io.bidmachine.media3.exoplayer.mediacodec;

import android.content.Context;
import android.os.HandlerThread;
import com.google.common.base.w;
import java.io.IOException;
import x7.l0;

/* JADX INFO: compiled from: DefaultMediaCodecAdapterFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements h.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f19276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w<HandlerThread> f19277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w<HandlerThread> f19278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19280f;

    @Deprecated
    public g() {
        this.f19279e = 0;
        this.f19280f = false;
        this.f19276b = null;
        this.f19277c = null;
        this.f19278d = null;
    }

    private boolean c() {
        int i10 = l0.f28136a;
        if (i10 >= 31) {
            return true;
        }
        Context context = this.f19276b;
        return context != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // io.bidmachine.media3.exoplayer.mediacodec.h.b
    public h b(h.a aVar) throws IOException {
        int i10;
        w<HandlerThread> wVar;
        if (l0.f28136a < 23 || !((i10 = this.f19279e) == 1 || (i10 == 0 && c()))) {
            return new q.b().b(aVar);
        }
        int iK = u7.w.k(aVar.f19283c.f26252o);
        x7.r.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + l0.t0(iK));
        w<HandlerThread> wVar2 = this.f19277c;
        b.C0327b c0327b = (wVar2 == null || (wVar = this.f19278d) == null) ? new b.C0327b(iK) : new b.C0327b(wVar2, wVar);
        c0327b.f(this.f19280f);
        return c0327b.b(aVar);
    }

    public g(Context context) {
        this(context, null, null);
    }

    public g(Context context, w<HandlerThread> wVar, w<HandlerThread> wVar2) {
        this.f19276b = context;
        this.f19279e = 0;
        this.f19280f = false;
        this.f19277c = wVar;
        this.f19278d = wVar2;
    }
}
