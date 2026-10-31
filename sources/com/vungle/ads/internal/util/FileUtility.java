package com.vungle.ads.internal.util;

import android.os.Build;
import android.webkit.URLUtil;
import com.vungle.ads.AssetFailedToDeleteError;
import fd.h;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.t;
import me.u;
import rd.f0;

/* JADX INFO: compiled from: FileUtility.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FileUtility {
    private static final String TAG = "FileUtility";
    public static final FileUtility INSTANCE = new FileUtility();
    private static ObjectInputStreamProvider objectInputStreamProvider = new ObjectInputStreamProvider() { // from class: com.vungle.ads.internal.util.d
        @Override // com.vungle.ads.internal.util.FileUtility.ObjectInputStreamProvider
        public final ObjectInputStream provideObjectInputStream(InputStream inputStream) {
            return FileUtility.m318objectInputStreamProvider$lambda0(inputStream);
        }
    };
    private static final List<Class<?>> allowedClasses = t.n(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);

    /* JADX INFO: compiled from: FileUtility.kt */
    public interface ObjectInputStreamProvider {
        ObjectInputStream provideObjectInputStream(InputStream inputStream) throws IOException, ClassNotFoundException;
    }

    private FileUtility() {
    }

    public static final void delete(File file, Set<String> set) {
        if (file != null) {
            try {
                if (file.exists()) {
                    boolean z10 = true;
                    if (file.isDirectory()) {
                        if (set != null && set.contains(file.getName())) {
                            Logger.Companion.d(TAG, "Skipping deletion of directory: " + file.getName());
                            return;
                        }
                        deleteContents(file, set);
                    }
                    if (set == null || !set.contains(file.getName())) {
                        z10 = false;
                    }
                    if (z10) {
                        Logger.Companion.d(TAG, "Skipping deletion of file: " + file.getName());
                        return;
                    }
                    if (file.delete()) {
                        return;
                    }
                    Logger.Companion.d(TAG, "Failed to delete file: " + file);
                }
            } catch (Exception e10) {
                Logger.Companion.e(TAG, "Failed to delete file: " + e10.getLocalizedMessage());
            }
        }
    }

    public static /* synthetic */ void delete$default(File file, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        delete(file, set);
    }

    public static final void deleteAndLogIfFailed(File file) {
        kotlin.jvm.internal.t.f(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.delete(file.toPath());
            } else if (!file.delete()) {
                new AssetFailedToDeleteError("Cannot delete " + file.getName()).logErrorNoReturnValue$vungle_ads_release();
            }
        } catch (Exception e10) {
            new AssetFailedToDeleteError("Failed to delete " + file.getName() + " with error :" + e10.getMessage()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public static final void deleteContents(File folder, Set<String> set) {
        kotlin.jvm.internal.t.f(folder, "folder");
        File[] fileArrListFiles = folder.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            delete(file, set);
        }
    }

    public static /* synthetic */ void deleteContents$default(File file, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        deleteContents(file, set);
    }

    private final String getIndentString(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("|  ");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.t.e(string, "sb.toString()");
        return string;
    }

    public static /* synthetic */ String guessFileName$default(FileUtility fileUtility, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return fileUtility.guessFileName(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: objectInputStreamProvider$lambda-0, reason: not valid java name */
    public static final ObjectInputStream m318objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new SafeObjectInputStream(inputStream, allowedClasses);
    }

    public static final void printDirectoryTree(File file) {
    }

    private final void printFile(File file, int i10, StringBuilder sb2) {
        sb2.append(getIndentString(i10));
        sb2.append("+--");
        sb2.append(file.getName());
        sb2.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00a3: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:164), block:B:39:0x00a3 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.vungle.ads.internal.util.FileUtility$ObjectInputStreamProvider] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final <T> T readSerializable(File file) {
        Closeable closeable;
        ObjectInputStream objectInputStreamProvideObjectInputStream;
        ?? r10;
        kotlin.jvm.internal.t.f(file, "file");
        ?? Exists = file.exists();
        Closeable closeable2 = null;
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                Exists = new FileInputStream(file);
                try {
                    objectInputStreamProvideObjectInputStream = objectInputStreamProvider.provideObjectInputStream(Exists);
                    try {
                        T t10 = (T) objectInputStreamProvideObjectInputStream.readObject();
                        ?? r11 = INSTANCE;
                        r11.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r11.closeQuietly(Exists);
                        return t10;
                    } catch (IOException e10) {
                        e = e10;
                        Logger.Companion.e(TAG, "IOException: " + e.getMessage());
                        r10 = Exists;
                        ?? r12 = INSTANCE;
                        r12.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r12.closeQuietly(r10);
                        try {
                            delete$default(file, null, 2, null);
                        } catch (IOException unused) {
                        }
                        return null;
                    } catch (ClassNotFoundException e11) {
                        e = e11;
                        Logger.Companion.e(TAG, "ClassNotFoundException: " + e.getMessage());
                        r10 = Exists;
                        ?? r13 = INSTANCE;
                        r13.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r13.closeQuietly(r10);
                        delete$default(file, null, 2, null);
                        return null;
                    } catch (Exception e12) {
                        e = e12;
                        Logger.Companion.e(TAG, "cannot read serializable " + e.getMessage());
                        r10 = Exists;
                        ?? r14 = INSTANCE;
                        r14.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r14.closeQuietly(r10);
                        delete$default(file, null, 2, null);
                        return null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (ClassNotFoundException e14) {
                    e = e14;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Exception e15) {
                    e = e15;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    ?? r15 = INSTANCE;
                    r15.closeQuietly(closeable2);
                    r15.closeQuietly(Exists);
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (ClassNotFoundException e17) {
                e = e17;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (Exception e18) {
                e = e18;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                Exists = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void writeSerializable(File file, Serializable serializable) {
        OutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        kotlin.jvm.internal.t.f(file, "file");
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                try {
                    objectOutputStream.writeObject(serializable);
                    objectOutputStream.reset();
                    FileUtility fileUtility = INSTANCE;
                    fileUtility.closeQuietly(objectOutputStream);
                    fileUtility.closeQuietly(fileOutputStream);
                } catch (IOException e10) {
                    e = e10;
                    outputStream = fileOutputStream;
                    try {
                        Logger.Companion.e(TAG, String.valueOf(e.getMessage()));
                        FileUtility fileUtility2 = INSTANCE;
                        fileUtility2.closeQuietly(objectOutputStream);
                        fileUtility2.closeQuietly(outputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = outputStream;
                        outputStream = objectOutputStream;
                        FileUtility fileUtility3 = INSTANCE;
                        fileUtility3.closeQuietly(outputStream);
                        fileUtility3.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = objectOutputStream;
                    FileUtility fileUtility4 = INSTANCE;
                    fileUtility4.closeQuietly(outputStream);
                    fileUtility4.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                objectOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                FileUtility fileUtility5 = INSTANCE;
                fileUtility5.closeQuietly(outputStream);
                fileUtility5.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            objectOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final List<Class<?>> getAllowedClasses$vungle_ads_release() {
        return allowedClasses;
    }

    public final ObjectInputStreamProvider getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    public final String guessFileName(String url, String str) {
        kotlin.jvm.internal.t.f(url, "url");
        String strGuessFileName = URLUtil.guessFileName(url, null, str);
        kotlin.jvm.internal.t.e(strGuessFileName, "guessFileName(url, null, ext)");
        return strGuessFileName;
    }

    public final boolean isValidUrl(String str) {
        boolean z10;
        if (str != null) {
            try {
                z10 = f0.k0(str);
            } catch (Throwable unused) {
                return false;
            }
        }
        return (z10 || u.f22538k.f(str) == null) ? false : true;
    }

    public final String readString(File file) {
        kotlin.jvm.internal.t.f(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            return h.f(file, null, 1, null);
        } catch (IOException e10) {
            Logger.Companion.e(TAG, "IOException: " + e10.getMessage());
            return null;
        } catch (Exception e11) {
            Logger.Companion.e(TAG, "cannot read string " + e11.getMessage());
            return null;
        }
    }

    public final void setObjectInputStreamProvider(ObjectInputStreamProvider objectInputStreamProvider2) {
        kotlin.jvm.internal.t.f(objectInputStreamProvider2, "<set-?>");
        objectInputStreamProvider = objectInputStreamProvider2;
    }

    public final long size(File file) {
        long size = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            if (!(fileArrListFiles.length == 0)) {
                for (File file2 : fileArrListFiles) {
                    size += size(file2);
                }
            }
        }
        return size;
    }

    public final void writeString(File file, String str) {
        kotlin.jvm.internal.t.f(file, "file");
        if (str == null) {
            return;
        }
        try {
            h.g(file, str, rd.d.f24999b);
        } catch (IOException e10) {
            Logger.Companion.e(TAG, String.valueOf(e10.getMessage()));
        }
    }

    private final void printDirectoryTree(File file, int i10, StringBuilder sb2) {
        if (file == null) {
            return;
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory".toString());
        }
        sb2.append(getIndentString(i10));
        sb2.append("+--");
        sb2.append(file.getName());
        sb2.append("/\n");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                printDirectoryTree(file2, i10 + 1, sb2);
            } else {
                kotlin.jvm.internal.t.e(file2, "file");
                printFile(file2, i10 + 1, sb2);
            }
        }
    }

    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }
}
