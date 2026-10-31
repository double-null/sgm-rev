package f6;

import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements c<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f14629a = new d();

    @Override // f6.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final JSONObject a(InputStream inputStream) throws IOException {
        try {
            return new JSONObject(this.f14629a.a(inputStream));
        } catch (JSONException e10) {
            throw new IOException(e10);
        }
    }
}
