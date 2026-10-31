package com.google.protobuf;

/* JADX INFO: compiled from: RawMessageInfo.java */
/* JADX INFO: loaded from: classes4.dex */
final class i1 implements q0 {
    private static final int IS_EDITION_BIT = 4;
    private static final int IS_PROTO2_BIT = 1;
    private final s0 defaultInstance;
    private final int flags;
    private final String info;
    private final Object[] objects;

    i1(s0 s0Var, String str, Object[] objArr) {
        this.defaultInstance = s0Var;
        this.info = str;
        this.objects = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.flags = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.flags = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.protobuf.q0
    public s0 getDefaultInstance() {
        return this.defaultInstance;
    }

    Object[] getObjects() {
        return this.objects;
    }

    String getStringInfo() {
        return this.info;
    }

    @Override // com.google.protobuf.q0
    public e1 getSyntax() {
        int i10 = this.flags;
        if ((i10 & 1) != 0) {
            return e1.PROTO2;
        }
        return (i10 & 4) == 4 ? e1.EDITIONS : e1.PROTO3;
    }

    @Override // com.google.protobuf.q0
    public boolean isMessageSetWireFormat() {
        return (this.flags & 2) == 2;
    }
}
