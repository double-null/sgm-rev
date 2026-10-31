package io.bidmachine;

/* JADX INFO: compiled from: SessionManagerKtWrapper.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class SessionManagerKtWrapper {
    private final SessionManager sessionManager;

    public SessionManagerKtWrapper(SessionManager sessionManager) {
        kotlin.jvm.internal.t.f(sessionManager, "sessionManager");
        this.sessionManager = sessionManager;
    }

    public final /* synthetic */ long getSessionDurationMs() {
        return this.sessionManager.getSessionDurationMs();
    }

    public final /* synthetic */ long getSessionStartTime() {
        return this.sessionManager.getSessionStartTime();
    }
}
