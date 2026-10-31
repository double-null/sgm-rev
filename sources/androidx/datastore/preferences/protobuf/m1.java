package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSetLiteSchema.java */
/* JADX INFO: loaded from: classes.dex */
class m1 extends k1<l1, l1> {
    m1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public l1 g(Object obj) {
        return ((w) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(l1 l1Var) {
        return l1Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(l1 l1Var) {
        return l1Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public l1 k(l1 l1Var, l1 l1Var2) {
        if (l1.c().equals(l1Var2)) {
            return l1Var;
        }
        return l1.c().equals(l1Var) ? l1.j(l1Var, l1Var2) : l1Var.i(l1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public l1 n() {
        return l1.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, l1 l1Var) {
        p(obj, l1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, l1 l1Var) {
        ((w) obj).unknownFields = l1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public l1 r(l1 l1Var) {
        l1Var.h();
        return l1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(l1 l1Var, q1 q1Var) throws IOException {
        l1Var.p(q1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(l1 l1Var, q1 q1Var) throws IOException {
        l1Var.r(q1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    void j(Object obj) {
        g(obj).h();
    }

    @Override // androidx.datastore.preferences.protobuf.k1
    boolean q(d1 d1Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(l1 l1Var, int i10, int i11) {
        l1Var.n(p1.c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(l1 l1Var, int i10, long j10) {
        l1Var.n(p1.c(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(l1 l1Var, int i10, l1 l1Var2) {
        l1Var.n(p1.c(i10, 3), l1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(l1 l1Var, int i10, g gVar) {
        l1Var.n(p1.c(i10, 2), gVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(l1 l1Var, int i10, long j10) {
        l1Var.n(p1.c(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.datastore.preferences.protobuf.k1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public l1 f(Object obj) {
        l1 l1VarG = g(obj);
        if (l1VarG != l1.c()) {
            return l1VarG;
        }
        l1 l1VarK = l1.k();
        p(obj, l1VarK);
        return l1VarK;
    }
}
