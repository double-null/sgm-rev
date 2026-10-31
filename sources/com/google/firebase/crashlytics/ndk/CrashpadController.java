package com.google.firebase.crashlytics.ndk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.h;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import e3.h0;
import e3.i0;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import z2.f;

/* JADX INFO: loaded from: classes4.dex */
public class CrashpadController {
    private static final String APP_METADATA_FILE = "app.json";
    private static final String DEVICE_METADATA_FILE = "device.json";
    private static final String OS_METADATA_FILE = "os.json";
    private static final String SESSION_METADATA_FILE = "session.json";
    private static final String SESSION_START_TIMESTAMP_FILE_NAME = "start-time";
    private static final Charset UTF_8 = Charset.forName(Constants.ENCODING);
    private final Context context;
    private final FileStore fileStore;
    private final NativeApi nativeApi;

    CrashpadController(Context context, NativeApi nativeApi, FileStore fileStore) {
        this.context = context;
        this.nativeApi = nativeApi;
        this.fileStore = fileStore;
    }

    private static h0.a convertApplicationExitInfoToModel(ApplicationExitInfo applicationExitInfo) {
        return h0.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(getTraceFileFromApplicationExitInfo(applicationExitInfo)).a();
    }

    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return zipAndEncode(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    private h0.a getApplicationExitInfo(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return getNativeCrashApplicationExitInfo(str);
        }
        return null;
    }

    private SessionFiles.NativeCore getNativeCore(String str, File file) {
        return new SessionFiles.NativeCore(getSingleFileWithExtension(file, ".dmp"), getApplicationExitInfo(str));
    }

    private h0.a getNativeCrashApplicationExitInfo(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        File fileQ = this.fileStore.q(str, SESSION_START_TIMESTAMP_FILE_NAME);
        return getRelevantApplicationExitInfo(fileQ == null ? System.currentTimeMillis() : fileQ.lastModified(), historicalProcessExitReasons);
    }

    private h0.a getRelevantApplicationExitInfo(long j10, List<ApplicationExitInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getReason() == 5 && applicationExitInfo.getTimestamp() >= j10) {
                arrayList.add(applicationExitInfo);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return convertApplicationExitInfoToModel((ApplicationExitInfo) arrayList.get(0));
    }

    private static File getSingleFileWithExtension(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    private static String getTraceFileFromApplicationExitInfo(ApplicationExitInfo applicationExitInfo) {
        try {
            return convertInputStreamToString(applicationExitInfo.getTraceInputStream());
        } catch (IOException unused) {
            f.f().k("Failed to get input stream from ApplicationExitInfo");
            return null;
        }
    }

    private static void writeSessionJsonFile(FileStore fileStore, String str, String str2, String str3) throws Throwable {
        writeTextFile(new File(fileStore.k(str), str3), str2);
    }

    private static void writeTextFile(File file, String str) throws Throwable {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), UTF_8));
            try {
                bufferedWriter2.write(str);
                h.f(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                h.f(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                h.f(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String zipAndEncode(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                String strEncodeToString = Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return strEncodeToString;
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public SessionFiles getFilesForSession(String str) {
        File fileK = this.fileStore.k(str);
        File file = new File(fileK, "pending");
        f.f().i("Minidump directory: " + file.getAbsolutePath());
        File singleFileWithExtension = getSingleFileWithExtension(file, ".dmp");
        f fVarF = f.f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Minidump file ");
        sb2.append((singleFileWithExtension == null || !singleFileWithExtension.exists()) ? "does not exist" : "exists");
        fVarF.i(sb2.toString());
        SessionFiles.Builder builder = new SessionFiles.Builder();
        if (fileK != null && fileK.exists() && file.exists()) {
            builder.nativeCore(getNativeCore(str, file)).metadataFile(getSingleFileWithExtension(fileK, ".device_info")).sessionFile(new File(fileK, SESSION_METADATA_FILE)).appFile(new File(fileK, APP_METADATA_FILE)).deviceFile(new File(fileK, DEVICE_METADATA_FILE)).osFile(new File(fileK, OS_METADATA_FILE));
        }
        return builder.build();
    }

    public boolean hasCrashDataForSession(String str) {
        SessionFiles.NativeCore nativeCore = getFilesForSession(str).nativeCore;
        return nativeCore != null && nativeCore.hasCore();
    }

    public boolean initialize(String str, String str2, long j10, i0 i0Var) throws Throwable {
        File fileK = this.fileStore.k(str);
        if (fileK == null) {
            return false;
        }
        try {
            if (!this.nativeApi.initialize(fileK.getCanonicalPath(), this.context.getAssets())) {
                return false;
            }
            writeBeginSession(str, str2, j10);
            writeSessionApp(str, i0Var.a());
            writeSessionOs(str, i0Var.d());
            writeSessionDevice(str, i0Var.c());
            return true;
        } catch (IOException e10) {
            f.f().e("Error initializing Crashlytics NDK", e10);
            return false;
        }
    }

    public void writeBeginSession(String str, String str2, long j10) throws Throwable {
        writeSessionJsonFile(this.fileStore, str, SessionMetadataJsonSerializer.serializeBeginSession(str, str2, j10), SESSION_METADATA_FILE);
    }

    public void writeSessionApp(String str, i0.a aVar) throws Throwable {
        writeSessionJsonFile(this.fileStore, str, SessionMetadataJsonSerializer.serializeSessionApp(aVar.a(), aVar.f(), aVar.g(), aVar.e(), aVar.c(), aVar.d().d(), aVar.d().e()), APP_METADATA_FILE);
    }

    public void writeSessionDevice(String str, i0.b bVar) throws Throwable {
        writeSessionJsonFile(this.fileStore, str, SessionMetadataJsonSerializer.serializeSessionDevice(bVar.a(), bVar.g(), bVar.b(), bVar.j(), bVar.d(), bVar.e(), bVar.i(), bVar.f(), bVar.h()), DEVICE_METADATA_FILE);
    }

    public void writeSessionOs(String str, i0.c cVar) throws Throwable {
        writeSessionJsonFile(this.fileStore, str, SessionMetadataJsonSerializer.serializeSessionOs(cVar.d(), cVar.c(), cVar.b()), OS_METADATA_FILE);
    }
}
