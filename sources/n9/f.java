package n9;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.io.IOException;
import v8.q;
import x7.a0;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes4.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f22915a = new a0(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22916b;

    private long a(q qVar) throws IOException {
        int i10 = 0;
        qVar.n(this.f22915a.e(), 0, 1);
        int i11 = this.f22915a.e()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        qVar.n(this.f22915a.e(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f22915a.e()[i10] & 255) + (i14 << 8);
        }
        this.f22916b += i13 + 1;
        return i14;
    }

    public boolean b(q qVar) throws IOException {
        long length = qVar.getLength();
        long j10 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (length != -1 && length <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j10 = length;
        }
        int i10 = (int) j10;
        qVar.n(this.f22915a.e(), 0, 4);
        long J = this.f22915a.J();
        this.f22916b = 4;
        while (J != 440786851) {
            int i11 = this.f22916b + 1;
            this.f22916b = i11;
            if (i11 == i10) {
                return false;
            }
            qVar.n(this.f22915a.e(), 0, 1);
            J = ((J << 8) & (-256)) | ((long) (this.f22915a.e()[0] & 255));
        }
        long jA = a(qVar);
        long j11 = this.f22916b;
        if (jA == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j11 + jA >= length) {
            return false;
        }
        while (true) {
            int i12 = this.f22916b;
            long j12 = j11 + jA;
            if (i12 >= j12) {
                return ((long) i12) == j12;
            }
            if (a(qVar) == Long.MIN_VALUE) {
                return false;
            }
            long jA2 = a(qVar);
            if (jA2 < 0 || jA2 > 2147483647L) {
                return false;
            }
            if (jA2 != 0) {
                int i13 = (int) jA2;
                qVar.g(i13);
                this.f22916b += i13;
            }
        }
    }
}
