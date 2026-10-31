package com.google.firebase.crashlytics.internal.common;

import android.os.Process;

/* JADX INFO: compiled from: BackgroundPriorityRunnable.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements Runnable {
    protected abstract void p();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        p();
    }
}
