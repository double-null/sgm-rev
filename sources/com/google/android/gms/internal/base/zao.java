package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public interface zao {
    ExecutorService zaa(int i10, int i11);

    ExecutorService zab(int i10, ThreadFactory threadFactory, int i11);

    ExecutorService zac(ThreadFactory threadFactory, int i10);
}
