package io.bidmachine.media3.exoplayer.drm;

import android.net.Uri;
import com.google.common.collect.c1;
import java.util.Map;
import u7.s;

/* JADX INFO: compiled from: DefaultDrmSessionManagerProvider.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements g8.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f18570a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s.f f18571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f18572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z7.d.a f18573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f18574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private io.bidmachine.media3.exoplayer.upstream.b f18575f;

    private i b(s.f fVar) {
        z7.d.a aVarC = this.f18573d;
        if (aVarC == null) {
            aVarC = new z7.i.b().c(this.f18574e);
        }
        Uri uri = fVar.f26353c;
        o oVar = new o(uri == null ? null : uri.toString(), fVar.f26358h, aVarC);
        c1<Map.Entry<String, String>> it = fVar.f26355e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            oVar.c(next.getKey(), next.getValue());
        }
        DefaultDrmSessionManager.b bVarE = new DefaultDrmSessionManager.b().f(fVar.f26351a, n.f18589d).c(fVar.f26356f).d(fVar.f26357g).e(com.google.common.primitives.f.m(fVar.f26360j));
        io.bidmachine.media3.exoplayer.upstream.b bVar = this.f18575f;
        if (bVar != null) {
            bVarE.b(bVar);
        }
        DefaultDrmSessionManager defaultDrmSessionManagerA = bVarE.a(oVar);
        defaultDrmSessionManagerA.F(0, fVar.c());
        return defaultDrmSessionManagerA;
    }

    @Override // g8.k
    public i a(s sVar) {
        i iVar;
        x7.a.e(sVar.f26302b);
        s.f fVar = sVar.f26302b.f26396c;
        if (fVar == null) {
            return i.f18581a;
        }
        synchronized (this.f18570a) {
            if (!fVar.equals(this.f18571b)) {
                this.f18571b = fVar;
                this.f18572c = b(fVar);
            }
            iVar = (i) x7.a.e(this.f18572c);
        }
        return iVar;
    }
}
