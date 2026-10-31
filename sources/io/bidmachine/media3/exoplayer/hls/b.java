package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: FullSegmentEncryptionKeyCache.java */
/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<Uri, byte[]> f18716a;

    /* JADX INFO: compiled from: FullSegmentEncryptionKeyCache.java */
    class a extends LinkedHashMap<Uri, byte[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18717a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f18717a = i11;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f18717a;
        }
    }

    public b(int i10) {
        this.f18716a = new a(i10 + 1, 1.0f, false, i10);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f18716a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return this.f18716a.put((Uri) x7.a.e(uri), (byte[]) x7.a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return this.f18716a.remove(x7.a.e(uri));
    }
}
