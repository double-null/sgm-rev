package androidx.room;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: compiled from: InvalidationLiveDataContainer.java */
/* JADX INFO: loaded from: classes.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set<LiveData> f3465a = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f3466b;

    d(h hVar) {
        this.f3466b = hVar;
    }
}
