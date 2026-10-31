package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import pb.vBC.NyXuoef;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.10.1 */
/* JADX INFO: loaded from: classes3.dex */
public class ListenerHolders {
    private final Set zaa = Collections.newSetFromMap(new WeakHashMap());

    public static <L> ListenerHolder<L> createListenerHolder(L l10, Looper looper, String str) {
        Preconditions.checkNotNull(l10, "Listener must not be null");
        Preconditions.checkNotNull(looper, NyXuoef.orRmucrY);
        Preconditions.checkNotNull(str, "Listener type must not be null");
        return new ListenerHolder<>(looper, l10, str);
    }

    public static <L> ListenerHolder.ListenerKey<L> createListenerKey(L l10, String str) {
        Preconditions.checkNotNull(l10, "Listener must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        Preconditions.checkNotEmpty(str, "Listener type must not be empty");
        return new ListenerHolder.ListenerKey<>(l10, str);
    }

    public final ListenerHolder zaa(Object obj, Looper looper, String str) {
        Set set = this.zaa;
        ListenerHolder listenerHolderCreateListenerHolder = createListenerHolder(obj, looper, "NO_TYPE");
        set.add(listenerHolderCreateListenerHolder);
        return listenerHolderCreateListenerHolder;
    }

    public final void zab() {
        Set set = this.zaa;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ListenerHolder) it.next()).clear();
        }
        set.clear();
    }

    public static <L> ListenerHolder<L> createListenerHolder(L l10, Executor executor, String str) {
        Preconditions.checkNotNull(l10, "Listener must not be null");
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(str, "Listener type must not be null");
        return new ListenerHolder<>(executor, l10, str);
    }
}
