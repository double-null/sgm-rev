package com.google.android.gms.internal.ads;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzifr {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzifp zzifpVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzc(zzifpVar, sb2, 0);
        return sb2.toString();
    }

    static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zzd(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof zzida) {
                sb2.append(": \"");
                sb2.append(zzigp.zza(((zzida) obj).zzA()));
                sb2.append('\"');
                return;
            }
            if (obj instanceof zziee) {
                sb2.append(" {");
                zzc((zziee) obj, sb2, i10 + 2);
                sb2.append("\n");
                zzd(i10, sb2);
                sb2.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb2.append(": ");
                sb2.append(obj);
                return;
            }
            int i12 = i10 + 2;
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            zzb(sb2, i12, SDKConstants.PARAM_KEY, entry.getKey());
            zzb(sb2, i12, "value", entry.getValue());
            sb2.append("\n");
            zzd(i10, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": \"");
        String strReplace2 = (String) obj;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < strReplace2.length(); i13++) {
            char cCharAt2 = strReplace2.charAt(i13);
            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                strReplace = zzigp.zza(strReplace2.getBytes(StandardCharsets.UTF_8));
                sb2.append(strReplace);
                sb2.append('\"');
            } else {
                if (cCharAt2 == '\"') {
                    z12 = true;
                } else if (cCharAt2 == '\'') {
                    z11 = true;
                } else if (cCharAt2 == '\\') {
                    z10 = true;
                }
            }
        }
        if (z10) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z11 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z12) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb2.append(strReplace);
        sb2.append('\"');
    }

    private static void zzd(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0181  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ee  */
    private static void zzc(zzifp zzifpVar, StringBuilder sb2, int i10) {
        String str;
        int i11;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzifpVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            str = CwEo.weyLbVlcEmK;
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith(str)) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), zziee.zzbB(method2, zzifpVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), zziee.zzbB(method, zzifpVar, new Object[0]));
            } else if (hashSet.contains(str.concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzbB = zziee.zzbB(method4, zzifpVar, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) zziee.zzbB(method5, zzifpVar, new Object[0])).booleanValue();
                    } else if (objZzbB instanceof Boolean) {
                        if (((Boolean) objZzbB).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objZzbB instanceof Integer) {
                        if (((Integer) objZzbB).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objZzbB instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objZzbB).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objZzbB instanceof Double)) {
                        if (objZzbB instanceof String) {
                            zEquals = objZzbB.equals("");
                        } else if (objZzbB instanceof zzida) {
                            zEquals = objZzbB.equals(zzida.zza);
                        } else if (!(objZzbB instanceof zzifp) ? !((objZzbB instanceof Enum) && ((Enum) objZzbB).ordinal() == 0) : objZzbB != ((zzifp) objZzbB).zzbw()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objZzbB).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        zzb(sb2, i10, strSubstring, objZzbB);
                    }
                }
            }
            i11 = 3;
        }
        if (zzifpVar instanceof zziea) {
            Iterator itZzc = ((zziea) zzifpVar).zza.zzc();
            while (itZzc.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZzc.next();
                int i13 = ((zzieb) entry2.getKey()).zza;
                StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 2);
                sb3.append("[");
                sb3.append(i13);
                sb3.append("]");
                zzb(sb2, i10, sb3.toString(), entry2.getValue());
            }
        }
        zzigu zziguVar = ((zziee) zzifpVar).zzt;
        if (zziguVar != null) {
            zziguVar.zzj(sb2, i10);
        }
    }
}
