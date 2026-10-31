package com.google.protobuf;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.bidmachine.analytics.internal.n.QQJ.WKirgUEJJ;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: MessageLiteToString.java */
/* JADX INFO: loaded from: classes4.dex */
final class u0 {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER;
    private static final String LIST_SUFFIX = "List";
    private static final String MAP_SUFFIX = "Map";

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        Arrays.fill(cArr, ' ');
    }

    private u0() {
    }

    private static void indent(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            char[] cArr = INDENT_BUFFER;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb2.append(cArr, 0, length);
            i10 -= length;
        }
    }

    private static boolean isDefaultValue(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof i) {
            return obj.equals(i.EMPTY);
        }
        if (obj instanceof s0) {
            return obj == ((s0) obj).getDefaultInstanceForType();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    private static String pascalCaseToSnakeCase(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Character.toLowerCase(str.charAt(0)));
        for (int i10 = 1; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    static void printField(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                printField(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                printField(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        indent(i10, sb2);
        sb2.append(pascalCaseToSnakeCase(str));
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(q1.escapeText((String) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof i) {
            sb2.append(": \"");
            sb2.append(q1.escapeBytes((i) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof y) {
            sb2.append(" {");
            reflectivePrintWithIndent((y) obj, sb2, i10 + 2);
            sb2.append("\n");
            indent(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i10 + 2;
        printField(sb2, i11, SDKConstants.PARAM_KEY, entry.getKey());
        printField(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        indent(i10, sb2);
        sb2.append("}");
    }

    static String toString(s0 s0Var, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        reflectivePrintWithIndent(s0Var, sb2, 0);
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0173  */
    /* JADX WARN: Code duplicated, block: B:64:0x0190  */
    /* JADX WARN: Code duplicated, block: B:66:0x0198  */
    /* JADX WARN: Code duplicated, block: B:68:0x019e  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b0  */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0173, please report this as an issue */
    private static void reflectivePrintWithIndent(s0 s0Var, StringBuilder sb2, int i10) {
        String str;
        int i11;
        int i12;
        Method method;
        Method method2;
        Object objInvokeOrDie;
        boolean zBooleanValue;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = s0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            str = WKirgUEJJ.EIWbnxplK;
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method5 = declaredMethods[i13];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith(str)) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (!strSubstring.endsWith(LIST_SUFFIX) || strSubstring.endsWith(BUILDER_LIST_SUFFIX) || strSubstring.equals(LIST_SUFFIX) || (method4 = (Method) entry.getValue()) == null || !method4.getReturnType().equals(List.class)) {
                if (!strSubstring.endsWith(MAP_SUFFIX) || strSubstring.equals(MAP_SUFFIX) || (method3 = (Method) entry.getValue()) == null || !method3.getReturnType().equals(Map.class) || method3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method3.getModifiers())) {
                    i12 = 3;
                    if (hashSet.contains("set" + strSubstring)) {
                        if (strSubstring.endsWith(BYTES_SUFFIX)) {
                            if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                                method = (Method) entry.getValue();
                                method2 = (Method) map.get(str + strSubstring);
                                if (method != null) {
                                    objInvokeOrDie = y.invokeOrDie(method, s0Var, new Object[0]);
                                    if (method2 == null) {
                                        zBooleanValue = ((Boolean) y.invokeOrDie(method2, s0Var, new Object[0])).booleanValue();
                                    } else if (isDefaultValue(objInvokeOrDie)) {
                                        zBooleanValue = false;
                                    } else {
                                        zBooleanValue = true;
                                    }
                                    if (zBooleanValue) {
                                        printField(sb2, i10, strSubstring, objInvokeOrDie);
                                    }
                                }
                            }
                        } else {
                            method = (Method) entry.getValue();
                            method2 = (Method) map.get(str + strSubstring);
                            if (method != null) {
                                objInvokeOrDie = y.invokeOrDie(method, s0Var, new Object[0]);
                                if (method2 == null) {
                                    zBooleanValue = ((Boolean) y.invokeOrDie(method2, s0Var, new Object[0])).booleanValue();
                                } else if (isDefaultValue(objInvokeOrDie)) {
                                    zBooleanValue = true;
                                } else {
                                    zBooleanValue = false;
                                }
                                if (zBooleanValue) {
                                    printField(sb2, i10, strSubstring, objInvokeOrDie);
                                }
                            }
                        }
                    }
                } else {
                    i12 = 3;
                    printField(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), y.invokeOrDie(method3, s0Var, new Object[0]));
                }
                i11 = i12;
            } else {
                printField(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), y.invokeOrDie(method4, s0Var, new Object[0]));
                i11 = 3;
            }
        }
        if (s0Var instanceof y.d) {
            Iterator<Map.Entry<T, Object>> it = ((y.d) s0Var).extensions.iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                printField(sb2, i10, "[" + ((y.f) entry2.getKey()).getNumber() + "]", entry2.getValue());
            }
        }
        s1 s1Var = ((y) s0Var).unknownFields;
        if (s1Var != null) {
            s1Var.printWithIndent(sb2, i10);
        }
    }
}
