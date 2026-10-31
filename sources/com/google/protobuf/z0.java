package com.google.protobuf;

/* JADX INFO: compiled from: NewInstanceSchemas.java */
/* JADX INFO: loaded from: classes4.dex */
final class z0 {
    private static final x0 FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final x0 LITE_SCHEMA = new y0();

    z0() {
    }

    static x0 full() {
        return FULL_SCHEMA;
    }

    static x0 lite() {
        return LITE_SCHEMA;
    }

    private static x0 loadSchemaForFullRuntime() {
        try {
            return (x0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
