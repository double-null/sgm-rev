package com.explorestack.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSetLiteSchema.java */
/* JADX INFO: loaded from: classes.dex */
class w2 extends t2<v2, v2> {
    w2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public v2 g(Object obj) {
        return ((i0) obj).f10476a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(v2 v2Var) {
        return v2Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(v2 v2Var) {
        return v2Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public v2 k(v2 v2Var, v2 v2Var2) {
        return v2Var2.equals(v2.c()) ? v2Var : v2.i(v2Var, v2Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public v2 n() {
        return v2.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, v2 v2Var) {
        p(obj, v2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, v2 v2Var) {
        ((i0) obj).f10476a = v2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public v2 r(v2 v2Var) {
        v2Var.h();
        return v2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(v2 v2Var, e3 e3Var) throws IOException {
        v2Var.o(e3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(v2 v2Var, e3 e3Var) throws IOException {
        v2Var.q(e3Var);
    }

    @Override // com.explorestack.protobuf.t2
    void j(Object obj) {
        g(obj).h();
    }

    @Override // com.explorestack.protobuf.t2
    boolean q(y1 y1Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(v2 v2Var, int i10, int i11) {
        v2Var.m(c3.c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(v2 v2Var, int i10, long j10) {
        v2Var.m(c3.c(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(v2 v2Var, int i10, v2 v2Var2) {
        v2Var.m(c3.c(i10, 3), v2Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(v2 v2Var, int i10, ByteString byteString) {
        v2Var.m(c3.c(i10, 2), byteString);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(v2 v2Var, int i10, long j10) {
        v2Var.m(c3.c(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public v2 f(Object obj) {
        v2 v2VarG = g(obj);
        if (v2VarG != v2.c()) {
            return v2VarG;
        }
        v2 v2VarJ = v2.j();
        p(obj, v2VarJ);
        return v2VarJ;
    }
}
