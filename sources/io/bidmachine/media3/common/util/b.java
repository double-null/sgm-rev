package io.bidmachine.media3.common.util;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: GlProgram.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a[] f18005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0319b[] f18006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, a> f18007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, C0319b> f18008e;

    /* JADX INFO: compiled from: GlProgram.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18010b;

        private a(String str, int i10) {
            this.f18009a = str;
            this.f18010b = i10;
        }

        public static a a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new a(str, b.f(i10, str));
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.media3.common.util.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GlProgram.java */
    private static final class C0319b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f18013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f18014d = new float[16];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f18015e = new int[4];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f18016f = 9729;

        private C0319b(String str, int i10, int i11) {
            this.f18011a = str;
            this.f18012b = i10;
            this.f18013c = i11;
        }

        public static C0319b a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new C0319b(str, b.i(i10, str), iArr2[0]);
        }
    }

    public b(String str, String str2) throws GlUtil.GlException {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f18004a = iGlCreateProgram;
        GlUtil.b();
        d(iGlCreateProgram, 35633, str);
        d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GlUtil.c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f18007d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f18005b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a aVarA = a.a(this.f18004a, i10);
            this.f18005b[i10] = aVarA;
            this.f18007d.put(aVarA.f18009a, aVarA);
        }
        this.f18008e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f18004a, 35718, iArr3, 0);
        this.f18006c = new C0319b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            C0319b c0319bA = C0319b.a(this.f18004a, i11);
            this.f18006c[i11] = c0319bA;
            this.f18008e.put(c0319bA.f18011a, c0319bA);
        }
        GlUtil.b();
    }

    private static void d(int i10, int i11, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.c(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    private int g(String str) {
        return f(this.f18004a, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public int e(String str) throws GlUtil.GlException {
        int iG = g(str);
        GLES20.glEnableVertexAttribArray(iG);
        GlUtil.b();
        return iG;
    }

    public int j(String str) {
        return i(this.f18004a, str);
    }
}
