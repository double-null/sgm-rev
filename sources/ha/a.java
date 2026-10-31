package ha;

import android.content.Context;
import android.net.Uri;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.ImageData;
import io.bidmachine.MediaAssetType;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import wc.g0;

/* JADX INFO: compiled from: AssetLoader.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0240a f15757h = new C0240a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f15758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ha.g f15759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdProcessCallback f15760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f15761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f15762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wc.k f15763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<Runnable> f15764g;

    /* JADX INFO: renamed from: ha.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AssetLoader.kt */
    public static final class C0240a {
        private C0240a() {
        }

        public /* synthetic */ C0240a(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: AssetLoader.kt */
    static final class b extends u implements id.l<Uri, g0> {
        b() {
            super(1);
        }

        public final void b(Uri imagePath) {
            t.f(imagePath, "imagePath");
            a.this.f15762e.h(imagePath);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(Uri uri) {
            b(uri);
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: AssetLoader.kt */
    static final class c extends u implements id.l<Uri, g0> {
        c() {
            super(1);
        }

        public final void b(Uri imagePath) {
            t.f(imagePath, "imagePath");
            a.this.f15762e.j(imagePath);
        }

        @Override // id.l
        public /* bridge */ /* synthetic */ g0 invoke(Uri uri) {
            b(uri);
            return g0.f27756a;
        }
    }

    /* JADX INFO: compiled from: AssetLoader.kt */
    public static final class d implements ia.a.InterfaceC0251a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ id.l<Uri, g0> f15767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f15768b;

        /* JADX WARN: Multi-variable type inference failed */
        d(id.l<? super Uri, g0> lVar, a aVar) {
            this.f15767a = lVar;
            this.f15768b = aVar;
        }

        @Override // ia.a.InterfaceC0251a
        public void a(ia.a task) {
            t.f(task, "task");
            this.f15768b.q(task);
        }

        @Override // ia.a.InterfaceC0251a
        public void b(ia.a task, Uri imagePath) {
            t.f(task, "task");
            t.f(imagePath, "imagePath");
            this.f15767a.invoke(imagePath);
            this.f15768b.q(task);
        }
    }

    /* JADX INFO: compiled from: AssetLoader.kt */
    public static final class e implements ia.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f15770b;

        e(Context context) {
            this.f15770b = context;
        }

        @Override // ia.b.a
        public void a(ia.b task, Uri videoFileUri, h7.g vastRequest) throws Throwable {
            t.f(task, "task");
            t.f(videoFileUri, "videoFileUri");
            t.f(vastRequest, "vastRequest");
            a.this.f15762e.a(vastRequest);
            a.this.f15762e.n(videoFileUri);
            a.this.r(this.f15770b, videoFileUri);
            a.this.q(task);
        }

        @Override // ia.b.a
        public void b(ia.b task) {
            t.f(task, "task");
            a.this.q(task);
        }
    }

    /* JADX INFO: compiled from: AssetLoader.kt */
    public static final class f implements ia.c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f15772b;

        f(Context context) {
            this.f15772b = context;
        }

        @Override // ia.c.a
        public void a(ia.c task) {
            t.f(task, "task");
            a.this.q(task);
        }

        @Override // ia.c.a
        public void b(ia.c task, Uri videoFileUri) throws Throwable {
            t.f(task, "task");
            t.f(videoFileUri, "videoFileUri");
            a.this.f15762e.n(videoFileUri);
            a.this.r(this.f15772b, videoFileUri);
            a.this.q(task);
        }
    }

    /* JADX INFO: compiled from: AssetLoader.kt */
    static final class g extends u implements id.a<la.g> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f15773d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context) {
            super(0);
            this.f15773d = context;
        }

        @Override // id.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final la.g invoke() {
            return la.f.f21923a.a(o7.d.b(this.f15773d));
        }
    }

    public a(Context context, Object assetsHolder, ha.g adRequestParameters, AdProcessCallback callback, h nativeData, j nativeMediaData) {
        t.f(context, "context");
        t.f(assetsHolder, "assetsHolder");
        t.f(adRequestParameters, "adRequestParameters");
        t.f(callback, "callback");
        t.f(nativeData, "nativeData");
        t.f(nativeMediaData, "nativeMediaData");
        this.f15758a = assetsHolder;
        this.f15759b = adRequestParameters;
        this.f15760c = callback;
        this.f15761d = nativeData;
        this.f15762e = nativeMediaData;
        this.f15763f = wc.m.a(new g(context));
        this.f15764g = new CopyOnWriteArrayList();
    }

    private final void d() {
        if (this.f15764g.isEmpty()) {
            p();
        }
    }

    private final void e(ImageData imageData) {
        g(imageData, new b());
    }

    private final void f(ImageData imageData) {
        g(imageData, new c());
    }

    private final void g(ImageData imageData, id.l<? super Uri, g0> lVar) {
        if (imageData != null && imageData.getImage() == null) {
            String remoteUrl = imageData.getRemoteUrl();
            if (remoteUrl == null || remoteUrl.length() == 0) {
                return;
            }
            this.f15764g.add(new ia.a(this.f15758a, k(), new d(lVar, this), remoteUrl, null, 16, null));
        }
    }

    private final void h(Context context, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f15764g.add(new ia.b(context, this.f15758a, k(), new e(context), str, null, 32, null));
    }

    private final void i(Context context, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f15764g.add(new ia.c(this.f15758a, k(), new f(context), str, null, 16, null));
    }

    private final la.g k() {
        return (la.g) this.f15763f.getValue();
    }

    private final boolean l() {
        try {
            return m() && n() && o();
        } catch (Exception e10) {
            io.bidmachine.core.a.o(e10);
            return false;
        }
    }

    private final boolean m() {
        return (this.f15759b.a(MediaAssetType.Icon) && this.f15762e.getIconUri() == null && this.f15762e.c() == null) ? false : true;
    }

    private final boolean n() {
        return (this.f15759b.a(MediaAssetType.Image) && this.f15762e.e() == null && this.f15762e.g() == null) ? false : true;
    }

    private final boolean o() {
        if (this.f15759b.a(MediaAssetType.Video)) {
            return this.f15761d.hasVideo();
        }
        return true;
    }

    private final synchronized void p() {
        if (!this.f15759b.c() || l()) {
            this.f15760c.processLoadSuccess();
        } else {
            AdProcessCallback adProcessCallback = this.f15760c;
            oc.a aVarI = oc.a.i("Native assets are invalid");
            t.e(aVarI, "internal(\"Native assets are invalid\")");
            adProcessCallback.processLoadFail(aVarI);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(Runnable runnable) {
        this.f15764g.remove(runnable);
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(Context context, Uri uri) throws Throwable {
        String path;
        ImageData mainImage = this.f15761d.getMainImage();
        String remoteUrl = mainImage != null ? mainImage.getRemoteUrl() : null;
        if (uri == null || (path = uri.getPath()) == null) {
            return;
        }
        if ((remoteUrl == null || remoteUrl.length() == 0) && new File(path).exists()) {
            File fileB0 = io.bidmachine.core.h.b0(context, uri, "native_video_thumb");
            this.f15762e.j(fileB0 != null ? ac.b.k(fileB0) : null);
        }
    }

    private final void s(Context context) {
        String strK = this.f15761d.k();
        String strM = this.f15761d.m();
        if (this.f15759b.a(MediaAssetType.Icon)) {
            e(this.f15761d.getIcon());
        }
        if (this.f15759b.a(MediaAssetType.Image)) {
            f(this.f15761d.getMainImage());
        }
        if (this.f15759b.a(MediaAssetType.Video)) {
            if (strK == null || strK.length() == 0) {
                if (!(strM == null || strM.length() == 0)) {
                    h(context, strM);
                }
            } else {
                i(context, strK);
            }
        }
        if (this.f15764g.isEmpty()) {
            d();
            return;
        }
        Iterator<T> it = this.f15764g.iterator();
        while (it.hasNext()) {
            ja.b.a().execute((Runnable) it.next());
        }
    }

    public final void j(Context context) {
        t.f(context, "context");
        s(context);
        d();
    }
}
