package i8;

import io.bidmachine.media3.exoplayer.hls.playlist.HlsPlaylistParser;

/* JADX INFO: compiled from: DefaultHlsPlaylistParserFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {
    @Override // i8.e
    public io.bidmachine.media3.exoplayer.upstream.c.a<d> a() {
        return new HlsPlaylistParser();
    }

    @Override // i8.e
    public io.bidmachine.media3.exoplayer.upstream.c.a<d> b(io.bidmachine.media3.exoplayer.hls.playlist.d dVar, io.bidmachine.media3.exoplayer.hls.playlist.c cVar) {
        return new HlsPlaylistParser(dVar, cVar);
    }
}
