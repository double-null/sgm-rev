package io.bidmachine;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* JADX INFO: compiled from: RendererConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class RendererConfiguration {
    public static final Companion Companion = new Companion(null);
    private static final String GOOGLE_WATERMARK = "google_watermark";
    private final Map<String, Object> extras;

    /* JADX INFO: compiled from: RendererConfiguration.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public RendererConfiguration(Map<String, ? extends Object> extras) {
        kotlin.jvm.internal.t.f(extras, "extras");
        this.extras = extras;
    }

    public final Map<String, Object> getExtras() {
        return this.extras;
    }

    public final String getWatermark() {
        Object obj = this.extras.get(GOOGLE_WATERMARK);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Drawable getWatermarkDrawable(Context context) {
        kotlin.jvm.internal.t.f(context, "context");
        return qb.n.f24737a.a(context, getWatermark());
    }
}
