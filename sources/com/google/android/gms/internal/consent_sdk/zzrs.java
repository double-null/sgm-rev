package com.google.android.gms.internal.consent_sdk;

import be.LNO.fzLzfW;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.bidmachine.analytics.internal.s.bOI.CwEo;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzrs {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void zzc(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fb  */
    private static void zzd(zzrq zzrqVar, StringBuilder sb2, int i10) {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzrqVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
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
                zzb(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), zzqm.zzv(method2, zzrqVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), zzqm.zzv(method, zzrqVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzv = zzqm.zzv(method4, zzrqVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzv instanceof Boolean) {
                            if (((Boolean) objZzv).booleanValue()) {
                                zzb(sb2, i10, strSubstring, objZzv);
                            }
                        } else if (objZzv instanceof Integer) {
                            if (((Integer) objZzv).intValue() != 0) {
                                zzb(sb2, i10, strSubstring, objZzv);
                            }
                        } else if (objZzv instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzv).floatValue()) != 0) {
                                zzb(sb2, i10, strSubstring, objZzv);
                            }
                        } else if (!(objZzv instanceof Double)) {
                            if (objZzv instanceof String) {
                                zEquals = objZzv.equals("");
                            } else if (objZzv instanceof zzpm) {
                                zEquals = objZzv.equals(zzpm.zzb);
                            } else if (objZzv instanceof zzrq) {
                                if (objZzv != ((zzrq) objZzv).zzl()) {
                                    zzb(sb2, i10, strSubstring, objZzv);
                                }
                            } else if (!(objZzv instanceof Enum) || ((Enum) objZzv).ordinal() != 0) {
                                zzb(sb2, i10, strSubstring, objZzv);
                            }
                            if (!zEquals) {
                                zzb(sb2, i10, strSubstring, objZzv);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzv).doubleValue()) != 0) {
                            zzb(sb2, i10, strSubstring, objZzv);
                        }
                    } else if (((Boolean) zzqm.zzv(method5, zzrqVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i10, strSubstring, objZzv);
                    }
                }
            }
            i11 = 3;
        }
        if (zzrqVar instanceof zzqk) {
            Iterator itZzf = ((zzqk) zzrqVar).zzb.zzf();
            if (itZzf.hasNext()) {
                throw null;
            }
        }
        zzsq zzsqVar = ((zzqm) zzrqVar).zzc;
        if (zzsqVar != null) {
            zzsqVar.zzg(sb2, i10);
        }
    }

    static String zza(zzrq zzrqVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fzLzfW.QHJFldLtP);
        sb2.append(str);
        zzd(zzrqVar, sb2, 0);
        return sb2.toString();
    }

    static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
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
        zzc(i10, sb2);
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
        if (obj instanceof String) {
            sb2.append(": \"");
            zzpm zzpmVar = zzpm.zzb;
            sb2.append(zzsk.zza(new zzpk(((String) obj).getBytes(zzqs.zza))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzpm) {
            sb2.append(": \"");
            sb2.append(zzsk.zza((zzpm) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzqm) {
            sb2.append(" {");
            zzd((zzqm) obj, sb2, i10 + 2);
            sb2.append("\n");
            zzc(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(CwEo.AolYpLhPuwJTnkd);
            sb2.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb2, i12, SDKConstants.PARAM_KEY, entry.getKey());
        zzb(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        zzc(i10, sb2);
        sb2.append("}");
    }
}
