package com.vungle.ads.internal.network.converters;

import java.io.IOException;

/* JADX INFO: compiled from: Converter.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface Converter<In, Out> {
    Out convert(In in) throws IOException;
}
