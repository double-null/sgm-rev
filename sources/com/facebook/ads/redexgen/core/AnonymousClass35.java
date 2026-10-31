package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.35, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass35 {
    public static byte[] A0R;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public HashMap<C2264oH, C2259oC> A0G;
    public HashSet<Integer> A0H;
    public List<String> A0I;
    public List<String> A0J;
    public List<String> A0K;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public List<String> A0L;
    public List<String> A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    static {
        A0P();
    }

    public static String A0H(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0R, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A0R = new byte[]{Utf8.REPLACEMENT_BYTE, 61, 44, 40, 53, 51, 50, 53, 50, 59};
    }

    @Deprecated
    public AnonymousClass35() {
        this.A06 = Integer.MAX_VALUE;
        this.A05 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0Q = true;
        this.A0M = MetaExoPlayerCustomizedCollections.A01();
        this.A0D = 0;
        this.A0L = MetaExoPlayerCustomizedCollections.A01();
        this.A0I = MetaExoPlayerCustomizedCollections.A01();
        this.A0B = 0;
        this.A02 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A0J = MetaExoPlayerCustomizedCollections.A01();
        this.A0K = MetaExoPlayerCustomizedCollections.A01();
        this.A0C = 0;
        this.A00 = 0;
        this.A0P = false;
        this.A0O = false;
        this.A0N = false;
        this.A0G = new HashMap<>();
        this.A0H = new HashSet<>();
    }

    public AnonymousClass35(Context context) {
        this();
        A0n(context);
        A0o(context, true);
    }

    public AnonymousClass35(Bundle bundle) {
        List listA01;
        this.A06 = bundle.getInt(C2257oA.A0e, C2257oA.A0U.A06);
        this.A05 = bundle.getInt(C2257oA.A0d, C2257oA.A0U.A05);
        this.A04 = bundle.getInt(C2257oA.A0c, C2257oA.A0U.A04);
        this.A03 = bundle.getInt(C2257oA.A0b, C2257oA.A0U.A03);
        this.A0A = bundle.getInt(C2257oA.A0i, C2257oA.A0U.A0A);
        this.A09 = bundle.getInt(C2257oA.A0h, C2257oA.A0U.A09);
        this.A08 = bundle.getInt(C2257oA.A0n(), C2257oA.A0U.A08);
        this.A07 = bundle.getInt(C2257oA.A0f, C2257oA.A0U.A07);
        this.A0F = bundle.getInt(C2257oA.A0v, C2257oA.A0U.A0F);
        this.A0E = bundle.getInt(C2257oA.A0t, C2257oA.A0U.A0E);
        this.A0Q = bundle.getBoolean(C2257oA.A0u, C2257oA.A0U.A0Q);
        this.A0M = AbstractC0765Am.A07((String[]) AbstractC1955j1.A00(bundle.getStringArray(C2257oA.A0p), new String[0]));
        this.A0D = bundle.getInt(C2257oA.A0q, C2257oA.A0U.A0D);
        String[] preferredVideoLanguages1 = (String[]) AbstractC1955j1.A00(bundle.getStringArray(C2257oA.A0o), new String[0]);
        this.A0L = A0G(preferredVideoLanguages1);
        String[] preferredVideoLanguages2 = new String[0];
        this.A0I = A0G((String[]) AbstractC1955j1.A00(bundle.getStringArray(C2257oA.A0j), preferredVideoLanguages2));
        this.A0B = bundle.getInt(C2257oA.A0l, C2257oA.A0U.A0B);
        this.A02 = bundle.getInt(C2257oA.A0a, C2257oA.A0U.A02);
        this.A01 = bundle.getInt(C2257oA.A0Z, C2257oA.A0U.A01);
        String[] preferredVideoLanguages3 = new String[0];
        this.A0J = AbstractC0765Am.A07((String[]) AbstractC1955j1.A00(bundle.getStringArray(C2257oA.A0k), preferredVideoLanguages3));
        String[] preferredVideoLanguages4 = new String[0];
        this.A0K = A0G((String[]) AbstractC1955j1.A00(bundle.getStringArray(C2257oA.A0m), preferredVideoLanguages4));
        this.A0C = bundle.getInt(C2257oA.A0n, C2257oA.A0U.A0C);
        this.A00 = bundle.getInt(C2257oA.A0e(), C2257oA.A0U.A00);
        this.A0P = bundle.getBoolean(C2257oA.A0s, C2257oA.A0U.A0P);
        this.A0O = bundle.getBoolean(C2257oA.A0X, C2257oA.A0U.A0O);
        this.A0N = bundle.getBoolean(C2257oA.A0W, C2257oA.A0U.A0N);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C2257oA.A0r);
        if (parcelableArrayList == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = C3S.A01(C2259oC.A02, parcelableArrayList);
        }
        this.A0G = new HashMap<>();
        for (int i10 = 0; i10 < listA01.size(); i10++) {
            C2259oC c2259oC = (C2259oC) listA01.get(i10);
            this.A0G.put(c2259oC.A00, c2259oC);
        }
        int[] iArr = (int[]) AbstractC1955j1.A00(bundle.getIntArray(C2257oA.A0V), new int[0]);
        this.A0H = new HashSet<>();
        for (int i11 : iArr) {
            this.A0H.add(Integer.valueOf(i11));
        }
    }

    public AnonymousClass35(C2257oA c2257oA) {
        A0R(c2257oA);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1h != com.google.common.collect.ImmutableList$Builder<java.lang.String> */
    public static AbstractC0765Am<String> A0G(String[] strArr) {
        C05411h c05411hA01 = AbstractC0765Am.A01();
        for (String str : (String[]) C3M.A01(strArr)) {
            c05411hA01.A04(AbstractC06104a.A0k((String) C3M.A01(str)));
        }
        return c05411hA01.A05();
    }

    private void A0Q(Context context) {
        CaptioningManager captioningManager;
        if ((AbstractC06104a.A02 < 23 && Looper.myLooper() == null) || (captioningManager = (CaptioningManager) context.getSystemService(A0H(0, 10, 126))) == null || !captioningManager.isEnabled()) {
            return;
        }
        this.A0C = 1088;
        Locale locale = captioningManager.getLocale();
        if (locale != null) {
            this.A0K = AbstractC0765Am.A04(AbstractC06104a.A0o(locale));
        }
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredAudioLanguages", "preferredAudioMimeTypes", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    private void A0R(C2257oA c2257oA) {
        this.A06 = c2257oA.A06;
        this.A05 = c2257oA.A05;
        this.A04 = c2257oA.A04;
        this.A03 = c2257oA.A03;
        this.A0A = c2257oA.A0A;
        this.A09 = c2257oA.A09;
        this.A08 = c2257oA.A08;
        this.A07 = c2257oA.A07;
        this.A0F = c2257oA.A0F;
        this.A0E = c2257oA.A0E;
        this.A0Q = c2257oA.A0Q;
        this.A0M = c2257oA.A0M;
        this.A0D = c2257oA.A0D;
        this.A0L = c2257oA.A0L;
        this.A0I = c2257oA.A0I;
        this.A0B = c2257oA.A0B;
        this.A02 = c2257oA.A02;
        this.A01 = c2257oA.A01;
        this.A0J = c2257oA.A0J;
        this.A0K = c2257oA.A0K;
        this.A0C = c2257oA.A0C;
        this.A00 = c2257oA.A00;
        this.A0P = c2257oA.A0P;
        this.A0O = c2257oA.A0O;
        this.A0N = c2257oA.A0N;
        this.A0H = new HashSet<>(c2257oA.A0H);
        this.A0G = new HashMap<>(c2257oA.A0G);
    }

    public AnonymousClass35 A0W(C2257oA c2257oA) {
        A0R(c2257oA);
        return this;
    }

    public AnonymousClass35 A0m(int i10, int i11, boolean z10) {
        this.A0F = i10;
        this.A0E = i11;
        this.A0Q = z10;
        return this;
    }

    public AnonymousClass35 A0n(Context context) {
        if (AbstractC06104a.A02 >= 19) {
            A0Q(context);
        }
        return this;
    }

    public AnonymousClass35 A0o(Context context, boolean z10) {
        Point viewportSize = AbstractC06104a.A0W(context);
        return A0m(viewportSize.x, viewportSize.y, z10);
    }

    public C2257oA A0p() {
        return new C2257oA(this);
    }
}
