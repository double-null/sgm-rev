package com.google.protobuf;

/* JADX INFO: compiled from: GeneratedMessageInfoFactory.java */
/* JADX INFO: loaded from: classes4.dex */
class x implements r0 {
    private static final x instance = new x();

    private x() {
    }

    public static x getInstance() {
        return instance;
    }

    @Override // com.google.protobuf.r0
    public boolean isSupported(Class<?> cls) {
        return y.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.r0
    public q0 messageInfoFor(Class<?> cls) {
        if (!y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (q0) y.getDefaultInstance(cls.asSubclass(y.class)).buildMessageInfo();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }
}
