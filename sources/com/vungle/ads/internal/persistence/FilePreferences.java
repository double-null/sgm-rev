package com.vungle.ads.internal.persistence;

import com.vungle.ads.internal.util.CollectionsConcurrencyUtil;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.PathProvider;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rd.PSo.cNMUz;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: FilePreferences.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class FilePreferences {
    public static final String FILENAME = "settings_vungle";
    public static final String TPAT_FAILED_FILENAME = "vngFailedTpats";
    private final File file;
    private final Executor ioExecutor;
    private final ConcurrentHashMap<String, Object> values;
    public static final Companion Companion = new Companion(null);
    private static final ConcurrentHashMap<String, FilePreferences> filePreferenceMap = new ConcurrentHashMap<>();

    public /* synthetic */ FilePreferences(Executor executor, PathProvider pathProvider, String str, k kVar) {
        this(executor, pathProvider, str);
    }

    public static final synchronized FilePreferences get(Executor executor, PathProvider pathProvider, String str) {
        return Companion.get(executor, pathProvider, str);
    }

    public final void apply() {
        final HashMap map = new HashMap(this.values);
        this.ioExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.persistence.a
            @Override // java.lang.Runnable
            public final void run() {
                FilePreferences.m271apply$lambda0(this.f13082a, map);
            }
        });
    }

    public final boolean getBoolean(String key, boolean z10) {
        t.f(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    public final long getLong(String key, long j10) {
        t.f(key, "key");
        Object obj = this.values.get(key);
        return obj instanceof Long ? ((Number) obj).longValue() : j10;
    }

    public final String getString(String key, String defaultValue) {
        t.f(key, "key");
        t.f(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof String ? (String) obj : defaultValue;
    }

    public final HashSet<String> getStringSet(String key, HashSet<String> defaultValue) {
        t.f(key, "key");
        t.f(defaultValue, "defaultValue");
        Object obj = this.values.get(key);
        return obj instanceof HashSet ? CollectionsConcurrencyUtil.getNewHashSet((HashSet) obj) : defaultValue;
    }

    public final FilePreferences put(String key, boolean z10) {
        t.f(key, "key");
        this.values.put(key, Boolean.valueOf(z10));
        return this;
    }

    public final FilePreferences remove(String key) {
        t.f(key, "key");
        if (this.values.containsKey(key)) {
            this.values.remove(key);
        }
        return this;
    }

    private FilePreferences(Executor executor, PathProvider pathProvider, String str) {
        this.ioExecutor = executor;
        File file = new File(pathProvider.getSharedPrefsDir(), str);
        this.file = file;
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        Object serializable = FileUtility.readSerializable(file);
        if (serializable instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) serializable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: apply$lambda-0, reason: not valid java name */
    public static final void m271apply$lambda0(FilePreferences this$0, Serializable serializable) {
        t.f(this$0, "this$0");
        t.f(serializable, cNMUz.EUUIkTDLxlm);
        FileUtility.writeSerializable(this$0.file, serializable);
    }

    public final int getInt(String str, int i10) {
        t.f(str, TwDPD.ZLpzaZPww);
        Object obj = this.values.get(str);
        return obj instanceof Integer ? ((Number) obj).intValue() : i10;
    }

    public final FilePreferences put(String key, String value) {
        t.f(key, "key");
        t.f(value, "value");
        this.values.put(key, value);
        return this;
    }

    public final Boolean getBoolean(String key) {
        t.f(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final String getString(String key) {
        t.f(key, "key");
        Object obj = this.values.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final FilePreferences put(String key, int i10) {
        t.f(key, "key");
        this.values.put(key, Integer.valueOf(i10));
        return this;
    }

    public final FilePreferences put(String key, HashSet<String> hashSet) {
        t.f(key, "key");
        this.values.put(key, CollectionsConcurrencyUtil.getNewHashSet(hashSet));
        return this;
    }

    public final FilePreferences put(String key, long j10) {
        t.f(key, "key");
        this.values.put(key, Long.valueOf(j10));
        return this;
    }

    /* synthetic */ FilePreferences(Executor executor, PathProvider pathProvider, String str, int i10, k kVar) {
        this(executor, pathProvider, (i10 & 4) != 0 ? FILENAME : str);
    }

    /* JADX INFO: compiled from: FilePreferences.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ FilePreferences get$default(Companion companion, Executor executor, PathProvider pathProvider, String str, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str = FilePreferences.FILENAME;
            }
            return companion.get(executor, pathProvider, str);
        }

        public final synchronized FilePreferences get(Executor ioExecutor, PathProvider pathProvider, String filename) {
            Object filePreferences;
            Object objPutIfAbsent;
            t.f(ioExecutor, "ioExecutor");
            t.f(pathProvider, "pathProvider");
            t.f(filename, "filename");
            ConcurrentHashMap concurrentHashMap = FilePreferences.filePreferenceMap;
            filePreferences = concurrentHashMap.get(filename);
            if (filePreferences == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(filename, (filePreferences = new FilePreferences(ioExecutor, pathProvider, filename, null)))) != null) {
                filePreferences = objPutIfAbsent;
            }
            t.e(filePreferences, "filePreferenceMap.getOrP…, filename)\n            }");
            return (FilePreferences) filePreferences;
        }

        public static /* synthetic */ void getFILENAME$annotations() {
        }
    }
}
