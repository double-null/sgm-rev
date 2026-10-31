package u7;

import android.content.Context;
import io.bidmachine.media3.common.VideoFrameProcessingException;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PreviewingVideoGraph.java */
/* JADX INFO: loaded from: classes4.dex */
public interface z extends k0 {

    /* JADX INFO: compiled from: PreviewingVideoGraph.java */
    public interface a {
        z a(Context context, g gVar, j jVar, k0.a aVar, Executor executor, i0 i0Var, List<Object> list, long j10) throws VideoFrameProcessingException;

        boolean b();
    }

    void b(long j10);
}
