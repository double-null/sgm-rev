package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: DeviceProfileWriter.java */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f3045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f3046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h.c f3047c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f3049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f3050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f3051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f3052h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d[] f3054j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f3055k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3053i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f3048d = d();

    public c(AssetManager assetManager, Executor executor, h.c cVar, String str, String str2, String str3, File file) {
        this.f3045a = assetManager;
        this.f3046b = executor;
        this.f3047c = cVar;
        this.f3050f = str;
        this.f3051g = str2;
        this.f3052h = str3;
        this.f3049e = file;
    }

    private c b(d[] dVarArr, byte[] bArr) {
        try {
            InputStream inputStreamH = h(this.f3045a, this.f3052h);
            if (inputStreamH == null) {
                if (inputStreamH != null) {
                    inputStreamH.close();
                }
                return null;
            }
            try {
                this.f3054j = m.q(inputStreamH, m.o(inputStreamH, m.f3083b), bArr, dVarArr);
                inputStreamH.close();
                return this;
            } catch (Throwable th) {
                try {
                    inputStreamH.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e10) {
            this.f3047c.a(9, e10);
        } catch (IOException e11) {
            this.f3047c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f3054j = null;
            this.f3047c.a(8, e12);
        }
    }

    private void c() {
        if (!this.f3053i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            return null;
        }
        switch (i10) {
            case 24:
            case 25:
                return o.f3098e;
            case 26:
                return o.f3097d;
            case 27:
                return o.f3096c;
            case 28:
            case 29:
            case 30:
                return o.f3095b;
            case 31:
            case 32:
            case 33:
                return o.f3094a;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f3051g);
        } catch (FileNotFoundException e10) {
            this.f3047c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f3047c.a(7, e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f3047c.a(i10, obj);
    }

    private InputStream h(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f3047c.b(5, null);
            }
            return null;
        }
    }

    private d[] j(InputStream inputStream) {
        try {
            try {
                try {
                    d[] dVarArrW = m.w(inputStream, m.o(inputStream, m.f3082a), this.f3050f);
                    try {
                        inputStream.close();
                        return dVarArrW;
                    } catch (IOException e10) {
                        this.f3047c.a(7, e10);
                        return dVarArrW;
                    }
                } catch (Throwable th) {
                    try {
                        inputStream.close();
                    } catch (IOException e11) {
                        this.f3047c.a(7, e11);
                    }
                    throw th;
                }
            } catch (IOException e12) {
                this.f3047c.a(7, e12);
                inputStream.close();
                return null;
            } catch (IllegalStateException e13) {
                this.f3047c.a(8, e13);
                inputStream.close();
                return null;
            }
        } catch (IOException e14) {
            this.f3047c.a(7, e14);
        }
    }

    private static boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            return false;
        }
        if (i10 != 24 && i10 != 25) {
            switch (i10) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(final int i10, final Object obj) {
        this.f3046b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f3042a.g(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f3048d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.f3049e.canWrite()) {
            this.f3053i = true;
            return true;
        }
        l(4, null);
        return false;
    }

    public c i() {
        c cVarB;
        c();
        if (this.f3048d == null) {
            return this;
        }
        InputStream inputStreamF = f(this.f3045a);
        if (inputStreamF != null) {
            this.f3054j = j(inputStreamF);
        }
        d[] dVarArr = this.f3054j;
        return (dVarArr == null || !k() || (cVarB = b(dVarArr, this.f3048d)) == null) ? this : cVarB;
    }

    public c m() {
        d[] dVarArr = this.f3054j;
        byte[] bArr = this.f3048d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    m.E(byteArrayOutputStream, bArr);
                    if (!m.B(byteArrayOutputStream, bArr, dVarArr)) {
                        this.f3047c.a(5, null);
                        this.f3054j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f3055k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f3054j = null;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                this.f3047c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f3047c.a(8, e11);
            }
        }
        return this;
    }

    public boolean n() {
        byte[] bArr = this.f3055k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f3049e);
                    try {
                        e.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        this.f3055k = null;
                        this.f3054j = null;
                        return true;
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                this.f3055k = null;
                this.f3054j = null;
                throw th5;
            }
        } catch (FileNotFoundException e10) {
            l(6, e10);
            this.f3055k = null;
            this.f3054j = null;
            return false;
        } catch (IOException e11) {
            l(7, e11);
            this.f3055k = null;
            this.f3054j = null;
            return false;
        }
    }
}
