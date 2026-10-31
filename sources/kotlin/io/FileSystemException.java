package kotlin.io;

import fd.c;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
public class FileSystemException extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f21495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f21496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21497c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemException(File file, File file2, String str) {
        super(c.b(file, file2, str));
        t.f(file, "file");
        this.f21495a = file;
        this.f21496b = file2;
        this.f21497c = str;
    }
}
