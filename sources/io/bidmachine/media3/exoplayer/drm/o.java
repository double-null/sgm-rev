package io.bidmachine.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.v;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import x7.l0;

/* JADX INFO: compiled from: HttpMediaDrmCallback.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z7.d.a f18593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f18595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f18596d;

    public o(String str, boolean z10, z7.d.a aVar) {
        x7.a.a((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f18593a = aVar;
        this.f18594b = str;
        this.f18595c = z10;
        this.f18596d = new HashMap();
    }

    @Override // io.bidmachine.media3.exoplayer.drm.p
    public byte[] a(UUID uuid, m.d dVar) throws MediaDrmCallbackException {
        return j.a(this.f18593a.a(), dVar.b() + "&signedRequest=" + l0.H(dVar.a()), null, Collections.emptyMap());
    }

    @Override // io.bidmachine.media3.exoplayer.drm.p
    public byte[] b(UUID uuid, m.a aVar) throws MediaDrmCallbackException {
        String str;
        String strB = aVar.b();
        if (this.f18595c || TextUtils.isEmpty(strB)) {
            strB = this.f18594b;
        }
        if (TextUtils.isEmpty(strB)) {
            throw new MediaDrmCallbackException(new z7.g.b().i(Uri.EMPTY).a(), Uri.EMPTY, v.t(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = u7.f.f26063e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = u7.f.f26061c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f18596d) {
            map.putAll(this.f18596d);
        }
        return j.a(this.f18593a.a(), strB, aVar.a(), map);
    }

    public void c(String str, String str2) {
        x7.a.e(str);
        x7.a.e(str2);
        synchronized (this.f18596d) {
            this.f18596d.put(str, str2);
        }
    }
}
