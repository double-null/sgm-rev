package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.internal.NativeProtocol;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: ProfileVerifier.java */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.d<c> f3084a = androidx.concurrent.futures.d.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f3085b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f3086c = null;

    /* JADX INFO: compiled from: ProfileVerifier.java */
    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: compiled from: ProfileVerifier.java */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f3087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f3088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f3089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f3090d;

        b(int i10, int i11, long j10, long j11) {
            this.f3087a = i10;
            this.f3088b = i11;
            this.f3089c = j10;
            this.f3090d = j11;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f3087a);
                dataOutputStream.writeInt(this.f3088b);
                dataOutputStream.writeLong(this.f3089c);
                dataOutputStream.writeLong(this.f3090d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3088b == bVar.f3088b && this.f3089c == bVar.f3089c && this.f3087a == bVar.f3087a && this.f3090d == bVar.f3090d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f3088b), Long.valueOf(this.f3089c), Integer.valueOf(this.f3087a), Long.valueOf(this.f3090d));
        }
    }

    /* JADX INFO: compiled from: ProfileVerifier.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f3091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f3092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f3093c;

        c(int i10, boolean z10, boolean z11) {
            this.f3091a = i10;
            this.f3093c = z11;
            this.f3092b = z10;
        }
    }

    private static long a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11) {
        c cVar = new c(i10, z10, z11);
        f3086c = cVar;
        f3084a.p(cVar);
        return f3086c;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:85:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static c c(Context context, boolean z10) {
        int i10;
        int i11;
        File file;
        boolean z11;
        File file2;
        long length;
        boolean z12;
        File file3;
        b bVarA;
        b bVar;
        int i12;
        c cVar;
        if (!z10 && (cVar = f3086c) != null) {
            return cVar;
        }
        synchronized (f3085b) {
            if (z10) {
                i10 = Build.VERSION.SDK_INT;
                i11 = 0;
                if (i10 >= 28) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    if (file.exists()) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    long jA = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        bVarA = b.a(file3);
                    } else {
                        bVarA = null;
                    }
                    if (bVarA == null) {
                        if (z11) {
                            i11 = 1;
                        } else if (z12) {
                            i11 = 2;
                        }
                    } else if (z11) {
                        i11 = 1;
                    } else if (z12) {
                        i11 = 2;
                    }
                    if (z10) {
                        i11 = 2;
                    }
                    if (bVarA != null) {
                        i11 = 3;
                    }
                    bVar = new b(1, i11, jA, length);
                    if (bVarA != null) {
                        bVar.b(file3);
                    } else {
                        bVar.b(file3);
                    }
                    return b(i11, z11, z12);
                }
                return b(262144, false, false);
            }
            c cVar2 = f3086c;
            if (cVar2 != null) {
                return cVar2;
            }
            i10 = Build.VERSION.SDK_INT;
            i11 = 0;
            if (i10 >= 28 && i10 != 30) {
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length3 = file.length();
                if (file.exists() || length3 <= 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists() || length <= 0) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                try {
                    long jA2 = a(context);
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            bVarA = b.a(file3);
                        } catch (IOException unused) {
                            return b(131072, z11, z12);
                        }
                    } else {
                        bVarA = null;
                    }
                    if (bVarA == null && bVarA.f3089c == jA2 && (i12 = bVarA.f3088b) != 2) {
                        i11 = i12;
                    } else if (z11) {
                        i11 = 1;
                    } else if (z12) {
                        i11 = 2;
                    }
                    if (z10 && z12 && i11 != 1) {
                        i11 = 2;
                    }
                    if (bVarA != null && bVarA.f3088b == 2 && i11 == 1 && length3 < bVarA.f3090d) {
                        i11 = 3;
                    }
                    bVar = new b(1, i11, jA2, length);
                    if (bVarA != null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (IOException unused2) {
                            i11 = 196608;
                        }
                    }
                    return b(i11, z11, z12);
                } catch (PackageManager.NameNotFoundException unused3) {
                    return b(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, z11, z12);
                }
            }
            return b(262144, false, false);
            throw th;
        }
    }
}
