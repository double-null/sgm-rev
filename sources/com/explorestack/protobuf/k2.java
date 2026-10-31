package com.explorestack.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: StructuralMessageInfo.java */
/* JADX INFO: loaded from: classes.dex */
final class k2 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u1 f10610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f10611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f10612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0[] f10613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MessageLite f10614e;

    /* JADX INFO: compiled from: StructuralMessageInfo.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d0> f10615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private u1 f10616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f10617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f10618d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f10619e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f10620f;

        public a(int i10) {
            this.f10615a = new ArrayList(i10);
        }

        public k2 a() {
            if (this.f10617c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f10616b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.f10617c = true;
            Collections.sort(this.f10615a);
            return new k2(this.f10616b, this.f10618d, this.f10619e, (d0[]) this.f10615a.toArray(new d0[0]), this.f10620f);
        }

        public void b(int[] iArr) {
            this.f10619e = iArr;
        }

        public void c(Object obj) {
            this.f10620f = obj;
        }

        public void d(d0 d0Var) {
            if (this.f10617c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f10615a.add(d0Var);
        }

        public void e(boolean z10) {
            this.f10618d = z10;
        }

        public void f(u1 u1Var) {
            this.f10616b = (u1) l0.b(u1Var, "syntax");
        }
    }

    k2(u1 u1Var, boolean z10, int[] iArr, d0[] d0VarArr, Object obj) {
        this.f10610a = u1Var;
        this.f10611b = z10;
        this.f10612c = iArr;
        this.f10613d = d0VarArr;
        this.f10614e = (MessageLite) l0.b(obj, "defaultInstance");
    }

    public static a c(int i10) {
        return new a(i10);
    }

    public int[] a() {
        return this.f10612c;
    }

    public d0[] b() {
        return this.f10613d;
    }

    @Override // com.explorestack.protobuf.e1
    public MessageLite getDefaultInstance() {
        return this.f10614e;
    }

    @Override // com.explorestack.protobuf.e1
    public u1 getSyntax() {
        return this.f10610a;
    }

    @Override // com.explorestack.protobuf.e1
    public boolean isMessageSetWireFormat() {
        return this.f10611b;
    }
}
