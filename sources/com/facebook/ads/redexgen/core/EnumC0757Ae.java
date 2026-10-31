package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A02' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class EnumC0757Ae implements InterfaceC1943ip<Map.Entry<?, ?>, Object> {
    public static byte[] A00;
    public static final /* synthetic */ EnumC0757Ae[] A01;
    public static final EnumC0757Ae A02;
    public static final EnumC0757Ae A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-61, -67, -47, 4, -17, -6, 3, -13};
    }

    static {
        A02();
        final String strA01 = A01(0, 3, 56);
        final int i10 = 0;
        A02 = new EnumC0757Ae(strA01, i10) { // from class: com.facebook.ads.redexgen.X.1e
            {
                C0759Ag c0759Ag = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.InterfaceC1943ip
            @CheckForNull
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final Object A43(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        };
        final String strA02 = A01(3, 5, 110);
        final int i11 = 1;
        A03 = new EnumC0757Ae(strA02, i11) { // from class: com.facebook.ads.redexgen.X.1d
            {
                C0759Ag c0759Ag = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.InterfaceC1943ip
            @CheckForNull
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final Object A43(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
        A01 = A03();
    }

    public EnumC0757Ae(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    public /* synthetic */ EnumC0757Ae(String str, int i10, C0759Ag c0759Ag) {
        this(str, i10);
    }

    public static /* synthetic */ EnumC0757Ae[] A03() {
        return new EnumC0757Ae[]{A02, A03};
    }

    public static EnumC0757Ae valueOf(String name) {
        return (EnumC0757Ae) Enum.valueOf(EnumC0757Ae.class, name);
    }

    public static EnumC0757Ae[] values() {
        return (EnumC0757Ae[]) A01.clone();
    }
}
