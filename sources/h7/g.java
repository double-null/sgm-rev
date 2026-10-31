package h7;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.mediation.adapters.google.NK.ykDFMuXDQMaR;
import com.google.firebase.provider.fH.UyXgnuLGEkgnZE;
import g7.y;
import io.bidmachine.iab.vast.activity.VastActivity;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f15647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j7.b f15648d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bundle f15650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j7.c f15651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f15652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e7.c f15653i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Float f15655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f15656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f15657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f15658n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f15660p;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final h7.k.a f15644z = new j();
    private static int A = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c7.a f15646b = c7.a.FullLoad;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n f15649e = n.NonRewarded;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f15654j = 3.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f15659o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f15661q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f15662r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f15663s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f15664t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f15665u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f15666v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f15667w = 5.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f15668x = new AtomicBoolean(false);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f15669y = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15645a = UUID.randomUUID().toString();

    public class a {
        public a() {
        }

        public g a() {
            return g.this;
        }

        public a b(boolean z10) {
            g.this.f15657m = z10;
            return this;
        }

        public a c(e7.c cVar) {
            g.this.f15653i = cVar;
            return this;
        }

        public a d(c7.a aVar) {
            g.this.f15646b = aVar;
            return this;
        }

        public a e(int i10) {
            g.this.f15656l = i10;
            return this;
        }

        public a f(float f10) {
            g.this.f15654j = f10;
            return this;
        }

        public a g(int i10) {
            g.this.f15655k = Float.valueOf(i10);
            return this;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15671a;

        static {
            int[] iArr = new int[c7.a.values().length];
            f15671a = iArr;
            try {
                iArr[c7.a.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15671a[c7.a.Stream.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15671a[c7.a.PartialLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class c extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f15672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h7.h f15674c;

        c(Context context, String str, h7.h hVar) {
            this.f15672a = context;
            this.f15673b = str;
            this.f15674c = hVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            g.this.U(this.f15672a, this.f15673b, this.f15674c);
        }
    }

    class d extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f15676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h7.h f15677b;

        d(Context context, h7.h hVar) {
            this.f15676a = context;
            this.f15677b = hVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.i(this.f15676a, gVar.f15648d, this.f15677b);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h7.h f15679a;

        e(h7.h hVar) {
            this.f15679a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15679a.a(g.this);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c7.b f15681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h7.h f15682b;

        f(c7.b bVar, h7.h hVar) {
            this.f15681a = bVar;
            this.f15682b = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f15653i != null) {
                g.this.f15653i.l(this.f15681a);
            }
            if (this.f15682b != null) {
                if (g.this.f15646b != c7.a.PartialLoad || !g.this.f15668x.get() || g.this.f15669y.get()) {
                    this.f15682b.b(g.this, this.f15681a);
                    return;
                }
                h7.h hVar = this.f15682b;
                g gVar = g.this;
                hVar.b(gVar, c7.b.b(String.format("%s load failed after display - %s", gVar.f15646b, this.f15681a)));
            }
        }
    }

    /* JADX INFO: renamed from: h7.g$g, reason: collision with other inner class name */
    class RunnableC0239g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h7.b f15684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c7.b f15685b;

        RunnableC0239g(h7.b bVar, c7.b bVar2) {
            this.f15684a = bVar;
            this.f15685b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            h7.b bVar = this.f15684a;
            if (bVar != null) {
                bVar.a(g.this, this.f15685b);
            }
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j7.b f15687a;

        h(j7.b bVar) {
            this.f15687a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f15652h != null) {
                g.this.f15652h.a(g.this, this.f15687a);
            }
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c7.b f15689a;

        i(c7.b bVar) {
            this.f15689a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.f15652h != null) {
                g.this.f15652h.b(g.this, this.f15689a);
            }
        }
    }

    static class j implements h7.k.a {
        j() {
        }

        @Override // h7.k.a
        public void a(String str) {
            h7.e.a("VastRequest", "Fire url: %s", str);
            y.v(str);
        }
    }

    static class k implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f15691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public File f15692b;

        public k(File file) {
            this.f15692b = file;
            this.f15691a = file.lastModified();
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            long j10 = this.f15691a;
            long j11 = ((k) obj).f15691a;
            if (j10 > j11) {
                return -1;
            }
            return j10 == j11 ? 0 : 1;
        }
    }

    private g() {
    }

    public static a V() {
        return new g().new a();
    }

    public static void Y(int i10) {
        if (i10 > 0) {
            A = i10;
        }
    }

    private Uri b(Context context, String str) throws IOException {
        String strS = s(context);
        if (strS == null) {
            throw new FileNotFoundException("No dir for caching file");
        }
        File file = new File(strS);
        if (!file.exists()) {
            file.mkdirs();
        }
        int length = 230 - file.getPath().length();
        String str2 = "temp" + System.currentTimeMillis();
        String strReplace = str.substring(0, Math.min(length, str.length())).replace("/", "").replace(":", "");
        File file2 = new File(file, strReplace);
        if (file2.exists()) {
            return Uri.fromFile(file2);
        }
        File file3 = new File(file, str2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        InputStream inputStream = httpURLConnection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream(file3);
        long contentLength = httpURLConnection.getContentLength();
        byte[] bArr = new byte[1024];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                break;
            }
            fileOutputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
        fileOutputStream.close();
        if (contentLength != j10) {
            throw new IllegalStateException("The downloaded file size does not match the stated size");
        }
        file3.renameTo(new File(file, strReplace));
        return Uri.fromFile(new File(file, strReplace));
    }

    private Float g(j7.b bVar, h7.c cVar) {
        Float fW = cVar != null ? cVar.w() : null;
        if (Q()) {
            fW = y.n(fW, N());
        }
        Float fO = y.o(fW, bVar.n());
        return fO == null ? Float.valueOf(5.0f) : fO;
    }

    private void h(Context context) {
        File[] fileArrListFiles;
        try {
            String strS = s(context);
            if (strS == null || (fileArrListFiles = new File(strS).listFiles()) == null || fileArrListFiles.length <= A) {
                return;
            }
            k[] kVarArr = new k[fileArrListFiles.length];
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                kVarArr[i10] = new k(fileArrListFiles[i10]);
            }
            Arrays.sort(kVarArr);
            for (int i11 = 0; i11 < fileArrListFiles.length; i11++) {
                fileArrListFiles[i11] = kVarArr[i11].f15692b;
            }
            for (int i12 = A; i12 < fileArrListFiles.length; i12++) {
                if (!Uri.fromFile(fileArrListFiles[i12]).equals(this.f15647c)) {
                    fileArrListFiles[i12].delete();
                }
            }
        } catch (Exception e10) {
            h7.e.c("VastRequest", e10);
        }
    }

    private synchronized void j(c7.b bVar) {
        if (this.f15652h == null) {
            return;
        }
        y.r(new i(bVar));
    }

    private void k(c7.b bVar, h7.b bVar2) {
        h7.e.a("VastRequest", ykDFMuXDQMaR.GkNJqvQ, bVar);
        y.r(new RunnableC0239g(bVar2, bVar));
    }

    private void l(c7.b bVar, h7.h hVar) {
        h7.e.a("VastRequest", "sendLoadFailed - %s", bVar);
        j(bVar);
        y.r(new f(bVar, hVar));
    }

    private void n(h7.h hVar) {
        if (this.f15668x.getAndSet(true)) {
            return;
        }
        h7.e.a("VastRequest", "sendLoaded", new Object[0]);
        if (hVar != null) {
            y.r(new e(hVar));
        }
    }

    private synchronized void o(j7.b bVar) {
        if (this.f15652h == null) {
            return;
        }
        y.r(new h(bVar));
    }

    private String s(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getPath() + "/vast_rtb_cache/";
    }

    public void A(List<String> list, Bundle bundle) {
        B(list, bundle);
    }

    public void B(List<String> list, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f15650f;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (list != null) {
            h7.k.b(list, bundle2, f15644z);
        } else {
            h7.e.a("VastRequest", "Url list is null", new Object[0]);
        }
    }

    public c7.a C() {
        return this.f15646b;
    }

    public float D() {
        return this.f15656l;
    }

    public Uri E() {
        return this.f15647c;
    }

    public int F() {
        return this.f15666v;
    }

    public float G() {
        return this.f15667w;
    }

    public String H() {
        return this.f15645a;
    }

    public int I() {
        return this.f15658n;
    }

    public float J() {
        return this.f15654j;
    }

    public int K() {
        if (!c0()) {
            return 0;
        }
        j7.b bVar = this.f15648d;
        if (bVar == null) {
            return 2;
        }
        l7.n nVarQ = bVar.q();
        return y.s(nVarQ.v0(), nVarQ.t0());
    }

    public int L() {
        return this.f15659o;
    }

    public j7.b M() {
        return this.f15648d;
    }

    public Float N() {
        return this.f15655k;
    }

    public n O() {
        return this.f15649e;
    }

    public boolean P() {
        return this.f15660p;
    }

    public boolean Q() {
        return this.f15657m;
    }

    public boolean R() {
        return this.f15664t;
    }

    public boolean S() {
        return this.f15665u;
    }

    public void T(Context context, String str, h7.h hVar) {
        h7.e.a("VastRequest", "loadVideoWithData\n%s", str);
        this.f15648d = null;
        if (!y.l(context)) {
            l(c7.b.f4782c, hVar);
            return;
        }
        try {
            new c(context, str, hVar).start();
        } catch (Exception e10) {
            h7.e.c("VastRequest", e10);
            l(c7.b.j("Exception during creating background thread", e10), hVar);
        }
    }

    public void U(Context context, String str, h7.h hVar) {
        String str2;
        j7.c aVar = this.f15651g;
        if (aVar == null) {
            aVar = new j7.a(context);
        }
        j7.e eVarL = new j7.d(this, aVar).l(str);
        j7.b bVarG = eVarL.g();
        this.f15648d = bVarG;
        if (bVarG == null) {
            h7.j jVarH = eVarL.h();
            if (jVarH != null) {
                X(jVarH);
                str2 = String.format("VastAd is null during loadVideoWithDataSync with VastSpecCode - %s", Integer.valueOf(jVarH.a()));
            } else {
                str2 = "VastAd is null during loadVideoWithDataSync without VastSpecCode";
            }
            l(c7.b.a(str2), hVar);
            return;
        }
        bVarG.u(this);
        l7.e eVarI = this.f15648d.i();
        if (eVarI != null) {
            Boolean boolT = eVarI.t();
            if (boolT != null) {
                if (boolT.booleanValue()) {
                    this.f15661q = false;
                    this.f15662r = false;
                } else {
                    this.f15661q = true;
                    this.f15662r = true;
                }
            }
            if (eVarI.o().t0() > 0.0f) {
                this.f15656l = eVarI.o().t0();
            }
            this.f15664t = eVarI.h();
            this.f15665u = eVarI.f();
            Integer numV = eVarI.v();
            if (numV != null) {
                this.f15666v = numV.intValue();
            }
        }
        this.f15667w = g(this.f15648d, eVarI).floatValue();
        e7.c cVar = this.f15653i;
        if (cVar != null) {
            cVar.O(this);
        }
        int i10 = b.f15671a[this.f15646b.ordinal()];
        if (i10 == 1) {
            i(context, this.f15648d, hVar);
            return;
        }
        if (i10 == 2) {
            n(hVar);
        } else {
            if (i10 != 3) {
                return;
            }
            n(hVar);
            i(context, this.f15648d, hVar);
        }
    }

    public void W(Context context, h7.h hVar) {
        if (this.f15648d == null) {
            l(c7.b.f("VastAd is null during performCache"), hVar);
            return;
        }
        try {
            new d(context, hVar).start();
        } catch (Exception e10) {
            h7.e.c("VastRequest", e10);
            l(c7.b.j("Exception during creating background thread", e10), hVar);
        }
    }

    public void X(h7.j jVar) {
        h7.e.a("VastRequest", "sendVastSpecError - %s", jVar);
        try {
            if (this.f15648d != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("params_error_code", jVar.a());
                A(this.f15648d.o(), bundle);
            }
        } catch (Exception e10) {
            h7.e.c("VastRequest", e10);
        }
    }

    public synchronized void Z(l lVar) {
        this.f15652h = lVar;
    }

    public boolean a0() {
        return this.f15663s;
    }

    public boolean b0() {
        return this.f15662r;
    }

    public boolean c0() {
        return this.f15661q;
    }

    public boolean u() {
        return this.f15668x.get() && (this.f15646b != c7.a.FullLoad || v());
    }

    public boolean v() {
        try {
            Uri uri = this.f15647c;
            return (uri == null || TextUtils.isEmpty(uri.getPath()) || !new File(this.f15647c.getPath()).exists()) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void x(Context context, n nVar, h7.b bVar, i7.a aVar, h7.f fVar, e7.b bVar2) {
        h7.e.a("VastRequest", "display", new Object[0]);
        this.f15669y.set(true);
        if (this.f15648d == null) {
            k(c7.b.f("VastAd is null during display VastActivity"), bVar);
            return;
        }
        this.f15649e = nVar;
        this.f15659o = context.getResources().getConfiguration().orientation;
        c7.b bVarB = new VastActivity.a().g(this).d(bVar).h(aVar).e(fVar).c(this.f15653i).f(bVar2).b(context);
        if (bVarB != null) {
            k(bVarB, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(Context context, j7.b bVar, h7.h hVar) {
        try {
            Uri uriB = b(context, bVar.q().l0());
            if (uriB != null && !TextUtils.isEmpty(uriB.getPath()) && new File(uriB.getPath()).exists()) {
                Bitmap bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(uriB.getPath(), 1);
                if (bitmapCreateVideoThumbnail == null) {
                    h7.e.a("VastRequest", "Video file not supported", new Object[0]);
                    X(h7.j.f15703k);
                    l(c7.b.a("Failed to get thumbnail by file URI"), hVar);
                } else if (bitmapCreateVideoThumbnail.equals(Bitmap.createBitmap(bitmapCreateVideoThumbnail.getWidth(), bitmapCreateVideoThumbnail.getHeight(), bitmapCreateVideoThumbnail.getConfig()))) {
                    h7.e.a("VastRequest", "Empty thumbnail", new Object[0]);
                    X(h7.j.f15703k);
                    l(c7.b.a("Thumbnail is empty"), hVar);
                } else {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(context, uriB);
                        long j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                        int i10 = this.f15658n;
                        if (i10 == 0 || j10 <= i10) {
                            this.f15647c = uriB;
                            o(bVar);
                            n(hVar);
                        } else {
                            X(h7.j.f15696d);
                            l(c7.b.a(UyXgnuLGEkgnZE.xRWkVxWDIpA), hVar);
                        }
                    } catch (Exception e10) {
                        h7.e.c("VastRequest", e10);
                        X(h7.j.f15703k);
                        l(c7.b.j("Exception during metadata retrieval", e10), hVar);
                    }
                }
                h(context);
                return;
            }
            h7.e.a("VastRequest", "fileUri is null", new Object[0]);
            X(h7.j.f15698f);
            l(c7.b.a("Can't find video by local URI"), hVar);
        } catch (Exception e11) {
            h7.e.c("VastRequest", e11);
            X(h7.j.f15698f);
            l(c7.b.j("Exception during caching media file", e11), hVar);
        }
    }
}
