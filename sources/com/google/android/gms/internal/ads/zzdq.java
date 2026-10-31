package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdq {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static zzgwm zza(byte b10, byte b11, byte b12, byte b13) {
        return zzgwm.zzj(new byte[]{1, 1, b10, 2, 1, b11, 3, 1, b12, 4, 1, b13});
    }

    public static String zzb(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String zzc(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = new Object[5];
        objArr[0] = zzc[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        objArr[3] = Character.valueOf(true != z10 ? 'L' : 'H');
        objArr[4] = Integer.valueOf(i13);
        String str = zzfl.zza;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i14 = 6;
        while (i14 > 0) {
            int i15 = i14 - 1;
            if (iArr[i15] != 0) {
                break;
            }
            i14 = i15;
        }
        for (int i16 = 0; i16 < i14; i16++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i16])));
        }
        return sb2.toString();
    }

    public static String zzd(byte[] bArr) {
        int length = bArr.length;
        zzgtj.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b10 = bArr[0];
        zzgtj.zzd(b10 == 1, "Invalid APV CSD version: %s", b10);
        Object[] objArr = {Integer.valueOf(bArr[5]), Integer.valueOf(bArr[6]), Integer.valueOf(bArr[7])};
        String str = zzfl.zza;
        return String.format(Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    public static Pair zze(zzv zzvVar) {
        zzdp zzdpVarZzf = zzf(zzvVar);
        if (zzdpVarZzf == null || !zzdpVarZzf.zzc()) {
            return null;
        }
        return new Pair(Integer.valueOf(zzdpVarZzf.zza()), Integer.valueOf(zzdpVarZzf.zzb()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0187  */
    public static zzdp zzg(String str, String[] strArr, zzi zziVar) {
        int i10;
        Integer numValueOf = null;
        if (strArr.length < 4) {
            zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            zzeg.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String strGroup = matcher.group(1);
        if (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(strGroup)) {
            i10 = 1;
        } else {
            if (!"2".equals(strGroup)) {
                zzeg.zzc("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(strGroup)));
                return zzdp.zza;
            }
            i10 = (zziVar == null || zziVar.zzd != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        switch (str2) {
            case "L30":
                numValueOf = 1;
                break;
            case "L60":
                numValueOf = 4;
                break;
            case "L63":
                numValueOf = 16;
                break;
            case "L90":
                numValueOf = 64;
                break;
            case "L93":
                numValueOf = Integer.valueOf(UserVerificationMethods.USER_VERIFY_HANDPRINT);
                break;
            case "L120":
                numValueOf = 1024;
                break;
            case "L123":
                numValueOf = 4096;
                break;
            case "L150":
                numValueOf = Integer.valueOf(Http2.INITIAL_MAX_FRAME_SIZE);
                break;
            case "L153":
                numValueOf = Integer.valueOf(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
                break;
            case "L156":
                numValueOf = 262144;
                break;
            case "L180":
                numValueOf = 1048576;
                break;
            case "L183":
                numValueOf = 4194304;
                break;
            case "L186":
                numValueOf = Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
                break;
            case "H30":
                numValueOf = 2;
                break;
            case "H60":
                numValueOf = 8;
                break;
            case "H63":
                numValueOf = 32;
                break;
            case "H90":
                numValueOf = 128;
                break;
            case "H93":
                numValueOf = 512;
                break;
            case "H120":
                numValueOf = 2048;
                break;
            case "H123":
                numValueOf = 8192;
                break;
            case "H150":
                numValueOf = 32768;
                break;
            case "H153":
                numValueOf = 131072;
                break;
            case "H156":
                numValueOf = 524288;
                break;
            case "H180":
                numValueOf = 2097152;
                break;
            case "H183":
                numValueOf = 8388608;
                break;
            case "H186":
                numValueOf = 33554432;
                break;
        }
        if (numValueOf != null) {
            return new zzdp(i10, numValueOf.intValue());
        }
        zzeg.zzc("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(str2));
        return zzdp.zza;
    }

    public static byte[] zzh(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }

    private static int zzi(int i10, int i11) {
        switch (i10) {
            case 30:
                if (i11 == 0) {
                    return 257;
                }
                if (i11 == 1) {
                    return 258;
                }
                if (i11 == 2) {
                    return 260;
                }
                if (i11 == 3) {
                    return 264;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb2.append("Unrecognized APV band: ");
                sb2.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb2.toString());
                return -1;
            case 33:
                if (i11 == 0) {
                    return EventTypeExtended.EVENT_TYPE_EXTENDED_TOKEN_GENERATED_VALUE;
                }
                if (i11 == 1) {
                    return EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE;
                }
                if (i11 == 2) {
                    return 516;
                }
                if (i11 == 3) {
                    return 520;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb3.append("Unrecognized APV band: ");
                sb3.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb3.toString());
                return -1;
            case 60:
                if (i11 == 0) {
                    return 1025;
                }
                if (i11 == 1) {
                    return 1026;
                }
                if (i11 == 2) {
                    return 1028;
                }
                if (i11 == 3) {
                    return 1032;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb4.append("Unrecognized APV band: ");
                sb4.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb4.toString());
                return -1;
            case 63:
                if (i11 == 0) {
                    return 2049;
                }
                if (i11 == 1) {
                    return 2050;
                }
                if (i11 == 2) {
                    return 2052;
                }
                if (i11 == 3) {
                    return 2056;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb5.append("Unrecognized APV band: ");
                sb5.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb5.toString());
                return -1;
            case 90:
                if (i11 == 0) {
                    return 4097;
                }
                if (i11 == 1) {
                    return 4098;
                }
                if (i11 == 2) {
                    return 4100;
                }
                if (i11 == 3) {
                    return 4104;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb6.append("Unrecognized APV band: ");
                sb6.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb6.toString());
                return -1;
            case 93:
                if (i11 == 0) {
                    return 8193;
                }
                if (i11 == 1) {
                    return 8194;
                }
                if (i11 == 2) {
                    return 8196;
                }
                if (i11 == 3) {
                    return 8200;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb7.append("Unrecognized APV band: ");
                sb7.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb7.toString());
                return -1;
            case 120:
                if (i11 == 0) {
                    return 16385;
                }
                if (i11 == 1) {
                    return 16386;
                }
                if (i11 == 2) {
                    return 16388;
                }
                if (i11 == 3) {
                    return 16392;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb8.append("Unrecognized APV band: ");
                sb8.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb8.toString());
                return -1;
            case 123:
                if (i11 == 0) {
                    return 32769;
                }
                if (i11 == 1) {
                    return 32770;
                }
                if (i11 == 2) {
                    return 32772;
                }
                if (i11 == 3) {
                    return 32776;
                }
                StringBuilder sb9 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb9.append("Unrecognized APV band: ");
                sb9.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb9.toString());
                return -1;
            case 150:
                if (i11 == 0) {
                    return NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REPLY;
                }
                if (i11 == 1) {
                    return NativeProtocol.MESSAGE_GET_PROTOCOL_VERSIONS_REQUEST;
                }
                if (i11 == 2) {
                    return NativeProtocol.MESSAGE_GET_INSTALL_DATA_REQUEST;
                }
                if (i11 == 3) {
                    return NativeProtocol.MESSAGE_GET_AK_SEAMLESS_TOKEN_REQUEST;
                }
                StringBuilder sb10 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb10.append("Unrecognized APV band: ");
                sb10.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb10.toString());
                return -1;
            case 153:
                if (i11 == 0) {
                    return 131073;
                }
                if (i11 == 1) {
                    return 131074;
                }
                if (i11 == 2) {
                    return 131076;
                }
                if (i11 == 3) {
                    return 131080;
                }
                StringBuilder sb11 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb11.append("Unrecognized APV band: ");
                sb11.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb11.toString());
                return -1;
            case 180:
                if (i11 == 0) {
                    return 262145;
                }
                if (i11 == 1) {
                    return 262146;
                }
                if (i11 == 2) {
                    return 262148;
                }
                if (i11 == 3) {
                    return 262152;
                }
                StringBuilder sb12 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb12.append("Unrecognized APV band: ");
                sb12.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb12.toString());
                return -1;
            case 183:
                if (i11 == 0) {
                    return 524289;
                }
                if (i11 == 1) {
                    return 524290;
                }
                if (i11 == 2) {
                    return 524292;
                }
                if (i11 == 3) {
                    return 524296;
                }
                StringBuilder sb13 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb13.append("Unrecognized APV band: ");
                sb13.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb13.toString());
                return -1;
            case 210:
                if (i11 == 0) {
                    return 1048577;
                }
                if (i11 == 1) {
                    return 1048578;
                }
                if (i11 == 2) {
                    return 1048580;
                }
                if (i11 == 3) {
                    return 1048584;
                }
                StringBuilder sb14 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb14.append("Unrecognized APV band: ");
                sb14.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb14.toString());
                return -1;
            case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                if (i11 == 0) {
                    return 2097153;
                }
                if (i11 == 1) {
                    return 2097154;
                }
                if (i11 == 2) {
                    return 2097156;
                }
                if (i11 == 3) {
                    return 2097160;
                }
                StringBuilder sb15 = new StringBuilder(String.valueOf(i11).length() + 23);
                sb15.append("Unrecognized APV band: ");
                sb15.append(i11);
                zzeg.zzc("CodecSpecificDataUtil", sb15.toString());
                return -1;
            default:
                StringBuilder sb16 = new StringBuilder(String.valueOf(i10).length() + 30);
                sb16.append("Unrecognized APV level index: ");
                sb16.append(i10);
                zzeg.zzc("CodecSpecificDataUtil", sb16.toString());
                return -1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:211:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:55:0x0114  */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015b, code lost:
    
        if (r0.equals("09") != true) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0169, code lost:
    
        if (r0.equals("08") != true) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0176, code lost:
    
        if (r0.equals("07") != true) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        if (r0.equals("06") != true) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0190, code lost:
    
        if (r0.equals("05") != true) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019d, code lost:
    
        if (r0.equals("04") != true) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01aa, code lost:
    
        if (r0.equals("03") != true) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b7, code lost:
    
        if (r0.equals("02") != true) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c4, code lost:
    
        if (r0.equals("01") != true) goto L55;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v200 int, still in use, count: 1, list:
      (r1v200 int) from 0x005d: IF  (r1v200 int) != (1567 int)  -> B:15:0x005f A[HIDDEN] (LINE:95)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v200 int, still in use, count: 1, list:
      (r1v200 int) from 0x005d: IF  (r1v200 int) != (1567 int)  -> B:15:0x005f A[HIDDEN] (LINE:95)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzdp zzf(com.google.android.gms.internal.ads.zzv r22) {
        /*
            Method dump skipped, instruction units count: 3436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdq.zzf(com.google.android.gms.internal.ads.zzv):com.google.android.gms.internal.ads.zzdp");
    }
}
