package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: SafeObjectInputStream.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class SafeObjectInputStream extends ObjectInputStream {
    private final List<Class<?>> allowed;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeObjectInputStream(InputStream inputStream, List<? extends Class<?>> list) {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass desc) throws ClassNotFoundException, IOException {
        t.f(desc, "desc");
        Class<?> c10 = super.resolveClass(desc);
        if (this.allowed == null || Number.class.isAssignableFrom(c10) || t.a(String.class, c10) || t.a(Boolean.class, c10) || c10.isArray() || this.allowed.contains(c10)) {
            t.e(c10, "c");
            return c10;
        }
        throw new IOException("Deserialization is not allowed for " + desc.getName());
    }
}
