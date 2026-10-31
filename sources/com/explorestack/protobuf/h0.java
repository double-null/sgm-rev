package com.explorestack.protobuf;

/* JADX INFO: compiled from: GeneratedMessageInfoFactory.java */
/* JADX INFO: loaded from: classes.dex */
class h0 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h0 f10468a = new h0();

    private h0() {
    }

    public static h0 a() {
        return f10468a;
    }

    @Override // com.explorestack.protobuf.f1
    public boolean isSupported(Class<?> cls) {
        return i0.class.isAssignableFrom(cls);
    }

    @Override // com.explorestack.protobuf.f1
    public e1 messageInfoFor(Class<?> cls) {
        if (!i0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (e1) i0.g(cls.asSubclass(i0.class)).b();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }
}
