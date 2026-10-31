package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.c3;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.w0;
import com.explorestack.protobuf.y;
import com.explorestack.protobuf.y0;
import com.explorestack.protobuf.z1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.protobuf.rendering.RenderingOrBuilder;
import io.bidmachine.protobuf.sdk.ViewabilityConfiguration;
import io.bidmachine.protobuf.sdk.ViewabilityConfigurationOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class AdExtension extends j0 implements AdExtensionOrBuilder {
    public static final int AD_CACHE_CONTROL_FIELD_NUMBER = 21;
    public static final int AD_CACHE_MAX_AGE_FIELD_NUMBER = 22;
    public static final int AD_FLEXIBLE_SIZE_FIELD_NUMBER = 32;
    public static final int AD_MARKUP_LOADING_TIMEOUT_FIELD_NUMBER = 24;
    public static final int CLOSE_BUTTON_FIELD_NUMBER = 15;
    public static final int COMPANION_SKIPOFFSET_FIELD_NUMBER = 10;
    public static final int COUNTDOWN_FIELD_NUMBER = 14;
    public static final int CREATIVE_EXTENSION_FIELD_NUMBER = 31;
    public static final int CREATIVE_LOADING_METHOD_FIELD_NUMBER = 27;
    public static final int CREATIVE_LOADING_TIMEOUT_FIELD_NUMBER = 35;
    public static final int CRID_MONITORING_ENABLED_FIELD_NUMBER = 36;
    public static final int CUSTOM_PARAMS_FIELD_NUMBER = 8;
    public static final int EVENT_CONFIGURATION_FIELD_NUMBER = 29;
    public static final int EVENT_FIELD_NUMBER = 7;
    public static final int IGNORES_SAFE_AREA_LAYOUT_GUIDE_FIELD_NUMBER = 16;
    public static final int LOAD_SKIPOFFSET_FIELD_NUMBER = 3;
    public static final int MRAID_CREATIVE_VALIDATION_REQUIRED_FIELD_NUMBER = 34;
    public static final int PLACEHOLDER_TIMEOUT_FIELD_NUMBER = 28;
    public static final int PRELOAD_AD_FIELD_NUMBER = 26;
    public static final int PRELOAD_FIELD_NUMBER = 2;
    public static final int PROGRESS_DURATION_FIELD_NUMBER = 19;
    public static final int PROGRESS_FIELD_NUMBER = 18;
    public static final int R1_DELAY_FIELD_NUMBER = 23;
    public static final int R1_FIELD_NUMBER = 12;
    public static final int R2_FIELD_NUMBER = 13;
    public static final int RENDERING_CONFIGURATION_FIELD_NUMBER = 33;
    public static final int SKIPOFFSET_FIELD_NUMBER = 9;
    public static final int STORE_URL_FIELD_NUMBER = 17;
    public static final int USE_EMBEDDED_BROWSER_FIELD_NUMBER = 25;
    public static final int USE_NATIVE_CLOSE_FIELD_NUMBER = 11;
    public static final int VIEWABILITY_CONFIGURATION_FIELD_NUMBER = 37;
    public static final int VIEWABILITY_DURATION_THRESHOLD_FIELD_NUMBER = 6;
    public static final int VIEWABILITY_IGNORE_OVERLAP_FIELD_NUMBER = 30;
    public static final int VIEWABILITY_IGNORE_WINDOW_FOCUS_FIELD_NUMBER = 20;
    public static final int VIEWABILITY_PIXEL_THRESHOLD_FIELD_NUMBER = 5;
    public static final int VIEWABILITY_TIME_THRESHOLD_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int adCacheControl_;
    private int adCacheMaxAge_;
    private boolean adFlexibleSize_;
    private int adMarkupLoadingTimeout_;
    private int bitField0_;
    private ControlAsset closeButton_;
    private int companionSkipoffset_;
    private ControlAsset countdown_;
    private CreativeExtension creativeExtension_;
    private int creativeLoadingMethod_;
    private int creativeLoadingTimeout_;
    private boolean cridMonitoringEnabled_;
    private y0<String, String> customParams_;
    private EventConfiguration eventConfiguration_;
    private List<Ad.Event> event_;
    private boolean ignoresSafeAreaLayoutGuide_;
    private int loadSkipoffset_;
    private byte memoizedIsInitialized;
    private boolean mraidCreativeValidationRequired_;
    private float placeholderTimeout_;
    private boolean preloadAd_;
    private boolean preload_;
    private int progressDuration_;
    private ControlAsset progress_;
    private int r1Delay_;
    private boolean r1_;
    private boolean r2_;
    private Rendering renderingConfiguration_;
    private int skipoffset_;
    private volatile Object storeUrl_;
    private boolean useEmbeddedBrowser_;
    private boolean useNativeClose_;
    private ViewabilityConfiguration viewabilityConfiguration_;
    private float viewabilityDurationThreshold_;
    private boolean viewabilityIgnoreOverlap_;
    private boolean viewabilityIgnoreWindowFocus_;
    private float viewabilityPixelThreshold_;
    private int viewabilityTimeThreshold_;
    private static final AdExtension DEFAULT_INSTANCE = new AdExtension();
    private static final s1<AdExtension> PARSER = new b<AdExtension>() { // from class: io.bidmachine.protobuf.AdExtension.1
        @Override // com.explorestack.protobuf.s1
        public AdExtension parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new AdExtension(nVar, yVar);
        }
    };

    public static final class ControlAsset extends j0 implements ControlAssetOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 1;
        public static final int FILL_FIELD_NUMBER = 2;
        public static final int FONT_STYLE_FIELD_NUMBER = 3;
        public static final int HEIGHT_FIELD_NUMBER = 4;
        public static final int HIDEAFTER_FIELD_NUMBER = 5;
        public static final int MARGIN_FIELD_NUMBER = 6;
        public static final int OPACITY_FIELD_NUMBER = 7;
        public static final int OUTLINED_FIELD_NUMBER = 8;
        public static final int PADDING_FIELD_NUMBER = 9;
        public static final int SHADOW_FIELD_NUMBER = 10;
        public static final int STROKE_FIELD_NUMBER = 11;
        public static final int STROKE_WIDTH_FIELD_NUMBER = 18;
        public static final int STYLE_FIELD_NUMBER = 13;
        public static final int VISIBLE_FIELD_NUMBER = 14;
        public static final int WIDTH_FIELD_NUMBER = 15;
        public static final int X_FIELD_NUMBER = 16;
        public static final int Y_FIELD_NUMBER = 17;
        private static final long serialVersionUID = 0;
        private volatile Object content_;
        private volatile Object fill_;
        private int fontStyle_;
        private int height_;
        private int hideafter_;
        private volatile Object margin_;
        private byte memoizedIsInitialized;
        private float opacity_;
        private boolean outlined_;
        private volatile Object padding_;
        private volatile Object shadow_;
        private float strokeWidth_;
        private volatile Object stroke_;
        private volatile Object style_;
        private boolean visible_;
        private int width_;
        private volatile Object x_;
        private volatile Object y_;
        private static final ControlAsset DEFAULT_INSTANCE = new ControlAsset();
        private static final s1<ControlAsset> PARSER = new b<ControlAsset>() { // from class: io.bidmachine.protobuf.AdExtension.ControlAsset.1
            @Override // com.explorestack.protobuf.s1
            public ControlAsset parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new ControlAsset(nVar, yVar);
            }
        };

        public static ControlAsset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ControlAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ControlAsset) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ControlAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<ControlAsset> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ControlAsset)) {
                return super.equals(obj);
            }
            ControlAsset controlAsset = (ControlAsset) obj;
            return getContent().equals(controlAsset.getContent()) && getFill().equals(controlAsset.getFill()) && getFontStyle() == controlAsset.getFontStyle() && getHeight() == controlAsset.getHeight() && getHideafter() == controlAsset.getHideafter() && getMargin().equals(controlAsset.getMargin()) && Float.floatToIntBits(getOpacity()) == Float.floatToIntBits(controlAsset.getOpacity()) && getOutlined() == controlAsset.getOutlined() && getPadding().equals(controlAsset.getPadding()) && getShadow().equals(controlAsset.getShadow()) && getStroke().equals(controlAsset.getStroke()) && Float.floatToIntBits(getStrokeWidth()) == Float.floatToIntBits(controlAsset.getStrokeWidth()) && getStyle().equals(controlAsset.getStyle()) && getVisible() == controlAsset.getVisible() && getWidth() == controlAsset.getWidth() && getX().equals(controlAsset.getX()) && getY().equals(controlAsset.getY()) && this.unknownFields.equals(controlAsset.unknownFields);
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getContent() {
            Object obj = this.content_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.content_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getFill() {
            Object obj = this.fill_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fill_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getFillBytes() {
            Object obj = this.fill_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fill_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public int getFontStyle() {
            return this.fontStyle_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public int getHideafter() {
            return this.hideafter_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getMargin() {
            Object obj = this.margin_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.margin_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getMarginBytes() {
            Object obj = this.margin_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.margin_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public float getOpacity() {
            return this.opacity_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public boolean getOutlined() {
            return this.outlined_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getPadding() {
            Object obj = this.padding_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.padding_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getPaddingBytes() {
            Object obj = this.padding_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.padding_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<ControlAsset> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = getContentBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.content_);
            if (!getFillBytes().isEmpty()) {
                iComputeStringSize += j0.computeStringSize(2, this.fill_);
            }
            int i11 = this.fontStyle_;
            if (i11 != 0) {
                iComputeStringSize += CodedOutputStream.Y(3, i11);
            }
            int i12 = this.height_;
            if (i12 != 0) {
                iComputeStringSize += CodedOutputStream.Y(4, i12);
            }
            int i13 = this.hideafter_;
            if (i13 != 0) {
                iComputeStringSize += CodedOutputStream.Y(5, i13);
            }
            if (!getMarginBytes().isEmpty()) {
                iComputeStringSize += j0.computeStringSize(6, this.margin_);
            }
            float f10 = this.opacity_;
            if (f10 != 0.0f) {
                iComputeStringSize += CodedOutputStream.r(7, f10);
            }
            boolean z10 = this.outlined_;
            if (z10) {
                iComputeStringSize += CodedOutputStream.e(8, z10);
            }
            if (!getPaddingBytes().isEmpty()) {
                iComputeStringSize += j0.computeStringSize(9, this.padding_);
            }
            if (!getShadowBytes().isEmpty()) {
                iComputeStringSize += j0.computeStringSize(10, this.shadow_);
            }
            if (!getStrokeBytes().isEmpty()) {
                iComputeStringSize += j0.computeStringSize(11, this.stroke_);
            }
            if (!getStyleBytes().isEmpty()) {
                iComputeStringSize += j0.computeStringSize(13, this.style_);
            }
            boolean z11 = this.visible_;
            if (z11) {
                iComputeStringSize += CodedOutputStream.e(14, z11);
            }
            int i14 = this.width_;
            if (i14 != 0) {
                iComputeStringSize += CodedOutputStream.Y(15, i14);
            }
            if (!getXBytes().isEmpty()) {
                iComputeStringSize += j0.computeStringSize(16, this.x_);
            }
            if (!getYBytes().isEmpty()) {
                iComputeStringSize += j0.computeStringSize(17, this.y_);
            }
            float f11 = this.strokeWidth_;
            if (f11 != 0.0f) {
                iComputeStringSize += CodedOutputStream.r(18, f11);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getShadow() {
            Object obj = this.shadow_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.shadow_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getShadowBytes() {
            Object obj = this.shadow_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.shadow_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getStroke() {
            Object obj = this.stroke_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.stroke_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getStrokeBytes() {
            Object obj = this.stroke_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.stroke_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public float getStrokeWidth() {
            return this.strokeWidth_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getStyle() {
            Object obj = this.style_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.style_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getStyleBytes() {
            Object obj = this.style_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.style_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public boolean getVisible() {
            return this.visible_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getX() {
            Object obj = this.x_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.x_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getXBytes() {
            Object obj = this.x_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.x_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getY() {
            Object obj = this.y_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.y_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getYBytes() {
            Object obj = this.y_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.y_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContent().hashCode()) * 37) + 2) * 53) + getFill().hashCode()) * 37) + 3) * 53) + getFontStyle()) * 37) + 4) * 53) + getHeight()) * 37) + 5) * 53) + getHideafter()) * 37) + 6) * 53) + getMargin().hashCode()) * 37) + 7) * 53) + Float.floatToIntBits(getOpacity())) * 37) + 8) * 53) + l0.d(getOutlined())) * 37) + 9) * 53) + getPadding().hashCode()) * 37) + 10) * 53) + getShadow().hashCode()) * 37) + 11) * 53) + getStroke().hashCode()) * 37) + 18) * 53) + Float.floatToIntBits(getStrokeWidth())) * 37) + 13) * 53) + getStyle().hashCode()) * 37) + 14) * 53) + l0.d(getVisible())) * 37) + 15) * 53) + getWidth()) * 37) + 16) * 53) + getX().hashCode()) * 37) + 17) * 53) + getY().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_fieldAccessorTable.d(ControlAsset.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.j0
        protected Object newInstance(j0.g gVar) {
            return new ControlAsset();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getContentBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 1, this.content_);
            }
            if (!getFillBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 2, this.fill_);
            }
            int i10 = this.fontStyle_;
            if (i10 != 0) {
                codedOutputStream.c1(3, i10);
            }
            int i11 = this.height_;
            if (i11 != 0) {
                codedOutputStream.c1(4, i11);
            }
            int i12 = this.hideafter_;
            if (i12 != 0) {
                codedOutputStream.c1(5, i12);
            }
            if (!getMarginBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 6, this.margin_);
            }
            float f10 = this.opacity_;
            if (f10 != 0.0f) {
                codedOutputStream.B0(7, f10);
            }
            boolean z10 = this.outlined_;
            if (z10) {
                codedOutputStream.n0(8, z10);
            }
            if (!getPaddingBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 9, this.padding_);
            }
            if (!getShadowBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 10, this.shadow_);
            }
            if (!getStrokeBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 11, this.stroke_);
            }
            if (!getStyleBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 13, this.style_);
            }
            boolean z11 = this.visible_;
            if (z11) {
                codedOutputStream.n0(14, z11);
            }
            int i13 = this.width_;
            if (i13 != 0) {
                codedOutputStream.c1(15, i13);
            }
            if (!getXBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 16, this.x_);
            }
            if (!getYBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 17, this.y_);
            }
            float f11 = this.strokeWidth_;
            if (f11 != 0.0f) {
                codedOutputStream.B0(18, f11);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements ControlAssetOrBuilder {
            private Object content_;
            private Object fill_;
            private int fontStyle_;
            private int height_;
            private int hideafter_;
            private Object margin_;
            private float opacity_;
            private boolean outlined_;
            private Object padding_;
            private Object shadow_;
            private float strokeWidth_;
            private Object stroke_;
            private Object style_;
            private boolean visible_;
            private int width_;
            private Object x_;
            private Object y_;

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder clearContent() {
                this.content_ = ControlAsset.getDefaultInstance().getContent();
                onChanged();
                return this;
            }

            public Builder clearFill() {
                this.fill_ = ControlAsset.getDefaultInstance().getFill();
                onChanged();
                return this;
            }

            public Builder clearFontStyle() {
                this.fontStyle_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHideafter() {
                this.hideafter_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMargin() {
                this.margin_ = ControlAsset.getDefaultInstance().getMargin();
                onChanged();
                return this;
            }

            public Builder clearOpacity() {
                this.opacity_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearOutlined() {
                this.outlined_ = false;
                onChanged();
                return this;
            }

            public Builder clearPadding() {
                this.padding_ = ControlAsset.getDefaultInstance().getPadding();
                onChanged();
                return this;
            }

            public Builder clearShadow() {
                this.shadow_ = ControlAsset.getDefaultInstance().getShadow();
                onChanged();
                return this;
            }

            public Builder clearStroke() {
                this.stroke_ = ControlAsset.getDefaultInstance().getStroke();
                onChanged();
                return this;
            }

            public Builder clearStrokeWidth() {
                this.strokeWidth_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearStyle() {
                this.style_ = ControlAsset.getDefaultInstance().getStyle();
                onChanged();
                return this;
            }

            public Builder clearVisible() {
                this.visible_ = false;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = 0;
                onChanged();
                return this;
            }

            public Builder clearX() {
                this.x_ = ControlAsset.getDefaultInstance().getX();
                onChanged();
                return this;
            }

            public Builder clearY() {
                this.y_ = ControlAsset.getDefaultInstance().getY();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.content_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_descriptor;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getFill() {
                Object obj = this.fill_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fill_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getFillBytes() {
                Object obj = this.fill_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fill_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public int getFontStyle() {
                return this.fontStyle_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public int getHideafter() {
                return this.hideafter_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getMargin() {
                Object obj = this.margin_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.margin_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getMarginBytes() {
                Object obj = this.margin_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.margin_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public float getOpacity() {
                return this.opacity_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public boolean getOutlined() {
                return this.outlined_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getPadding() {
                Object obj = this.padding_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.padding_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getPaddingBytes() {
                Object obj = this.padding_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.padding_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getShadow() {
                Object obj = this.shadow_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.shadow_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getShadowBytes() {
                Object obj = this.shadow_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.shadow_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getStroke() {
                Object obj = this.stroke_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.stroke_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getStrokeBytes() {
                Object obj = this.stroke_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.stroke_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public float getStrokeWidth() {
                return this.strokeWidth_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getStyle() {
                Object obj = this.style_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.style_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getStyleBytes() {
                Object obj = this.style_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.style_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public boolean getVisible() {
                return this.visible_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getX() {
                Object obj = this.x_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.x_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getXBytes() {
                Object obj = this.x_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.x_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getY() {
                Object obj = this.y_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.y_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getYBytes() {
                Object obj = this.y_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.y_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_fieldAccessorTable.d(ControlAsset.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setContent(String str) {
                str.getClass();
                this.content_ = str;
                onChanged();
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.content_ = byteString;
                onChanged();
                return this;
            }

            public Builder setFill(String str) {
                str.getClass();
                this.fill_ = str;
                onChanged();
                return this;
            }

            public Builder setFillBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.fill_ = byteString;
                onChanged();
                return this;
            }

            public Builder setFontStyle(int i10) {
                this.fontStyle_ = i10;
                onChanged();
                return this;
            }

            public Builder setHeight(int i10) {
                this.height_ = i10;
                onChanged();
                return this;
            }

            public Builder setHideafter(int i10) {
                this.hideafter_ = i10;
                onChanged();
                return this;
            }

            public Builder setMargin(String str) {
                str.getClass();
                this.margin_ = str;
                onChanged();
                return this;
            }

            public Builder setMarginBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.margin_ = byteString;
                onChanged();
                return this;
            }

            public Builder setOpacity(float f10) {
                this.opacity_ = f10;
                onChanged();
                return this;
            }

            public Builder setOutlined(boolean z10) {
                this.outlined_ = z10;
                onChanged();
                return this;
            }

            public Builder setPadding(String str) {
                str.getClass();
                this.padding_ = str;
                onChanged();
                return this;
            }

            public Builder setPaddingBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.padding_ = byteString;
                onChanged();
                return this;
            }

            public Builder setShadow(String str) {
                str.getClass();
                this.shadow_ = str;
                onChanged();
                return this;
            }

            public Builder setShadowBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.shadow_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStroke(String str) {
                str.getClass();
                this.stroke_ = str;
                onChanged();
                return this;
            }

            public Builder setStrokeBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.stroke_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStrokeWidth(float f10) {
                this.strokeWidth_ = f10;
                onChanged();
                return this;
            }

            public Builder setStyle(String str) {
                str.getClass();
                this.style_ = str;
                onChanged();
                return this;
            }

            public Builder setStyleBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.style_ = byteString;
                onChanged();
                return this;
            }

            public Builder setVisible(boolean z10) {
                this.visible_ = z10;
                onChanged();
                return this;
            }

            public Builder setWidth(int i10) {
                this.width_ = i10;
                onChanged();
                return this;
            }

            public Builder setX(String str) {
                str.getClass();
                this.x_ = str;
                onChanged();
                return this;
            }

            public Builder setXBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.x_ = byteString;
                onChanged();
                return this;
            }

            public Builder setY(String str) {
                str.getClass();
                this.y_ = str;
                onChanged();
                return this;
            }

            public Builder setYBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.y_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.content_ = "";
                this.fill_ = "";
                this.margin_ = "";
                this.padding_ = "";
                this.shadow_ = "";
                this.stroke_ = "";
                this.style_ = "";
                this.x_ = "";
                this.y_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ControlAsset build() {
                ControlAsset controlAssetBuildPartial = buildPartial();
                if (controlAssetBuildPartial.isInitialized()) {
                    return controlAssetBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) controlAssetBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ControlAsset buildPartial() {
                ControlAsset controlAsset = new ControlAsset(this);
                controlAsset.content_ = this.content_;
                controlAsset.fill_ = this.fill_;
                controlAsset.fontStyle_ = this.fontStyle_;
                controlAsset.height_ = this.height_;
                controlAsset.hideafter_ = this.hideafter_;
                controlAsset.margin_ = this.margin_;
                controlAsset.opacity_ = this.opacity_;
                controlAsset.outlined_ = this.outlined_;
                controlAsset.padding_ = this.padding_;
                controlAsset.shadow_ = this.shadow_;
                controlAsset.stroke_ = this.stroke_;
                controlAsset.strokeWidth_ = this.strokeWidth_;
                controlAsset.style_ = this.style_;
                controlAsset.visible_ = this.visible_;
                controlAsset.width_ = this.width_;
                controlAsset.x_ = this.x_;
                controlAsset.y_ = this.y_;
                onBuilt();
                return controlAsset;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public ControlAsset mo164getDefaultInstanceForType() {
                return ControlAsset.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(u2 u2Var) {
                return (Builder) super.setUnknownFields(u2Var);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(u2 u2Var) {
                return (Builder) super.mergeUnknownFields(u2Var);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.content_ = "";
                this.fill_ = "";
                this.fontStyle_ = 0;
                this.height_ = 0;
                this.hideafter_ = 0;
                this.margin_ = "";
                this.opacity_ = 0.0f;
                this.outlined_ = false;
                this.padding_ = "";
                this.shadow_ = "";
                this.stroke_ = "";
                this.strokeWidth_ = 0.0f;
                this.style_ = "";
                this.visible_ = false;
                this.width_ = 0;
                this.x_ = "";
                this.y_ = "";
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
            /* JADX INFO: renamed from: clone */
            public Builder mo162clone() {
                return (Builder) super.mo162clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ControlAsset) {
                    return mergeFrom((ControlAsset) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ControlAsset controlAsset) {
                if (controlAsset == ControlAsset.getDefaultInstance()) {
                    return this;
                }
                if (!controlAsset.getContent().isEmpty()) {
                    this.content_ = controlAsset.content_;
                    onChanged();
                }
                if (!controlAsset.getFill().isEmpty()) {
                    this.fill_ = controlAsset.fill_;
                    onChanged();
                }
                if (controlAsset.getFontStyle() != 0) {
                    setFontStyle(controlAsset.getFontStyle());
                }
                if (controlAsset.getHeight() != 0) {
                    setHeight(controlAsset.getHeight());
                }
                if (controlAsset.getHideafter() != 0) {
                    setHideafter(controlAsset.getHideafter());
                }
                if (!controlAsset.getMargin().isEmpty()) {
                    this.margin_ = controlAsset.margin_;
                    onChanged();
                }
                if (controlAsset.getOpacity() != 0.0f) {
                    setOpacity(controlAsset.getOpacity());
                }
                if (controlAsset.getOutlined()) {
                    setOutlined(controlAsset.getOutlined());
                }
                if (!controlAsset.getPadding().isEmpty()) {
                    this.padding_ = controlAsset.padding_;
                    onChanged();
                }
                if (!controlAsset.getShadow().isEmpty()) {
                    this.shadow_ = controlAsset.shadow_;
                    onChanged();
                }
                if (!controlAsset.getStroke().isEmpty()) {
                    this.stroke_ = controlAsset.stroke_;
                    onChanged();
                }
                if (controlAsset.getStrokeWidth() != 0.0f) {
                    setStrokeWidth(controlAsset.getStrokeWidth());
                }
                if (!controlAsset.getStyle().isEmpty()) {
                    this.style_ = controlAsset.style_;
                    onChanged();
                }
                if (controlAsset.getVisible()) {
                    setVisible(controlAsset.getVisible());
                }
                if (controlAsset.getWidth() != 0) {
                    setWidth(controlAsset.getWidth());
                }
                if (!controlAsset.getX().isEmpty()) {
                    this.x_ = controlAsset.x_;
                    onChanged();
                }
                if (!controlAsset.getY().isEmpty()) {
                    this.y_ = controlAsset.y_;
                    onChanged();
                }
                mergeUnknownFields(((j0) controlAsset).unknownFields);
                onChanged();
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.content_ = "";
                this.fill_ = "";
                this.margin_ = "";
                this.padding_ = "";
                this.shadow_ = "";
                this.stroke_ = "";
                this.style_ = "";
                this.x_ = "";
                this.y_ = "";
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                ControlAsset controlAsset = null;
                try {
                    try {
                        ControlAsset controlAsset2 = (ControlAsset) ControlAsset.PARSER.parsePartialFrom(nVar, yVar);
                        if (controlAsset2 != null) {
                            mergeFrom(controlAsset2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        ControlAsset controlAsset3 = (ControlAsset) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            controlAsset = controlAsset3;
                            if (controlAsset != null) {
                                mergeFrom(controlAsset);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (controlAsset != null) {
                        mergeFrom(controlAsset);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(ControlAsset controlAsset) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(controlAsset);
        }

        public static ControlAsset parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private ControlAsset(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ControlAsset parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (ControlAsset) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static ControlAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public ControlAsset mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ControlAsset parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ControlAsset() {
            this.memoizedIsInitialized = (byte) -1;
            this.content_ = "";
            this.fill_ = "";
            this.margin_ = "";
            this.padding_ = "";
            this.shadow_ = "";
            this.stroke_ = "";
            this.style_ = "";
            this.x_ = "";
            this.y_ = "";
        }

        public static ControlAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static ControlAsset parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static ControlAsset parseFrom(InputStream inputStream) throws IOException {
            return (ControlAsset) j0.parseWithIOException(PARSER, inputStream);
        }

        public static ControlAsset parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (ControlAsset) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static ControlAsset parseFrom(n nVar) throws IOException {
            return (ControlAsset) j0.parseWithIOException(PARSER, nVar);
        }

        public static ControlAsset parseFrom(n nVar, y yVar) throws IOException {
            return (ControlAsset) j0.parseWithIOException(PARSER, nVar, yVar);
        }

        private ControlAsset(n nVar, y yVar) throws InvalidProtocolBufferException {
            this();
            yVar.getClass();
            u2.b bVarG = u2.g();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = nVar.K();
                        switch (iK) {
                            case 0:
                                break;
                            case 10:
                                this.content_ = nVar.J();
                                continue;
                            case 18:
                                this.fill_ = nVar.J();
                                continue;
                            case 24:
                                this.fontStyle_ = nVar.L();
                                continue;
                            case 32:
                                this.height_ = nVar.L();
                                continue;
                            case 40:
                                this.hideafter_ = nVar.L();
                                continue;
                            case 50:
                                this.margin_ = nVar.J();
                                continue;
                            case 61:
                                this.opacity_ = nVar.w();
                                continue;
                            case 64:
                                this.outlined_ = nVar.q();
                                continue;
                            case 74:
                                this.padding_ = nVar.J();
                                continue;
                            case 82:
                                this.shadow_ = nVar.J();
                                continue;
                            case 90:
                                this.stroke_ = nVar.J();
                                continue;
                            case 106:
                                this.style_ = nVar.J();
                                continue;
                            case 112:
                                this.visible_ = nVar.q();
                                continue;
                            case 120:
                                this.width_ = nVar.L();
                                continue;
                            case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                                this.x_ = nVar.J();
                                continue;
                            case CONFIG_REFRESH_FAILED_VALUE:
                                this.y_ = nVar.J();
                                continue;
                            case 149:
                                this.strokeWidth_ = nVar.w();
                                continue;
                            default:
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    break;
                                }
                                break;
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public interface ControlAssetOrBuilder extends MessageOrBuilder {
        String getContent();

        ByteString getContentBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        String getFill();

        ByteString getFillBytes();

        int getFontStyle();

        int getHeight();

        int getHideafter();

        String getMargin();

        ByteString getMarginBytes();

        float getOpacity();

        boolean getOutlined();

        String getPadding();

        ByteString getPaddingBytes();

        String getShadow();

        ByteString getShadowBytes();

        String getStroke();

        ByteString getStrokeBytes();

        float getStrokeWidth();

        String getStyle();

        ByteString getStyleBytes();

        boolean getVisible();

        int getWidth();

        String getX();

        ByteString getXBytes();

        String getY();

        ByteString getYBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    private static final class CustomParamsDefaultEntryHolder {
        static final w0<String, String> defaultEntry;

        static {
            Descriptors.Descriptor descriptor = ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_CustomParamsEntry_descriptor;
            c3.b bVar = c3.b.f10262k;
            defaultEntry = w0.s(descriptor, bVar, "", bVar, "");
        }

        private CustomParamsDefaultEntryHolder() {
        }
    }

    public static final class EventConfiguration extends j0 implements EventConfigurationOrBuilder {
        public static final int ACTIONS_FIELD_NUMBER = 3;
        public static final int CONTEXT_FIELD_NUMBER = 2;
        private static final EventConfiguration DEFAULT_INSTANCE = new EventConfiguration();
        private static final s1<EventConfiguration> PARSER = new b<EventConfiguration>() { // from class: io.bidmachine.protobuf.AdExtension.EventConfiguration.1
            @Override // com.explorestack.protobuf.s1
            public EventConfiguration parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new EventConfiguration(nVar, yVar);
            }
        };
        public static final int URL_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int actionsMemoizedSerializedSize;
        private l0.g actions_;
        private volatile Object context_;
        private byte memoizedIsInitialized;
        private volatile Object url_;

        public static EventConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EventConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EventConfiguration) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EventConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<EventConfiguration> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EventConfiguration)) {
                return super.equals(obj);
            }
            EventConfiguration eventConfiguration = (EventConfiguration) obj;
            return getUrl().equals(eventConfiguration.getUrl()) && getContext().equals(eventConfiguration.getContext()) && getActionsList().equals(eventConfiguration.getActionsList()) && this.unknownFields.equals(eventConfiguration.unknownFields);
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public int getActions(int i10) {
            return this.actions_.getInt(i10);
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public int getActionsCount() {
            return this.actions_.size();
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public List<Integer> getActionsList() {
            return this.actions_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public String getContext() {
            Object obj = this.context_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.context_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.context_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<EventConfiguration> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getUrlBytes().isEmpty() ? j0.computeStringSize(1, this.url_) + 0 : 0;
            if (!getContextBytes().isEmpty()) {
                iComputeStringSize += j0.computeStringSize(2, this.context_);
            }
            int iZ = 0;
            for (int i11 = 0; i11 < this.actions_.size(); i11++) {
                iZ += CodedOutputStream.Z(this.actions_.getInt(i11));
            }
            int iY = iComputeStringSize + iZ;
            if (!getActionsList().isEmpty()) {
                iY = iY + 1 + CodedOutputStream.y(iZ);
            }
            this.actionsMemoizedSerializedSize = iZ;
            int serializedSize = iY + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.url_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + getContext().hashCode();
            if (getActionsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getActionsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_fieldAccessorTable.d(EventConfiguration.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.explorestack.protobuf.j0
        protected Object newInstance(j0.g gVar) {
            return new EventConfiguration();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if (!getUrlBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 1, this.url_);
            }
            if (!getContextBytes().isEmpty()) {
                j0.writeString(codedOutputStream, 2, this.context_);
            }
            if (getActionsList().size() > 0) {
                codedOutputStream.d1(26);
                codedOutputStream.d1(this.actionsMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.actions_.size(); i10++) {
                codedOutputStream.d1(this.actions_.getInt(i10));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends j0.b<Builder> implements EventConfigurationOrBuilder {
            private l0.g actions_;
            private int bitField0_;
            private Object context_;
            private Object url_;

            private void ensureActionsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.actions_ = j0.mutableCopy(this.actions_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = j0.alwaysUseFieldBuilders;
            }

            public Builder addActions(int i10) {
                ensureActionsIsMutable();
                this.actions_.addInt(i10);
                onChanged();
                return this;
            }

            public Builder addAllActions(Iterable<? extends Integer> iterable) {
                ensureActionsIsMutable();
                a.AbstractC0128a.addAll((Iterable) iterable, (List) this.actions_);
                onChanged();
                return this;
            }

            public Builder clearActions() {
                this.actions_ = j0.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearContext() {
                this.context_ = EventConfiguration.getDefaultInstance().getContext();
                onChanged();
                return this;
            }

            public Builder clearUrl() {
                this.url_ = EventConfiguration.getDefaultInstance().getUrl();
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public int getActions(int i10) {
                return this.actions_.getInt(i10);
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public int getActionsCount() {
                return this.actions_.size();
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public List<Integer> getActionsList() {
                return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.actions_) : this.actions_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public String getContext() {
                Object obj = this.context_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.context_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public ByteString getContextBytes() {
                Object obj = this.context_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.context_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_descriptor;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_fieldAccessorTable.d(EventConfiguration.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setActions(int i10, int i11) {
                ensureActionsIsMutable();
                this.actions_.setInt(i10, i11);
                onChanged();
                return this;
            }

            public Builder setContext(String str) {
                str.getClass();
                this.context_ = str;
                onChanged();
                return this;
            }

            public Builder setContextBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.context_ = byteString;
                onChanged();
                return this;
            }

            public Builder setUrl(String str) {
                str.getClass();
                this.url_ = str;
                onChanged();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                byteString.getClass();
                a.checkByteStringIsUtf8(byteString);
                this.url_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.url_ = "";
                this.context_ = "";
                this.actions_ = j0.emptyIntList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public EventConfiguration build() {
                EventConfiguration eventConfigurationBuildPartial = buildPartial();
                if (eventConfigurationBuildPartial.isInitialized()) {
                    return eventConfigurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventConfigurationBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public EventConfiguration buildPartial() {
                EventConfiguration eventConfiguration = new EventConfiguration(this);
                eventConfiguration.url_ = this.url_;
                eventConfiguration.context_ = this.context_;
                if ((this.bitField0_ & 1) != 0) {
                    this.actions_.makeImmutable();
                    this.bitField0_ &= -2;
                }
                eventConfiguration.actions_ = this.actions_;
                onBuilt();
                return eventConfiguration;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public EventConfiguration mo164getDefaultInstanceForType() {
                return EventConfiguration.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(u2 u2Var) {
                return (Builder) super.setUnknownFields(u2Var);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder mergeUnknownFields(u2 u2Var) {
                return (Builder) super.mergeUnknownFields(u2Var);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.url_ = "";
                this.context_ = "";
                this.actions_ = j0.emptyIntList();
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
            /* JADX INFO: renamed from: clone */
            public Builder mo162clone() {
                return (Builder) super.mo162clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EventConfiguration) {
                    return mergeFrom((EventConfiguration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.url_ = "";
                this.context_ = "";
                this.actions_ = j0.emptyIntList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(EventConfiguration eventConfiguration) {
                if (eventConfiguration == EventConfiguration.getDefaultInstance()) {
                    return this;
                }
                if (!eventConfiguration.getUrl().isEmpty()) {
                    this.url_ = eventConfiguration.url_;
                    onChanged();
                }
                if (!eventConfiguration.getContext().isEmpty()) {
                    this.context_ = eventConfiguration.context_;
                    onChanged();
                }
                if (!eventConfiguration.actions_.isEmpty()) {
                    if (this.actions_.isEmpty()) {
                        this.actions_ = eventConfiguration.actions_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureActionsIsMutable();
                        this.actions_.addAll(eventConfiguration.actions_);
                    }
                    onChanged();
                }
                mergeUnknownFields(((j0) eventConfiguration).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                EventConfiguration eventConfiguration = null;
                try {
                    try {
                        EventConfiguration eventConfiguration2 = (EventConfiguration) EventConfiguration.PARSER.parsePartialFrom(nVar, yVar);
                        if (eventConfiguration2 != null) {
                            mergeFrom(eventConfiguration2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        EventConfiguration eventConfiguration3 = (EventConfiguration) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            eventConfiguration = eventConfiguration3;
                            if (eventConfiguration != null) {
                                mergeFrom(eventConfiguration);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (eventConfiguration != null) {
                        mergeFrom(eventConfiguration);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(EventConfiguration eventConfiguration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventConfiguration);
        }

        public static EventConfiguration parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        private EventConfiguration(j0.b<?> bVar) {
            super(bVar);
            this.actionsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EventConfiguration parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (EventConfiguration) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static EventConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public EventConfiguration mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EventConfiguration parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EventConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        private EventConfiguration() {
            this.actionsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.url_ = "";
            this.context_ = "";
            this.actions_ = j0.emptyIntList();
        }

        public static EventConfiguration parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static EventConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (EventConfiguration) j0.parseWithIOException(PARSER, inputStream);
        }

        public static EventConfiguration parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (EventConfiguration) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static EventConfiguration parseFrom(n nVar) throws IOException {
            return (EventConfiguration) j0.parseWithIOException(PARSER, nVar);
        }

        private EventConfiguration(n nVar, y yVar) throws InvalidProtocolBufferException {
            this();
            yVar.getClass();
            u2.b bVarG = u2.g();
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = nVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.url_ = nVar.J();
                                } else if (iK == 18) {
                                    this.context_ = nVar.J();
                                } else if (iK == 24) {
                                    if (!(z11 & true)) {
                                        this.actions_ = j0.newIntList();
                                        z11 |= true;
                                    }
                                    this.actions_.addInt(nVar.L());
                                } else if (iK != 26) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    int iP = nVar.p(nVar.C());
                                    if (!(z11 & true) && nVar.d() > 0) {
                                        this.actions_ = j0.newIntList();
                                        z11 |= true;
                                    }
                                    while (nVar.d() > 0) {
                                        this.actions_.addInt(nVar.L());
                                    }
                                    nVar.o(iP);
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z11 & true) {
                        this.actions_.makeImmutable();
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z11 & true) {
                this.actions_.makeImmutable();
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }

        public static EventConfiguration parseFrom(n nVar, y yVar) throws IOException {
            return (EventConfiguration) j0.parseWithIOException(PARSER, nVar, yVar);
        }
    }

    public interface EventConfigurationOrBuilder extends MessageOrBuilder {
        int getActions(int i10);

        int getActionsCount();

        List<Integer> getActionsList();

        String getContext();

        ByteString getContextBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        String getUrl();

        ByteString getUrlBytes();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static AdExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public y0<String, String> internalGetCustomParams() {
        y0<String, String> y0Var = this.customParams_;
        return y0Var == null ? y0.h(CustomParamsDefaultEntryHolder.defaultEntry) : y0Var;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AdExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdExtension) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<AdExtension> parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean containsCustomParams(String str) {
        str.getClass();
        return internalGetCustomParams().j().containsKey(str);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdExtension)) {
            return super.equals(obj);
        }
        AdExtension adExtension = (AdExtension) obj;
        if (getPreload() != adExtension.getPreload() || getLoadSkipoffset() != adExtension.getLoadSkipoffset() || getViewabilityTimeThreshold() != adExtension.getViewabilityTimeThreshold() || Float.floatToIntBits(getViewabilityPixelThreshold()) != Float.floatToIntBits(adExtension.getViewabilityPixelThreshold()) || Float.floatToIntBits(getViewabilityDurationThreshold()) != Float.floatToIntBits(adExtension.getViewabilityDurationThreshold()) || !getEventList().equals(adExtension.getEventList()) || !internalGetCustomParams().equals(adExtension.internalGetCustomParams()) || getSkipoffset() != adExtension.getSkipoffset() || getCompanionSkipoffset() != adExtension.getCompanionSkipoffset() || getUseNativeClose() != adExtension.getUseNativeClose() || getR1() != adExtension.getR1() || getR2() != adExtension.getR2() || hasCountdown() != adExtension.hasCountdown()) {
            return false;
        }
        if ((hasCountdown() && !getCountdown().equals(adExtension.getCountdown())) || hasCloseButton() != adExtension.hasCloseButton()) {
            return false;
        }
        if ((hasCloseButton() && !getCloseButton().equals(adExtension.getCloseButton())) || getIgnoresSafeAreaLayoutGuide() != adExtension.getIgnoresSafeAreaLayoutGuide() || !getStoreUrl().equals(adExtension.getStoreUrl()) || hasProgress() != adExtension.hasProgress()) {
            return false;
        }
        if ((hasProgress() && !getProgress().equals(adExtension.getProgress())) || getProgressDuration() != adExtension.getProgressDuration() || getViewabilityIgnoreWindowFocus() != adExtension.getViewabilityIgnoreWindowFocus() || this.adCacheControl_ != adExtension.adCacheControl_ || getAdCacheMaxAge() != adExtension.getAdCacheMaxAge() || getR1Delay() != adExtension.getR1Delay() || getAdMarkupLoadingTimeout() != adExtension.getAdMarkupLoadingTimeout() || getUseEmbeddedBrowser() != adExtension.getUseEmbeddedBrowser() || getPreloadAd() != adExtension.getPreloadAd() || this.creativeLoadingMethod_ != adExtension.creativeLoadingMethod_ || Float.floatToIntBits(getPlaceholderTimeout()) != Float.floatToIntBits(adExtension.getPlaceholderTimeout()) || hasEventConfiguration() != adExtension.hasEventConfiguration()) {
            return false;
        }
        if ((hasEventConfiguration() && !getEventConfiguration().equals(adExtension.getEventConfiguration())) || getViewabilityIgnoreOverlap() != adExtension.getViewabilityIgnoreOverlap() || hasCreativeExtension() != adExtension.hasCreativeExtension()) {
            return false;
        }
        if ((hasCreativeExtension() && !getCreativeExtension().equals(adExtension.getCreativeExtension())) || getAdFlexibleSize() != adExtension.getAdFlexibleSize() || hasRenderingConfiguration() != adExtension.hasRenderingConfiguration()) {
            return false;
        }
        if ((!hasRenderingConfiguration() || getRenderingConfiguration().equals(adExtension.getRenderingConfiguration())) && getMraidCreativeValidationRequired() == adExtension.getMraidCreativeValidationRequired() && getCreativeLoadingTimeout() == adExtension.getCreativeLoadingTimeout() && getCridMonitoringEnabled() == adExtension.getCridMonitoringEnabled() && hasViewabilityConfiguration() == adExtension.hasViewabilityConfiguration()) {
            return (!hasViewabilityConfiguration() || getViewabilityConfiguration().equals(adExtension.getViewabilityConfiguration())) && this.unknownFields.equals(adExtension.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public AdCacheControl getAdCacheControl() {
        AdCacheControl adCacheControlValueOf = AdCacheControl.valueOf(this.adCacheControl_);
        return adCacheControlValueOf == null ? AdCacheControl.UNRECOGNIZED : adCacheControlValueOf;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getAdCacheControlValue() {
        return this.adCacheControl_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getAdCacheMaxAge() {
        return this.adCacheMaxAge_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getAdFlexibleSize() {
        return this.adFlexibleSize_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getAdMarkupLoadingTimeout() {
        return this.adMarkupLoadingTimeout_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAsset getCloseButton() {
        ControlAsset controlAsset = this.closeButton_;
        return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAssetOrBuilder getCloseButtonOrBuilder() {
        return getCloseButton();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getCompanionSkipoffset() {
        return this.companionSkipoffset_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAsset getCountdown() {
        ControlAsset controlAsset = this.countdown_;
        return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAssetOrBuilder getCountdownOrBuilder() {
        return getCountdown();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public CreativeExtension getCreativeExtension() {
        CreativeExtension creativeExtension = this.creativeExtension_;
        return creativeExtension == null ? CreativeExtension.getDefaultInstance() : creativeExtension;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public CreativeExtensionOrBuilder getCreativeExtensionOrBuilder() {
        return getCreativeExtension();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public CreativeLoadingMethod getCreativeLoadingMethod() {
        CreativeLoadingMethod creativeLoadingMethodValueOf = CreativeLoadingMethod.valueOf(this.creativeLoadingMethod_);
        return creativeLoadingMethodValueOf == null ? CreativeLoadingMethod.UNRECOGNIZED : creativeLoadingMethodValueOf;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getCreativeLoadingMethodValue() {
        return this.creativeLoadingMethod_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getCreativeLoadingTimeout() {
        return this.creativeLoadingTimeout_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getCridMonitoringEnabled() {
        return this.cridMonitoringEnabled_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public Map<String, String> getCustomParams() {
        return getCustomParamsMap();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getCustomParamsCount() {
        return internalGetCustomParams().j().size();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public Map<String, String> getCustomParamsMap() {
        return internalGetCustomParams().j();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public String getCustomParamsOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> mapJ = internalGetCustomParams().j();
        return mapJ.containsKey(str) ? mapJ.get(str) : str2;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public String getCustomParamsOrThrow(String str) {
        str.getClass();
        Map<String, String> mapJ = internalGetCustomParams().j();
        if (mapJ.containsKey(str)) {
            return mapJ.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public Ad.Event getEvent(int i10) {
        return this.event_.get(i10);
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public EventConfiguration getEventConfiguration() {
        EventConfiguration eventConfiguration = this.eventConfiguration_;
        return eventConfiguration == null ? EventConfiguration.getDefaultInstance() : eventConfiguration;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public EventConfigurationOrBuilder getEventConfigurationOrBuilder() {
        return getEventConfiguration();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getEventCount() {
        return this.event_.size();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public List<Ad.Event> getEventList() {
        return this.event_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public Ad.EventOrBuilder getEventOrBuilder(int i10) {
        return this.event_.get(i10);
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
        return this.event_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getIgnoresSafeAreaLayoutGuide() {
        return this.ignoresSafeAreaLayoutGuide_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public int getLoadSkipoffset() {
        return this.loadSkipoffset_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getMraidCreativeValidationRequired() {
        return this.mraidCreativeValidationRequired_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<AdExtension> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public float getPlaceholderTimeout() {
        return this.placeholderTimeout_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public boolean getPreload() {
        return this.preload_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getPreloadAd() {
        return this.preloadAd_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAsset getProgress() {
        ControlAsset controlAsset = this.progress_;
        return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getProgressDuration() {
        return this.progressDuration_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAssetOrBuilder getProgressOrBuilder() {
        return getProgress();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getR1() {
        return this.r1_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getR1Delay() {
        return this.r1Delay_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getR2() {
        return this.r2_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public Rendering getRenderingConfiguration() {
        Rendering rendering = this.renderingConfiguration_;
        return rendering == null ? Rendering.getDefaultInstance() : rendering;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public RenderingOrBuilder getRenderingConfigurationOrBuilder() {
        return getRenderingConfiguration();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        boolean z10 = this.preload_;
        int iE = z10 ? CodedOutputStream.e(2, z10) + 0 : 0;
        int i11 = this.loadSkipoffset_;
        if (i11 != 0) {
            iE += CodedOutputStream.Y(3, i11);
        }
        int i12 = this.viewabilityTimeThreshold_;
        if (i12 != 0) {
            iE += CodedOutputStream.Y(4, i12);
        }
        float f10 = this.viewabilityPixelThreshold_;
        if (f10 != 0.0f) {
            iE += CodedOutputStream.r(5, f10);
        }
        float f11 = this.viewabilityDurationThreshold_;
        if (f11 != 0.0f) {
            iE += CodedOutputStream.r(6, f11);
        }
        for (int i13 = 0; i13 < this.event_.size(); i13++) {
            iE += CodedOutputStream.G(7, this.event_.get(i13));
        }
        for (Map.Entry<String, String> entry : internalGetCustomParams().j().entrySet()) {
            iE += CodedOutputStream.G(8, CustomParamsDefaultEntryHolder.defaultEntry.newBuilderForType().p(entry.getKey()).s(entry.getValue()).build());
        }
        int i14 = this.skipoffset_;
        if (i14 != 0) {
            iE += CodedOutputStream.Y(9, i14);
        }
        int i15 = this.companionSkipoffset_;
        if (i15 != 0) {
            iE += CodedOutputStream.Y(10, i15);
        }
        boolean z11 = this.useNativeClose_;
        if (z11) {
            iE += CodedOutputStream.e(11, z11);
        }
        boolean z12 = this.r1_;
        if (z12) {
            iE += CodedOutputStream.e(12, z12);
        }
        boolean z13 = this.r2_;
        if (z13) {
            iE += CodedOutputStream.e(13, z13);
        }
        if (this.countdown_ != null) {
            iE += CodedOutputStream.G(14, getCountdown());
        }
        if (this.closeButton_ != null) {
            iE += CodedOutputStream.G(15, getCloseButton());
        }
        boolean z14 = this.ignoresSafeAreaLayoutGuide_;
        if (z14) {
            iE += CodedOutputStream.e(16, z14);
        }
        if (!getStoreUrlBytes().isEmpty()) {
            iE += j0.computeStringSize(17, this.storeUrl_);
        }
        if (this.progress_ != null) {
            iE += CodedOutputStream.G(18, getProgress());
        }
        int i16 = this.progressDuration_;
        if (i16 != 0) {
            iE += CodedOutputStream.Y(19, i16);
        }
        boolean z15 = this.viewabilityIgnoreWindowFocus_;
        if (z15) {
            iE += CodedOutputStream.e(20, z15);
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            iE += CodedOutputStream.l(21, this.adCacheControl_);
        }
        int i17 = this.adCacheMaxAge_;
        if (i17 != 0) {
            iE += CodedOutputStream.Y(22, i17);
        }
        int i18 = this.r1Delay_;
        if (i18 != 0) {
            iE += CodedOutputStream.Y(23, i18);
        }
        int i19 = this.adMarkupLoadingTimeout_;
        if (i19 != 0) {
            iE += CodedOutputStream.Y(24, i19);
        }
        boolean z16 = this.useEmbeddedBrowser_;
        if (z16) {
            iE += CodedOutputStream.e(25, z16);
        }
        boolean z17 = this.preloadAd_;
        if (z17) {
            iE += CodedOutputStream.e(26, z17);
        }
        if (this.creativeLoadingMethod_ != CreativeLoadingMethod.FullLoad.getNumber()) {
            iE += CodedOutputStream.l(27, this.creativeLoadingMethod_);
        }
        float f12 = this.placeholderTimeout_;
        if (f12 != 0.0f) {
            iE += CodedOutputStream.r(28, f12);
        }
        if (this.eventConfiguration_ != null) {
            iE += CodedOutputStream.G(29, getEventConfiguration());
        }
        boolean z18 = this.viewabilityIgnoreOverlap_;
        if (z18) {
            iE += CodedOutputStream.e(30, z18);
        }
        if (this.creativeExtension_ != null) {
            iE += CodedOutputStream.G(31, getCreativeExtension());
        }
        boolean z19 = this.adFlexibleSize_;
        if (z19) {
            iE += CodedOutputStream.e(32, z19);
        }
        if (this.renderingConfiguration_ != null) {
            iE += CodedOutputStream.G(33, getRenderingConfiguration());
        }
        boolean z20 = this.mraidCreativeValidationRequired_;
        if (z20) {
            iE += CodedOutputStream.e(34, z20);
        }
        int i20 = this.creativeLoadingTimeout_;
        if (i20 != 0) {
            iE += CodedOutputStream.x(35, i20);
        }
        boolean z21 = this.cridMonitoringEnabled_;
        if (z21) {
            iE += CodedOutputStream.e(36, z21);
        }
        if ((this.bitField0_ & 1) != 0) {
            iE += CodedOutputStream.G(37, getViewabilityConfiguration());
        }
        int serializedSize = iE + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getSkipoffset() {
        return this.skipoffset_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public String getStoreUrl() {
        Object obj = this.storeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.storeUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ByteString getStoreUrlBytes() {
        Object obj = this.storeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.storeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getUseEmbeddedBrowser() {
        return this.useEmbeddedBrowser_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getUseNativeClose() {
        return this.useNativeClose_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ViewabilityConfiguration getViewabilityConfiguration() {
        ViewabilityConfiguration viewabilityConfiguration = this.viewabilityConfiguration_;
        return viewabilityConfiguration == null ? ViewabilityConfiguration.getDefaultInstance() : viewabilityConfiguration;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ViewabilityConfigurationOrBuilder getViewabilityConfigurationOrBuilder() {
        ViewabilityConfiguration viewabilityConfiguration = this.viewabilityConfiguration_;
        return viewabilityConfiguration == null ? ViewabilityConfiguration.getDefaultInstance() : viewabilityConfiguration;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public float getViewabilityDurationThreshold() {
        return this.viewabilityDurationThreshold_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public boolean getViewabilityIgnoreOverlap() {
        return this.viewabilityIgnoreOverlap_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getViewabilityIgnoreWindowFocus() {
        return this.viewabilityIgnoreWindowFocus_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public float getViewabilityPixelThreshold() {
        return this.viewabilityPixelThreshold_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public int getViewabilityTimeThreshold() {
        return this.viewabilityTimeThreshold_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasCloseButton() {
        return this.closeButton_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasCountdown() {
        return this.countdown_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public boolean hasCreativeExtension() {
        return this.creativeExtension_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasEventConfiguration() {
        return this.eventConfiguration_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasProgress() {
        return this.progress_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasRenderingConfiguration() {
        return this.renderingConfiguration_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasViewabilityConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 2) * 53) + l0.d(getPreload())) * 37) + 3) * 53) + getLoadSkipoffset()) * 37) + 4) * 53) + getViewabilityTimeThreshold()) * 37) + 5) * 53) + Float.floatToIntBits(getViewabilityPixelThreshold())) * 37) + 6) * 53) + Float.floatToIntBits(getViewabilityDurationThreshold());
        if (getEventCount() > 0) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getEventList().hashCode();
        }
        if (!internalGetCustomParams().j().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + internalGetCustomParams().hashCode();
        }
        int skipoffset = (((((((((((((((((((iHashCode * 37) + 9) * 53) + getSkipoffset()) * 37) + 10) * 53) + getCompanionSkipoffset()) * 37) + 11) * 53) + l0.d(getUseNativeClose())) * 37) + 12) * 53) + l0.d(getR1())) * 37) + 13) * 53) + l0.d(getR2());
        if (hasCountdown()) {
            skipoffset = (((skipoffset * 37) + 14) * 53) + getCountdown().hashCode();
        }
        if (hasCloseButton()) {
            skipoffset = (((skipoffset * 37) + 15) * 53) + getCloseButton().hashCode();
        }
        int iD = (((((((skipoffset * 37) + 16) * 53) + l0.d(getIgnoresSafeAreaLayoutGuide())) * 37) + 17) * 53) + getStoreUrl().hashCode();
        if (hasProgress()) {
            iD = (((iD * 37) + 18) * 53) + getProgress().hashCode();
        }
        int progressDuration = (((((((((((((((((((((((((((((((((((((((iD * 37) + 19) * 53) + getProgressDuration()) * 37) + 20) * 53) + l0.d(getViewabilityIgnoreWindowFocus())) * 37) + 21) * 53) + this.adCacheControl_) * 37) + 22) * 53) + getAdCacheMaxAge()) * 37) + 23) * 53) + getR1Delay()) * 37) + 24) * 53) + getAdMarkupLoadingTimeout()) * 37) + 25) * 53) + l0.d(getUseEmbeddedBrowser())) * 37) + 26) * 53) + l0.d(getPreloadAd())) * 37) + 27) * 53) + this.creativeLoadingMethod_) * 37) + 28) * 53) + Float.floatToIntBits(getPlaceholderTimeout());
        if (hasEventConfiguration()) {
            progressDuration = (((progressDuration * 37) + 29) * 53) + getEventConfiguration().hashCode();
        }
        int iD2 = (((progressDuration * 37) + 30) * 53) + l0.d(getViewabilityIgnoreOverlap());
        if (hasCreativeExtension()) {
            iD2 = (((iD2 * 37) + 31) * 53) + getCreativeExtension().hashCode();
        }
        int iD3 = (((iD2 * 37) + 32) * 53) + l0.d(getAdFlexibleSize());
        if (hasRenderingConfiguration()) {
            iD3 = (((iD3 * 37) + 33) * 53) + getRenderingConfiguration().hashCode();
        }
        int iD4 = (((((((((((iD3 * 37) + 34) * 53) + l0.d(getMraidCreativeValidationRequired())) * 37) + 35) * 53) + getCreativeLoadingTimeout()) * 37) + 36) * 53) + l0.d(getCridMonitoringEnabled());
        if (hasViewabilityConfiguration()) {
            iD4 = (((iD4 * 37) + 37) * 53) + getViewabilityConfiguration().hashCode();
        }
        int iHashCode2 = (iD4 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_fieldAccessorTable.d(AdExtension.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.j0
    protected y0 internalGetMapField(int i10) {
        if (i10 == 8) {
            return internalGetCustomParams();
        }
        throw new RuntimeException("Invalid map field number: " + i10);
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.j0
    protected Object newInstance(j0.g gVar) {
        return new AdExtension();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z10 = this.preload_;
        if (z10) {
            codedOutputStream.n0(2, z10);
        }
        int i10 = this.loadSkipoffset_;
        if (i10 != 0) {
            codedOutputStream.c1(3, i10);
        }
        int i11 = this.viewabilityTimeThreshold_;
        if (i11 != 0) {
            codedOutputStream.c1(4, i11);
        }
        float f10 = this.viewabilityPixelThreshold_;
        if (f10 != 0.0f) {
            codedOutputStream.B0(5, f10);
        }
        float f11 = this.viewabilityDurationThreshold_;
        if (f11 != 0.0f) {
            codedOutputStream.B0(6, f11);
        }
        for (int i12 = 0; i12 < this.event_.size(); i12++) {
            codedOutputStream.L0(7, this.event_.get(i12));
        }
        j0.serializeStringMapTo(codedOutputStream, internalGetCustomParams(), CustomParamsDefaultEntryHolder.defaultEntry, 8);
        int i13 = this.skipoffset_;
        if (i13 != 0) {
            codedOutputStream.c1(9, i13);
        }
        int i14 = this.companionSkipoffset_;
        if (i14 != 0) {
            codedOutputStream.c1(10, i14);
        }
        boolean z11 = this.useNativeClose_;
        if (z11) {
            codedOutputStream.n0(11, z11);
        }
        boolean z12 = this.r1_;
        if (z12) {
            codedOutputStream.n0(12, z12);
        }
        boolean z13 = this.r2_;
        if (z13) {
            codedOutputStream.n0(13, z13);
        }
        if (this.countdown_ != null) {
            codedOutputStream.L0(14, getCountdown());
        }
        if (this.closeButton_ != null) {
            codedOutputStream.L0(15, getCloseButton());
        }
        boolean z14 = this.ignoresSafeAreaLayoutGuide_;
        if (z14) {
            codedOutputStream.n0(16, z14);
        }
        if (!getStoreUrlBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 17, this.storeUrl_);
        }
        if (this.progress_ != null) {
            codedOutputStream.L0(18, getProgress());
        }
        int i15 = this.progressDuration_;
        if (i15 != 0) {
            codedOutputStream.c1(19, i15);
        }
        boolean z15 = this.viewabilityIgnoreWindowFocus_;
        if (z15) {
            codedOutputStream.n0(20, z15);
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            codedOutputStream.v0(21, this.adCacheControl_);
        }
        int i16 = this.adCacheMaxAge_;
        if (i16 != 0) {
            codedOutputStream.c1(22, i16);
        }
        int i17 = this.r1Delay_;
        if (i17 != 0) {
            codedOutputStream.c1(23, i17);
        }
        int i18 = this.adMarkupLoadingTimeout_;
        if (i18 != 0) {
            codedOutputStream.c1(24, i18);
        }
        boolean z16 = this.useEmbeddedBrowser_;
        if (z16) {
            codedOutputStream.n0(25, z16);
        }
        boolean z17 = this.preloadAd_;
        if (z17) {
            codedOutputStream.n0(26, z17);
        }
        if (this.creativeLoadingMethod_ != CreativeLoadingMethod.FullLoad.getNumber()) {
            codedOutputStream.v0(27, this.creativeLoadingMethod_);
        }
        float f12 = this.placeholderTimeout_;
        if (f12 != 0.0f) {
            codedOutputStream.B0(28, f12);
        }
        if (this.eventConfiguration_ != null) {
            codedOutputStream.L0(29, getEventConfiguration());
        }
        boolean z18 = this.viewabilityIgnoreOverlap_;
        if (z18) {
            codedOutputStream.n0(30, z18);
        }
        if (this.creativeExtension_ != null) {
            codedOutputStream.L0(31, getCreativeExtension());
        }
        boolean z19 = this.adFlexibleSize_;
        if (z19) {
            codedOutputStream.n0(32, z19);
        }
        if (this.renderingConfiguration_ != null) {
            codedOutputStream.L0(33, getRenderingConfiguration());
        }
        boolean z20 = this.mraidCreativeValidationRequired_;
        if (z20) {
            codedOutputStream.n0(34, z20);
        }
        int i19 = this.creativeLoadingTimeout_;
        if (i19 != 0) {
            codedOutputStream.H0(35, i19);
        }
        boolean z21 = this.cridMonitoringEnabled_;
        if (z21) {
            codedOutputStream.n0(36, z21);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.L0(37, getViewabilityConfiguration());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements AdExtensionOrBuilder {
        private int adCacheControl_;
        private int adCacheMaxAge_;
        private boolean adFlexibleSize_;
        private int adMarkupLoadingTimeout_;
        private int bitField0_;
        private e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> closeButtonBuilder_;
        private ControlAsset closeButton_;
        private int companionSkipoffset_;
        private e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> countdownBuilder_;
        private ControlAsset countdown_;
        private e2<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> creativeExtensionBuilder_;
        private CreativeExtension creativeExtension_;
        private int creativeLoadingMethod_;
        private int creativeLoadingTimeout_;
        private boolean cridMonitoringEnabled_;
        private y0<String, String> customParams_;
        private z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> eventBuilder_;
        private e2<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> eventConfigurationBuilder_;
        private EventConfiguration eventConfiguration_;
        private List<Ad.Event> event_;
        private boolean ignoresSafeAreaLayoutGuide_;
        private int loadSkipoffset_;
        private boolean mraidCreativeValidationRequired_;
        private float placeholderTimeout_;
        private boolean preloadAd_;
        private boolean preload_;
        private e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> progressBuilder_;
        private int progressDuration_;
        private ControlAsset progress_;
        private int r1Delay_;
        private boolean r1_;
        private boolean r2_;
        private e2<Rendering, Rendering.Builder, RenderingOrBuilder> renderingConfigurationBuilder_;
        private Rendering renderingConfiguration_;
        private int skipoffset_;
        private Object storeUrl_;
        private boolean useEmbeddedBrowser_;
        private boolean useNativeClose_;
        private e2<ViewabilityConfiguration, ViewabilityConfiguration.Builder, ViewabilityConfigurationOrBuilder> viewabilityConfigurationBuilder_;
        private ViewabilityConfiguration viewabilityConfiguration_;
        private float viewabilityDurationThreshold_;
        private boolean viewabilityIgnoreOverlap_;
        private boolean viewabilityIgnoreWindowFocus_;
        private float viewabilityPixelThreshold_;
        private int viewabilityTimeThreshold_;

        private void ensureEventIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.event_ = new ArrayList(this.event_);
                this.bitField0_ |= 1;
            }
        }

        private e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> getCloseButtonFieldBuilder() {
            if (this.closeButtonBuilder_ == null) {
                this.closeButtonBuilder_ = new e2<>(getCloseButton(), getParentForChildren(), isClean());
                this.closeButton_ = null;
            }
            return this.closeButtonBuilder_;
        }

        private e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> getCountdownFieldBuilder() {
            if (this.countdownBuilder_ == null) {
                this.countdownBuilder_ = new e2<>(getCountdown(), getParentForChildren(), isClean());
                this.countdown_ = null;
            }
            return this.countdownBuilder_;
        }

        private e2<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> getCreativeExtensionFieldBuilder() {
            if (this.creativeExtensionBuilder_ == null) {
                this.creativeExtensionBuilder_ = new e2<>(getCreativeExtension(), getParentForChildren(), isClean());
                this.creativeExtension_ = null;
            }
            return this.creativeExtensionBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_descriptor;
        }

        private e2<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> getEventConfigurationFieldBuilder() {
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfigurationBuilder_ = new e2<>(getEventConfiguration(), getParentForChildren(), isClean());
                this.eventConfiguration_ = null;
            }
            return this.eventConfigurationBuilder_;
        }

        private z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> getEventFieldBuilder() {
            if (this.eventBuilder_ == null) {
                this.eventBuilder_ = new z1<>(this.event_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.event_ = null;
            }
            return this.eventBuilder_;
        }

        private e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> getProgressFieldBuilder() {
            if (this.progressBuilder_ == null) {
                this.progressBuilder_ = new e2<>(getProgress(), getParentForChildren(), isClean());
                this.progress_ = null;
            }
            return this.progressBuilder_;
        }

        private e2<Rendering, Rendering.Builder, RenderingOrBuilder> getRenderingConfigurationFieldBuilder() {
            if (this.renderingConfigurationBuilder_ == null) {
                this.renderingConfigurationBuilder_ = new e2<>(getRenderingConfiguration(), getParentForChildren(), isClean());
                this.renderingConfiguration_ = null;
            }
            return this.renderingConfigurationBuilder_;
        }

        private e2<ViewabilityConfiguration, ViewabilityConfiguration.Builder, ViewabilityConfigurationOrBuilder> getViewabilityConfigurationFieldBuilder() {
            if (this.viewabilityConfigurationBuilder_ == null) {
                this.viewabilityConfigurationBuilder_ = new e2<>(getViewabilityConfiguration(), getParentForChildren(), isClean());
                this.viewabilityConfiguration_ = null;
            }
            return this.viewabilityConfigurationBuilder_;
        }

        private y0<String, String> internalGetCustomParams() {
            y0<String, String> y0Var = this.customParams_;
            return y0Var == null ? y0.h(CustomParamsDefaultEntryHolder.defaultEntry) : y0Var;
        }

        private y0<String, String> internalGetMutableCustomParams() {
            onChanged();
            if (this.customParams_ == null) {
                this.customParams_ = y0.q(CustomParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.customParams_.n()) {
                this.customParams_ = this.customParams_.g();
            }
            return this.customParams_;
        }

        private void maybeForceBuilderInitialization() {
            if (j0.alwaysUseFieldBuilders) {
                getEventFieldBuilder();
                getViewabilityConfigurationFieldBuilder();
            }
        }

        public Builder addAllEvent(Iterable<? extends Ad.Event> iterable) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                ensureEventIsMutable();
                a.AbstractC0128a.addAll((Iterable) iterable, (List) this.event_);
                onChanged();
            } else {
                z1Var.a(iterable);
            }
            return this;
        }

        public Builder addEvent(Ad.Event event) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.add(event);
                onChanged();
            } else {
                z1Var.e(event);
            }
            return this;
        }

        public Ad.Event.Builder addEventBuilder() {
            return (Ad.Event.Builder) getEventFieldBuilder().c(Ad.Event.getDefaultInstance());
        }

        public Builder clearAdCacheControl() {
            this.adCacheControl_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdCacheMaxAge() {
            this.adCacheMaxAge_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdFlexibleSize() {
            this.adFlexibleSize_ = false;
            onChanged();
            return this;
        }

        public Builder clearAdMarkupLoadingTimeout() {
            this.adMarkupLoadingTimeout_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCloseButton() {
            if (this.closeButtonBuilder_ == null) {
                this.closeButton_ = null;
                onChanged();
            } else {
                this.closeButton_ = null;
                this.closeButtonBuilder_ = null;
            }
            return this;
        }

        public Builder clearCompanionSkipoffset() {
            this.companionSkipoffset_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCountdown() {
            if (this.countdownBuilder_ == null) {
                this.countdown_ = null;
                onChanged();
            } else {
                this.countdown_ = null;
                this.countdownBuilder_ = null;
            }
            return this;
        }

        @Deprecated
        public Builder clearCreativeExtension() {
            if (this.creativeExtensionBuilder_ == null) {
                this.creativeExtension_ = null;
                onChanged();
            } else {
                this.creativeExtension_ = null;
                this.creativeExtensionBuilder_ = null;
            }
            return this;
        }

        public Builder clearCreativeLoadingMethod() {
            this.creativeLoadingMethod_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCreativeLoadingTimeout() {
            this.creativeLoadingTimeout_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCridMonitoringEnabled() {
            this.cridMonitoringEnabled_ = false;
            onChanged();
            return this;
        }

        public Builder clearCustomParams() {
            internalGetMutableCustomParams().m().clear();
            return this;
        }

        public Builder clearEvent() {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                this.event_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        public Builder clearEventConfiguration() {
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfiguration_ = null;
                onChanged();
            } else {
                this.eventConfiguration_ = null;
                this.eventConfigurationBuilder_ = null;
            }
            return this;
        }

        public Builder clearIgnoresSafeAreaLayoutGuide() {
            this.ignoresSafeAreaLayoutGuide_ = false;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder clearLoadSkipoffset() {
            this.loadSkipoffset_ = 0;
            onChanged();
            return this;
        }

        public Builder clearMraidCreativeValidationRequired() {
            this.mraidCreativeValidationRequired_ = false;
            onChanged();
            return this;
        }

        public Builder clearPlaceholderTimeout() {
            this.placeholderTimeout_ = 0.0f;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder clearPreload() {
            this.preload_ = false;
            onChanged();
            return this;
        }

        public Builder clearPreloadAd() {
            this.preloadAd_ = false;
            onChanged();
            return this;
        }

        public Builder clearProgress() {
            if (this.progressBuilder_ == null) {
                this.progress_ = null;
                onChanged();
            } else {
                this.progress_ = null;
                this.progressBuilder_ = null;
            }
            return this;
        }

        public Builder clearProgressDuration() {
            this.progressDuration_ = 0;
            onChanged();
            return this;
        }

        public Builder clearR1() {
            this.r1_ = false;
            onChanged();
            return this;
        }

        public Builder clearR1Delay() {
            this.r1Delay_ = 0;
            onChanged();
            return this;
        }

        public Builder clearR2() {
            this.r2_ = false;
            onChanged();
            return this;
        }

        public Builder clearRenderingConfiguration() {
            if (this.renderingConfigurationBuilder_ == null) {
                this.renderingConfiguration_ = null;
                onChanged();
            } else {
                this.renderingConfiguration_ = null;
                this.renderingConfigurationBuilder_ = null;
            }
            return this;
        }

        public Builder clearSkipoffset() {
            this.skipoffset_ = 0;
            onChanged();
            return this;
        }

        public Builder clearStoreUrl() {
            this.storeUrl_ = AdExtension.getDefaultInstance().getStoreUrl();
            onChanged();
            return this;
        }

        public Builder clearUseEmbeddedBrowser() {
            this.useEmbeddedBrowser_ = false;
            onChanged();
            return this;
        }

        public Builder clearUseNativeClose() {
            this.useNativeClose_ = false;
            onChanged();
            return this;
        }

        public Builder clearViewabilityConfiguration() {
            e2<ViewabilityConfiguration, ViewabilityConfiguration.Builder, ViewabilityConfigurationOrBuilder> e2Var = this.viewabilityConfigurationBuilder_;
            if (e2Var == null) {
                this.viewabilityConfiguration_ = null;
                onChanged();
            } else {
                e2Var.b();
            }
            this.bitField0_ &= -5;
            return this;
        }

        @Deprecated
        public Builder clearViewabilityDurationThreshold() {
            this.viewabilityDurationThreshold_ = 0.0f;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder clearViewabilityIgnoreOverlap() {
            this.viewabilityIgnoreOverlap_ = false;
            onChanged();
            return this;
        }

        public Builder clearViewabilityIgnoreWindowFocus() {
            this.viewabilityIgnoreWindowFocus_ = false;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder clearViewabilityPixelThreshold() {
            this.viewabilityPixelThreshold_ = 0.0f;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder clearViewabilityTimeThreshold() {
            this.viewabilityTimeThreshold_ = 0;
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean containsCustomParams(String str) {
            str.getClass();
            return internalGetCustomParams().j().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public AdCacheControl getAdCacheControl() {
            AdCacheControl adCacheControlValueOf = AdCacheControl.valueOf(this.adCacheControl_);
            return adCacheControlValueOf == null ? AdCacheControl.UNRECOGNIZED : adCacheControlValueOf;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getAdCacheControlValue() {
            return this.adCacheControl_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getAdCacheMaxAge() {
            return this.adCacheMaxAge_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getAdFlexibleSize() {
            return this.adFlexibleSize_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getAdMarkupLoadingTimeout() {
            return this.adMarkupLoadingTimeout_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAsset getCloseButton() {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.closeButtonBuilder_;
            if (e2Var != null) {
                return (ControlAsset) e2Var.e();
            }
            ControlAsset controlAsset = this.closeButton_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        public ControlAsset.Builder getCloseButtonBuilder() {
            onChanged();
            return (ControlAsset.Builder) getCloseButtonFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAssetOrBuilder getCloseButtonOrBuilder() {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.closeButtonBuilder_;
            if (e2Var != null) {
                return (ControlAssetOrBuilder) e2Var.f();
            }
            ControlAsset controlAsset = this.closeButton_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getCompanionSkipoffset() {
            return this.companionSkipoffset_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAsset getCountdown() {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.countdownBuilder_;
            if (e2Var != null) {
                return (ControlAsset) e2Var.e();
            }
            ControlAsset controlAsset = this.countdown_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        public ControlAsset.Builder getCountdownBuilder() {
            onChanged();
            return (ControlAsset.Builder) getCountdownFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAssetOrBuilder getCountdownOrBuilder() {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.countdownBuilder_;
            if (e2Var != null) {
                return (ControlAssetOrBuilder) e2Var.f();
            }
            ControlAsset controlAsset = this.countdown_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public CreativeExtension getCreativeExtension() {
            e2<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> e2Var = this.creativeExtensionBuilder_;
            if (e2Var != null) {
                return (CreativeExtension) e2Var.e();
            }
            CreativeExtension creativeExtension = this.creativeExtension_;
            return creativeExtension == null ? CreativeExtension.getDefaultInstance() : creativeExtension;
        }

        @Deprecated
        public CreativeExtension.Builder getCreativeExtensionBuilder() {
            onChanged();
            return (CreativeExtension.Builder) getCreativeExtensionFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public CreativeExtensionOrBuilder getCreativeExtensionOrBuilder() {
            e2<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> e2Var = this.creativeExtensionBuilder_;
            if (e2Var != null) {
                return (CreativeExtensionOrBuilder) e2Var.f();
            }
            CreativeExtension creativeExtension = this.creativeExtension_;
            return creativeExtension == null ? CreativeExtension.getDefaultInstance() : creativeExtension;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public CreativeLoadingMethod getCreativeLoadingMethod() {
            CreativeLoadingMethod creativeLoadingMethodValueOf = CreativeLoadingMethod.valueOf(this.creativeLoadingMethod_);
            return creativeLoadingMethodValueOf == null ? CreativeLoadingMethod.UNRECOGNIZED : creativeLoadingMethodValueOf;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getCreativeLoadingMethodValue() {
            return this.creativeLoadingMethod_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getCreativeLoadingTimeout() {
            return this.creativeLoadingTimeout_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getCridMonitoringEnabled() {
            return this.cridMonitoringEnabled_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public Map<String, String> getCustomParams() {
            return getCustomParamsMap();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getCustomParamsCount() {
            return internalGetCustomParams().j().size();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public Map<String, String> getCustomParamsMap() {
            return internalGetCustomParams().j();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public String getCustomParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> mapJ = internalGetCustomParams().j();
            return mapJ.containsKey(str) ? mapJ.get(str) : str2;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public String getCustomParamsOrThrow(String str) {
            str.getClass();
            Map<String, String> mapJ = internalGetCustomParams().j();
            if (mapJ.containsKey(str)) {
                return mapJ.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_descriptor;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public Ad.Event getEvent(int i10) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            return z1Var == null ? this.event_.get(i10) : (Ad.Event) z1Var.n(i10);
        }

        public Ad.Event.Builder getEventBuilder(int i10) {
            return (Ad.Event.Builder) getEventFieldBuilder().k(i10);
        }

        public List<Ad.Event.Builder> getEventBuilderList() {
            return getEventFieldBuilder().l();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public EventConfiguration getEventConfiguration() {
            e2<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> e2Var = this.eventConfigurationBuilder_;
            if (e2Var != null) {
                return (EventConfiguration) e2Var.e();
            }
            EventConfiguration eventConfiguration = this.eventConfiguration_;
            return eventConfiguration == null ? EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        public EventConfiguration.Builder getEventConfigurationBuilder() {
            onChanged();
            return (EventConfiguration.Builder) getEventConfigurationFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public EventConfigurationOrBuilder getEventConfigurationOrBuilder() {
            e2<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> e2Var = this.eventConfigurationBuilder_;
            if (e2Var != null) {
                return (EventConfigurationOrBuilder) e2Var.f();
            }
            EventConfiguration eventConfiguration = this.eventConfiguration_;
            return eventConfiguration == null ? EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getEventCount() {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            return z1Var == null ? this.event_.size() : z1Var.m();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public List<Ad.Event> getEventList() {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.event_) : z1Var.p();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public Ad.EventOrBuilder getEventOrBuilder(int i10) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            return z1Var == null ? this.event_.get(i10) : (Ad.EventOrBuilder) z1Var.q(i10);
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.event_);
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getIgnoresSafeAreaLayoutGuide() {
            return this.ignoresSafeAreaLayoutGuide_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public int getLoadSkipoffset() {
            return this.loadSkipoffset_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getMraidCreativeValidationRequired() {
            return this.mraidCreativeValidationRequired_;
        }

        @Deprecated
        public Map<String, String> getMutableCustomParams() {
            return internalGetMutableCustomParams().m();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public float getPlaceholderTimeout() {
            return this.placeholderTimeout_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public boolean getPreload() {
            return this.preload_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getPreloadAd() {
            return this.preloadAd_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAsset getProgress() {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.progressBuilder_;
            if (e2Var != null) {
                return (ControlAsset) e2Var.e();
            }
            ControlAsset controlAsset = this.progress_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        public ControlAsset.Builder getProgressBuilder() {
            onChanged();
            return (ControlAsset.Builder) getProgressFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getProgressDuration() {
            return this.progressDuration_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAssetOrBuilder getProgressOrBuilder() {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.progressBuilder_;
            if (e2Var != null) {
                return (ControlAssetOrBuilder) e2Var.f();
            }
            ControlAsset controlAsset = this.progress_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getR1() {
            return this.r1_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getR1Delay() {
            return this.r1Delay_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getR2() {
            return this.r2_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public Rendering getRenderingConfiguration() {
            e2<Rendering, Rendering.Builder, RenderingOrBuilder> e2Var = this.renderingConfigurationBuilder_;
            if (e2Var != null) {
                return (Rendering) e2Var.e();
            }
            Rendering rendering = this.renderingConfiguration_;
            return rendering == null ? Rendering.getDefaultInstance() : rendering;
        }

        public Rendering.Builder getRenderingConfigurationBuilder() {
            onChanged();
            return (Rendering.Builder) getRenderingConfigurationFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public RenderingOrBuilder getRenderingConfigurationOrBuilder() {
            e2<Rendering, Rendering.Builder, RenderingOrBuilder> e2Var = this.renderingConfigurationBuilder_;
            if (e2Var != null) {
                return (RenderingOrBuilder) e2Var.f();
            }
            Rendering rendering = this.renderingConfiguration_;
            return rendering == null ? Rendering.getDefaultInstance() : rendering;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getSkipoffset() {
            return this.skipoffset_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public String getStoreUrl() {
            Object obj = this.storeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ByteString getStoreUrlBytes() {
            Object obj = this.storeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getUseEmbeddedBrowser() {
            return this.useEmbeddedBrowser_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getUseNativeClose() {
            return this.useNativeClose_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ViewabilityConfiguration getViewabilityConfiguration() {
            e2<ViewabilityConfiguration, ViewabilityConfiguration.Builder, ViewabilityConfigurationOrBuilder> e2Var = this.viewabilityConfigurationBuilder_;
            if (e2Var != null) {
                return (ViewabilityConfiguration) e2Var.e();
            }
            ViewabilityConfiguration viewabilityConfiguration = this.viewabilityConfiguration_;
            return viewabilityConfiguration == null ? ViewabilityConfiguration.getDefaultInstance() : viewabilityConfiguration;
        }

        public ViewabilityConfiguration.Builder getViewabilityConfigurationBuilder() {
            this.bitField0_ |= 4;
            onChanged();
            return (ViewabilityConfiguration.Builder) getViewabilityConfigurationFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ViewabilityConfigurationOrBuilder getViewabilityConfigurationOrBuilder() {
            e2<ViewabilityConfiguration, ViewabilityConfiguration.Builder, ViewabilityConfigurationOrBuilder> e2Var = this.viewabilityConfigurationBuilder_;
            if (e2Var != null) {
                return (ViewabilityConfigurationOrBuilder) e2Var.f();
            }
            ViewabilityConfiguration viewabilityConfiguration = this.viewabilityConfiguration_;
            return viewabilityConfiguration == null ? ViewabilityConfiguration.getDefaultInstance() : viewabilityConfiguration;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public float getViewabilityDurationThreshold() {
            return this.viewabilityDurationThreshold_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public boolean getViewabilityIgnoreOverlap() {
            return this.viewabilityIgnoreOverlap_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getViewabilityIgnoreWindowFocus() {
            return this.viewabilityIgnoreWindowFocus_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public float getViewabilityPixelThreshold() {
            return this.viewabilityPixelThreshold_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public int getViewabilityTimeThreshold() {
            return this.viewabilityTimeThreshold_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasCloseButton() {
            return (this.closeButtonBuilder_ == null && this.closeButton_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasCountdown() {
            return (this.countdownBuilder_ == null && this.countdown_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public boolean hasCreativeExtension() {
            return (this.creativeExtensionBuilder_ == null && this.creativeExtension_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasEventConfiguration() {
            return (this.eventConfigurationBuilder_ == null && this.eventConfiguration_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasProgress() {
            return (this.progressBuilder_ == null && this.progress_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasRenderingConfiguration() {
            return (this.renderingConfigurationBuilder_ == null && this.renderingConfiguration_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasViewabilityConfiguration() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_fieldAccessorTable.d(AdExtension.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected y0 internalGetMapField(int i10) {
            if (i10 == 8) {
                return internalGetCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.j0.b
        protected y0 internalGetMutableMapField(int i10) {
            if (i10 == 8) {
                return internalGetMutableCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeCloseButton(ControlAsset controlAsset) {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.closeButtonBuilder_;
            if (e2Var == null) {
                ControlAsset controlAsset2 = this.closeButton_;
                if (controlAsset2 != null) {
                    this.closeButton_ = ControlAsset.newBuilder(controlAsset2).mergeFrom(controlAsset).buildPartial();
                } else {
                    this.closeButton_ = controlAsset;
                }
                onChanged();
            } else {
                e2Var.g(controlAsset);
            }
            return this;
        }

        public Builder mergeCountdown(ControlAsset controlAsset) {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.countdownBuilder_;
            if (e2Var == null) {
                ControlAsset controlAsset2 = this.countdown_;
                if (controlAsset2 != null) {
                    this.countdown_ = ControlAsset.newBuilder(controlAsset2).mergeFrom(controlAsset).buildPartial();
                } else {
                    this.countdown_ = controlAsset;
                }
                onChanged();
            } else {
                e2Var.g(controlAsset);
            }
            return this;
        }

        @Deprecated
        public Builder mergeCreativeExtension(CreativeExtension creativeExtension) {
            e2<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> e2Var = this.creativeExtensionBuilder_;
            if (e2Var == null) {
                CreativeExtension creativeExtension2 = this.creativeExtension_;
                if (creativeExtension2 != null) {
                    this.creativeExtension_ = CreativeExtension.newBuilder(creativeExtension2).mergeFrom(creativeExtension).buildPartial();
                } else {
                    this.creativeExtension_ = creativeExtension;
                }
                onChanged();
            } else {
                e2Var.g(creativeExtension);
            }
            return this;
        }

        public Builder mergeEventConfiguration(EventConfiguration eventConfiguration) {
            e2<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> e2Var = this.eventConfigurationBuilder_;
            if (e2Var == null) {
                EventConfiguration eventConfiguration2 = this.eventConfiguration_;
                if (eventConfiguration2 != null) {
                    this.eventConfiguration_ = EventConfiguration.newBuilder(eventConfiguration2).mergeFrom(eventConfiguration).buildPartial();
                } else {
                    this.eventConfiguration_ = eventConfiguration;
                }
                onChanged();
            } else {
                e2Var.g(eventConfiguration);
            }
            return this;
        }

        public Builder mergeProgress(ControlAsset controlAsset) {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.progressBuilder_;
            if (e2Var == null) {
                ControlAsset controlAsset2 = this.progress_;
                if (controlAsset2 != null) {
                    this.progress_ = ControlAsset.newBuilder(controlAsset2).mergeFrom(controlAsset).buildPartial();
                } else {
                    this.progress_ = controlAsset;
                }
                onChanged();
            } else {
                e2Var.g(controlAsset);
            }
            return this;
        }

        public Builder mergeRenderingConfiguration(Rendering rendering) {
            e2<Rendering, Rendering.Builder, RenderingOrBuilder> e2Var = this.renderingConfigurationBuilder_;
            if (e2Var == null) {
                Rendering rendering2 = this.renderingConfiguration_;
                if (rendering2 != null) {
                    this.renderingConfiguration_ = Rendering.newBuilder(rendering2).mergeFrom(rendering).buildPartial();
                } else {
                    this.renderingConfiguration_ = rendering;
                }
                onChanged();
            } else {
                e2Var.g(rendering);
            }
            return this;
        }

        public Builder mergeViewabilityConfiguration(ViewabilityConfiguration viewabilityConfiguration) {
            ViewabilityConfiguration viewabilityConfiguration2;
            e2<ViewabilityConfiguration, ViewabilityConfiguration.Builder, ViewabilityConfigurationOrBuilder> e2Var = this.viewabilityConfigurationBuilder_;
            if (e2Var == null) {
                if ((this.bitField0_ & 4) == 0 || (viewabilityConfiguration2 = this.viewabilityConfiguration_) == null || viewabilityConfiguration2 == ViewabilityConfiguration.getDefaultInstance()) {
                    this.viewabilityConfiguration_ = viewabilityConfiguration;
                } else {
                    this.viewabilityConfiguration_ = ViewabilityConfiguration.newBuilder(this.viewabilityConfiguration_).mergeFrom(viewabilityConfiguration).buildPartial();
                }
                onChanged();
            } else {
                e2Var.g(viewabilityConfiguration);
            }
            this.bitField0_ |= 4;
            return this;
        }

        public Builder putAllCustomParams(Map<String, String> map) {
            internalGetMutableCustomParams().m().putAll(map);
            return this;
        }

        public Builder putCustomParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableCustomParams().m().put(str, str2);
            return this;
        }

        public Builder removeCustomParams(String str) {
            str.getClass();
            internalGetMutableCustomParams().m().remove(str);
            return this;
        }

        public Builder removeEvent(int i10) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                ensureEventIsMutable();
                this.event_.remove(i10);
                onChanged();
            } else {
                z1Var.v(i10);
            }
            return this;
        }

        public Builder setAdCacheControl(AdCacheControl adCacheControl) {
            adCacheControl.getClass();
            this.adCacheControl_ = adCacheControl.getNumber();
            onChanged();
            return this;
        }

        public Builder setAdCacheControlValue(int i10) {
            this.adCacheControl_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdCacheMaxAge(int i10) {
            this.adCacheMaxAge_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdFlexibleSize(boolean z10) {
            this.adFlexibleSize_ = z10;
            onChanged();
            return this;
        }

        public Builder setAdMarkupLoadingTimeout(int i10) {
            this.adMarkupLoadingTimeout_ = i10;
            onChanged();
            return this;
        }

        public Builder setCloseButton(ControlAsset controlAsset) {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.closeButtonBuilder_;
            if (e2Var == null) {
                controlAsset.getClass();
                this.closeButton_ = controlAsset;
                onChanged();
            } else {
                e2Var.i(controlAsset);
            }
            return this;
        }

        public Builder setCompanionSkipoffset(int i10) {
            this.companionSkipoffset_ = i10;
            onChanged();
            return this;
        }

        public Builder setCountdown(ControlAsset controlAsset) {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.countdownBuilder_;
            if (e2Var == null) {
                controlAsset.getClass();
                this.countdown_ = controlAsset;
                onChanged();
            } else {
                e2Var.i(controlAsset);
            }
            return this;
        }

        @Deprecated
        public Builder setCreativeExtension(CreativeExtension creativeExtension) {
            e2<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> e2Var = this.creativeExtensionBuilder_;
            if (e2Var == null) {
                creativeExtension.getClass();
                this.creativeExtension_ = creativeExtension;
                onChanged();
            } else {
                e2Var.i(creativeExtension);
            }
            return this;
        }

        public Builder setCreativeLoadingMethod(CreativeLoadingMethod creativeLoadingMethod) {
            creativeLoadingMethod.getClass();
            this.creativeLoadingMethod_ = creativeLoadingMethod.getNumber();
            onChanged();
            return this;
        }

        public Builder setCreativeLoadingMethodValue(int i10) {
            this.creativeLoadingMethod_ = i10;
            onChanged();
            return this;
        }

        public Builder setCreativeLoadingTimeout(int i10) {
            this.creativeLoadingTimeout_ = i10;
            onChanged();
            return this;
        }

        public Builder setCridMonitoringEnabled(boolean z10) {
            this.cridMonitoringEnabled_ = z10;
            onChanged();
            return this;
        }

        public Builder setEvent(int i10, Ad.Event event) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.set(i10, event);
                onChanged();
            } else {
                z1Var.w(i10, event);
            }
            return this;
        }

        public Builder setEventConfiguration(EventConfiguration eventConfiguration) {
            e2<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> e2Var = this.eventConfigurationBuilder_;
            if (e2Var == null) {
                eventConfiguration.getClass();
                this.eventConfiguration_ = eventConfiguration;
                onChanged();
            } else {
                e2Var.i(eventConfiguration);
            }
            return this;
        }

        public Builder setIgnoresSafeAreaLayoutGuide(boolean z10) {
            this.ignoresSafeAreaLayoutGuide_ = z10;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setLoadSkipoffset(int i10) {
            this.loadSkipoffset_ = i10;
            onChanged();
            return this;
        }

        public Builder setMraidCreativeValidationRequired(boolean z10) {
            this.mraidCreativeValidationRequired_ = z10;
            onChanged();
            return this;
        }

        public Builder setPlaceholderTimeout(float f10) {
            this.placeholderTimeout_ = f10;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setPreload(boolean z10) {
            this.preload_ = z10;
            onChanged();
            return this;
        }

        public Builder setPreloadAd(boolean z10) {
            this.preloadAd_ = z10;
            onChanged();
            return this;
        }

        public Builder setProgress(ControlAsset controlAsset) {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.progressBuilder_;
            if (e2Var == null) {
                controlAsset.getClass();
                this.progress_ = controlAsset;
                onChanged();
            } else {
                e2Var.i(controlAsset);
            }
            return this;
        }

        public Builder setProgressDuration(int i10) {
            this.progressDuration_ = i10;
            onChanged();
            return this;
        }

        public Builder setR1(boolean z10) {
            this.r1_ = z10;
            onChanged();
            return this;
        }

        public Builder setR1Delay(int i10) {
            this.r1Delay_ = i10;
            onChanged();
            return this;
        }

        public Builder setR2(boolean z10) {
            this.r2_ = z10;
            onChanged();
            return this;
        }

        public Builder setRenderingConfiguration(Rendering rendering) {
            e2<Rendering, Rendering.Builder, RenderingOrBuilder> e2Var = this.renderingConfigurationBuilder_;
            if (e2Var == null) {
                rendering.getClass();
                this.renderingConfiguration_ = rendering;
                onChanged();
            } else {
                e2Var.i(rendering);
            }
            return this;
        }

        public Builder setSkipoffset(int i10) {
            this.skipoffset_ = i10;
            onChanged();
            return this;
        }

        public Builder setStoreUrl(String str) {
            str.getClass();
            this.storeUrl_ = str;
            onChanged();
            return this;
        }

        public Builder setStoreUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.storeUrl_ = byteString;
            onChanged();
            return this;
        }

        public Builder setUseEmbeddedBrowser(boolean z10) {
            this.useEmbeddedBrowser_ = z10;
            onChanged();
            return this;
        }

        public Builder setUseNativeClose(boolean z10) {
            this.useNativeClose_ = z10;
            onChanged();
            return this;
        }

        public Builder setViewabilityConfiguration(ViewabilityConfiguration viewabilityConfiguration) {
            e2<ViewabilityConfiguration, ViewabilityConfiguration.Builder, ViewabilityConfigurationOrBuilder> e2Var = this.viewabilityConfigurationBuilder_;
            if (e2Var == null) {
                viewabilityConfiguration.getClass();
                this.viewabilityConfiguration_ = viewabilityConfiguration;
                onChanged();
            } else {
                e2Var.i(viewabilityConfiguration);
            }
            this.bitField0_ |= 4;
            return this;
        }

        @Deprecated
        public Builder setViewabilityDurationThreshold(float f10) {
            this.viewabilityDurationThreshold_ = f10;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setViewabilityIgnoreOverlap(boolean z10) {
            this.viewabilityIgnoreOverlap_ = z10;
            onChanged();
            return this;
        }

        public Builder setViewabilityIgnoreWindowFocus(boolean z10) {
            this.viewabilityIgnoreWindowFocus_ = z10;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setViewabilityPixelThreshold(float f10) {
            this.viewabilityPixelThreshold_ = f10;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setViewabilityTimeThreshold(int i10) {
            this.viewabilityTimeThreshold_ = i10;
            onChanged();
            return this;
        }

        private Builder() {
            this.event_ = Collections.emptyList();
            this.storeUrl_ = "";
            this.adCacheControl_ = 0;
            this.creativeLoadingMethod_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdExtension build() {
            AdExtension adExtensionBuildPartial = buildPartial();
            if (adExtensionBuildPartial.isInitialized()) {
                return adExtensionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) adExtensionBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdExtension buildPartial() {
            AdExtension adExtension = new AdExtension(this);
            int i10 = this.bitField0_;
            adExtension.preload_ = this.preload_;
            adExtension.loadSkipoffset_ = this.loadSkipoffset_;
            adExtension.viewabilityTimeThreshold_ = this.viewabilityTimeThreshold_;
            adExtension.viewabilityPixelThreshold_ = this.viewabilityPixelThreshold_;
            adExtension.viewabilityDurationThreshold_ = this.viewabilityDurationThreshold_;
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            int i11 = 1;
            if (z1Var != null) {
                adExtension.event_ = z1Var.f();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.event_ = Collections.unmodifiableList(this.event_);
                    this.bitField0_ &= -2;
                }
                adExtension.event_ = this.event_;
            }
            adExtension.customParams_ = internalGetCustomParams();
            adExtension.customParams_.o();
            adExtension.skipoffset_ = this.skipoffset_;
            adExtension.companionSkipoffset_ = this.companionSkipoffset_;
            adExtension.useNativeClose_ = this.useNativeClose_;
            adExtension.r1_ = this.r1_;
            adExtension.r2_ = this.r2_;
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.countdownBuilder_;
            if (e2Var == null) {
                adExtension.countdown_ = this.countdown_;
            } else {
                adExtension.countdown_ = (ControlAsset) e2Var.a();
            }
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var2 = this.closeButtonBuilder_;
            if (e2Var2 == null) {
                adExtension.closeButton_ = this.closeButton_;
            } else {
                adExtension.closeButton_ = (ControlAsset) e2Var2.a();
            }
            adExtension.ignoresSafeAreaLayoutGuide_ = this.ignoresSafeAreaLayoutGuide_;
            adExtension.storeUrl_ = this.storeUrl_;
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var3 = this.progressBuilder_;
            if (e2Var3 == null) {
                adExtension.progress_ = this.progress_;
            } else {
                adExtension.progress_ = (ControlAsset) e2Var3.a();
            }
            adExtension.progressDuration_ = this.progressDuration_;
            adExtension.viewabilityIgnoreWindowFocus_ = this.viewabilityIgnoreWindowFocus_;
            adExtension.adCacheControl_ = this.adCacheControl_;
            adExtension.adCacheMaxAge_ = this.adCacheMaxAge_;
            adExtension.r1Delay_ = this.r1Delay_;
            adExtension.adMarkupLoadingTimeout_ = this.adMarkupLoadingTimeout_;
            adExtension.useEmbeddedBrowser_ = this.useEmbeddedBrowser_;
            adExtension.preloadAd_ = this.preloadAd_;
            adExtension.creativeLoadingMethod_ = this.creativeLoadingMethod_;
            adExtension.placeholderTimeout_ = this.placeholderTimeout_;
            e2<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> e2Var4 = this.eventConfigurationBuilder_;
            if (e2Var4 == null) {
                adExtension.eventConfiguration_ = this.eventConfiguration_;
            } else {
                adExtension.eventConfiguration_ = (EventConfiguration) e2Var4.a();
            }
            adExtension.viewabilityIgnoreOverlap_ = this.viewabilityIgnoreOverlap_;
            e2<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> e2Var5 = this.creativeExtensionBuilder_;
            if (e2Var5 == null) {
                adExtension.creativeExtension_ = this.creativeExtension_;
            } else {
                adExtension.creativeExtension_ = (CreativeExtension) e2Var5.a();
            }
            adExtension.adFlexibleSize_ = this.adFlexibleSize_;
            e2<Rendering, Rendering.Builder, RenderingOrBuilder> e2Var6 = this.renderingConfigurationBuilder_;
            if (e2Var6 == null) {
                adExtension.renderingConfiguration_ = this.renderingConfiguration_;
            } else {
                adExtension.renderingConfiguration_ = (Rendering) e2Var6.a();
            }
            adExtension.mraidCreativeValidationRequired_ = this.mraidCreativeValidationRequired_;
            adExtension.creativeLoadingTimeout_ = this.creativeLoadingTimeout_;
            adExtension.cridMonitoringEnabled_ = this.cridMonitoringEnabled_;
            if ((i10 & 4) != 0) {
                e2<ViewabilityConfiguration, ViewabilityConfiguration.Builder, ViewabilityConfigurationOrBuilder> e2Var7 = this.viewabilityConfigurationBuilder_;
                if (e2Var7 == null) {
                    adExtension.viewabilityConfiguration_ = this.viewabilityConfiguration_;
                } else {
                    adExtension.viewabilityConfiguration_ = (ViewabilityConfiguration) e2Var7.a();
                }
            } else {
                i11 = 0;
            }
            adExtension.bitField0_ = i11;
            onBuilt();
            return adExtension;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public AdExtension mo164getDefaultInstanceForType() {
            return AdExtension.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(u2 u2Var) {
            return (Builder) super.setUnknownFields(u2Var);
        }

        public Ad.Event.Builder addEventBuilder(int i10) {
            return (Ad.Event.Builder) getEventFieldBuilder().b(i10, Ad.Event.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(u2 u2Var) {
            return (Builder) super.mergeUnknownFields(u2Var);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.preload_ = false;
            this.loadSkipoffset_ = 0;
            this.viewabilityTimeThreshold_ = 0;
            this.viewabilityPixelThreshold_ = 0.0f;
            this.viewabilityDurationThreshold_ = 0.0f;
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                this.event_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                z1Var.g();
            }
            internalGetMutableCustomParams().b();
            this.skipoffset_ = 0;
            this.companionSkipoffset_ = 0;
            this.useNativeClose_ = false;
            this.r1_ = false;
            this.r2_ = false;
            if (this.countdownBuilder_ == null) {
                this.countdown_ = null;
            } else {
                this.countdown_ = null;
                this.countdownBuilder_ = null;
            }
            if (this.closeButtonBuilder_ == null) {
                this.closeButton_ = null;
            } else {
                this.closeButton_ = null;
                this.closeButtonBuilder_ = null;
            }
            this.ignoresSafeAreaLayoutGuide_ = false;
            this.storeUrl_ = "";
            if (this.progressBuilder_ == null) {
                this.progress_ = null;
            } else {
                this.progress_ = null;
                this.progressBuilder_ = null;
            }
            this.progressDuration_ = 0;
            this.viewabilityIgnoreWindowFocus_ = false;
            this.adCacheControl_ = 0;
            this.adCacheMaxAge_ = 0;
            this.r1Delay_ = 0;
            this.adMarkupLoadingTimeout_ = 0;
            this.useEmbeddedBrowser_ = false;
            this.preloadAd_ = false;
            this.creativeLoadingMethod_ = 0;
            this.placeholderTimeout_ = 0.0f;
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfiguration_ = null;
            } else {
                this.eventConfiguration_ = null;
                this.eventConfigurationBuilder_ = null;
            }
            this.viewabilityIgnoreOverlap_ = false;
            if (this.creativeExtensionBuilder_ == null) {
                this.creativeExtension_ = null;
            } else {
                this.creativeExtension_ = null;
                this.creativeExtensionBuilder_ = null;
            }
            this.adFlexibleSize_ = false;
            if (this.renderingConfigurationBuilder_ == null) {
                this.renderingConfiguration_ = null;
            } else {
                this.renderingConfiguration_ = null;
                this.renderingConfigurationBuilder_ = null;
            }
            this.mraidCreativeValidationRequired_ = false;
            this.creativeLoadingTimeout_ = 0;
            this.cridMonitoringEnabled_ = false;
            e2<ViewabilityConfiguration, ViewabilityConfiguration.Builder, ViewabilityConfigurationOrBuilder> e2Var = this.viewabilityConfigurationBuilder_;
            if (e2Var == null) {
                this.viewabilityConfiguration_ = null;
            } else {
                e2Var.b();
            }
            this.bitField0_ &= -5;
            return this;
        }

        public Builder setCloseButton(ControlAsset.Builder builder) {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.closeButtonBuilder_;
            if (e2Var == null) {
                this.closeButton_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setCountdown(ControlAsset.Builder builder) {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.countdownBuilder_;
            if (e2Var == null) {
                this.countdown_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        @Deprecated
        public Builder setCreativeExtension(CreativeExtension.Builder builder) {
            e2<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> e2Var = this.creativeExtensionBuilder_;
            if (e2Var == null) {
                this.creativeExtension_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setEventConfiguration(EventConfiguration.Builder builder) {
            e2<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> e2Var = this.eventConfigurationBuilder_;
            if (e2Var == null) {
                this.eventConfiguration_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setProgress(ControlAsset.Builder builder) {
            e2<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> e2Var = this.progressBuilder_;
            if (e2Var == null) {
                this.progress_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setRenderingConfiguration(Rendering.Builder builder) {
            e2<Rendering, Rendering.Builder, RenderingOrBuilder> e2Var = this.renderingConfigurationBuilder_;
            if (e2Var == null) {
                this.renderingConfiguration_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder addEvent(int i10, Ad.Event event) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.add(i10, event);
                onChanged();
            } else {
                z1Var.d(i10, event);
            }
            return this;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a
        /* JADX INFO: renamed from: clone */
        public Builder mo162clone() {
            return (Builder) super.mo162clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AdExtension) {
                return mergeFrom((AdExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setEvent(int i10, Ad.Event.Builder builder) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                ensureEventIsMutable();
                this.event_.set(i10, builder.build());
                onChanged();
            } else {
                z1Var.w(i10, builder.build());
            }
            return this;
        }

        public Builder setViewabilityConfiguration(ViewabilityConfiguration.Builder builder) {
            e2<ViewabilityConfiguration, ViewabilityConfiguration.Builder, ViewabilityConfigurationOrBuilder> e2Var = this.viewabilityConfigurationBuilder_;
            if (e2Var == null) {
                this.viewabilityConfiguration_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            this.bitField0_ |= 4;
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.event_ = Collections.emptyList();
            this.storeUrl_ = "";
            this.adCacheControl_ = 0;
            this.creativeLoadingMethod_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(AdExtension adExtension) {
            if (adExtension == AdExtension.getDefaultInstance()) {
                return this;
            }
            if (adExtension.getPreload()) {
                setPreload(adExtension.getPreload());
            }
            if (adExtension.getLoadSkipoffset() != 0) {
                setLoadSkipoffset(adExtension.getLoadSkipoffset());
            }
            if (adExtension.getViewabilityTimeThreshold() != 0) {
                setViewabilityTimeThreshold(adExtension.getViewabilityTimeThreshold());
            }
            if (adExtension.getViewabilityPixelThreshold() != 0.0f) {
                setViewabilityPixelThreshold(adExtension.getViewabilityPixelThreshold());
            }
            if (adExtension.getViewabilityDurationThreshold() != 0.0f) {
                setViewabilityDurationThreshold(adExtension.getViewabilityDurationThreshold());
            }
            if (this.eventBuilder_ == null) {
                if (!adExtension.event_.isEmpty()) {
                    if (this.event_.isEmpty()) {
                        this.event_ = adExtension.event_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureEventIsMutable();
                        this.event_.addAll(adExtension.event_);
                    }
                    onChanged();
                }
            } else if (!adExtension.event_.isEmpty()) {
                if (!this.eventBuilder_.t()) {
                    this.eventBuilder_.a(adExtension.event_);
                } else {
                    this.eventBuilder_.h();
                    this.eventBuilder_ = null;
                    this.event_ = adExtension.event_;
                    this.bitField0_ &= -2;
                    this.eventBuilder_ = j0.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                }
            }
            internalGetMutableCustomParams().p(adExtension.internalGetCustomParams());
            if (adExtension.getSkipoffset() != 0) {
                setSkipoffset(adExtension.getSkipoffset());
            }
            if (adExtension.getCompanionSkipoffset() != 0) {
                setCompanionSkipoffset(adExtension.getCompanionSkipoffset());
            }
            if (adExtension.getUseNativeClose()) {
                setUseNativeClose(adExtension.getUseNativeClose());
            }
            if (adExtension.getR1()) {
                setR1(adExtension.getR1());
            }
            if (adExtension.getR2()) {
                setR2(adExtension.getR2());
            }
            if (adExtension.hasCountdown()) {
                mergeCountdown(adExtension.getCountdown());
            }
            if (adExtension.hasCloseButton()) {
                mergeCloseButton(adExtension.getCloseButton());
            }
            if (adExtension.getIgnoresSafeAreaLayoutGuide()) {
                setIgnoresSafeAreaLayoutGuide(adExtension.getIgnoresSafeAreaLayoutGuide());
            }
            if (!adExtension.getStoreUrl().isEmpty()) {
                this.storeUrl_ = adExtension.storeUrl_;
                onChanged();
            }
            if (adExtension.hasProgress()) {
                mergeProgress(adExtension.getProgress());
            }
            if (adExtension.getProgressDuration() != 0) {
                setProgressDuration(adExtension.getProgressDuration());
            }
            if (adExtension.getViewabilityIgnoreWindowFocus()) {
                setViewabilityIgnoreWindowFocus(adExtension.getViewabilityIgnoreWindowFocus());
            }
            if (adExtension.adCacheControl_ != 0) {
                setAdCacheControlValue(adExtension.getAdCacheControlValue());
            }
            if (adExtension.getAdCacheMaxAge() != 0) {
                setAdCacheMaxAge(adExtension.getAdCacheMaxAge());
            }
            if (adExtension.getR1Delay() != 0) {
                setR1Delay(adExtension.getR1Delay());
            }
            if (adExtension.getAdMarkupLoadingTimeout() != 0) {
                setAdMarkupLoadingTimeout(adExtension.getAdMarkupLoadingTimeout());
            }
            if (adExtension.getUseEmbeddedBrowser()) {
                setUseEmbeddedBrowser(adExtension.getUseEmbeddedBrowser());
            }
            if (adExtension.getPreloadAd()) {
                setPreloadAd(adExtension.getPreloadAd());
            }
            if (adExtension.creativeLoadingMethod_ != 0) {
                setCreativeLoadingMethodValue(adExtension.getCreativeLoadingMethodValue());
            }
            if (adExtension.getPlaceholderTimeout() != 0.0f) {
                setPlaceholderTimeout(adExtension.getPlaceholderTimeout());
            }
            if (adExtension.hasEventConfiguration()) {
                mergeEventConfiguration(adExtension.getEventConfiguration());
            }
            if (adExtension.getViewabilityIgnoreOverlap()) {
                setViewabilityIgnoreOverlap(adExtension.getViewabilityIgnoreOverlap());
            }
            if (adExtension.hasCreativeExtension()) {
                mergeCreativeExtension(adExtension.getCreativeExtension());
            }
            if (adExtension.getAdFlexibleSize()) {
                setAdFlexibleSize(adExtension.getAdFlexibleSize());
            }
            if (adExtension.hasRenderingConfiguration()) {
                mergeRenderingConfiguration(adExtension.getRenderingConfiguration());
            }
            if (adExtension.getMraidCreativeValidationRequired()) {
                setMraidCreativeValidationRequired(adExtension.getMraidCreativeValidationRequired());
            }
            if (adExtension.getCreativeLoadingTimeout() != 0) {
                setCreativeLoadingTimeout(adExtension.getCreativeLoadingTimeout());
            }
            if (adExtension.getCridMonitoringEnabled()) {
                setCridMonitoringEnabled(adExtension.getCridMonitoringEnabled());
            }
            if (adExtension.hasViewabilityConfiguration()) {
                mergeViewabilityConfiguration(adExtension.getViewabilityConfiguration());
            }
            mergeUnknownFields(((j0) adExtension).unknownFields);
            onChanged();
            return this;
        }

        public Builder addEvent(Ad.Event.Builder builder) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                ensureEventIsMutable();
                this.event_.add(builder.build());
                onChanged();
            } else {
                z1Var.e(builder.build());
            }
            return this;
        }

        public Builder addEvent(int i10, Ad.Event.Builder builder) {
            z1<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> z1Var = this.eventBuilder_;
            if (z1Var == null) {
                ensureEventIsMutable();
                this.event_.add(i10, builder.build());
                onChanged();
            } else {
                z1Var.d(i10, builder.build());
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            AdExtension adExtension = null;
            try {
                try {
                    AdExtension adExtension2 = (AdExtension) AdExtension.PARSER.parsePartialFrom(nVar, yVar);
                    if (adExtension2 != null) {
                        mergeFrom(adExtension2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    AdExtension adExtension3 = (AdExtension) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        adExtension = adExtension3;
                        if (adExtension != null) {
                            mergeFrom(adExtension);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (adExtension != null) {
                    mergeFrom(adExtension);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(AdExtension adExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adExtension);
    }

    public static AdExtension parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private AdExtension(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AdExtension parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (AdExtension) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static AdExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public AdExtension mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AdExtension parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private AdExtension() {
        this.memoizedIsInitialized = (byte) -1;
        this.event_ = Collections.emptyList();
        this.storeUrl_ = "";
        this.adCacheControl_ = 0;
        this.creativeLoadingMethod_ = 0;
    }

    public static AdExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static AdExtension parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static AdExtension parseFrom(InputStream inputStream) throws IOException {
        return (AdExtension) j0.parseWithIOException(PARSER, inputStream);
    }

    public static AdExtension parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (AdExtension) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AdExtension(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    switch (iK) {
                        case 0:
                            break;
                        case 16:
                            this.preload_ = nVar.q();
                            continue;
                        case 24:
                            this.loadSkipoffset_ = nVar.L();
                            continue;
                        case 32:
                            this.viewabilityTimeThreshold_ = nVar.L();
                            continue;
                        case 45:
                            this.viewabilityPixelThreshold_ = nVar.w();
                            continue;
                        case 53:
                            this.viewabilityDurationThreshold_ = nVar.w();
                            continue;
                        case 58:
                            int i11 = (i10 == true ? 1 : 0) & 1;
                            i10 = i10;
                            if (i11 == 0) {
                                this.event_ = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 1;
                            }
                            this.event_.add((Ad.Event) nVar.A(Ad.Event.parser(), yVar));
                            continue;
                        case 66:
                            int i12 = (i10 == true ? 1 : 0) & 2;
                            i10 = i10;
                            if (i12 == 0) {
                                this.customParams_ = y0.q(CustomParamsDefaultEntryHolder.defaultEntry);
                                i10 = (i10 == true ? 1 : 0) | 2;
                            }
                            w0 w0Var = (w0) nVar.A(CustomParamsDefaultEntryHolder.defaultEntry.getParserForType(), yVar);
                            this.customParams_.m().put(w0Var.h(), w0Var.n());
                            continue;
                        case 72:
                            this.skipoffset_ = nVar.L();
                            continue;
                        case 80:
                            this.companionSkipoffset_ = nVar.L();
                            continue;
                        case 88:
                            this.useNativeClose_ = nVar.q();
                            continue;
                        case 96:
                            this.r1_ = nVar.q();
                            continue;
                        case 104:
                            this.r2_ = nVar.q();
                            continue;
                        case 114:
                            ControlAsset controlAsset = this.countdown_;
                            ControlAsset.Builder builder = controlAsset != null ? controlAsset.toBuilder() : null;
                            ControlAsset controlAsset2 = (ControlAsset) nVar.A(ControlAsset.parser(), yVar);
                            this.countdown_ = controlAsset2;
                            if (builder != null) {
                                builder.mergeFrom(controlAsset2);
                                this.countdown_ = builder.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 122:
                            ControlAsset controlAsset3 = this.closeButton_;
                            ControlAsset.Builder builder2 = controlAsset3 != null ? controlAsset3.toBuilder() : null;
                            ControlAsset controlAsset4 = (ControlAsset) nVar.A(ControlAsset.parser(), yVar);
                            this.closeButton_ = controlAsset4;
                            if (builder2 != null) {
                                builder2.mergeFrom(controlAsset4);
                                this.closeButton_ = builder2.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 128:
                            this.ignoresSafeAreaLayoutGuide_ = nVar.q();
                            continue;
                        case CONFIG_REFRESH_FAILED_VALUE:
                            this.storeUrl_ = nVar.J();
                            continue;
                        case 146:
                            ControlAsset controlAsset5 = this.progress_;
                            ControlAsset.Builder builder3 = controlAsset5 != null ? controlAsset5.toBuilder() : null;
                            ControlAsset controlAsset6 = (ControlAsset) nVar.A(ControlAsset.parser(), yVar);
                            this.progress_ = controlAsset6;
                            if (builder3 != null) {
                                builder3.mergeFrom(controlAsset6);
                                this.progress_ = builder3.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 152:
                            this.progressDuration_ = nVar.L();
                            continue;
                        case 160:
                            this.viewabilityIgnoreWindowFocus_ = nVar.q();
                            continue;
                        case 168:
                            this.adCacheControl_ = nVar.t();
                            continue;
                        case 176:
                            this.adCacheMaxAge_ = nVar.L();
                            continue;
                        case 184:
                            this.r1Delay_ = nVar.L();
                            continue;
                        case 192:
                            this.adMarkupLoadingTimeout_ = nVar.L();
                            continue;
                        case 200:
                            this.useEmbeddedBrowser_ = nVar.q();
                            continue;
                        case 208:
                            this.preloadAd_ = nVar.q();
                            continue;
                        case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                            this.creativeLoadingMethod_ = nVar.t();
                            continue;
                        case 229:
                            this.placeholderTimeout_ = nVar.w();
                            continue;
                        case 234:
                            EventConfiguration eventConfiguration = this.eventConfiguration_;
                            EventConfiguration.Builder builder4 = eventConfiguration != null ? eventConfiguration.toBuilder() : null;
                            EventConfiguration eventConfiguration2 = (EventConfiguration) nVar.A(EventConfiguration.parser(), yVar);
                            this.eventConfiguration_ = eventConfiguration2;
                            if (builder4 != null) {
                                builder4.mergeFrom(eventConfiguration2);
                                this.eventConfiguration_ = builder4.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 240:
                            this.viewabilityIgnoreOverlap_ = nVar.q();
                            continue;
                        case 250:
                            CreativeExtension creativeExtension = this.creativeExtension_;
                            CreativeExtension.Builder builder5 = creativeExtension != null ? creativeExtension.toBuilder() : null;
                            CreativeExtension creativeExtension2 = (CreativeExtension) nVar.A(CreativeExtension.parser(), yVar);
                            this.creativeExtension_ = creativeExtension2;
                            if (builder5 != null) {
                                builder5.mergeFrom(creativeExtension2);
                                this.creativeExtension_ = builder5.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case UserVerificationMethods.USER_VERIFY_HANDPRINT /* 256 */:
                            this.adFlexibleSize_ = nVar.q();
                            continue;
                        case 266:
                            Rendering rendering = this.renderingConfiguration_;
                            Rendering.Builder builder6 = rendering != null ? rendering.toBuilder() : null;
                            Rendering rendering2 = (Rendering) nVar.A(Rendering.parser(), yVar);
                            this.renderingConfiguration_ = rendering2;
                            if (builder6 != null) {
                                builder6.mergeFrom(rendering2);
                                this.renderingConfiguration_ = builder6.buildPartial();
                            } else {
                                continue;
                            }
                            break;
                        case 272:
                            this.mraidCreativeValidationRequired_ = nVar.q();
                            continue;
                        case 280:
                            this.creativeLoadingTimeout_ = nVar.y();
                            continue;
                        case 288:
                            this.cridMonitoringEnabled_ = nVar.q();
                            continue;
                        case 298:
                            ViewabilityConfiguration.Builder builder7 = (this.bitField0_ & 1) != 0 ? this.viewabilityConfiguration_.toBuilder() : null;
                            ViewabilityConfiguration viewabilityConfiguration = (ViewabilityConfiguration) nVar.A(ViewabilityConfiguration.parser(), yVar);
                            this.viewabilityConfiguration_ = viewabilityConfiguration;
                            if (builder7 != null) {
                                builder7.mergeFrom(viewabilityConfiguration);
                                this.viewabilityConfiguration_ = builder7.buildPartial();
                            }
                            this.bitField0_ |= 1;
                            continue;
                        default:
                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                break;
                            }
                            break;
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (((i10 == true ? 1 : 0) & 1) != 0) {
                    this.event_ = Collections.unmodifiableList(this.event_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (((i10 == true ? 1 : 0) & 1) != 0) {
            this.event_ = Collections.unmodifiableList(this.event_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static AdExtension parseFrom(n nVar) throws IOException {
        return (AdExtension) j0.parseWithIOException(PARSER, nVar);
    }

    public static AdExtension parseFrom(n nVar, y yVar) throws IOException {
        return (AdExtension) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
