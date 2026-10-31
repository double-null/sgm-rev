package com.google.firebase.crashlytics.internal.common;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t0 {
    public static /* synthetic */ Optional a(Optional optional, Supplier supplier) {
        Objects.requireNonNull(supplier);
        if (optional.isPresent()) {
            return optional;
        }
        Optional optional2 = (Optional) supplier.get();
        Objects.requireNonNull(optional2);
        return optional2;
    }
}
