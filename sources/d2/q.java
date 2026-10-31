package d2;

import java.util.Set;

/* JADX INFO: compiled from: TransportFactoryImpl.java */
/* JADX INFO: loaded from: classes3.dex */
final class q implements b2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<b2.b> f13229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f13230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f13231c;

    q(Set<b2.b> set, p pVar, t tVar) {
        this.f13229a = set;
        this.f13230b = pVar;
        this.f13231c = tVar;
    }

    @Override // b2.i
    public <T> b2.h<T> a(String str, Class<T> cls, b2.b bVar, b2.g<T, byte[]> gVar) {
        if (this.f13229a.contains(bVar)) {
            return new s(this.f13230b, str, bVar, gVar, this.f13231c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f13229a));
    }
}
