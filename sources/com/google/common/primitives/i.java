package com.google.common.primitives;

import com.google.common.base.p;

/* JADX INFO: compiled from: UnsignedBytes.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i {
    public static byte a(long j10) {
        p.h((j10 >> 8) == 0, "out of range: %s", j10);
        return (byte) j10;
    }

    public static int b(byte b10) {
        return b10 & 255;
    }
}
