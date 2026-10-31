package e0;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: SharedCounter.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f13578b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final NativeSharedCounter f13579c = new NativeSharedCounter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f13580a;

    /* JADX INFO: compiled from: SharedCounter.android.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final h0 b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            int fd2 = parcelFileDescriptor.getFd();
            if (c().nativeTruncateFile(fd2) != 0) {
                throw new IOException("Failed to truncate counter file");
            }
            long jNativeCreateSharedCounter = c().nativeCreateSharedCounter(fd2);
            if (jNativeCreateSharedCounter >= 0) {
                return new h0(jNativeCreateSharedCounter, null);
            }
            throw new IOException("Failed to mmap counter file");
        }

        public final h0 a(id.a<? extends File> produceFile) throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            kotlin.jvm.internal.t.f(produceFile, "produceFile");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open(produceFile.invoke(), 939524096);
                try {
                    h0 h0VarB = b(parcelFileDescriptorOpen);
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    return h0VarB;
                } catch (Throwable th) {
                    th = th;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptorOpen = null;
            }
        }

        public final NativeSharedCounter c() {
            return h0.f13579c;
        }

        public final void d() {
            System.loadLibrary("datastore_shared_counter");
        }
    }

    public /* synthetic */ h0(long j10, kotlin.jvm.internal.k kVar) {
        this(j10);
    }

    public final int b() {
        return f13579c.nativeGetCounterValue(this.f13580a);
    }

    public final int c() {
        return f13579c.nativeIncrementAndGetCounterValue(this.f13580a);
    }

    private h0(long j10) {
        this.f13580a = j10;
    }
}
