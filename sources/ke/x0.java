package ke;

import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
final class x0 extends t0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f21428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21429i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(kotlinx.serialization.json.b json, id.l<? super kotlinx.serialization.json.i, wc.g0> nodeConsumer) {
        super(json, nodeConsumer);
        kotlin.jvm.internal.t.f(json, "json");
        kotlin.jvm.internal.t.f(nodeConsumer, "nodeConsumer");
        this.f21429i = true;
    }

    @Override // ke.t0, ke.e
    public kotlinx.serialization.json.i s0() {
        return new kotlinx.serialization.json.d0(x0());
    }

    @Override // ke.t0, ke.e
    public void w0(String key, kotlinx.serialization.json.i element) {
        kotlin.jvm.internal.t.f(key, "key");
        kotlin.jvm.internal.t.f(element, "element");
        if (!this.f21429i) {
            Map<String, kotlinx.serialization.json.i> mapX0 = x0();
            String str = this.f21428h;
            if (str == null) {
                kotlin.jvm.internal.t.u("tag");
                str = null;
            }
            mapX0.put(str, element);
            this.f21429i = true;
            return;
        }
        if (element instanceof kotlinx.serialization.json.g0) {
            this.f21428h = ((kotlinx.serialization.json.g0) element).a();
            this.f21429i = false;
        } else {
            if (element instanceof kotlinx.serialization.json.d0) {
                throw k0.d(kotlinx.serialization.json.f0.f21582a.getDescriptor());
            }
            if (!(element instanceof kotlinx.serialization.json.c)) {
                throw new NoWhenBranchMatchedException();
            }
            throw k0.d(kotlinx.serialization.json.d.f21558a.getDescriptor());
        }
    }
}
