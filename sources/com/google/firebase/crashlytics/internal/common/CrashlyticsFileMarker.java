package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
class CrashlyticsFileMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileStore f12081b;

    public CrashlyticsFileMarker(String str, FileStore fileStore) {
        this.f12080a = str;
        this.f12081b = fileStore;
    }

    private File b() {
        return this.f12081b.g(this.f12080a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            z2.f.f().e("Error creating marker: " + this.f12080a, e10);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
