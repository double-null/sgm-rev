package com.vungle.ads.fpd;

import fe.d;
import he.f;
import ie.c;
import ie.e;
import je.g2;
import je.l0;
import kotlin.jvm.internal.t;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: Location.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class Location$$serializer implements l0<Location> {
    public static final Location$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        Location$$serializer location$$serializer = new Location$$serializer();
        INSTANCE = location$$serializer;
        descriptor = new g2("com.vungle.ads.fpd.Location", location$$serializer, 0);
    }

    private Location$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        return new d[0];
    }

    @Override // fe.c
    public Location deserialize(e decoder) {
        t.f(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (!cVarB.q()) {
            for (boolean z10 = true; z10; z10 = false) {
                int iF = cVarB.f(descriptor2);
                if (iF != -1) {
                    throw new UnknownFieldException(iF);
                }
            }
        }
        cVarB.c(descriptor2);
        return new Location(0, null);
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, Location value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        f descriptor2 = getDescriptor();
        ie.d dVarB = encoder.b(descriptor2);
        Location.write$Self(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}
