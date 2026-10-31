package com.explorestack.protobuf;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionRegistry.java */
/* JADX INFO: loaded from: classes.dex */
public class w extends y {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final w f10840j = new w(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, b> f10841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, b> f10842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<a, b> f10843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<a, b> f10844i;

    /* JADX INFO: compiled from: ExtensionRegistry.java */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Descriptors.Descriptor f10845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10846b;

        a(Descriptors.Descriptor descriptor, int i10) {
            this.f10845a = descriptor;
            this.f10846b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10845a == aVar.f10845a && this.f10846b == aVar.f10846b;
        }

        public int hashCode() {
            return (this.f10845a.hashCode() * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f10846b;
        }
    }

    /* JADX INFO: compiled from: ExtensionRegistry.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Descriptors.FieldDescriptor f10847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Message f10848b;
    }

    private w() {
        this.f10841f = new HashMap();
        this.f10842g = new HashMap();
        this.f10843h = new HashMap();
        this.f10844i = new HashMap();
    }

    public static w g() {
        return f10840j;
    }

    @Deprecated
    public b d(Descriptors.Descriptor descriptor, int i10) {
        return f(descriptor, i10);
    }

    public b e(String str) {
        return this.f10841f.get(str);
    }

    public b f(Descriptors.Descriptor descriptor, int i10) {
        return this.f10843h.get(new a(descriptor, i10));
    }

    w(boolean z10) {
        super(y.f10875e);
        this.f10841f = Collections.emptyMap();
        this.f10842g = Collections.emptyMap();
        this.f10843h = Collections.emptyMap();
        this.f10844i = Collections.emptyMap();
    }
}
