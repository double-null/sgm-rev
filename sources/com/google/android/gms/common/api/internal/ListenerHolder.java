package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class ListenerHolder<L> {
    private final Executor zaa;
    private volatile ListenerKey zab;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
    public static final class ListenerKey<L> {
        private final Object zaa;
        private final String zab;

        ListenerKey(L l10, String str) {
            this.zaa = l10;
            this.zab = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.zaa == listenerKey.zaa && this.zab.equals(listenerKey.zab);
        }

        public int hashCode() {
            return (System.identityHashCode(this.zaa) * 31) + this.zab.hashCode();
        }

        public String toIdString() {
            int iIdentityHashCode = System.identityHashCode(this.zaa);
            String str = this.zab;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
            sb2.append(str);
            sb2.append("@");
            sb2.append(iIdentityHashCode);
            return sb2.toString();
        }

        final /* synthetic */ Object zaa() {
            return this.zaa;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
    public interface Notifier<L> {
        void notifyListener(L l10);

        void onNotifyListenerFailed();
    }

    ListenerHolder(Looper looper, L l10, String str) {
        this.zaa = new HandlerExecutor(looper);
        this.zab = new ListenerKey(Preconditions.checkNotNull(l10, "Listener must not be null"), Preconditions.checkNotEmpty(str));
    }

    public void clear() {
        this.zab = null;
    }

    public ListenerKey<L> getListenerKey() {
        return this.zab;
    }

    public boolean hasListener() {
        return this.zab != null;
    }

    public void notifyListener(final Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.zaa.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zabv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zaa.zaa(notifier);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zaa(Notifier notifier) {
        ListenerKey listenerKey = this.zab;
        if (listenerKey == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(listenerKey.zaa());
        } catch (RuntimeException e10) {
            notifier.onNotifyListenerFailed();
            throw e10;
        }
    }

    ListenerHolder(Executor executor, L l10, String str) {
        this.zaa = (Executor) Preconditions.checkNotNull(executor, "Executor must not be null");
        this.zab = new ListenerKey(Preconditions.checkNotNull(l10, "Listener must not be null"), Preconditions.checkNotEmpty(str));
    }
}
