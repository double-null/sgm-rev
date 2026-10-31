package t8;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import io.bidmachine.media3.common.util.GlUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: VideoDecoderGLSurfaceView.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends GLSurfaceView implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25632b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25633a;

    /* JADX INFO: compiled from: VideoDecoderGLSurfaceView.java */
    private static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final float[] f25634k = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final float[] f25635l = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final float[] f25636m = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String[] f25637n = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final FloatBuffer f25638o = GlUtil.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final GLSurfaceView f25639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f25640b = new int[3];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f25641c = new int[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f25642d = new int[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f25643e = new int[3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicReference<a8.g> f25644f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final FloatBuffer[] f25645g = new FloatBuffer[3];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private io.bidmachine.media3.common.util.b f25646h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f25647i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private a8.g f25648j;

        public a(GLSurfaceView gLSurfaceView) {
            this.f25639a = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f25642d;
                this.f25643e[i10] = -1;
                iArr[i10] = -1;
            }
        }

        private void b() {
            try {
                GLES20.glGenTextures(3, this.f25640b, 0);
                for (int i10 = 0; i10 < 3; i10++) {
                    GLES20.glUniform1i(this.f25646h.j(f25637n[i10]), i10);
                    GLES20.glActiveTexture(33984 + i10);
                    GlUtil.a(3553, this.f25640b[i10], 9729);
                }
                GlUtil.b();
            } catch (GlUtil.GlException e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
            }
        }

        public void a(a8.g gVar) {
            a8.g andSet = this.f25644f.getAndSet(gVar);
            if (andSet != null) {
                andSet.p();
            }
            this.f25639a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            a8.g andSet = this.f25644f.getAndSet(null);
            if (andSet == null && this.f25648j == null) {
                return;
            }
            if (andSet != null) {
                a8.g gVar = this.f25648j;
                if (gVar != null) {
                    gVar.p();
                }
                this.f25648j = andSet;
            }
            a8.g gVar2 = (a8.g) x7.a.e(this.f25648j);
            float[] fArr = f25635l;
            int i10 = gVar2.f169i;
            if (i10 == 1) {
                fArr = f25634k;
            } else if (i10 == 3) {
                fArr = f25636m;
            }
            GLES20.glUniformMatrix3fv(this.f25647i, 1, false, fArr, 0);
            int[] iArr = (int[]) x7.a.e(gVar2.f168h);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) x7.a.e(gVar2.f167g);
            int i11 = 0;
            while (i11 < 3) {
                int i12 = i11 == 0 ? gVar2.f166f : (gVar2.f166f + 1) / 2;
                GLES20.glActiveTexture(33984 + i11);
                GLES20.glBindTexture(3553, this.f25640b[i11]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i11], i12, 0, 6409, 5121, byteBufferArr[i11]);
                i11++;
            }
            int i13 = gVar2.f165e;
            int i14 = (i13 + 1) / 2;
            int[] iArr2 = {i13, i14, i14};
            for (int i15 = 0; i15 < 3; i15++) {
                if (this.f25642d[i15] != iArr2[i15] || this.f25643e[i15] != iArr[i15]) {
                    x7.a.g(iArr[i15] != 0);
                    float f10 = iArr2[i15] / iArr[i15];
                    this.f25645g[i15] = GlUtil.e(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f10, 0.0f, f10, 1.0f});
                    GLES20.glVertexAttribPointer(this.f25641c[i15], 2, 5126, false, 0, (Buffer) this.f25645g[i15]);
                    this.f25642d[i15] = iArr2[i15];
                    this.f25643e[i15] = iArr[i15];
                }
            }
            GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e10) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", e10);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                io.bidmachine.media3.common.util.b bVar = new io.bidmachine.media3.common.util.b("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f25646h = bVar;
                GLES20.glVertexAttribPointer(bVar.e("in_pos"), 2, 5126, false, 0, (Buffer) f25638o);
                this.f25641c[0] = this.f25646h.e("in_tc_y");
                this.f25641c[1] = this.f25646h.e("in_tc_u");
                this.f25641c[2] = this.f25646h.e("in_tc_v");
                this.f25647i = this.f25646h.j("mColorConversion");
                GlUtil.b();
                b();
                GlUtil.b();
            } catch (GlUtil.GlException e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e10);
            }
        }
    }

    public f(Context context) {
        this(context, null);
    }

    public void setOutputBuffer(a8.g gVar) {
        this.f25633a.a(gVar);
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f25633a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public g getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
