package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: StructuralMessageInfo.java */
/* JADX INFO: loaded from: classes4.dex */
final class p1 implements q0 {
    private final int[] checkInitialized;
    private final s0 defaultInstance;
    private final t[] fields;
    private final boolean messageSetWireFormat;
    private final e1 syntax;

    p1(e1 e1Var, boolean z10, int[] iArr, t[] tVarArr, Object obj) {
        this.syntax = e1Var;
        this.messageSetWireFormat = z10;
        this.checkInitialized = iArr;
        this.fields = tVarArr;
        this.defaultInstance = (s0) a0.checkNotNull(obj, "defaultInstance");
    }

    public static a newBuilder() {
        return new a();
    }

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    @Override // com.google.protobuf.q0
    public s0 getDefaultInstance() {
        return this.defaultInstance;
    }

    public t[] getFields() {
        return this.fields;
    }

    @Override // com.google.protobuf.q0
    public e1 getSyntax() {
        return this.syntax;
    }

    @Override // com.google.protobuf.q0
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }

    public static a newBuilder(int i10) {
        return new a(i10);
    }

    /* JADX INFO: compiled from: StructuralMessageInfo.java */
    public static final class a {
        private int[] checkInitialized;
        private Object defaultInstance;
        private final List<t> fields;
        private boolean messageSetWireFormat;
        private e1 syntax;
        private boolean wasBuilt;

        public a() {
            this.checkInitialized = null;
            this.fields = new ArrayList();
        }

        public p1 build() {
            if (this.wasBuilt) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.syntax == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.wasBuilt = true;
            Collections.sort(this.fields);
            return new p1(this.syntax, this.messageSetWireFormat, this.checkInitialized, (t[]) this.fields.toArray(new t[0]), this.defaultInstance);
        }

        public void withCheckInitialized(int[] iArr) {
            this.checkInitialized = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.defaultInstance = obj;
        }

        public void withField(t tVar) {
            if (this.wasBuilt) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.fields.add(tVar);
        }

        public void withMessageSetWireFormat(boolean z10) {
            this.messageSetWireFormat = z10;
        }

        public void withSyntax(e1 e1Var) {
            this.syntax = (e1) a0.checkNotNull(e1Var, "syntax");
        }

        public a(int i10) {
            this.checkInitialized = null;
            this.fields = new ArrayList(i10);
        }
    }
}
