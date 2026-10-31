package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.crashlytics.internal.RPrM.UICvx;
import com.vungle.ads.internal.protos.Sdk;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final int REMOTE = 1;
    private static Boolean zzc = null;
    private static String zzd = null;
    private static boolean zze = false;
    private static int zzf = -1;
    private static Boolean zzg;
    private static zzp zzl;
    private static zzq zzm;
    private final Context zzk;
    private static final ThreadLocal zzh = new ThreadLocal();
    private static final ThreadLocal zzi = new zze();
    private static final VersionPolicy.IVersions zzj = new zzf();
    public static final VersionPolicy PREFER_REMOTE = new zzg();
    public static final VersionPolicy PREFER_LOCAL = new zzh();
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzi();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzj();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzk();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzl();
    public static final VersionPolicy zza = new zzm();
    public static final VersionPolicy zzb = new zzc();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, Throwable th, byte[] bArr) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, byte[] bArr) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
    public interface VersionPolicy {

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
        public interface IVersions {
            int zza(Context context, String str, boolean z10) throws LoadingException;

            int zzb(Context context, String str);
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.11.0 */
        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzk = context;
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(strValueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:122:0x02de  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f0 A[Catch: all -> 0x0363, TryCatch #3 {all -> 0x0363, blocks: (B:5:0x003f, B:9:0x00b8, B:14:0x00c0, B:17:0x00c6, B:30:0x00e8, B:103:0x0273, B:104:0x027e, B:106:0x0280, B:108:0x0282, B:109:0x028a, B:111:0x028c, B:113:0x02b4, B:115:0x02c3, B:125:0x02e7, B:126:0x02ef, B:127:0x02f0, B:128:0x0311, B:129:0x0312, B:130:0x0362), top: B:144:0x003f, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x00c6 A[Catch: all -> 0x0363, TRY_LEAVE, TryCatch #3 {all -> 0x0363, blocks: (B:5:0x003f, B:9:0x00b8, B:14:0x00c0, B:17:0x00c6, B:30:0x00e8, B:103:0x0273, B:104:0x027e, B:106:0x0280, B:108:0x0282, B:109:0x028a, B:111:0x028c, B:113:0x02b4, B:115:0x02c3, B:125:0x02e7, B:126:0x02ef, B:127:0x02f0, B:128:0x0311, B:129:0x0312, B:130:0x0362), top: B:144:0x003f, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f3 A[Catch: all -> 0x026f, TryCatch #7 {, blocks: (B:33:0x00ed, B:35:0x00f3, B:36:0x00f5, B:97:0x0266, B:98:0x026e), top: B:149:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f8 A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0139 A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b1 A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01bd A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01f4 A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01fb A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0203 A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0212 A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:85:0x021b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x021d A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:87:0x022d A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0242 A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:91:0x024b A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0254 A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:95:0x025d A[Catch: all -> 0x0272, LoadingException -> 0x027f, RemoteException -> 0x0281, TryCatch #7 {RemoteException -> 0x0281, LoadingException -> 0x027f, all -> 0x0272, blocks: (B:32:0x00ec, B:38:0x00f8, B:40:0x00ff, B:41:0x0133, B:45:0x0139, B:47:0x0141, B:49:0x0145, B:50:0x0151, B:57:0x0160, B:59:0x0166, B:61:0x018d, B:63:0x0195, B:64:0x019c, B:65:0x01a4, B:60:0x017a, B:68:0x01a7, B:69:0x01a8, B:70:0x01b0, B:71:0x01b1, B:72:0x01b9, B:75:0x01bc, B:76:0x01bd, B:78:0x01f4, B:80:0x01fb, B:82:0x0203, B:88:0x023c, B:90:0x0242, B:91:0x024b, B:92:0x0253, B:83:0x0212, B:84:0x021a, B:86:0x021d, B:87:0x022d, B:93:0x0254, B:94:0x025c, B:95:0x025d, B:96:0x0265, B:101:0x0271), top: B:150:0x00ec }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0266 A[Catch: all -> 0x026f, TRY_ENTER, TryCatch #7 {, blocks: (B:33:0x00ed, B:35:0x00f3, B:36:0x00f5, B:97:0x0266, B:98:0x026e), top: B:149:0x00ed }] */
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        DynamiteModule dynamiteModuleZze;
        Cursor cursor;
        int i10;
        Boolean bool;
        zzp zzpVarZzg;
        int iZzi;
        IObjectWrapper iObjectWrapperZze;
        Object objUnwrap;
        zzn zznVar;
        zzq zzqVar;
        zzn zznVar2;
        Boolean boolValueOf;
        IObjectWrapper iObjectWrapperZze2;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = zzh;
        zzn zznVar3 = (zzn) threadLocal.get();
        zzn zznVar4 = new zzn(null);
        threadLocal.set(zznVar4);
        ThreadLocal threadLocal2 = zzi;
        long jLongValue = ((Long) threadLocal2.get()).longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzj);
            int i11 = selectionResultSelectModule.localVersion;
            int i12 = selectionResultSelectModule.remoteVersion;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(i11).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(i12).length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i11);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i12);
            Log.i("DynamiteModule", sb2.toString());
            int i13 = selectionResultSelectModule.selection;
            if (i13 != 0) {
                if (i13 != -1) {
                    if (i13 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                        if (i13 == -1) {
                            DynamiteModule dynamiteModuleZze2 = zze(applicationContext, str);
                            if (jLongValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(jLongValue));
                            }
                            cursor2 = zznVar4.zza;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(zznVar3);
                            return dynamiteModuleZze2;
                        }
                        if (i13 == 1) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 36);
                            sb3.append("VersionPolicy returned invalid code:");
                            sb3.append(i13);
                            throw new LoadingException(sb3.toString(), null);
                        }
                        try {
                            i10 = selectionResultSelectModule.remoteVersion;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (zzb(context)) {
                                        throw new LoadingException("Remote loading disabled", null);
                                    }
                                    bool = zzc;
                                }
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i10).length());
                                    sb4.append("Selected remote version of ");
                                    sb4.append(str);
                                    sb4.append(", version >= ");
                                    sb4.append(i10);
                                    Log.i("DynamiteModule", sb4.toString());
                                    synchronized (DynamiteModule.class) {
                                        zzqVar = zzm;
                                    }
                                    if (zzqVar != null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    zznVar2 = (zzn) threadLocal.get();
                                    if (zznVar2 != null || zznVar2.zza == null) {
                                        throw new LoadingException("No result cursor", null);
                                    }
                                    Context applicationContext2 = context.getApplicationContext();
                                    Cursor cursor3 = zznVar2.zza;
                                    ObjectWrapper.wrap(null);
                                    synchronized (DynamiteModule.class) {
                                        boolValueOf = Boolean.valueOf(zzf >= 2);
                                    }
                                    if (boolValueOf.booleanValue()) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        iObjectWrapperZze2 = zzqVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i10, ObjectWrapper.wrap(cursor3));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        iObjectWrapperZze2 = zzqVar.zze(ObjectWrapper.wrap(applicationContext2), str, i10, ObjectWrapper.wrap(cursor3));
                                    }
                                    Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperZze2);
                                    if (context2 == null) {
                                        throw new LoadingException("Failed to get module context", null);
                                    }
                                    dynamiteModuleZze = new DynamiteModule(context2);
                                } else {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i10).length());
                                    sb5.append("Selected remote version of ");
                                    sb5.append(str);
                                    sb5.append(", version >= ");
                                    sb5.append(i10);
                                    Log.i("DynamiteModule", sb5.toString());
                                    zzpVarZzg = zzg(context);
                                    if (zzpVarZzg != null) {
                                        throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                    }
                                    iZzi = zzpVarZzg.zzi();
                                    if (iZzi >= 3) {
                                        zznVar = (zzn) threadLocal.get();
                                        if (zznVar != null) {
                                            throw new LoadingException("No cached result cursor holder", null);
                                        }
                                        iObjectWrapperZze = zzpVarZzg.zzk(ObjectWrapper.wrap(context), str, i10, ObjectWrapper.wrap(zznVar.zza));
                                    } else if (iZzi == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        iObjectWrapperZze = zzpVarZzg.zzg(ObjectWrapper.wrap(context), str, i10);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        iObjectWrapperZze = zzpVarZzg.zze(ObjectWrapper.wrap(context), str, i10);
                                    }
                                    objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZze);
                                    if (objUnwrap != null) {
                                        throw new LoadingException("Failed to load remote module.", null);
                                    }
                                    dynamiteModuleZze = new DynamiteModule((Context) objUnwrap);
                                }
                                if (jLongValue == 0) {
                                    zzi.remove();
                                } else {
                                    zzi.set(Long.valueOf(jLongValue));
                                }
                                cursor = zznVar4.zza;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                zzh.set(zznVar3);
                                return dynamiteModuleZze;
                            } catch (RemoteException e10) {
                                throw new LoadingException("Failed to load remote module.", e10, null);
                            } catch (LoadingException e11) {
                                throw e11;
                            } catch (Throwable th) {
                                CrashUtils.addDynamiteErrorToDropBox(context, th);
                                throw new LoadingException("Failed to load remote module.", th, null);
                            }
                        } catch (LoadingException e12) {
                            String message = e12.getMessage();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(message).length() + 30);
                            sb6.append("Failed to load remote module: ");
                            sb6.append(message);
                            Log.w("DynamiteModule", sb6.toString());
                            int i14 = selectionResultSelectModule.localVersion;
                            if (i14 == 0 || versionPolicy.selectModule(context, str, new zzo(i14, 0)).selection != -1) {
                                throw new LoadingException("Remote load failed. No local fallback found.", e12, null);
                            }
                            dynamiteModuleZze = zze(applicationContext, str);
                        }
                    }
                } else if (selectionResultSelectModule.localVersion != 0) {
                    i13 = -1;
                    if (i13 == 1) {
                    }
                    if (i13 == -1) {
                        DynamiteModule dynamiteModuleZze3 = zze(applicationContext, str);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(jLongValue));
                        }
                        cursor2 = zznVar4.zza;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(zznVar3);
                        return dynamiteModuleZze3;
                    }
                    if (i13 == 1) {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(i13).length() + 36);
                        sb7.append("VersionPolicy returned invalid code:");
                        sb7.append(i13);
                        throw new LoadingException(sb7.toString(), null);
                    }
                    i10 = selectionResultSelectModule.remoteVersion;
                    synchronized (DynamiteModule.class) {
                        if (zzb(context)) {
                            throw new LoadingException("Remote loading disabled", null);
                        }
                        bool = zzc;
                        if (bool != null) {
                            throw new LoadingException("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i10).length());
                            sb8.append("Selected remote version of ");
                            sb8.append(str);
                            sb8.append(", version >= ");
                            sb8.append(i10);
                            Log.i("DynamiteModule", sb8.toString());
                            synchronized (DynamiteModule.class) {
                                zzqVar = zzm;
                                if (zzqVar != null) {
                                    throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                }
                                zznVar2 = (zzn) threadLocal.get();
                                if (zznVar2 != null) {
                                }
                                throw new LoadingException("No result cursor", null);
                            }
                        }
                        StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i10).length());
                        sb9.append("Selected remote version of ");
                        sb9.append(str);
                        sb9.append(", version >= ");
                        sb9.append(i10);
                        Log.i("DynamiteModule", sb9.toString());
                        zzpVarZzg = zzg(context);
                        if (zzpVarZzg != null) {
                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                        }
                        iZzi = zzpVarZzg.zzi();
                        if (iZzi >= 3) {
                            zznVar = (zzn) threadLocal.get();
                            if (zznVar != null) {
                                throw new LoadingException("No cached result cursor holder", null);
                            }
                            iObjectWrapperZze = zzpVarZzg.zzk(ObjectWrapper.wrap(context), str, i10, ObjectWrapper.wrap(zznVar.zza));
                        } else if (iZzi == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            iObjectWrapperZze = zzpVarZzg.zzg(ObjectWrapper.wrap(context), str, i10);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            iObjectWrapperZze = zzpVarZzg.zze(ObjectWrapper.wrap(context), str, i10);
                        }
                        objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZze);
                        if (objUnwrap != null) {
                            throw new LoadingException("Failed to load remote module.", null);
                        }
                        dynamiteModuleZze = new DynamiteModule((Context) objUnwrap);
                        if (jLongValue == 0) {
                            zzi.remove();
                        } else {
                            zzi.set(Long.valueOf(jLongValue));
                        }
                        cursor = zznVar4.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        zzh.set(zznVar3);
                        return dynamiteModuleZze;
                    }
                }
            }
            int i15 = selectionResultSelectModule.localVersion;
            int i16 = selectionResultSelectModule.remoteVersion;
            StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i15).length() + 23 + String.valueOf(i16).length() + 1);
            sb10.append("No acceptable module ");
            sb10.append(str);
            sb10.append(" found. Local version is ");
            sb10.append(i15);
            sb10.append(" and remote version is ");
            sb10.append(i16);
            sb10.append(".");
            throw new LoadingException(sb10.toString(), null);
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                zzi.remove();
            } else {
                zzi.set(Long.valueOf(jLongValue));
            }
            Cursor cursor4 = zznVar4.zza;
            if (cursor4 != null) {
                cursor4.close();
            }
            zzh.set(zznVar3);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab A[Catch: all -> 0x00b6, TryCatch #9 {, blocks: (B:10:0x002a, B:12:0x0036, B:49:0x00b4, B:15:0x003c, B:17:0x0043, B:19:0x0049, B:22:0x004c, B:24:0x0050, B:28:0x005a, B:30:0x0062, B:33:0x0069, B:40:0x0093, B:41:0x009b, B:36:0x0070, B:38:0x0076, B:39:0x0085, B:44:0x009e, B:47:0x00a1, B:48:0x00ab, B:16:0x003f), top: B:135:0x002a, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0179 A[Catch: all -> 0x01dd, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01dd, blocks: (B:4:0x0006, B:62:0x00e2, B:64:0x00e8, B:69:0x0111, B:91:0x016b, B:95:0x0179, B:116:0x01d6, B:117:0x01d9, B:111:0x01ce, B:67:0x00ee, B:120:0x01dc, B:5:0x0007, B:8:0x000d, B:9:0x0029, B:60:0x00df, B:20:0x004a, B:42:0x009c, B:45:0x009f, B:53:0x00b8, B:61:0x00e1, B:59:0x00be), top: B:137:0x0006, inners: #6, #10 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.StringBuilder] */
    public static int zza(Context context, String str, boolean z10) {
        Throwable th;
        RemoteException e10;
        ?? r10;
        ?? r11;
        ?? r12;
        boolean zZzd;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzc;
                Cursor cursor2 = null;
                int iZzf = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    zzf(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            } else {
                                if (!zzb(context)) {
                                    return 0;
                                }
                                if (zze) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (bool2.equals(null)) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        try {
                                            int iZzc = zzc(context, str, z10, true);
                                            String str2 = zzd;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader classLoaderZza = zzb.zza();
                                                if (classLoaderZza == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        String str3 = zzd;
                                                        Preconditions.checkNotNull(str3);
                                                        classLoaderZza = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = zzd;
                                                        Preconditions.checkNotNull(str4);
                                                        classLoaderZza = new zzd(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                zzf(classLoaderZza);
                                                declaredField.set(null, classLoaderZza);
                                                zzc = bool2;
                                                return iZzc;
                                            }
                                            return iZzc;
                                        } catch (LoadingException unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        }
                                    }
                                }
                            }
                            zzc = bool;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        String string = e11.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(string);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzc(context, str, z10, false);
                    } catch (LoadingException e12) {
                        String message = e12.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb3.append("Failed to retrieve remote module version: ");
                        sb3.append(message);
                        Log.w("DynamiteModule", sb3.toString());
                        return 0;
                    }
                }
                ?? r13 = "Failed to retrieve remote module version: ";
                zzp zzpVarZzg = zzg(context);
                if (zzpVarZzg != null) {
                    try {
                        try {
                            int iZzi = zzpVarZzg.zzi();
                            if (iZzi >= 3) {
                                zzn zznVar = (zzn) zzh.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzpVarZzg.zzj(ObjectWrapper.wrap(context), str, z10, ((Long) zzi.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i10 = cursor3.getInt(0);
                                                if (i10 <= 0 || !(zZzd = zzd(cursor3))) {
                                                    r11 = r13;
                                                    r12 = zZzd;
                                                    r11 = zZzd;
                                                    r11 = r13;
                                                    cursor2 = cursor3;
                                                    r12 = r11;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzf = i10;
                                                r13 = r12;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                r13 = r13;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                    r13 = r13;
                                                }
                                            }
                                        } catch (RemoteException e13) {
                                            e10 = e13;
                                            cursor2 = cursor3;
                                            r10 = r13;
                                            String message2 = e10.getMessage();
                                            ?? sb4 = new StringBuilder(String.valueOf(message2).length() + 42);
                                            sb4.append(r10);
                                            sb4.append(message2);
                                            Log.w("DynamiteModule", sb4.toString());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        r13 = r13;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                            r13 = r13;
                                        }
                                    }
                                } else {
                                    iZzf = cursor.getInt(0);
                                    r13 = r13;
                                }
                            } else if (iZzi == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzpVarZzg.zzh(ObjectWrapper.wrap(context), str, z10);
                                r13 = r13;
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzpVarZzg.zzf(ObjectWrapper.wrap(context), str, z10);
                                r13 = r13;
                            }
                        } catch (RemoteException e14) {
                            e10 = e14;
                            r10 = r13;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return iZzf;
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    private static boolean zzb(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzg)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (zzg == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != PlatformVersion.isAtLeastQ() ? 0 : 268435456);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            zzg = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zze = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    private static boolean zzd(Cursor cursor) {
        zzn zznVar = (zzn) zzh.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static DynamiteModule zze(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void zzf(ClassLoader classLoader) throws LoadingException {
        zzq zzqVar;
        byte[] bArr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzqVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
            }
            zzm = zzqVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new LoadingException("Failed to instantiate dynamite loader", e10, bArr);
        }
    }

    private static zzp zzg(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = zzl;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder);
                }
                if (zzpVar != null) {
                    zzl = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public Context getModuleContext() {
        return this.zzk;
    }

    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzk.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0197: MOVE (r2 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:407), block:B:113:0x0197 */
    private static int zzc(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Cursor cursor;
        MatrixCursor matrixCursor;
        Cursor cursor2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            try {
                boolean z12 = true;
                Uri uriBuild = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) zzi.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z13 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i10 = 0; i10 < count; i10++) {
                                    if (!cursorQuery.moveToPosition(i10)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr4 = new Object[columnCount];
                                    for (int i11 = 0; i11 < columnCount; i11++) {
                                        int type = cursorQuery.getType(i11);
                                        if (type == 0) {
                                            objArr4[i11] = null;
                                        } else if (type == 1) {
                                            objArr4[i11] = Long.valueOf(cursorQuery.getLong(i11));
                                        } else if (type == 2) {
                                            objArr4[i11] = Double.valueOf(cursorQuery.getDouble(i11));
                                        } else if (type == 3) {
                                            objArr4[i11] = cursorQuery.getString(i11);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr4[i11] = cursorQuery.getBlob(i11);
                                        }
                                    }
                                    matrixCursor.addRow(objArr4);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th) {
                                try {
                                    cursorQuery.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th3) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th3;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i12 = matrixCursor.getInt(0);
                            if (i12 > 0) {
                                synchronized (DynamiteModule.class) {
                                    zzd = matrixCursor.getString(2);
                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        zzf = matrixCursor.getInt(columnIndex);
                                    }
                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (matrixCursor.getInt(columnIndex2) == 0) {
                                            z12 = false;
                                        }
                                        zze = z12;
                                        z13 = z12;
                                    }
                                }
                                if (zzd(matrixCursor)) {
                                    matrixCursor = null;
                                }
                            }
                            if (z11 && z13) {
                                throw new LoadingException(UICvx.MWYSCYglcaUYv, objArr2 == true ? 1 : 0);
                            }
                            if (matrixCursor != null) {
                                matrixCursor.close();
                            }
                            return i12;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        if (e instanceof LoadingException) {
                            throw e;
                        }
                        String message = e.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25);
                        sb2.append("V2 version check failed: ");
                        sb2.append(message);
                        throw new LoadingException(sb2.toString(), e, objArr == true ? 1 : 0);
                    }
                }
                synchronized (DynamiteModule.class) {
                    if (matrixCursor == null) {
                        if (Boolean.FALSE.equals(null)) {
                            Log.w("DynamiteModule", "Play services is unavailable. Will not fall back to container v1 loader.");
                            return 0;
                        }
                    }
                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                    throw new LoadingException("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th5) {
            th = th5;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }
}
