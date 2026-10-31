package yd;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: compiled from: FlowExceptions.common.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i {
    public static final void a(AbortFlowException abortFlowException, Object obj) {
        if (abortFlowException.f21541a != obj) {
            throw abortFlowException;
        }
    }
}
