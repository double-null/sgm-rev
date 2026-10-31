package f6;

import com.vungle.ads.internal.network.converters.vY.vgmm;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements c<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14630a;

    public d() {
        this(vgmm.GAcVxPiqSaUxIA);
    }

    @Override // f6.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a(InputStream inputStream) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, this.f14630a));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        bufferedReader2.close();
                        return sb2.toString();
                    }
                    sb2.append(line);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public d(String str) {
        this.f14630a = str;
    }
}
