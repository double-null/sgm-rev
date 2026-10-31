package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.a;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.c;
import com.explorestack.protobuf.adcom.d;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.l0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.openrtb.Request;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class AuctionContext extends j0 implements AuctionContextOrBuilder {
    public static final int AT_FIELD_NUMBER = 4;
    public static final int CONTEXT_FIELD_NUMBER = 8;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int ITEM_FIELD_NUMBER = 6;
    public static final int PLACEMENT_FIELD_NUMBER = 7;
    public static final int PLACEMENT_TAG_FIELD_NUMBER = 5;
    public static final int TEST_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private int at_;
    private Context context_;
    private volatile Object id_;
    private Request.Item item_;
    private byte memoizedIsInitialized;
    private int placementTag_;
    private Placement placement_;
    private boolean test_;
    private volatile Object timestamp_;
    private static final AuctionContext DEFAULT_INSTANCE = new AuctionContext();
    private static final s1<AuctionContext> PARSER = new b<AuctionContext>() { // from class: io.bidmachine.protobuf.analytics.AuctionContext.1
        @Override // com.explorestack.protobuf.s1
        public AuctionContext parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new AuctionContext(nVar, yVar);
        }
    };

    public static AuctionContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AuctionContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuctionContext) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AuctionContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<AuctionContext> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuctionContext)) {
            return super.equals(obj);
        }
        AuctionContext auctionContext = (AuctionContext) obj;
        if (!getTimestamp().equals(auctionContext.getTimestamp()) || !getId().equals(auctionContext.getId()) || getTest() != auctionContext.getTest() || getAt() != auctionContext.getAt() || this.placementTag_ != auctionContext.placementTag_ || hasItem() != auctionContext.hasItem()) {
            return false;
        }
        if ((hasItem() && !getItem().equals(auctionContext.getItem())) || hasPlacement() != auctionContext.hasPlacement()) {
            return false;
        }
        if ((!hasPlacement() || getPlacement().equals(auctionContext.getPlacement())) && hasContext() == auctionContext.hasContext()) {
            return (!hasContext() || getContext().equals(auctionContext.getContext())) && this.unknownFields.equals(auctionContext.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public int getAt() {
        return this.at_;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public c getContextOrBuilder() {
        return getContext();
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public String getId() {
        Object obj = this.id_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.id_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public ByteString getIdBytes() {
        Object obj = this.id_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.id_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public Request.Item getItem() {
        Request.Item item = this.item_;
        return item == null ? Request.Item.getDefaultInstance() : item;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public Request.ItemOrBuilder getItemOrBuilder() {
        return getItem();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<AuctionContext> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public Placement getPlacement() {
        Placement placement = this.placement_;
        return placement == null ? Placement.getDefaultInstance() : placement;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public d getPlacementOrBuilder() {
        return getPlacement();
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public PlacementTag getPlacementTag() {
        PlacementTag placementTagValueOf = PlacementTag.valueOf(this.placementTag_);
        return placementTagValueOf == null ? PlacementTag.UNRECOGNIZED : placementTagValueOf;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public int getPlacementTagValue() {
        return this.placementTag_;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = getTimestampBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.timestamp_);
        if (!getIdBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(2, this.id_);
        }
        boolean z10 = this.test_;
        if (z10) {
            iComputeStringSize += CodedOutputStream.e(3, z10);
        }
        int i11 = this.at_;
        if (i11 != 0) {
            iComputeStringSize += CodedOutputStream.Y(4, i11);
        }
        if (this.placementTag_ != PlacementTag.PLACEMENT_TAG_INVALID.getNumber()) {
            iComputeStringSize += CodedOutputStream.l(5, this.placementTag_);
        }
        if (this.item_ != null) {
            iComputeStringSize += CodedOutputStream.G(6, getItem());
        }
        if (this.placement_ != null) {
            iComputeStringSize += CodedOutputStream.G(7, getPlacement());
        }
        if (this.context_ != null) {
            iComputeStringSize += CodedOutputStream.G(8, getContext());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public boolean getTest() {
        return this.test_;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public String getTimestamp() {
        Object obj = this.timestamp_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.timestamp_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public ByteString getTimestampBytes() {
        Object obj = this.timestamp_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.timestamp_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageOrBuilder
    public final u2 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public boolean hasContext() {
        return this.context_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public boolean hasItem() {
        return this.item_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
    public boolean hasPlacement() {
        return this.placement_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTimestamp().hashCode()) * 37) + 2) * 53) + getId().hashCode()) * 37) + 3) * 53) + l0.d(getTest())) * 37) + 4) * 53) + getAt()) * 37) + 5) * 53) + this.placementTag_;
        if (hasItem()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getItem().hashCode();
        }
        if (hasPlacement()) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getPlacement().hashCode();
        }
        if (hasContext()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + getContext().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_fieldAccessorTable.d(AuctionContext.class, Builder.class);
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
        return new AuctionContext();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getTimestampBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.timestamp_);
        }
        if (!getIdBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 2, this.id_);
        }
        boolean z10 = this.test_;
        if (z10) {
            codedOutputStream.n0(3, z10);
        }
        int i10 = this.at_;
        if (i10 != 0) {
            codedOutputStream.c1(4, i10);
        }
        if (this.placementTag_ != PlacementTag.PLACEMENT_TAG_INVALID.getNumber()) {
            codedOutputStream.v0(5, this.placementTag_);
        }
        if (this.item_ != null) {
            codedOutputStream.L0(6, getItem());
        }
        if (this.placement_ != null) {
            codedOutputStream.L0(7, getPlacement());
        }
        if (this.context_ != null) {
            codedOutputStream.L0(8, getContext());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements AuctionContextOrBuilder {
        private int at_;
        private e2<Context, Context.Builder, c> contextBuilder_;
        private Context context_;
        private Object id_;
        private e2<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> itemBuilder_;
        private Request.Item item_;
        private e2<Placement, Placement.Builder, d> placementBuilder_;
        private int placementTag_;
        private Placement placement_;
        private boolean test_;
        private Object timestamp_;

        private e2<Context, Context.Builder, c> getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new e2<>(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_descriptor;
        }

        private e2<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
                this.itemBuilder_ = new e2<>(getItem(), getParentForChildren(), isClean());
                this.item_ = null;
            }
            return this.itemBuilder_;
        }

        private e2<Placement, Placement.Builder, d> getPlacementFieldBuilder() {
            if (this.placementBuilder_ == null) {
                this.placementBuilder_ = new e2<>(getPlacement(), getParentForChildren(), isClean());
                this.placement_ = null;
            }
            return this.placementBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearAt() {
            this.at_ = 0;
            onChanged();
            return this;
        }

        public Builder clearContext() {
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                onChanged();
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            return this;
        }

        public Builder clearId() {
            this.id_ = AuctionContext.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder clearItem() {
            if (this.itemBuilder_ == null) {
                this.item_ = null;
                onChanged();
            } else {
                this.item_ = null;
                this.itemBuilder_ = null;
            }
            return this;
        }

        public Builder clearPlacement() {
            if (this.placementBuilder_ == null) {
                this.placement_ = null;
                onChanged();
            } else {
                this.placement_ = null;
                this.placementBuilder_ = null;
            }
            return this;
        }

        public Builder clearPlacementTag() {
            this.placementTag_ = 0;
            onChanged();
            return this;
        }

        public Builder clearTest() {
            this.test_ = false;
            onChanged();
            return this;
        }

        public Builder clearTimestamp() {
            this.timestamp_ = AuctionContext.getDefaultInstance().getTimestamp();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public int getAt() {
            return this.at_;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public Context getContext() {
            e2<Context, Context.Builder, c> e2Var = this.contextBuilder_;
            if (e2Var != null) {
                return (Context) e2Var.e();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        public Context.Builder getContextBuilder() {
            onChanged();
            return (Context.Builder) getContextFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public c getContextOrBuilder() {
            e2<Context, Context.Builder, c> e2Var = this.contextBuilder_;
            if (e2Var != null) {
                return (c) e2Var.f();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_descriptor;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public Request.Item getItem() {
            e2<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> e2Var = this.itemBuilder_;
            if (e2Var != null) {
                return (Request.Item) e2Var.e();
            }
            Request.Item item = this.item_;
            return item == null ? Request.Item.getDefaultInstance() : item;
        }

        public Request.Item.Builder getItemBuilder() {
            onChanged();
            return (Request.Item.Builder) getItemFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public Request.ItemOrBuilder getItemOrBuilder() {
            e2<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> e2Var = this.itemBuilder_;
            if (e2Var != null) {
                return (Request.ItemOrBuilder) e2Var.f();
            }
            Request.Item item = this.item_;
            return item == null ? Request.Item.getDefaultInstance() : item;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public Placement getPlacement() {
            e2<Placement, Placement.Builder, d> e2Var = this.placementBuilder_;
            if (e2Var != null) {
                return (Placement) e2Var.e();
            }
            Placement placement = this.placement_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        public Placement.Builder getPlacementBuilder() {
            onChanged();
            return (Placement.Builder) getPlacementFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public d getPlacementOrBuilder() {
            e2<Placement, Placement.Builder, d> e2Var = this.placementBuilder_;
            if (e2Var != null) {
                return (d) e2Var.f();
            }
            Placement placement = this.placement_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public PlacementTag getPlacementTag() {
            PlacementTag placementTagValueOf = PlacementTag.valueOf(this.placementTag_);
            return placementTagValueOf == null ? PlacementTag.UNRECOGNIZED : placementTagValueOf;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public int getPlacementTagValue() {
            return this.placementTag_;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public boolean getTest() {
            return this.test_;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public String getTimestamp() {
            Object obj = this.timestamp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.timestamp_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public ByteString getTimestampBytes() {
            Object obj = this.timestamp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.timestamp_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public boolean hasItem() {
            return (this.itemBuilder_ == null && this.item_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.AuctionContextOrBuilder
        public boolean hasPlacement() {
            return (this.placementBuilder_ == null && this.placement_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_fieldAccessorTable.d(AuctionContext.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeContext(Context context) {
            e2<Context, Context.Builder, c> e2Var = this.contextBuilder_;
            if (e2Var == null) {
                Context context2 = this.context_;
                if (context2 != null) {
                    this.context_ = Context.newBuilder(context2).mergeFrom(context).buildPartial();
                } else {
                    this.context_ = context;
                }
                onChanged();
            } else {
                e2Var.g(context);
            }
            return this;
        }

        public Builder mergeItem(Request.Item item) {
            e2<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> e2Var = this.itemBuilder_;
            if (e2Var == null) {
                Request.Item item2 = this.item_;
                if (item2 != null) {
                    this.item_ = Request.Item.newBuilder(item2).mergeFrom(item).buildPartial();
                } else {
                    this.item_ = item;
                }
                onChanged();
            } else {
                e2Var.g(item);
            }
            return this;
        }

        public Builder mergePlacement(Placement placement) {
            e2<Placement, Placement.Builder, d> e2Var = this.placementBuilder_;
            if (e2Var == null) {
                Placement placement2 = this.placement_;
                if (placement2 != null) {
                    this.placement_ = Placement.newBuilder(placement2).mergeFrom(placement).buildPartial();
                } else {
                    this.placement_ = placement;
                }
                onChanged();
            } else {
                e2Var.g(placement);
            }
            return this;
        }

        public Builder setAt(int i10) {
            this.at_ = i10;
            onChanged();
            return this;
        }

        public Builder setContext(Context context) {
            e2<Context, Context.Builder, c> e2Var = this.contextBuilder_;
            if (e2Var == null) {
                context.getClass();
                this.context_ = context;
                onChanged();
            } else {
                e2Var.i(context);
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
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString;
            onChanged();
            return this;
        }

        public Builder setItem(Request.Item item) {
            e2<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> e2Var = this.itemBuilder_;
            if (e2Var == null) {
                item.getClass();
                this.item_ = item;
                onChanged();
            } else {
                e2Var.i(item);
            }
            return this;
        }

        public Builder setPlacement(Placement placement) {
            e2<Placement, Placement.Builder, d> e2Var = this.placementBuilder_;
            if (e2Var == null) {
                placement.getClass();
                this.placement_ = placement;
                onChanged();
            } else {
                e2Var.i(placement);
            }
            return this;
        }

        public Builder setPlacementTag(PlacementTag placementTag) {
            placementTag.getClass();
            this.placementTag_ = placementTag.getNumber();
            onChanged();
            return this;
        }

        public Builder setPlacementTagValue(int i10) {
            this.placementTag_ = i10;
            onChanged();
            return this;
        }

        public Builder setTest(boolean z10) {
            this.test_ = z10;
            onChanged();
            return this;
        }

        public Builder setTimestamp(String str) {
            str.getClass();
            this.timestamp_ = str;
            onChanged();
            return this;
        }

        public Builder setTimestampBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.timestamp_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.timestamp_ = "";
            this.id_ = "";
            this.placementTag_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AuctionContext build() {
            AuctionContext auctionContextBuildPartial = buildPartial();
            if (auctionContextBuildPartial.isInitialized()) {
                return auctionContextBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) auctionContextBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AuctionContext buildPartial() {
            AuctionContext auctionContext = new AuctionContext(this);
            auctionContext.timestamp_ = this.timestamp_;
            auctionContext.id_ = this.id_;
            auctionContext.test_ = this.test_;
            auctionContext.at_ = this.at_;
            auctionContext.placementTag_ = this.placementTag_;
            e2<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> e2Var = this.itemBuilder_;
            if (e2Var == null) {
                auctionContext.item_ = this.item_;
            } else {
                auctionContext.item_ = (Request.Item) e2Var.a();
            }
            e2<Placement, Placement.Builder, d> e2Var2 = this.placementBuilder_;
            if (e2Var2 == null) {
                auctionContext.placement_ = this.placement_;
            } else {
                auctionContext.placement_ = (Placement) e2Var2.a();
            }
            e2<Context, Context.Builder, c> e2Var3 = this.contextBuilder_;
            if (e2Var3 == null) {
                auctionContext.context_ = this.context_;
            } else {
                auctionContext.context_ = (Context) e2Var3.a();
            }
            onBuilt();
            return auctionContext;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public AuctionContext mo164getDefaultInstanceForType() {
            return AuctionContext.getDefaultInstance();
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
            this.timestamp_ = "";
            this.id_ = "";
            this.test_ = false;
            this.at_ = 0;
            this.placementTag_ = 0;
            if (this.itemBuilder_ == null) {
                this.item_ = null;
            } else {
                this.item_ = null;
                this.itemBuilder_ = null;
            }
            if (this.placementBuilder_ == null) {
                this.placement_ = null;
            } else {
                this.placement_ = null;
                this.placementBuilder_ = null;
            }
            if (this.contextBuilder_ == null) {
                this.context_ = null;
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            return this;
        }

        public Builder setContext(Context.Builder builder) {
            e2<Context, Context.Builder, c> e2Var = this.contextBuilder_;
            if (e2Var == null) {
                this.context_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setItem(Request.Item.Builder builder) {
            e2<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> e2Var = this.itemBuilder_;
            if (e2Var == null) {
                this.item_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setPlacement(Placement.Builder builder) {
            e2<Placement, Placement.Builder, d> e2Var = this.placementBuilder_;
            if (e2Var == null) {
                this.placement_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
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
            if (message instanceof AuctionContext) {
                return mergeFrom((AuctionContext) message);
            }
            super.mergeFrom(message);
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.timestamp_ = "";
            this.id_ = "";
            this.placementTag_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(AuctionContext auctionContext) {
            if (auctionContext == AuctionContext.getDefaultInstance()) {
                return this;
            }
            if (!auctionContext.getTimestamp().isEmpty()) {
                this.timestamp_ = auctionContext.timestamp_;
                onChanged();
            }
            if (!auctionContext.getId().isEmpty()) {
                this.id_ = auctionContext.id_;
                onChanged();
            }
            if (auctionContext.getTest()) {
                setTest(auctionContext.getTest());
            }
            if (auctionContext.getAt() != 0) {
                setAt(auctionContext.getAt());
            }
            if (auctionContext.placementTag_ != 0) {
                setPlacementTagValue(auctionContext.getPlacementTagValue());
            }
            if (auctionContext.hasItem()) {
                mergeItem(auctionContext.getItem());
            }
            if (auctionContext.hasPlacement()) {
                mergePlacement(auctionContext.getPlacement());
            }
            if (auctionContext.hasContext()) {
                mergeContext(auctionContext.getContext());
            }
            mergeUnknownFields(((j0) auctionContext).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            AuctionContext auctionContext = null;
            try {
                try {
                    AuctionContext auctionContext2 = (AuctionContext) AuctionContext.PARSER.parsePartialFrom(nVar, yVar);
                    if (auctionContext2 != null) {
                        mergeFrom(auctionContext2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    AuctionContext auctionContext3 = (AuctionContext) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        auctionContext = auctionContext3;
                        if (auctionContext != null) {
                            mergeFrom(auctionContext);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (auctionContext != null) {
                    mergeFrom(auctionContext);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(AuctionContext auctionContext) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(auctionContext);
    }

    public static AuctionContext parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private AuctionContext(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AuctionContext parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (AuctionContext) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static AuctionContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public AuctionContext mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AuctionContext parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private AuctionContext() {
        this.memoizedIsInitialized = (byte) -1;
        this.timestamp_ = "";
        this.id_ = "";
        this.placementTag_ = 0;
    }

    public static AuctionContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static AuctionContext parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static AuctionContext parseFrom(InputStream inputStream) throws IOException {
        return (AuctionContext) j0.parseWithIOException(PARSER, inputStream);
    }

    public static AuctionContext parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (AuctionContext) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    private AuctionContext(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iK = nVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            this.timestamp_ = nVar.J();
                        } else if (iK == 18) {
                            this.id_ = nVar.J();
                        } else if (iK == 24) {
                            this.test_ = nVar.q();
                        } else if (iK == 32) {
                            this.at_ = nVar.L();
                        } else if (iK != 40) {
                            if (iK == 50) {
                                Request.Item item = this.item_;
                                Request.Item.Builder builder = item != null ? item.toBuilder() : null;
                                Request.Item item2 = (Request.Item) nVar.A(Request.Item.parser(), yVar);
                                this.item_ = item2;
                                if (builder != null) {
                                    builder.mergeFrom(item2);
                                    this.item_ = builder.buildPartial();
                                }
                            } else if (iK == 58) {
                                Placement placement = this.placement_;
                                Placement.Builder builder2 = placement != null ? placement.toBuilder() : null;
                                Placement placement2 = (Placement) nVar.A(Placement.parser(), yVar);
                                this.placement_ = placement2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(placement2);
                                    this.placement_ = builder2.buildPartial();
                                }
                            } else if (iK != 66) {
                                if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                }
                            } else {
                                Context context = this.context_;
                                Context.Builder builder3 = context != null ? context.toBuilder() : null;
                                Context context2 = (Context) nVar.A(Context.parser(), yVar);
                                this.context_ = context2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(context2);
                                    this.context_ = builder3.buildPartial();
                                }
                            }
                        } else {
                            this.placementTag_ = nVar.t();
                        }
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

    public static AuctionContext parseFrom(n nVar) throws IOException {
        return (AuctionContext) j0.parseWithIOException(PARSER, nVar);
    }

    public static AuctionContext parseFrom(n nVar, y yVar) throws IOException {
        return (AuctionContext) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
