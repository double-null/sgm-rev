package io.bidmachine.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: compiled from: LoadingInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f19125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19126c;

    /* JADX INFO: compiled from: LoadingInfo.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f19127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f19128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f19129c;

        public k1 d() {
            return new k1(this);
        }

        public b e(long j10) {
            x7.a.a(j10 >= 0 || j10 == -9223372036854775807L);
            this.f19129c = j10;
            return this;
        }

        public b f(long j10) {
            this.f19127a = j10;
            return this;
        }

        public b g(float f10) {
            x7.a.a(f10 > 0.0f || f10 == -3.4028235E38f);
            this.f19128b = f10;
            return this;
        }

        public b() {
            this.f19127a = -9223372036854775807L;
            this.f19128b = -3.4028235E38f;
            this.f19129c = -9223372036854775807L;
        }

        private b(k1 k1Var) {
            this.f19127a = k1Var.f19124a;
            this.f19128b = k1Var.f19125b;
            this.f19129c = k1Var.f19126c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return this.f19124a == k1Var.f19124a && this.f19125b == k1Var.f19125b && this.f19126c == k1Var.f19126c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f19124a), Float.valueOf(this.f19125b), Long.valueOf(this.f19126c));
    }

    private k1(b bVar) {
        this.f19124a = bVar.f19127a;
        this.f19125b = bVar.f19128b;
        this.f19126c = bVar.f19129c;
    }
}
