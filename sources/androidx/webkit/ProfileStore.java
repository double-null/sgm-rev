package androidx.webkit;

import d1.b;
import e1.m;
import e1.s;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (s.f13891c0.c()) {
            return m.getInstance();
        }
        throw s.a();
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    b getOrCreateProfile(String str);

    b getProfile(String str);
}
