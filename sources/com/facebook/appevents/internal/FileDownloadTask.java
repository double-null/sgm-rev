package com.facebook.appevents.internal;

import android.os.AsyncTask;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: FileDownloadTask.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FileDownloadTask extends AsyncTask<String, Void, Boolean> {
    private final File destFile;
    private final Callback onSuccess;
    private final String uriStr;

    /* JADX INFO: compiled from: FileDownloadTask.kt */
    public interface Callback {
        void onComplete(File file);
    }

    public FileDownloadTask(String uriStr, File destFile, Callback onSuccess) {
        t.f(uriStr, "uriStr");
        t.f(destFile, "destFile");
        t.f(onSuccess, "onSuccess");
        this.uriStr = uriStr;
        this.destFile = destFile;
        this.onSuccess = onSuccess;
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                return doInBackground2(strArr);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                onPostExecute(bool.booleanValue());
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, this);
        }
    }

    /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
    public Boolean doInBackground2(String... args) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return null;
            }
            try {
                t.f(args, "args");
                try {
                    URL url = new URL(this.uriStr);
                    int contentLength = url.openConnection().getContentLength();
                    DataInputStream dataInputStream = new DataInputStream(url.openStream());
                    byte[] bArr = new byte[contentLength];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.destFile));
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    return Boolean.TRUE;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, this);
            return null;
        }
    }

    protected void onPostExecute(boolean z10) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (!CrashShieldHandler.isObjectCrashing(this) && z10) {
                try {
                    this.onSuccess.onComplete(this.destFile);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.handleThrowable(th2, this);
        }
    }
}
