package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.android.billingclient.gp.VRfCTjjLv;
import com.applovin.impl.f2;
import com.applovin.impl.f4;
import com.applovin.impl.f6;
import com.applovin.impl.i2;
import com.applovin.impl.j2;
import com.applovin.impl.k5;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u6;
import com.applovin.impl.z4;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f8508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f8509c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f8512f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8507a = "FileManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8510d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f8511e = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i2 f8513g = a();

    n(l lVar) {
        this.f8508b = lVar;
        this.f8509c = lVar.Q();
        this.f8512f = ((Boolean) lVar.a(z4.V0)).booleanValue();
    }

    private boolean e(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f8510d) {
            if (this.f8511e.contains(absolutePath)) {
                return false;
            }
            d(file);
            return true;
        }
    }

    private boolean g(File file) {
        if (p.a()) {
            this.f8509c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            d(file);
            boolean zDelete = file.delete();
            if (!zDelete) {
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
                mapHashMap.put("details", b(file));
                this.f8508b.E().a(f2.Z0, "removeFile", mapHashMap);
            }
            h(file);
            return zDelete;
        } catch (Throwable th) {
            try {
                if (p.a()) {
                    this.f8509c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.f8508b.E().a("FileManager", "removeFile", th);
                return false;
            } finally {
                h(file);
            }
        }
    }

    private void h(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f8510d) {
            if (!this.f8511e.remove(absolutePath)) {
                this.f8508b.E().a(f2.Z0, "unlockFile", CollectionUtils.hashMap("path", absolutePath));
            }
            this.f8510d.notifyAll();
        }
    }

    public void c(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.f8508b.s0().a((k5) new u6(this.f8508b, false, VRfCTjjLv.KAYhFesIpGHdvP, new Runnable() { // from class: com.applovin.impl.sdk.u1
            @Override // java.lang.Runnable
            public final void run() {
                this.f8697a.a(bVar, context);
            }
        }), f6.b.CACHING);
    }

    public void d(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.f8508b.s0().a((k5) new u6(this.f8508b, false, "removeCachedVideoResourceForAd", new Runnable() { // from class: com.applovin.impl.sdk.v1
            @Override // java.lang.Runnable
            public final void run() {
                this.f8719a.b(bVar, context);
            }
        }), f6.b.CACHING);
    }

    public String f(File file) throws Throwable {
        if (file == null) {
            return null;
        }
        if (p.a()) {
            this.f8509c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        boolean z10 = true;
        try {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            d(file);
                            String strA = a(fileInputStream);
                            boolean z11 = strA == null;
                            fileInputStream.close();
                            if (z11 && ((Boolean) this.f8508b.a(z4.N0)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            h(file);
                            return strA;
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z10 = false;
                        if (z10 && ((Boolean) this.f8508b.a(z4.N0)).booleanValue()) {
                            a(file, "removeFileAfterReadFail");
                        }
                        h(file);
                        throw th;
                    }
                } catch (Throwable th4) {
                    if (p.a()) {
                        this.f8509c.a("FileManager", "Unknown failure to read file.", th4);
                    }
                    this.f8509c.a("FileManager", th4);
                    this.f8508b.E().a("FileManager", "readFile", th4);
                    if (((Boolean) this.f8508b.a(z4.N0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    return null;
                }
            } catch (FileNotFoundException e10) {
                if (p.a()) {
                    this.f8509c.d("FileManager", "File not found. " + e10);
                }
                this.f8509c.a("FileManager", e10);
                this.f8508b.E().a("FileManager", "readFileNotFound", e10);
                if (0 != 0 && ((Boolean) this.f8508b.a(z4.N0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                return null;
            } catch (IOException e11) {
                if (p.a()) {
                    this.f8509c.a("FileManager", "Failed to read file: " + file.getName() + e11);
                }
                this.f8509c.a("FileManager", e11);
                this.f8508b.E().a("FileManager", "readFileIO", e11);
                if (((Boolean) this.f8508b.a(z4.N0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private i2 a() {
        if (((Boolean) this.f8508b.a(z4.f9389x3)).booleanValue()) {
            try {
                return new f4(this.f8508b);
            } catch (Throwable th) {
                if (p.a()) {
                    this.f8509c.a("FileManager", "Error instantiating OkHttpLoader, falling back to HttpUrlConnectionLoader", th);
                }
                this.f8508b.E().a("FileManager", "instantiateOkHttpLoader", th);
            }
        }
        return new j2(this.f8508b);
    }

    private boolean c(File file) {
        boolean zContains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f8510d) {
            zContains = this.f8511e.contains(absolutePath);
        }
        return zContains;
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f8510d) {
            boolean zAdd = this.f8511e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.f8510d.wait();
                    zAdd = this.f8511e.add(absolutePath);
                } catch (InterruptedException e10) {
                    if (p.a()) {
                        this.f8509c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e10);
                    }
                    throw new RuntimeException(e10);
                }
            }
        }
    }

    public void b(Context context) {
        if (this.f8508b.G0()) {
            if (p.a()) {
                this.f8509c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (bVar.n0() == null) {
            return;
        }
        g(a(bVar.n0().getLastPathSegment(), context));
    }

    private List c(Context context) {
        File[] fileArrListFiles;
        File fileD = d(context);
        if (fileD.isDirectory() && (fileArrListFiles = fileD.listFiles()) != null) {
            return Arrays.asList(fileArrListFiles);
        }
        return Collections.emptyList();
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (p.a()) {
                this.f8509c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (p.a()) {
                this.f8509c.b("FileManager", "Failed to create .nomedia file");
            }
            this.f8508b.E().a(f2.Z0, "createNoMediaFile");
        } catch (IOException e10) {
            if (p.a()) {
                this.f8509c.a("FileManager", "Failed to create .nomedia file", e10);
            }
        }
    }

    private File a(String str, boolean z10, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (p.a()) {
                this.f8509c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (p.a()) {
            this.f8509c.a("FileManager", "Looking up cached resource: " + str);
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File fileD = d(context);
        File file = new File(fileD, str);
        if (z10) {
            try {
                fileD.mkdirs();
            } catch (Throwable th) {
                if (p.a()) {
                    this.f8509c.a("FileManager", "Unable to make cache directory at " + fileD, th);
                }
                this.f8508b.E().a("FileManager", "createCacheDir", th);
                return null;
            }
        }
        return file;
    }

    private String b(File file) {
        try {
            boolean zExists = file.exists();
            boolean zIsDirectory = file.isDirectory();
            String[] list = file.list();
            boolean z10 = true;
            boolean z11 = zIsDirectory && list != null && list.length == 0;
            File parentFile = file.getParentFile();
            boolean z12 = parentFile != null && parentFile.exists();
            if (!z12 || !parentFile.canWrite()) {
                z10 = false;
            }
            return "fileExists: " + zExists + "\nisDirectory: " + zIsDirectory + "\nisEmptyDirectory: " + z11 + "\nparentDirectoryExists: " + z12 + "\nisParentDirectoryWritable: " + z10;
        } catch (Throwable th) {
            return "Error retrieving file deletion failure reason: " + th;
        }
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    public boolean c(String str, Context context) {
        if (this.f8512f) {
            return b(str, context);
        }
        boolean z10 = false;
        File fileA = a(str, false, context);
        if (!e(fileA)) {
            return false;
        }
        if (fileA.exists() && !fileA.isDirectory()) {
            z10 = true;
        }
        h(fileA);
        return z10;
    }

    private long b() {
        long jLongValue = ((Long) this.f8508b.a(z4.C0)).longValue();
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return -1L;
    }

    public String a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = inputStream.read(bArr, 0, 8192);
                    if (i10 >= 0) {
                        byteArrayOutputStream.write(bArr, 0, i10);
                    } else {
                        String string = byteArrayOutputStream.toString(Constants.ENCODING);
                        byteArrayOutputStream.close();
                        return string;
                    }
                    this.f8509c.a("FileManager", th);
                    this.f8508b.E().a("FileManager", "readInputStreamAsString", th);
                    return null;
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.f8509c.a("FileManager", th3);
            this.f8508b.E().a("FileManager", "readInputStreamAsString", th3);
            return null;
        }
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public boolean a(InputStream inputStream, File file, boolean z10) {
        return a(inputStream, file, z10, false);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0142 */
    /* JADX WARN: Code duplicated, block: B:193:0x0305 A[Catch: all -> 0x034c, TRY_LEAVE, TryCatch #4 {all -> 0x034c, blocks: (B:191:0x02ff, B:193:0x0305), top: B:238:0x02ff }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0315  */
    /* JADX WARN: Code duplicated, block: B:198:0x031a  */
    /* JADX WARN: Code duplicated, block: B:246:0x032d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.io.InputStream r19, java.io.File r20, boolean r21, boolean r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.n.a(java.io.InputStream, java.io.File, boolean, boolean):boolean");
    }

    public boolean a(File file, String str, List list, int i10, String str2, Map map) {
        return a(file, str, list, true, i10, str2, map);
    }

    private boolean a(File file, String str, List list, boolean z10, int i10, String str2, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        this.f8508b.g().d(f2.M, mapHashMap);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i11 = 1; i11 <= i10; i11++) {
            if (a(file, str, list, z10, str2, map)) {
                a(true, str, i11, jElapsedRealtime, map);
                return true;
            }
        }
        a(false, str, i10, jElapsedRealtime, map);
        return false;
    }

    private boolean a(File file, String str, List list, boolean z10, String str2, Map map) {
        Boolean bool = (Boolean) this.f8508b.a(z4.W0);
        if (bool.booleanValue()) {
            d(file);
        }
        if (a(file)) {
            if (p.a()) {
                this.f8509c.a("FileManager", "File exists for " + str);
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
            mapHashMap.putAll(map);
            this.f8508b.g().d(f2.N, mapHashMap);
            if (((Boolean) this.f8508b.a(z4.Y0)).booleanValue() && !file.setLastModified(System.currentTimeMillis())) {
                if (p.a()) {
                    this.f8509c.b("FileManager", "Failed to refresh cache TTL for " + file.getName());
                }
                this.f8508b.E().a(f2.Z0, "setLastModifiedFailed", mapHashMap);
            }
            if (!bool.booleanValue()) {
                return true;
            }
            h(file);
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            InputStream inputStreamA = a(str, list, z10, map);
            try {
                if (p.a()) {
                    this.f8509c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
                }
                boolean zA = a(inputStreamA, file, false, bool.booleanValue());
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (zA) {
                    if (p.a()) {
                        this.f8509c.a("FileManager", "Caching completed for " + file);
                    }
                    double d10 = q7.d(jElapsedRealtime2);
                    double dC = q7.c(file.length());
                    long j10 = (long) (dC / d10);
                    Map mapA = a(file, str, jElapsedRealtime2, map);
                    CollectionUtils.putObjectToStringIfValid("network_throughput_kbps", Long.valueOf(j10), mapA);
                    CollectionUtils.putObjectToStringIfValid("details", Double.valueOf(dC), mapA);
                    this.f8508b.g().d(f2.S, mapA);
                    this.f8508b.f0().b(j10, str, str2);
                } else {
                    if (p.a()) {
                        this.f8509c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
                    }
                    this.f8508b.g().d(f2.T, a(file, str, jElapsedRealtime2, map));
                }
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                if (bool.booleanValue()) {
                    h(file);
                }
                return zA;
            } catch (Throwable th) {
                if (inputStreamA != null) {
                    try {
                        inputStreamA.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                this.f8509c.a("FileManager", th3);
                this.f8508b.E().a("FileManager", "loadAndCacheResource", th3);
                return false;
            } finally {
                if (bool.booleanValue()) {
                    h(file);
                }
            }
        }
    }

    private Map a(File file, String str, long j10, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
        CollectionUtils.putStringIfValid("url", str, mapHashMap);
        CollectionUtils.putObjectToStringIfValid("duration_ms", Long.valueOf(j10), mapHashMap);
        mapHashMap.putAll(map);
        return mapHashMap;
    }

    private void a(boolean z10, String str, int i10, long j10, Map map) {
        f2 f2Var = z10 ? f2.O : f2.P;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        HashMap map2 = new HashMap(3);
        map2.put("attempt_number", Integer.toString(i10));
        map2.put("url", str);
        map2.put("duration_ms", String.valueOf(jElapsedRealtime));
        map2.putAll(map);
        this.f8508b.g().d(f2Var, map2);
    }

    public InputStream a(String str, List list, boolean z10, Map map) {
        if (z10 && !q7.a(str, list)) {
            if (p.a()) {
                this.f8509c.a("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
        String httpsString = StringUtils.toHttpsString(str);
        if (p.a()) {
            this.f8509c.a("FileManager", "Loading " + httpsString + "...");
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", httpsString);
        mapHashMap.putAll(map);
        this.f8508b.g().d(f2.Q, mapHashMap);
        try {
            return this.f8513g.a(httpsString, map);
        } catch (Throwable th) {
            if (p.a()) {
                this.f8509c.a("FileManager", "Error loading " + httpsString, th);
            }
            this.f8508b.E().a("FileManager", "loadResource", th, CollectionUtils.hashMap("url", httpsString));
            return null;
        }
    }

    public int a(String str, com.applovin.impl.sdk.ad.b bVar) {
        List listW = bVar.W();
        if (bVar.M0() || listW.contains(str)) {
            return bVar.C();
        }
        return 1;
    }

    public String a(Context context, String str, String str2, List list, boolean z10, int i10, String str3, Map map) {
        return a(context, str, str2, list, z10, false, i10, str3, map);
    }

    public String a(Context context, String str, String str2, List list, boolean z10, boolean z11, int i10, String str3, Map map) {
        if (!StringUtils.isValidString(str)) {
            if (p.a()) {
                this.f8509c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.f8508b.E().a(f2.Z0, "cacheResource");
            return null;
        }
        String strA = q7.a(Uri.parse(str), str2, this.f8508b);
        File fileA = a(strA, context);
        if (!a(fileA, str, list, z10, i10, str3, map)) {
            return null;
        }
        if (p.a()) {
            this.f8509c.a("FileManager", "Caching succeeded for file " + strA);
        }
        return z11 ? Uri.fromFile(fileA).toString() : strA;
    }

    private long a(Context context) {
        boolean zG;
        long jB = b();
        boolean z10 = jB != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List listC = this.f8508b.c(z4.H0);
        long length = 0;
        for (File file : c(context)) {
            if (!z10 || listC.contains(file.getName()) || c(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= jB) {
                zG = false;
            } else {
                if (p.a()) {
                    this.f8509c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                zG = g(file);
            }
            if (!zG) {
                length += file.length();
            }
        }
        return length;
    }

    private void a(long j10, Context context) {
        long jIntValue = ((Integer) this.f8508b.a(z4.D0)).intValue();
        if (jIntValue == -1) {
            if (p.a()) {
                this.f8509c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j10) > jIntValue) {
                if (p.a()) {
                    this.f8509c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    g((File) it.next());
                }
                return;
            }
            if (p.a()) {
                this.f8509c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        Iterator it = new ArrayList(bVar.m().keySet()).iterator();
        while (it.hasNext()) {
            g(a(Uri.parse((String) it.next()).getLastPathSegment(), context));
        }
        Uri uriN0 = bVar.n0();
        if (uriN0 != null) {
            g(a(uriN0.getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (p.a()) {
            this.f8509c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
            mapHashMap.put("details", b(file));
            this.f8508b.E().a(f2.Z0, str, mapHashMap);
        } catch (Throwable th) {
            if (p.a()) {
                this.f8509c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.f8508b.E().a("FileManager", str, th);
        }
    }

    private long a(long j10) {
        return j10 / 1048576;
    }

    public boolean a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }
}
