package u8;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import io.bidmachine.media3.common.util.GlUtil;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import u7.q;
import x7.f0;
import x7.r;

/* JADX INFO: compiled from: SceneRenderer.java */
/* JADX INFO: loaded from: classes4.dex */
final class i implements t8.h, a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SurfaceTexture f26596j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f26599m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f26587a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f26588b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f26589c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f26590d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f0<Long> f26591e = new f0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f0<e> f26592f = new f0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f26593g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f26594h = new float[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f26597k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f26598l = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(SurfaceTexture surfaceTexture) {
        this.f26587a.set(true);
    }

    private void i(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f26599m;
        int i11 = this.f26598l;
        this.f26599m = bArr;
        if (i10 == -1) {
            i10 = this.f26597k;
        }
        this.f26598l = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f26599m)) {
            return;
        }
        byte[] bArr3 = this.f26599m;
        e eVarA = bArr3 != null ? f.a(bArr3, this.f26598l) : null;
        if (eVarA == null || !g.c(eVarA)) {
            eVarA = e.b(this.f26598l);
        }
        this.f26592f.a(j10, eVarA);
    }

    @Override // t8.h
    public void a(long j10, long j11, q qVar, MediaFormat mediaFormat) {
        this.f26591e.a(j11, Long.valueOf(j10));
        i(qVar.A, qVar.B, j11);
    }

    @Override // u8.a
    public void c(long j10, float[] fArr) {
        this.f26590d.e(j10, fArr);
    }

    public void d(float[] fArr, boolean z10) {
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e10) {
            r.d("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f26587a.compareAndSet(true, false)) {
            ((SurfaceTexture) x7.a.e(this.f26596j)).updateTexImage();
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e11) {
                r.d("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f26588b.compareAndSet(true, false)) {
                GlUtil.k(this.f26593g);
            }
            long timestamp = this.f26596j.getTimestamp();
            Long lG = this.f26591e.g(timestamp);
            if (lG != null) {
                this.f26590d.c(this.f26593g, lG.longValue());
            }
            e eVarJ = this.f26592f.j(timestamp);
            if (eVarJ != null) {
                this.f26589c.d(eVarJ);
            }
        }
        Matrix.multiplyMM(this.f26594h, 0, fArr, 0, this.f26593g, 0);
        this.f26589c.a(this.f26595i, this.f26594h, z10);
    }

    @Override // u8.a
    public void e() {
        this.f26591e.c();
        this.f26590d.d();
        this.f26588b.set(true);
    }

    public SurfaceTexture f() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.b();
            this.f26589c.b();
            GlUtil.b();
            this.f26595i = GlUtil.f();
        } catch (GlUtil.GlException e10) {
            r.d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f26595i);
        this.f26596j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: u8.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f26586a.g(surfaceTexture2);
            }
        });
        return this.f26596j;
    }

    public void h(int i10) {
        this.f26597k = i10;
    }
}
