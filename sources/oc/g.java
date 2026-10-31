package oc;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: IabUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    public static final a a(c7.b bVar) {
        a aVar;
        t.f(bVar, "<this>");
        int iC = bVar.c();
        if (iC == 1) {
            aVar = a.f23333e;
            t.e(aVar, "{\n            BMError.NoConnection\n        }");
        } else if (iC == 3) {
            aVar = a.f23345q;
            t.e(aVar, "{\n            BMError.NoFill\n        }");
        } else if (iC == 5) {
            aVar = a.f23344p;
            t.e(aVar, "{\n            BMError.PlaceholderTimeout\n        }");
        } else if (iC == 6) {
            aVar = a.f23342n;
            t.e(aVar, "{\n            BMError.Expired\n        }");
        } else if (iC != 7) {
            aVar = a.f23346r;
            t.e(aVar, "{\n            BMError.In…nalUnknownError\n        }");
        } else {
            aVar = a.f23345q;
            t.e(aVar, "{\n            BMError.NoFill\n        }");
        }
        return new a(aVar, iC, bVar.d());
    }
}
