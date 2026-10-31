package k6;

import com.explorestack.protobuf.w1;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.protobuf.rendering.RenderingFeature;
import io.bidmachine.protobuf.rendering.WatermarkAlgorithm;
import io.bidmachine.protobuf.rendering.WatermarkConfiguration;
import io.bidmachine.protobuf.rendering.WatermarkLocation;
import io.bidmachine.protobuf.rendering.WatermarkPayloadType;
import io.bidmachine.protobuf.sdk.ViewabilityConfiguration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pb.b1;
import pb.c1;
import pb.d1;
import pb.f1;
import pb.g1;
import pb.h1;
import pb.i1;
import pb.k1;
import pb.l1;
import pb.m0;
import pb.m1;
import pb.n0;
import pb.o0;
import pb.p0;
import pb.q0;
import pb.s0;
import pb.t0;
import pb.u0;
import pb.w0;
import pb.y0;
import pb.z0;
import s.sBoZ.TwDPD;

/* JADX INFO: compiled from: AdaptiveRenderingParams.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends vb.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pb.c f21234b;

    /* JADX INFO: compiled from: AdaptiveRenderingParams.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.values().length];
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Rendering.Phase.ViewComponent.Layout.Constraint.Anchor.ANCHOR_CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WatermarkAlgorithm.values().length];
            try {
                iArr2[WatermarkAlgorithm.WM_ALGO_RGB_STRIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[WatermarkPayloadType.values().length];
            try {
                iArr3[WatermarkPayloadType.WM_PAYLOAD_BID_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[WatermarkLocation.values().length];
            try {
                iArr4[WatermarkLocation.WM_LOCATION_TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[WatermarkLocation.WM_LOCATION_TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[WatermarkLocation.WM_LOCATION_TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[WatermarkLocation.WM_LOCATION_BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[WatermarkLocation.WM_LOCATION_BOTTOM_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[WatermarkLocation.WM_LOCATION_BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[Rendering.Phase.ViewComponent.ScriptConfig.InjectTiming.values().length];
            try {
                iArr5[Rendering.Phase.ViewComponent.ScriptConfig.InjectTiming.INJECT_TIMING_AT_DOCUMENT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[Rendering.Phase.ViewComponent.ScriptConfig.InjectTiming.INJECT_TIMING_AT_DOCUMENT_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return yc.b.a(Integer.valueOf(((Rendering.Phase) t10).getSequence()), Integer.valueOf(((Rendering.Phase) t11).getSequence()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(vb.k unifiedMediationParams) {
        pb.c cVarW;
        super(unifiedMediationParams);
        kotlin.jvm.internal.t.f(unifiedMediationParams, "unifiedMediationParams");
        Object objM = unifiedMediationParams.m("rendering_configuration");
        if (!(objM instanceof Rendering) || objM == Rendering.getDefaultInstance()) {
            cVarW = null;
        } else {
            Rendering rendering = (Rendering) objM;
            cVarW = w(rendering, nc.a.f22962d.c(), g0(unifiedMediationParams, rendering.getWatermarkConfiguration()));
        }
        this.f21234b = cVarW;
    }

    private final pb.k B(Rendering.Background background) {
        pb.l o0Var = null;
        if (background == null || background == Rendering.Background.getDefaultInstance()) {
            return null;
        }
        if (background.hasColor()) {
            pb.w wVarI = I(background.getColor());
            if (wVarI != null) {
                o0Var = new pb.x(wVarI);
            } else {
                io.bidmachine.core.a.g(new qc.b() { // from class: k6.x
                    @Override // qc.b
                    public final Object get() {
                        return b0.C();
                    }
                });
            }
        } else if (background.hasImage()) {
            n0 n0VarW = W(background.getImage());
            if (n0VarW != null) {
                o0Var = new o0(n0VarW);
            } else {
                io.bidmachine.core.a.g(new qc.b() { // from class: k6.y
                    @Override // qc.b
                    public final Object get() {
                        return b0.D();
                    }
                });
            }
        } else {
            io.bidmachine.core.a.g(new qc.b() { // from class: k6.z
                @Override // qc.b
                public final Object get() {
                    return b0.E();
                }
            });
        }
        return new pb.k((float) background.getOpacity(), o0Var, Y(background.getPlaceholder()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String C() {
        return "BackgroundSource don't found. Can't create Color";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String E() {
        return "BackgroundSource don't found. Set one of: color, gradient";
    }

    private final pb.s F(List<RenderingFeature> list) {
        Object next;
        RenderingFeature.BrokenCreativeDetector brokenCreativeDetector;
        RenderingFeature renderingFeature;
        if (list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            renderingFeature = (RenderingFeature) next;
        } while (!(renderingFeature.hasBrokenCreativeDetector() && renderingFeature.getBrokenCreativeDetector().hasConfiguration()));
        RenderingFeature renderingFeature2 = (RenderingFeature) next;
        RenderingFeature.BrokenCreativeDetector.Configuration configuration = (renderingFeature2 == null || (brokenCreativeDetector = renderingFeature2.getBrokenCreativeDetector()) == null) ? null : brokenCreativeDetector.getConfiguration();
        if (configuration == null) {
            return null;
        }
        List<RenderingFeature.BrokenCreativeDetector.Algorithm> algorithmsList = configuration.getAlgorithmsList();
        kotlin.jvm.internal.t.e(algorithmsList, "brokenCreativeDetectorConfiguration.algorithmsList");
        ArrayList arrayList = new ArrayList();
        for (RenderingFeature.BrokenCreativeDetector.Algorithm algorithm : algorithmsList) {
            pb.r rVarA = pb.r.f24196b.a(algorithm.getName());
            pb.p pVar = rVarA == null ? null : new pb.p(rVarA, (float) algorithm.getThreshold(), (float) algorithm.getWeight());
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        if (arrayList.isEmpty()) {
            io.bidmachine.core.a.g(new qc.b() { // from class: k6.r
                @Override // qc.b
                public final Object get() {
                    return b0.G();
                }
            });
            return null;
        }
        if (arrayList.size() != algorithmsList.size()) {
            io.bidmachine.core.a.g(new qc.b() { // from class: k6.t
                @Override // qc.b
                public final Object get() {
                    return b0.H();
                }
            });
        }
        long timeout = (long) configuration.getTimeout();
        double downscaleFactor = configuration.getDownscaleFactor();
        boolean errorOnly = configuration.getErrorOnly();
        boolean allowDuplicate = configuration.getAllowDuplicate();
        i1 i1VarA = i1.f24112b.a(configuration.getStopAfter());
        if (i1VarA == null) {
            i1VarA = i1.AnyCreative;
        }
        return new pb.s(timeout, downscaleFactor, errorOnly, allowDuplicate, i1VarA, configuration.getWeightThreshold(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String G() {
        return "BrokenCreativeDetector algorithms is empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String H() {
        return "Not all BrokenCreativeDetector algorithms were applied, check if the algorithms are specified correctly";
    }

    private final pb.w I(Rendering.Color color) {
        wc.q qVarA;
        if (color == null || color == Rendering.Color.getDefaultInstance()) {
            return null;
        }
        if (color.hasContextColor()) {
            Integer numX = wb.d0.x(color.getContextColor());
            if (numX == null) {
                io.bidmachine.core.a.g(new qc.b() { // from class: k6.j
                    @Override // qc.b
                    public final Object get() {
                        return b0.J();
                    }
                });
                return null;
            }
            qVarA = wc.w.a(new u0(numX.intValue()), Boolean.TRUE);
        } else if (color.hasContextGradient()) {
            pb.h0 h0VarR = R(color.getContextGradient());
            if (h0VarR == null) {
                io.bidmachine.core.a.g(new qc.b() { // from class: k6.k
                    @Override // qc.b
                    public final Object get() {
                        return b0.K();
                    }
                });
                return null;
            }
            qVarA = wc.w.a(new pb.i0(h0VarR), Boolean.TRUE);
        } else if (color.hasColor()) {
            Integer numX2 = wb.d0.x(color.getColor());
            if (numX2 == null) {
                io.bidmachine.core.a.g(new qc.b() { // from class: k6.l
                    @Override // qc.b
                    public final Object get() {
                        return b0.L();
                    }
                });
                return null;
            }
            qVarA = wc.w.a(new u0(numX2.intValue()), Boolean.FALSE);
        } else if (color.hasGradient()) {
            pb.h0 h0VarR2 = R(color.getGradient());
            if (h0VarR2 == null) {
                io.bidmachine.core.a.g(new qc.b() { // from class: k6.m
                    @Override // qc.b
                    public final Object get() {
                        return b0.M();
                    }
                });
                return null;
            }
            qVarA = wc.w.a(new pb.i0(h0VarR2), Boolean.FALSE);
        } else {
            io.bidmachine.core.a.g(new qc.b() { // from class: k6.n
                @Override // qc.b
                public final Object get() {
                    return b0.N();
                }
            });
            qVarA = wc.w.a(null, Boolean.FALSE);
        }
        pb.z zVar = (pb.z) qVarA.b();
        boolean zBooleanValue = ((Boolean) qVarA.c()).booleanValue();
        if (zVar == null) {
            return null;
        }
        return new pb.w(zVar, zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String J() {
        return "ColorSource don't found. Can't parse context color";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String K() {
        return "ColorSource don't found. Can't create context gradient";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String L() {
        return "ColorSource don't found. Can't parse color";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String M() {
        return "ColorSource don't found. Can't create Gradient";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String N() {
        return "ColorSource don't found. Set one of: color, gradient, context_color, context_gradient";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String P(Rendering.Phase.ViewComponent.Layout.Constraint.Anchor anchor) {
        return "Unsupported SourceAnchor - " + anchor;
    }

    private final pb.h0 R(Rendering.Color.Gradient gradient) {
        if (gradient == null || gradient == Rendering.Color.Gradient.getDefaultInstance()) {
            return null;
        }
        final String type = gradient.getType();
        kotlin.jvm.internal.t.e(type, "gradient.type");
        pb.k0 k0VarA = pb.k0.f24151b.a(type);
        if (k0VarA == null) {
            io.bidmachine.core.a.g(new qc.b() { // from class: k6.o
                @Override // qc.b
                public final Object get() {
                    return b0.S(type);
                }
            });
            return null;
        }
        final String direction = gradient.getDirection();
        kotlin.jvm.internal.t.e(direction, "gradient.direction");
        pb.j0 j0VarA = pb.j0.f24138b.a(direction);
        if (j0VarA == null) {
            io.bidmachine.core.a.g(new qc.b() { // from class: k6.p
                @Override // qc.b
                public final Object get() {
                    return b0.T(direction);
                }
            });
            return null;
        }
        w1 colorsList = gradient.getColorsList();
        kotlin.jvm.internal.t.e(colorsList, "gradient.colorsList");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = colorsList.iterator();
        while (it.hasNext()) {
            Integer numX = wb.d0.x(it.next());
            if (numX != null) {
                arrayList.add(numX);
            }
        }
        if (arrayList.isEmpty()) {
            io.bidmachine.core.a.g(new qc.b() { // from class: k6.q
                @Override // qc.b
                public final Object get() {
                    return b0.U();
                }
            });
            return null;
        }
        if (arrayList.size() != colorsList.size()) {
            io.bidmachine.core.a.g(new qc.b() { // from class: k6.s
                @Override // qc.b
                public final Object get() {
                    return b0.V();
                }
            });
        }
        return new pb.h0(k0VarA, j0VarA, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String S(String type) {
        kotlin.jvm.internal.t.f(type, "$type");
        return "Incorrect gradient type parameter - " + type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String T(String direction) {
        kotlin.jvm.internal.t.f(direction, "$direction");
        return "Incorrect gradient direction parameter - " + direction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String U() {
        return "Failed to parse all colors. Check if colors are specified correctly.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String V() {
        return "Not all colors were parsed, check if the colors are specified correctly";
    }

    private final n0 W(Rendering.Image image) {
        b1 b1VarC0;
        if (image == null || image == Rendering.Image.getDefaultInstance() || (b1VarC0 = c0(image.getResource())) == null) {
            return null;
        }
        d1 d1VarW = l0.w(image.getScale());
        if (d1VarW == null) {
            d1VarW = d1.None;
        }
        return new n0(d1VarW, b1VarC0);
    }

    private final y0 Y(Rendering.Placeholder placeholder) {
        z0 p0Var;
        if (placeholder == null || placeholder == Rendering.Placeholder.getDefaultInstance()) {
            return null;
        }
        if (placeholder.hasName()) {
            String name = placeholder.getName();
            kotlin.jvm.internal.t.e(name, "placeholder.name");
            p0Var = new t0(name);
        } else if (placeholder.hasColor()) {
            pb.w wVarI = I(placeholder.getColor());
            if (wVarI == null) {
                io.bidmachine.core.a.g(new qc.b() { // from class: k6.a0
                    @Override // qc.b
                    public final Object get() {
                        return b0.Z();
                    }
                });
                return null;
            }
            p0Var = new pb.y(wVarI);
        } else if (placeholder.hasImage()) {
            n0 n0VarW = W(placeholder.getImage());
            if (n0VarW == null) {
                io.bidmachine.core.a.g(new qc.b() { // from class: k6.h
                    @Override // qc.b
                    public final Object get() {
                        return b0.a0();
                    }
                });
                return null;
            }
            p0Var = new p0(n0VarW);
        } else {
            io.bidmachine.core.a.g(new qc.b() { // from class: k6.i
                @Override // qc.b
                public final Object get() {
                    return b0.b0();
                }
            });
            p0Var = null;
        }
        if (p0Var == null) {
            return null;
        }
        return new y0(p0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Z() {
        return "PlaceholderSource don't found. Can't create Color";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a0() {
        return "PlaceholderSource don't found. Can't create Image";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b0() {
        return "PlaceholderSource don't found. Set one of: name, color, gradient";
    }

    private final b1 c0(Rendering.Resource resource) {
        c1 m1Var;
        if (resource == null || resource == Rendering.Resource.getDefaultInstance()) {
            return null;
        }
        if (resource.hasBase64()) {
            String base64 = resource.getBase64();
            kotlin.jvm.internal.t.e(base64, "resource.base64");
            m1Var = new pb.n(base64);
        } else if (resource.hasUrls()) {
            w1 urlsList = resource.getUrls().getUrlsList();
            kotlin.jvm.internal.t.e(urlsList, "resource.urls.urlsList");
            m1Var = new k1(urlsList);
        } else if (resource.hasUrl()) {
            String url = resource.getUrl();
            kotlin.jvm.internal.t.e(url, "resource.url");
            m1Var = new k1(url);
        } else {
            if (resource.hasPayload()) {
                Rendering.Resource.Payload payload = resource.getPayload();
                kotlin.jvm.internal.t.e(payload, "resource.payload");
                if (payload.hasHtml()) {
                    String html = payload.getHtml();
                    kotlin.jvm.internal.t.e(html, "payload.html");
                    m1Var = new m0(html);
                } else if (payload.hasXml()) {
                    String xml = payload.getXml();
                    kotlin.jvm.internal.t.e(xml, "payload.xml");
                    m1Var = new m1(xml);
                } else {
                    io.bidmachine.core.a.g(new qc.b() { // from class: k6.u
                        @Override // qc.b
                        public final Object get() {
                            return b0.d0();
                        }
                    });
                }
            } else {
                io.bidmachine.core.a.g(new qc.b() { // from class: k6.v
                    @Override // qc.b
                    public final Object get() {
                        return b0.e0();
                    }
                });
            }
            m1Var = null;
        }
        if (m1Var == null) {
            return null;
        }
        return new b1(m1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d0() {
        return "ResourceSource don't found. Set one of: html, xml";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e0() {
        return "ResourceSource don't found. Set one of: base64, url, payload";
    }

    private final l1 g0(vb.k kVar, WatermarkConfiguration watermarkConfiguration) {
        l1.b bVar;
        if (watermarkConfiguration == null) {
            return null;
        }
        WatermarkAlgorithm algorithm = watermarkConfiguration.getAlgorithm();
        if ((algorithm == null ? -1 : a.$EnumSwitchMapping$1[algorithm.ordinal()]) != 1) {
            return null;
        }
        l1.a aVar = l1.a.RGB_STRIP;
        WatermarkPayloadType payloadType = watermarkConfiguration.getPayloadType();
        String strI = (payloadType == null ? -1 : a.$EnumSwitchMapping$2[payloadType.ordinal()]) == 1 ? kVar.i("bidId") : kVar.i("creativeId");
        if (strI == null) {
            strI = "";
        }
        Integer numX = wb.d0.x(watermarkConfiguration.getBaseColorRgb());
        int iIntValue = numX != null ? numX.intValue() : -16777216;
        WatermarkLocation location = watermarkConfiguration.getLocation();
        switch (location != null ? a.$EnumSwitchMapping$3[location.ordinal()] : -1) {
            case 1:
                bVar = l1.b.TOP_LEFT;
                break;
            case 2:
                bVar = l1.b.TOP_CENTER;
                break;
            case 3:
                bVar = l1.b.TOP_RIGHT;
                break;
            case 4:
                bVar = l1.b.BOTTOM_LEFT;
                break;
            case 5:
                bVar = l1.b.BOTTOM_CENTER;
                break;
            case 6:
                bVar = l1.b.BOTTOM_RIGHT;
                break;
            default:
                bVar = l1.b.BOTTOM_LEFT;
                break;
        }
        return new l1(aVar, strI, iIntValue, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String x() {
        return "Can't create ViewabilityTrackerParams";
    }

    private final Map<pb.f, pb.h> z(List<Rendering.AdaptiveAnimation> list) {
        pb.h hVar;
        HashMap map = new HashMap();
        for (Rendering.AdaptiveAnimation adaptiveAnimation : list) {
            pb.f fVarA = pb.f.f24031b.a(adaptiveAnimation.getEvent());
            if (fVarA != null) {
                Rendering.AdaptiveAnimation.Style style = adaptiveAnimation.getStyle();
                kotlin.jvm.internal.t.e(style, "it.style");
                if (style.hasFade()) {
                    Rendering.AdaptiveAnimation.FadeAnimationOption fade = style.getFade();
                    kotlin.jvm.internal.t.e(fade, "style.fade");
                    Rendering.AdaptiveAnimation.Timing timing = fade.getTiming();
                    kotlin.jvm.internal.t.e(timing, "fadeAnimationOption.timing");
                    hVar = new pb.h(fVarA, pb.i.Fade, pb.g.f24072b.a(timing.getFunction()), l0.j(timing), null);
                } else if (style.hasSlide()) {
                    Rendering.AdaptiveAnimation.SlideAnimationOption slide = style.getSlide();
                    kotlin.jvm.internal.t.e(slide, "style.slide");
                    Rendering.AdaptiveAnimation.Timing timing2 = slide.getTiming();
                    kotlin.jvm.internal.t.e(timing2, "slideAnimationOption.timing");
                    hVar = new pb.h(fVarA, pb.i.Slide, pb.g.f24072b.a(timing2.getFunction()), l0.j(timing2), pb.e.f23999b.a(slide.getDirection()));
                }
                map.put(fVarA, hVar);
            }
        }
        return map;
    }

    public final pb.j A(Rendering.Phase.ViewComponent.Appearance appearance) {
        if (appearance == null || appearance == Rendering.Phase.ViewComponent.Appearance.getDefaultInstance()) {
            return new pb.j(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        }
        pb.k kVarB = B(appearance.getBackground());
        Integer numX = wb.d0.x(appearance.getBackgroundColor());
        Boolean boolValueOf = Boolean.valueOf(appearance.getVisible());
        Boolean boolValueOf2 = Boolean.valueOf(appearance.getClickable());
        Float fValueOf = Float.valueOf((float) appearance.getOpacity());
        Float fValueOf2 = Float.valueOf((float) appearance.getFontSize());
        pb.g0 g0VarA = pb.g0.f24079c.a(appearance.getFontStyle());
        Boolean boolValueOf3 = Boolean.valueOf(appearance.getOutlined());
        Float fValueOf3 = Float.valueOf((float) appearance.getStrokeWidth());
        Integer numX2 = wb.d0.x(appearance.getStrokeColor());
        Integer numX3 = wb.d0.x(appearance.getFillColor());
        Integer numX4 = wb.d0.x(appearance.getShadowColor());
        w0 w0VarA = w0.f24244e.a(appearance.getPadding());
        Float fValueOf4 = Float.valueOf((float) appearance.getCornerRadius());
        Integer numValueOf = Integer.valueOf(appearance.getTextNumberOfLines());
        Float fValueOf5 = Float.valueOf((float) appearance.getTextLineSpacing());
        pb.l0 l0VarA = pb.l0.f24158c.a(appearance.getTextAlignment());
        if (l0VarA == null) {
            l0VarA = pb.l0.Center;
        }
        return new pb.j(kVarB, numX, boolValueOf, boolValueOf2, fValueOf, fValueOf2, g0VarA, boolValueOf3, fValueOf3, numX2, numX3, numX4, w0VarA, fValueOf4, numValueOf, fValueOf5, l0VarA);
    }

    public final pb.a0 O(Rendering.Phase.ViewComponent.Layout layout) {
        pb.a0.a aVar = new pb.a0.a();
        if (layout == null) {
            return aVar.a();
        }
        List<Rendering.Phase.ViewComponent.Layout.Constraint> constraintsList = layout.getConstraintsList();
        kotlin.jvm.internal.t.e(constraintsList, "layout.constraintsList");
        for (Rendering.Phase.ViewComponent.Layout.Constraint constraint : constraintsList) {
            final Rendering.Phase.ViewComponent.Layout.Constraint.Anchor sourceAnchor = constraint.getSourceAnchor();
            Rendering.Phase.ViewComponent.Layout.Constraint.Anchor targetAnchor = constraint.getTargetAnchor();
            String target = constraint.getTarget();
            kotlin.jvm.internal.t.e(target, "constraint.target");
            float value = (float) constraint.getValue();
            switch (sourceAnchor == null ? -1 : a.$EnumSwitchMapping$0[sourceAnchor.ordinal()]) {
                case 1:
                    aVar.p(value);
                    aVar.q((float) constraint.getMultiplier());
                    break;
                case 2:
                    aVar.e(value);
                    aVar.f((float) constraint.getMultiplier());
                    break;
                case 3:
                    h1 h1VarY = l0.y(targetAnchor);
                    if (h1VarY != null) {
                        aVar.g(new g1(h1VarY, target));
                    }
                    aVar.i(value);
                    break;
                case 4:
                    h1 h1VarY2 = l0.y(targetAnchor);
                    if (h1VarY2 != null) {
                        aVar.m(new g1(h1VarY2, target));
                    }
                    aVar.k(value);
                    break;
                case 5:
                    h1 h1VarY3 = l0.y(targetAnchor);
                    if (h1VarY3 != null) {
                        aVar.l(new g1(h1VarY3, target));
                    }
                    aVar.j(value);
                    break;
                case 6:
                    h1 h1VarY4 = l0.y(targetAnchor);
                    if (h1VarY4 != null) {
                        aVar.b(new g1(h1VarY4, target));
                    }
                    aVar.h(value);
                    break;
                case 7:
                    h1 h1VarY5 = l0.y(targetAnchor);
                    if (h1VarY5 != null) {
                        aVar.c(new g1(h1VarY5, target));
                    }
                    aVar.n(value);
                    break;
                case 8:
                    h1 h1VarY6 = l0.y(targetAnchor);
                    if (h1VarY6 != null) {
                        aVar.d(new g1(h1VarY6, target));
                    }
                    aVar.o(value);
                    break;
                default:
                    io.bidmachine.core.a.g(new qc.b() { // from class: k6.w
                        @Override // qc.b
                        public final Object get() {
                            return b0.P(sourceAnchor);
                        }
                    });
                    break;
            }
        }
        return aVar.a();
    }

    public final pb.c0 Q(Rendering.Phase.Event event) {
        pb.f0 f0VarR;
        if (event == null || event == Rendering.Phase.Event.getDefaultInstance() || (f0VarR = l0.r(event.getName())) == null) {
            return null;
        }
        String source = event.getSource();
        kotlin.jvm.internal.t.e(source, "event.source");
        List<Rendering.Phase.Event.Task> tasksList = event.getTasksList();
        kotlin.jvm.internal.t.e(tasksList, "event.tasksList");
        return new pb.c0(f0VarR, source, o7.e.d(tasksList));
    }

    public final List<q0> X(List<Rendering.Phase.ViewComponent.Measurer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(list, 10));
        for (Rendering.Phase.ViewComponent.Measurer measurer : list) {
            String name = measurer.getName();
            kotlin.jvm.internal.t.e(name, "it.name");
            arrayList.add(new q0(name, measurer.getParametersMap()));
        }
        return arrayList;
    }

    public final List<f1> f0(List<Rendering.Phase.ViewComponent.ScriptConfig> scriptsList) {
        kotlin.jvm.internal.t.f(scriptsList, "scriptsList");
        ArrayList arrayList = new ArrayList(kotlin.collections.u.u(scriptsList, 10));
        for (Rendering.Phase.ViewComponent.ScriptConfig scriptConfig : scriptsList) {
            String scriptId = scriptConfig.getScriptId();
            int priority = scriptConfig.getPriority();
            String source = scriptConfig.getSource();
            boolean forMainFrameOnly = scriptConfig.getForMainFrameOnly();
            Rendering.Phase.ViewComponent.ScriptConfig.InjectTiming injectTiming = scriptConfig.getInjectTiming();
            int i10 = injectTiming == null ? -1 : a.$EnumSwitchMapping$4[injectTiming.ordinal()];
            f1.b bVar = i10 != 1 ? i10 != 2 ? null : f1.b.DocumentEnd : f1.b.DocumentStart;
            kotlin.jvm.internal.t.e(scriptId, "scriptId");
            kotlin.jvm.internal.t.e(source, "source");
            arrayList.add(new f1(scriptId, priority, bVar, forMainFrameOnly, source, null, 32, null));
        }
        return arrayList;
    }

    public final pb.c h0() {
        return this.f21234b;
    }

    public boolean i0(vb.c callback) {
        kotlin.jvm.internal.t.f(callback, "callback");
        if (this.f21234b != null) {
            return true;
        }
        callback.c(oc.a.k("rendering_configuration"));
        return false;
    }

    public final pb.a v(Rendering.Phase.ViewComponent viewComponent, ob.g gVar) {
        pb.b bVarK;
        if (viewComponent == null || viewComponent == Rendering.Phase.ViewComponent.getDefaultInstance() || (bVarK = l0.k(viewComponent.getType())) == null) {
            return null;
        }
        String it = viewComponent.getText();
        kotlin.jvm.internal.t.e(it, "it");
        String str = it.length() > 0 ? it : null;
        String name = viewComponent.getName();
        kotlin.jvm.internal.t.e(name, "viewComponent.name");
        b1 b1VarC0 = c0(viewComponent.getResource());
        String source = viewComponent.getSource();
        String placeholder = viewComponent.getPlaceholder();
        pb.a0 a0VarO = O(viewComponent.getLayout());
        pb.j jVarA = A(viewComponent.getAppearance());
        Map<String, String> customParamsMap = viewComponent.getCustomParamsMap();
        kotlin.jvm.internal.t.e(customParamsMap, "viewComponent.customParamsMap");
        List<Rendering.AdaptiveAnimation> animationsList = viewComponent.getAppearance().getAnimationsList();
        kotlin.jvm.internal.t.e(animationsList, "viewComponent.appearance.animationsList");
        Map<pb.f, pb.h> mapZ = z(animationsList);
        List<q0> listX = X(viewComponent.getMeasurersList());
        List<RenderingFeature> featuresList = viewComponent.getFeaturesList();
        kotlin.jvm.internal.t.e(featuresList, "viewComponent.featuresList");
        pb.s sVarF = F(featuresList);
        List<Rendering.Phase.ViewComponent.ScriptConfig> scriptsList = viewComponent.getScriptsList();
        kotlin.jvm.internal.t.e(scriptsList, "viewComponent.scriptsList");
        return new pb.a(bVarK, name, b1VarC0, source, placeholder, str, a0VarO, jVarA, customParamsMap, mapZ, gVar, listX, sVarF, f0(scriptsList));
    }

    public final pb.c w(Rendering rendering, nc.a visibilityParams, l1 l1Var) {
        kotlin.jvm.internal.t.f(rendering, "rendering");
        kotlin.jvm.internal.t.f(visibilityParams, "visibilityParams");
        ViewabilityConfiguration viewabilityConfiguration = rendering.getViewabilityConfiguration();
        kotlin.jvm.internal.t.e(viewabilityConfiguration, "rendering.viewabilityConfiguration");
        mc.d dVarO = oc.m.O(viewabilityConfiguration);
        if (dVarO == null) {
            io.bidmachine.core.a.g(new qc.b() { // from class: k6.g
                @Override // qc.b
                public final Object get() {
                    return b0.x();
                }
            });
            return null;
        }
        l6.a aVar = new l6.a();
        pb.c.a aVarE = new pb.c.a(dVarO).f(l0.t(rendering.getOrientation())).c(B(rendering.getBackground())).h(visibilityParams).i(l1Var).e(rendering.getCustomParamsMap());
        pb.u uVarM = l0.m(rendering.getCacheType());
        if (uVarM != null) {
            aVarE.d(uVarM);
        }
        List<Rendering.Phase> phasesList = rendering.getPhasesList();
        kotlin.jvm.internal.t.e(phasesList, "rendering.phasesList");
        List<Rendering.Phase> listR0 = kotlin.collections.b0.r0(phasesList);
        if (listR0.size() > 1) {
            kotlin.collections.x.y(listR0, new b());
        }
        for (Rendering.Phase phase : listR0) {
            pb.d dVarY = y(phase, aVar);
            if (dVarY != null) {
                if (phase.getSequence() == -1) {
                    aVarE.g(dVarY);
                } else {
                    aVarE.a(dVarY);
                }
            }
        }
        return aVarE.b();
    }

    public final pb.d y(Rendering.Phase phase, ob.g gVar) {
        if (phase == null || phase == Rendering.Phase.getDefaultInstance()) {
            return null;
        }
        pb.d.a aVarG = new pb.d.a(phase.getSequence()).g(B(phase.getBackground()));
        List<Rendering.AdaptiveAnimation> animationsList = phase.getAnimationsList();
        kotlin.jvm.internal.t.e(animationsList, "phase.animationsList");
        pb.d.a aVarF = aVarG.f(kotlin.collections.o0.u(z(animationsList)));
        w1 stateGroupsList = phase.getStateGroupsList();
        kotlin.jvm.internal.t.e(stateGroupsList, "phase.stateGroupsList");
        pb.d.a aVarI = aVarF.j(kotlin.collections.b0.r0(stateGroupsList)).i(phase.getCustomParamsMap());
        Integer numX = wb.d0.x(phase.getBackgroundColor());
        if (numX != null) {
            aVarI.h(numX.intValue());
        }
        List<Rendering.Phase.ViewComponent> adsList = phase.getAdsList();
        kotlin.jvm.internal.t.e(adsList, "phase.adsList");
        Iterator<T> it = adsList.iterator();
        while (it.hasNext()) {
            pb.a aVarV = v((Rendering.Phase.ViewComponent) it.next(), gVar);
            if (aVarV != null) {
                aVarI.a(aVarV);
            }
        }
        List<Rendering.Phase.ViewComponent> controlsList = phase.getControlsList();
        kotlin.jvm.internal.t.e(controlsList, "phase.controlsList");
        Iterator<T> it2 = controlsList.iterator();
        while (it2.hasNext()) {
            pb.a aVarV2 = v((Rendering.Phase.ViewComponent) it2.next(), gVar);
            if (aVarV2 != null) {
                aVarI.b(aVarV2);
            }
        }
        List<Rendering.Phase.Event> eventsList = phase.getEventsList();
        kotlin.jvm.internal.t.e(eventsList, "phase.eventsList");
        Iterator<T> it3 = eventsList.iterator();
        while (it3.hasNext()) {
            pb.c0 c0VarQ = Q((Rendering.Phase.Event) it3.next());
            if (c0VarQ != null) {
                aVarI.c(c0VarQ);
            }
        }
        List<Rendering.Phase.MethodComponent> methodsList = phase.getMethodsList();
        kotlin.jvm.internal.t.e(methodsList, "phase.methodsList");
        Iterator<T> it4 = methodsList.iterator();
        while (it4.hasNext()) {
            String name = ((Rendering.Phase.MethodComponent) it4.next()).getName();
            kotlin.jvm.internal.t.e(name, "methodComponent.name");
            aVarI.d(new s0(name));
        }
        return aVarI.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String D() {
        return TwDPD.BIgKqBiNzaA;
    }
}
