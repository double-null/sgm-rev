package io.bidmachine.iab.mraid;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x {
    public static final boolean a(List<pb.f1> list) {
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (kotlin.jvm.internal.t.a(((pb.f1) obj2).f(), "sclck")) {
                    obj = obj2;
                    break;
                }
            }
            obj = (pb.f1) obj;
        }
        return obj != null;
    }
}
