package i6;

import android.content.Context;
import android.content.Intent;
import c6.d;
import com.linecorp.linesdk.auth.internal.LineAuthenticationActivity;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static Intent a(Context context, a aVar, List<String> list) {
        if (!aVar.d()) {
            d6.c.b(context);
        }
        return LineAuthenticationActivity.a(context, aVar, list);
    }

    public static Intent b(Context context, String str) {
        return a(context, new a.b(str).f(), Collections.emptyList());
    }

    public static c c(Intent intent) {
        return intent == null ? new c(d.INTERNAL_ERROR, new c6.b("Callback intent is null")) : LineAuthenticationActivity.b(intent);
    }
}
