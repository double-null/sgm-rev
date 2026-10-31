package com.applovin.shadow.okhttp3.internal.concurrent;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import id.a;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: TaskLogger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TaskLoggerKt {
    public static final String formatDuration(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        }
        l0 l0Var = l0.f21527a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        t.e(str2, "format(format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(taskQueue.getName$okhttp());
        sb2.append(' ');
        l0 l0Var = l0.f21527a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        t.e(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(task.getName());
        logger.fine(sb2.toString());
    }

    public static final <T> T logElapsed(Task task, TaskQueue queue, a<? extends T> block) {
        long jNanoTime;
        t.f(task, "task");
        t.f(queue, "queue");
        t.f(block, "block");
        boolean zIsLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = queue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, queue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T tInvoke = block.invoke();
            r.b(1);
            if (zIsLoggable) {
                long jNanoTime2 = queue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime;
                new StringBuilder().append("finished run in ");
            }
            return tInvoke;
        } finally {
            r.b(1);
            if (zIsLoggable) {
                log(task, queue, "failed a run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            r.a(1);
        }
    }

    public static final void taskLog(Task task, TaskQueue queue, a<String> messageBlock) {
        t.f(task, "task");
        t.f(queue, "queue");
        t.f(messageBlock, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, queue, messageBlock.invoke());
        }
    }
}
