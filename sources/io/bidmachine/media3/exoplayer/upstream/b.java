package io.bidmachine.media3.exoplayer.upstream;

import java.io.IOException;
import n8.i;
import n8.j;

/* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes4.dex */
public interface b {

    /* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19810d;

        public a(int i10, int i11, int i12, int i13) {
            this.f19807a = i10;
            this.f19808b = i11;
            this.f19809c = i12;
            this.f19810d = i13;
        }

        public boolean a(int i10) {
            if (i10 == 1) {
                if (this.f19807a - this.f19808b <= 1) {
                    return false;
                }
            } else if (this.f19809c - this.f19810d <= 1) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.upstream.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
    public static final class C0329b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19812b;

        public C0329b(int i10, long j10) {
            x7.a.a(j10 >= 0);
            this.f19811a = i10;
            this.f19812b = j10;
        }
    }

    /* JADX INFO: compiled from: LoadErrorHandlingPolicy.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f19813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f19814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f19815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19816d;

        public c(i iVar, j jVar, IOException iOException, int i10) {
            this.f19813a = iVar;
            this.f19814b = jVar;
            this.f19815c = iOException;
            this.f19816d = i10;
        }
    }

    int a(int i10);

    C0329b b(a aVar, c cVar);

    long c(c cVar);

    default void d(long j10) {
    }
}
