package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: ExternalLoader.java */
/* JADX INFO: loaded from: classes4.dex */
public interface j {

    /* JADX INFO: compiled from: ExternalLoader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f19630a;

        public a(Uri uri) {
            this.f19630a = uri;
        }
    }

    ListenableFuture<?> a(a aVar);
}
