package io.bidmachine.media3.common;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import x7.l0;

/* JADX INFO: loaded from: classes4.dex */
public final class PriorityTaskManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f17929a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f17930b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17931c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
    }

    public void a(int i10) {
        synchronized (this.f17929a) {
            this.f17930b.add(Integer.valueOf(i10));
            this.f17931c = Math.max(this.f17931c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f17929a) {
            this.f17930b.remove(Integer.valueOf(i10));
            this.f17931c = this.f17930b.isEmpty() ? Integer.MIN_VALUE : ((Integer) l0.i(this.f17930b.peek())).intValue();
            this.f17929a.notifyAll();
        }
    }
}
