package n8;

import u7.d0;

/* JADX INFO: compiled from: TimelineWithUpdatedMediaItem.java */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends io.bidmachine.media3.exoplayer.source.m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u7.s f22834f;

    public v(d0 d0Var, u7.s sVar) {
        super(d0Var);
        this.f22834f = sVar;
    }

    @Override // io.bidmachine.media3.exoplayer.source.m, u7.d0
    public d0.c o(int i10, d0.c cVar, long j10) {
        super.o(i10, cVar, j10);
        u7.s sVar = this.f22834f;
        cVar.f26037c = sVar;
        u7.s.h hVar = sVar.f26302b;
        cVar.f26036b = hVar != null ? hVar.f26401h : null;
        return cVar;
    }
}
