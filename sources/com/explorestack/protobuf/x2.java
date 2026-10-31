package com.explorestack.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSetSchema.java */
/* JADX INFO: loaded from: classes.dex */
class x2 extends t2<u2, u2.b> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public u2 g(Object obj) {
        return ((j0) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(u2 u2Var) {
        return u2Var.getSerializedSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(u2 u2Var) {
        return u2Var.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public u2 k(u2 u2Var, u2 u2Var2) {
        return u2Var.toBuilder().u(u2Var2).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public u2.b n() {
        return u2.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, u2.b bVar) {
        ((j0) obj).unknownFields = bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, u2 u2Var) {
        ((j0) obj).unknownFields = u2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public u2 r(u2.b bVar) {
        return bVar.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(u2 u2Var, e3 e3Var) throws IOException {
        u2Var.m(e3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(u2 u2Var, e3 e3Var) throws IOException {
        u2Var.n(e3Var);
    }

    @Override // com.explorestack.protobuf.t2
    boolean q(y1 y1Var) {
        return y1Var.shouldDiscardUnknownFields();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(u2.b bVar, int i10, int i11) {
        bVar.n(i10, u2.c.t().b(i11).g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(u2.b bVar, int i10, long j10) {
        bVar.n(i10, u2.c.t().c(j10).g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(u2.b bVar, int i10, u2 u2Var) {
        bVar.n(i10, u2.c.t().d(u2Var).g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(u2.b bVar, int i10, ByteString byteString) {
        bVar.n(i10, u2.c.t().e(byteString).g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(u2.b bVar, int i10, long j10) {
        bVar.n(i10, u2.c.t().f(j10).g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.explorestack.protobuf.t2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public u2.b f(Object obj) {
        return ((j0) obj).unknownFields.toBuilder();
    }

    @Override // com.explorestack.protobuf.t2
    void j(Object obj) {
    }
}
