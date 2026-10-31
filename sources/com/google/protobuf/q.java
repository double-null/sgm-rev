package com.google.protobuf;

import com.google.protobuf.u.c;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchema.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class q<T extends u.c<T>> {
    q() {
    }

    abstract int extensionNumber(Map.Entry<?, ?> entry);

    abstract Object findExtensionByNumber(p pVar, s0 s0Var, int i10);

    abstract u<T> getExtensions(Object obj);

    abstract u<T> getMutableExtensions(Object obj);

    abstract boolean hasExtensions(s0 s0Var);

    abstract void makeImmutable(Object obj);

    abstract <UT, UB> UB parseExtension(Object obj, j1 j1Var, Object obj2, p pVar, u<T> uVar, UB ub2, r1<UT, UB> r1Var) throws IOException;

    abstract void parseLengthPrefixedMessageSetItem(j1 j1Var, Object obj, p pVar, u<T> uVar) throws IOException;

    abstract void parseMessageSetItem(i iVar, Object obj, p pVar, u<T> uVar) throws IOException;

    abstract void serializeExtension(y1 y1Var, Map.Entry<?, ?> entry) throws IOException;

    abstract void setExtensions(Object obj, u<T> uVar);
}
