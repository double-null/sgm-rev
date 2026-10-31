package com.facebook.ads.redexgen.core;

import com.facebook.appevents.AppEventsConstants;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1176Qo {
    public static byte[] A02;
    public static String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", AppEventsConstants.EVENT_PARAM_VALUE_YES, "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final C1818gb<AbstractC1168Qg, C1174Qm> A00 = new C1818gb<>();
    public final OS<AbstractC1168Qg> A01 = new OS<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {78, 118, 112, 119, 35, 115, 113, 108, 117, 106, 103, 102, 35, 101, 111, 98, 100, 35, 83, 81, 70, 35, 108, 113, 35, 83, 76, 80, 87};
        if (A03[1].charAt(27) != 'j') {
            throw new RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    static {
        A02();
    }

    private QJ A00(AbstractC1168Qg abstractC1168Qg, int i10) {
        C1174Qm c1174QmA0B;
        QJ info;
        int iA08 = this.A00.A08(abstractC1168Qg);
        if (iA08 >= 0 && (c1174QmA0B = this.A00.A0B(iA08)) != null) {
            int i11 = c1174QmA0B.A00;
            if (A03[2].length() != 2) {
                throw new RuntimeException();
            }
            A03[2] = "6x";
            if ((i11 & i10) != 0) {
                int i12 = c1174QmA0B.A00;
                int index = ~i10;
                c1174QmA0B.A00 = i12 & index;
                if (i10 == 4) {
                    info = c1174QmA0B.A02;
                } else if (i10 == 8) {
                    info = c1174QmA0B.A01;
                } else {
                    throw new IllegalArgumentException(A01(0, 29, 14));
                }
                int index2 = c1174QmA0B.A00;
                if ((index2 & 12) == 0) {
                    this.A00.A0A(iA08);
                    C1174Qm.A02(c1174QmA0B);
                }
                return info;
            }
        }
        return null;
    }

    public final QJ A03(AbstractC1168Qg abstractC1168Qg) {
        return A00(abstractC1168Qg, 8);
    }

    public final QJ A04(AbstractC1168Qg abstractC1168Qg) {
        return A00(abstractC1168Qg, 4);
    }

    public final AbstractC1168Qg A05(long j10) {
        return this.A01.A08(j10);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C1174Qm.A01();
    }

    public final void A08(long j10, AbstractC1168Qg abstractC1168Qg) {
        this.A01.A0B(j10, abstractC1168Qg);
    }

    public final void A09(AbstractC1168Qg abstractC1168Qg) {
        C1174Qm c1174QmA00 = this.A00.get(abstractC1168Qg);
        if (c1174QmA00 == null) {
            c1174QmA00 = C1174Qm.A00();
            this.A00.put(abstractC1168Qg, c1174QmA00);
        }
        c1174QmA00.A00 |= 1;
    }

    public final void A0A(AbstractC1168Qg abstractC1168Qg) {
        C1174Qm c1174Qm = this.A00.get(abstractC1168Qg);
        if (c1174Qm == null) {
            return;
        }
        c1174Qm.A00 &= -2;
    }

    public final void A0B(AbstractC1168Qg abstractC1168Qg) {
        for (int iA06 = this.A01.A06() - 1; iA06 >= 0; iA06--) {
            if (abstractC1168Qg == this.A01.A07(iA06)) {
                this.A01.A0A(iA06);
                break;
            }
        }
        C1174Qm info = this.A00.remove(abstractC1168Qg);
        if (info != null) {
            C1174Qm.A02(info);
        }
    }

    public final void A0C(AbstractC1168Qg abstractC1168Qg) {
        A0A(abstractC1168Qg);
    }

    public final void A0D(AbstractC1168Qg abstractC1168Qg, QJ qj) {
        C1174Qm c1174QmA00 = this.A00.get(abstractC1168Qg);
        if (c1174QmA00 == null) {
            c1174QmA00 = C1174Qm.A00();
            this.A00.put(abstractC1168Qg, c1174QmA00);
        }
        c1174QmA00.A00 |= 2;
        c1174QmA00.A02 = qj;
    }

    public final void A0E(AbstractC1168Qg abstractC1168Qg, QJ qj) {
        C1174Qm c1174QmA00 = this.A00.get(abstractC1168Qg);
        if (c1174QmA00 == null) {
            c1174QmA00 = C1174Qm.A00();
            this.A00.put(abstractC1168Qg, c1174QmA00);
        }
        c1174QmA00.A01 = qj;
        c1174QmA00.A00 |= 8;
    }

    public final void A0F(AbstractC1168Qg abstractC1168Qg, QJ qj) {
        C1174Qm c1174QmA00 = this.A00.get(abstractC1168Qg);
        if (c1174QmA00 == null) {
            c1174QmA00 = C1174Qm.A00();
            this.A00.put(abstractC1168Qg, c1174QmA00);
        }
        c1174QmA00.A02 = qj;
        c1174QmA00.A00 |= 4;
    }

    public final void A0G(InterfaceC1175Qn interfaceC1175Qn) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AbstractC1168Qg abstractC1168QgA09 = this.A00.A09(size);
            C1174Qm c1174QmA0A = this.A00.A0A(size);
            if ((c1174QmA0A.A00 & 3) == 3) {
                interfaceC1175Qn.AJo(abstractC1168QgA09);
            } else {
                int index = c1174QmA0A.A00;
                if ((index & 1) != 0) {
                    if (c1174QmA0A.A02 == null) {
                        interfaceC1175Qn.AJo(abstractC1168QgA09);
                    } else {
                        interfaceC1175Qn.AGR(abstractC1168QgA09, c1174QmA0A.A02, c1174QmA0A.A01);
                    }
                } else if ((c1174QmA0A.A00 & 14) == 14) {
                    interfaceC1175Qn.AGP(abstractC1168QgA09, c1174QmA0A.A02, c1174QmA0A.A01);
                } else if ((c1174QmA0A.A00 & 12) == 12) {
                    interfaceC1175Qn.AGT(abstractC1168QgA09, c1174QmA0A.A02, c1174QmA0A.A01);
                } else {
                    int index2 = c1174QmA0A.A00;
                    if ((index2 & 4) != 0) {
                        interfaceC1175Qn.AGR(abstractC1168QgA09, c1174QmA0A.A02, null);
                    } else {
                        int index3 = c1174QmA0A.A00;
                        if ((index3 & 8) != 0) {
                            QJ qj = c1174QmA0A.A02;
                            if (A03[4].charAt(6) == 'y') {
                                throw new RuntimeException();
                            }
                            A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                            interfaceC1175Qn.AGP(abstractC1168QgA09, qj, c1174QmA0A.A01);
                        } else {
                            continue;
                        }
                    }
                }
            }
            C1174Qm.A02(c1174QmA0A);
        }
    }

    public final boolean A0H(AbstractC1168Qg abstractC1168Qg) {
        C1174Qm record = this.A00.get(abstractC1168Qg);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AbstractC1168Qg abstractC1168Qg) {
        C1174Qm record = this.A00.get(abstractC1168Qg);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
