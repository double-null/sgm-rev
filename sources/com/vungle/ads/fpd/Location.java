package com.vungle.ads.fpd;

import fe.d;
import fe.l;
import he.f;
import je.b2;
import je.q2;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Location.kt */
/* JADX INFO: loaded from: classes4.dex */
@l
public final class Location {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: Location.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final d<Location> serializer() {
            return Location$$serializer.INSTANCE;
        }
    }

    public Location() {
    }

    public static final void write$Self(Location self, ie.d output, f serialDesc) {
        t.f(self, "self");
        t.f(output, "output");
        t.f(serialDesc, "serialDesc");
    }

    public final Location setCountry(String country) {
        t.f(country, "country");
        return this;
    }

    public final Location setRegionState(String regionState) {
        t.f(regionState, "regionState");
        return this;
    }

    public /* synthetic */ Location(int i10, q2 q2Var) {
        if ((i10 & 0) != 0) {
            b2.a(i10, 0, Location$$serializer.INSTANCE.getDescriptor());
        }
    }

    public final Location setDma(int i10) {
        return this;
    }
}
