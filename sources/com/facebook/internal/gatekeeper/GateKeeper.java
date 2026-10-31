package com.facebook.internal.gatekeeper;

import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: GateKeeper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GateKeeper {
    private final String name;
    private final boolean value;

    public static /* synthetic */ GateKeeper copy$default(GateKeeper gateKeeper, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gateKeeper.name;
        }
        if ((i10 & 2) != 0) {
            z10 = gateKeeper.value;
        }
        return gateKeeper.copy(str, z10);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.value;
    }

    public final GateKeeper copy(String name, boolean z10) {
        t.f(name, "name");
        return new GateKeeper(name, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GateKeeper)) {
            return false;
        }
        GateKeeper gateKeeper = (GateKeeper) obj;
        return t.a(this.name, gateKeeper.name) && this.value == gateKeeper.value;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        boolean z10 = this.value;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public String toString() {
        return "GateKeeper(name=" + this.name + ", value=" + this.value + ')';
    }

    public GateKeeper(String str, boolean z10) {
        t.f(str, UICvx.Jepj);
        this.name = str;
        this.value = z10;
    }
}
