package b8;

import android.os.Handler;
import io.bidmachine.media3.exoplayer.h2;

/* JADX INFO: compiled from: RenderersFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public interface z {
    h2[] a(Handler handler, io.bidmachine.media3.exoplayer.video.p pVar, io.bidmachine.media3.exoplayer.audio.e eVar, p8.h hVar, l8.b bVar);

    default h2 b(h2 h2Var, Handler handler, io.bidmachine.media3.exoplayer.video.p pVar, io.bidmachine.media3.exoplayer.audio.e eVar, p8.h hVar, l8.b bVar) {
        return null;
    }
}
