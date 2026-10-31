package i8;

import java.util.List;
import u7.b0;

/* JADX INFO: compiled from: FilteringHlsPlaylistParserFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f16100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b0> f16101b;

    public c(e eVar, List<b0> list) {
        this.f16100a = eVar;
        this.f16101b = list;
    }

    @Override // i8.e
    public io.bidmachine.media3.exoplayer.upstream.c.a<d> a() {
        return new m8.b(this.f16100a.a(), this.f16101b);
    }

    @Override // i8.e
    public io.bidmachine.media3.exoplayer.upstream.c.a<d> b(io.bidmachine.media3.exoplayer.hls.playlist.d dVar, io.bidmachine.media3.exoplayer.hls.playlist.c cVar) {
        return new m8.b(this.f16100a.b(dVar, cVar), this.f16101b);
    }
}
