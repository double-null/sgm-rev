package io.bidmachine.iab.mraid;

import android.graphics.PointF;
import java.util.List;
import kotlinx.coroutines.channels.eY.oqHAiWkeGzWld;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements d7.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f17838b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f17839a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        private a() {
        }
    }

    public final void e(List<pb.f1> list) {
        this.f17839a = x.a(list);
    }

    @Override // d7.e
    public String c(Object... args) {
        kotlin.jvm.internal.t.f(args, "args");
        Object obj = args[0];
        PointF pointF = obj instanceof PointF ? (PointF) obj : null;
        if (pointF == null) {
            return "";
        }
        if (this.f17839a) {
            return "window.sclck(" + pointF.x + ", " + pointF.y + ')';
        }
        return oqHAiWkeGzWld.WdeGsNk + pointF.x + ", " + pointF.y + ')';
    }
}
