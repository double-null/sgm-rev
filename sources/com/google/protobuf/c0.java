package com.google.protobuf;

import java.nio.Buffer;

/* JADX INFO: compiled from: Java8Compatibility.java */
/* JADX INFO: loaded from: classes4.dex */
final class c0 {
    private c0() {
    }

    static void clear(Buffer buffer) {
        buffer.clear();
    }

    static void flip(Buffer buffer) {
        buffer.flip();
    }

    static void limit(Buffer buffer, int i10) {
        buffer.limit(i10);
    }

    static void mark(Buffer buffer) {
        buffer.mark();
    }

    static void position(Buffer buffer, int i10) {
        buffer.position(i10);
    }

    static void reset(Buffer buffer) {
        buffer.reset();
    }
}
