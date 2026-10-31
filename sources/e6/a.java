package e6;

import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
abstract class a<T> implements f6.c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f6.b f14493a;

    a() {
        this(new f6.b());
    }

    @Override // f6.c
    public final T a(InputStream inputStream) throws IOException {
        try {
            return b(this.f14493a.a(inputStream));
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }

    abstract T b(JSONObject jSONObject);

    private a(f6.b bVar) {
        this.f14493a = bVar;
    }
}
