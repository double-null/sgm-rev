package com.vungle.ads.internal.network.converters;

import fd.b;
import java.io.IOException;
import me.c0;
import wc.g0;

/* JADX INFO: compiled from: EmptyResponseConverter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class EmptyResponseConverter implements Converter<c0, Void> {
    @Override // com.vungle.ads.internal.network.converters.Converter
    public Void convert(c0 c0Var) throws IOException {
        if (c0Var != null) {
            try {
                c0Var.close();
                g0 g0Var = g0.f27756a;
                b.a(c0Var, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.a(c0Var, th);
                    throw th2;
                }
            }
        }
        return null;
    }
}
