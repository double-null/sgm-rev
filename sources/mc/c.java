package mc;

import java.util.Collection;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: ViewabilityRule.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f22257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f22258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection<lc.a> f22259c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(a actionEvent, b viewabilityMeasurement, Collection<? extends lc.a> metrics) {
        t.f(actionEvent, "actionEvent");
        t.f(viewabilityMeasurement, "viewabilityMeasurement");
        t.f(metrics, "metrics");
        this.f22257a = actionEvent;
        this.f22258b = viewabilityMeasurement;
        this.f22259c = metrics;
    }

    public final a a() {
        return this.f22257a;
    }

    public final Collection<lc.a> b() {
        return this.f22259c;
    }

    public final b c() {
        return this.f22258b;
    }
}
