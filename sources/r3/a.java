package r3;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: AtProtobuf.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d.a f24868b = d.a.DEFAULT;

    /* JADX INFO: renamed from: r3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AtProtobuf.java */
    private static final class C0404a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.a f24870b;

        C0404a(int i10, d.a aVar) {
            this.f24869a = i10;
            this.f24870b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f24869a == dVar.tag() && this.f24870b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f24869a) + (this.f24870b.hashCode() ^ 2041407134);
        }

        @Override // r3.d
        public d.a intEncoding() {
            return this.f24870b;
        }

        @Override // r3.d
        public int tag() {
            return this.f24869a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f24869a + "intEncoding=" + this.f24870b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0404a(this.f24867a, this.f24868b);
    }

    public a c(int i10) {
        this.f24867a = i10;
        return this;
    }
}
