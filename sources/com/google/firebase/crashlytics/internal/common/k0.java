package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: compiled from: DeliveryMechanism.java */
/* JADX INFO: loaded from: classes4.dex */
public enum k0 {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12168a;

    k0(int i10) {
        this.f12168a = i10;
    }

    public static k0 c(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int e() {
        return this.f12168a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f12168a);
    }
}
