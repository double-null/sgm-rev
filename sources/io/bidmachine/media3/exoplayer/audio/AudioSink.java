package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import c8.b2;
import com.android.billingclient.gp.VRfCTjjLv;
import java.nio.ByteBuffer;
import rd.PSo.cNMUz;
import u7.q;
import u7.x;

/* JADX INFO: loaded from: classes4.dex */
public interface AudioSink {

    public static final class UnexpectedDiscontinuityException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18112b;

        public UnexpectedDiscontinuityException(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f18111a = j10;
            this.f18112b = j11;
        }
    }

    public static final class WriteException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q f18115c;

        public WriteException(int i10, q qVar, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f18114b = z10;
            this.f18113a = i10;
            this.f18115c = qVar;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f18119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f18120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f18121f;

        public a(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
            this.f18116a = i10;
            this.f18117b = i11;
            this.f18118c = i12;
            this.f18119d = z10;
            this.f18120e = z11;
            this.f18121f = i13;
        }
    }

    long A(boolean z10);

    int D(q qVar);

    void E();

    void F();

    void G(u7.d dVar);

    void H(q qVar, int i10, int[] iArr) throws ConfigurationException;

    void I(boolean z10);

    boolean a(q qVar);

    boolean b();

    void c(x xVar);

    x e();

    void flush();

    void n();

    boolean o();

    void p(int i10);

    void pause();

    long q();

    void reset();

    void s();

    void setVolume(float f10);

    void t(b bVar);

    default d u(q qVar) {
        return d.f18231d;
    }

    boolean w(ByteBuffer byteBuffer, long j10, int i10) throws WriteException, InitializationException;

    void x(u7.c cVar);

    void y() throws WriteException;

    public static final class ConfigurationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f18107a;

        public ConfigurationException(Throwable th, q qVar) {
            super(th);
            this.f18107a = qVar;
        }

        public ConfigurationException(String str, q qVar) {
            super(str);
            this.f18107a = qVar;
        }
    }

    public static final class InitializationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q f18110c;

        public InitializationException(String str, int i10, q qVar, boolean z10, Throwable th) {
            super(str, th);
            this.f18108a = i10;
            this.f18109b = z10;
            this.f18110c = qVar;
        }

        public InitializationException(int i10, int i11, int i12, int i13, q qVar, boolean z10, Exception exc) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(VRfCTjjLv.jqiulkFNpec);
            sb2.append(i10);
            sb2.append(" ");
            sb2.append(cNMUz.BllBQK);
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(")");
            sb2.append(" ");
            sb2.append(qVar);
            sb2.append(z10 ? " (recoverable)" : "");
            this(sb2.toString(), i10, qVar, z10, exc);
        }
    }

    public interface b {
        void a(boolean z10);

        void h(int i10, long j10, long j11);

        void j();

        default void f() {
        }

        default void g() {
        }

        default void i() {
        }

        default void k() {
        }

        default void b(Exception exc) {
        }

        default void c(long j10) {
        }

        default void d(a aVar) {
        }

        default void e(a aVar) {
        }
    }

    default void release() {
    }

    default void B(long j10) {
    }

    default void C(x7.h hVar) {
    }

    default void r(int i10) {
    }

    default void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
    }

    default void v(b2 b2Var) {
    }

    default void z(int i10, int i11) {
    }
}
