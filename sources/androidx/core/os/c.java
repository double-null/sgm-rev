package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.jvm.internal.t;
import wc.q;

/* JADX INFO: compiled from: Bundle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final Bundle a(q<String, ? extends Object>... qVarArr) {
        Bundle bundle = new Bundle(qVarArr.length);
        for (q<String, ? extends Object> qVar : qVarArr) {
            String strB = qVar.b();
            Object objC = qVar.c();
            if (objC == null) {
                bundle.putString(strB, null);
            } else if (objC instanceof Boolean) {
                bundle.putBoolean(strB, ((Boolean) objC).booleanValue());
            } else if (objC instanceof Byte) {
                bundle.putByte(strB, ((Number) objC).byteValue());
            } else if (objC instanceof Character) {
                bundle.putChar(strB, ((Character) objC).charValue());
            } else if (objC instanceof Double) {
                bundle.putDouble(strB, ((Number) objC).doubleValue());
            } else if (objC instanceof Float) {
                bundle.putFloat(strB, ((Number) objC).floatValue());
            } else if (objC instanceof Integer) {
                bundle.putInt(strB, ((Number) objC).intValue());
            } else if (objC instanceof Long) {
                bundle.putLong(strB, ((Number) objC).longValue());
            } else if (objC instanceof Short) {
                bundle.putShort(strB, ((Number) objC).shortValue());
            } else if (objC instanceof Bundle) {
                bundle.putBundle(strB, (Bundle) objC);
            } else if (objC instanceof CharSequence) {
                bundle.putCharSequence(strB, (CharSequence) objC);
            } else if (objC instanceof Parcelable) {
                bundle.putParcelable(strB, (Parcelable) objC);
            } else if (objC instanceof boolean[]) {
                bundle.putBooleanArray(strB, (boolean[]) objC);
            } else if (objC instanceof byte[]) {
                bundle.putByteArray(strB, (byte[]) objC);
            } else if (objC instanceof char[]) {
                bundle.putCharArray(strB, (char[]) objC);
            } else if (objC instanceof double[]) {
                bundle.putDoubleArray(strB, (double[]) objC);
            } else if (objC instanceof float[]) {
                bundle.putFloatArray(strB, (float[]) objC);
            } else if (objC instanceof int[]) {
                bundle.putIntArray(strB, (int[]) objC);
            } else if (objC instanceof long[]) {
                bundle.putLongArray(strB, (long[]) objC);
            } else if (objC instanceof short[]) {
                bundle.putShortArray(strB, (short[]) objC);
            } else if (objC instanceof Object[]) {
                Class<?> componentType = objC.getClass().getComponentType();
                t.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    t.d(objC, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(strB, (Parcelable[]) objC);
                } else if (String.class.isAssignableFrom(componentType)) {
                    t.d(objC, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(strB, (String[]) objC);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    t.d(objC, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(strB, (CharSequence[]) objC);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + strB + '\"');
                    }
                    bundle.putSerializable(strB, (Serializable) objC);
                }
            } else if (objC instanceof Serializable) {
                bundle.putSerializable(strB, (Serializable) objC);
            } else if (objC instanceof IBinder) {
                bundle.putBinder(strB, (IBinder) objC);
            } else if (objC instanceof Size) {
                b.a(bundle, strB, (Size) objC);
            } else {
                if (!(objC instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objC.getClass().getCanonicalName() + " for key \"" + strB + '\"');
                }
                b.b(bundle, strB, (SizeF) objC);
            }
        }
        return bundle;
    }
}
