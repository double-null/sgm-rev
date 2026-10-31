package com.facebook.bolts;

import com.applovin.shadow.okio.internal.MoA.edUJlCZxhVnO;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import kotlin.collections.t;

/* JADX INFO: compiled from: AggregateException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AggregateException extends Exception {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final List<Throwable> innerThrowables;

    /* JADX INFO: compiled from: AggregateException.kt */
    /* JADX INFO: loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public AggregateException(String str, List<? extends Throwable> list) {
        super(str, (list == null || !(list.isEmpty() ^ true)) ? null : list.get(0));
        List<Throwable> listUnmodifiableList = Collections.unmodifiableList(list == null ? t.k() : list);
        kotlin.jvm.internal.t.e(listUnmodifiableList, "unmodifiableList(innerThrowables ?: emptyList())");
        this.innerThrowables = listUnmodifiableList;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream err) {
        kotlin.jvm.internal.t.f(err, "err");
        super.printStackTrace(err);
        int i10 = -1;
        for (Throwable th : this.innerThrowables) {
            err.append("\n");
            err.append("  Inner throwable #");
            i10++;
            err.append((CharSequence) String.valueOf(i10));
            err.append((CharSequence) edUJlCZxhVnO.HyQsxFgCxFHbB);
            if (th != null) {
                th.printStackTrace(err);
            }
            err.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter err) {
        kotlin.jvm.internal.t.f(err, "err");
        super.printStackTrace(err);
        int i10 = -1;
        for (Throwable th : this.innerThrowables) {
            err.append("\n");
            err.append("  Inner throwable #");
            i10++;
            err.append((CharSequence) String.valueOf(i10));
            err.append(": ");
            if (th != null) {
                th.printStackTrace(err);
            }
            err.append("\n");
        }
    }
}
