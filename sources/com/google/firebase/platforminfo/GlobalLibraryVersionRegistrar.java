package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class GlobalLibraryVersionRegistrar {
    private static volatile GlobalLibraryVersionRegistrar INSTANCE;
    private final Set<e> infos = new HashSet();

    GlobalLibraryVersionRegistrar() {
    }

    public static GlobalLibraryVersionRegistrar getInstance() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = INSTANCE;
        if (globalLibraryVersionRegistrar == null) {
            synchronized (GlobalLibraryVersionRegistrar.class) {
                globalLibraryVersionRegistrar = INSTANCE;
                if (globalLibraryVersionRegistrar == null) {
                    globalLibraryVersionRegistrar = new GlobalLibraryVersionRegistrar();
                    INSTANCE = globalLibraryVersionRegistrar;
                }
            }
        }
        return globalLibraryVersionRegistrar;
    }

    Set<e> getRegisteredVersions() {
        Set<e> setUnmodifiableSet;
        synchronized (this.infos) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.infos);
        }
        return setUnmodifiableSet;
    }

    public void registerVersion(String str, String str2) {
        synchronized (this.infos) {
            this.infos.add(e.a(str, str2));
        }
    }
}
