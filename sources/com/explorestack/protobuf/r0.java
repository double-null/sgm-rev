package com.explorestack.protobuf;

import java.util.List;

/* JADX INFO: compiled from: LazyStringList.java */
/* JADX INFO: loaded from: classes.dex */
public interface r0 extends w1 {
    void b(ByteString byteString);

    ByteString getByteString(int i10);

    Object getRaw(int i10);

    List<?> getUnderlyingElements();

    r0 getUnmodifiableView();
}
