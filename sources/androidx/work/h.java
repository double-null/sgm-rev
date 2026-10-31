package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* JADX INFO: compiled from: ForegroundUpdater.java */
/* JADX INFO: loaded from: classes.dex */
public interface h {
    ListenableFuture<Void> a(Context context, UUID uuid, g gVar);
}
