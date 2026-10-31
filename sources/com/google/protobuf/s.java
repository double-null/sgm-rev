package com.google.protobuf;

/* JADX INFO: compiled from: ExtensionSchemas.java */
/* JADX INFO: loaded from: classes4.dex */
final class s {
    private static final q<?> LITE_SCHEMA = new r();
    private static final q<?> FULL_SCHEMA = loadSchemaForFullRuntime();

    s() {
    }

    static q<?> full() {
        q<?> qVar = FULL_SCHEMA;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static q<?> lite() {
        return LITE_SCHEMA;
    }

    private static q<?> loadSchemaForFullRuntime() {
        try {
            return (q) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
