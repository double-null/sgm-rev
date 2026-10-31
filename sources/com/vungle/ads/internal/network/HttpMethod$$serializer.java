package com.vungle.ads.internal.network;

import fe.d;
import he.f;
import ie.e;
import je.f0;
import je.l0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: TpatSender.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class HttpMethod$$serializer implements l0<HttpMethod> {
    public static final HttpMethod$$serializer INSTANCE = new HttpMethod$$serializer();
    public static final /* synthetic */ f descriptor;

    static {
        f0 f0Var = new f0("com.vungle.ads.internal.network.HttpMethod", 2);
        f0Var.p("GET", false);
        f0Var.p("POST", false);
        descriptor = f0Var;
    }

    private HttpMethod$$serializer() {
    }

    @Override // je.l0
    public d<?>[] childSerializers() {
        return new d[0];
    }

    @Override // fe.c
    public HttpMethod deserialize(e decoder) {
        t.f(decoder, "decoder");
        return HttpMethod.values()[decoder.H(getDescriptor())];
    }

    @Override // fe.d, fe.m, fe.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // fe.m
    public void serialize(ie.f encoder, HttpMethod value) {
        t.f(encoder, "encoder");
        t.f(value, "value");
        encoder.l(getDescriptor(), value.ordinal());
    }

    @Override // je.l0
    public d<?>[] typeParametersSerializers() {
        return l0.a.a(this);
    }
}
