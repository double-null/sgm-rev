package io.bidmachine.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import c8.b2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: ExoMediaDrm.java */
/* JADX INFO: loaded from: classes4.dex */
public interface m {

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f18584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f18585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f18586c;

        public a(byte[] bArr, String str, int i10) {
            this.f18584a = bArr;
            this.f18585b = str;
            this.f18586c = i10;
        }

        public byte[] a() {
            return this.f18584a;
        }

        public String b() {
            return this.f18585b;
        }
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface b {
        void a(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public interface c {
        m a(UUID uuid);
    }

    /* JADX INFO: compiled from: ExoMediaDrm.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f18587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f18588b;

        public d(byte[] bArr, String str) {
            this.f18587a = bArr;
            this.f18588b = str;
        }

        public byte[] a() {
            return this.f18587a;
        }

        public String b() {
            return this.f18588b;
        }
    }

    Map<String, String> a(byte[] bArr);

    d b();

    byte[] c() throws MediaDrmException;

    void d(byte[] bArr, byte[] bArr2);

    void e(byte[] bArr) throws DeniedByServerException;

    int f();

    a8.b h(byte[] bArr) throws MediaCryptoException;

    boolean i(byte[] bArr, String str);

    void j(byte[] bArr);

    void k(b bVar);

    byte[] l(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    a m(byte[] bArr, List<u7.l.b> list, int i10, HashMap<String, String> map) throws NotProvisionedException;

    void release();

    default void g(byte[] bArr, b2 b2Var) {
    }
}
