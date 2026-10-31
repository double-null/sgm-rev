package io.bidmachine;

import android.content.Context;
import android.media.AudioManager;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceInfo {
    private static final String OS_NAME = "android";
    private static volatile DeviceInfo instance;
    private final s3 cache;
    private final b cpu;
    private final c gpu;
    private String hwv;
    public final Boolean isNetworkInRoaming;
    private Boolean isRooted;
    public final boolean isTablet;
    public final String manufacturer;
    public final String model;
    public final String osName;
    public final String osVersion;
    public final String phoneCarrier;
    public final String phoneMCCMNC;
    public final float screenDensity;
    public final int screenDpi;
    public final String simCarrier;
    public final String simCountry;
    private Long totalDiskSpaceInMB;
    private final a audio = new a();
    private final d ram = new d();

    static final class a {
        a() {
        }

        private AudioManager a(Context context) {
            return (AudioManager) context.getSystemService("audio");
        }

        Float b(Context context) {
            AudioManager audioManagerA = a(context);
            if (audioManagerA == null) {
                return null;
            }
            int streamVolume = audioManagerA.getStreamVolume(3);
            int streamMaxVolume = audioManagerA.getStreamMaxVolume(3);
            int streamMinVolume = Build.VERSION.SDK_INT >= 28 ? audioManagerA.getStreamMinVolume(3) : 0;
            int i10 = streamMaxVolume - streamMinVolume;
            return i10 == 0 ? Float.valueOf(0.0f) : Float.valueOf((streamVolume - streamMinVolume) / i10);
        }

        Boolean c(Context context) {
            AudioManager audioManagerA = a(context);
            if (audioManagerA == null) {
                return null;
            }
            int ringerMode = audioManagerA.getRingerMode();
            boolean z10 = true;
            if (ringerMode != 0 && ringerMode != 1) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s3 f16455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f16456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f16457c;

        b(s3 s3Var) {
            this.f16455a = s3Var;
        }

        private void a() throws Throwable {
            e();
            if (TextUtils.isEmpty(this.f16456b)) {
                this.f16456b = Build.BOARD;
            }
            if (TextUtils.isEmpty(this.f16457c)) {
                this.f16457c = Build.HARDWARE;
            }
        }

        private String b(String str) {
            Matcher matcher = Pattern.compile(":\\s*(.*)").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        }

        private void e() throws Throwable {
            RandomAccessFile randomAccessFile;
            Throwable th;
            RandomAccessFile randomAccessFile2 = null;
            try {
                randomAccessFile = new RandomAccessFile("/proc/cpuinfo", "r");
                while (true) {
                    try {
                        String line = randomAccessFile.readLine();
                        if (line != null) {
                            if (line.startsWith("model name:") || line.startsWith("Hardware:")) {
                                this.f16456b = b(line);
                            } else if (line.startsWith("vendor_id:")) {
                                this.f16457c = b(line);
                            }
                            if (this.f16456b != null && this.f16457c != null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception unused) {
                        randomAccessFile2 = randomAccessFile;
                        io.bidmachine.core.h.h(randomAccessFile2);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        io.bidmachine.core.h.h(randomAccessFile);
                        throw th;
                    }
                }
                io.bidmachine.core.h.h(randomAccessFile);
            } catch (Exception unused2) {
            } catch (Throwable th3) {
                randomAccessFile = null;
                th = th3;
            }
        }

        String c() {
            return this.f16456b;
        }

        String d() {
            return this.f16457c;
        }

        void f(Context context) throws Throwable {
            if (TextUtils.isEmpty(this.f16456b)) {
                this.f16456b = this.f16455a.a(context, "cpu_name");
            }
            if (TextUtils.isEmpty(this.f16457c)) {
                this.f16457c = this.f16455a.a(context, "cpu_vendor");
            }
            if (TextUtils.isEmpty(this.f16456b) || TextUtils.isEmpty(this.f16457c)) {
                a();
                this.f16455a.b(context, "cpu_name", this.f16456b);
                this.f16455a.b(context, "cpu_vendor", this.f16457c);
            }
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s3 f16458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f16459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f16460c;

        c(s3 s3Var) {
            this.f16458a = s3Var;
        }

        private EGLConfig a(EGLDisplay eGLDisplay) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr = new int[1];
            EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0);
            if (iArr[0] == 0) {
                return null;
            }
            return eGLConfigArr[0];
        }

        private void b(EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext) {
            if (eGLDisplay != null) {
                i(eGLDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                if (eGLSurface != null) {
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                }
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                }
                EGL14.eglTerminate(eGLDisplay);
            }
        }

        private EGLContext c(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        }

        private EGLSurface d(EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        }

        private void e() throws Throwable {
            EGLContext eGLContext;
            EGLSurface eGLSurfaceD;
            EGLContext eGLContext2;
            EGLContext eGLContext3;
            EGLDisplay eGLDisplay = null;
            eGLContextC = null;
            EGLContext eGLContextC = null;
            EGLSurface eGLSurface = null;
            EGLDisplay eGLDisplay2 = null;
            try {
                EGLDisplay eGLDisplayH = h();
                try {
                    EGLConfig eGLConfigA = a(eGLDisplayH);
                    if (eGLConfigA != null) {
                        eGLSurfaceD = d(eGLDisplayH, eGLConfigA);
                        try {
                            eGLContextC = c(eGLDisplayH, eGLConfigA);
                            i(eGLDisplayH, eGLSurfaceD, eGLContextC);
                            this.f16459b = GLES20.glGetString(7937);
                            this.f16460c = GLES20.glGetString(7936);
                            eGLContext3 = eGLContextC;
                            eGLSurface = eGLSurfaceD;
                        } catch (Exception unused) {
                            eGLContext2 = eGLContextC;
                            eGLDisplay2 = eGLDisplayH;
                            b(eGLDisplay2, eGLSurfaceD, eGLContext2);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            eGLContext = eGLContextC;
                            eGLDisplay = eGLDisplayH;
                            b(eGLDisplay, eGLSurfaceD, eGLContext);
                            throw th;
                        }
                    } else {
                        eGLContext3 = null;
                    }
                    b(eGLDisplayH, eGLSurface, eGLContext3);
                } catch (Exception unused2) {
                    eGLSurfaceD = null;
                    eGLDisplay2 = eGLDisplayH;
                    eGLContext2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    eGLSurfaceD = null;
                    eGLDisplay = eGLDisplayH;
                    eGLContext = null;
                }
            } catch (Exception unused3) {
                eGLContext2 = null;
                eGLSurfaceD = null;
            } catch (Throwable th3) {
                th = th3;
                eGLContext = null;
                eGLSurfaceD = null;
            }
        }

        private EGLDisplay h() {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            int[] iArr = new int[2];
            EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
            return eGLDisplayEglGetDisplay;
        }

        private void i(EGLDisplay eGLDisplay, EGLSurface eGLSurface, EGLContext eGLContext) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }

        String f() {
            return this.f16459b;
        }

        String g() {
            return this.f16460c;
        }

        void j(Context context) throws Throwable {
            if (TextUtils.isEmpty(this.f16459b)) {
                this.f16459b = this.f16458a.a(context, "gpu_name");
            }
            if (TextUtils.isEmpty(this.f16460c)) {
                this.f16460c = this.f16458a.a(context, "gpu_vendor");
            }
            if (TextUtils.isEmpty(this.f16459b) || TextUtils.isEmpty(this.f16460c)) {
                e();
                this.f16458a.b(context, "gpu_name", this.f16459b);
                this.f16458a.b(context, "gpu_vendor", this.f16460c);
            }
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f16461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f16462b;

        d() {
        }

        private String a(String str) {
            Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        }

        private Long d(String str) {
            if (str != null) {
                try {
                    return Long.valueOf(Long.parseLong(str) * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }

        Long b() {
            return this.f16462b;
        }

        Long c() {
            return this.f16461a;
        }

        void e() throws Throwable {
            RandomAccessFile randomAccessFile;
            Throwable th;
            RandomAccessFile randomAccessFile2 = null;
            try {
                randomAccessFile = new RandomAccessFile("/proc/meminfo", "r");
                while (true) {
                    try {
                        String line = randomAccessFile.readLine();
                        if (line != null) {
                            if (line.startsWith("MemTotal:")) {
                                this.f16461a = d(a(line));
                            } else if (line.startsWith("MemAvailable:")) {
                                this.f16462b = d(a(line));
                            }
                            if (this.f16461a != null && this.f16462b != null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (Exception unused) {
                        randomAccessFile2 = randomAccessFile;
                        io.bidmachine.core.h.h(randomAccessFile2);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        io.bidmachine.core.h.h(randomAccessFile);
                        throw th;
                    }
                }
                io.bidmachine.core.h.h(randomAccessFile);
            } catch (Exception unused2) {
            } catch (Throwable th3) {
                randomAccessFile = null;
                th = th3;
            }
        }
    }

    private DeviceInfo(Context context) {
        s3 s3Var = new s3();
        this.cache = s3Var;
        this.cpu = new b(s3Var);
        this.gpu = new c(s3Var);
        this.osName = "android";
        this.osVersion = String.valueOf(Build.VERSION.SDK_INT);
        this.manufacturer = wb.f.b();
        this.model = wb.f.c();
        this.screenDpi = oc.d.l(context);
        this.screenDensity = wb.f.i(context);
        this.isTablet = wb.f.k(context);
        this.phoneMCCMNC = wb.f.e(context);
        this.phoneCarrier = wb.f.f(context);
        this.simCarrier = wb.f.h(context);
        this.simCountry = wb.f.g(context);
        this.isNetworkInRoaming = wb.f.j(context);
    }

    private String getKernelVersionThroughProcVersion() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th;
        try {
            randomAccessFile = new RandomAccessFile("/proc/version", "r");
            try {
                String line = randomAccessFile.readLine();
                io.bidmachine.core.h.h(randomAccessFile);
                return line;
            } catch (Exception unused) {
                io.bidmachine.core.h.h(randomAccessFile);
                return null;
            } catch (Throwable th2) {
                th = th2;
                io.bidmachine.core.h.h(randomAccessFile);
                throw th;
            }
        } catch (Exception unused2) {
            randomAccessFile = null;
        } catch (Throwable th3) {
            randomAccessFile = null;
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.BufferedReader, java.io.Closeable] */
    private String getKernelVersionThroughUName() throws Throwable {
        InputStreamReader inputStreamReader;
        ?? bufferedReader;
        Throwable th;
        Process processExec;
        try {
            processExec = Runtime.getRuntime().exec("uname -a");
            try {
                inputStreamReader = new InputStreamReader(processExec.getInputStream());
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        String line = bufferedReader.readLine();
                        io.bidmachine.core.h.h(bufferedReader);
                        io.bidmachine.core.h.h(inputStreamReader);
                        processExec.destroy();
                        return line;
                    } catch (Exception unused) {
                        io.bidmachine.core.h.h(bufferedReader);
                        io.bidmachine.core.h.h(inputStreamReader);
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        io.bidmachine.core.h.h(bufferedReader);
                        io.bidmachine.core.h.h(inputStreamReader);
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        throw th;
                    }
                } catch (Exception unused2) {
                    bufferedReader = 0;
                } catch (Throwable th3) {
                    bufferedReader = 0;
                    th = th3;
                }
            } catch (Exception unused3) {
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
                io.bidmachine.core.h.h(bufferedReader);
                io.bidmachine.core.h.h(inputStreamReader);
                if (processExec != null) {
                    processExec.destroy();
                }
                return null;
            } catch (Throwable th4) {
                bufferedReader = 0;
                th = th4;
                inputStreamReader = null;
            }
        } catch (Exception unused4) {
            processExec = null;
            inputStreamReader = null;
        } catch (Throwable th5) {
            inputStreamReader = null;
            bufferedReader = 0;
            th = th5;
            processExec = null;
        }
    }

    public static DeviceInfo obtain(Context context) {
        DeviceInfo deviceInfo = instance;
        if (deviceInfo == null) {
            synchronized (DeviceInfo.class) {
                deviceInfo = instance;
                if (deviceInfo == null) {
                    deviceInfo = new DeviceInfo(context);
                    instance = deviceInfo;
                }
            }
        }
        return deviceInfo;
    }

    a getAudio() {
        return this.audio;
    }

    Long getAvailableDiskSpaceInMB() {
        try {
            if (!io.bidmachine.core.h.D()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.valueOf((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1048576);
        } catch (Exception unused) {
            return null;
        }
    }

    b getCpu() {
        return this.cpu;
    }

    c getGpu() {
        return this.gpu;
    }

    String getHWV() throws Throwable {
        String str = this.hwv;
        if (str != null) {
            return str;
        }
        String kernelVersionThroughProcVersion = getKernelVersionThroughProcVersion();
        if (!TextUtils.isEmpty(kernelVersionThroughProcVersion)) {
            this.hwv = kernelVersionThroughProcVersion;
            return kernelVersionThroughProcVersion;
        }
        String kernelVersionThroughUName = getKernelVersionThroughUName();
        this.hwv = kernelVersionThroughUName;
        return kernelVersionThroughUName;
    }

    d getRam() {
        return this.ram;
    }

    Long getTotalDiskSpaceInMB() {
        Long l10 = this.totalDiskSpaceInMB;
        if (l10 != null) {
            return l10;
        }
        try {
            if (!io.bidmachine.core.h.D()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            Long lValueOf = Long.valueOf((statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / 1048576);
            this.totalDiskSpaceInMB = lValueOf;
            return lValueOf;
        } catch (Exception unused) {
            return null;
        }
    }

    boolean isDeviceRooted() {
        Boolean bool = this.isRooted;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = true;
        try {
            String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
            for (int i10 = 0; i10 < 8; i10++) {
                if (new File(strArr[i10]).exists()) {
                    this.isRooted = Boolean.TRUE;
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() == null) {
                z10 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            this.isRooted = boolValueOf;
            boolean zBooleanValue = boolValueOf.booleanValue();
            processExec.destroy();
            return zBooleanValue;
        } catch (Exception unused2) {
            if (processExec != null) {
                processExec.destroy();
            }
            this.isRooted = Boolean.FALSE;
            return false;
        } catch (Throwable th) {
            if (processExec != null) {
                processExec.destroy();
            }
            throw th;
        }
    }

    void updateHwInfo(Context context) throws Throwable {
        this.cpu.f(context);
        this.gpu.j(context);
        this.ram.e();
    }
}
