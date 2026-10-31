package com.google.protobuf;

/* JADX INFO: compiled from: MapFieldSchemas.java */
/* JADX INFO: loaded from: classes4.dex */
final class p0 {
    private static final n0 FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final n0 LITE_SCHEMA = new o0();

    p0() {
    }

    static n0 full() {
        return FULL_SCHEMA;
    }

    static n0 lite() {
        return LITE_SCHEMA;
    }

    private static n0 loadSchemaForFullRuntime() {
        try {
            return (n0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
