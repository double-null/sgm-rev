package com.explorestack.protobuf;

/* JADX INFO: compiled from: ExtensionRegistryFactory.java */
/* JADX INFO: loaded from: classes.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class<?> f10861a = c();

    public static y a() {
        y yVarB = b("getEmptyRegistry");
        return yVarB != null ? yVarB : y.f10875e;
    }

    private static final y b(String str) {
        Class<?> cls = f10861a;
        if (cls == null) {
            return null;
        }
        try {
            return (y) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            w wVar = w.f10840j;
            return w.class;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
