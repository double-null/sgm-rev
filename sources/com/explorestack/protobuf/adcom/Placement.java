package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.e;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.i2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.q0;
import com.explorestack.protobuf.r0;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.w1;
import com.explorestack.protobuf.y;
import com.explorestack.protobuf.z1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Placement extends j0 implements d {
    public static final int ADMX_FIELD_NUMBER = 14;
    public static final int BADV_FIELD_NUMBER = 9;
    public static final int BAPP_FIELD_NUMBER = 10;
    public static final int BATTR_FIELD_NUMBER = 11;
    public static final int BCAT_FIELD_NUMBER = 6;
    public static final int CATTAX_FIELD_NUMBER = 7;
    public static final int CURLX_FIELD_NUMBER = 15;
    public static final int DISPLAY_FIELD_NUMBER = 16;
    public static final int EXT_FIELD_NUMBER = 20;
    public static final int EXT_PROTO_FIELD_NUMBER = 19;
    public static final int REWARD_FIELD_NUMBER = 5;
    public static final int SDKVER_FIELD_NUMBER = 4;
    public static final int SDK_FIELD_NUMBER = 3;
    public static final int SECURE_FIELD_NUMBER = 13;
    public static final int SSAI_FIELD_NUMBER = 2;
    public static final int TAGID_FIELD_NUMBER = 1;
    public static final int VIDEO_FIELD_NUMBER = 17;
    public static final int WLANG_FIELD_NUMBER = 12;
    private static final long serialVersionUID = 0;
    private boolean admx_;
    private r0 badv_;
    private r0 bapp_;
    private int battrMemoizedSerializedSize;
    private List<Integer> battr_;
    private r0 bcat_;
    private int cattax_;
    private boolean curlx_;
    private DisplayPlacement display_;
    private List<Any> extProto_;
    private Struct ext_;
    private byte memoizedIsInitialized;
    private boolean reward_;
    private volatile Object sdk_;
    private volatile Object sdkver_;
    private boolean secure_;
    private int ssai_;
    private volatile Object tagid_;
    private VideoPlacement video_;
    private r0 wlang_;
    private static final l0.h.a<Integer, CreativeAttribute> battr_converter_ = new l0.h.a<Integer, CreativeAttribute>() { // from class: com.explorestack.protobuf.adcom.Placement.1
        @Override // com.explorestack.protobuf.l0.h.a
        public CreativeAttribute convert(Integer num) {
            CreativeAttribute creativeAttributeValueOf = CreativeAttribute.valueOf(num.intValue());
            return creativeAttributeValueOf == null ? CreativeAttribute.UNRECOGNIZED : creativeAttributeValueOf;
        }
    };
    private static final Placement DEFAULT_INSTANCE = new Placement();
    private static final s1<Placement> PARSER = new com.explorestack.protobuf.b<Placement>() { // from class: com.explorestack.protobuf.adcom.Placement.2
        @Override // com.explorestack.protobuf.s1
        public Placement parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new Placement(nVar, yVar);
        }
    };

    public static final class Builder extends j0.b<Builder> implements d {
        private boolean admx_;
        private r0 badv_;
        private r0 bapp_;
        private List<Integer> battr_;
        private r0 bcat_;
        private int bitField0_;
        private int cattax_;
        private boolean curlx_;
        private e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> displayBuilder_;
        private DisplayPlacement display_;
        private e2<Struct, Struct.Builder, i2> extBuilder_;
        private z1<Any, Any.Builder, e> extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private boolean reward_;
        private Object sdk_;
        private Object sdkver_;
        private boolean secure_;
        private int ssai_;
        private Object tagid_;
        private e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> videoBuilder_;
        private VideoPlacement video_;
        private r0 wlang_;

        private void ensureBadvIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.badv_ = new q0(this.badv_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureBappIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.bapp_ = new q0(this.bapp_);
                this.bitField0_ |= 4;
            }
        }

        private void ensureBattrIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.battr_ = new ArrayList(this.battr_);
                this.bitField0_ |= 8;
            }
        }

        private void ensureBcatIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.bcat_ = new q0(this.bcat_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 32;
            }
        }

        private void ensureWlangIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
                this.wlang_ = new q0(this.wlang_);
                this.bitField0_ |= 16;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.E;
        }

        private e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> getDisplayFieldBuilder() {
            if (this.displayBuilder_ == null) {
                this.displayBuilder_ = new e2<>(getDisplay(), getParentForChildren(), isClean());
                this.display_ = null;
            }
            return this.displayBuilder_;
        }

        private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
            if (this.extProtoBuilder_ == null) {
                this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
                this.extProto_ = null;
            }
            return this.extProtoBuilder_;
        }

        private e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> getVideoFieldBuilder() {
            if (this.videoBuilder_ == null) {
                this.videoBuilder_ = new e2<>(getVideo(), getParentForChildren(), isClean());
                this.video_ = null;
            }
            return this.videoBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (j0.alwaysUseFieldBuilders) {
                getExtProtoFieldBuilder();
            }
        }

        public Builder addAllBadv(Iterable<String> iterable) {
            ensureBadvIsMutable();
            com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.badv_);
            onChanged();
            return this;
        }

        public Builder addAllBapp(Iterable<String> iterable) {
            ensureBappIsMutable();
            com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.bapp_);
            onChanged();
            return this;
        }

        public Builder addAllBattr(Iterable<? extends CreativeAttribute> iterable) {
            ensureBattrIsMutable();
            Iterator<? extends CreativeAttribute> it = iterable.iterator();
            while (it.hasNext()) {
                this.battr_.add(Integer.valueOf(it.next().getNumber()));
            }
            onChanged();
            return this;
        }

        public Builder addAllBattrValue(Iterable<Integer> iterable) {
            ensureBattrIsMutable();
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                this.battr_.add(Integer.valueOf(it.next().intValue()));
            }
            onChanged();
            return this;
        }

        public Builder addAllBcat(Iterable<String> iterable) {
            ensureBcatIsMutable();
            com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.bcat_);
            onChanged();
            return this;
        }

        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                ensureExtProtoIsMutable();
                com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                onChanged();
            } else {
                z1Var.a(iterable);
            }
            return this;
        }

        public Builder addAllWlang(Iterable<String> iterable) {
            ensureWlangIsMutable();
            com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.wlang_);
            onChanged();
            return this;
        }

        public Builder addBadv(String str) {
            str.getClass();
            ensureBadvIsMutable();
            this.badv_.add(str);
            onChanged();
            return this;
        }

        public Builder addBadvBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            ensureBadvIsMutable();
            this.badv_.b(byteString);
            onChanged();
            return this;
        }

        public Builder addBapp(String str) {
            str.getClass();
            ensureBappIsMutable();
            this.bapp_.add(str);
            onChanged();
            return this;
        }

        public Builder addBappBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            ensureBappIsMutable();
            this.bapp_.b(byteString);
            onChanged();
            return this;
        }

        public Builder addBattr(CreativeAttribute creativeAttribute) {
            creativeAttribute.getClass();
            ensureBattrIsMutable();
            this.battr_.add(Integer.valueOf(creativeAttribute.getNumber()));
            onChanged();
            return this;
        }

        public Builder addBattrValue(int i10) {
            ensureBattrIsMutable();
            this.battr_.add(Integer.valueOf(i10));
            onChanged();
            return this;
        }

        public Builder addBcat(String str) {
            str.getClass();
            ensureBcatIsMutable();
            this.bcat_.add(str);
            onChanged();
            return this;
        }

        public Builder addBcatBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            ensureBcatIsMutable();
            this.bcat_.b(byteString);
            onChanged();
            return this;
        }

        public Builder addExtProto(Any any) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.add(any);
                onChanged();
            } else {
                z1Var.e(any);
            }
            return this;
        }

        public Any.Builder addExtProtoBuilder() {
            return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
        }

        public Builder addWlang(String str) {
            str.getClass();
            ensureWlangIsMutable();
            this.wlang_.add(str);
            onChanged();
            return this;
        }

        public Builder addWlangBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            ensureWlangIsMutable();
            this.wlang_.b(byteString);
            onChanged();
            return this;
        }

        public Builder clearAdmx() {
            this.admx_ = false;
            onChanged();
            return this;
        }

        public Builder clearBadv() {
            this.badv_ = q0.f10776d;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearBapp() {
            this.bapp_ = q0.f10776d;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearBattr() {
            this.battr_ = Collections.emptyList();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder clearBcat() {
            this.bcat_ = q0.f10776d;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearCattax() {
            this.cattax_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCurlx() {
            this.curlx_ = false;
            onChanged();
            return this;
        }

        public Builder clearDisplay() {
            if (this.displayBuilder_ == null) {
                this.display_ = null;
                onChanged();
            } else {
                this.display_ = null;
                this.displayBuilder_ = null;
            }
            return this;
        }

        public Builder clearExt() {
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                onChanged();
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            return this;
        }

        public Builder clearExtProto() {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -33;
                onChanged();
            } else {
                z1Var.g();
            }
            return this;
        }

        public Builder clearReward() {
            this.reward_ = false;
            onChanged();
            return this;
        }

        public Builder clearSdk() {
            this.sdk_ = Placement.getDefaultInstance().getSdk();
            onChanged();
            return this;
        }

        public Builder clearSdkver() {
            this.sdkver_ = Placement.getDefaultInstance().getSdkver();
            onChanged();
            return this;
        }

        public Builder clearSecure() {
            this.secure_ = false;
            onChanged();
            return this;
        }

        public Builder clearSsai() {
            this.ssai_ = 0;
            onChanged();
            return this;
        }

        public Builder clearTagid() {
            this.tagid_ = Placement.getDefaultInstance().getTagid();
            onChanged();
            return this;
        }

        public Builder clearVideo() {
            if (this.videoBuilder_ == null) {
                this.video_ = null;
                onChanged();
            } else {
                this.video_ = null;
                this.videoBuilder_ = null;
            }
            return this;
        }

        public Builder clearWlang() {
            this.wlang_ = q0.f10776d;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public boolean getAdmx() {
            return this.admx_;
        }

        public String getBadv(int i10) {
            return this.badv_.get(i10);
        }

        public ByteString getBadvBytes(int i10) {
            return this.badv_.getByteString(i10);
        }

        public int getBadvCount() {
            return this.badv_.size();
        }

        public String getBapp(int i10) {
            return this.bapp_.get(i10);
        }

        public ByteString getBappBytes(int i10) {
            return this.bapp_.getByteString(i10);
        }

        public int getBappCount() {
            return this.bapp_.size();
        }

        public CreativeAttribute getBattr(int i10) {
            return (CreativeAttribute) Placement.battr_converter_.convert(this.battr_.get(i10));
        }

        public int getBattrCount() {
            return this.battr_.size();
        }

        public List<CreativeAttribute> getBattrList() {
            return new l0.h(this.battr_, Placement.battr_converter_);
        }

        public int getBattrValue(int i10) {
            return this.battr_.get(i10).intValue();
        }

        public List<Integer> getBattrValueList() {
            return Collections.unmodifiableList(this.battr_);
        }

        public String getBcat(int i10) {
            return this.bcat_.get(i10);
        }

        public ByteString getBcatBytes(int i10) {
            return this.bcat_.getByteString(i10);
        }

        public int getBcatCount() {
            return this.bcat_.size();
        }

        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
        }

        public int getCattaxValue() {
            return this.cattax_;
        }

        public boolean getCurlx() {
            return this.curlx_;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return b.E;
        }

        public DisplayPlacement getDisplay() {
            e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> e2Var = this.displayBuilder_;
            if (e2Var != null) {
                return (DisplayPlacement) e2Var.e();
            }
            DisplayPlacement displayPlacement = this.display_;
            return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
        }

        public DisplayPlacement.Builder getDisplayBuilder() {
            onChanged();
            return (DisplayPlacement.Builder) getDisplayFieldBuilder().d();
        }

        public DisplayPlacementOrBuilder getDisplayOrBuilder() {
            e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> e2Var = this.displayBuilder_;
            if (e2Var != null) {
                return (DisplayPlacementOrBuilder) e2Var.f();
            }
            DisplayPlacement displayPlacement = this.display_;
            return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
        }

        public Struct getExt() {
            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
            if (e2Var != null) {
                return (Struct) e2Var.e();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Struct.Builder getExtBuilder() {
            onChanged();
            return (Struct.Builder) getExtFieldBuilder().d();
        }

        public i2 getExtOrBuilder() {
            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
            if (e2Var != null) {
                return (i2) e2Var.f();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Any getExtProto(int i10) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
        }

        public Any.Builder getExtProtoBuilder(int i10) {
            return (Any.Builder) getExtProtoFieldBuilder().k(i10);
        }

        public List<Any.Builder> getExtProtoBuilderList() {
            return getExtProtoFieldBuilder().l();
        }

        public int getExtProtoCount() {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            return z1Var == null ? this.extProto_.size() : z1Var.m();
        }

        public List<Any> getExtProtoList() {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
        }

        public e getExtProtoOrBuilder(int i10) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
        }

        public List<? extends e> getExtProtoOrBuilderList() {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
        }

        public boolean getReward() {
            return this.reward_;
        }

        public String getSdk() {
            Object obj = this.sdk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdk_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSdkBytes() {
            Object obj = this.sdk_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdk_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public String getSdkver() {
            Object obj = this.sdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdkver_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSdkverBytes() {
            Object obj = this.sdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdkver_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public boolean getSecure() {
            return this.secure_;
        }

        public int getSsai() {
            return this.ssai_;
        }

        public String getTagid() {
            Object obj = this.tagid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tagid_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTagidBytes() {
            Object obj = this.tagid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tagid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        public VideoPlacement getVideo() {
            e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> e2Var = this.videoBuilder_;
            if (e2Var != null) {
                return (VideoPlacement) e2Var.e();
            }
            VideoPlacement videoPlacement = this.video_;
            return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
        }

        public VideoPlacement.Builder getVideoBuilder() {
            onChanged();
            return (VideoPlacement.Builder) getVideoFieldBuilder().d();
        }

        public VideoPlacementOrBuilder getVideoOrBuilder() {
            e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> e2Var = this.videoBuilder_;
            if (e2Var != null) {
                return (VideoPlacementOrBuilder) e2Var.f();
            }
            VideoPlacement videoPlacement = this.video_;
            return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
        }

        public String getWlang(int i10) {
            return this.wlang_.get(i10);
        }

        public ByteString getWlangBytes(int i10) {
            return this.wlang_.getByteString(i10);
        }

        public int getWlangCount() {
            return this.wlang_.size();
        }

        public boolean hasDisplay() {
            return (this.displayBuilder_ == null && this.display_ == null) ? false : true;
        }

        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        public boolean hasVideo() {
            return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return b.F.d(Placement.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeDisplay(DisplayPlacement displayPlacement) {
            e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> e2Var = this.displayBuilder_;
            if (e2Var == null) {
                DisplayPlacement displayPlacement2 = this.display_;
                if (displayPlacement2 != null) {
                    this.display_ = DisplayPlacement.newBuilder(displayPlacement2).mergeFrom(displayPlacement).buildPartial();
                } else {
                    this.display_ = displayPlacement;
                }
                onChanged();
            } else {
                e2Var.g(displayPlacement);
            }
            return this;
        }

        public Builder mergeExt(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
            if (e2Var == null) {
                Struct struct2 = this.ext_;
                if (struct2 != null) {
                    this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.ext_ = struct;
                }
                onChanged();
            } else {
                e2Var.g(struct);
            }
            return this;
        }

        public Builder mergeVideo(VideoPlacement videoPlacement) {
            e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> e2Var = this.videoBuilder_;
            if (e2Var == null) {
                VideoPlacement videoPlacement2 = this.video_;
                if (videoPlacement2 != null) {
                    this.video_ = VideoPlacement.newBuilder(videoPlacement2).mergeFrom(videoPlacement).buildPartial();
                } else {
                    this.video_ = videoPlacement;
                }
                onChanged();
            } else {
                e2Var.g(videoPlacement);
            }
            return this;
        }

        public Builder removeExtProto(int i10) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                ensureExtProtoIsMutable();
                this.extProto_.remove(i10);
                onChanged();
            } else {
                z1Var.v(i10);
            }
            return this;
        }

        public Builder setAdmx(boolean z10) {
            this.admx_ = z10;
            onChanged();
            return this;
        }

        public Builder setBadv(int i10, String str) {
            str.getClass();
            ensureBadvIsMutable();
            this.badv_.set(i10, str);
            onChanged();
            return this;
        }

        public Builder setBapp(int i10, String str) {
            str.getClass();
            ensureBappIsMutable();
            this.bapp_.set(i10, str);
            onChanged();
            return this;
        }

        public Builder setBattr(int i10, CreativeAttribute creativeAttribute) {
            creativeAttribute.getClass();
            ensureBattrIsMutable();
            this.battr_.set(i10, Integer.valueOf(creativeAttribute.getNumber()));
            onChanged();
            return this;
        }

        public Builder setBattrValue(int i10, int i11) {
            ensureBattrIsMutable();
            this.battr_.set(i10, Integer.valueOf(i11));
            onChanged();
            return this;
        }

        public Builder setBcat(int i10, String str) {
            str.getClass();
            ensureBcatIsMutable();
            this.bcat_.set(i10, str);
            onChanged();
            return this;
        }

        public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
            categoryTaxonomy.getClass();
            this.cattax_ = categoryTaxonomy.getNumber();
            onChanged();
            return this;
        }

        public Builder setCattaxValue(int i10) {
            this.cattax_ = i10;
            onChanged();
            return this;
        }

        public Builder setCurlx(boolean z10) {
            this.curlx_ = z10;
            onChanged();
            return this;
        }

        public Builder setDisplay(DisplayPlacement displayPlacement) {
            e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> e2Var = this.displayBuilder_;
            if (e2Var == null) {
                displayPlacement.getClass();
                this.display_ = displayPlacement;
                onChanged();
            } else {
                e2Var.i(displayPlacement);
            }
            return this;
        }

        public Builder setExt(Struct struct) {
            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
            if (e2Var == null) {
                struct.getClass();
                this.ext_ = struct;
                onChanged();
            } else {
                e2Var.i(struct);
            }
            return this;
        }

        public Builder setExtProto(int i10, Any any) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.set(i10, any);
                onChanged();
            } else {
                z1Var.w(i10, any);
            }
            return this;
        }

        public Builder setReward(boolean z10) {
            this.reward_ = z10;
            onChanged();
            return this;
        }

        public Builder setSdk(String str) {
            str.getClass();
            this.sdk_ = str;
            onChanged();
            return this;
        }

        public Builder setSdkBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.sdk_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSdkver(String str) {
            str.getClass();
            this.sdkver_ = str;
            onChanged();
            return this;
        }

        public Builder setSdkverBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.sdkver_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSecure(boolean z10) {
            this.secure_ = z10;
            onChanged();
            return this;
        }

        public Builder setSsai(int i10) {
            this.ssai_ = i10;
            onChanged();
            return this;
        }

        public Builder setTagid(String str) {
            str.getClass();
            this.tagid_ = str;
            onChanged();
            return this;
        }

        public Builder setTagidBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.tagid_ = byteString;
            onChanged();
            return this;
        }

        public Builder setVideo(VideoPlacement videoPlacement) {
            e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> e2Var = this.videoBuilder_;
            if (e2Var == null) {
                videoPlacement.getClass();
                this.video_ = videoPlacement;
                onChanged();
            } else {
                e2Var.i(videoPlacement);
            }
            return this;
        }

        public Builder setWlang(int i10, String str) {
            str.getClass();
            ensureWlangIsMutable();
            this.wlang_.set(i10, str);
            onChanged();
            return this;
        }

        /* JADX INFO: renamed from: getBadvList, reason: merged with bridge method [inline-methods] */
        public w1 m175getBadvList() {
            return this.badv_.getUnmodifiableView();
        }

        /* JADX INFO: renamed from: getBappList, reason: merged with bridge method [inline-methods] */
        public w1 m176getBappList() {
            return this.bapp_.getUnmodifiableView();
        }

        /* JADX INFO: renamed from: getBcatList, reason: merged with bridge method [inline-methods] */
        public w1 m177getBcatList() {
            return this.bcat_.getUnmodifiableView();
        }

        /* JADX INFO: renamed from: getWlangList, reason: merged with bridge method [inline-methods] */
        public w1 m178getWlangList() {
            return this.wlang_.getUnmodifiableView();
        }

        private Builder() {
            this.tagid_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            r0 r0Var = q0.f10776d;
            this.bcat_ = r0Var;
            this.cattax_ = 0;
            this.badv_ = r0Var;
            this.bapp_ = r0Var;
            this.battr_ = Collections.emptyList();
            this.wlang_ = r0Var;
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Placement build() {
            Placement placementBuildPartial = buildPartial();
            if (placementBuildPartial.isInitialized()) {
                return placementBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) placementBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Placement buildPartial() {
            Placement placement = new Placement(this);
            placement.tagid_ = this.tagid_;
            placement.ssai_ = this.ssai_;
            placement.sdk_ = this.sdk_;
            placement.sdkver_ = this.sdkver_;
            placement.reward_ = this.reward_;
            if ((this.bitField0_ & 1) != 0) {
                this.bcat_ = this.bcat_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            placement.bcat_ = this.bcat_;
            placement.cattax_ = this.cattax_;
            if ((this.bitField0_ & 2) != 0) {
                this.badv_ = this.badv_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            placement.badv_ = this.badv_;
            if ((this.bitField0_ & 4) != 0) {
                this.bapp_ = this.bapp_.getUnmodifiableView();
                this.bitField0_ &= -5;
            }
            placement.bapp_ = this.bapp_;
            if ((this.bitField0_ & 8) != 0) {
                this.battr_ = Collections.unmodifiableList(this.battr_);
                this.bitField0_ &= -9;
            }
            placement.battr_ = this.battr_;
            if ((this.bitField0_ & 16) != 0) {
                this.wlang_ = this.wlang_.getUnmodifiableView();
                this.bitField0_ &= -17;
            }
            placement.wlang_ = this.wlang_;
            placement.secure_ = this.secure_;
            placement.admx_ = this.admx_;
            placement.curlx_ = this.curlx_;
            e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> e2Var = this.displayBuilder_;
            if (e2Var == null) {
                placement.display_ = this.display_;
            } else {
                placement.display_ = (DisplayPlacement) e2Var.a();
            }
            e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> e2Var2 = this.videoBuilder_;
            if (e2Var2 == null) {
                placement.video_ = this.video_;
            } else {
                placement.video_ = (VideoPlacement) e2Var2.a();
            }
            e2<Struct, Struct.Builder, i2> e2Var3 = this.extBuilder_;
            if (e2Var3 == null) {
                placement.ext_ = this.ext_;
            } else {
                placement.ext_ = (Struct) e2Var3.a();
            }
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var != null) {
                placement.extProto_ = z1Var.f();
            } else {
                if ((this.bitField0_ & 32) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -33;
                }
                placement.extProto_ = this.extProto_;
            }
            onBuilt();
            return placement;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public Placement mo164getDefaultInstanceForType() {
            return Placement.getDefaultInstance();
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

        public Any.Builder addExtProtoBuilder(int i10) {
            return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
            this.tagid_ = "";
            this.ssai_ = 0;
            this.sdk_ = "";
            this.sdkver_ = "";
            this.reward_ = false;
            r0 r0Var = q0.f10776d;
            this.bcat_ = r0Var;
            int i10 = this.bitField0_ & (-2);
            this.cattax_ = 0;
            this.badv_ = r0Var;
            this.bapp_ = r0Var;
            this.bitField0_ = i10 & (-3) & (-5);
            this.battr_ = Collections.emptyList();
            int i11 = this.bitField0_ & (-9);
            this.wlang_ = r0Var;
            this.bitField0_ = i11 & (-17);
            this.secure_ = false;
            this.admx_ = false;
            this.curlx_ = false;
            if (this.displayBuilder_ == null) {
                this.display_ = null;
            } else {
                this.display_ = null;
                this.displayBuilder_ = null;
            }
            if (this.videoBuilder_ == null) {
                this.video_ = null;
            } else {
                this.video_ = null;
                this.videoBuilder_ = null;
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -33;
            } else {
                z1Var.g();
            }
            return this;
        }

        public Builder setDisplay(DisplayPlacement.Builder builder) {
            e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> e2Var = this.displayBuilder_;
            if (e2Var == null) {
                this.display_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setExt(Struct.Builder builder) {
            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
            if (e2Var == null) {
                this.ext_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setVideo(VideoPlacement.Builder builder) {
            e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> e2Var = this.videoBuilder_;
            if (e2Var == null) {
                this.video_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder addExtProto(int i10, Any any) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                any.getClass();
                ensureExtProtoIsMutable();
                this.extProto_.add(i10, any);
                onChanged();
            } else {
                z1Var.d(i10, any);
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
            if (message instanceof Placement) {
                return mergeFrom((Placement) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setExtProto(int i10, Any.Builder builder) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                ensureExtProtoIsMutable();
                this.extProto_.set(i10, builder.build());
                onChanged();
            } else {
                z1Var.w(i10, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(Placement placement) {
            if (placement == Placement.getDefaultInstance()) {
                return this;
            }
            if (!placement.getTagid().isEmpty()) {
                this.tagid_ = placement.tagid_;
                onChanged();
            }
            if (placement.getSsai() != 0) {
                setSsai(placement.getSsai());
            }
            if (!placement.getSdk().isEmpty()) {
                this.sdk_ = placement.sdk_;
                onChanged();
            }
            if (!placement.getSdkver().isEmpty()) {
                this.sdkver_ = placement.sdkver_;
                onChanged();
            }
            if (placement.getReward()) {
                setReward(placement.getReward());
            }
            if (!placement.bcat_.isEmpty()) {
                if (this.bcat_.isEmpty()) {
                    this.bcat_ = placement.bcat_;
                    this.bitField0_ &= -2;
                } else {
                    ensureBcatIsMutable();
                    this.bcat_.addAll(placement.bcat_);
                }
                onChanged();
            }
            if (placement.cattax_ != 0) {
                setCattaxValue(placement.getCattaxValue());
            }
            if (!placement.badv_.isEmpty()) {
                if (this.badv_.isEmpty()) {
                    this.badv_ = placement.badv_;
                    this.bitField0_ &= -3;
                } else {
                    ensureBadvIsMutable();
                    this.badv_.addAll(placement.badv_);
                }
                onChanged();
            }
            if (!placement.bapp_.isEmpty()) {
                if (this.bapp_.isEmpty()) {
                    this.bapp_ = placement.bapp_;
                    this.bitField0_ &= -5;
                } else {
                    ensureBappIsMutable();
                    this.bapp_.addAll(placement.bapp_);
                }
                onChanged();
            }
            if (!placement.battr_.isEmpty()) {
                if (this.battr_.isEmpty()) {
                    this.battr_ = placement.battr_;
                    this.bitField0_ &= -9;
                } else {
                    ensureBattrIsMutable();
                    this.battr_.addAll(placement.battr_);
                }
                onChanged();
            }
            if (!placement.wlang_.isEmpty()) {
                if (this.wlang_.isEmpty()) {
                    this.wlang_ = placement.wlang_;
                    this.bitField0_ &= -17;
                } else {
                    ensureWlangIsMutable();
                    this.wlang_.addAll(placement.wlang_);
                }
                onChanged();
            }
            if (placement.getSecure()) {
                setSecure(placement.getSecure());
            }
            if (placement.getAdmx()) {
                setAdmx(placement.getAdmx());
            }
            if (placement.getCurlx()) {
                setCurlx(placement.getCurlx());
            }
            if (placement.hasDisplay()) {
                mergeDisplay(placement.getDisplay());
            }
            if (placement.hasVideo()) {
                mergeVideo(placement.getVideo());
            }
            if (placement.hasExt()) {
                mergeExt(placement.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!placement.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = placement.extProto_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(placement.extProto_);
                    }
                    onChanged();
                }
            } else if (!placement.extProto_.isEmpty()) {
                if (!this.extProtoBuilder_.t()) {
                    this.extProtoBuilder_.a(placement.extProto_);
                } else {
                    this.extProtoBuilder_.h();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = placement.extProto_;
                    this.bitField0_ &= -33;
                    this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                }
            }
            mergeUnknownFields(((j0) placement).unknownFields);
            onChanged();
            return this;
        }

        public Builder addExtProto(Any.Builder builder) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(builder.build());
                onChanged();
            } else {
                z1Var.e(builder.build());
            }
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.tagid_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            r0 r0Var = q0.f10776d;
            this.bcat_ = r0Var;
            this.cattax_ = 0;
            this.badv_ = r0Var;
            this.bapp_ = r0Var;
            this.battr_ = Collections.emptyList();
            this.wlang_ = r0Var;
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder addExtProto(int i10, Any.Builder builder) {
            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
            if (z1Var == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(i10, builder.build());
                onChanged();
            } else {
                z1Var.d(i10, builder.build());
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            Placement placement = null;
            try {
                try {
                    Placement placement2 = (Placement) Placement.PARSER.parsePartialFrom(nVar, yVar);
                    if (placement2 != null) {
                        mergeFrom(placement2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Placement placement3 = (Placement) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        placement = placement3;
                        if (placement != null) {
                            mergeFrom(placement);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (placement != null) {
                    mergeFrom(placement);
                }
                throw th;
            }
        }
    }

    public static final class DisplayPlacement extends j0 implements DisplayPlacementOrBuilder {
        public static final int AMPREN_FIELD_NUMBER = 6;
        public static final int API_FIELD_NUMBER = 10;
        public static final int CLKTYPE_FIELD_NUMBER = 5;
        public static final int CONTEXT_FIELD_NUMBER = 8;
        public static final int CTYPE_FIELD_NUMBER = 11;
        public static final int DISPLAYFMT_FIELD_NUMBER = 16;
        public static final int EVENT_FIELD_NUMBER = 18;
        public static final int EXT_FIELD_NUMBER = 20;
        public static final int EXT_PROTO_FIELD_NUMBER = 19;
        public static final int H_FIELD_NUMBER = 13;
        public static final int IFRBUST_FIELD_NUMBER = 4;
        public static final int INSTL_FIELD_NUMBER = 2;
        public static final int MIME_FIELD_NUMBER = 9;
        public static final int NATIVEFMT_FIELD_NUMBER = 17;
        public static final int POS_FIELD_NUMBER = 1;
        public static final int PRIV_FIELD_NUMBER = 15;
        public static final int PTYPE_FIELD_NUMBER = 7;
        public static final int TOPFRAME_FIELD_NUMBER = 3;
        public static final int UNIT_FIELD_NUMBER = 14;
        public static final int W_FIELD_NUMBER = 12;
        private static final long serialVersionUID = 0;
        private int ampren_;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private int clktype_;
        private int context_;
        private int ctypeMemoizedSerializedSize;
        private List<Integer> ctype_;
        private List<DisplayFormat> displayfmt_;
        private List<EventSpec> event_;
        private List<Any> extProto_;
        private Struct ext_;
        private int h_;
        private r0 ifrbust_;
        private boolean instl_;
        private byte memoizedIsInitialized;
        private r0 mime_;
        private NativeFormat nativefmt_;
        private int pos_;
        private boolean priv_;
        private int ptype_;
        private boolean topframe_;
        private int unit_;
        private int w_;
        private static final l0.h.a<Integer, ApiFramework> api_converter_ = new l0.h.a<Integer, ApiFramework>() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.1
            @Override // com.explorestack.protobuf.l0.h.a
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final l0.h.a<Integer, DisplayCreativeType> ctype_converter_ = new l0.h.a<Integer, DisplayCreativeType>() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.2
            @Override // com.explorestack.protobuf.l0.h.a
            public DisplayCreativeType convert(Integer num) {
                DisplayCreativeType displayCreativeTypeValueOf = DisplayCreativeType.valueOf(num.intValue());
                return displayCreativeTypeValueOf == null ? DisplayCreativeType.UNRECOGNIZED : displayCreativeTypeValueOf;
            }
        };
        private static final DisplayPlacement DEFAULT_INSTANCE = new DisplayPlacement();
        private static final s1<DisplayPlacement> PARSER = new com.explorestack.protobuf.b<DisplayPlacement>() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.3
            @Override // com.explorestack.protobuf.s1
            public DisplayPlacement parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new DisplayPlacement(nVar, yVar);
            }
        };

        public static final class Builder extends j0.b<Builder> implements DisplayPlacementOrBuilder {
            private int ampren_;
            private List<Integer> api_;
            private int bitField0_;
            private int clktype_;
            private int context_;
            private List<Integer> ctype_;
            private z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> displayfmtBuilder_;
            private List<DisplayFormat> displayfmt_;
            private z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> eventBuilder_;
            private List<EventSpec> event_;
            private e2<Struct, Struct.Builder, i2> extBuilder_;
            private z1<Any, Any.Builder, e> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private r0 ifrbust_;
            private boolean instl_;
            private r0 mime_;
            private e2<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> nativefmtBuilder_;
            private NativeFormat nativefmt_;
            private int pos_;
            private boolean priv_;
            private int ptype_;
            private boolean topframe_;
            private int unit_;
            private int w_;

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureCtypeIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.ctype_ = new ArrayList(this.ctype_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureDisplayfmtIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.displayfmt_ = new ArrayList(this.displayfmt_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureEventIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.event_ = new ArrayList(this.event_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 64) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 64;
                }
            }

            private void ensureIfrbustIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.ifrbust_ = new q0(this.ifrbust_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.mime_ = new q0(this.mime_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.G;
            }

            private z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> getDisplayfmtFieldBuilder() {
                if (this.displayfmtBuilder_ == null) {
                    this.displayfmtBuilder_ = new z1<>(this.displayfmt_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.displayfmt_ = null;
                }
                return this.displayfmtBuilder_;
            }

            private z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> getEventFieldBuilder() {
                if (this.eventBuilder_ == null) {
                    this.eventBuilder_ = new z1<>(this.event_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
                    this.event_ = null;
                }
                return this.eventBuilder_;
            }

            private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private e2<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> getNativefmtFieldBuilder() {
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmtBuilder_ = new e2<>(getNativefmt(), getParentForChildren(), isClean());
                    this.nativefmt_ = null;
                }
                return this.nativefmtBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getDisplayfmtFieldBuilder();
                    getEventFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                Iterator<? extends ApiFramework> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                Iterator<Integer> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().intValue()));
                }
                onChanged();
                return this;
            }

            public Builder addAllCtype(Iterable<? extends DisplayCreativeType> iterable) {
                ensureCtypeIsMutable();
                Iterator<? extends DisplayCreativeType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.ctype_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllCtypeValue(Iterable<Integer> iterable) {
                ensureCtypeIsMutable();
                Iterator<Integer> it = iterable.iterator();
                while (it.hasNext()) {
                    this.ctype_.add(Integer.valueOf(it.next().intValue()));
                }
                onChanged();
                return this;
            }

            public Builder addAllDisplayfmt(Iterable<? extends DisplayFormat> iterable) {
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                if (z1Var == null) {
                    ensureDisplayfmtIsMutable();
                    com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.displayfmt_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addAllEvent(Iterable<? extends EventSpec> iterable) {
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    ensureEventIsMutable();
                    com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.event_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addAllIfrbust(Iterable<String> iterable) {
                ensureIfrbustIsMutable();
                com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.ifrbust_);
                onChanged();
                return this;
            }

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.mime_);
                onChanged();
                return this;
            }

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i10) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addCtype(DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addCtypeValue(int i10) {
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addDisplayfmt(DisplayFormat displayFormat) {
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                if (z1Var == null) {
                    displayFormat.getClass();
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(displayFormat);
                    onChanged();
                } else {
                    z1Var.e(displayFormat);
                }
                return this;
            }

            public DisplayFormat.Builder addDisplayfmtBuilder() {
                return (DisplayFormat.Builder) getDisplayfmtFieldBuilder().c(DisplayFormat.getDefaultInstance());
            }

            public Builder addEvent(EventSpec eventSpec) {
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    eventSpec.getClass();
                    ensureEventIsMutable();
                    this.event_.add(eventSpec);
                    onChanged();
                } else {
                    z1Var.e(eventSpec);
                }
                return this;
            }

            public EventSpec.Builder addEventBuilder() {
                return (EventSpec.Builder) getEventFieldBuilder().c(EventSpec.getDefaultInstance());
            }

            public Builder addExtProto(Any any) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    z1Var.e(any);
                }
                return this;
            }

            public Any.Builder addExtProtoBuilder() {
                return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
            }

            public Builder addIfrbust(String str) {
                str.getClass();
                ensureIfrbustIsMutable();
                this.ifrbust_.add(str);
                onChanged();
                return this;
            }

            public Builder addIfrbustBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensureIfrbustIsMutable();
                this.ifrbust_.b(byteString);
                onChanged();
                return this;
            }

            public Builder addMime(String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.add(str);
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensureMimeIsMutable();
                this.mime_.b(byteString);
                onChanged();
                return this;
            }

            public Builder clearAmpren() {
                this.ampren_ = 0;
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearClktype() {
                this.clktype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearContext() {
                this.context_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCtype() {
                this.ctype_ = Collections.emptyList();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearDisplayfmt() {
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                if (z1Var == null) {
                    this.displayfmt_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder clearEvent() {
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    this.event_ = Collections.emptyList();
                    this.bitField0_ &= -33;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                return this;
            }

            public Builder clearExtProto() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -65;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIfrbust() {
                this.ifrbust_ = q0.f10776d;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearInstl() {
                this.instl_ = false;
                onChanged();
                return this;
            }

            public Builder clearMime() {
                this.mime_ = q0.f10776d;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearNativefmt() {
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmt_ = null;
                    onChanged();
                } else {
                    this.nativefmt_ = null;
                    this.nativefmtBuilder_ = null;
                }
                return this;
            }

            public Builder clearPos() {
                this.pos_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPriv() {
                this.priv_ = false;
                onChanged();
                return this;
            }

            public Builder clearPtype() {
                this.ptype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTopframe() {
                this.topframe_ = false;
                onChanged();
                return this;
            }

            public Builder clearUnit() {
                this.unit_ = 0;
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.w_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getAmpren() {
                return this.ampren_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) DisplayPlacement.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<ApiFramework> getApiList() {
                return new l0.h(this.api_, DisplayPlacement.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ClickType getClktype() {
                ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
                return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getClktypeValue() {
                return this.clktype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayContextType getContext() {
                DisplayContextType displayContextTypeValueOf = DisplayContextType.valueOf(this.context_);
                return displayContextTypeValueOf == null ? DisplayContextType.UNRECOGNIZED : displayContextTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getContextValue() {
                return this.context_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayCreativeType getCtype(int i10) {
                return (DisplayCreativeType) DisplayPlacement.ctype_converter_.convert(this.ctype_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getCtypeCount() {
                return this.ctype_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<DisplayCreativeType> getCtypeList() {
                return new l0.h(this.ctype_, DisplayPlacement.ctype_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getCtypeValue(int i10) {
                return this.ctype_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<Integer> getCtypeValueList() {
                return Collections.unmodifiableList(this.ctype_);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.G;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayFormat getDisplayfmt(int i10) {
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                return z1Var == null ? this.displayfmt_.get(i10) : (DisplayFormat) z1Var.n(i10);
            }

            public DisplayFormat.Builder getDisplayfmtBuilder(int i10) {
                return (DisplayFormat.Builder) getDisplayfmtFieldBuilder().k(i10);
            }

            public List<DisplayFormat.Builder> getDisplayfmtBuilderList() {
                return getDisplayfmtFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getDisplayfmtCount() {
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                return z1Var == null ? this.displayfmt_.size() : z1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<DisplayFormat> getDisplayfmtList() {
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.displayfmt_) : z1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i10) {
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                return z1Var == null ? this.displayfmt_.get(i10) : (DisplayFormatOrBuilder) z1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<? extends DisplayFormatOrBuilder> getDisplayfmtOrBuilderList() {
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.displayfmt_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public EventSpec getEvent(int i10) {
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var = this.eventBuilder_;
                return z1Var == null ? this.event_.get(i10) : (EventSpec) z1Var.n(i10);
            }

            public EventSpec.Builder getEventBuilder(int i10) {
                return (EventSpec.Builder) getEventFieldBuilder().k(i10);
            }

            public List<EventSpec.Builder> getEventBuilderList() {
                return getEventFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getEventCount() {
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var = this.eventBuilder_;
                return z1Var == null ? this.event_.size() : z1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<EventSpec> getEventList() {
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var = this.eventBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.event_) : z1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public EventSpecOrBuilder getEventOrBuilder(int i10) {
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var = this.eventBuilder_;
                return z1Var == null ? this.event_.get(i10) : (EventSpecOrBuilder) z1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<? extends EventSpecOrBuilder> getEventOrBuilderList() {
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var = this.eventBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.event_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public Struct getExt() {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var != null) {
                    return (Struct) e2Var.e();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return (Struct.Builder) getExtFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public i2 getExtOrBuilder() {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var != null) {
                    return (i2) e2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public Any getExtProto(int i10) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
            }

            public Any.Builder getExtProtoBuilder(int i10) {
                return (Any.Builder) getExtProtoFieldBuilder().k(i10);
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getExtProtoCount() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.size() : z1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<Any> getExtProtoList() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public String getIfrbust(int i10) {
                return this.ifrbust_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ByteString getIfrbustBytes(int i10) {
                return this.ifrbust_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getIfrbustCount() {
                return this.ifrbust_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean getInstl() {
                return this.instl_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public String getMime(int i10) {
                return this.mime_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public ByteString getMimeBytes(int i10) {
                return this.mime_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public NativeFormat getNativefmt() {
                e2<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> e2Var = this.nativefmtBuilder_;
                if (e2Var != null) {
                    return (NativeFormat) e2Var.e();
                }
                NativeFormat nativeFormat = this.nativefmt_;
                return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
            }

            public NativeFormat.Builder getNativefmtBuilder() {
                onChanged();
                return (NativeFormat.Builder) getNativefmtFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public NativeFormatOrBuilder getNativefmtOrBuilder() {
                e2<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> e2Var = this.nativefmtBuilder_;
                if (e2Var != null) {
                    return (NativeFormatOrBuilder) e2Var.f();
                }
                NativeFormat nativeFormat = this.nativefmt_;
                return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public PlacementPosition getPos() {
                PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
                return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getPosValue() {
                return this.pos_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean getPriv() {
                return this.priv_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public DisplayPlacementType getPtype() {
                DisplayPlacementType displayPlacementTypeValueOf = DisplayPlacementType.valueOf(this.ptype_);
                return displayPlacementTypeValueOf == null ? DisplayPlacementType.UNRECOGNIZED : displayPlacementTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getPtypeValue() {
                return this.ptype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean getTopframe() {
                return this.topframe_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public SizeUnit getUnit() {
                SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
                return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getUnitValue() {
                return this.unit_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public boolean hasNativefmt() {
                return (this.nativefmtBuilder_ == null && this.nativefmt_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return b.H.d(DisplayPlacement.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeExt(Struct struct) {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var == null) {
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                } else {
                    e2Var.g(struct);
                }
                return this;
            }

            public Builder mergeNativefmt(NativeFormat nativeFormat) {
                e2<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> e2Var = this.nativefmtBuilder_;
                if (e2Var == null) {
                    NativeFormat nativeFormat2 = this.nativefmt_;
                    if (nativeFormat2 != null) {
                        this.nativefmt_ = NativeFormat.newBuilder(nativeFormat2).mergeFrom(nativeFormat).buildPartial();
                    } else {
                        this.nativefmt_ = nativeFormat;
                    }
                    onChanged();
                } else {
                    e2Var.g(nativeFormat);
                }
                return this;
            }

            public Builder removeDisplayfmt(int i10) {
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                if (z1Var == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder removeEvent(int i10) {
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    ensureEventIsMutable();
                    this.event_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder removeExtProto(int i10) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder setAmpren(int i10) {
                this.ampren_ = i10;
                onChanged();
                return this;
            }

            public Builder setApi(int i10, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i10, int i11) {
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setClktype(ClickType clickType) {
                clickType.getClass();
                this.clktype_ = clickType.getNumber();
                onChanged();
                return this;
            }

            public Builder setClktypeValue(int i10) {
                this.clktype_ = i10;
                onChanged();
                return this;
            }

            public Builder setContext(DisplayContextType displayContextType) {
                displayContextType.getClass();
                this.context_ = displayContextType.getNumber();
                onChanged();
                return this;
            }

            public Builder setContextValue(int i10) {
                this.context_ = i10;
                onChanged();
                return this;
            }

            public Builder setCtype(int i10, DisplayCreativeType displayCreativeType) {
                displayCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.set(i10, Integer.valueOf(displayCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setCtypeValue(int i10, int i11) {
                ensureCtypeIsMutable();
                this.ctype_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setDisplayfmt(int i10, DisplayFormat displayFormat) {
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                if (z1Var == null) {
                    displayFormat.getClass();
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.set(i10, displayFormat);
                    onChanged();
                } else {
                    z1Var.w(i10, displayFormat);
                }
                return this;
            }

            public Builder setEvent(int i10, EventSpec eventSpec) {
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    eventSpec.getClass();
                    ensureEventIsMutable();
                    this.event_.set(i10, eventSpec);
                    onChanged();
                } else {
                    z1Var.w(i10, eventSpec);
                }
                return this;
            }

            public Builder setExt(Struct struct) {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var == null) {
                    struct.getClass();
                    this.ext_ = struct;
                    onChanged();
                } else {
                    e2Var.i(struct);
                }
                return this;
            }

            public Builder setExtProto(int i10, Any any) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i10, any);
                    onChanged();
                } else {
                    z1Var.w(i10, any);
                }
                return this;
            }

            public Builder setH(int i10) {
                this.h_ = i10;
                onChanged();
                return this;
            }

            public Builder setIfrbust(int i10, String str) {
                str.getClass();
                ensureIfrbustIsMutable();
                this.ifrbust_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setInstl(boolean z10) {
                this.instl_ = z10;
                onChanged();
                return this;
            }

            public Builder setMime(int i10, String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setNativefmt(NativeFormat nativeFormat) {
                e2<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> e2Var = this.nativefmtBuilder_;
                if (e2Var == null) {
                    nativeFormat.getClass();
                    this.nativefmt_ = nativeFormat;
                    onChanged();
                } else {
                    e2Var.i(nativeFormat);
                }
                return this;
            }

            public Builder setPos(PlacementPosition placementPosition) {
                placementPosition.getClass();
                this.pos_ = placementPosition.getNumber();
                onChanged();
                return this;
            }

            public Builder setPosValue(int i10) {
                this.pos_ = i10;
                onChanged();
                return this;
            }

            public Builder setPriv(boolean z10) {
                this.priv_ = z10;
                onChanged();
                return this;
            }

            public Builder setPtype(DisplayPlacementType displayPlacementType) {
                displayPlacementType.getClass();
                this.ptype_ = displayPlacementType.getNumber();
                onChanged();
                return this;
            }

            public Builder setPtypeValue(int i10) {
                this.ptype_ = i10;
                onChanged();
                return this;
            }

            public Builder setTopframe(boolean z10) {
                this.topframe_ = z10;
                onChanged();
                return this;
            }

            public Builder setUnit(SizeUnit sizeUnit) {
                sizeUnit.getClass();
                this.unit_ = sizeUnit.getNumber();
                onChanged();
                return this;
            }

            public Builder setUnitValue(int i10) {
                this.unit_ = i10;
                onChanged();
                return this;
            }

            public Builder setW(int i10) {
                this.w_ = i10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public w1 getIfrbustList() {
                return this.ifrbust_.getUnmodifiableView();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
            public w1 getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            private Builder() {
                this.pos_ = 0;
                r0 r0Var = q0.f10776d;
                this.ifrbust_ = r0Var;
                this.clktype_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = r0Var;
                this.api_ = Collections.emptyList();
                this.ctype_ = Collections.emptyList();
                this.unit_ = 0;
                this.displayfmt_ = Collections.emptyList();
                this.event_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public DisplayPlacement build() {
                DisplayPlacement displayPlacementBuildPartial = buildPartial();
                if (displayPlacementBuildPartial.isInitialized()) {
                    return displayPlacementBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) displayPlacementBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public DisplayPlacement buildPartial() {
                DisplayPlacement displayPlacement = new DisplayPlacement(this);
                displayPlacement.pos_ = this.pos_;
                displayPlacement.instl_ = this.instl_;
                displayPlacement.topframe_ = this.topframe_;
                if ((this.bitField0_ & 1) != 0) {
                    this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                displayPlacement.ifrbust_ = this.ifrbust_;
                displayPlacement.clktype_ = this.clktype_;
                displayPlacement.ampren_ = this.ampren_;
                displayPlacement.ptype_ = this.ptype_;
                displayPlacement.context_ = this.context_;
                if ((this.bitField0_ & 2) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                displayPlacement.mime_ = this.mime_;
                if ((this.bitField0_ & 4) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -5;
                }
                displayPlacement.api_ = this.api_;
                if ((this.bitField0_ & 8) != 0) {
                    this.ctype_ = Collections.unmodifiableList(this.ctype_);
                    this.bitField0_ &= -9;
                }
                displayPlacement.ctype_ = this.ctype_;
                displayPlacement.w_ = this.w_;
                displayPlacement.h_ = this.h_;
                displayPlacement.unit_ = this.unit_;
                displayPlacement.priv_ = this.priv_;
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                if (z1Var != null) {
                    displayPlacement.displayfmt_ = z1Var.f();
                } else {
                    if ((this.bitField0_ & 16) != 0) {
                        this.displayfmt_ = Collections.unmodifiableList(this.displayfmt_);
                        this.bitField0_ &= -17;
                    }
                    displayPlacement.displayfmt_ = this.displayfmt_;
                }
                e2<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> e2Var = this.nativefmtBuilder_;
                if (e2Var == null) {
                    displayPlacement.nativefmt_ = this.nativefmt_;
                } else {
                    displayPlacement.nativefmt_ = (NativeFormat) e2Var.a();
                }
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var2 = this.eventBuilder_;
                if (z1Var2 != null) {
                    displayPlacement.event_ = z1Var2.f();
                } else {
                    if ((this.bitField0_ & 32) != 0) {
                        this.event_ = Collections.unmodifiableList(this.event_);
                        this.bitField0_ &= -33;
                    }
                    displayPlacement.event_ = this.event_;
                }
                e2<Struct, Struct.Builder, i2> e2Var2 = this.extBuilder_;
                if (e2Var2 == null) {
                    displayPlacement.ext_ = this.ext_;
                } else {
                    displayPlacement.ext_ = (Struct) e2Var2.a();
                }
                z1<Any, Any.Builder, e> z1Var3 = this.extProtoBuilder_;
                if (z1Var3 != null) {
                    displayPlacement.extProto_ = z1Var3.f();
                } else {
                    if ((this.bitField0_ & 64) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -65;
                    }
                    displayPlacement.extProto_ = this.extProto_;
                }
                onBuilt();
                return displayPlacement;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public DisplayPlacement mo164getDefaultInstanceForType() {
                return DisplayPlacement.getDefaultInstance();
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

            public DisplayFormat.Builder addDisplayfmtBuilder(int i10) {
                return (DisplayFormat.Builder) getDisplayfmtFieldBuilder().b(i10, DisplayFormat.getDefaultInstance());
            }

            public EventSpec.Builder addEventBuilder(int i10) {
                return (EventSpec.Builder) getEventFieldBuilder().b(i10, EventSpec.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i10) {
                return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
                this.pos_ = 0;
                this.instl_ = false;
                this.topframe_ = false;
                r0 r0Var = q0.f10776d;
                this.ifrbust_ = r0Var;
                int i10 = this.bitField0_ & (-2);
                this.clktype_ = 0;
                this.ampren_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = r0Var;
                this.bitField0_ = i10 & (-3);
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -5;
                this.ctype_ = Collections.emptyList();
                this.bitField0_ &= -9;
                this.w_ = 0;
                this.h_ = 0;
                this.unit_ = 0;
                this.priv_ = false;
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                if (z1Var == null) {
                    this.displayfmt_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                } else {
                    z1Var.g();
                }
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmt_ = null;
                } else {
                    this.nativefmt_ = null;
                    this.nativefmtBuilder_ = null;
                }
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var2 = this.eventBuilder_;
                if (z1Var2 == null) {
                    this.event_ = Collections.emptyList();
                    this.bitField0_ &= -33;
                } else {
                    z1Var2.g();
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                z1<Any, Any.Builder, e> z1Var3 = this.extProtoBuilder_;
                if (z1Var3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -65;
                } else {
                    z1Var3.g();
                }
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var == null) {
                    this.ext_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder setNativefmt(NativeFormat.Builder builder) {
                e2<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> e2Var = this.nativefmtBuilder_;
                if (e2Var == null) {
                    this.nativefmt_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder addDisplayfmt(int i10, DisplayFormat displayFormat) {
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                if (z1Var == null) {
                    displayFormat.getClass();
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(i10, displayFormat);
                    onChanged();
                } else {
                    z1Var.d(i10, displayFormat);
                }
                return this;
            }

            public Builder addEvent(int i10, EventSpec eventSpec) {
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    eventSpec.getClass();
                    ensureEventIsMutable();
                    this.event_.add(i10, eventSpec);
                    onChanged();
                } else {
                    z1Var.d(i10, eventSpec);
                }
                return this;
            }

            public Builder addExtProto(int i10, Any any) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i10, any);
                    onChanged();
                } else {
                    z1Var.d(i10, any);
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
                if (message instanceof DisplayPlacement) {
                    return mergeFrom((DisplayPlacement) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDisplayfmt(int i10, DisplayFormat.Builder builder) {
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                if (z1Var == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            public Builder setEvent(int i10, EventSpec.Builder builder) {
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    ensureEventIsMutable();
                    this.event_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            public Builder setExtProto(int i10, Any.Builder builder) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(DisplayPlacement displayPlacement) {
                if (displayPlacement == DisplayPlacement.getDefaultInstance()) {
                    return this;
                }
                if (displayPlacement.pos_ != 0) {
                    setPosValue(displayPlacement.getPosValue());
                }
                if (displayPlacement.getInstl()) {
                    setInstl(displayPlacement.getInstl());
                }
                if (displayPlacement.getTopframe()) {
                    setTopframe(displayPlacement.getTopframe());
                }
                if (!displayPlacement.ifrbust_.isEmpty()) {
                    if (this.ifrbust_.isEmpty()) {
                        this.ifrbust_ = displayPlacement.ifrbust_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureIfrbustIsMutable();
                        this.ifrbust_.addAll(displayPlacement.ifrbust_);
                    }
                    onChanged();
                }
                if (displayPlacement.clktype_ != 0) {
                    setClktypeValue(displayPlacement.getClktypeValue());
                }
                if (displayPlacement.getAmpren() != 0) {
                    setAmpren(displayPlacement.getAmpren());
                }
                if (displayPlacement.ptype_ != 0) {
                    setPtypeValue(displayPlacement.getPtypeValue());
                }
                if (displayPlacement.context_ != 0) {
                    setContextValue(displayPlacement.getContextValue());
                }
                if (!displayPlacement.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = displayPlacement.mime_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(displayPlacement.mime_);
                    }
                    onChanged();
                }
                if (!displayPlacement.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = displayPlacement.api_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(displayPlacement.api_);
                    }
                    onChanged();
                }
                if (!displayPlacement.ctype_.isEmpty()) {
                    if (this.ctype_.isEmpty()) {
                        this.ctype_ = displayPlacement.ctype_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureCtypeIsMutable();
                        this.ctype_.addAll(displayPlacement.ctype_);
                    }
                    onChanged();
                }
                if (displayPlacement.getW() != 0) {
                    setW(displayPlacement.getW());
                }
                if (displayPlacement.getH() != 0) {
                    setH(displayPlacement.getH());
                }
                if (displayPlacement.unit_ != 0) {
                    setUnitValue(displayPlacement.getUnitValue());
                }
                if (displayPlacement.getPriv()) {
                    setPriv(displayPlacement.getPriv());
                }
                if (this.displayfmtBuilder_ == null) {
                    if (!displayPlacement.displayfmt_.isEmpty()) {
                        if (this.displayfmt_.isEmpty()) {
                            this.displayfmt_ = displayPlacement.displayfmt_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureDisplayfmtIsMutable();
                            this.displayfmt_.addAll(displayPlacement.displayfmt_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.displayfmt_.isEmpty()) {
                    if (!this.displayfmtBuilder_.t()) {
                        this.displayfmtBuilder_.a(displayPlacement.displayfmt_);
                    } else {
                        this.displayfmtBuilder_.h();
                        this.displayfmtBuilder_ = null;
                        this.displayfmt_ = displayPlacement.displayfmt_;
                        this.bitField0_ &= -17;
                        this.displayfmtBuilder_ = j0.alwaysUseFieldBuilders ? getDisplayfmtFieldBuilder() : null;
                    }
                }
                if (displayPlacement.hasNativefmt()) {
                    mergeNativefmt(displayPlacement.getNativefmt());
                }
                if (this.eventBuilder_ == null) {
                    if (!displayPlacement.event_.isEmpty()) {
                        if (this.event_.isEmpty()) {
                            this.event_ = displayPlacement.event_;
                            this.bitField0_ &= -33;
                        } else {
                            ensureEventIsMutable();
                            this.event_.addAll(displayPlacement.event_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.event_.isEmpty()) {
                    if (!this.eventBuilder_.t()) {
                        this.eventBuilder_.a(displayPlacement.event_);
                    } else {
                        this.eventBuilder_.h();
                        this.eventBuilder_ = null;
                        this.event_ = displayPlacement.event_;
                        this.bitField0_ &= -33;
                        this.eventBuilder_ = j0.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                    }
                }
                if (displayPlacement.hasExt()) {
                    mergeExt(displayPlacement.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!displayPlacement.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = displayPlacement.extProto_;
                            this.bitField0_ &= -65;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(displayPlacement.extProto_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(displayPlacement.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = displayPlacement.extProto_;
                        this.bitField0_ &= -65;
                        this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) displayPlacement).unknownFields);
                onChanged();
                return this;
            }

            public Builder addDisplayfmt(DisplayFormat.Builder builder) {
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                if (z1Var == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addEvent(EventSpec.Builder builder) {
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    ensureEventIsMutable();
                    this.event_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.pos_ = 0;
                r0 r0Var = q0.f10776d;
                this.ifrbust_ = r0Var;
                this.clktype_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = r0Var;
                this.api_ = Collections.emptyList();
                this.ctype_ = Collections.emptyList();
                this.unit_ = 0;
                this.displayfmt_ = Collections.emptyList();
                this.event_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addDisplayfmt(int i10, DisplayFormat.Builder builder) {
                z1<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> z1Var = this.displayfmtBuilder_;
                if (z1Var == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            public Builder addEvent(int i10, EventSpec.Builder builder) {
                z1<EventSpec, EventSpec.Builder, EventSpecOrBuilder> z1Var = this.eventBuilder_;
                if (z1Var == null) {
                    ensureEventIsMutable();
                    this.event_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i10, Any.Builder builder) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                DisplayPlacement displayPlacement = null;
                try {
                    try {
                        DisplayPlacement displayPlacement2 = (DisplayPlacement) DisplayPlacement.PARSER.parsePartialFrom(nVar, yVar);
                        if (displayPlacement2 != null) {
                            mergeFrom(displayPlacement2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        DisplayPlacement displayPlacement3 = (DisplayPlacement) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            displayPlacement = displayPlacement3;
                            if (displayPlacement != null) {
                                mergeFrom(displayPlacement);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (displayPlacement != null) {
                        mergeFrom(displayPlacement);
                    }
                    throw th;
                }
            }
        }

        public static final class DisplayFormat extends j0 implements DisplayFormatOrBuilder {
            public static final int EXPDIR_FIELD_NUMBER = 5;
            public static final int EXT_FIELD_NUMBER = 7;
            public static final int EXT_PROTO_FIELD_NUMBER = 6;
            public static final int HRATIO_FIELD_NUMBER = 4;
            public static final int H_FIELD_NUMBER = 2;
            public static final int WRATIO_FIELD_NUMBER = 3;
            public static final int W_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int expdirMemoizedSerializedSize;
            private List<Integer> expdir_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private int hratio_;
            private byte memoizedIsInitialized;
            private int w_;
            private int wratio_;
            private static final l0.h.a<Integer, ExpandableDirection> expdir_converter_ = new l0.h.a<Integer, ExpandableDirection>() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.1
                @Override // com.explorestack.protobuf.l0.h.a
                public ExpandableDirection convert(Integer num) {
                    ExpandableDirection expandableDirectionValueOf = ExpandableDirection.valueOf(num.intValue());
                    return expandableDirectionValueOf == null ? ExpandableDirection.UNRECOGNIZED : expandableDirectionValueOf;
                }
            };
            private static final DisplayFormat DEFAULT_INSTANCE = new DisplayFormat();
            private static final s1<DisplayFormat> PARSER = new com.explorestack.protobuf.b<DisplayFormat>() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.2
                @Override // com.explorestack.protobuf.s1
                public DisplayFormat parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new DisplayFormat(nVar, yVar);
                }
            };

            public static DisplayFormat getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.I;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static DisplayFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (DisplayFormat) j0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DisplayFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static s1<DisplayFormat> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DisplayFormat)) {
                    return super.equals(obj);
                }
                DisplayFormat displayFormat = (DisplayFormat) obj;
                if (getW() == displayFormat.getW() && getH() == displayFormat.getH() && getWratio() == displayFormat.getWratio() && getHratio() == displayFormat.getHratio() && this.expdir_.equals(displayFormat.expdir_) && hasExt() == displayFormat.hasExt()) {
                    return (!hasExt() || getExt().equals(displayFormat.getExt())) && getExtProtoList().equals(displayFormat.getExtProtoList()) && this.unknownFields.equals(displayFormat.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public ExpandableDirection getExpdir(int i10) {
                return expdir_converter_.convert(this.expdir_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getExpdirCount() {
                return this.expdir_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<ExpandableDirection> getExpdirList() {
                return new l0.h(this.expdir_, expdir_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getExpdirValue(int i10) {
                return this.expdir_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<Integer> getExpdirValueList() {
                return this.expdir_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public i2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getHratio() {
                return this.hratio_;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public s1<DisplayFormat> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int i11 = this.w_;
                int iY = i11 != 0 ? CodedOutputStream.Y(1, i11) + 0 : 0;
                int i12 = this.h_;
                if (i12 != 0) {
                    iY += CodedOutputStream.Y(2, i12);
                }
                int i13 = this.wratio_;
                if (i13 != 0) {
                    iY += CodedOutputStream.Y(3, i13);
                }
                int i14 = this.hratio_;
                if (i14 != 0) {
                    iY += CodedOutputStream.Y(4, i14);
                }
                int iM = 0;
                for (int i15 = 0; i15 < this.expdir_.size(); i15++) {
                    iM += CodedOutputStream.m(this.expdir_.get(i15).intValue());
                }
                int iG = iY + iM;
                if (!getExpdirList().isEmpty()) {
                    iG = iG + 1 + CodedOutputStream.Z(iM);
                }
                this.expdirMemoizedSerializedSize = iM;
                for (int i16 = 0; i16 < this.extProto_.size(); i16++) {
                    iG += CodedOutputStream.G(6, this.extProto_.get(i16));
                }
                if (this.ext_ != null) {
                    iG += CodedOutputStream.G(7, getExt());
                }
                int serializedSize = iG + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
            public final u2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public int getWratio() {
                return this.wratio_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getW()) * 37) + 2) * 53) + getH()) * 37) + 3) * 53) + getWratio()) * 37) + 4) * 53) + getHratio();
                if (getExpdirCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + this.expdir_.hashCode();
                }
                if (hasExt()) {
                    iHashCode = (((iHashCode * 37) + 7) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 6) * 53) + getExtProtoList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.j0
            protected j0.f internalGetFieldAccessorTable() {
                return b.J.d(DisplayFormat.class, Builder.class);
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
                return new DisplayFormat();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                int i10 = this.w_;
                if (i10 != 0) {
                    codedOutputStream.c1(1, i10);
                }
                int i11 = this.h_;
                if (i11 != 0) {
                    codedOutputStream.c1(2, i11);
                }
                int i12 = this.wratio_;
                if (i12 != 0) {
                    codedOutputStream.c1(3, i12);
                }
                int i13 = this.hratio_;
                if (i13 != 0) {
                    codedOutputStream.c1(4, i13);
                }
                if (getExpdirList().size() > 0) {
                    codedOutputStream.d1(42);
                    codedOutputStream.d1(this.expdirMemoizedSerializedSize);
                }
                for (int i14 = 0; i14 < this.expdir_.size(); i14++) {
                    codedOutputStream.w0(this.expdir_.get(i14).intValue());
                }
                for (int i15 = 0; i15 < this.extProto_.size(); i15++) {
                    codedOutputStream.L0(6, this.extProto_.get(i15));
                }
                if (this.ext_ != null) {
                    codedOutputStream.L0(7, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class Builder extends j0.b<Builder> implements DisplayFormatOrBuilder {
                private int bitField0_;
                private List<Integer> expdir_;
                private e2<Struct, Struct.Builder, i2> extBuilder_;
                private z1<Any, Any.Builder, e> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private int h_;
                private int hratio_;
                private int w_;
                private int wratio_;

                private void ensureExpdirIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.expdir_ = new ArrayList(this.expdir_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.I;
                }

                private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (j0.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllExpdir(Iterable<? extends ExpandableDirection> iterable) {
                    ensureExpdirIsMutable();
                    Iterator<? extends ExpandableDirection> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.expdir_.add(Integer.valueOf(it.next().getNumber()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllExpdirValue(Iterable<Integer> iterable) {
                    ensureExpdirIsMutable();
                    Iterator<Integer> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.expdir_.add(Integer.valueOf(it.next().intValue()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                        onChanged();
                    } else {
                        z1Var.a(iterable);
                    }
                    return this;
                }

                public Builder addExpdir(ExpandableDirection expandableDirection) {
                    expandableDirection.getClass();
                    ensureExpdirIsMutable();
                    this.expdir_.add(Integer.valueOf(expandableDirection.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder addExpdirValue(int i10) {
                    ensureExpdirIsMutable();
                    this.expdir_.add(Integer.valueOf(i10));
                    onChanged();
                    return this;
                }

                public Builder addExtProto(Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                    } else {
                        z1Var.e(any);
                    }
                    return this;
                }

                public Any.Builder addExtProtoBuilder() {
                    return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                }

                public Builder clearExpdir() {
                    this.expdir_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearExtProto() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                        onChanged();
                    } else {
                        z1Var.g();
                    }
                    return this;
                }

                public Builder clearH() {
                    this.h_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearHratio() {
                    this.hratio_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearW() {
                    this.w_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWratio() {
                    this.wratio_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.I;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public ExpandableDirection getExpdir(int i10) {
                    return (ExpandableDirection) DisplayFormat.expdir_converter_.convert(this.expdir_.get(i10));
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getExpdirCount() {
                    return this.expdir_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<ExpandableDirection> getExpdirList() {
                    return new l0.h(this.expdir_, DisplayFormat.expdir_converter_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getExpdirValue(int i10) {
                    return this.expdir_.get(i10).intValue();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<Integer> getExpdirValueList() {
                    return Collections.unmodifiableList(this.expdir_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public Struct getExt() {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var != null) {
                        return (Struct) e2Var.e();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return (Struct.Builder) getExtFieldBuilder().d();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public i2 getExtOrBuilder() {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var != null) {
                        return (i2) e2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public Any getExtProto(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
                }

                public Any.Builder getExtProtoBuilder(int i10) {
                    return (Any.Builder) getExtProtoFieldBuilder().k(i10);
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().l();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getExtProtoCount() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.size() : z1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<Any> getExtProtoList() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getH() {
                    return this.h_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getHratio() {
                    return this.hratio_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getW() {
                    return this.w_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public int getWratio() {
                    return this.wratio_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormatOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return b.J.d(DisplayFormat.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeExt(Struct struct) {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        Struct struct2 = this.ext_;
                        if (struct2 != null) {
                            this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                        } else {
                            this.ext_ = struct;
                        }
                        onChanged();
                    } else {
                        e2Var.g(struct);
                    }
                    return this;
                }

                public Builder removeExtProto(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i10);
                        onChanged();
                    } else {
                        z1Var.v(i10);
                    }
                    return this;
                }

                public Builder setExpdir(int i10, ExpandableDirection expandableDirection) {
                    expandableDirection.getClass();
                    ensureExpdirIsMutable();
                    this.expdir_.set(i10, Integer.valueOf(expandableDirection.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder setExpdirValue(int i10, int i11) {
                    ensureExpdirIsMutable();
                    this.expdir_.set(i10, Integer.valueOf(i11));
                    onChanged();
                    return this;
                }

                public Builder setExt(Struct struct) {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        struct.getClass();
                        this.ext_ = struct;
                        onChanged();
                    } else {
                        e2Var.i(struct);
                    }
                    return this;
                }

                public Builder setExtProto(int i10, Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i10, any);
                        onChanged();
                    } else {
                        z1Var.w(i10, any);
                    }
                    return this;
                }

                public Builder setH(int i10) {
                    this.h_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setHratio(int i10) {
                    this.hratio_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setW(int i10) {
                    this.w_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setWratio(int i10) {
                    this.wratio_ = i10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.expdir_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DisplayFormat build() {
                    DisplayFormat displayFormatBuildPartial = buildPartial();
                    if (displayFormatBuildPartial.isInitialized()) {
                        return displayFormatBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) displayFormatBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DisplayFormat buildPartial() {
                    DisplayFormat displayFormat = new DisplayFormat(this);
                    displayFormat.w_ = this.w_;
                    displayFormat.h_ = this.h_;
                    displayFormat.wratio_ = this.wratio_;
                    displayFormat.hratio_ = this.hratio_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.expdir_ = Collections.unmodifiableList(this.expdir_);
                        this.bitField0_ &= -2;
                    }
                    displayFormat.expdir_ = this.expdir_;
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        displayFormat.ext_ = this.ext_;
                    } else {
                        displayFormat.ext_ = (Struct) e2Var.a();
                    }
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var != null) {
                        displayFormat.extProto_ = z1Var.f();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        displayFormat.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return displayFormat;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public DisplayFormat mo164getDefaultInstanceForType() {
                    return DisplayFormat.getDefaultInstance();
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

                public Any.Builder addExtProtoBuilder(int i10) {
                    return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
                    this.w_ = 0;
                    this.h_ = 0;
                    this.wratio_ = 0;
                    this.hratio_ = 0;
                    this.expdir_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                    } else {
                        z1Var.g();
                    }
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        this.ext_ = builder.build();
                        onChanged();
                    } else {
                        e2Var.i(builder.build());
                    }
                    return this;
                }

                private Builder(j0.c cVar) {
                    super(cVar);
                    this.expdir_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                public Builder addExtProto(int i10, Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i10, any);
                        onChanged();
                    } else {
                        z1Var.d(i10, any);
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
                    if (message instanceof DisplayFormat) {
                        return mergeFrom((DisplayFormat) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setExtProto(int i10, Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.w(i10, builder.build());
                    }
                    return this;
                }

                public Builder mergeFrom(DisplayFormat displayFormat) {
                    if (displayFormat == DisplayFormat.getDefaultInstance()) {
                        return this;
                    }
                    if (displayFormat.getW() != 0) {
                        setW(displayFormat.getW());
                    }
                    if (displayFormat.getH() != 0) {
                        setH(displayFormat.getH());
                    }
                    if (displayFormat.getWratio() != 0) {
                        setWratio(displayFormat.getWratio());
                    }
                    if (displayFormat.getHratio() != 0) {
                        setHratio(displayFormat.getHratio());
                    }
                    if (!displayFormat.expdir_.isEmpty()) {
                        if (this.expdir_.isEmpty()) {
                            this.expdir_ = displayFormat.expdir_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExpdirIsMutable();
                            this.expdir_.addAll(displayFormat.expdir_);
                        }
                        onChanged();
                    }
                    if (displayFormat.hasExt()) {
                        mergeExt(displayFormat.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!displayFormat.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = displayFormat.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(displayFormat.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!displayFormat.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(displayFormat.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = displayFormat.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((j0) displayFormat).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                    } else {
                        z1Var.e(builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(int i10, Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.d(i10, builder.build());
                    }
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                    DisplayFormat displayFormat = null;
                    try {
                        try {
                            DisplayFormat displayFormat2 = (DisplayFormat) DisplayFormat.PARSER.parsePartialFrom(nVar, yVar);
                            if (displayFormat2 != null) {
                                mergeFrom(displayFormat2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            DisplayFormat displayFormat3 = (DisplayFormat) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                displayFormat = displayFormat3;
                                if (displayFormat != null) {
                                    mergeFrom(displayFormat);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (displayFormat != null) {
                            mergeFrom(displayFormat);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder(DisplayFormat displayFormat) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(displayFormat);
            }

            public static DisplayFormat parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, yVar);
            }

            private DisplayFormat(j0.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static DisplayFormat parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                return (DisplayFormat) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static DisplayFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public DisplayFormat mo164getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static DisplayFormat parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, yVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private DisplayFormat() {
                this.memoizedIsInitialized = (byte) -1;
                this.expdir_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
            }

            public static DisplayFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            public Builder newBuilderForType(j0.c cVar) {
                return new Builder(cVar);
            }

            public static DisplayFormat parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, yVar);
            }

            public static DisplayFormat parseFrom(InputStream inputStream) throws IOException {
                return (DisplayFormat) j0.parseWithIOException(PARSER, inputStream);
            }

            private DisplayFormat(n nVar, y yVar) throws InvalidProtocolBufferException {
                this();
                yVar.getClass();
                u2.b bVarG = u2.g();
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            int iK = nVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.w_ = nVar.L();
                                } else if (iK == 16) {
                                    this.h_ = nVar.L();
                                } else if (iK == 24) {
                                    this.wratio_ = nVar.L();
                                } else if (iK == 32) {
                                    this.hratio_ = nVar.L();
                                } else if (iK == 40) {
                                    int iT = nVar.t();
                                    if ((i10 & 1) == 0) {
                                        this.expdir_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.expdir_.add(Integer.valueOf(iT));
                                } else if (iK == 42) {
                                    int iP = nVar.p(nVar.C());
                                    while (nVar.d() > 0) {
                                        int iT2 = nVar.t();
                                        if ((i10 & 1) == 0) {
                                            this.expdir_ = new ArrayList();
                                            i10 |= 1;
                                        }
                                        this.expdir_.add(Integer.valueOf(iT2));
                                    }
                                    nVar.o(iP);
                                } else if (iK == 50) {
                                    if ((i10 & 2) == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                } else if (iK != 58) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    Struct struct = this.ext_;
                                    Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                    this.ext_ = struct2;
                                    if (builder != null) {
                                        builder.mergeFrom(struct2);
                                        this.ext_ = builder.buildPartial();
                                    }
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        if ((i10 & 1) != 0) {
                            this.expdir_ = Collections.unmodifiableList(this.expdir_);
                        }
                        if ((i10 & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if ((i10 & 1) != 0) {
                    this.expdir_ = Collections.unmodifiableList(this.expdir_);
                }
                if ((i10 & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static DisplayFormat parseFrom(InputStream inputStream, y yVar) throws IOException {
                return (DisplayFormat) j0.parseWithIOException(PARSER, inputStream, yVar);
            }

            public static DisplayFormat parseFrom(n nVar) throws IOException {
                return (DisplayFormat) j0.parseWithIOException(PARSER, nVar);
            }

            public static DisplayFormat parseFrom(n nVar, y yVar) throws IOException {
                return (DisplayFormat) j0.parseWithIOException(PARSER, nVar, yVar);
            }
        }

        public interface DisplayFormatOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo164getDefaultInstanceForType();

            ExpandableDirection getExpdir(int i10);

            int getExpdirCount();

            List<ExpandableDirection> getExpdirList();

            int getExpdirValue(int i10);

            List<Integer> getExpdirValueList();

            Struct getExt();

            i2 getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            e getExtProtoOrBuilder(int i10);

            List<? extends e> getExtProtoOrBuilderList();

            int getH();

            int getHratio();

            int getW();

            int getWratio();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class EventSpec extends j0 implements EventSpecOrBuilder {
            public static final int API_FIELD_NUMBER = 3;
            public static final int EXT_FIELD_NUMBER = 9;
            public static final int EXT_PROTO_FIELD_NUMBER = 8;
            public static final int JSTRK_FIELD_NUMBER = 4;
            public static final int METHOD_FIELD_NUMBER = 2;
            public static final int PXTRK_FIELD_NUMBER = 6;
            public static final int TYPE_FIELD_NUMBER = 1;
            public static final int WJS_FIELD_NUMBER = 5;
            public static final int WPX_FIELD_NUMBER = 7;
            private static final long serialVersionUID = 0;
            private int apiMemoizedSerializedSize;
            private List<Integer> api_;
            private List<Any> extProto_;
            private Struct ext_;
            private r0 jstrk_;
            private byte memoizedIsInitialized;
            private int methodMemoizedSerializedSize;
            private List<Integer> method_;
            private r0 pxtrk_;
            private int type_;
            private boolean wjs_;
            private boolean wpx_;
            private static final l0.h.a<Integer, EventTrackingMethod> method_converter_ = new l0.h.a<Integer, EventTrackingMethod>() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.1
                @Override // com.explorestack.protobuf.l0.h.a
                public EventTrackingMethod convert(Integer num) {
                    EventTrackingMethod eventTrackingMethodValueOf = EventTrackingMethod.valueOf(num.intValue());
                    return eventTrackingMethodValueOf == null ? EventTrackingMethod.UNRECOGNIZED : eventTrackingMethodValueOf;
                }
            };
            private static final l0.h.a<Integer, ApiFramework> api_converter_ = new l0.h.a<Integer, ApiFramework>() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.2
                @Override // com.explorestack.protobuf.l0.h.a
                public ApiFramework convert(Integer num) {
                    ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                    return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
                }
            };
            private static final EventSpec DEFAULT_INSTANCE = new EventSpec();
            private static final s1<EventSpec> PARSER = new com.explorestack.protobuf.b<EventSpec>() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.3
                @Override // com.explorestack.protobuf.s1
                public EventSpec parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new EventSpec(nVar, yVar);
                }
            };

            public static final class Builder extends j0.b<Builder> implements EventSpecOrBuilder {
                private List<Integer> api_;
                private int bitField0_;
                private e2<Struct, Struct.Builder, i2> extBuilder_;
                private z1<Any, Any.Builder, e> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private r0 jstrk_;
                private List<Integer> method_;
                private r0 pxtrk_;
                private int type_;
                private boolean wjs_;
                private boolean wpx_;

                private void ensureApiIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.api_ = new ArrayList(this.api_);
                        this.bitField0_ |= 2;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 16) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 16;
                    }
                }

                private void ensureJstrkIsMutable() {
                    if ((this.bitField0_ & 4) == 0) {
                        this.jstrk_ = new q0(this.jstrk_);
                        this.bitField0_ |= 4;
                    }
                }

                private void ensureMethodIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.method_ = new ArrayList(this.method_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensurePxtrkIsMutable() {
                    if ((this.bitField0_ & 8) == 0) {
                        this.pxtrk_ = new q0(this.pxtrk_);
                        this.bitField0_ |= 8;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.U;
                }

                private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (j0.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                    ensureApiIsMutable();
                    Iterator<? extends ApiFramework> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.api_.add(Integer.valueOf(it.next().getNumber()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllApiValue(Iterable<Integer> iterable) {
                    ensureApiIsMutable();
                    Iterator<Integer> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.api_.add(Integer.valueOf(it.next().intValue()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                        onChanged();
                    } else {
                        z1Var.a(iterable);
                    }
                    return this;
                }

                public Builder addAllJstrk(Iterable<String> iterable) {
                    ensureJstrkIsMutable();
                    com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.jstrk_);
                    onChanged();
                    return this;
                }

                public Builder addAllMethod(Iterable<? extends EventTrackingMethod> iterable) {
                    ensureMethodIsMutable();
                    Iterator<? extends EventTrackingMethod> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.method_.add(Integer.valueOf(it.next().getNumber()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllMethodValue(Iterable<Integer> iterable) {
                    ensureMethodIsMutable();
                    Iterator<Integer> it = iterable.iterator();
                    while (it.hasNext()) {
                        this.method_.add(Integer.valueOf(it.next().intValue()));
                    }
                    onChanged();
                    return this;
                }

                public Builder addAllPxtrk(Iterable<String> iterable) {
                    ensurePxtrkIsMutable();
                    com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.pxtrk_);
                    onChanged();
                    return this;
                }

                public Builder addApi(ApiFramework apiFramework) {
                    apiFramework.getClass();
                    ensureApiIsMutable();
                    this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder addApiValue(int i10) {
                    ensureApiIsMutable();
                    this.api_.add(Integer.valueOf(i10));
                    onChanged();
                    return this;
                }

                public Builder addExtProto(Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                    } else {
                        z1Var.e(any);
                    }
                    return this;
                }

                public Any.Builder addExtProtoBuilder() {
                    return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                }

                public Builder addJstrk(String str) {
                    str.getClass();
                    ensureJstrkIsMutable();
                    this.jstrk_.add(str);
                    onChanged();
                    return this;
                }

                public Builder addJstrkBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    ensureJstrkIsMutable();
                    this.jstrk_.b(byteString);
                    onChanged();
                    return this;
                }

                public Builder addMethod(EventTrackingMethod eventTrackingMethod) {
                    eventTrackingMethod.getClass();
                    ensureMethodIsMutable();
                    this.method_.add(Integer.valueOf(eventTrackingMethod.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder addMethodValue(int i10) {
                    ensureMethodIsMutable();
                    this.method_.add(Integer.valueOf(i10));
                    onChanged();
                    return this;
                }

                public Builder addPxtrk(String str) {
                    str.getClass();
                    ensurePxtrkIsMutable();
                    this.pxtrk_.add(str);
                    onChanged();
                    return this;
                }

                public Builder addPxtrkBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    ensurePxtrkIsMutable();
                    this.pxtrk_.b(byteString);
                    onChanged();
                    return this;
                }

                public Builder clearApi() {
                    this.api_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearExtProto() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -17;
                        onChanged();
                    } else {
                        z1Var.g();
                    }
                    return this;
                }

                public Builder clearJstrk() {
                    this.jstrk_ = q0.f10776d;
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder clearMethod() {
                    this.method_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearPxtrk() {
                    this.pxtrk_ = q0.f10776d;
                    this.bitField0_ &= -9;
                    onChanged();
                    return this;
                }

                public Builder clearType() {
                    this.type_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWjs() {
                    this.wjs_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearWpx() {
                    this.wpx_ = false;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public ApiFramework getApi(int i10) {
                    return (ApiFramework) EventSpec.api_converter_.convert(this.api_.get(i10));
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getApiCount() {
                    return this.api_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<ApiFramework> getApiList() {
                    return new l0.h(this.api_, EventSpec.api_converter_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getApiValue(int i10) {
                    return this.api_.get(i10).intValue();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<Integer> getApiValueList() {
                    return Collections.unmodifiableList(this.api_);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.U;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public Struct getExt() {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var != null) {
                        return (Struct) e2Var.e();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return (Struct.Builder) getExtFieldBuilder().d();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public i2 getExtOrBuilder() {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var != null) {
                        return (i2) e2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public Any getExtProto(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
                }

                public Any.Builder getExtProtoBuilder(int i10) {
                    return (Any.Builder) getExtProtoFieldBuilder().k(i10);
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().l();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getExtProtoCount() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.size() : z1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<Any> getExtProtoList() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public String getJstrk(int i10) {
                    return this.jstrk_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public ByteString getJstrkBytes(int i10) {
                    return this.jstrk_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getJstrkCount() {
                    return this.jstrk_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public EventTrackingMethod getMethod(int i10) {
                    return (EventTrackingMethod) EventSpec.method_converter_.convert(this.method_.get(i10));
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getMethodCount() {
                    return this.method_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<EventTrackingMethod> getMethodList() {
                    return new l0.h(this.method_, EventSpec.method_converter_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getMethodValue(int i10) {
                    return this.method_.get(i10).intValue();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public List<Integer> getMethodValueList() {
                    return Collections.unmodifiableList(this.method_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public String getPxtrk(int i10) {
                    return this.pxtrk_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public ByteString getPxtrkBytes(int i10) {
                    return this.pxtrk_.getByteString(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getPxtrkCount() {
                    return this.pxtrk_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public EventType getType() {
                    EventType eventTypeValueOf = EventType.valueOf(this.type_);
                    return eventTypeValueOf == null ? EventType.UNRECOGNIZED : eventTypeValueOf;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public int getTypeValue() {
                    return this.type_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public boolean getWjs() {
                    return this.wjs_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public boolean getWpx() {
                    return this.wpx_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return b.V.d(EventSpec.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeExt(Struct struct) {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        Struct struct2 = this.ext_;
                        if (struct2 != null) {
                            this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                        } else {
                            this.ext_ = struct;
                        }
                        onChanged();
                    } else {
                        e2Var.g(struct);
                    }
                    return this;
                }

                public Builder removeExtProto(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i10);
                        onChanged();
                    } else {
                        z1Var.v(i10);
                    }
                    return this;
                }

                public Builder setApi(int i10, ApiFramework apiFramework) {
                    apiFramework.getClass();
                    ensureApiIsMutable();
                    this.api_.set(i10, Integer.valueOf(apiFramework.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder setApiValue(int i10, int i11) {
                    ensureApiIsMutable();
                    this.api_.set(i10, Integer.valueOf(i11));
                    onChanged();
                    return this;
                }

                public Builder setExt(Struct struct) {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        struct.getClass();
                        this.ext_ = struct;
                        onChanged();
                    } else {
                        e2Var.i(struct);
                    }
                    return this;
                }

                public Builder setExtProto(int i10, Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i10, any);
                        onChanged();
                    } else {
                        z1Var.w(i10, any);
                    }
                    return this;
                }

                public Builder setJstrk(int i10, String str) {
                    str.getClass();
                    ensureJstrkIsMutable();
                    this.jstrk_.set(i10, str);
                    onChanged();
                    return this;
                }

                public Builder setMethod(int i10, EventTrackingMethod eventTrackingMethod) {
                    eventTrackingMethod.getClass();
                    ensureMethodIsMutable();
                    this.method_.set(i10, Integer.valueOf(eventTrackingMethod.getNumber()));
                    onChanged();
                    return this;
                }

                public Builder setMethodValue(int i10, int i11) {
                    ensureMethodIsMutable();
                    this.method_.set(i10, Integer.valueOf(i11));
                    onChanged();
                    return this;
                }

                public Builder setPxtrk(int i10, String str) {
                    str.getClass();
                    ensurePxtrkIsMutable();
                    this.pxtrk_.set(i10, str);
                    onChanged();
                    return this;
                }

                public Builder setType(EventType eventType) {
                    eventType.getClass();
                    this.type_ = eventType.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setTypeValue(int i10) {
                    this.type_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setWjs(boolean z10) {
                    this.wjs_ = z10;
                    onChanged();
                    return this;
                }

                public Builder setWpx(boolean z10) {
                    this.wpx_ = z10;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public w1 getJstrkList() {
                    return this.jstrk_.getUnmodifiableView();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
                public w1 getPxtrkList() {
                    return this.pxtrk_.getUnmodifiableView();
                }

                private Builder() {
                    this.type_ = 0;
                    this.method_ = Collections.emptyList();
                    this.api_ = Collections.emptyList();
                    r0 r0Var = q0.f10776d;
                    this.jstrk_ = r0Var;
                    this.pxtrk_ = r0Var;
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public EventSpec build() {
                    EventSpec eventSpecBuildPartial = buildPartial();
                    if (eventSpecBuildPartial.isInitialized()) {
                        return eventSpecBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventSpecBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public EventSpec buildPartial() {
                    EventSpec eventSpec = new EventSpec(this);
                    eventSpec.type_ = this.type_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.method_ = Collections.unmodifiableList(this.method_);
                        this.bitField0_ &= -2;
                    }
                    eventSpec.method_ = this.method_;
                    if ((this.bitField0_ & 2) != 0) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                        this.bitField0_ &= -3;
                    }
                    eventSpec.api_ = this.api_;
                    if ((this.bitField0_ & 4) != 0) {
                        this.jstrk_ = this.jstrk_.getUnmodifiableView();
                        this.bitField0_ &= -5;
                    }
                    eventSpec.jstrk_ = this.jstrk_;
                    eventSpec.wjs_ = this.wjs_;
                    if ((this.bitField0_ & 8) != 0) {
                        this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
                        this.bitField0_ &= -9;
                    }
                    eventSpec.pxtrk_ = this.pxtrk_;
                    eventSpec.wpx_ = this.wpx_;
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        eventSpec.ext_ = this.ext_;
                    } else {
                        eventSpec.ext_ = (Struct) e2Var.a();
                    }
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var != null) {
                        eventSpec.extProto_ = z1Var.f();
                    } else {
                        if ((this.bitField0_ & 16) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -17;
                        }
                        eventSpec.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return eventSpec;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public EventSpec mo164getDefaultInstanceForType() {
                    return EventSpec.getDefaultInstance();
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

                public Any.Builder addExtProtoBuilder(int i10) {
                    return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
                    this.type_ = 0;
                    this.method_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    this.api_ = Collections.emptyList();
                    int i10 = this.bitField0_ & (-3);
                    this.bitField0_ = i10;
                    r0 r0Var = q0.f10776d;
                    this.jstrk_ = r0Var;
                    this.wjs_ = false;
                    this.pxtrk_ = r0Var;
                    this.bitField0_ = i10 & (-5) & (-9);
                    this.wpx_ = false;
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -17;
                    } else {
                        z1Var.g();
                    }
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        this.ext_ = builder.build();
                        onChanged();
                    } else {
                        e2Var.i(builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(int i10, Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i10, any);
                        onChanged();
                    } else {
                        z1Var.d(i10, any);
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
                    if (message instanceof EventSpec) {
                        return mergeFrom((EventSpec) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setExtProto(int i10, Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.w(i10, builder.build());
                    }
                    return this;
                }

                public Builder mergeFrom(EventSpec eventSpec) {
                    if (eventSpec == EventSpec.getDefaultInstance()) {
                        return this;
                    }
                    if (eventSpec.type_ != 0) {
                        setTypeValue(eventSpec.getTypeValue());
                    }
                    if (!eventSpec.method_.isEmpty()) {
                        if (this.method_.isEmpty()) {
                            this.method_ = eventSpec.method_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureMethodIsMutable();
                            this.method_.addAll(eventSpec.method_);
                        }
                        onChanged();
                    }
                    if (!eventSpec.api_.isEmpty()) {
                        if (this.api_.isEmpty()) {
                            this.api_ = eventSpec.api_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureApiIsMutable();
                            this.api_.addAll(eventSpec.api_);
                        }
                        onChanged();
                    }
                    if (!eventSpec.jstrk_.isEmpty()) {
                        if (this.jstrk_.isEmpty()) {
                            this.jstrk_ = eventSpec.jstrk_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureJstrkIsMutable();
                            this.jstrk_.addAll(eventSpec.jstrk_);
                        }
                        onChanged();
                    }
                    if (eventSpec.getWjs()) {
                        setWjs(eventSpec.getWjs());
                    }
                    if (!eventSpec.pxtrk_.isEmpty()) {
                        if (this.pxtrk_.isEmpty()) {
                            this.pxtrk_ = eventSpec.pxtrk_;
                            this.bitField0_ &= -9;
                        } else {
                            ensurePxtrkIsMutable();
                            this.pxtrk_.addAll(eventSpec.pxtrk_);
                        }
                        onChanged();
                    }
                    if (eventSpec.getWpx()) {
                        setWpx(eventSpec.getWpx());
                    }
                    if (eventSpec.hasExt()) {
                        mergeExt(eventSpec.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!eventSpec.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = eventSpec.extProto_;
                                this.bitField0_ &= -17;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(eventSpec.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!eventSpec.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(eventSpec.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = eventSpec.extProto_;
                            this.bitField0_ &= -17;
                            this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((j0) eventSpec).unknownFields);
                    onChanged();
                    return this;
                }

                private Builder(j0.c cVar) {
                    super(cVar);
                    this.type_ = 0;
                    this.method_ = Collections.emptyList();
                    this.api_ = Collections.emptyList();
                    r0 r0Var = q0.f10776d;
                    this.jstrk_ = r0Var;
                    this.pxtrk_ = r0Var;
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                public Builder addExtProto(Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                    } else {
                        z1Var.e(builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(int i10, Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.d(i10, builder.build());
                    }
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                    EventSpec eventSpec = null;
                    try {
                        try {
                            EventSpec eventSpec2 = (EventSpec) EventSpec.PARSER.parsePartialFrom(nVar, yVar);
                            if (eventSpec2 != null) {
                                mergeFrom(eventSpec2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            EventSpec eventSpec3 = (EventSpec) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                eventSpec = eventSpec3;
                                if (eventSpec != null) {
                                    mergeFrom(eventSpec);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (eventSpec != null) {
                            mergeFrom(eventSpec);
                        }
                        throw th;
                    }
                }
            }

            public static EventSpec getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.U;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static EventSpec parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (EventSpec) j0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static EventSpec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static s1<EventSpec> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EventSpec)) {
                    return super.equals(obj);
                }
                EventSpec eventSpec = (EventSpec) obj;
                if (this.type_ == eventSpec.type_ && this.method_.equals(eventSpec.method_) && this.api_.equals(eventSpec.api_) && getJstrkList().equals(eventSpec.getJstrkList()) && getWjs() == eventSpec.getWjs() && getPxtrkList().equals(eventSpec.getPxtrkList()) && getWpx() == eventSpec.getWpx() && hasExt() == eventSpec.hasExt()) {
                    return (!hasExt() || getExt().equals(eventSpec.getExt())) && getExtProtoList().equals(eventSpec.getExtProtoList()) && this.unknownFields.equals(eventSpec.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public ApiFramework getApi(int i10) {
                return api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<ApiFramework> getApiList() {
                return new l0.h(this.api_, api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<Integer> getApiValueList() {
                return this.api_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public i2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public String getJstrk(int i10) {
                return this.jstrk_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public ByteString getJstrkBytes(int i10) {
                return this.jstrk_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getJstrkCount() {
                return this.jstrk_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public EventTrackingMethod getMethod(int i10) {
                return method_converter_.convert(this.method_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getMethodCount() {
                return this.method_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<EventTrackingMethod> getMethodList() {
                return new l0.h(this.method_, method_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getMethodValue(int i10) {
                return this.method_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public List<Integer> getMethodValueList() {
                return this.method_;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public s1<EventSpec> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public String getPxtrk(int i10) {
                return this.pxtrk_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public ByteString getPxtrkBytes(int i10) {
                return this.pxtrk_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getPxtrkCount() {
                return this.pxtrk_.size();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iL = this.type_ != EventType.EVENT_TYPE_INVALID.getNumber() ? CodedOutputStream.l(1, this.type_) + 0 : 0;
                int iM = 0;
                for (int i11 = 0; i11 < this.method_.size(); i11++) {
                    iM += CodedOutputStream.m(this.method_.get(i11).intValue());
                }
                int iZ = iL + iM;
                if (!getMethodList().isEmpty()) {
                    iZ = iZ + 1 + CodedOutputStream.Z(iM);
                }
                this.methodMemoizedSerializedSize = iM;
                int iM2 = 0;
                for (int i12 = 0; i12 < this.api_.size(); i12++) {
                    iM2 += CodedOutputStream.m(this.api_.get(i12).intValue());
                }
                int iZ2 = iZ + iM2;
                if (!getApiList().isEmpty()) {
                    iZ2 = iZ2 + 1 + CodedOutputStream.Z(iM2);
                }
                this.apiMemoizedSerializedSize = iM2;
                int iComputeStringSizeNoTag = 0;
                for (int i13 = 0; i13 < this.jstrk_.size(); i13++) {
                    iComputeStringSizeNoTag += j0.computeStringSizeNoTag(this.jstrk_.getRaw(i13));
                }
                int size = iZ2 + iComputeStringSizeNoTag + (getJstrkList().size() * 1);
                boolean z10 = this.wjs_;
                if (z10) {
                    size += CodedOutputStream.e(5, z10);
                }
                int iComputeStringSizeNoTag2 = 0;
                for (int i14 = 0; i14 < this.pxtrk_.size(); i14++) {
                    iComputeStringSizeNoTag2 += j0.computeStringSizeNoTag(this.pxtrk_.getRaw(i14));
                }
                int size2 = size + iComputeStringSizeNoTag2 + (getPxtrkList().size() * 1);
                boolean z11 = this.wpx_;
                if (z11) {
                    size2 += CodedOutputStream.e(7, z11);
                }
                for (int i15 = 0; i15 < this.extProto_.size(); i15++) {
                    size2 += CodedOutputStream.G(8, this.extProto_.get(i15));
                }
                if (this.ext_ != null) {
                    size2 += CodedOutputStream.G(9, getExt());
                }
                int serializedSize = size2 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public EventType getType() {
                EventType eventTypeValueOf = EventType.valueOf(this.type_);
                return eventTypeValueOf == null ? EventType.UNRECOGNIZED : eventTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
            public final u2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public boolean getWjs() {
                return this.wjs_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public boolean getWpx() {
                return this.wpx_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_;
                if (getMethodCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + this.method_.hashCode();
                }
                if (getApiCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + this.api_.hashCode();
                }
                if (getJstrkCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getJstrkList().hashCode();
                }
                int iD = (((iHashCode * 37) + 5) * 53) + l0.d(getWjs());
                if (getPxtrkCount() > 0) {
                    iD = (((iD * 37) + 6) * 53) + getPxtrkList().hashCode();
                }
                int iD2 = (((iD * 37) + 7) * 53) + l0.d(getWpx());
                if (hasExt()) {
                    iD2 = (((iD2 * 37) + 9) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iD2 = (((iD2 * 37) + 8) * 53) + getExtProtoList().hashCode();
                }
                int iHashCode2 = (iD2 * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.j0
            protected j0.f internalGetFieldAccessorTable() {
                return b.V.d(EventSpec.class, Builder.class);
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
                return new EventSpec();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if (this.type_ != EventType.EVENT_TYPE_INVALID.getNumber()) {
                    codedOutputStream.v0(1, this.type_);
                }
                if (getMethodList().size() > 0) {
                    codedOutputStream.d1(18);
                    codedOutputStream.d1(this.methodMemoizedSerializedSize);
                }
                for (int i10 = 0; i10 < this.method_.size(); i10++) {
                    codedOutputStream.w0(this.method_.get(i10).intValue());
                }
                if (getApiList().size() > 0) {
                    codedOutputStream.d1(26);
                    codedOutputStream.d1(this.apiMemoizedSerializedSize);
                }
                for (int i11 = 0; i11 < this.api_.size(); i11++) {
                    codedOutputStream.w0(this.api_.get(i11).intValue());
                }
                for (int i12 = 0; i12 < this.jstrk_.size(); i12++) {
                    j0.writeString(codedOutputStream, 4, this.jstrk_.getRaw(i12));
                }
                boolean z10 = this.wjs_;
                if (z10) {
                    codedOutputStream.n0(5, z10);
                }
                for (int i13 = 0; i13 < this.pxtrk_.size(); i13++) {
                    j0.writeString(codedOutputStream, 6, this.pxtrk_.getRaw(i13));
                }
                boolean z11 = this.wpx_;
                if (z11) {
                    codedOutputStream.n0(7, z11);
                }
                for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
                    codedOutputStream.L0(8, this.extProto_.get(i14));
                }
                if (this.ext_ != null) {
                    codedOutputStream.L0(9, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static Builder newBuilder(EventSpec eventSpec) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventSpec);
            }

            public static EventSpec parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, yVar);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public w1 getJstrkList() {
                return this.jstrk_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpecOrBuilder
            public w1 getPxtrkList() {
                return this.pxtrk_;
            }

            private EventSpec(j0.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static EventSpec parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                return (EventSpec) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static EventSpec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public EventSpec mo164getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static EventSpec parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, yVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private EventSpec() {
                this.memoizedIsInitialized = (byte) -1;
                this.type_ = 0;
                this.method_ = Collections.emptyList();
                this.api_ = Collections.emptyList();
                r0 r0Var = q0.f10776d;
                this.jstrk_ = r0Var;
                this.pxtrk_ = r0Var;
                this.extProto_ = Collections.emptyList();
            }

            public static EventSpec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            public Builder newBuilderForType(j0.c cVar) {
                return new Builder(cVar);
            }

            public static EventSpec parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, yVar);
            }

            public static EventSpec parseFrom(InputStream inputStream) throws IOException {
                return (EventSpec) j0.parseWithIOException(PARSER, inputStream);
            }

            public static EventSpec parseFrom(InputStream inputStream, y yVar) throws IOException {
                return (EventSpec) j0.parseWithIOException(PARSER, inputStream, yVar);
            }

            public static EventSpec parseFrom(n nVar) throws IOException {
                return (EventSpec) j0.parseWithIOException(PARSER, nVar);
            }

            private EventSpec(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                case 8:
                                    this.type_ = nVar.t();
                                    continue;
                                case 16:
                                    int iT = nVar.t();
                                    if ((i10 & 1) == 0) {
                                        this.method_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.method_.add(Integer.valueOf(iT));
                                    continue;
                                case 18:
                                    int iP = nVar.p(nVar.C());
                                    while (nVar.d() > 0) {
                                        int iT2 = nVar.t();
                                        if ((i10 & 1) == 0) {
                                            this.method_ = new ArrayList();
                                            i10 |= 1;
                                        }
                                        this.method_.add(Integer.valueOf(iT2));
                                    }
                                    nVar.o(iP);
                                    continue;
                                case 24:
                                    int iT3 = nVar.t();
                                    if ((i10 & 2) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.api_.add(Integer.valueOf(iT3));
                                    continue;
                                case 26:
                                    int iP2 = nVar.p(nVar.C());
                                    while (nVar.d() > 0) {
                                        int iT4 = nVar.t();
                                        if ((i10 & 2) == 0) {
                                            this.api_ = new ArrayList();
                                            i10 |= 2;
                                        }
                                        this.api_.add(Integer.valueOf(iT4));
                                    }
                                    nVar.o(iP2);
                                    continue;
                                case 34:
                                    String strJ = nVar.J();
                                    if ((i10 & 4) == 0) {
                                        this.jstrk_ = new q0();
                                        i10 |= 4;
                                    }
                                    this.jstrk_.add(strJ);
                                    continue;
                                case 40:
                                    this.wjs_ = nVar.q();
                                    continue;
                                case 50:
                                    String strJ2 = nVar.J();
                                    if ((i10 & 8) == 0) {
                                        this.pxtrk_ = new q0();
                                        i10 |= 8;
                                    }
                                    this.pxtrk_.add(strJ2);
                                    continue;
                                case 56:
                                    this.wpx_ = nVar.q();
                                    continue;
                                case 66:
                                    if ((i10 & 16) == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                    continue;
                                case 74:
                                    Struct struct = this.ext_;
                                    Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                    this.ext_ = struct2;
                                    if (builder != null) {
                                        builder.mergeFrom(struct2);
                                        this.ext_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
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
                        if ((i10 & 1) != 0) {
                            this.method_ = Collections.unmodifiableList(this.method_);
                        }
                        if ((i10 & 2) != 0) {
                            this.api_ = Collections.unmodifiableList(this.api_);
                        }
                        if ((i10 & 4) != 0) {
                            this.jstrk_ = this.jstrk_.getUnmodifiableView();
                        }
                        if ((i10 & 8) != 0) {
                            this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
                        }
                        if ((i10 & 16) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if ((i10 & 1) != 0) {
                    this.method_ = Collections.unmodifiableList(this.method_);
                }
                if ((i10 & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                }
                if ((i10 & 4) != 0) {
                    this.jstrk_ = this.jstrk_.getUnmodifiableView();
                }
                if ((i10 & 8) != 0) {
                    this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
                }
                if ((i10 & 16) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static EventSpec parseFrom(n nVar, y yVar) throws IOException {
                return (EventSpec) j0.parseWithIOException(PARSER, nVar, yVar);
            }
        }

        public interface EventSpecOrBuilder extends MessageOrBuilder {
            ApiFramework getApi(int i10);

            int getApiCount();

            List<ApiFramework> getApiList();

            int getApiValue(int i10);

            List<Integer> getApiValueList();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo164getDefaultInstanceForType();

            Struct getExt();

            i2 getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            e getExtProtoOrBuilder(int i10);

            List<? extends e> getExtProtoOrBuilderList();

            String getJstrk(int i10);

            ByteString getJstrkBytes(int i10);

            int getJstrkCount();

            List<String> getJstrkList();

            EventTrackingMethod getMethod(int i10);

            int getMethodCount();

            List<EventTrackingMethod> getMethodList();

            int getMethodValue(int i10);

            List<Integer> getMethodValueList();

            String getPxtrk(int i10);

            ByteString getPxtrkBytes(int i10);

            int getPxtrkCount();

            List<String> getPxtrkList();

            EventType getType();

            int getTypeValue();

            boolean getWjs();

            boolean getWpx();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static final class NativeFormat extends j0 implements NativeFormatOrBuilder {
            public static final int ASSET_FIELD_NUMBER = 1;
            public static final int EXT_FIELD_NUMBER = 3;
            public static final int EXT_PROTO_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private List<AssetFormat> asset_;
            private List<Any> extProto_;
            private Struct ext_;
            private byte memoizedIsInitialized;
            private static final NativeFormat DEFAULT_INSTANCE = new NativeFormat();
            private static final s1<NativeFormat> PARSER = new com.explorestack.protobuf.b<NativeFormat>() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.1
                @Override // com.explorestack.protobuf.s1
                public NativeFormat parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new NativeFormat(nVar, yVar);
                }
            };

            public static final class AssetFormat extends j0 implements AssetFormatOrBuilder {
                public static final int DATA_FIELD_NUMBER = 6;
                public static final int EXT_FIELD_NUMBER = 8;
                public static final int EXT_PROTO_FIELD_NUMBER = 7;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int IMG_FIELD_NUMBER = 4;
                public static final int REQ_FIELD_NUMBER = 2;
                public static final int TITLE_FIELD_NUMBER = 3;
                public static final int VIDEO_FIELD_NUMBER = 5;
                private static final long serialVersionUID = 0;
                private DataAssetFormat data_;
                private List<Any> extProto_;
                private Struct ext_;
                private int id_;
                private ImageAssetFormat img_;
                private byte memoizedIsInitialized;
                private boolean req_;
                private TitleAssetFormat title_;
                private VideoPlacement video_;
                private static final AssetFormat DEFAULT_INSTANCE = new AssetFormat();
                private static final s1<AssetFormat> PARSER = new com.explorestack.protobuf.b<AssetFormat>() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.1
                    @Override // com.explorestack.protobuf.s1
                    public AssetFormat parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                        return new AssetFormat(nVar, yVar);
                    }
                };

                public static final class DataAssetFormat extends j0 implements DataAssetFormatOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    public static final int LEN_FIELD_NUMBER = 2;
                    public static final int TYPE_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private int type_;
                    private static final DataAssetFormat DEFAULT_INSTANCE = new DataAssetFormat();
                    private static final s1<DataAssetFormat> PARSER = new com.explorestack.protobuf.b<DataAssetFormat>() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.1
                        @Override // com.explorestack.protobuf.s1
                        public DataAssetFormat parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                            return new DataAssetFormat(nVar, yVar);
                        }
                    };

                    public static DataAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.S;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static DataAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (DataAssetFormat) j0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static DataAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static s1<DataAssetFormat> parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof DataAssetFormat)) {
                            return super.equals(obj);
                        }
                        DataAssetFormat dataAssetFormat = (DataAssetFormat) obj;
                        if (this.type_ == dataAssetFormat.type_ && getLen() == dataAssetFormat.getLen() && hasExt() == dataAssetFormat.hasExt()) {
                            return (!hasExt() || getExt().equals(dataAssetFormat.getExt())) && getExtProtoList().equals(dataAssetFormat.getExtProtoList()) && this.unknownFields.equals(dataAssetFormat.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public i2 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public int getLen() {
                        return this.len_;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public s1<DataAssetFormat> getParserForType() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public int getSerializedSize() {
                        int i10 = this.memoizedSize;
                        if (i10 != -1) {
                            return i10;
                        }
                        int iL = this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber() ? CodedOutputStream.l(1, this.type_) + 0 : 0;
                        int i11 = this.len_;
                        if (i11 != 0) {
                            iL += CodedOutputStream.Y(2, i11);
                        }
                        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                            iL += CodedOutputStream.G(3, this.extProto_.get(i12));
                        }
                        if (this.ext_ != null) {
                            iL += CodedOutputStream.G(4, getExt());
                        }
                        int serializedSize = iL + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public NativeDataAssetType getType() {
                        NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                        return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
                    public final u2 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + getLen();
                        if (hasExt()) {
                            iHashCode = (((iHashCode * 37) + 4) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            iHashCode = (((iHashCode * 37) + 3) * 53) + getExtProtoList().hashCode();
                        }
                        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = iHashCode2;
                        return iHashCode2;
                    }

                    @Override // com.explorestack.protobuf.j0
                    protected j0.f internalGetFieldAccessorTable() {
                        return b.T.d(DataAssetFormat.class, Builder.class);
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
                        return new DataAssetFormat();
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            codedOutputStream.v0(1, this.type_);
                        }
                        int i10 = this.len_;
                        if (i10 != 0) {
                            codedOutputStream.c1(2, i10);
                        }
                        for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                            codedOutputStream.L0(3, this.extProto_.get(i11));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.L0(4, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    public static final class Builder extends j0.b<Builder> implements DataAssetFormatOrBuilder {
                        private int bitField0_;
                        private e2<Struct, Struct.Builder, i2> extBuilder_;
                        private z1<Any, Any.Builder, e> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private int type_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.S;
                        }

                        private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
                            if (this.extBuilder_ == null) {
                                this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                                this.ext_ = null;
                            }
                            return this.extBuilder_;
                        }

                        private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
                            if (this.extProtoBuilder_ == null) {
                                this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                                this.extProto_ = null;
                            }
                            return this.extProtoBuilder_;
                        }

                        private void maybeForceBuilderInitialization() {
                            if (j0.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                                onChanged();
                            } else {
                                z1Var.a(iterable);
                            }
                            return this;
                        }

                        public Builder addExtProto(Any any) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(any);
                                onChanged();
                            } else {
                                z1Var.e(any);
                            }
                            return this;
                        }

                        public Any.Builder addExtProtoBuilder() {
                            return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                        }

                        public Builder clearExt() {
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                                onChanged();
                            } else {
                                this.ext_ = null;
                                this.extBuilder_ = null;
                            }
                            return this;
                        }

                        public Builder clearExtProto() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                this.extProto_ = Collections.emptyList();
                                this.bitField0_ &= -2;
                                onChanged();
                            } else {
                                z1Var.g();
                            }
                            return this;
                        }

                        public Builder clearLen() {
                            this.len_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.S;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public Struct getExt() {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var != null) {
                                return (Struct) e2Var.e();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        public Struct.Builder getExtBuilder() {
                            onChanged();
                            return (Struct.Builder) getExtFieldBuilder().d();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public i2 getExtOrBuilder() {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var != null) {
                                return (i2) e2Var.f();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public Any getExtProto(int i10) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
                        }

                        public Any.Builder getExtProtoBuilder(int i10) {
                            return (Any.Builder) getExtProtoFieldBuilder().k(i10);
                        }

                        public List<Any.Builder> getExtProtoBuilderList() {
                            return getExtProtoFieldBuilder().l();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public int getExtProtoCount() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.size() : z1Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public List<Any> getExtProtoList() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public e getExtProtoOrBuilder(int i10) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public List<? extends e> getExtProtoOrBuilderList() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public NativeDataAssetType getType() {
                            NativeDataAssetType nativeDataAssetTypeValueOf = NativeDataAssetType.valueOf(this.type_);
                            return nativeDataAssetTypeValueOf == null ? NativeDataAssetType.UNRECOGNIZED : nativeDataAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormatOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.j0.b
                        protected j0.f internalGetFieldAccessorTable() {
                            return b.T.d(DataAssetFormat.class, Builder.class);
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public final boolean isInitialized() {
                            return true;
                        }

                        public Builder mergeExt(Struct struct) {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                Struct struct2 = this.ext_;
                                if (struct2 != null) {
                                    this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                                } else {
                                    this.ext_ = struct;
                                }
                                onChanged();
                            } else {
                                e2Var.g(struct);
                            }
                            return this;
                        }

                        public Builder removeExtProto(int i10) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.remove(i10);
                                onChanged();
                            } else {
                                z1Var.v(i10);
                            }
                            return this;
                        }

                        public Builder setExt(Struct struct) {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                struct.getClass();
                                this.ext_ = struct;
                                onChanged();
                            } else {
                                e2Var.i(struct);
                            }
                            return this;
                        }

                        public Builder setExtProto(int i10, Any any) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i10, any);
                                onChanged();
                            } else {
                                z1Var.w(i10, any);
                            }
                            return this;
                        }

                        public Builder setLen(int i10) {
                            this.len_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setType(NativeDataAssetType nativeDataAssetType) {
                            nativeDataAssetType.getClass();
                            this.type_ = nativeDataAssetType.getNumber();
                            onChanged();
                            return this;
                        }

                        public Builder setTypeValue(int i10) {
                            this.type_ = i10;
                            onChanged();
                            return this;
                        }

                        private Builder() {
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAssetFormat build() {
                            DataAssetFormat dataAssetFormatBuildPartial = buildPartial();
                            if (dataAssetFormatBuildPartial.isInitialized()) {
                                return dataAssetFormatBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataAssetFormatBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public DataAssetFormat buildPartial() {
                            DataAssetFormat dataAssetFormat = new DataAssetFormat(this);
                            dataAssetFormat.type_ = this.type_;
                            dataAssetFormat.len_ = this.len_;
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                dataAssetFormat.ext_ = this.ext_;
                            } else {
                                dataAssetFormat.ext_ = (Struct) e2Var.a();
                            }
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var != null) {
                                dataAssetFormat.extProto_ = z1Var.f();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                dataAssetFormat.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return dataAssetFormat;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        /* JADX INFO: renamed from: getDefaultInstanceForType */
                        public DataAssetFormat mo164getDefaultInstanceForType() {
                            return DataAssetFormat.getDefaultInstance();
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

                        public Any.Builder addExtProtoBuilder(int i10) {
                            return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
                            this.type_ = 0;
                            this.len_ = 0;
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                            } else {
                                this.ext_ = null;
                                this.extBuilder_ = null;
                            }
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                this.extProto_ = Collections.emptyList();
                                this.bitField0_ &= -2;
                            } else {
                                z1Var.g();
                            }
                            return this;
                        }

                        public Builder setExt(Struct.Builder builder) {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                this.ext_ = builder.build();
                                onChanged();
                            } else {
                                e2Var.i(builder.build());
                            }
                            return this;
                        }

                        private Builder(j0.c cVar) {
                            super(cVar);
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        public Builder addExtProto(int i10, Any any) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i10, any);
                                onChanged();
                            } else {
                                z1Var.d(i10, any);
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
                            if (message instanceof DataAssetFormat) {
                                return mergeFrom((DataAssetFormat) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder setExtProto(int i10, Any.Builder builder) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i10, builder.build());
                                onChanged();
                            } else {
                                z1Var.w(i10, builder.build());
                            }
                            return this;
                        }

                        public Builder mergeFrom(DataAssetFormat dataAssetFormat) {
                            if (dataAssetFormat == DataAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (dataAssetFormat.type_ != 0) {
                                setTypeValue(dataAssetFormat.getTypeValue());
                            }
                            if (dataAssetFormat.getLen() != 0) {
                                setLen(dataAssetFormat.getLen());
                            }
                            if (dataAssetFormat.hasExt()) {
                                mergeExt(dataAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!dataAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = dataAssetFormat.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(dataAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!dataAssetFormat.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.t()) {
                                    this.extProtoBuilder_.a(dataAssetFormat.extProto_);
                                } else {
                                    this.extProtoBuilder_.h();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = dataAssetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((j0) dataAssetFormat).unknownFields);
                            onChanged();
                            return this;
                        }

                        public Builder addExtProto(Any.Builder builder) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(builder.build());
                                onChanged();
                            } else {
                                z1Var.e(builder.build());
                            }
                            return this;
                        }

                        public Builder addExtProto(int i10, Any.Builder builder) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i10, builder.build());
                                onChanged();
                            } else {
                                z1Var.d(i10, builder.build());
                            }
                            return this;
                        }

                        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                            DataAssetFormat dataAssetFormat = null;
                            try {
                                try {
                                    DataAssetFormat dataAssetFormat2 = (DataAssetFormat) DataAssetFormat.PARSER.parsePartialFrom(nVar, yVar);
                                    if (dataAssetFormat2 != null) {
                                        mergeFrom(dataAssetFormat2);
                                    }
                                    return this;
                                } catch (InvalidProtocolBufferException e10) {
                                    DataAssetFormat dataAssetFormat3 = (DataAssetFormat) e10.getUnfinishedMessage();
                                    try {
                                        throw e10.unwrapIOException();
                                    } catch (Throwable th) {
                                        th = th;
                                        dataAssetFormat = dataAssetFormat3;
                                        if (dataAssetFormat != null) {
                                            mergeFrom(dataAssetFormat);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (dataAssetFormat != null) {
                                    mergeFrom(dataAssetFormat);
                                }
                                throw th;
                            }
                        }
                    }

                    public static Builder newBuilder(DataAssetFormat dataAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataAssetFormat);
                    }

                    public static DataAssetFormat parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, yVar);
                    }

                    private DataAssetFormat(j0.b<?> bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static DataAssetFormat parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                        return (DataAssetFormat) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                    }

                    public static DataAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public DataAssetFormat mo164getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static DataAssetFormat parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, yVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private DataAssetFormat() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.type_ = 0;
                        this.extProto_ = Collections.emptyList();
                    }

                    public static DataAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.j0
                    public Builder newBuilderForType(j0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static DataAssetFormat parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, yVar);
                    }

                    public static DataAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (DataAssetFormat) j0.parseWithIOException(PARSER, inputStream);
                    }

                    private DataAssetFormat(n nVar, y yVar) throws InvalidProtocolBufferException {
                        this();
                        yVar.getClass();
                        u2.b bVarG = u2.g();
                        boolean z10 = false;
                        boolean z11 = false;
                        while (!z10) {
                            try {
                                try {
                                    int iK = nVar.K();
                                    if (iK != 0) {
                                        if (iK == 8) {
                                            this.type_ = nVar.t();
                                        } else if (iK == 16) {
                                            this.len_ = nVar.L();
                                        } else if (iK == 26) {
                                            if (!(z11 & true)) {
                                                this.extProto_ = new ArrayList();
                                                z11 |= true;
                                            }
                                            this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                        } else if (iK != 34) {
                                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                            }
                                        } else {
                                            Struct struct = this.ext_;
                                            Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                            Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                            this.ext_ = struct2;
                                            if (builder != null) {
                                                builder.mergeFrom(struct2);
                                                this.ext_ = builder.buildPartial();
                                            }
                                        }
                                    }
                                    z10 = true;
                                } catch (InvalidProtocolBufferException e10) {
                                    throw e10.setUnfinishedMessage(this);
                                } catch (IOException e11) {
                                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                                }
                            } catch (Throwable th) {
                                if (z11 & true) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                }
                                this.unknownFields = bVarG.build();
                                makeExtensionsImmutable();
                                throw th;
                            }
                        }
                        if (z11 & true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                    }

                    public static DataAssetFormat parseFrom(InputStream inputStream, y yVar) throws IOException {
                        return (DataAssetFormat) j0.parseWithIOException(PARSER, inputStream, yVar);
                    }

                    public static DataAssetFormat parseFrom(n nVar) throws IOException {
                        return (DataAssetFormat) j0.parseWithIOException(PARSER, nVar);
                    }

                    public static DataAssetFormat parseFrom(n nVar, y yVar) throws IOException {
                        return (DataAssetFormat) j0.parseWithIOException(PARSER, nVar, yVar);
                    }
                }

                public interface DataAssetFormatOrBuilder extends MessageOrBuilder {
                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

                    Struct getExt();

                    i2 getExtOrBuilder();

                    Any getExtProto(int i10);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    e getExtProtoOrBuilder(int i10);

                    List<? extends e> getExtProtoOrBuilderList();

                    int getLen();

                    NativeDataAssetType getType();

                    int getTypeValue();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static final class ImageAssetFormat extends j0 implements ImageAssetFormatOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 10;
                    public static final int EXT_PROTO_FIELD_NUMBER = 9;
                    public static final int HMIN_FIELD_NUMBER = 6;
                    public static final int HRATIO_FIELD_NUMBER = 8;
                    public static final int H_FIELD_NUMBER = 4;
                    public static final int MIME_FIELD_NUMBER = 2;
                    public static final int TYPE_FIELD_NUMBER = 1;
                    public static final int WMIN_FIELD_NUMBER = 5;
                    public static final int WRATIO_FIELD_NUMBER = 7;
                    public static final int W_FIELD_NUMBER = 3;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int h_;
                    private int hmin_;
                    private int hratio_;
                    private byte memoizedIsInitialized;
                    private r0 mime_;
                    private int type_;
                    private int w_;
                    private int wmin_;
                    private int wratio_;
                    private static final ImageAssetFormat DEFAULT_INSTANCE = new ImageAssetFormat();
                    private static final s1<ImageAssetFormat> PARSER = new com.explorestack.protobuf.b<ImageAssetFormat>() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.1
                        @Override // com.explorestack.protobuf.s1
                        public ImageAssetFormat parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                            return new ImageAssetFormat(nVar, yVar);
                        }
                    };

                    public static final class Builder extends j0.b<Builder> implements ImageAssetFormatOrBuilder {
                        private int bitField0_;
                        private e2<Struct, Struct.Builder, i2> extBuilder_;
                        private z1<Any, Any.Builder, e> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int h_;
                        private int hmin_;
                        private int hratio_;
                        private r0 mime_;
                        private int type_;
                        private int w_;
                        private int wmin_;
                        private int wratio_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 2) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 2;
                            }
                        }

                        private void ensureMimeIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.mime_ = new q0(this.mime_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.Q;
                        }

                        private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
                            if (this.extBuilder_ == null) {
                                this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                                this.ext_ = null;
                            }
                            return this.extBuilder_;
                        }

                        private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
                            if (this.extProtoBuilder_ == null) {
                                this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                                this.extProto_ = null;
                            }
                            return this.extProtoBuilder_;
                        }

                        private void maybeForceBuilderInitialization() {
                            if (j0.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                                onChanged();
                            } else {
                                z1Var.a(iterable);
                            }
                            return this;
                        }

                        public Builder addAllMime(Iterable<String> iterable) {
                            ensureMimeIsMutable();
                            com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.mime_);
                            onChanged();
                            return this;
                        }

                        public Builder addExtProto(Any any) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(any);
                                onChanged();
                            } else {
                                z1Var.e(any);
                            }
                            return this;
                        }

                        public Any.Builder addExtProtoBuilder() {
                            return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                        }

                        public Builder addMime(String str) {
                            str.getClass();
                            ensureMimeIsMutable();
                            this.mime_.add(str);
                            onChanged();
                            return this;
                        }

                        public Builder addMimeBytes(ByteString byteString) {
                            byteString.getClass();
                            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                            ensureMimeIsMutable();
                            this.mime_.b(byteString);
                            onChanged();
                            return this;
                        }

                        public Builder clearExt() {
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                                onChanged();
                            } else {
                                this.ext_ = null;
                                this.extBuilder_ = null;
                            }
                            return this;
                        }

                        public Builder clearExtProto() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                this.extProto_ = Collections.emptyList();
                                this.bitField0_ &= -3;
                                onChanged();
                            } else {
                                z1Var.g();
                            }
                            return this;
                        }

                        public Builder clearH() {
                            this.h_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearHmin() {
                            this.hmin_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearHratio() {
                            this.hratio_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearMime() {
                            this.mime_ = q0.f10776d;
                            this.bitField0_ &= -2;
                            onChanged();
                            return this;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearW() {
                            this.w_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearWmin() {
                            this.wmin_ = 0;
                            onChanged();
                            return this;
                        }

                        public Builder clearWratio() {
                            this.wratio_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.Q;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public Struct getExt() {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var != null) {
                                return (Struct) e2Var.e();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        public Struct.Builder getExtBuilder() {
                            onChanged();
                            return (Struct.Builder) getExtFieldBuilder().d();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public i2 getExtOrBuilder() {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var != null) {
                                return (i2) e2Var.f();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public Any getExtProto(int i10) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
                        }

                        public Any.Builder getExtProtoBuilder(int i10) {
                            return (Any.Builder) getExtProtoFieldBuilder().k(i10);
                        }

                        public List<Any.Builder> getExtProtoBuilderList() {
                            return getExtProtoFieldBuilder().l();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getExtProtoCount() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.size() : z1Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public List<Any> getExtProtoList() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public e getExtProtoOrBuilder(int i10) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public List<? extends e> getExtProtoOrBuilderList() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getH() {
                            return this.h_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getHmin() {
                            return this.hmin_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getHratio() {
                            return this.hratio_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public String getMime(int i10) {
                            return this.mime_.get(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public ByteString getMimeBytes(int i10) {
                            return this.mime_.getByteString(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getMimeCount() {
                            return this.mime_.size();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public NativeImageAssetType getType() {
                            NativeImageAssetType nativeImageAssetTypeValueOf = NativeImageAssetType.valueOf(this.type_);
                            return nativeImageAssetTypeValueOf == null ? NativeImageAssetType.UNRECOGNIZED : nativeImageAssetTypeValueOf;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getTypeValue() {
                            return this.type_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getW() {
                            return this.w_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getWmin() {
                            return this.wmin_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public int getWratio() {
                            return this.wratio_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.j0.b
                        protected j0.f internalGetFieldAccessorTable() {
                            return b.R.d(ImageAssetFormat.class, Builder.class);
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public final boolean isInitialized() {
                            return true;
                        }

                        public Builder mergeExt(Struct struct) {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                Struct struct2 = this.ext_;
                                if (struct2 != null) {
                                    this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                                } else {
                                    this.ext_ = struct;
                                }
                                onChanged();
                            } else {
                                e2Var.g(struct);
                            }
                            return this;
                        }

                        public Builder removeExtProto(int i10) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.remove(i10);
                                onChanged();
                            } else {
                                z1Var.v(i10);
                            }
                            return this;
                        }

                        public Builder setExt(Struct struct) {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                struct.getClass();
                                this.ext_ = struct;
                                onChanged();
                            } else {
                                e2Var.i(struct);
                            }
                            return this;
                        }

                        public Builder setExtProto(int i10, Any any) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i10, any);
                                onChanged();
                            } else {
                                z1Var.w(i10, any);
                            }
                            return this;
                        }

                        public Builder setH(int i10) {
                            this.h_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setHmin(int i10) {
                            this.hmin_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setHratio(int i10) {
                            this.hratio_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setMime(int i10, String str) {
                            str.getClass();
                            ensureMimeIsMutable();
                            this.mime_.set(i10, str);
                            onChanged();
                            return this;
                        }

                        public Builder setType(NativeImageAssetType nativeImageAssetType) {
                            nativeImageAssetType.getClass();
                            this.type_ = nativeImageAssetType.getNumber();
                            onChanged();
                            return this;
                        }

                        public Builder setTypeValue(int i10) {
                            this.type_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setW(int i10) {
                            this.w_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setWmin(int i10) {
                            this.wmin_ = i10;
                            onChanged();
                            return this;
                        }

                        public Builder setWratio(int i10) {
                            this.wratio_ = i10;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                        public w1 getMimeList() {
                            return this.mime_.getUnmodifiableView();
                        }

                        private Builder() {
                            this.type_ = 0;
                            this.mime_ = q0.f10776d;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAssetFormat build() {
                            ImageAssetFormat imageAssetFormatBuildPartial = buildPartial();
                            if (imageAssetFormatBuildPartial.isInitialized()) {
                                return imageAssetFormatBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) imageAssetFormatBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public ImageAssetFormat buildPartial() {
                            ImageAssetFormat imageAssetFormat = new ImageAssetFormat(this);
                            imageAssetFormat.type_ = this.type_;
                            if ((this.bitField0_ & 1) != 0) {
                                this.mime_ = this.mime_.getUnmodifiableView();
                                this.bitField0_ &= -2;
                            }
                            imageAssetFormat.mime_ = this.mime_;
                            imageAssetFormat.w_ = this.w_;
                            imageAssetFormat.h_ = this.h_;
                            imageAssetFormat.wmin_ = this.wmin_;
                            imageAssetFormat.hmin_ = this.hmin_;
                            imageAssetFormat.wratio_ = this.wratio_;
                            imageAssetFormat.hratio_ = this.hratio_;
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                imageAssetFormat.ext_ = this.ext_;
                            } else {
                                imageAssetFormat.ext_ = (Struct) e2Var.a();
                            }
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var != null) {
                                imageAssetFormat.extProto_ = z1Var.f();
                            } else {
                                if ((this.bitField0_ & 2) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -3;
                                }
                                imageAssetFormat.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return imageAssetFormat;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        /* JADX INFO: renamed from: getDefaultInstanceForType */
                        public ImageAssetFormat mo164getDefaultInstanceForType() {
                            return ImageAssetFormat.getDefaultInstance();
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

                        public Any.Builder addExtProtoBuilder(int i10) {
                            return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
                            this.type_ = 0;
                            this.mime_ = q0.f10776d;
                            this.bitField0_ &= -2;
                            this.w_ = 0;
                            this.h_ = 0;
                            this.wmin_ = 0;
                            this.hmin_ = 0;
                            this.wratio_ = 0;
                            this.hratio_ = 0;
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                            } else {
                                this.ext_ = null;
                                this.extBuilder_ = null;
                            }
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                this.extProto_ = Collections.emptyList();
                                this.bitField0_ &= -3;
                            } else {
                                z1Var.g();
                            }
                            return this;
                        }

                        public Builder setExt(Struct.Builder builder) {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                this.ext_ = builder.build();
                                onChanged();
                            } else {
                                e2Var.i(builder.build());
                            }
                            return this;
                        }

                        public Builder addExtProto(int i10, Any any) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i10, any);
                                onChanged();
                            } else {
                                z1Var.d(i10, any);
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
                            if (message instanceof ImageAssetFormat) {
                                return mergeFrom((ImageAssetFormat) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder setExtProto(int i10, Any.Builder builder) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i10, builder.build());
                                onChanged();
                            } else {
                                z1Var.w(i10, builder.build());
                            }
                            return this;
                        }

                        private Builder(j0.c cVar) {
                            super(cVar);
                            this.type_ = 0;
                            this.mime_ = q0.f10776d;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        public Builder mergeFrom(ImageAssetFormat imageAssetFormat) {
                            if (imageAssetFormat == ImageAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (imageAssetFormat.type_ != 0) {
                                setTypeValue(imageAssetFormat.getTypeValue());
                            }
                            if (!imageAssetFormat.mime_.isEmpty()) {
                                if (this.mime_.isEmpty()) {
                                    this.mime_ = imageAssetFormat.mime_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureMimeIsMutable();
                                    this.mime_.addAll(imageAssetFormat.mime_);
                                }
                                onChanged();
                            }
                            if (imageAssetFormat.getW() != 0) {
                                setW(imageAssetFormat.getW());
                            }
                            if (imageAssetFormat.getH() != 0) {
                                setH(imageAssetFormat.getH());
                            }
                            if (imageAssetFormat.getWmin() != 0) {
                                setWmin(imageAssetFormat.getWmin());
                            }
                            if (imageAssetFormat.getHmin() != 0) {
                                setHmin(imageAssetFormat.getHmin());
                            }
                            if (imageAssetFormat.getWratio() != 0) {
                                setWratio(imageAssetFormat.getWratio());
                            }
                            if (imageAssetFormat.getHratio() != 0) {
                                setHratio(imageAssetFormat.getHratio());
                            }
                            if (imageAssetFormat.hasExt()) {
                                mergeExt(imageAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!imageAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = imageAssetFormat.extProto_;
                                        this.bitField0_ &= -3;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(imageAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!imageAssetFormat.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.t()) {
                                    this.extProtoBuilder_.a(imageAssetFormat.extProto_);
                                } else {
                                    this.extProtoBuilder_.h();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = imageAssetFormat.extProto_;
                                    this.bitField0_ &= -3;
                                    this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((j0) imageAssetFormat).unknownFields);
                            onChanged();
                            return this;
                        }

                        public Builder addExtProto(Any.Builder builder) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(builder.build());
                                onChanged();
                            } else {
                                z1Var.e(builder.build());
                            }
                            return this;
                        }

                        public Builder addExtProto(int i10, Any.Builder builder) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i10, builder.build());
                                onChanged();
                            } else {
                                z1Var.d(i10, builder.build());
                            }
                            return this;
                        }

                        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                            ImageAssetFormat imageAssetFormat = null;
                            try {
                                try {
                                    ImageAssetFormat imageAssetFormat2 = (ImageAssetFormat) ImageAssetFormat.PARSER.parsePartialFrom(nVar, yVar);
                                    if (imageAssetFormat2 != null) {
                                        mergeFrom(imageAssetFormat2);
                                    }
                                    return this;
                                } catch (InvalidProtocolBufferException e10) {
                                    ImageAssetFormat imageAssetFormat3 = (ImageAssetFormat) e10.getUnfinishedMessage();
                                    try {
                                        throw e10.unwrapIOException();
                                    } catch (Throwable th) {
                                        th = th;
                                        imageAssetFormat = imageAssetFormat3;
                                        if (imageAssetFormat != null) {
                                            mergeFrom(imageAssetFormat);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (imageAssetFormat != null) {
                                    mergeFrom(imageAssetFormat);
                                }
                                throw th;
                            }
                        }
                    }

                    public static ImageAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.Q;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static ImageAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (ImageAssetFormat) j0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static ImageAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static s1<ImageAssetFormat> parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof ImageAssetFormat)) {
                            return super.equals(obj);
                        }
                        ImageAssetFormat imageAssetFormat = (ImageAssetFormat) obj;
                        if (this.type_ == imageAssetFormat.type_ && getMimeList().equals(imageAssetFormat.getMimeList()) && getW() == imageAssetFormat.getW() && getH() == imageAssetFormat.getH() && getWmin() == imageAssetFormat.getWmin() && getHmin() == imageAssetFormat.getHmin() && getWratio() == imageAssetFormat.getWratio() && getHratio() == imageAssetFormat.getHratio() && hasExt() == imageAssetFormat.hasExt()) {
                            return (!hasExt() || getExt().equals(imageAssetFormat.getExt())) && getExtProtoList().equals(imageAssetFormat.getExtProtoList()) && this.unknownFields.equals(imageAssetFormat.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public i2 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getH() {
                        return this.h_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getHmin() {
                        return this.hmin_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getHratio() {
                        return this.hratio_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public String getMime(int i10) {
                        return this.mime_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public ByteString getMimeBytes(int i10) {
                        return this.mime_.getByteString(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getMimeCount() {
                        return this.mime_.size();
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public s1<ImageAssetFormat> getParserForType() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public int getSerializedSize() {
                        int i10 = this.memoizedSize;
                        if (i10 != -1) {
                            return i10;
                        }
                        int iL = this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber() ? CodedOutputStream.l(1, this.type_) + 0 : 0;
                        int iComputeStringSizeNoTag = 0;
                        for (int i11 = 0; i11 < this.mime_.size(); i11++) {
                            iComputeStringSizeNoTag += j0.computeStringSizeNoTag(this.mime_.getRaw(i11));
                        }
                        int size = iL + iComputeStringSizeNoTag + (getMimeList().size() * 1);
                        int i12 = this.w_;
                        if (i12 != 0) {
                            size += CodedOutputStream.Y(3, i12);
                        }
                        int i13 = this.h_;
                        if (i13 != 0) {
                            size += CodedOutputStream.Y(4, i13);
                        }
                        int i14 = this.wmin_;
                        if (i14 != 0) {
                            size += CodedOutputStream.Y(5, i14);
                        }
                        int i15 = this.hmin_;
                        if (i15 != 0) {
                            size += CodedOutputStream.Y(6, i15);
                        }
                        int i16 = this.wratio_;
                        if (i16 != 0) {
                            size += CodedOutputStream.Y(7, i16);
                        }
                        int i17 = this.hratio_;
                        if (i17 != 0) {
                            size += CodedOutputStream.Y(8, i17);
                        }
                        for (int i18 = 0; i18 < this.extProto_.size(); i18++) {
                            size += CodedOutputStream.G(9, this.extProto_.get(i18));
                        }
                        if (this.ext_ != null) {
                            size += CodedOutputStream.G(10, getExt());
                        }
                        int serializedSize = size + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public NativeImageAssetType getType() {
                        NativeImageAssetType nativeImageAssetTypeValueOf = NativeImageAssetType.valueOf(this.type_);
                        return nativeImageAssetTypeValueOf == null ? NativeImageAssetType.UNRECOGNIZED : nativeImageAssetTypeValueOf;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getTypeValue() {
                        return this.type_;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
                    public final u2 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getW() {
                        return this.w_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getWmin() {
                        return this.wmin_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public int getWratio() {
                        return this.wratio_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_;
                        if (getMimeCount() > 0) {
                            iHashCode = (((iHashCode * 37) + 2) * 53) + getMimeList().hashCode();
                        }
                        int w10 = (((((((((((((((((((((((iHashCode * 37) + 3) * 53) + getW()) * 37) + 4) * 53) + getH()) * 37) + 5) * 53) + getWmin()) * 37) + 6) * 53) + getHmin()) * 37) + 7) * 53) + getWratio()) * 37) + 8) * 53) + getHratio();
                        if (hasExt()) {
                            w10 = (((w10 * 37) + 10) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            w10 = (((w10 * 37) + 9) * 53) + getExtProtoList().hashCode();
                        }
                        int iHashCode2 = (w10 * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = iHashCode2;
                        return iHashCode2;
                    }

                    @Override // com.explorestack.protobuf.j0
                    protected j0.f internalGetFieldAccessorTable() {
                        return b.R.d(ImageAssetFormat.class, Builder.class);
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
                        return new ImageAssetFormat();
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            codedOutputStream.v0(1, this.type_);
                        }
                        for (int i10 = 0; i10 < this.mime_.size(); i10++) {
                            j0.writeString(codedOutputStream, 2, this.mime_.getRaw(i10));
                        }
                        int i11 = this.w_;
                        if (i11 != 0) {
                            codedOutputStream.c1(3, i11);
                        }
                        int i12 = this.h_;
                        if (i12 != 0) {
                            codedOutputStream.c1(4, i12);
                        }
                        int i13 = this.wmin_;
                        if (i13 != 0) {
                            codedOutputStream.c1(5, i13);
                        }
                        int i14 = this.hmin_;
                        if (i14 != 0) {
                            codedOutputStream.c1(6, i14);
                        }
                        int i15 = this.wratio_;
                        if (i15 != 0) {
                            codedOutputStream.c1(7, i15);
                        }
                        int i16 = this.hratio_;
                        if (i16 != 0) {
                            codedOutputStream.c1(8, i16);
                        }
                        for (int i17 = 0; i17 < this.extProto_.size(); i17++) {
                            codedOutputStream.L0(9, this.extProto_.get(i17));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.L0(10, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    public static Builder newBuilder(ImageAssetFormat imageAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(imageAssetFormat);
                    }

                    public static ImageAssetFormat parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, yVar);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormatOrBuilder
                    public w1 getMimeList() {
                        return this.mime_;
                    }

                    private ImageAssetFormat(j0.b<?> bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static ImageAssetFormat parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                        return (ImageAssetFormat) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                    }

                    public static ImageAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public ImageAssetFormat mo164getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static ImageAssetFormat parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, yVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private ImageAssetFormat() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.type_ = 0;
                        this.mime_ = q0.f10776d;
                        this.extProto_ = Collections.emptyList();
                    }

                    public static ImageAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.j0
                    public Builder newBuilderForType(j0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static ImageAssetFormat parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, yVar);
                    }

                    public static ImageAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (ImageAssetFormat) j0.parseWithIOException(PARSER, inputStream);
                    }

                    public static ImageAssetFormat parseFrom(InputStream inputStream, y yVar) throws IOException {
                        return (ImageAssetFormat) j0.parseWithIOException(PARSER, inputStream, yVar);
                    }

                    private ImageAssetFormat(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                        case 8:
                                            this.type_ = nVar.t();
                                            continue;
                                        case 18:
                                            String strJ = nVar.J();
                                            if ((i10 & 1) == 0) {
                                                this.mime_ = new q0();
                                                i10 |= 1;
                                            }
                                            this.mime_.add(strJ);
                                            continue;
                                        case 24:
                                            this.w_ = nVar.L();
                                            continue;
                                        case 32:
                                            this.h_ = nVar.L();
                                            continue;
                                        case 40:
                                            this.wmin_ = nVar.L();
                                            continue;
                                        case 48:
                                            this.hmin_ = nVar.L();
                                            continue;
                                        case 56:
                                            this.wratio_ = nVar.L();
                                            continue;
                                        case 64:
                                            this.hratio_ = nVar.L();
                                            continue;
                                        case 74:
                                            if ((i10 & 2) == 0) {
                                                this.extProto_ = new ArrayList();
                                                i10 |= 2;
                                            }
                                            this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                            continue;
                                        case 82:
                                            Struct struct = this.ext_;
                                            Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                            Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                            this.ext_ = struct2;
                                            if (builder != null) {
                                                builder.mergeFrom(struct2);
                                                this.ext_ = builder.buildPartial();
                                            } else {
                                                continue;
                                            }
                                            break;
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
                                if ((i10 & 1) != 0) {
                                    this.mime_ = this.mime_.getUnmodifiableView();
                                }
                                if ((i10 & 2) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                }
                                this.unknownFields = bVarG.build();
                                makeExtensionsImmutable();
                                throw th;
                            }
                        }
                        if ((i10 & 1) != 0) {
                            this.mime_ = this.mime_.getUnmodifiableView();
                        }
                        if ((i10 & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                    }

                    public static ImageAssetFormat parseFrom(n nVar) throws IOException {
                        return (ImageAssetFormat) j0.parseWithIOException(PARSER, nVar);
                    }

                    public static ImageAssetFormat parseFrom(n nVar, y yVar) throws IOException {
                        return (ImageAssetFormat) j0.parseWithIOException(PARSER, nVar, yVar);
                    }
                }

                public interface ImageAssetFormatOrBuilder extends MessageOrBuilder {
                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

                    Struct getExt();

                    i2 getExtOrBuilder();

                    Any getExtProto(int i10);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    e getExtProtoOrBuilder(int i10);

                    List<? extends e> getExtProtoOrBuilderList();

                    int getH();

                    int getHmin();

                    int getHratio();

                    String getMime(int i10);

                    ByteString getMimeBytes(int i10);

                    int getMimeCount();

                    List<String> getMimeList();

                    NativeImageAssetType getType();

                    int getTypeValue();

                    int getW();

                    int getWmin();

                    int getWratio();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static final class TitleAssetFormat extends j0 implements TitleAssetFormatOrBuilder {
                    public static final int EXT_FIELD_NUMBER = 3;
                    public static final int EXT_PROTO_FIELD_NUMBER = 2;
                    public static final int LEN_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int len_;
                    private byte memoizedIsInitialized;
                    private static final TitleAssetFormat DEFAULT_INSTANCE = new TitleAssetFormat();
                    private static final s1<TitleAssetFormat> PARSER = new com.explorestack.protobuf.b<TitleAssetFormat>() { // from class: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.1
                        @Override // com.explorestack.protobuf.s1
                        public TitleAssetFormat parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                            return new TitleAssetFormat(nVar, yVar);
                        }
                    };

                    public static TitleAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.O;
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static TitleAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (TitleAssetFormat) j0.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static TitleAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static s1<TitleAssetFormat> parser() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof TitleAssetFormat)) {
                            return super.equals(obj);
                        }
                        TitleAssetFormat titleAssetFormat = (TitleAssetFormat) obj;
                        if (getLen() == titleAssetFormat.getLen() && hasExt() == titleAssetFormat.hasExt()) {
                            return (!hasExt() || getExt().equals(titleAssetFormat.getExt())) && getExtProtoList().equals(titleAssetFormat.getExtProtoList()) && this.unknownFields.equals(titleAssetFormat.unknownFields);
                        }
                        return false;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public Struct getExt() {
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public i2 getExtOrBuilder() {
                        return getExt();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public Any getExtProto(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public int getExtProtoCount() {
                        return this.extProto_.size();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        return this.extProto_.get(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        return this.extProto_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public int getLen() {
                        return this.len_;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public s1<TitleAssetFormat> getParserForType() {
                        return PARSER;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public int getSerializedSize() {
                        int i10 = this.memoizedSize;
                        if (i10 != -1) {
                            return i10;
                        }
                        int i11 = this.len_;
                        int iY = i11 != 0 ? CodedOutputStream.Y(1, i11) + 0 : 0;
                        for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                            iY += CodedOutputStream.G(2, this.extProto_.get(i12));
                        }
                        if (this.ext_ != null) {
                            iY += CodedOutputStream.G(3, getExt());
                        }
                        int serializedSize = iY + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
                    public final u2 getUnknownFields() {
                        return this.unknownFields;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                    public boolean hasExt() {
                        return this.ext_ != null;
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                    public int hashCode() {
                        int i10 = this.memoizedHashCode;
                        if (i10 != 0) {
                            return i10;
                        }
                        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getLen();
                        if (hasExt()) {
                            iHashCode = (((iHashCode * 37) + 3) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            iHashCode = (((iHashCode * 37) + 2) * 53) + getExtProtoList().hashCode();
                        }
                        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = iHashCode2;
                        return iHashCode2;
                    }

                    @Override // com.explorestack.protobuf.j0
                    protected j0.f internalGetFieldAccessorTable() {
                        return b.P.d(TitleAssetFormat.class, Builder.class);
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
                        return new TitleAssetFormat();
                    }

                    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                        int i10 = this.len_;
                        if (i10 != 0) {
                            codedOutputStream.c1(1, i10);
                        }
                        for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                            codedOutputStream.L0(2, this.extProto_.get(i11));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.L0(3, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    public static final class Builder extends j0.b<Builder> implements TitleAssetFormatOrBuilder {
                        private int bitField0_;
                        private e2<Struct, Struct.Builder, i2> extBuilder_;
                        private z1<Any, Any.Builder, e> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;

                        private void ensureExtProtoIsMutable() {
                            if ((this.bitField0_ & 1) == 0) {
                                this.extProto_ = new ArrayList(this.extProto_);
                                this.bitField0_ |= 1;
                            }
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return b.O;
                        }

                        private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
                            if (this.extBuilder_ == null) {
                                this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                                this.ext_ = null;
                            }
                            return this.extBuilder_;
                        }

                        private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
                            if (this.extProtoBuilder_ == null) {
                                this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                                this.extProto_ = null;
                            }
                            return this.extProtoBuilder_;
                        }

                        private void maybeForceBuilderInitialization() {
                            if (j0.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                                onChanged();
                            } else {
                                z1Var.a(iterable);
                            }
                            return this;
                        }

                        public Builder addExtProto(Any any) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(any);
                                onChanged();
                            } else {
                                z1Var.e(any);
                            }
                            return this;
                        }

                        public Any.Builder addExtProtoBuilder() {
                            return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                        }

                        public Builder clearExt() {
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                                onChanged();
                            } else {
                                this.ext_ = null;
                                this.extBuilder_ = null;
                            }
                            return this;
                        }

                        public Builder clearExtProto() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                this.extProto_ = Collections.emptyList();
                                this.bitField0_ &= -2;
                                onChanged();
                            } else {
                                z1Var.g();
                            }
                            return this;
                        }

                        public Builder clearLen() {
                            this.len_ = 0;
                            onChanged();
                            return this;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public Descriptors.Descriptor getDescriptorForType() {
                            return b.O;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public Struct getExt() {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var != null) {
                                return (Struct) e2Var.e();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        public Struct.Builder getExtBuilder() {
                            onChanged();
                            return (Struct.Builder) getExtFieldBuilder().d();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public i2 getExtOrBuilder() {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var != null) {
                                return (i2) e2Var.f();
                            }
                            Struct struct = this.ext_;
                            return struct == null ? Struct.getDefaultInstance() : struct;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public Any getExtProto(int i10) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
                        }

                        public Any.Builder getExtProtoBuilder(int i10) {
                            return (Any.Builder) getExtProtoFieldBuilder().k(i10);
                        }

                        public List<Any.Builder> getExtProtoBuilderList() {
                            return getExtProtoFieldBuilder().l();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public int getExtProtoCount() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.size() : z1Var.m();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public List<Any> getExtProtoList() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public e getExtProtoOrBuilder(int i10) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public List<? extends e> getExtProtoOrBuilderList() {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public int getLen() {
                            return this.len_;
                        }

                        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormatOrBuilder
                        public boolean hasExt() {
                            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                        }

                        @Override // com.explorestack.protobuf.j0.b
                        protected j0.f internalGetFieldAccessorTable() {
                            return b.P.d(TitleAssetFormat.class, Builder.class);
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        public final boolean isInitialized() {
                            return true;
                        }

                        public Builder mergeExt(Struct struct) {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                Struct struct2 = this.ext_;
                                if (struct2 != null) {
                                    this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                                } else {
                                    this.ext_ = struct;
                                }
                                onChanged();
                            } else {
                                e2Var.g(struct);
                            }
                            return this;
                        }

                        public Builder removeExtProto(int i10) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.remove(i10);
                                onChanged();
                            } else {
                                z1Var.v(i10);
                            }
                            return this;
                        }

                        public Builder setExt(Struct struct) {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                struct.getClass();
                                this.ext_ = struct;
                                onChanged();
                            } else {
                                e2Var.i(struct);
                            }
                            return this;
                        }

                        public Builder setExtProto(int i10, Any any) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i10, any);
                                onChanged();
                            } else {
                                z1Var.w(i10, any);
                            }
                            return this;
                        }

                        public Builder setLen(int i10) {
                            this.len_ = i10;
                            onChanged();
                            return this;
                        }

                        private Builder() {
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAssetFormat build() {
                            TitleAssetFormat titleAssetFormatBuildPartial = buildPartial();
                            if (titleAssetFormatBuildPartial.isInitialized()) {
                                return titleAssetFormatBuildPartial;
                            }
                            throw AbstractMessage.Builder.newUninitializedMessageException((Message) titleAssetFormatBuildPartial);
                        }

                        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public TitleAssetFormat buildPartial() {
                            TitleAssetFormat titleAssetFormat = new TitleAssetFormat(this);
                            titleAssetFormat.len_ = this.len_;
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                titleAssetFormat.ext_ = this.ext_;
                            } else {
                                titleAssetFormat.ext_ = (Struct) e2Var.a();
                            }
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var != null) {
                                titleAssetFormat.extProto_ = z1Var.f();
                            } else {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                titleAssetFormat.extProto_ = this.extProto_;
                            }
                            onBuilt();
                            return titleAssetFormat;
                        }

                        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                            return (Builder) super.clearField(fieldDescriptor);
                        }

                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                        /* JADX INFO: renamed from: getDefaultInstanceForType */
                        public TitleAssetFormat mo164getDefaultInstanceForType() {
                            return TitleAssetFormat.getDefaultInstance();
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

                        public Any.Builder addExtProtoBuilder(int i10) {
                            return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
                            this.len_ = 0;
                            if (this.extBuilder_ == null) {
                                this.ext_ = null;
                            } else {
                                this.ext_ = null;
                                this.extBuilder_ = null;
                            }
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                this.extProto_ = Collections.emptyList();
                                this.bitField0_ &= -2;
                            } else {
                                z1Var.g();
                            }
                            return this;
                        }

                        private Builder(j0.c cVar) {
                            super(cVar);
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        public Builder setExt(Struct.Builder builder) {
                            e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                            if (e2Var == null) {
                                this.ext_ = builder.build();
                                onChanged();
                            } else {
                                e2Var.i(builder.build());
                            }
                            return this;
                        }

                        public Builder addExtProto(int i10, Any any) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                any.getClass();
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i10, any);
                                onChanged();
                            } else {
                                z1Var.d(i10, any);
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
                            if (message instanceof TitleAssetFormat) {
                                return mergeFrom((TitleAssetFormat) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder setExtProto(int i10, Any.Builder builder) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.set(i10, builder.build());
                                onChanged();
                            } else {
                                z1Var.w(i10, builder.build());
                            }
                            return this;
                        }

                        public Builder mergeFrom(TitleAssetFormat titleAssetFormat) {
                            if (titleAssetFormat == TitleAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (titleAssetFormat.getLen() != 0) {
                                setLen(titleAssetFormat.getLen());
                            }
                            if (titleAssetFormat.hasExt()) {
                                mergeExt(titleAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!titleAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = titleAssetFormat.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(titleAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!titleAssetFormat.extProto_.isEmpty()) {
                                if (!this.extProtoBuilder_.t()) {
                                    this.extProtoBuilder_.a(titleAssetFormat.extProto_);
                                } else {
                                    this.extProtoBuilder_.h();
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = titleAssetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                    this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                                }
                            }
                            mergeUnknownFields(((j0) titleAssetFormat).unknownFields);
                            onChanged();
                            return this;
                        }

                        public Builder addExtProto(Any.Builder builder) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(builder.build());
                                onChanged();
                            } else {
                                z1Var.e(builder.build());
                            }
                            return this;
                        }

                        public Builder addExtProto(int i10, Any.Builder builder) {
                            z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                            if (z1Var == null) {
                                ensureExtProtoIsMutable();
                                this.extProto_.add(i10, builder.build());
                                onChanged();
                            } else {
                                z1Var.d(i10, builder.build());
                            }
                            return this;
                        }

                        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                            TitleAssetFormat titleAssetFormat = null;
                            try {
                                try {
                                    TitleAssetFormat titleAssetFormat2 = (TitleAssetFormat) TitleAssetFormat.PARSER.parsePartialFrom(nVar, yVar);
                                    if (titleAssetFormat2 != null) {
                                        mergeFrom(titleAssetFormat2);
                                    }
                                    return this;
                                } catch (InvalidProtocolBufferException e10) {
                                    TitleAssetFormat titleAssetFormat3 = (TitleAssetFormat) e10.getUnfinishedMessage();
                                    try {
                                        throw e10.unwrapIOException();
                                    } catch (Throwable th) {
                                        th = th;
                                        titleAssetFormat = titleAssetFormat3;
                                        if (titleAssetFormat != null) {
                                            mergeFrom(titleAssetFormat);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (titleAssetFormat != null) {
                                    mergeFrom(titleAssetFormat);
                                }
                                throw th;
                            }
                        }
                    }

                    public static Builder newBuilder(TitleAssetFormat titleAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(titleAssetFormat);
                    }

                    public static TitleAssetFormat parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, yVar);
                    }

                    private TitleAssetFormat(j0.b<?> bVar) {
                        super(bVar);
                        this.memoizedIsInitialized = (byte) -1;
                    }

                    public static TitleAssetFormat parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                        return (TitleAssetFormat) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                    }

                    public static TitleAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public TitleAssetFormat mo164getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    public static TitleAssetFormat parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, yVar);
                    }

                    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    private TitleAssetFormat() {
                        this.memoizedIsInitialized = (byte) -1;
                        this.extProto_ = Collections.emptyList();
                    }

                    public static TitleAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.explorestack.protobuf.j0
                    public Builder newBuilderForType(j0.c cVar) {
                        return new Builder(cVar);
                    }

                    public static TitleAssetFormat parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, yVar);
                    }

                    public static TitleAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (TitleAssetFormat) j0.parseWithIOException(PARSER, inputStream);
                    }

                    private TitleAssetFormat(n nVar, y yVar) throws InvalidProtocolBufferException {
                        this();
                        yVar.getClass();
                        u2.b bVarG = u2.g();
                        boolean z10 = false;
                        boolean z11 = false;
                        while (!z10) {
                            try {
                                try {
                                    int iK = nVar.K();
                                    if (iK != 0) {
                                        if (iK == 8) {
                                            this.len_ = nVar.L();
                                        } else if (iK == 18) {
                                            if (!(z11 & true)) {
                                                this.extProto_ = new ArrayList();
                                                z11 |= true;
                                            }
                                            this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                        } else if (iK != 26) {
                                            if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                            }
                                        } else {
                                            Struct struct = this.ext_;
                                            Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                            Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                            this.ext_ = struct2;
                                            if (builder != null) {
                                                builder.mergeFrom(struct2);
                                                this.ext_ = builder.buildPartial();
                                            }
                                        }
                                    }
                                    z10 = true;
                                } catch (InvalidProtocolBufferException e10) {
                                    throw e10.setUnfinishedMessage(this);
                                } catch (IOException e11) {
                                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                                }
                            } catch (Throwable th) {
                                if (z11 & true) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                }
                                this.unknownFields = bVarG.build();
                                makeExtensionsImmutable();
                                throw th;
                            }
                        }
                        if (z11 & true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                    }

                    public static TitleAssetFormat parseFrom(InputStream inputStream, y yVar) throws IOException {
                        return (TitleAssetFormat) j0.parseWithIOException(PARSER, inputStream, yVar);
                    }

                    public static TitleAssetFormat parseFrom(n nVar) throws IOException {
                        return (TitleAssetFormat) j0.parseWithIOException(PARSER, nVar);
                    }

                    public static TitleAssetFormat parseFrom(n nVar, y yVar) throws IOException {
                        return (TitleAssetFormat) j0.parseWithIOException(PARSER, nVar, yVar);
                    }
                }

                public interface TitleAssetFormatOrBuilder extends MessageOrBuilder {
                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    /* synthetic */ MessageLite mo164getDefaultInstanceForType();

                    Struct getExt();

                    i2 getExtOrBuilder();

                    Any getExtProto(int i10);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    e getExtProtoOrBuilder(int i10);

                    List<? extends e> getExtProtoOrBuilderList();

                    int getLen();

                    boolean hasExt();

                    @Override // com.explorestack.protobuf.MessageOrBuilder
                    /* synthetic */ boolean isInitialized();
                }

                public static AssetFormat getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.M;
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static AssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (AssetFormat) j0.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static AssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static s1<AssetFormat> parser() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof AssetFormat)) {
                        return super.equals(obj);
                    }
                    AssetFormat assetFormat = (AssetFormat) obj;
                    if (getId() != assetFormat.getId() || getReq() != assetFormat.getReq() || hasTitle() != assetFormat.hasTitle()) {
                        return false;
                    }
                    if ((hasTitle() && !getTitle().equals(assetFormat.getTitle())) || hasImg() != assetFormat.hasImg()) {
                        return false;
                    }
                    if ((hasImg() && !getImg().equals(assetFormat.getImg())) || hasVideo() != assetFormat.hasVideo()) {
                        return false;
                    }
                    if ((hasVideo() && !getVideo().equals(assetFormat.getVideo())) || hasData() != assetFormat.hasData()) {
                        return false;
                    }
                    if ((!hasData() || getData().equals(assetFormat.getData())) && hasExt() == assetFormat.hasExt()) {
                        return (!hasExt() || getExt().equals(assetFormat.getExt())) && getExtProtoList().equals(assetFormat.getExtProtoList()) && this.unknownFields.equals(assetFormat.unknownFields);
                    }
                    return false;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public DataAssetFormat getData() {
                    DataAssetFormat dataAssetFormat = this.data_;
                    return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public DataAssetFormatOrBuilder getDataOrBuilder() {
                    return getData();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public i2 getExtOrBuilder() {
                    return getExt();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public Any getExtProto(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    return this.extProto_.get(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public int getId() {
                    return this.id_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public ImageAssetFormat getImg() {
                    ImageAssetFormat imageAssetFormat = this.img_;
                    return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public ImageAssetFormatOrBuilder getImgOrBuilder() {
                    return getImg();
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public s1<AssetFormat> getParserForType() {
                    return PARSER;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean getReq() {
                    return this.req_;
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int i11 = this.id_;
                    int iY = i11 != 0 ? CodedOutputStream.Y(1, i11) + 0 : 0;
                    boolean z10 = this.req_;
                    if (z10) {
                        iY += CodedOutputStream.e(2, z10);
                    }
                    if (this.title_ != null) {
                        iY += CodedOutputStream.G(3, getTitle());
                    }
                    if (this.img_ != null) {
                        iY += CodedOutputStream.G(4, getImg());
                    }
                    if (this.video_ != null) {
                        iY += CodedOutputStream.G(5, getVideo());
                    }
                    if (this.data_ != null) {
                        iY += CodedOutputStream.G(6, getData());
                    }
                    for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                        iY += CodedOutputStream.G(7, this.extProto_.get(i12));
                    }
                    if (this.ext_ != null) {
                        iY += CodedOutputStream.G(8, getExt());
                    }
                    int serializedSize = iY + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public TitleAssetFormat getTitle() {
                    TitleAssetFormat titleAssetFormat = this.title_;
                    return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public TitleAssetFormatOrBuilder getTitleOrBuilder() {
                    return getTitle();
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
                public final u2 getUnknownFields() {
                    return this.unknownFields;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public VideoPlacement getVideo() {
                    VideoPlacement videoPlacement = this.video_;
                    return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public VideoPlacementOrBuilder getVideoOrBuilder() {
                    return getVideo();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasData() {
                    return this.data_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasExt() {
                    return this.ext_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasImg() {
                    return this.img_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasTitle() {
                    return this.title_ != null;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                public boolean hasVideo() {
                    return this.video_ != null;
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId()) * 37) + 2) * 53) + l0.d(getReq());
                    if (hasTitle()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + getTitle().hashCode();
                    }
                    if (hasImg()) {
                        iHashCode = (((iHashCode * 37) + 4) * 53) + getImg().hashCode();
                    }
                    if (hasVideo()) {
                        iHashCode = (((iHashCode * 37) + 5) * 53) + getVideo().hashCode();
                    }
                    if (hasData()) {
                        iHashCode = (((iHashCode * 37) + 6) * 53) + getData().hashCode();
                    }
                    if (hasExt()) {
                        iHashCode = (((iHashCode * 37) + 8) * 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        iHashCode = (((iHashCode * 37) + 7) * 53) + getExtProtoList().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.explorestack.protobuf.j0
                protected j0.f internalGetFieldAccessorTable() {
                    return b.N.d(AssetFormat.class, Builder.class);
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
                    return new AssetFormat();
                }

                @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    int i10 = this.id_;
                    if (i10 != 0) {
                        codedOutputStream.c1(1, i10);
                    }
                    boolean z10 = this.req_;
                    if (z10) {
                        codedOutputStream.n0(2, z10);
                    }
                    if (this.title_ != null) {
                        codedOutputStream.L0(3, getTitle());
                    }
                    if (this.img_ != null) {
                        codedOutputStream.L0(4, getImg());
                    }
                    if (this.video_ != null) {
                        codedOutputStream.L0(5, getVideo());
                    }
                    if (this.data_ != null) {
                        codedOutputStream.L0(6, getData());
                    }
                    for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                        codedOutputStream.L0(7, this.extProto_.get(i11));
                    }
                    if (this.ext_ != null) {
                        codedOutputStream.L0(8, getExt());
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                public static final class Builder extends j0.b<Builder> implements AssetFormatOrBuilder {
                    private int bitField0_;
                    private e2<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> dataBuilder_;
                    private DataAssetFormat data_;
                    private e2<Struct, Struct.Builder, i2> extBuilder_;
                    private z1<Any, Any.Builder, e> extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int id_;
                    private e2<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> imgBuilder_;
                    private ImageAssetFormat img_;
                    private boolean req_;
                    private e2<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> titleBuilder_;
                    private TitleAssetFormat title_;
                    private e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> videoBuilder_;
                    private VideoPlacement video_;

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 1;
                        }
                    }

                    private e2<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> getDataFieldBuilder() {
                        if (this.dataBuilder_ == null) {
                            this.dataBuilder_ = new e2<>(getData(), getParentForChildren(), isClean());
                            this.data_ = null;
                        }
                        return this.dataBuilder_;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return b.M;
                    }

                    private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
                        if (this.extBuilder_ == null) {
                            this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                            this.ext_ = null;
                        }
                        return this.extBuilder_;
                    }

                    private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
                        if (this.extProtoBuilder_ == null) {
                            this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                            this.extProto_ = null;
                        }
                        return this.extProtoBuilder_;
                    }

                    private e2<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> getImgFieldBuilder() {
                        if (this.imgBuilder_ == null) {
                            this.imgBuilder_ = new e2<>(getImg(), getParentForChildren(), isClean());
                            this.img_ = null;
                        }
                        return this.imgBuilder_;
                    }

                    private e2<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> getTitleFieldBuilder() {
                        if (this.titleBuilder_ == null) {
                            this.titleBuilder_ = new e2<>(getTitle(), getParentForChildren(), isClean());
                            this.title_ = null;
                        }
                        return this.titleBuilder_;
                    }

                    private e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> getVideoFieldBuilder() {
                        if (this.videoBuilder_ == null) {
                            this.videoBuilder_ = new e2<>(getVideo(), getParentForChildren(), isClean());
                            this.video_ = null;
                        }
                        return this.videoBuilder_;
                    }

                    private void maybeForceBuilderInitialization() {
                        if (j0.alwaysUseFieldBuilders) {
                            getExtProtoFieldBuilder();
                        }
                    }

                    public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            ensureExtProtoIsMutable();
                            com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                            onChanged();
                        } else {
                            z1Var.a(iterable);
                        }
                        return this;
                    }

                    public Builder addExtProto(Any any) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.add(any);
                            onChanged();
                        } else {
                            z1Var.e(any);
                        }
                        return this;
                    }

                    public Any.Builder addExtProtoBuilder() {
                        return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                    }

                    public Builder clearData() {
                        if (this.dataBuilder_ == null) {
                            this.data_ = null;
                            onChanged();
                        } else {
                            this.data_ = null;
                            this.dataBuilder_ = null;
                        }
                        return this;
                    }

                    public Builder clearExt() {
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                            onChanged();
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        return this;
                    }

                    public Builder clearExtProto() {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            this.extProto_ = Collections.emptyList();
                            this.bitField0_ &= -2;
                            onChanged();
                        } else {
                            z1Var.g();
                        }
                        return this;
                    }

                    public Builder clearId() {
                        this.id_ = 0;
                        onChanged();
                        return this;
                    }

                    public Builder clearImg() {
                        if (this.imgBuilder_ == null) {
                            this.img_ = null;
                            onChanged();
                        } else {
                            this.img_ = null;
                            this.imgBuilder_ = null;
                        }
                        return this;
                    }

                    public Builder clearReq() {
                        this.req_ = false;
                        onChanged();
                        return this;
                    }

                    public Builder clearTitle() {
                        if (this.titleBuilder_ == null) {
                            this.title_ = null;
                            onChanged();
                        } else {
                            this.title_ = null;
                            this.titleBuilder_ = null;
                        }
                        return this;
                    }

                    public Builder clearVideo() {
                        if (this.videoBuilder_ == null) {
                            this.video_ = null;
                            onChanged();
                        } else {
                            this.video_ = null;
                            this.videoBuilder_ = null;
                        }
                        return this;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public DataAssetFormat getData() {
                        e2<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> e2Var = this.dataBuilder_;
                        if (e2Var != null) {
                            return (DataAssetFormat) e2Var.e();
                        }
                        DataAssetFormat dataAssetFormat = this.data_;
                        return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                    }

                    public DataAssetFormat.Builder getDataBuilder() {
                        onChanged();
                        return (DataAssetFormat.Builder) getDataFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public DataAssetFormatOrBuilder getDataOrBuilder() {
                        e2<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> e2Var = this.dataBuilder_;
                        if (e2Var != null) {
                            return (DataAssetFormatOrBuilder) e2Var.f();
                        }
                        DataAssetFormat dataAssetFormat = this.data_;
                        return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return b.M;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public Struct getExt() {
                        e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                        if (e2Var != null) {
                            return (Struct) e2Var.e();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    public Struct.Builder getExtBuilder() {
                        onChanged();
                        return (Struct.Builder) getExtFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public i2 getExtOrBuilder() {
                        e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                        if (e2Var != null) {
                            return (i2) e2Var.f();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public Any getExtProto(int i10) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
                    }

                    public Any.Builder getExtProtoBuilder(int i10) {
                        return (Any.Builder) getExtProtoFieldBuilder().k(i10);
                    }

                    public List<Any.Builder> getExtProtoBuilderList() {
                        return getExtProtoFieldBuilder().l();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public int getExtProtoCount() {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var == null ? this.extProto_.size() : z1Var.m();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public List<Any> getExtProtoList() {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public e getExtProtoOrBuilder(int i10) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public List<? extends e> getExtProtoOrBuilderList() {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public int getId() {
                        return this.id_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public ImageAssetFormat getImg() {
                        e2<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> e2Var = this.imgBuilder_;
                        if (e2Var != null) {
                            return (ImageAssetFormat) e2Var.e();
                        }
                        ImageAssetFormat imageAssetFormat = this.img_;
                        return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                    }

                    public ImageAssetFormat.Builder getImgBuilder() {
                        onChanged();
                        return (ImageAssetFormat.Builder) getImgFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public ImageAssetFormatOrBuilder getImgOrBuilder() {
                        e2<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> e2Var = this.imgBuilder_;
                        if (e2Var != null) {
                            return (ImageAssetFormatOrBuilder) e2Var.f();
                        }
                        ImageAssetFormat imageAssetFormat = this.img_;
                        return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean getReq() {
                        return this.req_;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public TitleAssetFormat getTitle() {
                        e2<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> e2Var = this.titleBuilder_;
                        if (e2Var != null) {
                            return (TitleAssetFormat) e2Var.e();
                        }
                        TitleAssetFormat titleAssetFormat = this.title_;
                        return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                    }

                    public TitleAssetFormat.Builder getTitleBuilder() {
                        onChanged();
                        return (TitleAssetFormat.Builder) getTitleFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public TitleAssetFormatOrBuilder getTitleOrBuilder() {
                        e2<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> e2Var = this.titleBuilder_;
                        if (e2Var != null) {
                            return (TitleAssetFormatOrBuilder) e2Var.f();
                        }
                        TitleAssetFormat titleAssetFormat = this.title_;
                        return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public VideoPlacement getVideo() {
                        e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> e2Var = this.videoBuilder_;
                        if (e2Var != null) {
                            return (VideoPlacement) e2Var.e();
                        }
                        VideoPlacement videoPlacement = this.video_;
                        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                    }

                    public VideoPlacement.Builder getVideoBuilder() {
                        onChanged();
                        return (VideoPlacement.Builder) getVideoFieldBuilder().d();
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public VideoPlacementOrBuilder getVideoOrBuilder() {
                        e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> e2Var = this.videoBuilder_;
                        if (e2Var != null) {
                            return (VideoPlacementOrBuilder) e2Var.f();
                        }
                        VideoPlacement videoPlacement = this.video_;
                        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasData() {
                        return (this.dataBuilder_ == null && this.data_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasImg() {
                        return (this.imgBuilder_ == null && this.img_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasTitle() {
                        return (this.titleBuilder_ == null && this.title_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormatOrBuilder
                    public boolean hasVideo() {
                        return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
                    }

                    @Override // com.explorestack.protobuf.j0.b
                    protected j0.f internalGetFieldAccessorTable() {
                        return b.N.d(AssetFormat.class, Builder.class);
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    public Builder mergeData(DataAssetFormat dataAssetFormat) {
                        e2<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> e2Var = this.dataBuilder_;
                        if (e2Var == null) {
                            DataAssetFormat dataAssetFormat2 = this.data_;
                            if (dataAssetFormat2 != null) {
                                this.data_ = DataAssetFormat.newBuilder(dataAssetFormat2).mergeFrom(dataAssetFormat).buildPartial();
                            } else {
                                this.data_ = dataAssetFormat;
                            }
                            onChanged();
                        } else {
                            e2Var.g(dataAssetFormat);
                        }
                        return this;
                    }

                    public Builder mergeExt(Struct struct) {
                        e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                        if (e2Var == null) {
                            Struct struct2 = this.ext_;
                            if (struct2 != null) {
                                this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                            } else {
                                this.ext_ = struct;
                            }
                            onChanged();
                        } else {
                            e2Var.g(struct);
                        }
                        return this;
                    }

                    public Builder mergeImg(ImageAssetFormat imageAssetFormat) {
                        e2<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> e2Var = this.imgBuilder_;
                        if (e2Var == null) {
                            ImageAssetFormat imageAssetFormat2 = this.img_;
                            if (imageAssetFormat2 != null) {
                                this.img_ = ImageAssetFormat.newBuilder(imageAssetFormat2).mergeFrom(imageAssetFormat).buildPartial();
                            } else {
                                this.img_ = imageAssetFormat;
                            }
                            onChanged();
                        } else {
                            e2Var.g(imageAssetFormat);
                        }
                        return this;
                    }

                    public Builder mergeTitle(TitleAssetFormat titleAssetFormat) {
                        e2<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> e2Var = this.titleBuilder_;
                        if (e2Var == null) {
                            TitleAssetFormat titleAssetFormat2 = this.title_;
                            if (titleAssetFormat2 != null) {
                                this.title_ = TitleAssetFormat.newBuilder(titleAssetFormat2).mergeFrom(titleAssetFormat).buildPartial();
                            } else {
                                this.title_ = titleAssetFormat;
                            }
                            onChanged();
                        } else {
                            e2Var.g(titleAssetFormat);
                        }
                        return this;
                    }

                    public Builder mergeVideo(VideoPlacement videoPlacement) {
                        e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> e2Var = this.videoBuilder_;
                        if (e2Var == null) {
                            VideoPlacement videoPlacement2 = this.video_;
                            if (videoPlacement2 != null) {
                                this.video_ = VideoPlacement.newBuilder(videoPlacement2).mergeFrom(videoPlacement).buildPartial();
                            } else {
                                this.video_ = videoPlacement;
                            }
                            onChanged();
                        } else {
                            e2Var.g(videoPlacement);
                        }
                        return this;
                    }

                    public Builder removeExtProto(int i10) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.remove(i10);
                            onChanged();
                        } else {
                            z1Var.v(i10);
                        }
                        return this;
                    }

                    public Builder setData(DataAssetFormat dataAssetFormat) {
                        e2<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> e2Var = this.dataBuilder_;
                        if (e2Var == null) {
                            dataAssetFormat.getClass();
                            this.data_ = dataAssetFormat;
                            onChanged();
                        } else {
                            e2Var.i(dataAssetFormat);
                        }
                        return this;
                    }

                    public Builder setExt(Struct struct) {
                        e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                        if (e2Var == null) {
                            struct.getClass();
                            this.ext_ = struct;
                            onChanged();
                        } else {
                            e2Var.i(struct);
                        }
                        return this;
                    }

                    public Builder setExtProto(int i10, Any any) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i10, any);
                            onChanged();
                        } else {
                            z1Var.w(i10, any);
                        }
                        return this;
                    }

                    public Builder setId(int i10) {
                        this.id_ = i10;
                        onChanged();
                        return this;
                    }

                    public Builder setImg(ImageAssetFormat imageAssetFormat) {
                        e2<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> e2Var = this.imgBuilder_;
                        if (e2Var == null) {
                            imageAssetFormat.getClass();
                            this.img_ = imageAssetFormat;
                            onChanged();
                        } else {
                            e2Var.i(imageAssetFormat);
                        }
                        return this;
                    }

                    public Builder setReq(boolean z10) {
                        this.req_ = z10;
                        onChanged();
                        return this;
                    }

                    public Builder setTitle(TitleAssetFormat titleAssetFormat) {
                        e2<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> e2Var = this.titleBuilder_;
                        if (e2Var == null) {
                            titleAssetFormat.getClass();
                            this.title_ = titleAssetFormat;
                            onChanged();
                        } else {
                            e2Var.i(titleAssetFormat);
                        }
                        return this;
                    }

                    public Builder setVideo(VideoPlacement videoPlacement) {
                        e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> e2Var = this.videoBuilder_;
                        if (e2Var == null) {
                            videoPlacement.getClass();
                            this.video_ = videoPlacement;
                            onChanged();
                        } else {
                            e2Var.i(videoPlacement);
                        }
                        return this;
                    }

                    private Builder() {
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                    public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public AssetFormat build() {
                        AssetFormat assetFormatBuildPartial = buildPartial();
                        if (assetFormatBuildPartial.isInitialized()) {
                            return assetFormatBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) assetFormatBuildPartial);
                    }

                    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public AssetFormat buildPartial() {
                        AssetFormat assetFormat = new AssetFormat(this);
                        assetFormat.id_ = this.id_;
                        assetFormat.req_ = this.req_;
                        e2<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> e2Var = this.titleBuilder_;
                        if (e2Var == null) {
                            assetFormat.title_ = this.title_;
                        } else {
                            assetFormat.title_ = (TitleAssetFormat) e2Var.a();
                        }
                        e2<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> e2Var2 = this.imgBuilder_;
                        if (e2Var2 == null) {
                            assetFormat.img_ = this.img_;
                        } else {
                            assetFormat.img_ = (ImageAssetFormat) e2Var2.a();
                        }
                        e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> e2Var3 = this.videoBuilder_;
                        if (e2Var3 == null) {
                            assetFormat.video_ = this.video_;
                        } else {
                            assetFormat.video_ = (VideoPlacement) e2Var3.a();
                        }
                        e2<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> e2Var4 = this.dataBuilder_;
                        if (e2Var4 == null) {
                            assetFormat.data_ = this.data_;
                        } else {
                            assetFormat.data_ = (DataAssetFormat) e2Var4.a();
                        }
                        e2<Struct, Struct.Builder, i2> e2Var5 = this.extBuilder_;
                        if (e2Var5 == null) {
                            assetFormat.ext_ = this.ext_;
                        } else {
                            assetFormat.ext_ = (Struct) e2Var5.a();
                        }
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var != null) {
                            assetFormat.extProto_ = z1Var.f();
                        } else {
                            if ((this.bitField0_ & 1) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -2;
                            }
                            assetFormat.extProto_ = this.extProto_;
                        }
                        onBuilt();
                        return assetFormat;
                    }

                    @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                    public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (Builder) super.clearField(fieldDescriptor);
                    }

                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                    /* JADX INFO: renamed from: getDefaultInstanceForType */
                    public AssetFormat mo164getDefaultInstanceForType() {
                        return AssetFormat.getDefaultInstance();
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

                    public Any.Builder addExtProtoBuilder(int i10) {
                        return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
                        this.id_ = 0;
                        this.req_ = false;
                        if (this.titleBuilder_ == null) {
                            this.title_ = null;
                        } else {
                            this.title_ = null;
                            this.titleBuilder_ = null;
                        }
                        if (this.imgBuilder_ == null) {
                            this.img_ = null;
                        } else {
                            this.img_ = null;
                            this.imgBuilder_ = null;
                        }
                        if (this.videoBuilder_ == null) {
                            this.video_ = null;
                        } else {
                            this.video_ = null;
                            this.videoBuilder_ = null;
                        }
                        if (this.dataBuilder_ == null) {
                            this.data_ = null;
                        } else {
                            this.data_ = null;
                            this.dataBuilder_ = null;
                        }
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            this.extProto_ = Collections.emptyList();
                            this.bitField0_ &= -2;
                        } else {
                            z1Var.g();
                        }
                        return this;
                    }

                    private Builder(j0.c cVar) {
                        super(cVar);
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    public Builder setData(DataAssetFormat.Builder builder) {
                        e2<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> e2Var = this.dataBuilder_;
                        if (e2Var == null) {
                            this.data_ = builder.build();
                            onChanged();
                        } else {
                            e2Var.i(builder.build());
                        }
                        return this;
                    }

                    public Builder setExt(Struct.Builder builder) {
                        e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                        if (e2Var == null) {
                            this.ext_ = builder.build();
                            onChanged();
                        } else {
                            e2Var.i(builder.build());
                        }
                        return this;
                    }

                    public Builder setImg(ImageAssetFormat.Builder builder) {
                        e2<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> e2Var = this.imgBuilder_;
                        if (e2Var == null) {
                            this.img_ = builder.build();
                            onChanged();
                        } else {
                            e2Var.i(builder.build());
                        }
                        return this;
                    }

                    public Builder setTitle(TitleAssetFormat.Builder builder) {
                        e2<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> e2Var = this.titleBuilder_;
                        if (e2Var == null) {
                            this.title_ = builder.build();
                            onChanged();
                        } else {
                            e2Var.i(builder.build());
                        }
                        return this;
                    }

                    public Builder setVideo(VideoPlacement.Builder builder) {
                        e2<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> e2Var = this.videoBuilder_;
                        if (e2Var == null) {
                            this.video_ = builder.build();
                            onChanged();
                        } else {
                            e2Var.i(builder.build());
                        }
                        return this;
                    }

                    public Builder addExtProto(int i10, Any any) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            any.getClass();
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i10, any);
                            onChanged();
                        } else {
                            z1Var.d(i10, any);
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
                        if (message instanceof AssetFormat) {
                            return mergeFrom((AssetFormat) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder setExtProto(int i10, Any.Builder builder) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i10, builder.build());
                            onChanged();
                        } else {
                            z1Var.w(i10, builder.build());
                        }
                        return this;
                    }

                    public Builder mergeFrom(AssetFormat assetFormat) {
                        if (assetFormat == AssetFormat.getDefaultInstance()) {
                            return this;
                        }
                        if (assetFormat.getId() != 0) {
                            setId(assetFormat.getId());
                        }
                        if (assetFormat.getReq()) {
                            setReq(assetFormat.getReq());
                        }
                        if (assetFormat.hasTitle()) {
                            mergeTitle(assetFormat.getTitle());
                        }
                        if (assetFormat.hasImg()) {
                            mergeImg(assetFormat.getImg());
                        }
                        if (assetFormat.hasVideo()) {
                            mergeVideo(assetFormat.getVideo());
                        }
                        if (assetFormat.hasData()) {
                            mergeData(assetFormat.getData());
                        }
                        if (assetFormat.hasExt()) {
                            mergeExt(assetFormat.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!assetFormat.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = assetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(assetFormat.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!assetFormat.extProto_.isEmpty()) {
                            if (!this.extProtoBuilder_.t()) {
                                this.extProtoBuilder_.a(assetFormat.extProto_);
                            } else {
                                this.extProtoBuilder_.h();
                                this.extProtoBuilder_ = null;
                                this.extProto_ = assetFormat.extProto_;
                                this.bitField0_ &= -2;
                                this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                            }
                        }
                        mergeUnknownFields(((j0) assetFormat).unknownFields);
                        onChanged();
                        return this;
                    }

                    public Builder addExtProto(Any.Builder builder) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(builder.build());
                            onChanged();
                        } else {
                            z1Var.e(builder.build());
                        }
                        return this;
                    }

                    public Builder addExtProto(int i10, Any.Builder builder) {
                        z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                        if (z1Var == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i10, builder.build());
                            onChanged();
                        } else {
                            z1Var.d(i10, builder.build());
                        }
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                    public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                        AssetFormat assetFormat = null;
                        try {
                            try {
                                AssetFormat assetFormat2 = (AssetFormat) AssetFormat.PARSER.parsePartialFrom(nVar, yVar);
                                if (assetFormat2 != null) {
                                    mergeFrom(assetFormat2);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e10) {
                                AssetFormat assetFormat3 = (AssetFormat) e10.getUnfinishedMessage();
                                try {
                                    throw e10.unwrapIOException();
                                } catch (Throwable th) {
                                    th = th;
                                    assetFormat = assetFormat3;
                                    if (assetFormat != null) {
                                        mergeFrom(assetFormat);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (assetFormat != null) {
                                mergeFrom(assetFormat);
                            }
                            throw th;
                        }
                    }
                }

                public static Builder newBuilder(AssetFormat assetFormat) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(assetFormat);
                }

                public static AssetFormat parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, yVar);
                }

                private AssetFormat(j0.b<?> bVar) {
                    super(bVar);
                    this.memoizedIsInitialized = (byte) -1;
                }

                public static AssetFormat parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                    return (AssetFormat) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
                }

                public static AssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public AssetFormat mo164getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                public static AssetFormat parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, yVar);
                }

                @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                private AssetFormat() {
                    this.memoizedIsInitialized = (byte) -1;
                    this.extProto_ = Collections.emptyList();
                }

                public static AssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.explorestack.protobuf.j0
                public Builder newBuilderForType(j0.c cVar) {
                    return new Builder(cVar);
                }

                public static AssetFormat parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, yVar);
                }

                public static AssetFormat parseFrom(InputStream inputStream) throws IOException {
                    return (AssetFormat) j0.parseWithIOException(PARSER, inputStream);
                }

                private AssetFormat(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                                        if (iK == 8) {
                                            this.id_ = nVar.L();
                                        } else if (iK != 16) {
                                            if (iK == 26) {
                                                TitleAssetFormat titleAssetFormat = this.title_;
                                                TitleAssetFormat.Builder builder = titleAssetFormat != null ? titleAssetFormat.toBuilder() : null;
                                                TitleAssetFormat titleAssetFormat2 = (TitleAssetFormat) nVar.A(TitleAssetFormat.parser(), yVar);
                                                this.title_ = titleAssetFormat2;
                                                if (builder != null) {
                                                    builder.mergeFrom(titleAssetFormat2);
                                                    this.title_ = builder.buildPartial();
                                                }
                                            } else if (iK == 34) {
                                                ImageAssetFormat imageAssetFormat = this.img_;
                                                ImageAssetFormat.Builder builder2 = imageAssetFormat != null ? imageAssetFormat.toBuilder() : null;
                                                ImageAssetFormat imageAssetFormat2 = (ImageAssetFormat) nVar.A(ImageAssetFormat.parser(), yVar);
                                                this.img_ = imageAssetFormat2;
                                                if (builder2 != null) {
                                                    builder2.mergeFrom(imageAssetFormat2);
                                                    this.img_ = builder2.buildPartial();
                                                }
                                            } else if (iK == 42) {
                                                VideoPlacement videoPlacement = this.video_;
                                                VideoPlacement.Builder builder3 = videoPlacement != null ? videoPlacement.toBuilder() : null;
                                                VideoPlacement videoPlacement2 = (VideoPlacement) nVar.A(VideoPlacement.parser(), yVar);
                                                this.video_ = videoPlacement2;
                                                if (builder3 != null) {
                                                    builder3.mergeFrom(videoPlacement2);
                                                    this.video_ = builder3.buildPartial();
                                                }
                                            } else if (iK == 50) {
                                                DataAssetFormat dataAssetFormat = this.data_;
                                                DataAssetFormat.Builder builder4 = dataAssetFormat != null ? dataAssetFormat.toBuilder() : null;
                                                DataAssetFormat dataAssetFormat2 = (DataAssetFormat) nVar.A(DataAssetFormat.parser(), yVar);
                                                this.data_ = dataAssetFormat2;
                                                if (builder4 != null) {
                                                    builder4.mergeFrom(dataAssetFormat2);
                                                    this.data_ = builder4.buildPartial();
                                                }
                                            } else if (iK == 58) {
                                                boolean z12 = (z11 ? 1 : 0) & true;
                                                z11 = z11;
                                                if (!z12) {
                                                    this.extProto_ = new ArrayList();
                                                    z11 = (z11 ? 1 : 0) | true;
                                                }
                                                this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                            } else if (iK != 66) {
                                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                                }
                                            } else {
                                                Struct struct = this.ext_;
                                                Struct.Builder builder5 = struct != null ? struct.toBuilder() : null;
                                                Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                                this.ext_ = struct2;
                                                if (builder5 != null) {
                                                    builder5.mergeFrom(struct2);
                                                    this.ext_ = builder5.buildPartial();
                                                }
                                            }
                                        } else {
                                            this.req_ = nVar.q();
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
                            if ((z11 ? 1 : 0) & true) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = bVarG.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if ((z11 ? 1 : 0) & true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                }

                public static AssetFormat parseFrom(InputStream inputStream, y yVar) throws IOException {
                    return (AssetFormat) j0.parseWithIOException(PARSER, inputStream, yVar);
                }

                public static AssetFormat parseFrom(n nVar) throws IOException {
                    return (AssetFormat) j0.parseWithIOException(PARSER, nVar);
                }

                public static AssetFormat parseFrom(n nVar, y yVar) throws IOException {
                    return (AssetFormat) j0.parseWithIOException(PARSER, nVar, yVar);
                }
            }

            public interface AssetFormatOrBuilder extends MessageOrBuilder {
                AssetFormat.DataAssetFormat getData();

                AssetFormat.DataAssetFormatOrBuilder getDataOrBuilder();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                /* synthetic */ MessageLite mo164getDefaultInstanceForType();

                Struct getExt();

                i2 getExtOrBuilder();

                Any getExtProto(int i10);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                e getExtProtoOrBuilder(int i10);

                List<? extends e> getExtProtoOrBuilderList();

                int getId();

                AssetFormat.ImageAssetFormat getImg();

                AssetFormat.ImageAssetFormatOrBuilder getImgOrBuilder();

                boolean getReq();

                AssetFormat.TitleAssetFormat getTitle();

                AssetFormat.TitleAssetFormatOrBuilder getTitleOrBuilder();

                VideoPlacement getVideo();

                VideoPlacementOrBuilder getVideoOrBuilder();

                boolean hasData();

                boolean hasExt();

                boolean hasImg();

                boolean hasTitle();

                boolean hasVideo();

                @Override // com.explorestack.protobuf.MessageOrBuilder
                /* synthetic */ boolean isInitialized();
            }

            public static NativeFormat getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.K;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static NativeFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (NativeFormat) j0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static NativeFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static s1<NativeFormat> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof NativeFormat)) {
                    return super.equals(obj);
                }
                NativeFormat nativeFormat = (NativeFormat) obj;
                if (getAssetList().equals(nativeFormat.getAssetList()) && hasExt() == nativeFormat.hasExt()) {
                    return (!hasExt() || getExt().equals(nativeFormat.getExt())) && getExtProtoList().equals(nativeFormat.getExtProtoList()) && this.unknownFields.equals(nativeFormat.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public AssetFormat getAsset(int i10) {
                return this.asset_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public int getAssetCount() {
                return this.asset_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<AssetFormat> getAssetList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public AssetFormatOrBuilder getAssetOrBuilder(int i10) {
                return this.asset_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<? extends AssetFormatOrBuilder> getAssetOrBuilderList() {
                return this.asset_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public i2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public s1<NativeFormat> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iG = 0;
                for (int i11 = 0; i11 < this.asset_.size(); i11++) {
                    iG += CodedOutputStream.G(1, this.asset_.get(i11));
                }
                for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                    iG += CodedOutputStream.G(2, this.extProto_.get(i12));
                }
                if (this.ext_ != null) {
                    iG += CodedOutputStream.G(3, getExt());
                }
                int serializedSize = iG + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
            public final u2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (getAssetCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getAssetList().hashCode();
                }
                if (hasExt()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getExtProtoList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.j0
            protected j0.f internalGetFieldAccessorTable() {
                return b.L.d(NativeFormat.class, Builder.class);
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
                return new NativeFormat();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                for (int i10 = 0; i10 < this.asset_.size(); i10++) {
                    codedOutputStream.L0(1, this.asset_.get(i10));
                }
                for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                    codedOutputStream.L0(2, this.extProto_.get(i11));
                }
                if (this.ext_ != null) {
                    codedOutputStream.L0(3, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class Builder extends j0.b<Builder> implements NativeFormatOrBuilder {
                private z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> assetBuilder_;
                private List<AssetFormat> asset_;
                private int bitField0_;
                private e2<Struct, Struct.Builder, i2> extBuilder_;
                private z1<Any, Any.Builder, e> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;

                private void ensureAssetIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.asset_ = new ArrayList(this.asset_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                private z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> getAssetFieldBuilder() {
                    if (this.assetBuilder_ == null) {
                        this.assetBuilder_ = new z1<>(this.asset_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.asset_ = null;
                    }
                    return this.assetBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.K;
                }

                private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (j0.alwaysUseFieldBuilders) {
                        getAssetFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllAsset(Iterable<? extends AssetFormat> iterable) {
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        ensureAssetIsMutable();
                        com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.asset_);
                        onChanged();
                    } else {
                        z1Var.a(iterable);
                    }
                    return this;
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                        onChanged();
                    } else {
                        z1Var.a(iterable);
                    }
                    return this;
                }

                public Builder addAsset(AssetFormat assetFormat) {
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        assetFormat.getClass();
                        ensureAssetIsMutable();
                        this.asset_.add(assetFormat);
                        onChanged();
                    } else {
                        z1Var.e(assetFormat);
                    }
                    return this;
                }

                public AssetFormat.Builder addAssetBuilder() {
                    return (AssetFormat.Builder) getAssetFieldBuilder().c(AssetFormat.getDefaultInstance());
                }

                public Builder addExtProto(Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                    } else {
                        z1Var.e(any);
                    }
                    return this;
                }

                public Any.Builder addExtProtoBuilder() {
                    return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                }

                public Builder clearAsset() {
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        this.asset_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                        onChanged();
                    } else {
                        z1Var.g();
                    }
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearExtProto() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                        onChanged();
                    } else {
                        z1Var.g();
                    }
                    return this;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public AssetFormat getAsset(int i10) {
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    return z1Var == null ? this.asset_.get(i10) : (AssetFormat) z1Var.n(i10);
                }

                public AssetFormat.Builder getAssetBuilder(int i10) {
                    return (AssetFormat.Builder) getAssetFieldBuilder().k(i10);
                }

                public List<AssetFormat.Builder> getAssetBuilderList() {
                    return getAssetFieldBuilder().l();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public int getAssetCount() {
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    return z1Var == null ? this.asset_.size() : z1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<AssetFormat> getAssetList() {
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    return z1Var == null ? Collections.unmodifiableList(this.asset_) : z1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public AssetFormatOrBuilder getAssetOrBuilder(int i10) {
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    return z1Var == null ? this.asset_.get(i10) : (AssetFormatOrBuilder) z1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<? extends AssetFormatOrBuilder> getAssetOrBuilderList() {
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.asset_);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.K;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public Struct getExt() {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var != null) {
                        return (Struct) e2Var.e();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return (Struct.Builder) getExtFieldBuilder().d();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public i2 getExtOrBuilder() {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var != null) {
                        return (i2) e2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public Any getExtProto(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
                }

                public Any.Builder getExtProtoBuilder(int i10) {
                    return (Any.Builder) getExtProtoFieldBuilder().k(i10);
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().l();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public int getExtProtoCount() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.size() : z1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<Any> getExtProtoList() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormatOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return b.L.d(NativeFormat.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeExt(Struct struct) {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        Struct struct2 = this.ext_;
                        if (struct2 != null) {
                            this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                        } else {
                            this.ext_ = struct;
                        }
                        onChanged();
                    } else {
                        e2Var.g(struct);
                    }
                    return this;
                }

                public Builder removeAsset(int i10) {
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        ensureAssetIsMutable();
                        this.asset_.remove(i10);
                        onChanged();
                    } else {
                        z1Var.v(i10);
                    }
                    return this;
                }

                public Builder removeExtProto(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i10);
                        onChanged();
                    } else {
                        z1Var.v(i10);
                    }
                    return this;
                }

                public Builder setAsset(int i10, AssetFormat assetFormat) {
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        assetFormat.getClass();
                        ensureAssetIsMutable();
                        this.asset_.set(i10, assetFormat);
                        onChanged();
                    } else {
                        z1Var.w(i10, assetFormat);
                    }
                    return this;
                }

                public Builder setExt(Struct struct) {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        struct.getClass();
                        this.ext_ = struct;
                        onChanged();
                    } else {
                        e2Var.i(struct);
                    }
                    return this;
                }

                public Builder setExtProto(int i10, Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i10, any);
                        onChanged();
                    } else {
                        z1Var.w(i10, any);
                    }
                    return this;
                }

                private Builder() {
                    this.asset_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public NativeFormat build() {
                    NativeFormat nativeFormatBuildPartial = buildPartial();
                    if (nativeFormatBuildPartial.isInitialized()) {
                        return nativeFormatBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) nativeFormatBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public NativeFormat buildPartial() {
                    NativeFormat nativeFormat = new NativeFormat(this);
                    int i10 = this.bitField0_;
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        if ((i10 & 1) != 0) {
                            this.asset_ = Collections.unmodifiableList(this.asset_);
                            this.bitField0_ &= -2;
                        }
                        nativeFormat.asset_ = this.asset_;
                    } else {
                        nativeFormat.asset_ = z1Var.f();
                    }
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        nativeFormat.ext_ = this.ext_;
                    } else {
                        nativeFormat.ext_ = (Struct) e2Var.a();
                    }
                    z1<Any, Any.Builder, e> z1Var2 = this.extProtoBuilder_;
                    if (z1Var2 != null) {
                        nativeFormat.extProto_ = z1Var2.f();
                    } else {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        nativeFormat.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return nativeFormat;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public NativeFormat mo164getDefaultInstanceForType() {
                    return NativeFormat.getDefaultInstance();
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

                public AssetFormat.Builder addAssetBuilder(int i10) {
                    return (AssetFormat.Builder) getAssetFieldBuilder().b(i10, AssetFormat.getDefaultInstance());
                }

                public Any.Builder addExtProtoBuilder(int i10) {
                    return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        this.asset_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                    } else {
                        z1Var.g();
                    }
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    z1<Any, Any.Builder, e> z1Var2 = this.extProtoBuilder_;
                    if (z1Var2 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                    } else {
                        z1Var2.g();
                    }
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        this.ext_ = builder.build();
                        onChanged();
                    } else {
                        e2Var.i(builder.build());
                    }
                    return this;
                }

                private Builder(j0.c cVar) {
                    super(cVar);
                    this.asset_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                public Builder addAsset(int i10, AssetFormat assetFormat) {
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        assetFormat.getClass();
                        ensureAssetIsMutable();
                        this.asset_.add(i10, assetFormat);
                        onChanged();
                    } else {
                        z1Var.d(i10, assetFormat);
                    }
                    return this;
                }

                public Builder addExtProto(int i10, Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i10, any);
                        onChanged();
                    } else {
                        z1Var.d(i10, any);
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
                    if (message instanceof NativeFormat) {
                        return mergeFrom((NativeFormat) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setAsset(int i10, AssetFormat.Builder builder) {
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        ensureAssetIsMutable();
                        this.asset_.set(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.w(i10, builder.build());
                    }
                    return this;
                }

                public Builder setExtProto(int i10, Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.w(i10, builder.build());
                    }
                    return this;
                }

                public Builder mergeFrom(NativeFormat nativeFormat) {
                    if (nativeFormat == NativeFormat.getDefaultInstance()) {
                        return this;
                    }
                    if (this.assetBuilder_ == null) {
                        if (!nativeFormat.asset_.isEmpty()) {
                            if (this.asset_.isEmpty()) {
                                this.asset_ = nativeFormat.asset_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAssetIsMutable();
                                this.asset_.addAll(nativeFormat.asset_);
                            }
                            onChanged();
                        }
                    } else if (!nativeFormat.asset_.isEmpty()) {
                        if (!this.assetBuilder_.t()) {
                            this.assetBuilder_.a(nativeFormat.asset_);
                        } else {
                            this.assetBuilder_.h();
                            this.assetBuilder_ = null;
                            this.asset_ = nativeFormat.asset_;
                            this.bitField0_ &= -2;
                            this.assetBuilder_ = j0.alwaysUseFieldBuilders ? getAssetFieldBuilder() : null;
                        }
                    }
                    if (nativeFormat.hasExt()) {
                        mergeExt(nativeFormat.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!nativeFormat.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = nativeFormat.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(nativeFormat.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!nativeFormat.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(nativeFormat.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = nativeFormat.extProto_;
                            this.bitField0_ &= -3;
                            this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((j0) nativeFormat).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addAsset(AssetFormat.Builder builder) {
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(builder.build());
                        onChanged();
                    } else {
                        z1Var.e(builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                    } else {
                        z1Var.e(builder.build());
                    }
                    return this;
                }

                public Builder addAsset(int i10, AssetFormat.Builder builder) {
                    z1<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> z1Var = this.assetBuilder_;
                    if (z1Var == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.d(i10, builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(int i10, Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.d(i10, builder.build());
                    }
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                    NativeFormat nativeFormat = null;
                    try {
                        try {
                            NativeFormat nativeFormat2 = (NativeFormat) NativeFormat.PARSER.parsePartialFrom(nVar, yVar);
                            if (nativeFormat2 != null) {
                                mergeFrom(nativeFormat2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            NativeFormat nativeFormat3 = (NativeFormat) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                nativeFormat = nativeFormat3;
                                if (nativeFormat != null) {
                                    mergeFrom(nativeFormat);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (nativeFormat != null) {
                            mergeFrom(nativeFormat);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder(NativeFormat nativeFormat) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(nativeFormat);
            }

            public static NativeFormat parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, yVar);
            }

            private NativeFormat(j0.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static NativeFormat parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                return (NativeFormat) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static NativeFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public NativeFormat mo164getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static NativeFormat parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, yVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private NativeFormat() {
                this.memoizedIsInitialized = (byte) -1;
                this.asset_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
            }

            public static NativeFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            public Builder newBuilderForType(j0.c cVar) {
                return new Builder(cVar);
            }

            public static NativeFormat parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, yVar);
            }

            public static NativeFormat parseFrom(InputStream inputStream) throws IOException {
                return (NativeFormat) j0.parseWithIOException(PARSER, inputStream);
            }

            private NativeFormat(n nVar, y yVar) throws InvalidProtocolBufferException {
                this();
                yVar.getClass();
                u2.b bVarG = u2.g();
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            try {
                                int iK = nVar.K();
                                if (iK != 0) {
                                    if (iK == 10) {
                                        if ((i10 & 1) == 0) {
                                            this.asset_ = new ArrayList();
                                            i10 |= 1;
                                        }
                                        this.asset_.add((AssetFormat) nVar.A(AssetFormat.parser(), yVar));
                                    } else if (iK == 18) {
                                        if ((i10 & 2) == 0) {
                                            this.extProto_ = new ArrayList();
                                            i10 |= 2;
                                        }
                                        this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                    } else if (iK != 26) {
                                        if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                        }
                                    } else {
                                        Struct struct = this.ext_;
                                        Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                        Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                        this.ext_ = struct2;
                                        if (builder != null) {
                                            builder.mergeFrom(struct2);
                                            this.ext_ = builder.buildPartial();
                                        }
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
                        if ((i10 & 1) != 0) {
                            this.asset_ = Collections.unmodifiableList(this.asset_);
                        }
                        if ((i10 & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if ((i10 & 1) != 0) {
                    this.asset_ = Collections.unmodifiableList(this.asset_);
                }
                if ((i10 & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static NativeFormat parseFrom(InputStream inputStream, y yVar) throws IOException {
                return (NativeFormat) j0.parseWithIOException(PARSER, inputStream, yVar);
            }

            public static NativeFormat parseFrom(n nVar) throws IOException {
                return (NativeFormat) j0.parseWithIOException(PARSER, nVar);
            }

            public static NativeFormat parseFrom(n nVar, y yVar) throws IOException {
                return (NativeFormat) j0.parseWithIOException(PARSER, nVar, yVar);
            }
        }

        public interface NativeFormatOrBuilder extends MessageOrBuilder {
            NativeFormat.AssetFormat getAsset(int i10);

            int getAssetCount();

            List<NativeFormat.AssetFormat> getAssetList();

            NativeFormat.AssetFormatOrBuilder getAssetOrBuilder(int i10);

            List<? extends NativeFormat.AssetFormatOrBuilder> getAssetOrBuilderList();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo164getDefaultInstanceForType();

            Struct getExt();

            i2 getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            e getExtProtoOrBuilder(int i10);

            List<? extends e> getExtProtoOrBuilderList();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static DisplayPlacement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.G;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DisplayPlacement parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DisplayPlacement) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DisplayPlacement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<DisplayPlacement> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DisplayPlacement)) {
                return super.equals(obj);
            }
            DisplayPlacement displayPlacement = (DisplayPlacement) obj;
            if (this.pos_ != displayPlacement.pos_ || getInstl() != displayPlacement.getInstl() || getTopframe() != displayPlacement.getTopframe() || !getIfrbustList().equals(displayPlacement.getIfrbustList()) || this.clktype_ != displayPlacement.clktype_ || getAmpren() != displayPlacement.getAmpren() || this.ptype_ != displayPlacement.ptype_ || this.context_ != displayPlacement.context_ || !getMimeList().equals(displayPlacement.getMimeList()) || !this.api_.equals(displayPlacement.api_) || !this.ctype_.equals(displayPlacement.ctype_) || getW() != displayPlacement.getW() || getH() != displayPlacement.getH() || this.unit_ != displayPlacement.unit_ || getPriv() != displayPlacement.getPriv() || !getDisplayfmtList().equals(displayPlacement.getDisplayfmtList()) || hasNativefmt() != displayPlacement.hasNativefmt()) {
                return false;
            }
            if ((!hasNativefmt() || getNativefmt().equals(displayPlacement.getNativefmt())) && getEventList().equals(displayPlacement.getEventList()) && hasExt() == displayPlacement.hasExt()) {
                return (!hasExt() || getExt().equals(displayPlacement.getExt())) && getExtProtoList().equals(displayPlacement.getExtProtoList()) && this.unknownFields.equals(displayPlacement.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getAmpren() {
            return this.ampren_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ApiFramework getApi(int i10) {
            return api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<ApiFramework> getApiList() {
            return new l0.h(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ClickType getClktype() {
            ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
            return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getClktypeValue() {
            return this.clktype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayContextType getContext() {
            DisplayContextType displayContextTypeValueOf = DisplayContextType.valueOf(this.context_);
            return displayContextTypeValueOf == null ? DisplayContextType.UNRECOGNIZED : displayContextTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getContextValue() {
            return this.context_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayCreativeType getCtype(int i10) {
            return ctype_converter_.convert(this.ctype_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getCtypeCount() {
            return this.ctype_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<DisplayCreativeType> getCtypeList() {
            return new l0.h(this.ctype_, ctype_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getCtypeValue(int i10) {
            return this.ctype_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<Integer> getCtypeValueList() {
            return this.ctype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayFormat getDisplayfmt(int i10) {
            return this.displayfmt_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getDisplayfmtCount() {
            return this.displayfmt_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<DisplayFormat> getDisplayfmtList() {
            return this.displayfmt_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i10) {
            return this.displayfmt_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<? extends DisplayFormatOrBuilder> getDisplayfmtOrBuilderList() {
            return this.displayfmt_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public EventSpec getEvent(int i10) {
            return this.event_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getEventCount() {
            return this.event_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<EventSpec> getEventList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public EventSpecOrBuilder getEventOrBuilder(int i10) {
            return this.event_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<? extends EventSpecOrBuilder> getEventOrBuilderList() {
            return this.event_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public i2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getH() {
            return this.h_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public String getIfrbust(int i10) {
            return this.ifrbust_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ByteString getIfrbustBytes(int i10) {
            return this.ifrbust_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getIfrbustCount() {
            return this.ifrbust_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean getInstl() {
            return this.instl_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public String getMime(int i10) {
            return this.mime_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public ByteString getMimeBytes(int i10) {
            return this.mime_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public NativeFormat getNativefmt() {
            NativeFormat nativeFormat = this.nativefmt_;
            return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public NativeFormatOrBuilder getNativefmtOrBuilder() {
            return getNativefmt();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<DisplayPlacement> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public PlacementPosition getPos() {
            PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
            return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getPosValue() {
            return this.pos_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean getPriv() {
            return this.priv_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public DisplayPlacementType getPtype() {
            DisplayPlacementType displayPlacementTypeValueOf = DisplayPlacementType.valueOf(this.ptype_);
            return displayPlacementTypeValueOf == null ? DisplayPlacementType.UNRECOGNIZED : displayPlacementTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getPtypeValue() {
            return this.ptype_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber() ? CodedOutputStream.l(1, this.pos_) + 0 : 0;
            boolean z10 = this.instl_;
            if (z10) {
                iL += CodedOutputStream.e(2, z10);
            }
            boolean z11 = this.topframe_;
            if (z11) {
                iL += CodedOutputStream.e(3, z11);
            }
            int iComputeStringSizeNoTag = 0;
            for (int i11 = 0; i11 < this.ifrbust_.size(); i11++) {
                iComputeStringSizeNoTag += j0.computeStringSizeNoTag(this.ifrbust_.getRaw(i11));
            }
            int size = iL + iComputeStringSizeNoTag + (getIfrbustList().size() * 1);
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                size += CodedOutputStream.l(5, this.clktype_);
            }
            int i12 = this.ampren_;
            if (i12 != 0) {
                size += CodedOutputStream.Y(6, i12);
            }
            if (this.ptype_ != DisplayPlacementType.DISPLAY_PLACEMENT_TYPE_INVALID.getNumber()) {
                size += CodedOutputStream.l(7, this.ptype_);
            }
            if (this.context_ != DisplayContextType.DISPLAY_CONTEXT_TYPE_INVALID.getNumber()) {
                size += CodedOutputStream.l(8, this.context_);
            }
            int iComputeStringSizeNoTag2 = 0;
            for (int i13 = 0; i13 < this.mime_.size(); i13++) {
                iComputeStringSizeNoTag2 += j0.computeStringSizeNoTag(this.mime_.getRaw(i13));
            }
            int size2 = size + iComputeStringSizeNoTag2 + (getMimeList().size() * 1);
            int iM = 0;
            for (int i14 = 0; i14 < this.api_.size(); i14++) {
                iM += CodedOutputStream.m(this.api_.get(i14).intValue());
            }
            int iZ = size2 + iM;
            if (!getApiList().isEmpty()) {
                iZ = iZ + 1 + CodedOutputStream.Z(iM);
            }
            this.apiMemoizedSerializedSize = iM;
            int iM2 = 0;
            for (int i15 = 0; i15 < this.ctype_.size(); i15++) {
                iM2 += CodedOutputStream.m(this.ctype_.get(i15).intValue());
            }
            int iG = iZ + iM2;
            if (!getCtypeList().isEmpty()) {
                iG = iG + 1 + CodedOutputStream.Z(iM2);
            }
            this.ctypeMemoizedSerializedSize = iM2;
            int i16 = this.w_;
            if (i16 != 0) {
                iG += CodedOutputStream.Y(12, i16);
            }
            int i17 = this.h_;
            if (i17 != 0) {
                iG += CodedOutputStream.Y(13, i17);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                iG += CodedOutputStream.l(14, this.unit_);
            }
            boolean z12 = this.priv_;
            if (z12) {
                iG += CodedOutputStream.e(15, z12);
            }
            for (int i18 = 0; i18 < this.displayfmt_.size(); i18++) {
                iG += CodedOutputStream.G(16, this.displayfmt_.get(i18));
            }
            if (this.nativefmt_ != null) {
                iG += CodedOutputStream.G(17, getNativefmt());
            }
            for (int i19 = 0; i19 < this.event_.size(); i19++) {
                iG += CodedOutputStream.G(18, this.event_.get(i19));
            }
            for (int i20 = 0; i20 < this.extProto_.size(); i20++) {
                iG += CodedOutputStream.G(19, this.extProto_.get(i20));
            }
            if (this.ext_ != null) {
                iG += CodedOutputStream.G(20, getExt());
            }
            int serializedSize = iG + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean getTopframe() {
            return this.topframe_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public SizeUnit getUnit() {
            SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
            return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getUnitValue() {
            return this.unit_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public int getW() {
            return this.w_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public boolean hasNativefmt() {
            return this.nativefmt_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.pos_) * 37) + 2) * 53) + l0.d(getInstl())) * 37) + 3) * 53) + l0.d(getTopframe());
            if (getIfrbustCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getIfrbustList().hashCode();
            }
            int ampren = (((((((((((((((iHashCode * 37) + 5) * 53) + this.clktype_) * 37) + 6) * 53) + getAmpren()) * 37) + 7) * 53) + this.ptype_) * 37) + 8) * 53) + this.context_;
            if (getMimeCount() > 0) {
                ampren = (((ampren * 37) + 9) * 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                ampren = (((ampren * 37) + 10) * 53) + this.api_.hashCode();
            }
            if (getCtypeCount() > 0) {
                ampren = (((ampren * 37) + 11) * 53) + this.ctype_.hashCode();
            }
            int w10 = (((((((((((((((ampren * 37) + 12) * 53) + getW()) * 37) + 13) * 53) + getH()) * 37) + 14) * 53) + this.unit_) * 37) + 15) * 53) + l0.d(getPriv());
            if (getDisplayfmtCount() > 0) {
                w10 = (((w10 * 37) + 16) * 53) + getDisplayfmtList().hashCode();
            }
            if (hasNativefmt()) {
                w10 = (((w10 * 37) + 17) * 53) + getNativefmt().hashCode();
            }
            if (getEventCount() > 0) {
                w10 = (((w10 * 37) + 18) * 53) + getEventList().hashCode();
            }
            if (hasExt()) {
                w10 = (((w10 * 37) + 20) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                w10 = (((w10 * 37) + 19) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = (w10 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return b.H.d(DisplayPlacement.class, Builder.class);
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
            return new DisplayPlacement();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                codedOutputStream.v0(1, this.pos_);
            }
            boolean z10 = this.instl_;
            if (z10) {
                codedOutputStream.n0(2, z10);
            }
            boolean z11 = this.topframe_;
            if (z11) {
                codedOutputStream.n0(3, z11);
            }
            for (int i10 = 0; i10 < this.ifrbust_.size(); i10++) {
                j0.writeString(codedOutputStream, 4, this.ifrbust_.getRaw(i10));
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                codedOutputStream.v0(5, this.clktype_);
            }
            int i11 = this.ampren_;
            if (i11 != 0) {
                codedOutputStream.c1(6, i11);
            }
            if (this.ptype_ != DisplayPlacementType.DISPLAY_PLACEMENT_TYPE_INVALID.getNumber()) {
                codedOutputStream.v0(7, this.ptype_);
            }
            if (this.context_ != DisplayContextType.DISPLAY_CONTEXT_TYPE_INVALID.getNumber()) {
                codedOutputStream.v0(8, this.context_);
            }
            for (int i12 = 0; i12 < this.mime_.size(); i12++) {
                j0.writeString(codedOutputStream, 9, this.mime_.getRaw(i12));
            }
            if (getApiList().size() > 0) {
                codedOutputStream.d1(82);
                codedOutputStream.d1(this.apiMemoizedSerializedSize);
            }
            for (int i13 = 0; i13 < this.api_.size(); i13++) {
                codedOutputStream.w0(this.api_.get(i13).intValue());
            }
            if (getCtypeList().size() > 0) {
                codedOutputStream.d1(90);
                codedOutputStream.d1(this.ctypeMemoizedSerializedSize);
            }
            for (int i14 = 0; i14 < this.ctype_.size(); i14++) {
                codedOutputStream.w0(this.ctype_.get(i14).intValue());
            }
            int i15 = this.w_;
            if (i15 != 0) {
                codedOutputStream.c1(12, i15);
            }
            int i16 = this.h_;
            if (i16 != 0) {
                codedOutputStream.c1(13, i16);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                codedOutputStream.v0(14, this.unit_);
            }
            boolean z12 = this.priv_;
            if (z12) {
                codedOutputStream.n0(15, z12);
            }
            for (int i17 = 0; i17 < this.displayfmt_.size(); i17++) {
                codedOutputStream.L0(16, this.displayfmt_.get(i17));
            }
            if (this.nativefmt_ != null) {
                codedOutputStream.L0(17, getNativefmt());
            }
            for (int i18 = 0; i18 < this.event_.size(); i18++) {
                codedOutputStream.L0(18, this.event_.get(i18));
            }
            for (int i19 = 0; i19 < this.extProto_.size(); i19++) {
                codedOutputStream.L0(19, this.extProto_.get(i19));
            }
            if (this.ext_ != null) {
                codedOutputStream.L0(20, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static Builder newBuilder(DisplayPlacement displayPlacement) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(displayPlacement);
        }

        public static DisplayPlacement parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public w1 getIfrbustList() {
            return this.ifrbust_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.DisplayPlacementOrBuilder
        public w1 getMimeList() {
            return this.mime_;
        }

        private DisplayPlacement(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DisplayPlacement parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (DisplayPlacement) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static DisplayPlacement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public DisplayPlacement mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DisplayPlacement parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private DisplayPlacement() {
            this.memoizedIsInitialized = (byte) -1;
            this.pos_ = 0;
            r0 r0Var = q0.f10776d;
            this.ifrbust_ = r0Var;
            this.clktype_ = 0;
            this.ptype_ = 0;
            this.context_ = 0;
            this.mime_ = r0Var;
            this.api_ = Collections.emptyList();
            this.ctype_ = Collections.emptyList();
            this.unit_ = 0;
            this.displayfmt_ = Collections.emptyList();
            this.event_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
        }

        public static DisplayPlacement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static DisplayPlacement parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static DisplayPlacement parseFrom(InputStream inputStream) throws IOException {
            return (DisplayPlacement) j0.parseWithIOException(PARSER, inputStream);
        }

        public static DisplayPlacement parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (DisplayPlacement) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static DisplayPlacement parseFrom(n nVar) throws IOException {
            return (DisplayPlacement) j0.parseWithIOException(PARSER, nVar);
        }

        public static DisplayPlacement parseFrom(n nVar, y yVar) throws IOException {
            return (DisplayPlacement) j0.parseWithIOException(PARSER, nVar, yVar);
        }

        private DisplayPlacement(n nVar, y yVar) throws InvalidProtocolBufferException {
            this();
            yVar.getClass();
            u2.b bVarG = u2.g();
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = nVar.K();
                            switch (iK) {
                                case 0:
                                    break;
                                case 8:
                                    this.pos_ = nVar.t();
                                    continue;
                                case 16:
                                    this.instl_ = nVar.q();
                                    continue;
                                case 24:
                                    this.topframe_ = nVar.q();
                                    continue;
                                case 34:
                                    String strJ = nVar.J();
                                    int i11 = (i10 == true ? 1 : 0) & 1;
                                    i10 = i10;
                                    if (i11 == 0) {
                                        this.ifrbust_ = new q0();
                                        i10 = (i10 == true ? 1 : 0) | 1;
                                    }
                                    this.ifrbust_.add(strJ);
                                    continue;
                                case 40:
                                    this.clktype_ = nVar.t();
                                    continue;
                                case 48:
                                    this.ampren_ = nVar.L();
                                    continue;
                                case 56:
                                    this.ptype_ = nVar.t();
                                    continue;
                                case 64:
                                    this.context_ = nVar.t();
                                    continue;
                                case 74:
                                    String strJ2 = nVar.J();
                                    int i12 = (i10 == true ? 1 : 0) & 2;
                                    i10 = i10;
                                    if (i12 == 0) {
                                        this.mime_ = new q0();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.mime_.add(strJ2);
                                    continue;
                                case 80:
                                    int iT = nVar.t();
                                    int i13 = (i10 == true ? 1 : 0) & 4;
                                    i10 = i10;
                                    if (i13 == 0) {
                                        this.api_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 4;
                                    }
                                    this.api_.add(Integer.valueOf(iT));
                                    continue;
                                case 82:
                                    int iP = nVar.p(nVar.C());
                                    i10 = i10;
                                    while (nVar.d() > 0) {
                                        int iT2 = nVar.t();
                                        if (((i10 == true ? 1 : 0) & 4) == 0) {
                                            this.api_ = new ArrayList();
                                            i10 = (i10 == true ? 1 : 0) | 4;
                                        }
                                        this.api_.add(Integer.valueOf(iT2));
                                        i10 = i10;
                                    }
                                    nVar.o(iP);
                                    continue;
                                case 88:
                                    int iT3 = nVar.t();
                                    int i14 = (i10 == true ? 1 : 0) & 8;
                                    i10 = i10;
                                    if (i14 == 0) {
                                        this.ctype_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 8;
                                    }
                                    this.ctype_.add(Integer.valueOf(iT3));
                                    continue;
                                case 90:
                                    int iP2 = nVar.p(nVar.C());
                                    i10 = i10;
                                    while (nVar.d() > 0) {
                                        int iT4 = nVar.t();
                                        if (((i10 == true ? 1 : 0) & 8) == 0) {
                                            this.ctype_ = new ArrayList();
                                            i10 = (i10 == true ? 1 : 0) | 8;
                                        }
                                        this.ctype_.add(Integer.valueOf(iT4));
                                        i10 = i10;
                                    }
                                    nVar.o(iP2);
                                    continue;
                                case 96:
                                    this.w_ = nVar.L();
                                    continue;
                                case 104:
                                    this.h_ = nVar.L();
                                    continue;
                                case 112:
                                    this.unit_ = nVar.t();
                                    continue;
                                case 120:
                                    this.priv_ = nVar.q();
                                    continue;
                                case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                                    int i15 = (i10 == true ? 1 : 0) & 16;
                                    i10 = i10;
                                    if (i15 == 0) {
                                        this.displayfmt_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 16;
                                    }
                                    this.displayfmt_.add((DisplayFormat) nVar.A(DisplayFormat.parser(), yVar));
                                    continue;
                                case CONFIG_REFRESH_FAILED_VALUE:
                                    NativeFormat nativeFormat = this.nativefmt_;
                                    NativeFormat.Builder builder = nativeFormat != null ? nativeFormat.toBuilder() : null;
                                    NativeFormat nativeFormat2 = (NativeFormat) nVar.A(NativeFormat.parser(), yVar);
                                    this.nativefmt_ = nativeFormat2;
                                    if (builder != null) {
                                        builder.mergeFrom(nativeFormat2);
                                        this.nativefmt_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 146:
                                    int i16 = (i10 == true ? 1 : 0) & 32;
                                    i10 = i10;
                                    if (i16 == 0) {
                                        this.event_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 32;
                                    }
                                    this.event_.add((EventSpec) nVar.A(EventSpec.parser(), yVar));
                                    continue;
                                case 154:
                                    int i17 = (i10 == true ? 1 : 0) & 64;
                                    i10 = i10;
                                    if (i17 == 0) {
                                        this.extProto_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 64;
                                    }
                                    this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                    continue;
                                case 162:
                                    Struct struct = this.ext_;
                                    Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                    Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                    this.ext_ = struct2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(struct2);
                                        this.ext_ = builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                default:
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                        break;
                                    }
                                    break;
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (((i10 == true ? 1 : 0) & 1) != 0) {
                        this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
                    }
                    if (((i10 == true ? 1 : 0) & 2) != 0) {
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if (((i10 == true ? 1 : 0) & 4) != 0) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if (((i10 == true ? 1 : 0) & 8) != 0) {
                        this.ctype_ = Collections.unmodifiableList(this.ctype_);
                    }
                    if (((i10 == true ? 1 : 0) & 16) != 0) {
                        this.displayfmt_ = Collections.unmodifiableList(this.displayfmt_);
                    }
                    if (((i10 == true ? 1 : 0) & 32) != 0) {
                        this.event_ = Collections.unmodifiableList(this.event_);
                    }
                    if (((i10 == true ? 1 : 0) & 64) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (((i10 == true ? 1 : 0) & 1) != 0) {
                this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 2) != 0) {
                this.mime_ = this.mime_.getUnmodifiableView();
            }
            if (((i10 == true ? 1 : 0) & 4) != 0) {
                this.api_ = Collections.unmodifiableList(this.api_);
            }
            if (((i10 == true ? 1 : 0) & 8) != 0) {
                this.ctype_ = Collections.unmodifiableList(this.ctype_);
            }
            if (((i10 == true ? 1 : 0) & 16) != 0) {
                this.displayfmt_ = Collections.unmodifiableList(this.displayfmt_);
            }
            if (((i10 == true ? 1 : 0) & 32) != 0) {
                this.event_ = Collections.unmodifiableList(this.event_);
            }
            if (((i10 == true ? 1 : 0) & 64) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public interface DisplayPlacementOrBuilder extends MessageOrBuilder {
        int getAmpren();

        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        ClickType getClktype();

        int getClktypeValue();

        DisplayContextType getContext();

        int getContextValue();

        DisplayCreativeType getCtype(int i10);

        int getCtypeCount();

        List<DisplayCreativeType> getCtypeList();

        int getCtypeValue(int i10);

        List<Integer> getCtypeValueList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        DisplayPlacement.DisplayFormat getDisplayfmt(int i10);

        int getDisplayfmtCount();

        List<DisplayPlacement.DisplayFormat> getDisplayfmtList();

        DisplayPlacement.DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i10);

        List<? extends DisplayPlacement.DisplayFormatOrBuilder> getDisplayfmtOrBuilderList();

        DisplayPlacement.EventSpec getEvent(int i10);

        int getEventCount();

        List<DisplayPlacement.EventSpec> getEventList();

        DisplayPlacement.EventSpecOrBuilder getEventOrBuilder(int i10);

        List<? extends DisplayPlacement.EventSpecOrBuilder> getEventOrBuilderList();

        Struct getExt();

        i2 getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        e getExtProtoOrBuilder(int i10);

        List<? extends e> getExtProtoOrBuilderList();

        int getH();

        String getIfrbust(int i10);

        ByteString getIfrbustBytes(int i10);

        int getIfrbustCount();

        List<String> getIfrbustList();

        boolean getInstl();

        String getMime(int i10);

        ByteString getMimeBytes(int i10);

        int getMimeCount();

        List<String> getMimeList();

        DisplayPlacement.NativeFormat getNativefmt();

        DisplayPlacement.NativeFormatOrBuilder getNativefmtOrBuilder();

        PlacementPosition getPos();

        int getPosValue();

        boolean getPriv();

        DisplayPlacementType getPtype();

        int getPtypeValue();

        boolean getTopframe();

        SizeUnit getUnit();

        int getUnitValue();

        int getW();

        boolean hasExt();

        boolean hasNativefmt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class VideoPlacement extends j0 implements VideoPlacementOrBuilder {
        public static final int API_FIELD_NUMBER = 11;
        public static final int BOXING_FIELD_NUMBER = 24;
        public static final int CLKTYPE_FIELD_NUMBER = 9;
        public static final int COMPTYPE_FIELD_NUMBER = 26;
        public static final int COMP_FIELD_NUMBER = 25;
        public static final int CTYPE_FIELD_NUMBER = 12;
        public static final int DELAY_FIELD_NUMBER = 3;
        public static final int DELIVERY_FIELD_NUMBER = 21;
        public static final int EXT_FIELD_NUMBER = 28;
        public static final int EXT_PROTO_FIELD_NUMBER = 27;
        public static final int H_FIELD_NUMBER = 14;
        public static final int LINEAR_FIELD_NUMBER = 23;
        public static final int MAXBITR_FIELD_NUMBER = 20;
        public static final int MAXDUR_FIELD_NUMBER = 17;
        public static final int MAXEXT_FIELD_NUMBER = 18;
        public static final int MAXSEQ_FIELD_NUMBER = 22;
        public static final int MIME_FIELD_NUMBER = 10;
        public static final int MINBITR_FIELD_NUMBER = 19;
        public static final int MINDUR_FIELD_NUMBER = 16;
        public static final int PLAYEND_FIELD_NUMBER = 8;
        public static final int PLAYMETHOD_FIELD_NUMBER = 7;
        public static final int POS_FIELD_NUMBER = 2;
        public static final int PTYPE_FIELD_NUMBER = 1;
        public static final int SKIPAFTER_FIELD_NUMBER = 6;
        public static final int SKIPMIN_FIELD_NUMBER = 5;
        public static final int SKIP_FIELD_NUMBER = 4;
        public static final int UNIT_FIELD_NUMBER = 15;
        public static final int W_FIELD_NUMBER = 13;
        private static final long serialVersionUID = 0;
        private int apiMemoizedSerializedSize;
        private List<Integer> api_;
        private boolean boxing_;
        private int clktype_;
        private List<Companion> comp_;
        private int comptypeMemoizedSerializedSize;
        private List<Integer> comptype_;
        private int ctypeMemoizedSerializedSize;
        private List<Integer> ctype_;
        private int delay_;
        private int deliveryMemoizedSerializedSize;
        private List<Integer> delivery_;
        private List<Any> extProto_;
        private Struct ext_;
        private int h_;
        private int linear_;
        private int maxbitr_;
        private int maxdur_;
        private int maxext_;
        private int maxseq_;
        private byte memoizedIsInitialized;
        private r0 mime_;
        private int minbitr_;
        private int mindur_;
        private int playend_;
        private int playmethod_;
        private int pos_;
        private int ptype_;
        private boolean skip_;
        private int skipafter_;
        private int skipmin_;
        private int unit_;
        private int w_;
        private static final l0.h.a<Integer, ApiFramework> api_converter_ = new l0.h.a<Integer, ApiFramework>() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.1
            @Override // com.explorestack.protobuf.l0.h.a
            public ApiFramework convert(Integer num) {
                ApiFramework apiFrameworkValueOf = ApiFramework.valueOf(num.intValue());
                return apiFrameworkValueOf == null ? ApiFramework.UNRECOGNIZED : apiFrameworkValueOf;
            }
        };
        private static final l0.h.a<Integer, VideoCreativeType> ctype_converter_ = new l0.h.a<Integer, VideoCreativeType>() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.2
            @Override // com.explorestack.protobuf.l0.h.a
            public VideoCreativeType convert(Integer num) {
                VideoCreativeType videoCreativeTypeValueOf = VideoCreativeType.valueOf(num.intValue());
                return videoCreativeTypeValueOf == null ? VideoCreativeType.UNRECOGNIZED : videoCreativeTypeValueOf;
            }
        };
        private static final l0.h.a<Integer, DeliveryMethod> delivery_converter_ = new l0.h.a<Integer, DeliveryMethod>() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.3
            @Override // com.explorestack.protobuf.l0.h.a
            public DeliveryMethod convert(Integer num) {
                DeliveryMethod deliveryMethodValueOf = DeliveryMethod.valueOf(num.intValue());
                return deliveryMethodValueOf == null ? DeliveryMethod.UNRECOGNIZED : deliveryMethodValueOf;
            }
        };
        private static final l0.h.a<Integer, CompanionType> comptype_converter_ = new l0.h.a<Integer, CompanionType>() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.4
            @Override // com.explorestack.protobuf.l0.h.a
            public CompanionType convert(Integer num) {
                CompanionType companionTypeValueOf = CompanionType.valueOf(num.intValue());
                return companionTypeValueOf == null ? CompanionType.UNRECOGNIZED : companionTypeValueOf;
            }
        };
        private static final VideoPlacement DEFAULT_INSTANCE = new VideoPlacement();
        private static final s1<VideoPlacement> PARSER = new com.explorestack.protobuf.b<VideoPlacement>() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.5
            @Override // com.explorestack.protobuf.s1
            public VideoPlacement parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                return new VideoPlacement(nVar, yVar);
            }
        };

        public static final class Builder extends j0.b<Builder> implements VideoPlacementOrBuilder {
            private List<Integer> api_;
            private int bitField0_;
            private boolean boxing_;
            private int clktype_;
            private z1<Companion, Companion.Builder, CompanionOrBuilder> compBuilder_;
            private List<Companion> comp_;
            private List<Integer> comptype_;
            private List<Integer> ctype_;
            private int delay_;
            private List<Integer> delivery_;
            private e2<Struct, Struct.Builder, i2> extBuilder_;
            private z1<Any, Any.Builder, e> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private int linear_;
            private int maxbitr_;
            private int maxdur_;
            private int maxext_;
            private int maxseq_;
            private r0 mime_;
            private int minbitr_;
            private int mindur_;
            private int playend_;
            private int playmethod_;
            private int pos_;
            private int ptype_;
            private boolean skip_;
            private int skipafter_;
            private int skipmin_;
            private int unit_;
            private int w_;

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureCompIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.comp_ = new ArrayList(this.comp_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureComptypeIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.comptype_ = new ArrayList(this.comptype_);
                    this.bitField0_ |= 32;
                }
            }

            private void ensureCtypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.ctype_ = new ArrayList(this.ctype_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureDeliveryIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.delivery_ = new ArrayList(this.delivery_);
                    this.bitField0_ |= 8;
                }
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 64) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 64;
                }
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mime_ = new q0(this.mime_);
                    this.bitField0_ |= 1;
                }
            }

            private z1<Companion, Companion.Builder, CompanionOrBuilder> getCompFieldBuilder() {
                if (this.compBuilder_ == null) {
                    this.compBuilder_ = new z1<>(this.comp_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.comp_ = null;
                }
                return this.compBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.W;
            }

            private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (j0.alwaysUseFieldBuilders) {
                    getCompFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                Iterator<? extends ApiFramework> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                Iterator<Integer> it = iterable.iterator();
                while (it.hasNext()) {
                    this.api_.add(Integer.valueOf(it.next().intValue()));
                }
                onChanged();
                return this;
            }

            public Builder addAllComp(Iterable<? extends Companion> iterable) {
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                if (z1Var == null) {
                    ensureCompIsMutable();
                    com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.comp_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addAllComptype(Iterable<? extends CompanionType> iterable) {
                ensureComptypeIsMutable();
                Iterator<? extends CompanionType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.comptype_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllComptypeValue(Iterable<Integer> iterable) {
                ensureComptypeIsMutable();
                Iterator<Integer> it = iterable.iterator();
                while (it.hasNext()) {
                    this.comptype_.add(Integer.valueOf(it.next().intValue()));
                }
                onChanged();
                return this;
            }

            public Builder addAllCtype(Iterable<? extends VideoCreativeType> iterable) {
                ensureCtypeIsMutable();
                Iterator<? extends VideoCreativeType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.ctype_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllCtypeValue(Iterable<Integer> iterable) {
                ensureCtypeIsMutable();
                Iterator<Integer> it = iterable.iterator();
                while (it.hasNext()) {
                    this.ctype_.add(Integer.valueOf(it.next().intValue()));
                }
                onChanged();
                return this;
            }

            public Builder addAllDelivery(Iterable<? extends DeliveryMethod> iterable) {
                ensureDeliveryIsMutable();
                Iterator<? extends DeliveryMethod> it = iterable.iterator();
                while (it.hasNext()) {
                    this.delivery_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllDeliveryValue(Iterable<Integer> iterable) {
                ensureDeliveryIsMutable();
                Iterator<Integer> it = iterable.iterator();
                while (it.hasNext()) {
                    this.delivery_.add(Integer.valueOf(it.next().intValue()));
                }
                onChanged();
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                    onChanged();
                } else {
                    z1Var.a(iterable);
                }
                return this;
            }

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.mime_);
                onChanged();
                return this;
            }

            public Builder addApi(ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i10) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addComp(Companion companion) {
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                if (z1Var == null) {
                    companion.getClass();
                    ensureCompIsMutable();
                    this.comp_.add(companion);
                    onChanged();
                } else {
                    z1Var.e(companion);
                }
                return this;
            }

            public Companion.Builder addCompBuilder() {
                return (Companion.Builder) getCompFieldBuilder().c(Companion.getDefaultInstance());
            }

            public Builder addComptype(CompanionType companionType) {
                companionType.getClass();
                ensureComptypeIsMutable();
                this.comptype_.add(Integer.valueOf(companionType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addComptypeValue(int i10) {
                ensureComptypeIsMutable();
                this.comptype_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addCtype(VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder addCtypeValue(int i10) {
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addDelivery(DeliveryMethod deliveryMethod) {
                deliveryMethod.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.add(Integer.valueOf(deliveryMethod.getNumber()));
                onChanged();
                return this;
            }

            public Builder addDeliveryValue(int i10) {
                ensureDeliveryIsMutable();
                this.delivery_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addExtProto(Any any) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    z1Var.e(any);
                }
                return this;
            }

            public Any.Builder addExtProtoBuilder() {
                return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
            }

            public Builder addMime(String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.add(str);
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) {
                byteString.getClass();
                com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                ensureMimeIsMutable();
                this.mime_.b(byteString);
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearBoxing() {
                this.boxing_ = false;
                onChanged();
                return this;
            }

            public Builder clearClktype() {
                this.clktype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearComp() {
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                if (z1Var == null) {
                    this.comp_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder clearComptype() {
                this.comptype_ = Collections.emptyList();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearCtype() {
                this.ctype_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearDelay() {
                this.delay_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDelivery() {
                this.delivery_ = Collections.emptyList();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                return this;
            }

            public Builder clearExtProto() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -65;
                    onChanged();
                } else {
                    z1Var.g();
                }
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLinear() {
                this.linear_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxbitr() {
                this.maxbitr_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxdur() {
                this.maxdur_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxext() {
                this.maxext_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxseq() {
                this.maxseq_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMime() {
                this.mime_ = q0.f10776d;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearMinbitr() {
                this.minbitr_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMindur() {
                this.mindur_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPlayend() {
                this.playend_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPlaymethod() {
                this.playmethod_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPos() {
                this.pos_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPtype() {
                this.ptype_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSkip() {
                this.skip_ = false;
                onChanged();
                return this;
            }

            public Builder clearSkipafter() {
                this.skipafter_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSkipmin() {
                this.skipmin_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUnit() {
                this.unit_ = 0;
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.w_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public ApiFramework getApi(int i10) {
                return (ApiFramework) VideoPlacement.api_converter_.convert(this.api_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getApiCount() {
                return this.api_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<ApiFramework> getApiList() {
                return new l0.h(this.api_, VideoPlacement.api_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getApiValue(int i10) {
                return this.api_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public boolean getBoxing() {
                return this.boxing_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public ClickType getClktype() {
                ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
                return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getClktypeValue() {
                return this.clktype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public Companion getComp(int i10) {
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                return z1Var == null ? this.comp_.get(i10) : (Companion) z1Var.n(i10);
            }

            public Companion.Builder getCompBuilder(int i10) {
                return (Companion.Builder) getCompFieldBuilder().k(i10);
            }

            public List<Companion.Builder> getCompBuilderList() {
                return getCompFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getCompCount() {
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                return z1Var == null ? this.comp_.size() : z1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Companion> getCompList() {
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.comp_) : z1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public CompanionOrBuilder getCompOrBuilder(int i10) {
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                return z1Var == null ? this.comp_.get(i10) : (CompanionOrBuilder) z1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<? extends CompanionOrBuilder> getCompOrBuilderList() {
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.comp_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public CompanionType getComptype(int i10) {
                return (CompanionType) VideoPlacement.comptype_converter_.convert(this.comptype_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getComptypeCount() {
                return this.comptype_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<CompanionType> getComptypeList() {
                return new l0.h(this.comptype_, VideoPlacement.comptype_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getComptypeValue(int i10) {
                return this.comptype_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getComptypeValueList() {
                return Collections.unmodifiableList(this.comptype_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public VideoCreativeType getCtype(int i10) {
                return (VideoCreativeType) VideoPlacement.ctype_converter_.convert(this.ctype_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getCtypeCount() {
                return this.ctype_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<VideoCreativeType> getCtypeList() {
                return new l0.h(this.ctype_, VideoPlacement.ctype_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getCtypeValue(int i10) {
                return this.ctype_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getCtypeValueList() {
                return Collections.unmodifiableList(this.ctype_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getDelay() {
                return this.delay_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public DeliveryMethod getDelivery(int i10) {
                return (DeliveryMethod) VideoPlacement.delivery_converter_.convert(this.delivery_.get(i10));
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getDeliveryCount() {
                return this.delivery_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<DeliveryMethod> getDeliveryList() {
                return new l0.h(this.delivery_, VideoPlacement.delivery_converter_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getDeliveryValue(int i10) {
                return this.delivery_.get(i10).intValue();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Integer> getDeliveryValueList() {
                return Collections.unmodifiableList(this.delivery_);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return b.W;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public Struct getExt() {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var != null) {
                    return (Struct) e2Var.e();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return (Struct.Builder) getExtFieldBuilder().d();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public i2 getExtOrBuilder() {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var != null) {
                    return (i2) e2Var.f();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public Any getExtProto(int i10) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
            }

            public Any.Builder getExtProtoBuilder(int i10) {
                return (Any.Builder) getExtProtoFieldBuilder().k(i10);
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().l();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getExtProtoCount() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.size() : z1Var.m();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<Any> getExtProtoList() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getH() {
                return this.h_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public LinearityMode getLinear() {
                LinearityMode linearityModeValueOf = LinearityMode.valueOf(this.linear_);
                return linearityModeValueOf == null ? LinearityMode.UNRECOGNIZED : linearityModeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getLinearValue() {
                return this.linear_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxbitr() {
                return this.maxbitr_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxdur() {
                return this.maxdur_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxext() {
                return this.maxext_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMaxseq() {
                return this.maxseq_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public String getMime(int i10) {
                return this.mime_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public ByteString getMimeBytes(int i10) {
                return this.mime_.getByteString(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMimeCount() {
                return this.mime_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMinbitr() {
                return this.minbitr_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getMindur() {
                return this.mindur_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public PlaybackCessationMode getPlayend() {
                PlaybackCessationMode playbackCessationModeValueOf = PlaybackCessationMode.valueOf(this.playend_);
                return playbackCessationModeValueOf == null ? PlaybackCessationMode.UNRECOGNIZED : playbackCessationModeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPlayendValue() {
                return this.playend_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public PlaybackMethod getPlaymethod() {
                PlaybackMethod playbackMethodValueOf = PlaybackMethod.valueOf(this.playmethod_);
                return playbackMethodValueOf == null ? PlaybackMethod.UNRECOGNIZED : playbackMethodValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPlaymethodValue() {
                return this.playmethod_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public PlacementPosition getPos() {
                PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
                return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPosValue() {
                return this.pos_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public VideoPlacementType getPtype() {
                VideoPlacementType videoPlacementTypeValueOf = VideoPlacementType.valueOf(this.ptype_);
                return videoPlacementTypeValueOf == null ? VideoPlacementType.UNRECOGNIZED : videoPlacementTypeValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getPtypeValue() {
                return this.ptype_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public boolean getSkip() {
                return this.skip_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getSkipafter() {
                return this.skipafter_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getSkipmin() {
                return this.skipmin_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public SizeUnit getUnit() {
                SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
                return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getUnitValue() {
                return this.unit_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public int getW() {
                return this.w_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.j0.b
            protected j0.f internalGetFieldAccessorTable() {
                return b.X.d(VideoPlacement.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeExt(Struct struct) {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var == null) {
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                } else {
                    e2Var.g(struct);
                }
                return this;
            }

            public Builder removeComp(int i10) {
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                if (z1Var == null) {
                    ensureCompIsMutable();
                    this.comp_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder removeExtProto(int i10) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i10);
                    onChanged();
                } else {
                    z1Var.v(i10);
                }
                return this;
            }

            public Builder setApi(int i10, ApiFramework apiFramework) {
                apiFramework.getClass();
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(apiFramework.getNumber()));
                onChanged();
                return this;
            }

            public Builder setApiValue(int i10, int i11) {
                ensureApiIsMutable();
                this.api_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setBoxing(boolean z10) {
                this.boxing_ = z10;
                onChanged();
                return this;
            }

            public Builder setClktype(ClickType clickType) {
                clickType.getClass();
                this.clktype_ = clickType.getNumber();
                onChanged();
                return this;
            }

            public Builder setClktypeValue(int i10) {
                this.clktype_ = i10;
                onChanged();
                return this;
            }

            public Builder setComp(int i10, Companion companion) {
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                if (z1Var == null) {
                    companion.getClass();
                    ensureCompIsMutable();
                    this.comp_.set(i10, companion);
                    onChanged();
                } else {
                    z1Var.w(i10, companion);
                }
                return this;
            }

            public Builder setComptype(int i10, CompanionType companionType) {
                companionType.getClass();
                ensureComptypeIsMutable();
                this.comptype_.set(i10, Integer.valueOf(companionType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setComptypeValue(int i10, int i11) {
                ensureComptypeIsMutable();
                this.comptype_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setCtype(int i10, VideoCreativeType videoCreativeType) {
                videoCreativeType.getClass();
                ensureCtypeIsMutable();
                this.ctype_.set(i10, Integer.valueOf(videoCreativeType.getNumber()));
                onChanged();
                return this;
            }

            public Builder setCtypeValue(int i10, int i11) {
                ensureCtypeIsMutable();
                this.ctype_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setDelay(int i10) {
                this.delay_ = i10;
                onChanged();
                return this;
            }

            public Builder setDelivery(int i10, DeliveryMethod deliveryMethod) {
                deliveryMethod.getClass();
                ensureDeliveryIsMutable();
                this.delivery_.set(i10, Integer.valueOf(deliveryMethod.getNumber()));
                onChanged();
                return this;
            }

            public Builder setDeliveryValue(int i10, int i11) {
                ensureDeliveryIsMutable();
                this.delivery_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setExt(Struct struct) {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var == null) {
                    struct.getClass();
                    this.ext_ = struct;
                    onChanged();
                } else {
                    e2Var.i(struct);
                }
                return this;
            }

            public Builder setExtProto(int i10, Any any) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i10, any);
                    onChanged();
                } else {
                    z1Var.w(i10, any);
                }
                return this;
            }

            public Builder setH(int i10) {
                this.h_ = i10;
                onChanged();
                return this;
            }

            public Builder setLinear(LinearityMode linearityMode) {
                linearityMode.getClass();
                this.linear_ = linearityMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setLinearValue(int i10) {
                this.linear_ = i10;
                onChanged();
                return this;
            }

            public Builder setMaxbitr(int i10) {
                this.maxbitr_ = i10;
                onChanged();
                return this;
            }

            public Builder setMaxdur(int i10) {
                this.maxdur_ = i10;
                onChanged();
                return this;
            }

            public Builder setMaxext(int i10) {
                this.maxext_ = i10;
                onChanged();
                return this;
            }

            public Builder setMaxseq(int i10) {
                this.maxseq_ = i10;
                onChanged();
                return this;
            }

            public Builder setMime(int i10, String str) {
                str.getClass();
                ensureMimeIsMutable();
                this.mime_.set(i10, str);
                onChanged();
                return this;
            }

            public Builder setMinbitr(int i10) {
                this.minbitr_ = i10;
                onChanged();
                return this;
            }

            public Builder setMindur(int i10) {
                this.mindur_ = i10;
                onChanged();
                return this;
            }

            public Builder setPlayend(PlaybackCessationMode playbackCessationMode) {
                playbackCessationMode.getClass();
                this.playend_ = playbackCessationMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setPlayendValue(int i10) {
                this.playend_ = i10;
                onChanged();
                return this;
            }

            public Builder setPlaymethod(PlaybackMethod playbackMethod) {
                playbackMethod.getClass();
                this.playmethod_ = playbackMethod.getNumber();
                onChanged();
                return this;
            }

            public Builder setPlaymethodValue(int i10) {
                this.playmethod_ = i10;
                onChanged();
                return this;
            }

            public Builder setPos(PlacementPosition placementPosition) {
                placementPosition.getClass();
                this.pos_ = placementPosition.getNumber();
                onChanged();
                return this;
            }

            public Builder setPosValue(int i10) {
                this.pos_ = i10;
                onChanged();
                return this;
            }

            public Builder setPtype(VideoPlacementType videoPlacementType) {
                videoPlacementType.getClass();
                this.ptype_ = videoPlacementType.getNumber();
                onChanged();
                return this;
            }

            public Builder setPtypeValue(int i10) {
                this.ptype_ = i10;
                onChanged();
                return this;
            }

            public Builder setSkip(boolean z10) {
                this.skip_ = z10;
                onChanged();
                return this;
            }

            public Builder setSkipafter(int i10) {
                this.skipafter_ = i10;
                onChanged();
                return this;
            }

            public Builder setSkipmin(int i10) {
                this.skipmin_ = i10;
                onChanged();
                return this;
            }

            public Builder setUnit(SizeUnit sizeUnit) {
                sizeUnit.getClass();
                this.unit_ = sizeUnit.getNumber();
                onChanged();
                return this;
            }

            public Builder setUnitValue(int i10) {
                this.unit_ = i10;
                onChanged();
                return this;
            }

            public Builder setW(int i10) {
                this.w_ = i10;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
            public w1 getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            private Builder() {
                this.ptype_ = 0;
                this.pos_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = q0.f10776d;
                this.api_ = Collections.emptyList();
                this.ctype_ = Collections.emptyList();
                this.unit_ = 0;
                this.delivery_ = Collections.emptyList();
                this.linear_ = 0;
                this.comp_ = Collections.emptyList();
                this.comptype_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public VideoPlacement build() {
                VideoPlacement videoPlacementBuildPartial = buildPartial();
                if (videoPlacementBuildPartial.isInitialized()) {
                    return videoPlacementBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) videoPlacementBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public VideoPlacement buildPartial() {
                VideoPlacement videoPlacement = new VideoPlacement(this);
                videoPlacement.ptype_ = this.ptype_;
                videoPlacement.pos_ = this.pos_;
                videoPlacement.delay_ = this.delay_;
                videoPlacement.skip_ = this.skip_;
                videoPlacement.skipmin_ = this.skipmin_;
                videoPlacement.skipafter_ = this.skipafter_;
                videoPlacement.playmethod_ = this.playmethod_;
                videoPlacement.playend_ = this.playend_;
                videoPlacement.clktype_ = this.clktype_;
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                videoPlacement.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                videoPlacement.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.ctype_ = Collections.unmodifiableList(this.ctype_);
                    this.bitField0_ &= -5;
                }
                videoPlacement.ctype_ = this.ctype_;
                videoPlacement.w_ = this.w_;
                videoPlacement.h_ = this.h_;
                videoPlacement.unit_ = this.unit_;
                videoPlacement.mindur_ = this.mindur_;
                videoPlacement.maxdur_ = this.maxdur_;
                videoPlacement.maxext_ = this.maxext_;
                videoPlacement.minbitr_ = this.minbitr_;
                videoPlacement.maxbitr_ = this.maxbitr_;
                if ((this.bitField0_ & 8) != 0) {
                    this.delivery_ = Collections.unmodifiableList(this.delivery_);
                    this.bitField0_ &= -9;
                }
                videoPlacement.delivery_ = this.delivery_;
                videoPlacement.maxseq_ = this.maxseq_;
                videoPlacement.linear_ = this.linear_;
                videoPlacement.boxing_ = this.boxing_;
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                if (z1Var != null) {
                    videoPlacement.comp_ = z1Var.f();
                } else {
                    if ((this.bitField0_ & 16) != 0) {
                        this.comp_ = Collections.unmodifiableList(this.comp_);
                        this.bitField0_ &= -17;
                    }
                    videoPlacement.comp_ = this.comp_;
                }
                if ((this.bitField0_ & 32) != 0) {
                    this.comptype_ = Collections.unmodifiableList(this.comptype_);
                    this.bitField0_ &= -33;
                }
                videoPlacement.comptype_ = this.comptype_;
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var == null) {
                    videoPlacement.ext_ = this.ext_;
                } else {
                    videoPlacement.ext_ = (Struct) e2Var.a();
                }
                z1<Any, Any.Builder, e> z1Var2 = this.extProtoBuilder_;
                if (z1Var2 != null) {
                    videoPlacement.extProto_ = z1Var2.f();
                } else {
                    if ((this.bitField0_ & 64) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -65;
                    }
                    videoPlacement.extProto_ = this.extProto_;
                }
                onBuilt();
                return videoPlacement;
            }

            @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public VideoPlacement mo164getDefaultInstanceForType() {
                return VideoPlacement.getDefaultInstance();
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

            public Companion.Builder addCompBuilder(int i10) {
                return (Companion.Builder) getCompFieldBuilder().b(i10, Companion.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i10) {
                return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
                this.ptype_ = 0;
                this.pos_ = 0;
                this.delay_ = 0;
                this.skip_ = false;
                this.skipmin_ = 0;
                this.skipafter_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = q0.f10776d;
                this.bitField0_ &= -2;
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                this.ctype_ = Collections.emptyList();
                this.bitField0_ &= -5;
                this.w_ = 0;
                this.h_ = 0;
                this.unit_ = 0;
                this.mindur_ = 0;
                this.maxdur_ = 0;
                this.maxext_ = 0;
                this.minbitr_ = 0;
                this.maxbitr_ = 0;
                this.delivery_ = Collections.emptyList();
                this.bitField0_ &= -9;
                this.maxseq_ = 0;
                this.linear_ = 0;
                this.boxing_ = false;
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                if (z1Var == null) {
                    this.comp_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                } else {
                    z1Var.g();
                }
                this.comptype_ = Collections.emptyList();
                this.bitField0_ &= -33;
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                z1<Any, Any.Builder, e> z1Var2 = this.extProtoBuilder_;
                if (z1Var2 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -65;
                } else {
                    z1Var2.g();
                }
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                if (e2Var == null) {
                    this.ext_ = builder.build();
                    onChanged();
                } else {
                    e2Var.i(builder.build());
                }
                return this;
            }

            public Builder addComp(int i10, Companion companion) {
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                if (z1Var == null) {
                    companion.getClass();
                    ensureCompIsMutable();
                    this.comp_.add(i10, companion);
                    onChanged();
                } else {
                    z1Var.d(i10, companion);
                }
                return this;
            }

            public Builder addExtProto(int i10, Any any) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    any.getClass();
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i10, any);
                    onChanged();
                } else {
                    z1Var.d(i10, any);
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
                if (message instanceof VideoPlacement) {
                    return mergeFrom((VideoPlacement) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setComp(int i10, Companion.Builder builder) {
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                if (z1Var == null) {
                    ensureCompIsMutable();
                    this.comp_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            public Builder setExtProto(int i10, Any.Builder builder) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.w(i10, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(VideoPlacement videoPlacement) {
                if (videoPlacement == VideoPlacement.getDefaultInstance()) {
                    return this;
                }
                if (videoPlacement.ptype_ != 0) {
                    setPtypeValue(videoPlacement.getPtypeValue());
                }
                if (videoPlacement.pos_ != 0) {
                    setPosValue(videoPlacement.getPosValue());
                }
                if (videoPlacement.getDelay() != 0) {
                    setDelay(videoPlacement.getDelay());
                }
                if (videoPlacement.getSkip()) {
                    setSkip(videoPlacement.getSkip());
                }
                if (videoPlacement.getSkipmin() != 0) {
                    setSkipmin(videoPlacement.getSkipmin());
                }
                if (videoPlacement.getSkipafter() != 0) {
                    setSkipafter(videoPlacement.getSkipafter());
                }
                if (videoPlacement.playmethod_ != 0) {
                    setPlaymethodValue(videoPlacement.getPlaymethodValue());
                }
                if (videoPlacement.playend_ != 0) {
                    setPlayendValue(videoPlacement.getPlayendValue());
                }
                if (videoPlacement.clktype_ != 0) {
                    setClktypeValue(videoPlacement.getClktypeValue());
                }
                if (!videoPlacement.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = videoPlacement.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(videoPlacement.mime_);
                    }
                    onChanged();
                }
                if (!videoPlacement.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = videoPlacement.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(videoPlacement.api_);
                    }
                    onChanged();
                }
                if (!videoPlacement.ctype_.isEmpty()) {
                    if (this.ctype_.isEmpty()) {
                        this.ctype_ = videoPlacement.ctype_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureCtypeIsMutable();
                        this.ctype_.addAll(videoPlacement.ctype_);
                    }
                    onChanged();
                }
                if (videoPlacement.getW() != 0) {
                    setW(videoPlacement.getW());
                }
                if (videoPlacement.getH() != 0) {
                    setH(videoPlacement.getH());
                }
                if (videoPlacement.unit_ != 0) {
                    setUnitValue(videoPlacement.getUnitValue());
                }
                if (videoPlacement.getMindur() != 0) {
                    setMindur(videoPlacement.getMindur());
                }
                if (videoPlacement.getMaxdur() != 0) {
                    setMaxdur(videoPlacement.getMaxdur());
                }
                if (videoPlacement.getMaxext() != 0) {
                    setMaxext(videoPlacement.getMaxext());
                }
                if (videoPlacement.getMinbitr() != 0) {
                    setMinbitr(videoPlacement.getMinbitr());
                }
                if (videoPlacement.getMaxbitr() != 0) {
                    setMaxbitr(videoPlacement.getMaxbitr());
                }
                if (!videoPlacement.delivery_.isEmpty()) {
                    if (this.delivery_.isEmpty()) {
                        this.delivery_ = videoPlacement.delivery_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureDeliveryIsMutable();
                        this.delivery_.addAll(videoPlacement.delivery_);
                    }
                    onChanged();
                }
                if (videoPlacement.getMaxseq() != 0) {
                    setMaxseq(videoPlacement.getMaxseq());
                }
                if (videoPlacement.linear_ != 0) {
                    setLinearValue(videoPlacement.getLinearValue());
                }
                if (videoPlacement.getBoxing()) {
                    setBoxing(videoPlacement.getBoxing());
                }
                if (this.compBuilder_ == null) {
                    if (!videoPlacement.comp_.isEmpty()) {
                        if (this.comp_.isEmpty()) {
                            this.comp_ = videoPlacement.comp_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureCompIsMutable();
                            this.comp_.addAll(videoPlacement.comp_);
                        }
                        onChanged();
                    }
                } else if (!videoPlacement.comp_.isEmpty()) {
                    if (!this.compBuilder_.t()) {
                        this.compBuilder_.a(videoPlacement.comp_);
                    } else {
                        this.compBuilder_.h();
                        this.compBuilder_ = null;
                        this.comp_ = videoPlacement.comp_;
                        this.bitField0_ &= -17;
                        this.compBuilder_ = j0.alwaysUseFieldBuilders ? getCompFieldBuilder() : null;
                    }
                }
                if (!videoPlacement.comptype_.isEmpty()) {
                    if (this.comptype_.isEmpty()) {
                        this.comptype_ = videoPlacement.comptype_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureComptypeIsMutable();
                        this.comptype_.addAll(videoPlacement.comptype_);
                    }
                    onChanged();
                }
                if (videoPlacement.hasExt()) {
                    mergeExt(videoPlacement.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!videoPlacement.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = videoPlacement.extProto_;
                            this.bitField0_ &= -65;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(videoPlacement.extProto_);
                        }
                        onChanged();
                    }
                } else if (!videoPlacement.extProto_.isEmpty()) {
                    if (!this.extProtoBuilder_.t()) {
                        this.extProtoBuilder_.a(videoPlacement.extProto_);
                    } else {
                        this.extProtoBuilder_.h();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = videoPlacement.extProto_;
                        this.bitField0_ &= -65;
                        this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(((j0) videoPlacement).unknownFields);
                onChanged();
                return this;
            }

            public Builder addComp(Companion.Builder builder) {
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                if (z1Var == null) {
                    ensureCompIsMutable();
                    this.comp_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    z1Var.e(builder.build());
                }
                return this;
            }

            public Builder addComp(int i10, Companion.Builder builder) {
                z1<Companion, Companion.Builder, CompanionOrBuilder> z1Var = this.compBuilder_;
                if (z1Var == null) {
                    ensureCompIsMutable();
                    this.comp_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i10, Any.Builder builder) {
                z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                if (z1Var == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i10, builder.build());
                    onChanged();
                } else {
                    z1Var.d(i10, builder.build());
                }
                return this;
            }

            private Builder(j0.c cVar) {
                super(cVar);
                this.ptype_ = 0;
                this.pos_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = q0.f10776d;
                this.api_ = Collections.emptyList();
                this.ctype_ = Collections.emptyList();
                this.unit_ = 0;
                this.delivery_ = Collections.emptyList();
                this.linear_ = 0;
                this.comp_ = Collections.emptyList();
                this.comptype_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                VideoPlacement videoPlacement = null;
                try {
                    try {
                        VideoPlacement videoPlacement2 = (VideoPlacement) VideoPlacement.PARSER.parsePartialFrom(nVar, yVar);
                        if (videoPlacement2 != null) {
                            mergeFrom(videoPlacement2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        VideoPlacement videoPlacement3 = (VideoPlacement) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            videoPlacement = videoPlacement3;
                            if (videoPlacement != null) {
                                mergeFrom(videoPlacement);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (videoPlacement != null) {
                        mergeFrom(videoPlacement);
                    }
                    throw th;
                }
            }
        }

        public static final class Companion extends j0 implements CompanionOrBuilder {
            public static final int DISPLAY_FIELD_NUMBER = 3;
            public static final int EXT_FIELD_NUMBER = 5;
            public static final int EXT_PROTO_FIELD_NUMBER = 4;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int VCM_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private DisplayPlacement display_;
            private List<Any> extProto_;
            private Struct ext_;
            private volatile Object id_;
            private byte memoizedIsInitialized;
            private int vcm_;
            private static final Companion DEFAULT_INSTANCE = new Companion();
            private static final s1<Companion> PARSER = new com.explorestack.protobuf.b<Companion>() { // from class: com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion.1
                @Override // com.explorestack.protobuf.s1
                public Companion parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
                    return new Companion(nVar, yVar);
                }
            };

            public static Companion getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return b.Y;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Companion parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Companion) j0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Companion parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static s1<Companion> parser() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Companion)) {
                    return super.equals(obj);
                }
                Companion companion = (Companion) obj;
                if (!getId().equals(companion.getId()) || getVcm() != companion.getVcm() || hasDisplay() != companion.hasDisplay()) {
                    return false;
                }
                if ((!hasDisplay() || getDisplay().equals(companion.getDisplay())) && hasExt() == companion.hasExt()) {
                    return (!hasExt() || getExt().equals(companion.getExt())) && getExtProtoList().equals(companion.getExtProtoList()) && this.unknownFields.equals(companion.unknownFields);
                }
                return false;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public DisplayPlacement getDisplay() {
                DisplayPlacement displayPlacement = this.display_;
                return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public DisplayPlacementOrBuilder getDisplayOrBuilder() {
                return getDisplay();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public i2 getExtOrBuilder() {
                return getExt();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public Any getExtProto(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public e getExtProtoOrBuilder(int i10) {
                return this.extProto_.get(i10);
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public List<? extends e> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public s1<Companion> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !getIdBytes().isEmpty() ? j0.computeStringSize(1, this.id_) + 0 : 0;
                int i11 = this.vcm_;
                if (i11 != 0) {
                    iComputeStringSize += CodedOutputStream.Y(2, i11);
                }
                if (this.display_ != null) {
                    iComputeStringSize += CodedOutputStream.G(3, getDisplay());
                }
                for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                    iComputeStringSize += CodedOutputStream.G(4, this.extProto_.get(i12));
                }
                if (this.ext_ != null) {
                    iComputeStringSize += CodedOutputStream.G(5, getExt());
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
            public final u2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public int getVcm() {
                return this.vcm_;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public boolean hasDisplay() {
                return this.display_ != null;
            }

            @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
            public boolean hasExt() {
                return this.ext_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getVcm();
                if (hasDisplay()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + getDisplay().hashCode();
                }
                if (hasExt()) {
                    iHashCode = (((iHashCode * 37) + 5) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 4) * 53) + getExtProtoList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.explorestack.protobuf.j0
            protected j0.f internalGetFieldAccessorTable() {
                return b.Z.d(Companion.class, Builder.class);
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
                return new Companion();
            }

            @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    j0.writeString(codedOutputStream, 1, this.id_);
                }
                int i10 = this.vcm_;
                if (i10 != 0) {
                    codedOutputStream.c1(2, i10);
                }
                if (this.display_ != null) {
                    codedOutputStream.L0(3, getDisplay());
                }
                for (int i11 = 0; i11 < this.extProto_.size(); i11++) {
                    codedOutputStream.L0(4, this.extProto_.get(i11));
                }
                if (this.ext_ != null) {
                    codedOutputStream.L0(5, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static final class Builder extends j0.b<Builder> implements CompanionOrBuilder {
                private int bitField0_;
                private e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> displayBuilder_;
                private DisplayPlacement display_;
                private e2<Struct, Struct.Builder, i2> extBuilder_;
                private z1<Any, Any.Builder, e> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private int vcm_;

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 1;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return b.Y;
                }

                private e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> getDisplayFieldBuilder() {
                    if (this.displayBuilder_ == null) {
                        this.displayBuilder_ = new e2<>(getDisplay(), getParentForChildren(), isClean());
                        this.display_ = null;
                    }
                    return this.displayBuilder_;
                }

                private e2<Struct, Struct.Builder, i2> getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new e2<>(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private z1<Any, Any.Builder, e> getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new z1<>(this.extProto_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (j0.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        com.explorestack.protobuf.a.AbstractC0128a.addAll((Iterable) iterable, (List) this.extProto_);
                        onChanged();
                    } else {
                        z1Var.a(iterable);
                    }
                    return this;
                }

                public Builder addExtProto(Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                    } else {
                        z1Var.e(any);
                    }
                    return this;
                }

                public Any.Builder addExtProtoBuilder() {
                    return (Any.Builder) getExtProtoFieldBuilder().c(Any.getDefaultInstance());
                }

                public Builder clearDisplay() {
                    if (this.displayBuilder_ == null) {
                        this.display_ = null;
                        onChanged();
                    } else {
                        this.display_ = null;
                        this.displayBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearExtProto() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                        onChanged();
                    } else {
                        z1Var.g();
                    }
                    return this;
                }

                public Builder clearId() {
                    this.id_ = Companion.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder clearVcm() {
                    this.vcm_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return b.Y;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public DisplayPlacement getDisplay() {
                    e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> e2Var = this.displayBuilder_;
                    if (e2Var != null) {
                        return (DisplayPlacement) e2Var.e();
                    }
                    DisplayPlacement displayPlacement = this.display_;
                    return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
                }

                public DisplayPlacement.Builder getDisplayBuilder() {
                    onChanged();
                    return (DisplayPlacement.Builder) getDisplayFieldBuilder().d();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public DisplayPlacementOrBuilder getDisplayOrBuilder() {
                    e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> e2Var = this.displayBuilder_;
                    if (e2Var != null) {
                        return (DisplayPlacementOrBuilder) e2Var.f();
                    }
                    DisplayPlacement displayPlacement = this.display_;
                    return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public Struct getExt() {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var != null) {
                        return (Struct) e2Var.e();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return (Struct.Builder) getExtFieldBuilder().d();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public i2 getExtOrBuilder() {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var != null) {
                        return (i2) e2Var.f();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public Any getExtProto(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.get(i10) : (Any) z1Var.n(i10);
                }

                public Any.Builder getExtProtoBuilder(int i10) {
                    return (Any.Builder) getExtProtoFieldBuilder().k(i10);
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().l();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public int getExtProtoCount() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.size() : z1Var.m();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public List<Any> getExtProtoList() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? Collections.unmodifiableList(this.extProto_) : z1Var.p();
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public e getExtProtoOrBuilder(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var == null ? this.extProto_.get(i10) : (e) z1Var.q(i10);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public List<? extends e> getExtProtoOrBuilderList() {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    return z1Var != null ? z1Var.r() : Collections.unmodifiableList(this.extProto_);
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public int getVcm() {
                    return this.vcm_;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public boolean hasDisplay() {
                    return (this.displayBuilder_ == null && this.display_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacement.CompanionOrBuilder
                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                @Override // com.explorestack.protobuf.j0.b
                protected j0.f internalGetFieldAccessorTable() {
                    return b.Z.d(Companion.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder mergeDisplay(DisplayPlacement displayPlacement) {
                    e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> e2Var = this.displayBuilder_;
                    if (e2Var == null) {
                        DisplayPlacement displayPlacement2 = this.display_;
                        if (displayPlacement2 != null) {
                            this.display_ = DisplayPlacement.newBuilder(displayPlacement2).mergeFrom(displayPlacement).buildPartial();
                        } else {
                            this.display_ = displayPlacement;
                        }
                        onChanged();
                    } else {
                        e2Var.g(displayPlacement);
                    }
                    return this;
                }

                public Builder mergeExt(Struct struct) {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        Struct struct2 = this.ext_;
                        if (struct2 != null) {
                            this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                        } else {
                            this.ext_ = struct;
                        }
                        onChanged();
                    } else {
                        e2Var.g(struct);
                    }
                    return this;
                }

                public Builder removeExtProto(int i10) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i10);
                        onChanged();
                    } else {
                        z1Var.v(i10);
                    }
                    return this;
                }

                public Builder setDisplay(DisplayPlacement displayPlacement) {
                    e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> e2Var = this.displayBuilder_;
                    if (e2Var == null) {
                        displayPlacement.getClass();
                        this.display_ = displayPlacement;
                        onChanged();
                    } else {
                        e2Var.i(displayPlacement);
                    }
                    return this;
                }

                public Builder setExt(Struct struct) {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        struct.getClass();
                        this.ext_ = struct;
                        onChanged();
                    } else {
                        e2Var.i(struct);
                    }
                    return this;
                }

                public Builder setExtProto(int i10, Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i10, any);
                        onChanged();
                    } else {
                        z1Var.w(i10, any);
                    }
                    return this;
                }

                public Builder setId(String str) {
                    str.getClass();
                    this.id_ = str;
                    onChanged();
                    return this;
                }

                public Builder setIdBytes(ByteString byteString) {
                    byteString.getClass();
                    com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
                    this.id_ = byteString;
                    onChanged();
                    return this;
                }

                public Builder setVcm(int i10) {
                    this.vcm_ = i10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.id_ = "";
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Companion build() {
                    Companion companionBuildPartial = buildPartial();
                    if (companionBuildPartial.isInitialized()) {
                        return companionBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) companionBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Companion buildPartial() {
                    Companion companion = new Companion(this);
                    companion.id_ = this.id_;
                    companion.vcm_ = this.vcm_;
                    e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> e2Var = this.displayBuilder_;
                    if (e2Var == null) {
                        companion.display_ = this.display_;
                    } else {
                        companion.display_ = (DisplayPlacement) e2Var.a();
                    }
                    e2<Struct, Struct.Builder, i2> e2Var2 = this.extBuilder_;
                    if (e2Var2 == null) {
                        companion.ext_ = this.ext_;
                    } else {
                        companion.ext_ = (Struct) e2Var2.a();
                    }
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var != null) {
                        companion.extProto_ = z1Var.f();
                    } else {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        companion.extProto_ = this.extProto_;
                    }
                    onBuilt();
                    return companion;
                }

                @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                /* JADX INFO: renamed from: getDefaultInstanceForType */
                public Companion mo164getDefaultInstanceForType() {
                    return Companion.getDefaultInstance();
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

                public Any.Builder addExtProtoBuilder(int i10) {
                    return (Any.Builder) getExtProtoFieldBuilder().b(i10, Any.getDefaultInstance());
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
                    this.id_ = "";
                    this.vcm_ = 0;
                    if (this.displayBuilder_ == null) {
                        this.display_ = null;
                    } else {
                        this.display_ = null;
                        this.displayBuilder_ = null;
                    }
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                    } else {
                        z1Var.g();
                    }
                    return this;
                }

                public Builder setDisplay(DisplayPlacement.Builder builder) {
                    e2<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> e2Var = this.displayBuilder_;
                    if (e2Var == null) {
                        this.display_ = builder.build();
                        onChanged();
                    } else {
                        e2Var.i(builder.build());
                    }
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    e2<Struct, Struct.Builder, i2> e2Var = this.extBuilder_;
                    if (e2Var == null) {
                        this.ext_ = builder.build();
                        onChanged();
                    } else {
                        e2Var.i(builder.build());
                    }
                    return this;
                }

                private Builder(j0.c cVar) {
                    super(cVar);
                    this.id_ = "";
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                public Builder addExtProto(int i10, Any any) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        any.getClass();
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i10, any);
                        onChanged();
                    } else {
                        z1Var.d(i10, any);
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
                    if (message instanceof Companion) {
                        return mergeFrom((Companion) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder setExtProto(int i10, Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.w(i10, builder.build());
                    }
                    return this;
                }

                public Builder mergeFrom(Companion companion) {
                    if (companion == Companion.getDefaultInstance()) {
                        return this;
                    }
                    if (!companion.getId().isEmpty()) {
                        this.id_ = companion.id_;
                        onChanged();
                    }
                    if (companion.getVcm() != 0) {
                        setVcm(companion.getVcm());
                    }
                    if (companion.hasDisplay()) {
                        mergeDisplay(companion.getDisplay());
                    }
                    if (companion.hasExt()) {
                        mergeExt(companion.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!companion.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = companion.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(companion.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!companion.extProto_.isEmpty()) {
                        if (!this.extProtoBuilder_.t()) {
                            this.extProtoBuilder_.a(companion.extProto_);
                        } else {
                            this.extProtoBuilder_.h();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = companion.extProto_;
                            this.bitField0_ &= -2;
                            this.extProtoBuilder_ = j0.alwaysUseFieldBuilders ? getExtProtoFieldBuilder() : null;
                        }
                    }
                    mergeUnknownFields(((j0) companion).unknownFields);
                    onChanged();
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                    } else {
                        z1Var.e(builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(int i10, Any.Builder builder) {
                    z1<Any, Any.Builder, e> z1Var = this.extProtoBuilder_;
                    if (z1Var == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i10, builder.build());
                        onChanged();
                    } else {
                        z1Var.d(i10, builder.build());
                    }
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(n nVar, y yVar) throws Throwable {
                    Companion companion = null;
                    try {
                        try {
                            Companion companion2 = (Companion) Companion.PARSER.parsePartialFrom(nVar, yVar);
                            if (companion2 != null) {
                                mergeFrom(companion2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            Companion companion3 = (Companion) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th) {
                                th = th;
                                companion = companion3;
                                if (companion != null) {
                                    mergeFrom(companion);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (companion != null) {
                            mergeFrom(companion);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder(Companion companion) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(companion);
            }

            public static Companion parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, yVar);
            }

            private Companion(j0.b<?> bVar) {
                super(bVar);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Companion parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
                return (Companion) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static Companion parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            public Companion mo164getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Companion parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, yVar);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private Companion() {
                this.memoizedIsInitialized = (byte) -1;
                this.id_ = "";
                this.extProto_ = Collections.emptyList();
            }

            public static Companion parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.explorestack.protobuf.j0
            public Builder newBuilderForType(j0.c cVar) {
                return new Builder(cVar);
            }

            public static Companion parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, yVar);
            }

            public static Companion parseFrom(InputStream inputStream) throws IOException {
                return (Companion) j0.parseWithIOException(PARSER, inputStream);
            }

            private Companion(n nVar, y yVar) throws InvalidProtocolBufferException {
                this();
                yVar.getClass();
                u2.b bVarG = u2.g();
                boolean z10 = false;
                boolean z11 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = nVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.id_ = nVar.J();
                                } else if (iK != 16) {
                                    if (iK == 26) {
                                        DisplayPlacement displayPlacement = this.display_;
                                        DisplayPlacement.Builder builder = displayPlacement != null ? displayPlacement.toBuilder() : null;
                                        DisplayPlacement displayPlacement2 = (DisplayPlacement) nVar.A(DisplayPlacement.parser(), yVar);
                                        this.display_ = displayPlacement2;
                                        if (builder != null) {
                                            builder.mergeFrom(displayPlacement2);
                                            this.display_ = builder.buildPartial();
                                        }
                                    } else if (iK == 34) {
                                        boolean z12 = (z11 ? 1 : 0) & true;
                                        z11 = z11;
                                        if (!z12) {
                                            this.extProto_ = new ArrayList();
                                            z11 = (z11 ? 1 : 0) | true;
                                        }
                                        this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                    } else if (iK != 42) {
                                        if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                        }
                                    } else {
                                        Struct struct = this.ext_;
                                        Struct.Builder builder2 = struct != null ? struct.toBuilder() : null;
                                        Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                        this.ext_ = struct2;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(struct2);
                                            this.ext_ = builder2.buildPartial();
                                        }
                                    }
                                } else {
                                    this.vcm_ = nVar.L();
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th) {
                        if ((z11 ? 1 : 0) & true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = bVarG.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if ((z11 ? 1 : 0) & true) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
            }

            public static Companion parseFrom(InputStream inputStream, y yVar) throws IOException {
                return (Companion) j0.parseWithIOException(PARSER, inputStream, yVar);
            }

            public static Companion parseFrom(n nVar) throws IOException {
                return (Companion) j0.parseWithIOException(PARSER, nVar);
            }

            public static Companion parseFrom(n nVar, y yVar) throws IOException {
                return (Companion) j0.parseWithIOException(PARSER, nVar, yVar);
            }
        }

        public interface CompanionOrBuilder extends MessageOrBuilder {
            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* JADX INFO: renamed from: getDefaultInstanceForType */
            /* synthetic */ MessageLite mo164getDefaultInstanceForType();

            DisplayPlacement getDisplay();

            DisplayPlacementOrBuilder getDisplayOrBuilder();

            Struct getExt();

            i2 getExtOrBuilder();

            Any getExtProto(int i10);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            e getExtProtoOrBuilder(int i10);

            List<? extends e> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            int getVcm();

            boolean hasDisplay();

            boolean hasExt();

            @Override // com.explorestack.protobuf.MessageOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static VideoPlacement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return b.W;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VideoPlacement parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoPlacement) j0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VideoPlacement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static s1<VideoPlacement> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VideoPlacement)) {
                return super.equals(obj);
            }
            VideoPlacement videoPlacement = (VideoPlacement) obj;
            if (this.ptype_ == videoPlacement.ptype_ && this.pos_ == videoPlacement.pos_ && getDelay() == videoPlacement.getDelay() && getSkip() == videoPlacement.getSkip() && getSkipmin() == videoPlacement.getSkipmin() && getSkipafter() == videoPlacement.getSkipafter() && this.playmethod_ == videoPlacement.playmethod_ && this.playend_ == videoPlacement.playend_ && this.clktype_ == videoPlacement.clktype_ && getMimeList().equals(videoPlacement.getMimeList()) && this.api_.equals(videoPlacement.api_) && this.ctype_.equals(videoPlacement.ctype_) && getW() == videoPlacement.getW() && getH() == videoPlacement.getH() && this.unit_ == videoPlacement.unit_ && getMindur() == videoPlacement.getMindur() && getMaxdur() == videoPlacement.getMaxdur() && getMaxext() == videoPlacement.getMaxext() && getMinbitr() == videoPlacement.getMinbitr() && getMaxbitr() == videoPlacement.getMaxbitr() && this.delivery_.equals(videoPlacement.delivery_) && getMaxseq() == videoPlacement.getMaxseq() && this.linear_ == videoPlacement.linear_ && getBoxing() == videoPlacement.getBoxing() && getCompList().equals(videoPlacement.getCompList()) && this.comptype_.equals(videoPlacement.comptype_) && hasExt() == videoPlacement.hasExt()) {
                return (!hasExt() || getExt().equals(videoPlacement.getExt())) && getExtProtoList().equals(videoPlacement.getExtProtoList()) && this.unknownFields.equals(videoPlacement.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public ApiFramework getApi(int i10) {
            return api_converter_.convert(this.api_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getApiCount() {
            return this.api_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<ApiFramework> getApiList() {
            return new l0.h(this.api_, api_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getApiValue(int i10) {
            return this.api_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getApiValueList() {
            return this.api_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public boolean getBoxing() {
            return this.boxing_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public ClickType getClktype() {
            ClickType clickTypeValueOf = ClickType.valueOf(this.clktype_);
            return clickTypeValueOf == null ? ClickType.UNRECOGNIZED : clickTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getClktypeValue() {
            return this.clktype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public Companion getComp(int i10) {
            return this.comp_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getCompCount() {
            return this.comp_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Companion> getCompList() {
            return this.comp_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public CompanionOrBuilder getCompOrBuilder(int i10) {
            return this.comp_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<? extends CompanionOrBuilder> getCompOrBuilderList() {
            return this.comp_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public CompanionType getComptype(int i10) {
            return comptype_converter_.convert(this.comptype_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getComptypeCount() {
            return this.comptype_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<CompanionType> getComptypeList() {
            return new l0.h(this.comptype_, comptype_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getComptypeValue(int i10) {
            return this.comptype_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getComptypeValueList() {
            return this.comptype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public VideoCreativeType getCtype(int i10) {
            return ctype_converter_.convert(this.ctype_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getCtypeCount() {
            return this.ctype_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<VideoCreativeType> getCtypeList() {
            return new l0.h(this.ctype_, ctype_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getCtypeValue(int i10) {
            return this.ctype_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getCtypeValueList() {
            return this.ctype_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getDelay() {
            return this.delay_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public DeliveryMethod getDelivery(int i10) {
            return delivery_converter_.convert(this.delivery_.get(i10));
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getDeliveryCount() {
            return this.delivery_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<DeliveryMethod> getDeliveryList() {
            return new l0.h(this.delivery_, delivery_converter_);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getDeliveryValue(int i10) {
            return this.delivery_.get(i10).intValue();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Integer> getDeliveryValueList() {
            return this.delivery_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public i2 getExtOrBuilder() {
            return getExt();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public Any getExtProto(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public e getExtProtoOrBuilder(int i10) {
            return this.extProto_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public List<? extends e> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getH() {
            return this.h_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public LinearityMode getLinear() {
            LinearityMode linearityModeValueOf = LinearityMode.valueOf(this.linear_);
            return linearityModeValueOf == null ? LinearityMode.UNRECOGNIZED : linearityModeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getLinearValue() {
            return this.linear_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxbitr() {
            return this.maxbitr_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxdur() {
            return this.maxdur_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxext() {
            return this.maxext_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMaxseq() {
            return this.maxseq_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public String getMime(int i10) {
            return this.mime_.get(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public ByteString getMimeBytes(int i10) {
            return this.mime_.getByteString(i10);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMimeCount() {
            return this.mime_.size();
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMinbitr() {
            return this.minbitr_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getMindur() {
            return this.mindur_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public s1<VideoPlacement> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public PlaybackCessationMode getPlayend() {
            PlaybackCessationMode playbackCessationModeValueOf = PlaybackCessationMode.valueOf(this.playend_);
            return playbackCessationModeValueOf == null ? PlaybackCessationMode.UNRECOGNIZED : playbackCessationModeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPlayendValue() {
            return this.playend_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public PlaybackMethod getPlaymethod() {
            PlaybackMethod playbackMethodValueOf = PlaybackMethod.valueOf(this.playmethod_);
            return playbackMethodValueOf == null ? PlaybackMethod.UNRECOGNIZED : playbackMethodValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPlaymethodValue() {
            return this.playmethod_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public PlacementPosition getPos() {
            PlacementPosition placementPositionValueOf = PlacementPosition.valueOf(this.pos_);
            return placementPositionValueOf == null ? PlacementPosition.UNRECOGNIZED : placementPositionValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPosValue() {
            return this.pos_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public VideoPlacementType getPtype() {
            VideoPlacementType videoPlacementTypeValueOf = VideoPlacementType.valueOf(this.ptype_);
            return videoPlacementTypeValueOf == null ? VideoPlacementType.UNRECOGNIZED : videoPlacementTypeValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getPtypeValue() {
            return this.ptype_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = this.ptype_ != VideoPlacementType.VIDEO_PLACEMENT_TYPE_INVALID.getNumber() ? CodedOutputStream.l(1, this.ptype_) + 0 : 0;
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                iL += CodedOutputStream.l(2, this.pos_);
            }
            int i11 = this.delay_;
            if (i11 != 0) {
                iL += CodedOutputStream.x(3, i11);
            }
            boolean z10 = this.skip_;
            if (z10) {
                iL += CodedOutputStream.e(4, z10);
            }
            int i12 = this.skipmin_;
            if (i12 != 0) {
                iL += CodedOutputStream.Y(5, i12);
            }
            int i13 = this.skipafter_;
            if (i13 != 0) {
                iL += CodedOutputStream.Y(6, i13);
            }
            if (this.playmethod_ != PlaybackMethod.PLAYBACK_METHOD_INVALID.getNumber()) {
                iL += CodedOutputStream.l(7, this.playmethod_);
            }
            if (this.playend_ != PlaybackCessationMode.PLAYBACK_CESSATION_MODE_INVALID.getNumber()) {
                iL += CodedOutputStream.l(8, this.playend_);
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                iL += CodedOutputStream.l(9, this.clktype_);
            }
            int iComputeStringSizeNoTag = 0;
            for (int i14 = 0; i14 < this.mime_.size(); i14++) {
                iComputeStringSizeNoTag += j0.computeStringSizeNoTag(this.mime_.getRaw(i14));
            }
            int size = iL + iComputeStringSizeNoTag + (getMimeList().size() * 1);
            int iM = 0;
            for (int i15 = 0; i15 < this.api_.size(); i15++) {
                iM += CodedOutputStream.m(this.api_.get(i15).intValue());
            }
            int iZ = size + iM;
            if (!getApiList().isEmpty()) {
                iZ = iZ + 1 + CodedOutputStream.Z(iM);
            }
            this.apiMemoizedSerializedSize = iM;
            int iM2 = 0;
            for (int i16 = 0; i16 < this.ctype_.size(); i16++) {
                iM2 += CodedOutputStream.m(this.ctype_.get(i16).intValue());
            }
            int iY = iZ + iM2;
            if (!getCtypeList().isEmpty()) {
                iY = iY + 1 + CodedOutputStream.Z(iM2);
            }
            this.ctypeMemoizedSerializedSize = iM2;
            int i17 = this.w_;
            if (i17 != 0) {
                iY += CodedOutputStream.Y(13, i17);
            }
            int i18 = this.h_;
            if (i18 != 0) {
                iY += CodedOutputStream.Y(14, i18);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                iY += CodedOutputStream.l(15, this.unit_);
            }
            int i19 = this.mindur_;
            if (i19 != 0) {
                iY += CodedOutputStream.Y(16, i19);
            }
            int i20 = this.maxdur_;
            if (i20 != 0) {
                iY += CodedOutputStream.Y(17, i20);
            }
            int i21 = this.maxext_;
            if (i21 != 0) {
                iY += CodedOutputStream.x(18, i21);
            }
            int i22 = this.minbitr_;
            if (i22 != 0) {
                iY += CodedOutputStream.Y(19, i22);
            }
            int i23 = this.maxbitr_;
            if (i23 != 0) {
                iY += CodedOutputStream.Y(20, i23);
            }
            int iM3 = 0;
            for (int i24 = 0; i24 < this.delivery_.size(); i24++) {
                iM3 += CodedOutputStream.m(this.delivery_.get(i24).intValue());
            }
            int iG = iY + iM3;
            if (!getDeliveryList().isEmpty()) {
                iG = iG + 2 + CodedOutputStream.Z(iM3);
            }
            this.deliveryMemoizedSerializedSize = iM3;
            int i25 = this.maxseq_;
            if (i25 != 0) {
                iG += CodedOutputStream.Y(22, i25);
            }
            if (this.linear_ != LinearityMode.LINEARITY_MODE_INVALID.getNumber()) {
                iG += CodedOutputStream.l(23, this.linear_);
            }
            boolean z11 = this.boxing_;
            if (z11) {
                iG += CodedOutputStream.e(24, z11);
            }
            for (int i26 = 0; i26 < this.comp_.size(); i26++) {
                iG += CodedOutputStream.G(25, this.comp_.get(i26));
            }
            int iM4 = 0;
            for (int i27 = 0; i27 < this.comptype_.size(); i27++) {
                iM4 += CodedOutputStream.m(this.comptype_.get(i27).intValue());
            }
            int iG2 = iG + iM4;
            if (!getComptypeList().isEmpty()) {
                iG2 = iG2 + 2 + CodedOutputStream.Z(iM4);
            }
            this.comptypeMemoizedSerializedSize = iM4;
            for (int i28 = 0; i28 < this.extProto_.size(); i28++) {
                iG2 += CodedOutputStream.G(27, this.extProto_.get(i28));
            }
            if (this.ext_ != null) {
                iG2 += CodedOutputStream.G(28, getExt());
            }
            int serializedSize = iG2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public boolean getSkip() {
            return this.skip_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getSkipafter() {
            return this.skipafter_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getSkipmin() {
            return this.skipmin_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public SizeUnit getUnit() {
            SizeUnit sizeUnitValueOf = SizeUnit.valueOf(this.unit_);
            return sizeUnitValueOf == null ? SizeUnit.UNRECOGNIZED : sizeUnitValueOf;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getUnitValue() {
            return this.unit_;
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
        public final u2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public int getW() {
            return this.w_;
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public boolean hasExt() {
            return this.ext_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.ptype_) * 37) + 2) * 53) + this.pos_) * 37) + 3) * 53) + getDelay()) * 37) + 4) * 53) + l0.d(getSkip())) * 37) + 5) * 53) + getSkipmin()) * 37) + 6) * 53) + getSkipafter()) * 37) + 7) * 53) + this.playmethod_) * 37) + 8) * 53) + this.playend_) * 37) + 9) * 53) + this.clktype_;
            if (getMimeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + this.api_.hashCode();
            }
            if (getCtypeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + this.ctype_.hashCode();
            }
            int w10 = (((((((((((((((((((((((((((((((iHashCode * 37) + 13) * 53) + getW()) * 37) + 14) * 53) + getH()) * 37) + 15) * 53) + this.unit_) * 37) + 16) * 53) + getMindur()) * 37) + 17) * 53) + getMaxdur()) * 37) + 18) * 53) + getMaxext()) * 37) + 19) * 53) + getMinbitr()) * 37) + 20) * 53) + getMaxbitr();
            if (getDeliveryCount() > 0) {
                w10 = (((w10 * 37) + 21) * 53) + this.delivery_.hashCode();
            }
            int maxseq = (((((((((((w10 * 37) + 22) * 53) + getMaxseq()) * 37) + 23) * 53) + this.linear_) * 37) + 24) * 53) + l0.d(getBoxing());
            if (getCompCount() > 0) {
                maxseq = (((maxseq * 37) + 25) * 53) + getCompList().hashCode();
            }
            if (getComptypeCount() > 0) {
                maxseq = (((maxseq * 37) + 26) * 53) + this.comptype_.hashCode();
            }
            if (hasExt()) {
                maxseq = (((maxseq * 37) + 28) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                maxseq = (((maxseq * 37) + 27) * 53) + getExtProtoList().hashCode();
            }
            int iHashCode2 = (maxseq * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.j0
        protected j0.f internalGetFieldAccessorTable() {
            return b.X.d(VideoPlacement.class, Builder.class);
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
            return new VideoPlacement();
        }

        @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if (this.ptype_ != VideoPlacementType.VIDEO_PLACEMENT_TYPE_INVALID.getNumber()) {
                codedOutputStream.v0(1, this.ptype_);
            }
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                codedOutputStream.v0(2, this.pos_);
            }
            int i10 = this.delay_;
            if (i10 != 0) {
                codedOutputStream.H0(3, i10);
            }
            boolean z10 = this.skip_;
            if (z10) {
                codedOutputStream.n0(4, z10);
            }
            int i11 = this.skipmin_;
            if (i11 != 0) {
                codedOutputStream.c1(5, i11);
            }
            int i12 = this.skipafter_;
            if (i12 != 0) {
                codedOutputStream.c1(6, i12);
            }
            if (this.playmethod_ != PlaybackMethod.PLAYBACK_METHOD_INVALID.getNumber()) {
                codedOutputStream.v0(7, this.playmethod_);
            }
            if (this.playend_ != PlaybackCessationMode.PLAYBACK_CESSATION_MODE_INVALID.getNumber()) {
                codedOutputStream.v0(8, this.playend_);
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                codedOutputStream.v0(9, this.clktype_);
            }
            for (int i13 = 0; i13 < this.mime_.size(); i13++) {
                j0.writeString(codedOutputStream, 10, this.mime_.getRaw(i13));
            }
            if (getApiList().size() > 0) {
                codedOutputStream.d1(90);
                codedOutputStream.d1(this.apiMemoizedSerializedSize);
            }
            for (int i14 = 0; i14 < this.api_.size(); i14++) {
                codedOutputStream.w0(this.api_.get(i14).intValue());
            }
            if (getCtypeList().size() > 0) {
                codedOutputStream.d1(98);
                codedOutputStream.d1(this.ctypeMemoizedSerializedSize);
            }
            for (int i15 = 0; i15 < this.ctype_.size(); i15++) {
                codedOutputStream.w0(this.ctype_.get(i15).intValue());
            }
            int i16 = this.w_;
            if (i16 != 0) {
                codedOutputStream.c1(13, i16);
            }
            int i17 = this.h_;
            if (i17 != 0) {
                codedOutputStream.c1(14, i17);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                codedOutputStream.v0(15, this.unit_);
            }
            int i18 = this.mindur_;
            if (i18 != 0) {
                codedOutputStream.c1(16, i18);
            }
            int i19 = this.maxdur_;
            if (i19 != 0) {
                codedOutputStream.c1(17, i19);
            }
            int i20 = this.maxext_;
            if (i20 != 0) {
                codedOutputStream.H0(18, i20);
            }
            int i21 = this.minbitr_;
            if (i21 != 0) {
                codedOutputStream.c1(19, i21);
            }
            int i22 = this.maxbitr_;
            if (i22 != 0) {
                codedOutputStream.c1(20, i22);
            }
            if (getDeliveryList().size() > 0) {
                codedOutputStream.d1(170);
                codedOutputStream.d1(this.deliveryMemoizedSerializedSize);
            }
            for (int i23 = 0; i23 < this.delivery_.size(); i23++) {
                codedOutputStream.w0(this.delivery_.get(i23).intValue());
            }
            int i24 = this.maxseq_;
            if (i24 != 0) {
                codedOutputStream.c1(22, i24);
            }
            if (this.linear_ != LinearityMode.LINEARITY_MODE_INVALID.getNumber()) {
                codedOutputStream.v0(23, this.linear_);
            }
            boolean z11 = this.boxing_;
            if (z11) {
                codedOutputStream.n0(24, z11);
            }
            for (int i25 = 0; i25 < this.comp_.size(); i25++) {
                codedOutputStream.L0(25, this.comp_.get(i25));
            }
            if (getComptypeList().size() > 0) {
                codedOutputStream.d1(210);
                codedOutputStream.d1(this.comptypeMemoizedSerializedSize);
            }
            for (int i26 = 0; i26 < this.comptype_.size(); i26++) {
                codedOutputStream.w0(this.comptype_.get(i26).intValue());
            }
            for (int i27 = 0; i27 < this.extProto_.size(); i27++) {
                codedOutputStream.L0(27, this.extProto_.get(i27));
            }
            if (this.ext_ != null) {
                codedOutputStream.L0(28, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static Builder newBuilder(VideoPlacement videoPlacement) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoPlacement);
        }

        public static VideoPlacement parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, yVar);
        }

        @Override // com.explorestack.protobuf.adcom.Placement.VideoPlacementOrBuilder
        public w1 getMimeList() {
            return this.mime_;
        }

        private VideoPlacement(j0.b<?> bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VideoPlacement parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
            return (VideoPlacement) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static VideoPlacement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public VideoPlacement mo164getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static VideoPlacement parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, yVar);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private VideoPlacement() {
            this.memoizedIsInitialized = (byte) -1;
            this.ptype_ = 0;
            this.pos_ = 0;
            this.playmethod_ = 0;
            this.playend_ = 0;
            this.clktype_ = 0;
            this.mime_ = q0.f10776d;
            this.api_ = Collections.emptyList();
            this.ctype_ = Collections.emptyList();
            this.unit_ = 0;
            this.delivery_ = Collections.emptyList();
            this.linear_ = 0;
            this.comp_ = Collections.emptyList();
            this.comptype_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
        }

        public static VideoPlacement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.explorestack.protobuf.j0
        public Builder newBuilderForType(j0.c cVar) {
            return new Builder(cVar);
        }

        public static VideoPlacement parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, yVar);
        }

        public static VideoPlacement parseFrom(InputStream inputStream) throws IOException {
            return (VideoPlacement) j0.parseWithIOException(PARSER, inputStream);
        }

        public static VideoPlacement parseFrom(InputStream inputStream, y yVar) throws IOException {
            return (VideoPlacement) j0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static VideoPlacement parseFrom(n nVar) throws IOException {
            return (VideoPlacement) j0.parseWithIOException(PARSER, nVar);
        }

        public static VideoPlacement parseFrom(n nVar, y yVar) throws IOException {
            return (VideoPlacement) j0.parseWithIOException(PARSER, nVar, yVar);
        }

        private VideoPlacement(n nVar, y yVar) throws InvalidProtocolBufferException {
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
                            case 8:
                                this.ptype_ = nVar.t();
                                continue;
                            case 16:
                                this.pos_ = nVar.t();
                                continue;
                            case 24:
                                this.delay_ = nVar.y();
                                continue;
                            case 32:
                                this.skip_ = nVar.q();
                                continue;
                            case 40:
                                this.skipmin_ = nVar.L();
                                continue;
                            case 48:
                                this.skipafter_ = nVar.L();
                                continue;
                            case 56:
                                this.playmethod_ = nVar.t();
                                continue;
                            case 64:
                                this.playend_ = nVar.t();
                                continue;
                            case 72:
                                this.clktype_ = nVar.t();
                                continue;
                            case 82:
                                String strJ = nVar.J();
                                if ((i10 & 1) == 0) {
                                    this.mime_ = new q0();
                                    i10 |= 1;
                                }
                                this.mime_.add(strJ);
                                continue;
                            case 88:
                                int iT = nVar.t();
                                if ((i10 & 2) == 0) {
                                    this.api_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.api_.add(Integer.valueOf(iT));
                                continue;
                            case 90:
                                int iP = nVar.p(nVar.C());
                                while (nVar.d() > 0) {
                                    int iT2 = nVar.t();
                                    if ((i10 & 2) == 0) {
                                        this.api_ = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.api_.add(Integer.valueOf(iT2));
                                }
                                nVar.o(iP);
                                continue;
                            case 96:
                                int iT3 = nVar.t();
                                if ((i10 & 4) == 0) {
                                    this.ctype_ = new ArrayList();
                                    i10 |= 4;
                                }
                                this.ctype_.add(Integer.valueOf(iT3));
                                continue;
                            case 98:
                                int iP2 = nVar.p(nVar.C());
                                while (nVar.d() > 0) {
                                    int iT4 = nVar.t();
                                    if ((i10 & 4) == 0) {
                                        this.ctype_ = new ArrayList();
                                        i10 |= 4;
                                    }
                                    this.ctype_.add(Integer.valueOf(iT4));
                                }
                                nVar.o(iP2);
                                continue;
                            case 104:
                                this.w_ = nVar.L();
                                continue;
                            case 112:
                                this.h_ = nVar.L();
                                continue;
                            case 120:
                                this.unit_ = nVar.t();
                                continue;
                            case 128:
                                this.mindur_ = nVar.L();
                                continue;
                            case PRIVACY_URL_ERROR_VALUE:
                                this.maxdur_ = nVar.L();
                                continue;
                            case 144:
                                this.maxext_ = nVar.y();
                                continue;
                            case 152:
                                this.minbitr_ = nVar.L();
                                continue;
                            case 160:
                                this.maxbitr_ = nVar.L();
                                continue;
                            case 168:
                                int iT5 = nVar.t();
                                if ((i10 & 8) == 0) {
                                    this.delivery_ = new ArrayList();
                                    i10 |= 8;
                                }
                                this.delivery_.add(Integer.valueOf(iT5));
                                continue;
                            case 170:
                                int iP3 = nVar.p(nVar.C());
                                while (nVar.d() > 0) {
                                    int iT6 = nVar.t();
                                    if ((i10 & 8) == 0) {
                                        this.delivery_ = new ArrayList();
                                        i10 |= 8;
                                    }
                                    this.delivery_.add(Integer.valueOf(iT6));
                                }
                                nVar.o(iP3);
                                continue;
                            case 176:
                                this.maxseq_ = nVar.L();
                                continue;
                            case 184:
                                this.linear_ = nVar.t();
                                continue;
                            case 192:
                                this.boxing_ = nVar.q();
                                continue;
                            case 202:
                                if ((i10 & 16) == 0) {
                                    this.comp_ = new ArrayList();
                                    i10 |= 16;
                                }
                                this.comp_.add((Companion) nVar.A(Companion.parser(), yVar));
                                continue;
                            case 208:
                                int iT7 = nVar.t();
                                if ((i10 & 32) == 0) {
                                    this.comptype_ = new ArrayList();
                                    i10 |= 32;
                                }
                                this.comptype_.add(Integer.valueOf(iT7));
                                continue;
                            case 210:
                                int iP4 = nVar.p(nVar.C());
                                while (nVar.d() > 0) {
                                    int iT8 = nVar.t();
                                    if ((i10 & 32) == 0) {
                                        this.comptype_ = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.comptype_.add(Integer.valueOf(iT8));
                                }
                                nVar.o(iP4);
                                continue;
                            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                                if ((i10 & 64) == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 |= 64;
                                }
                                this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                continue;
                            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                                Struct struct = this.ext_;
                                Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                this.ext_ = struct2;
                                if (builder != null) {
                                    builder.mergeFrom(struct2);
                                    this.ext_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
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
                    if ((i10 & 1) != 0) {
                        this.mime_ = this.mime_.getUnmodifiableView();
                    }
                    if ((i10 & 2) != 0) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if ((i10 & 4) != 0) {
                        this.ctype_ = Collections.unmodifiableList(this.ctype_);
                    }
                    if ((i10 & 8) != 0) {
                        this.delivery_ = Collections.unmodifiableList(this.delivery_);
                    }
                    if ((i10 & 16) != 0) {
                        this.comp_ = Collections.unmodifiableList(this.comp_);
                    }
                    if ((i10 & 32) != 0) {
                        this.comptype_ = Collections.unmodifiableList(this.comptype_);
                    }
                    if ((i10 & 64) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = bVarG.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i10 & 1) != 0) {
                this.mime_ = this.mime_.getUnmodifiableView();
            }
            if ((i10 & 2) != 0) {
                this.api_ = Collections.unmodifiableList(this.api_);
            }
            if ((i10 & 4) != 0) {
                this.ctype_ = Collections.unmodifiableList(this.ctype_);
            }
            if ((i10 & 8) != 0) {
                this.delivery_ = Collections.unmodifiableList(this.delivery_);
            }
            if ((i10 & 16) != 0) {
                this.comp_ = Collections.unmodifiableList(this.comp_);
            }
            if ((i10 & 32) != 0) {
                this.comptype_ = Collections.unmodifiableList(this.comptype_);
            }
            if ((i10 & 64) != 0) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = bVarG.build();
            makeExtensionsImmutable();
        }
    }

    public interface VideoPlacementOrBuilder extends MessageOrBuilder {
        ApiFramework getApi(int i10);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i10);

        List<Integer> getApiValueList();

        boolean getBoxing();

        ClickType getClktype();

        int getClktypeValue();

        VideoPlacement.Companion getComp(int i10);

        int getCompCount();

        List<VideoPlacement.Companion> getCompList();

        VideoPlacement.CompanionOrBuilder getCompOrBuilder(int i10);

        List<? extends VideoPlacement.CompanionOrBuilder> getCompOrBuilderList();

        CompanionType getComptype(int i10);

        int getComptypeCount();

        List<CompanionType> getComptypeList();

        int getComptypeValue(int i10);

        List<Integer> getComptypeValueList();

        VideoCreativeType getCtype(int i10);

        int getCtypeCount();

        List<VideoCreativeType> getCtypeList();

        int getCtypeValue(int i10);

        List<Integer> getCtypeValueList();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        /* synthetic */ MessageLite mo164getDefaultInstanceForType();

        int getDelay();

        DeliveryMethod getDelivery(int i10);

        int getDeliveryCount();

        List<DeliveryMethod> getDeliveryList();

        int getDeliveryValue(int i10);

        List<Integer> getDeliveryValueList();

        Struct getExt();

        i2 getExtOrBuilder();

        Any getExtProto(int i10);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        e getExtProtoOrBuilder(int i10);

        List<? extends e> getExtProtoOrBuilderList();

        int getH();

        LinearityMode getLinear();

        int getLinearValue();

        int getMaxbitr();

        int getMaxdur();

        int getMaxext();

        int getMaxseq();

        String getMime(int i10);

        ByteString getMimeBytes(int i10);

        int getMimeCount();

        List<String> getMimeList();

        int getMinbitr();

        int getMindur();

        PlaybackCessationMode getPlayend();

        int getPlayendValue();

        PlaybackMethod getPlaymethod();

        int getPlaymethodValue();

        PlacementPosition getPos();

        int getPosValue();

        VideoPlacementType getPtype();

        int getPtypeValue();

        boolean getSkip();

        int getSkipafter();

        int getSkipmin();

        SizeUnit getUnit();

        int getUnitValue();

        int getW();

        boolean hasExt();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static Placement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return b.E;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Placement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Placement) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<Placement> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return super.equals(obj);
        }
        Placement placement = (Placement) obj;
        if (!getTagid().equals(placement.getTagid()) || getSsai() != placement.getSsai() || !getSdk().equals(placement.getSdk()) || !getSdkver().equals(placement.getSdkver()) || getReward() != placement.getReward() || !m173getBcatList().equals(placement.m173getBcatList()) || this.cattax_ != placement.cattax_ || !m171getBadvList().equals(placement.m171getBadvList()) || !m172getBappList().equals(placement.m172getBappList()) || !this.battr_.equals(placement.battr_) || !m174getWlangList().equals(placement.m174getWlangList()) || getSecure() != placement.getSecure() || getAdmx() != placement.getAdmx() || getCurlx() != placement.getCurlx() || hasDisplay() != placement.hasDisplay()) {
            return false;
        }
        if ((hasDisplay() && !getDisplay().equals(placement.getDisplay())) || hasVideo() != placement.hasVideo()) {
            return false;
        }
        if ((!hasVideo() || getVideo().equals(placement.getVideo())) && hasExt() == placement.hasExt()) {
            return (!hasExt() || getExt().equals(placement.getExt())) && getExtProtoList().equals(placement.getExtProtoList()) && this.unknownFields.equals(placement.unknownFields);
        }
        return false;
    }

    public boolean getAdmx() {
        return this.admx_;
    }

    public String getBadv(int i10) {
        return this.badv_.get(i10);
    }

    public ByteString getBadvBytes(int i10) {
        return this.badv_.getByteString(i10);
    }

    public int getBadvCount() {
        return this.badv_.size();
    }

    public String getBapp(int i10) {
        return this.bapp_.get(i10);
    }

    public ByteString getBappBytes(int i10) {
        return this.bapp_.getByteString(i10);
    }

    public int getBappCount() {
        return this.bapp_.size();
    }

    public CreativeAttribute getBattr(int i10) {
        return battr_converter_.convert(this.battr_.get(i10));
    }

    public int getBattrCount() {
        return this.battr_.size();
    }

    public List<CreativeAttribute> getBattrList() {
        return new l0.h(this.battr_, battr_converter_);
    }

    public int getBattrValue(int i10) {
        return this.battr_.get(i10).intValue();
    }

    public List<Integer> getBattrValueList() {
        return this.battr_;
    }

    public String getBcat(int i10) {
        return this.bcat_.get(i10);
    }

    public ByteString getBcatBytes(int i10) {
        return this.bcat_.getByteString(i10);
    }

    public int getBcatCount() {
        return this.bcat_.size();
    }

    public CategoryTaxonomy getCattax() {
        CategoryTaxonomy categoryTaxonomyValueOf = CategoryTaxonomy.valueOf(this.cattax_);
        return categoryTaxonomyValueOf == null ? CategoryTaxonomy.UNRECOGNIZED : categoryTaxonomyValueOf;
    }

    public int getCattaxValue() {
        return this.cattax_;
    }

    public boolean getCurlx() {
        return this.curlx_;
    }

    public DisplayPlacement getDisplay() {
        DisplayPlacement displayPlacement = this.display_;
        return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
    }

    public DisplayPlacementOrBuilder getDisplayOrBuilder() {
        return getDisplay();
    }

    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public i2 getExtOrBuilder() {
        return getExt();
    }

    public Any getExtProto(int i10) {
        return this.extProto_.get(i10);
    }

    public int getExtProtoCount() {
        return this.extProto_.size();
    }

    public List<Any> getExtProtoList() {
        return this.extProto_;
    }

    public e getExtProtoOrBuilder(int i10) {
        return this.extProto_.get(i10);
    }

    public List<? extends e> getExtProtoOrBuilderList() {
        return this.extProto_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<Placement> getParserForType() {
        return PARSER;
    }

    public boolean getReward() {
        return this.reward_;
    }

    public String getSdk() {
        Object obj = this.sdk_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdk_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSdkBytes() {
        Object obj = this.sdk_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdk_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public String getSdkver() {
        Object obj = this.sdkver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdkver_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSdkverBytes() {
        Object obj = this.sdkver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdkver_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    public boolean getSecure() {
        return this.secure_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getTagidBytes().isEmpty() ? j0.computeStringSize(1, this.tagid_) + 0 : 0;
        int i11 = this.ssai_;
        if (i11 != 0) {
            iComputeStringSize += CodedOutputStream.Y(2, i11);
        }
        if (!getSdkBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(3, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(4, this.sdkver_);
        }
        boolean z10 = this.reward_;
        if (z10) {
            iComputeStringSize += CodedOutputStream.e(5, z10);
        }
        int iComputeStringSizeNoTag = 0;
        for (int i12 = 0; i12 < this.bcat_.size(); i12++) {
            iComputeStringSizeNoTag += j0.computeStringSizeNoTag(this.bcat_.getRaw(i12));
        }
        int size = iComputeStringSize + iComputeStringSizeNoTag + (m173getBcatList().size() * 1);
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            size += CodedOutputStream.l(7, this.cattax_);
        }
        int iComputeStringSizeNoTag2 = 0;
        for (int i13 = 0; i13 < this.badv_.size(); i13++) {
            iComputeStringSizeNoTag2 += j0.computeStringSizeNoTag(this.badv_.getRaw(i13));
        }
        int size2 = size + iComputeStringSizeNoTag2 + (m171getBadvList().size() * 1);
        int iComputeStringSizeNoTag3 = 0;
        for (int i14 = 0; i14 < this.bapp_.size(); i14++) {
            iComputeStringSizeNoTag3 += j0.computeStringSizeNoTag(this.bapp_.getRaw(i14));
        }
        int size3 = size2 + iComputeStringSizeNoTag3 + (m172getBappList().size() * 1);
        int iM = 0;
        for (int i15 = 0; i15 < this.battr_.size(); i15++) {
            iM += CodedOutputStream.m(this.battr_.get(i15).intValue());
        }
        int iZ = size3 + iM;
        if (!getBattrList().isEmpty()) {
            iZ = iZ + 1 + CodedOutputStream.Z(iM);
        }
        this.battrMemoizedSerializedSize = iM;
        int iComputeStringSizeNoTag4 = 0;
        for (int i16 = 0; i16 < this.wlang_.size(); i16++) {
            iComputeStringSizeNoTag4 += j0.computeStringSizeNoTag(this.wlang_.getRaw(i16));
        }
        int size4 = iZ + iComputeStringSizeNoTag4 + (m174getWlangList().size() * 1);
        boolean z11 = this.secure_;
        if (z11) {
            size4 += CodedOutputStream.e(13, z11);
        }
        boolean z12 = this.admx_;
        if (z12) {
            size4 += CodedOutputStream.e(14, z12);
        }
        boolean z13 = this.curlx_;
        if (z13) {
            size4 += CodedOutputStream.e(15, z13);
        }
        if (this.display_ != null) {
            size4 += CodedOutputStream.G(16, getDisplay());
        }
        if (this.video_ != null) {
            size4 += CodedOutputStream.G(17, getVideo());
        }
        for (int i17 = 0; i17 < this.extProto_.size(); i17++) {
            size4 += CodedOutputStream.G(19, this.extProto_.get(i17));
        }
        if (this.ext_ != null) {
            size4 += CodedOutputStream.G(20, getExt());
        }
        int serializedSize = size4 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public int getSsai() {
        return this.ssai_;
    }

    public String getTagid() {
        Object obj = this.tagid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.tagid_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getTagidBytes() {
        Object obj = this.tagid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.tagid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    public VideoPlacement getVideo() {
        VideoPlacement videoPlacement = this.video_;
        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
    }

    public VideoPlacementOrBuilder getVideoOrBuilder() {
        return getVideo();
    }

    public String getWlang(int i10) {
        return this.wlang_.get(i10);
    }

    public ByteString getWlangBytes(int i10) {
        return this.wlang_.getByteString(i10);
    }

    public int getWlangCount() {
        return this.wlang_.size();
    }

    public boolean hasDisplay() {
        return this.display_ != null;
    }

    public boolean hasExt() {
        return this.ext_ != null;
    }

    public boolean hasVideo() {
        return this.video_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTagid().hashCode()) * 37) + 2) * 53) + getSsai()) * 37) + 3) * 53) + getSdk().hashCode()) * 37) + 4) * 53) + getSdkver().hashCode()) * 37) + 5) * 53) + l0.d(getReward());
        if (getBcatCount() > 0) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + m173getBcatList().hashCode();
        }
        int iHashCode2 = (((iHashCode * 37) + 7) * 53) + this.cattax_;
        if (getBadvCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 9) * 53) + m171getBadvList().hashCode();
        }
        if (getBappCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 10) * 53) + m172getBappList().hashCode();
        }
        if (getBattrCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 11) * 53) + this.battr_.hashCode();
        }
        if (getWlangCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 12) * 53) + m174getWlangList().hashCode();
        }
        int iD = (((((((((((iHashCode2 * 37) + 13) * 53) + l0.d(getSecure())) * 37) + 14) * 53) + l0.d(getAdmx())) * 37) + 15) * 53) + l0.d(getCurlx());
        if (hasDisplay()) {
            iD = (((iD * 37) + 16) * 53) + getDisplay().hashCode();
        }
        if (hasVideo()) {
            iD = (((iD * 37) + 17) * 53) + getVideo().hashCode();
        }
        if (hasExt()) {
            iD = (((iD * 37) + 20) * 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            iD = (((iD * 37) + 19) * 53) + getExtProtoList().hashCode();
        }
        int iHashCode3 = (iD * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return b.F.d(Placement.class, Builder.class);
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
        return new Placement();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if (!getTagidBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.tagid_);
        }
        int i10 = this.ssai_;
        if (i10 != 0) {
            codedOutputStream.c1(2, i10);
        }
        if (!getSdkBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 3, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 4, this.sdkver_);
        }
        boolean z10 = this.reward_;
        if (z10) {
            codedOutputStream.n0(5, z10);
        }
        for (int i11 = 0; i11 < this.bcat_.size(); i11++) {
            j0.writeString(codedOutputStream, 6, this.bcat_.getRaw(i11));
        }
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            codedOutputStream.v0(7, this.cattax_);
        }
        for (int i12 = 0; i12 < this.badv_.size(); i12++) {
            j0.writeString(codedOutputStream, 9, this.badv_.getRaw(i12));
        }
        for (int i13 = 0; i13 < this.bapp_.size(); i13++) {
            j0.writeString(codedOutputStream, 10, this.bapp_.getRaw(i13));
        }
        if (getBattrList().size() > 0) {
            codedOutputStream.d1(90);
            codedOutputStream.d1(this.battrMemoizedSerializedSize);
        }
        for (int i14 = 0; i14 < this.battr_.size(); i14++) {
            codedOutputStream.w0(this.battr_.get(i14).intValue());
        }
        for (int i15 = 0; i15 < this.wlang_.size(); i15++) {
            j0.writeString(codedOutputStream, 12, this.wlang_.getRaw(i15));
        }
        boolean z11 = this.secure_;
        if (z11) {
            codedOutputStream.n0(13, z11);
        }
        boolean z12 = this.admx_;
        if (z12) {
            codedOutputStream.n0(14, z12);
        }
        boolean z13 = this.curlx_;
        if (z13) {
            codedOutputStream.n0(15, z13);
        }
        if (this.display_ != null) {
            codedOutputStream.L0(16, getDisplay());
        }
        if (this.video_ != null) {
            codedOutputStream.L0(17, getVideo());
        }
        for (int i16 = 0; i16 < this.extProto_.size(); i16++) {
            codedOutputStream.L0(19, this.extProto_.get(i16));
        }
        if (this.ext_ != null) {
            codedOutputStream.L0(20, getExt());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Builder newBuilder(Placement placement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(placement);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    /* JADX INFO: renamed from: getBadvList, reason: merged with bridge method [inline-methods] */
    public w1 m171getBadvList() {
        return this.badv_;
    }

    /* JADX INFO: renamed from: getBappList, reason: merged with bridge method [inline-methods] */
    public w1 m172getBappList() {
        return this.bapp_;
    }

    /* JADX INFO: renamed from: getBcatList, reason: merged with bridge method [inline-methods] */
    public w1 m173getBcatList() {
        return this.bcat_;
    }

    /* JADX INFO: renamed from: getWlangList, reason: merged with bridge method [inline-methods] */
    public w1 m174getWlangList() {
        return this.wlang_;
    }

    private Placement(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Placement parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (Placement) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static Placement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public Placement mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Placement parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Placement() {
        this.memoizedIsInitialized = (byte) -1;
        this.tagid_ = "";
        this.sdk_ = "";
        this.sdkver_ = "";
        r0 r0Var = q0.f10776d;
        this.bcat_ = r0Var;
        this.cattax_ = 0;
        this.badv_ = r0Var;
        this.bapp_ = r0Var;
        this.battr_ = Collections.emptyList();
        this.wlang_ = r0Var;
        this.extProto_ = Collections.emptyList();
    }

    public static Placement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static Placement parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static Placement parseFrom(InputStream inputStream) throws IOException {
        return (Placement) j0.parseWithIOException(PARSER, inputStream);
    }

    public static Placement parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (Placement) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    public static Placement parseFrom(n nVar) throws IOException {
        return (Placement) j0.parseWithIOException(PARSER, nVar);
    }

    public static Placement parseFrom(n nVar, y yVar) throws IOException {
        return (Placement) j0.parseWithIOException(PARSER, nVar, yVar);
    }

    private Placement(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = nVar.K();
                        switch (iK) {
                            case 0:
                                break;
                            case 10:
                                this.tagid_ = nVar.J();
                                continue;
                            case 16:
                                this.ssai_ = nVar.L();
                                continue;
                            case 26:
                                this.sdk_ = nVar.J();
                                continue;
                            case 34:
                                this.sdkver_ = nVar.J();
                                continue;
                            case 40:
                                this.reward_ = nVar.q();
                                continue;
                            case 50:
                                String strJ = nVar.J();
                                int i11 = (i10 == true ? 1 : 0) & 1;
                                i10 = i10;
                                if (i11 == 0) {
                                    this.bcat_ = new q0();
                                    i10 = (i10 == true ? 1 : 0) | 1;
                                }
                                this.bcat_.add(strJ);
                                continue;
                            case 56:
                                this.cattax_ = nVar.t();
                                continue;
                            case 74:
                                String strJ2 = nVar.J();
                                int i12 = (i10 == true ? 1 : 0) & 2;
                                i10 = i10;
                                if (i12 == 0) {
                                    this.badv_ = new q0();
                                    i10 = (i10 == true ? 1 : 0) | 2;
                                }
                                this.badv_.add(strJ2);
                                continue;
                            case 82:
                                String strJ3 = nVar.J();
                                int i13 = (i10 == true ? 1 : 0) & 4;
                                i10 = i10;
                                if (i13 == 0) {
                                    this.bapp_ = new q0();
                                    i10 = (i10 == true ? 1 : 0) | 4;
                                }
                                this.bapp_.add(strJ3);
                                continue;
                            case 88:
                                int iT = nVar.t();
                                int i14 = (i10 == true ? 1 : 0) & 8;
                                i10 = i10;
                                if (i14 == 0) {
                                    this.battr_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8;
                                }
                                this.battr_.add(Integer.valueOf(iT));
                                continue;
                            case 90:
                                int iP = nVar.p(nVar.C());
                                i10 = i10;
                                while (nVar.d() > 0) {
                                    int iT2 = nVar.t();
                                    if (((i10 == true ? 1 : 0) & 8) == 0) {
                                        this.battr_ = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 8;
                                    }
                                    this.battr_.add(Integer.valueOf(iT2));
                                    i10 = i10;
                                }
                                nVar.o(iP);
                                continue;
                            case 98:
                                String strJ4 = nVar.J();
                                int i15 = (i10 == true ? 1 : 0) & 16;
                                i10 = i10;
                                if (i15 == 0) {
                                    this.wlang_ = new q0();
                                    i10 = (i10 == true ? 1 : 0) | 16;
                                }
                                this.wlang_.add(strJ4);
                                continue;
                            case 104:
                                this.secure_ = nVar.q();
                                continue;
                            case 112:
                                this.admx_ = nVar.q();
                                continue;
                            case 120:
                                this.curlx_ = nVar.q();
                                continue;
                            case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                                DisplayPlacement displayPlacement = this.display_;
                                DisplayPlacement.Builder builder = displayPlacement != null ? displayPlacement.toBuilder() : null;
                                DisplayPlacement displayPlacement2 = (DisplayPlacement) nVar.A(DisplayPlacement.parser(), yVar);
                                this.display_ = displayPlacement2;
                                if (builder != null) {
                                    builder.mergeFrom(displayPlacement2);
                                    this.display_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case CONFIG_REFRESH_FAILED_VALUE:
                                VideoPlacement videoPlacement = this.video_;
                                VideoPlacement.Builder builder2 = videoPlacement != null ? videoPlacement.toBuilder() : null;
                                VideoPlacement videoPlacement2 = (VideoPlacement) nVar.A(VideoPlacement.parser(), yVar);
                                this.video_ = videoPlacement2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(videoPlacement2);
                                    this.video_ = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 154:
                                int i16 = (i10 == true ? 1 : 0) & 32;
                                i10 = i10;
                                if (i16 == 0) {
                                    this.extProto_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 32;
                                }
                                this.extProto_.add((Any) nVar.A(Any.parser(), yVar));
                                continue;
                            case 162:
                                Struct struct = this.ext_;
                                Struct.Builder builder3 = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) nVar.A(Struct.parser(), yVar);
                                this.ext_ = struct2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(struct2);
                                    this.ext_ = builder3.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    break;
                                }
                                break;
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if (((i10 == true ? 1 : 0) & 1) != 0) {
                    this.bcat_ = this.bcat_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 2) != 0) {
                    this.badv_ = this.badv_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 4) != 0) {
                    this.bapp_ = this.bapp_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 8) != 0) {
                    this.battr_ = Collections.unmodifiableList(this.battr_);
                }
                if (((i10 == true ? 1 : 0) & 16) != 0) {
                    this.wlang_ = this.wlang_.getUnmodifiableView();
                }
                if (((i10 == true ? 1 : 0) & 32) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if (((i10 == true ? 1 : 0) & 1) != 0) {
            this.bcat_ = this.bcat_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 2) != 0) {
            this.badv_ = this.badv_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 4) != 0) {
            this.bapp_ = this.bapp_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 8) != 0) {
            this.battr_ = Collections.unmodifiableList(this.battr_);
        }
        if (((i10 == true ? 1 : 0) & 16) != 0) {
            this.wlang_ = this.wlang_.getUnmodifiableView();
        }
        if (((i10 == true ? 1 : 0) & 32) != 0) {
            this.extProto_ = Collections.unmodifiableList(this.extProto_);
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }
}
