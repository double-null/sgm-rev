package f7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.o;
import pb.f1;
import rd.v;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f1.b.values().length];
            try {
                iArr[f1.b.DocumentEnd.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return yc.b.a(Integer.valueOf(((f1) t10).e()), Integer.valueOf(((f1) t11).e()));
        }
    }

    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f14653a;

        public c(Comparator comparator) {
            this.f14653a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f14653a.compare(t10, t11);
            return iCompare != 0 ? iCompare : yc.b.a(((f1) t10).f(), ((f1) t11).f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(f1 f1Var) {
        f1.b bVarH = f1Var.h();
        if ((bVarH == null ? -1 : a.$EnumSwitchMapping$0[bVarH.ordinal()]) != 1) {
            return f1Var.g();
        }
        return v.j("\n        (function() {\n          if (document.readyState === 'loading') {\n            document.addEventListener('DOMContentLoaded', function() {\n              " + f1Var.g() + "\n            });\n          } else {\n            " + f1Var.g() + "\n          }\n        })();\n    ");
    }

    private static final List b(List list) {
        return b0.i0(list, new c(new b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(List list, f1.b... bVarArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (o.v(bVarArr, ((f1) obj).h())) {
                arrayList.add(obj);
            }
        }
        return b(arrayList);
    }
}
