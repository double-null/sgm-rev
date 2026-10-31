package com.google.protobuf;

import com.google.protobuf.s0;

/* JADX INFO: compiled from: ExtensionLite.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n<ContainingType extends s0, Type> {
    public abstract Type getDefaultValue();

    public abstract x1.b getLiteType();

    public abstract s0 getMessageDefaultInstance();

    public abstract int getNumber();

    boolean isLite() {
        return true;
    }

    public abstract boolean isRepeated();
}
