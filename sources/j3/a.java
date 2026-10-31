package j3;

import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* JADX INFO: compiled from: CachedSettingsIo.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f20568a;

    public a(FileStore fileStore) {
        this.f20568a = fileStore.g("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f20568a;
    }

    public JSONObject b() throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        z2.f.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileA = a();
                if (fileA.exists()) {
                    fileInputStream = new FileInputStream(fileA);
                    try {
                        jSONObject = new JSONObject(com.google.firebase.crashlytics.internal.common.h.B(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        z2.f.f().e("Failed to fetch cached settings", e);
                        com.google.firebase.crashlytics.internal.common.h.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    z2.f.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                com.google.firebase.crashlytics.internal.common.h.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th2) {
                th = th2;
                com.google.firebase.crashlytics.internal.common.h.f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            com.google.firebase.crashlytics.internal.common.h.f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j10, JSONObject jSONObject) throws Throwable {
        z2.f.f().i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                try {
                    jSONObject.put("expires_at", j10);
                    FileWriter fileWriter2 = new FileWriter(a());
                    try {
                        fileWriter2.write(jSONObject.toString());
                        fileWriter2.flush();
                        com.google.firebase.crashlytics.internal.common.h.f(fileWriter2, "Failed to close settings writer.");
                    } catch (Exception e10) {
                        e = e10;
                        fileWriter = fileWriter2;
                        z2.f.f().e("Failed to cache settings", e);
                        com.google.firebase.crashlytics.internal.common.h.f(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        com.google.firebase.crashlytics.internal.common.h.f(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
    }
}
