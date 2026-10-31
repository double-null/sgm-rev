package m8;

import android.net.Uri;
import io.bidmachine.media3.exoplayer.upstream.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import m8.a;
import u7.b0;

/* JADX INFO: compiled from: FilteringManifestParser.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b<T extends a<T>> implements c.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c.a<? extends T> f22204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b0> f22205b;

    public b(c.a<? extends T> aVar, List<b0> list) {
        this.f22204a = aVar;
        this.f22205b = list;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.c.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(Uri uri, InputStream inputStream) throws IOException {
        T tA = this.f22204a.a(uri, inputStream);
        List<b0> list = this.f22205b;
        return (list == null || list.isEmpty()) ? tA : (T) tA.a(this.f22205b);
    }
}
