package com.google.common.base;

/* JADX INFO: compiled from: Ticker.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    private static final z SYSTEM_TICKER = new a();

    /* JADX INFO: compiled from: Ticker.java */
    class a extends z {
        a() {
        }

        @Override // com.google.common.base.z
        public long read() {
            return System.nanoTime();
        }
    }

    protected z() {
    }

    public static z systemTicker() {
        return SYSTEM_TICKER;
    }

    public abstract long read();
}
