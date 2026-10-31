package com.unity3d.player;

import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes4.dex */
final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f12755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Member f12759e;

    M(Class cls, String str, String str2) {
        this.f12755a = cls;
        this.f12756b = str;
        this.f12757c = str2;
        this.f12758d = str2.hashCode() + ((str.hashCode() + ((cls.hashCode() + 527) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m10 = (M) obj;
        return this.f12758d == m10.f12758d && this.f12757c.equals(m10.f12757c) && this.f12756b.equals(m10.f12756b) && this.f12755a.equals(m10.f12755a);
    }

    public final int hashCode() {
        return this.f12758d;
    }
}
