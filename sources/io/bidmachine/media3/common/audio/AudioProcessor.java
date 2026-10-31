package io.bidmachine.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import u7.q;
import x7.l0;

/* JADX INFO: loaded from: classes4.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f17933a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f17934a;

        public UnhandledAudioFormatException(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public UnhandledAudioFormatException(String str, a aVar) {
            super(str + " " + aVar);
            this.f17934a = aVar;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f17935e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17939d;

        public a(q qVar) {
            this(qVar.F, qVar.E, qVar.G);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17936a == aVar.f17936a && this.f17937b == aVar.f17937b && this.f17938c == aVar.f17938c;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f17936a), Integer.valueOf(this.f17937b), Integer.valueOf(this.f17938c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f17936a + ", channelCount=" + this.f17937b + ", encoding=" + this.f17938c + ']';
        }

        public a(int i10, int i11, int i12) {
            this.f17936a = i10;
            this.f17937b = i11;
            this.f17938c = i12;
            this.f17939d = l0.G0(i12) ? l0.k0(i12, i11) : -1;
        }
    }

    boolean b();

    boolean c();

    a d(a aVar) throws UnhandledAudioFormatException;

    ByteBuffer e();

    void f(ByteBuffer byteBuffer);

    void flush();

    void g();

    void reset();
}
