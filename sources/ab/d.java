package ab;

import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.s;
import kotlin.jvm.internal.t;
import pb.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements fb.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f212c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f213d = s.e(f0.OnClick);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id.a f215b;

    private static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    public d(c animationController, id.a aVar) {
        t.f(animationController, "animationController");
        this.f214a = animationController;
        this.f215b = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // fb.e
    public boolean a(List params) {
        boolean zA;
        t.f(params, "params");
        Object objQ = b0.Q(params, 0);
        if (!(objQ instanceof f0)) {
            return false;
        }
        boolean z10 = true;
        Object objQ2 = b0.Q(params, 1);
        if (!(objQ2 instanceof Integer) || !f213d.contains(objQ)) {
            return false;
        }
        id.a aVar = this.f215b;
        Integer num = aVar != null ? (Integer) aVar.invoke() : null;
        if (num == null) {
            zA = false;
        } else {
            Integer num2 = num.intValue() != -1 ? num : null;
            if (num2 != null) {
                zA = this.f214a.a(num2.intValue());
            } else {
                zA = false;
            }
        }
        boolean zA2 = this.f214a.a(((Number) objQ2).intValue());
        if (!zA && !zA2) {
            z10 = false;
        }
        pa.t.g("AdAnimationEventInterceptor", "Intercept result=" + z10 + "; eventType=" + objQ + "; viewId=" + objQ2, new Object[0]);
        return z10;
    }
}
