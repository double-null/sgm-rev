package u8;

import android.opengl.GLES20;
import android.util.Log;
import com.vungle.ads.internal.network.converters.vY.cTJaRZ;
import d5.LXP.wcAlQCOdREZdI;
import io.bidmachine.media3.common.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: ProjectionRenderer.java */
/* JADX INFO: loaded from: classes4.dex */
final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f26568j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float[] f26569k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f26570l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f26571m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f26572n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f26574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f26575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.bidmachine.media3.common.util.b f26576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26581i;

    /* JADX INFO: compiled from: ProjectionRenderer.java */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f26582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FloatBuffer f26583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final FloatBuffer f26584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f26585d;

        public a(e.b bVar) {
            this.f26582a = bVar.a();
            this.f26583b = GlUtil.e(bVar.f26566c);
            this.f26584c = GlUtil.e(bVar.f26567d);
            int i10 = bVar.f26565b;
            if (i10 == 1) {
                this.f26585d = 5;
            } else if (i10 != 2) {
                this.f26585d = 4;
            } else {
                this.f26585d = 6;
            }
        }
    }

    g() {
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f26559a;
        e.a aVar2 = eVar.f26560b;
        return aVar.b() == 1 && aVar.a(0).f26564a == 0 && aVar2.b() == 1 && aVar2.a(0).f26564a == 0;
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f26573a = eVar.f26561c;
            a aVar = new a(eVar.f26559a.a(0));
            this.f26574b = aVar;
            if (!eVar.f26562d) {
                aVar = new a(eVar.f26560b.a(0));
            }
            this.f26575c = aVar;
        }
    }

    public void a(int i10, float[] fArr, boolean z10) {
        float[] fArr2;
        a aVar = z10 ? this.f26575c : this.f26574b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f26573a;
        if (i11 == 1) {
            fArr2 = z10 ? f26570l : f26569k;
        } else if (i11 == 2) {
            fArr2 = z10 ? f26572n : f26571m;
        } else {
            fArr2 = f26568j;
        }
        GLES20.glUniformMatrix3fv(this.f26578f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f26577e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f26581i, 0);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e10) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
        }
        GLES20.glVertexAttribPointer(this.f26579g, 3, 5126, false, 12, (Buffer) aVar.f26583b);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e11) {
            Log.e("ProjectionRenderer", wcAlQCOdREZdI.SAHTPbuRz, e11);
        }
        GLES20.glVertexAttribPointer(this.f26580h, 2, 5126, false, 8, (Buffer) aVar.f26584c);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e12) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e12);
        }
        GLES20.glDrawArrays(aVar.f26585d, 0, aVar.f26582a);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e13) {
            Log.e("ProjectionRenderer", "Failed to render", e13);
        }
    }

    public void b() {
        try {
            io.bidmachine.media3.common.util.b bVar = new io.bidmachine.media3.common.util.b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f26576d = bVar;
            this.f26577e = bVar.j("uMvpMatrix");
            this.f26578f = this.f26576d.j("uTexMatrix");
            this.f26579g = this.f26576d.e("aPosition");
            this.f26580h = this.f26576d.e(cTJaRZ.KFLsOzMdYGmjGa);
            this.f26581i = this.f26576d.j("uTexture");
        } catch (GlUtil.GlException e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }
}
