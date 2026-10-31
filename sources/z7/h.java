package z7;

import android.content.Context;
import android.net.Uri;
import com.applovin.sdk.AppLovinEventTypes;
import io.bidmachine.media3.datasource.AssetDataSource;
import io.bidmachine.media3.datasource.ContentDataSource;
import io.bidmachine.media3.datasource.FileDataSource;
import io.bidmachine.media3.datasource.RawResourceDataSource;
import io.bidmachine.media3.datasource.UdpDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import x7.l0;
import x7.r;

/* JADX INFO: compiled from: DefaultDataSource.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<o> f29031b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f29032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f29033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f29034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f29035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f29036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f29037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f29038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f29039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private d f29040k;

    /* JADX INFO: compiled from: DefaultDataSource.java */
    public static final class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f29041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.a f29042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o f29043c;

        public a(Context context) {
            this(context, new i.b());
        }

        @Override // z7.d.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a() {
            h hVar = new h(this.f29041a, this.f29042b.a());
            o oVar = this.f29043c;
            if (oVar != null) {
                hVar.a(oVar);
            }
            return hVar;
        }

        public a(Context context, d.a aVar) {
            this.f29041a = context.getApplicationContext();
            this.f29042b = (d.a) x7.a.e(aVar);
        }
    }

    public h(Context context, d dVar) {
        this.f29030a = context.getApplicationContext();
        this.f29032c = (d) x7.a.e(dVar);
    }

    private void o(d dVar) {
        for (int i10 = 0; i10 < this.f29031b.size(); i10++) {
            dVar.a(this.f29031b.get(i10));
        }
    }

    private d p() {
        if (this.f29034e == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.f29030a);
            this.f29034e = assetDataSource;
            o(assetDataSource);
        }
        return this.f29034e;
    }

    private d q() {
        if (this.f29035f == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.f29030a);
            this.f29035f = contentDataSource;
            o(contentDataSource);
        }
        return this.f29035f;
    }

    private d r() {
        if (this.f29038i == null) {
            c cVar = new c();
            this.f29038i = cVar;
            o(cVar);
        }
        return this.f29038i;
    }

    private d s() {
        if (this.f29033d == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.f29033d = fileDataSource;
            o(fileDataSource);
        }
        return this.f29033d;
    }

    private d t() {
        if (this.f29039j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f29030a);
            this.f29039j = rawResourceDataSource;
            o(rawResourceDataSource);
        }
        return this.f29039j;
    }

    private d u() {
        if (this.f29036g == null) {
            try {
                d dVar = (d) Class.forName("io.bidmachine.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f29036g = dVar;
                o(dVar);
            } catch (ClassNotFoundException unused) {
                r.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f29036g == null) {
                this.f29036g = this.f29032c;
            }
        }
        return this.f29036g;
    }

    private d v() {
        if (this.f29037h == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.f29037h = udpDataSource;
            o(udpDataSource);
        }
        return this.f29037h;
    }

    private void w(d dVar, o oVar) {
        if (dVar != null) {
            dVar.a(oVar);
        }
    }

    @Override // z7.d
    public void a(o oVar) {
        x7.a.e(oVar);
        this.f29032c.a(oVar);
        this.f29031b.add(oVar);
        w(this.f29033d, oVar);
        w(this.f29034e, oVar);
        w(this.f29035f, oVar);
        w(this.f29036g, oVar);
        w(this.f29037h, oVar);
        w(this.f29038i, oVar);
        w(this.f29039j, oVar);
    }

    @Override // z7.d
    public Map<String, List<String>> c() {
        d dVar = this.f29040k;
        return dVar == null ? Collections.emptyMap() : dVar.c();
    }

    @Override // z7.d
    public void close() throws IOException {
        d dVar = this.f29040k;
        if (dVar != null) {
            try {
                dVar.close();
            } finally {
                this.f29040k = null;
            }
        }
    }

    @Override // z7.d
    public long i(g gVar) throws IOException {
        x7.a.g(this.f29040k == null);
        String scheme = gVar.f29009a.getScheme();
        if (l0.J0(gVar.f29009a)) {
            String path = gVar.f29009a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f29040k = s();
            } else {
                this.f29040k = p();
            }
        } else if ("asset".equals(scheme)) {
            this.f29040k = p();
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
            this.f29040k = q();
        } else if ("rtmp".equals(scheme)) {
            this.f29040k = u();
        } else if ("udp".equals(scheme)) {
            this.f29040k = v();
        } else if ("data".equals(scheme)) {
            this.f29040k = r();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f29040k = t();
        } else {
            this.f29040k = this.f29032c;
        }
        return this.f29040k.i(gVar);
    }

    @Override // z7.d
    public Uri m() {
        d dVar = this.f29040k;
        if (dVar == null) {
            return null;
        }
        return dVar.m();
    }

    @Override // u7.h
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((d) x7.a.e(this.f29040k)).read(bArr, i10, i11);
    }
}
