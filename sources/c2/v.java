package c2;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: compiled from: LogResponse.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v {
    static v a(long j10) {
        return new l(j10);
    }

    public static v b(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        v vVarA = a(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return vVarA;
                    }
                    v vVarA2 = a(jsonReader.nextLong());
                    jsonReader.close();
                    return vVarA2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public abstract long c();
}
