package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.impl.communicator.ZREl.sRGQSqxgxlS;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.explorestack.protobuf.openrtb.LossReason;
import com.facebook.ads.AdError;
import com.facebook.appevents.eventdeactivation.ksG.UomBEukHFwrS;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vungle.ads.internal.persistence.mP.RHIpdOnfgiYkEj;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfl {
    public static final String zza;
    public static final byte[] zzb;
    private static final Pattern zzc;
    private static HashMap zzd;
    private static final String[] zze;
    private static final String[] zzf;
    private static final int[] zzg;
    private static final int[] zzh;
    private static final int[] zzi;

    public static zzv zzA(int i10, int i11, int i12) {
        zzt zztVar = new zzt();
        zztVar.zzo("audio/raw");
        zztVar.zzG(i11);
        zztVar.zzH(i12);
        zztVar.zzI(i10);
        return zztVar.zzO();
    }

    public static int zzB(int i10, ByteOrder byteOrder) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i10 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i10 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static int zzC(int i10) {
        if (i10 != 32) {
            return i10 != 64 ? 0 : 1879048192;
        }
        return 4;
    }

    public static boolean zzD(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4 || i10 == 1879048192;
    }

    public static int zzE(int i10) {
        int i11;
        int i12 = 6396;
        if (i10 != 10) {
            if (i10 == 16) {
                i11 = 205215996;
            } else if (i10 != 24) {
                switch (i10) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        switch (i10) {
                            case 12:
                                return 743676;
                            case 13:
                                i11 = 30136348;
                                break;
                            case 14:
                                i11 = 202070268;
                                break;
                            default:
                                return 0;
                        }
                        break;
                }
            } else {
                i11 = 67108860;
            }
            i12 = 0;
        } else {
            i11 = 737532;
        }
        return Build.VERSION.SDK_INT >= 32 ? i11 : i12;
    }

    public static int zzF(int i10) {
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return Integer.MAX_VALUE;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case 31:
                return 34;
        }
    }

    public static int zzG(int i10) {
        if (i10 != 2) {
            if (i10 == 3) {
                return 1;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    if (i10 == 1879048192) {
                                        return 8;
                                    }
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int zzH(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i10) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    public static int zzI(Uri uri) {
        byte b10;
        int i10;
        String scheme = uri.getScheme();
        if (scheme != null && (zzgss.zze("rtsp", scheme) || zzgss.zze("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            switch (zzgss.zza(lastPathSegment.substring(iLastIndexOf + 1))) {
                case "ism":
                    b10 = 2;
                    break;
                case "mpd":
                    b10 = 0;
                    break;
                case "isml":
                    b10 = 3;
                    break;
                case "m3u8":
                    b10 = 1;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                i10 = 0;
            } else if (b10 != 1) {
                i10 = (b10 == 2 || b10 == 3) ? 1 : 4;
            } else {
                i10 = 2;
            }
            if (i10 != 4) {
                return i10;
            }
        }
        Pattern pattern = zzc;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static int zzJ(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = zzg[(i12 >>> 24) ^ (bArr[i10] & 255)] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static int zzK(byte[] bArr, int i10, int i11, int i12) {
        int iZzW = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        for (int i13 = 0; i13 < i11; i13++) {
            int iA = w.a(bArr[i13]);
            iZzW = zzW(iA & 15, zzW(iA >> 4, iZzW));
        }
        return iZzW;
    }

    public static int zzL(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        while (i10 < i11) {
            i13 = zzi[i13 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i13;
    }

    public static int zzM(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static boolean zzN(zzet zzetVar, zzet zzetVar2, Inflater inflater) {
        boolean z10 = false;
        if (zzetVar.zzd() == 0) {
            return false;
        }
        if (zzetVar2.zzj() < zzetVar.zzd()) {
            int iZzd = zzetVar.zzd();
            zzetVar2.zzc(iZzd + iZzd);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(zzetVar.zzi(), zzetVar.zzg(), zzetVar.zzd());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(zzetVar2.zzi(), iInflate, zzetVar2.zzj() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                        break;
                    }
                    if (iInflate == zzetVar2.zzj()) {
                        int iZzj = zzetVar2.zzj();
                        zzetVar2.zzc(iZzj + iZzj);
                    }
                } else {
                    zzetVar2.zzf(iInflate);
                    z10 = true;
                    break;
                }
            } catch (DataFormatException unused) {
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return z10;
    }

    public static boolean zzO(zzet zzetVar, zzet zzetVar2, Inflater inflater) {
        return zzetVar.zzd() > 0 && zzetVar.zzn() == 120 && zzN(zzetVar, zzetVar2, inflater);
    }

    public static boolean zzP(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzQ(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Point zzR(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzP(context)) {
            String strZzX = Build.VERSION.SDK_INT < 28 ? zzX("sys.display-size") : zzX("vendor.display-size");
            if (!TextUtils.isEmpty(strZzX)) {
                try {
                    String[] strArrSplit = strZzX.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i10 = Integer.parseInt(strArrSplit[0]);
                        int i11 = Integer.parseInt(strArrSplit[1]);
                        if (i10 > 0 && i11 > 0) {
                            return new Point(i10, i11);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzeg.zze("Util", "Invalid display size: ".concat(String.valueOf(strZzX)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static String zzS(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static int zzT(String str) {
        String[] strArrSplit;
        int length;
        int i10 = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z10 = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        str2.getClass();
        try {
            i10 = Integer.parseInt(str2);
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static boolean zzU(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i10 == 30) {
            String str = Build.MODEL;
            if (zzgss.zze(str, "moto g(20)") || zzgss.zze(str, "rmx3231")) {
                return true;
            }
        }
        return i10 == 34 && zzgss.zze(Build.MODEL, "sm-x200");
    }

    private static long zzV(long j10, long j11, long j12, RoundingMode roundingMode) {
        long jZzc = zzhab.zzc(j10, j11);
        if (jZzc != Long.MAX_VALUE && jZzc != Long.MIN_VALUE) {
            return zzhab.zza(jZzc, j12, roundingMode);
        }
        long jZzb = zzhab.zzb(Math.abs(j11), Math.abs(j12));
        long jZza = zzhab.zza(j11, jZzb, RoundingMode.UNNECESSARY);
        long jZza2 = zzhab.zza(j12, jZzb, RoundingMode.UNNECESSARY);
        long jZzb2 = zzhab.zzb(Math.abs(j10), Math.abs(jZza2));
        long jZza3 = zzhab.zza(j10, jZzb2, RoundingMode.UNNECESSARY);
        long jZza4 = zzhab.zza(jZza2, jZzb2, RoundingMode.UNNECESSARY);
        long jZzc2 = zzhab.zzc(jZza3, jZza);
        if (jZzc2 != Long.MAX_VALUE && jZzc2 != Long.MIN_VALUE) {
            return zzhab.zza(jZzc2, jZza4, roundingMode);
        }
        double d10 = jZza3 * (jZza / jZza4);
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgzw.zza(d10, roundingMode);
    }

    private static int zzW(int i10, int i11) {
        return (char) (zzh[(i10 ^ (i11 >> 12)) & 255] ^ ((char) (i11 << 4)));
    }

    private static HashMap zzY() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zze.length;
        HashMap map = new HashMap(length + 88);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zze;
            int length3 = strArr.length;
            if (i10 >= 88) {
                return map;
            }
            map.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static boolean zza(SparseArray sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static Object[] zzb(Object[] objArr, int i10) {
        zzgtj.zza(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    public static void zzc(List list, Object[] objArr) {
        zzgtj.zzi(list.size() == objArr.length);
        list.toArray(objArr);
    }

    public static Handler zzd(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        return new Handler(looperMyLooper, null);
    }

    public static boolean zze(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Looper zzf() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static ExecutorService zzg(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzfk
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str2 = zzfl.zza;
                return new Thread(runnable, str);
            }
        });
    }

    public static ScheduledExecutorService zzh(String str) {
        final String str2 = "ExoPlayer:AudioTrackReleaseThread";
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.zzfj
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str3 = zzfl.zza;
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            }
        });
    }

    public static String zzj(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String zzk(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, StandardCharsets.UTF_8);
    }

    public static boolean zzl(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static double zzm(double d10, double d11, double d12) {
        return Math.max(-1.0d, Math.min(d10, 1.0d));
    }

    public static int zzn(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (iArr[iBinarySearch] == i10);
            i11 = z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static int zzo(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i10 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j10);
            i10 = iBinarySearch + 1;
        }
        return z11 ? Math.max(0, i10) : i10;
    }

    public static int zzp(zzeh zzehVar, long j10, boolean z10, boolean z11) {
        int iZzd = zzehVar.zzd() - 1;
        int i10 = 0;
        while (i10 <= iZzd) {
            int i11 = (i10 + iZzd) >>> 1;
            if (zzehVar.zzc(i11) < j10) {
                i10 = i11 + 1;
            } else {
                iZzd = i11 - 1;
            }
        }
        int i12 = iZzd + 1;
        if (i12 < zzehVar.zzd() && zzehVar.zzc(i12) == j10) {
            return i12;
        }
        if (iZzd == -1) {
            return 0;
        }
        return iZzd;
    }

    public static int zzq(long[] jArr, long j10, boolean z10, boolean z11) {
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        do {
            iBinarySearch++;
            if (iBinarySearch >= jArr.length) {
                break;
            }
        } while (jArr[iBinarySearch] == j10);
        return !z10 ? iBinarySearch : iBinarySearch - 1;
    }

    public static long zzr(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static long zzs(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long zzt(long j10, int i10) {
        return zzv(j10, 1000000L, i10, RoundingMode.DOWN);
    }

    public static long zzu(long j10, int i10) {
        return zzv(j10, i10, 1000000L, RoundingMode.UP);
    }

    public static long zzv(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        if (j12 >= j11 && j12 % j11 == 0) {
            return zzhab.zza(j10, zzhab.zza(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return zzhab.zzc(j10, zzhab.zza(j11, j12, RoundingMode.UNNECESSARY));
        }
        if (j12 < j10 || j12 % j10 != 0) {
            return (j12 >= j10 || j10 % j12 != 0) ? zzV(j10, j11, j12, roundingMode) : zzhab.zzc(j11, zzhab.zza(j10, j12, RoundingMode.UNNECESSARY));
        }
        return zzhab.zza(j11, zzhab.zza(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static void zzw(long[] jArr, long j10, long j11) {
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i10 = 0;
        if (j11 >= 1000000 && j11 % 1000000 == 0) {
            long jZza = zzhab.zza(j11, 1000000L, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = zzhab.zza(jArr[i10], jZza, roundingMode);
                i10++;
            }
            return;
        }
        if (j11 < 1000000 && 1000000 % j11 == 0) {
            long jZza2 = zzhab.zza(1000000L, j11, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = zzhab.zzc(jArr[i10], jZza2);
                i10++;
            }
            return;
        }
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long j12 = jArr[i11];
            if (j12 != 0) {
                if (j11 >= j12 && j11 % j12 == 0) {
                    jArr[i11] = zzhab.zza(1000000L, zzhab.zza(j11, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j11 >= j12 || j12 % j11 != 0) {
                    jArr[i11] = zzV(j12, 1000000L, j11, roundingMode);
                } else {
                    jArr[i11] = zzhab.zzc(1000000L, zzhab.zza(j12, j11, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static long zzx(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * ((double) f10));
    }

    public static long zzy(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / ((double) f10));
    }

    public static String zzz(int i10) {
        return new String(new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10}, StandardCharsets.US_ASCII);
    }

    static {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        int i10 = Build.VERSION.SDK_INT;
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 2 + String.valueOf(str2).length() + 2 + String.valueOf(str3).length() + 2 + String.valueOf(i10).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(i10);
        zza = sb2.toString();
        zzb = new byte[0];
        zzc = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zze = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", UomBEukHFwrS.TliKWLzpW, "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", sRGQSqxgxlS.maOQ, "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzf = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzg = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzh = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzi = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 231, 238, 233, 252, 251, 242, 245, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 210, 255, 248, 241, 246, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 228, 237, 234, 183, 176, ModuleDescriptor.MODULE_VERSION, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 171, 172, 165, 162, 143, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE, Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 122, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE_VALUE, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, 207, 200, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE, 141, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 208, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, 203, 230, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, 250, 253, 244, 243};
    }

    private static String zzX(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            zzeg.zzf("Util", RHIpdOnfgiYkEj.pox.concat(str), e10);
            return null;
        }
    }

    public static String zzi(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strZza = zzgss.zza(str);
        int i10 = 0;
        String str2 = strZza.split("-", 2)[0];
        if (zzd == null) {
            zzd = zzY();
        }
        String str3 = (String) zzd.get(str2);
        if (str3 != null) {
            strZza = str3.concat(String.valueOf(strZza.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !WKirgUEJJ.cEgELJkA.equals(str2)) {
            return strZza;
        }
        while (true) {
            String[] strArr = zzf;
            int length = strArr.length;
            if (i10 >= 18) {
                return strZza;
            }
            if (strZza.startsWith(strArr[i10])) {
                return String.valueOf(strArr[i10 + 1]).concat(String.valueOf(strZza.substring(strArr[i10].length())));
            }
            i10 += 2;
        }
    }
}
