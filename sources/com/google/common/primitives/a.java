package com.google.common.primitives;

/* JADX INFO: compiled from: Booleans.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static boolean a(boolean[] zArr, boolean z10) {
        for (boolean z11 : zArr) {
            if (z11 == z10) {
                return true;
            }
        }
        return false;
    }
}
