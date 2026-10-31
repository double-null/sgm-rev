package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.a;
import com.explorestack.protobuf.b;
import com.explorestack.protobuf.e2;
import com.explorestack.protobuf.j0;
import com.explorestack.protobuf.n;
import com.explorestack.protobuf.openrtb.Response;
import com.explorestack.protobuf.s1;
import com.explorestack.protobuf.u2;
import com.explorestack.protobuf.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class BidEvent extends j0 implements BidEventOrBuilder {
    public static final int AD_FIELD_NUMBER = 6;
    public static final int AUCTION_CONTEXT_FIELD_NUMBER = 4;
    public static final int BIDID_FIELD_NUMBER = 2;
    public static final int BID_FIELD_NUMBER = 5;
    private static final BidEvent DEFAULT_INSTANCE = new BidEvent();
    private static final s1<BidEvent> PARSER = new b<BidEvent>() { // from class: io.bidmachine.protobuf.analytics.BidEvent.1
        @Override // com.explorestack.protobuf.s1
        public BidEvent parsePartialFrom(n nVar, y yVar) throws InvalidProtocolBufferException {
            return new BidEvent(nVar, yVar);
        }
    };
    public static final int SEAT_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private Ad ad_;
    private AuctionContext auctionContext_;
    private Response.Seatbid.Bid bid_;
    private volatile Object bidid_;
    private byte memoizedIsInitialized;
    private volatile Object seat_;
    private volatile Object timestamp_;

    public static BidEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static BidEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BidEvent) j0.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static BidEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static s1<BidEvent> parser() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BidEvent)) {
            return super.equals(obj);
        }
        BidEvent bidEvent = (BidEvent) obj;
        if (!getTimestamp().equals(bidEvent.getTimestamp()) || !getBidid().equals(bidEvent.getBidid()) || !getSeat().equals(bidEvent.getSeat()) || hasAuctionContext() != bidEvent.hasAuctionContext()) {
            return false;
        }
        if ((hasAuctionContext() && !getAuctionContext().equals(bidEvent.getAuctionContext())) || hasBid() != bidEvent.hasBid()) {
            return false;
        }
        if ((!hasBid() || getBid().equals(bidEvent.getBid())) && hasAd() == bidEvent.hasAd()) {
            return (!hasAd() || getAd().equals(bidEvent.getAd())) && this.unknownFields.equals(bidEvent.unknownFields);
        }
        return false;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public Ad getAd() {
        Ad ad2 = this.ad_;
        return ad2 == null ? Ad.getDefaultInstance() : ad2;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public a getAdOrBuilder() {
        return getAd();
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public AuctionContext getAuctionContext() {
        AuctionContext auctionContext = this.auctionContext_;
        return auctionContext == null ? AuctionContext.getDefaultInstance() : auctionContext;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public AuctionContextOrBuilder getAuctionContextOrBuilder() {
        return getAuctionContext();
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public Response.Seatbid.Bid getBid() {
        Response.Seatbid.Bid bid = this.bid_;
        return bid == null ? Response.Seatbid.Bid.getDefaultInstance() : bid;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public Response.Seatbid.BidOrBuilder getBidOrBuilder() {
        return getBid();
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public String getBidid() {
        Object obj = this.bidid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bidid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public ByteString getBididBytes() {
        Object obj = this.bidid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bidid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s1<BidEvent> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public String getSeat() {
        Object obj = this.seat_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.seat_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public ByteString getSeatBytes() {
        Object obj = this.seat_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.seat_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = getTimestampBytes().isEmpty() ? 0 : 0 + j0.computeStringSize(1, this.timestamp_);
        if (!getBididBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(2, this.bidid_);
        }
        if (!getSeatBytes().isEmpty()) {
            iComputeStringSize += j0.computeStringSize(3, this.seat_);
        }
        if (this.auctionContext_ != null) {
            iComputeStringSize += CodedOutputStream.G(4, getAuctionContext());
        }
        if (this.bid_ != null) {
            iComputeStringSize += CodedOutputStream.G(5, getBid());
        }
        if (this.ad_ != null) {
            iComputeStringSize += CodedOutputStream.G(6, getAd());
        }
        int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public String getTimestamp() {
        Object obj = this.timestamp_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.timestamp_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
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

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public boolean hasAd() {
        return this.ad_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public boolean hasAuctionContext() {
        return this.auctionContext_ != null;
    }

    @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
    public boolean hasBid() {
        return this.bid_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTimestamp().hashCode()) * 37) + 2) * 53) + getBidid().hashCode()) * 37) + 3) * 53) + getSeat().hashCode();
        if (hasAuctionContext()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getAuctionContext().hashCode();
        }
        if (hasBid()) {
            iHashCode = (((iHashCode * 37) + 5) * 53) + getBid().hashCode();
        }
        if (hasAd()) {
            iHashCode = (((iHashCode * 37) + 6) * 53) + getAd().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.j0
    protected j0.f internalGetFieldAccessorTable() {
        return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_fieldAccessorTable.d(BidEvent.class, Builder.class);
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
        return new BidEvent();
    }

    @Override // com.explorestack.protobuf.j0, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getTimestampBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 1, this.timestamp_);
        }
        if (!getBididBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 2, this.bidid_);
        }
        if (!getSeatBytes().isEmpty()) {
            j0.writeString(codedOutputStream, 3, this.seat_);
        }
        if (this.auctionContext_ != null) {
            codedOutputStream.L0(4, getAuctionContext());
        }
        if (this.bid_ != null) {
            codedOutputStream.L0(5, getBid());
        }
        if (this.ad_ != null) {
            codedOutputStream.L0(6, getAd());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static final class Builder extends j0.b<Builder> implements BidEventOrBuilder {
        private e2<Ad, Ad.Builder, a> adBuilder_;
        private Ad ad_;
        private e2<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> auctionContextBuilder_;
        private AuctionContext auctionContext_;
        private e2<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> bidBuilder_;
        private Response.Seatbid.Bid bid_;
        private Object bidid_;
        private Object seat_;
        private Object timestamp_;

        private e2<Ad, Ad.Builder, a> getAdFieldBuilder() {
            if (this.adBuilder_ == null) {
                this.adBuilder_ = new e2<>(getAd(), getParentForChildren(), isClean());
                this.ad_ = null;
            }
            return this.adBuilder_;
        }

        private e2<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> getAuctionContextFieldBuilder() {
            if (this.auctionContextBuilder_ == null) {
                this.auctionContextBuilder_ = new e2<>(getAuctionContext(), getParentForChildren(), isClean());
                this.auctionContext_ = null;
            }
            return this.auctionContextBuilder_;
        }

        private e2<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> getBidFieldBuilder() {
            if (this.bidBuilder_ == null) {
                this.bidBuilder_ = new e2<>(getBid(), getParentForChildren(), isClean());
                this.bid_ = null;
            }
            return this.bidBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = j0.alwaysUseFieldBuilders;
        }

        public Builder clearAd() {
            if (this.adBuilder_ == null) {
                this.ad_ = null;
                onChanged();
            } else {
                this.ad_ = null;
                this.adBuilder_ = null;
            }
            return this;
        }

        public Builder clearAuctionContext() {
            if (this.auctionContextBuilder_ == null) {
                this.auctionContext_ = null;
                onChanged();
            } else {
                this.auctionContext_ = null;
                this.auctionContextBuilder_ = null;
            }
            return this;
        }

        public Builder clearBid() {
            if (this.bidBuilder_ == null) {
                this.bid_ = null;
                onChanged();
            } else {
                this.bid_ = null;
                this.bidBuilder_ = null;
            }
            return this;
        }

        public Builder clearBidid() {
            this.bidid_ = BidEvent.getDefaultInstance().getBidid();
            onChanged();
            return this;
        }

        public Builder clearSeat() {
            this.seat_ = BidEvent.getDefaultInstance().getSeat();
            onChanged();
            return this;
        }

        public Builder clearTimestamp() {
            this.timestamp_ = BidEvent.getDefaultInstance().getTimestamp();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public Ad getAd() {
            e2<Ad, Ad.Builder, a> e2Var = this.adBuilder_;
            if (e2Var != null) {
                return (Ad) e2Var.e();
            }
            Ad ad2 = this.ad_;
            return ad2 == null ? Ad.getDefaultInstance() : ad2;
        }

        public Ad.Builder getAdBuilder() {
            onChanged();
            return (Ad.Builder) getAdFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public a getAdOrBuilder() {
            e2<Ad, Ad.Builder, a> e2Var = this.adBuilder_;
            if (e2Var != null) {
                return (a) e2Var.f();
            }
            Ad ad2 = this.ad_;
            return ad2 == null ? Ad.getDefaultInstance() : ad2;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public AuctionContext getAuctionContext() {
            e2<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> e2Var = this.auctionContextBuilder_;
            if (e2Var != null) {
                return (AuctionContext) e2Var.e();
            }
            AuctionContext auctionContext = this.auctionContext_;
            return auctionContext == null ? AuctionContext.getDefaultInstance() : auctionContext;
        }

        public AuctionContext.Builder getAuctionContextBuilder() {
            onChanged();
            return (AuctionContext.Builder) getAuctionContextFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public AuctionContextOrBuilder getAuctionContextOrBuilder() {
            e2<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> e2Var = this.auctionContextBuilder_;
            if (e2Var != null) {
                return (AuctionContextOrBuilder) e2Var.f();
            }
            AuctionContext auctionContext = this.auctionContext_;
            return auctionContext == null ? AuctionContext.getDefaultInstance() : auctionContext;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public Response.Seatbid.Bid getBid() {
            e2<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> e2Var = this.bidBuilder_;
            if (e2Var != null) {
                return (Response.Seatbid.Bid) e2Var.e();
            }
            Response.Seatbid.Bid bid = this.bid_;
            return bid == null ? Response.Seatbid.Bid.getDefaultInstance() : bid;
        }

        public Response.Seatbid.Bid.Builder getBidBuilder() {
            onChanged();
            return (Response.Seatbid.Bid.Builder) getBidFieldBuilder().d();
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public Response.Seatbid.BidOrBuilder getBidOrBuilder() {
            e2<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> e2Var = this.bidBuilder_;
            if (e2Var != null) {
                return (Response.Seatbid.BidOrBuilder) e2Var.f();
            }
            Response.Seatbid.Bid bid = this.bid_;
            return bid == null ? Response.Seatbid.Bid.getDefaultInstance() : bid;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public String getBidid() {
            Object obj = this.bidid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public ByteString getBididBytes() {
            Object obj = this.bidid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_descriptor;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public String getSeat() {
            Object obj = this.seat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.seat_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public ByteString getSeatBytes() {
            Object obj = this.seat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.seat_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public String getTimestamp() {
            Object obj = this.timestamp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.timestamp_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public ByteString getTimestampBytes() {
            Object obj = this.timestamp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.timestamp_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public boolean hasAd() {
            return (this.adBuilder_ == null && this.ad_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public boolean hasAuctionContext() {
            return (this.auctionContextBuilder_ == null && this.auctionContext_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.analytics.BidEventOrBuilder
        public boolean hasBid() {
            return (this.bidBuilder_ == null && this.bid_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.j0.b
        protected j0.f internalGetFieldAccessorTable() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_BidEvent_fieldAccessorTable.d(BidEvent.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeAd(Ad ad2) {
            e2<Ad, Ad.Builder, a> e2Var = this.adBuilder_;
            if (e2Var == null) {
                Ad ad3 = this.ad_;
                if (ad3 != null) {
                    this.ad_ = Ad.newBuilder(ad3).mergeFrom(ad2).buildPartial();
                } else {
                    this.ad_ = ad2;
                }
                onChanged();
            } else {
                e2Var.g(ad2);
            }
            return this;
        }

        public Builder mergeAuctionContext(AuctionContext auctionContext) {
            e2<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> e2Var = this.auctionContextBuilder_;
            if (e2Var == null) {
                AuctionContext auctionContext2 = this.auctionContext_;
                if (auctionContext2 != null) {
                    this.auctionContext_ = AuctionContext.newBuilder(auctionContext2).mergeFrom(auctionContext).buildPartial();
                } else {
                    this.auctionContext_ = auctionContext;
                }
                onChanged();
            } else {
                e2Var.g(auctionContext);
            }
            return this;
        }

        public Builder mergeBid(Response.Seatbid.Bid bid) {
            e2<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> e2Var = this.bidBuilder_;
            if (e2Var == null) {
                Response.Seatbid.Bid bid2 = this.bid_;
                if (bid2 != null) {
                    this.bid_ = Response.Seatbid.Bid.newBuilder(bid2).mergeFrom(bid).buildPartial();
                } else {
                    this.bid_ = bid;
                }
                onChanged();
            } else {
                e2Var.g(bid);
            }
            return this;
        }

        public Builder setAd(Ad ad2) {
            e2<Ad, Ad.Builder, a> e2Var = this.adBuilder_;
            if (e2Var == null) {
                ad2.getClass();
                this.ad_ = ad2;
                onChanged();
            } else {
                e2Var.i(ad2);
            }
            return this;
        }

        public Builder setAuctionContext(AuctionContext auctionContext) {
            e2<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> e2Var = this.auctionContextBuilder_;
            if (e2Var == null) {
                auctionContext.getClass();
                this.auctionContext_ = auctionContext;
                onChanged();
            } else {
                e2Var.i(auctionContext);
            }
            return this;
        }

        public Builder setBid(Response.Seatbid.Bid bid) {
            e2<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> e2Var = this.bidBuilder_;
            if (e2Var == null) {
                bid.getClass();
                this.bid_ = bid;
                onChanged();
            } else {
                e2Var.i(bid);
            }
            return this;
        }

        public Builder setBidid(String str) {
            str.getClass();
            this.bidid_ = str;
            onChanged();
            return this;
        }

        public Builder setBididBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.bidid_ = byteString;
            onChanged();
            return this;
        }

        public Builder setSeat(String str) {
            str.getClass();
            this.seat_ = str;
            onChanged();
            return this;
        }

        public Builder setSeatBytes(ByteString byteString) {
            byteString.getClass();
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.seat_ = byteString;
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
            com.explorestack.protobuf.a.checkByteStringIsUtf8(byteString);
            this.timestamp_ = byteString;
            onChanged();
            return this;
        }

        private Builder() {
            this.timestamp_ = "";
            this.bidid_ = "";
            this.seat_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BidEvent build() {
            BidEvent bidEventBuildPartial = buildPartial();
            if (bidEventBuildPartial.isInitialized()) {
                return bidEventBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) bidEventBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public BidEvent buildPartial() {
            BidEvent bidEvent = new BidEvent(this);
            bidEvent.timestamp_ = this.timestamp_;
            bidEvent.bidid_ = this.bidid_;
            bidEvent.seat_ = this.seat_;
            e2<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> e2Var = this.auctionContextBuilder_;
            if (e2Var == null) {
                bidEvent.auctionContext_ = this.auctionContext_;
            } else {
                bidEvent.auctionContext_ = (AuctionContext) e2Var.a();
            }
            e2<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> e2Var2 = this.bidBuilder_;
            if (e2Var2 == null) {
                bidEvent.bid_ = this.bid_;
            } else {
                bidEvent.bid_ = (Response.Seatbid.Bid) e2Var2.a();
            }
            e2<Ad, Ad.Builder, a> e2Var3 = this.adBuilder_;
            if (e2Var3 == null) {
                bidEvent.ad_ = this.ad_;
            } else {
                bidEvent.ad_ = (Ad) e2Var3.a();
            }
            onBuilt();
            return bidEvent;
        }

        @Override // com.explorestack.protobuf.j0.b, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        /* JADX INFO: renamed from: getDefaultInstanceForType */
        public BidEvent mo164getDefaultInstanceForType() {
            return BidEvent.getDefaultInstance();
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
            this.bidid_ = "";
            this.seat_ = "";
            if (this.auctionContextBuilder_ == null) {
                this.auctionContext_ = null;
            } else {
                this.auctionContext_ = null;
                this.auctionContextBuilder_ = null;
            }
            if (this.bidBuilder_ == null) {
                this.bid_ = null;
            } else {
                this.bid_ = null;
                this.bidBuilder_ = null;
            }
            if (this.adBuilder_ == null) {
                this.ad_ = null;
            } else {
                this.ad_ = null;
                this.adBuilder_ = null;
            }
            return this;
        }

        public Builder setAd(Ad.Builder builder) {
            e2<Ad, Ad.Builder, a> e2Var = this.adBuilder_;
            if (e2Var == null) {
                this.ad_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setAuctionContext(AuctionContext.Builder builder) {
            e2<AuctionContext, AuctionContext.Builder, AuctionContextOrBuilder> e2Var = this.auctionContextBuilder_;
            if (e2Var == null) {
                this.auctionContext_ = builder.build();
                onChanged();
            } else {
                e2Var.i(builder.build());
            }
            return this;
        }

        public Builder setBid(Response.Seatbid.Bid.Builder builder) {
            e2<Response.Seatbid.Bid, Response.Seatbid.Bid.Builder, Response.Seatbid.BidOrBuilder> e2Var = this.bidBuilder_;
            if (e2Var == null) {
                this.bid_ = builder.build();
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
            if (message instanceof BidEvent) {
                return mergeFrom((BidEvent) message);
            }
            super.mergeFrom(message);
            return this;
        }

        private Builder(j0.c cVar) {
            super(cVar);
            this.timestamp_ = "";
            this.bidid_ = "";
            this.seat_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(BidEvent bidEvent) {
            if (bidEvent == BidEvent.getDefaultInstance()) {
                return this;
            }
            if (!bidEvent.getTimestamp().isEmpty()) {
                this.timestamp_ = bidEvent.timestamp_;
                onChanged();
            }
            if (!bidEvent.getBidid().isEmpty()) {
                this.bidid_ = bidEvent.bidid_;
                onChanged();
            }
            if (!bidEvent.getSeat().isEmpty()) {
                this.seat_ = bidEvent.seat_;
                onChanged();
            }
            if (bidEvent.hasAuctionContext()) {
                mergeAuctionContext(bidEvent.getAuctionContext());
            }
            if (bidEvent.hasBid()) {
                mergeBid(bidEvent.getBid());
            }
            if (bidEvent.hasAd()) {
                mergeAd(bidEvent.getAd());
            }
            mergeUnknownFields(((j0) bidEvent).unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.a.AbstractC0128a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(n nVar, y yVar) throws Throwable {
            BidEvent bidEvent = null;
            try {
                try {
                    BidEvent bidEvent2 = (BidEvent) BidEvent.PARSER.parsePartialFrom(nVar, yVar);
                    if (bidEvent2 != null) {
                        mergeFrom(bidEvent2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    BidEvent bidEvent3 = (BidEvent) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        bidEvent = bidEvent3;
                        if (bidEvent != null) {
                            mergeFrom(bidEvent);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (bidEvent != null) {
                    mergeFrom(bidEvent);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder(BidEvent bidEvent) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(bidEvent);
    }

    public static BidEvent parseFrom(ByteBuffer byteBuffer, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, yVar);
    }

    private BidEvent(j0.b<?> bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static BidEvent parseDelimitedFrom(InputStream inputStream, y yVar) throws IOException {
        return (BidEvent) j0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
    }

    public static BidEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* JADX INFO: renamed from: getDefaultInstanceForType */
    public BidEvent mo164getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static BidEvent parseFrom(ByteString byteString, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, yVar);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private BidEvent() {
        this.memoizedIsInitialized = (byte) -1;
        this.timestamp_ = "";
        this.bidid_ = "";
        this.seat_ = "";
    }

    public static BidEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.explorestack.protobuf.j0
    public Builder newBuilderForType(j0.c cVar) {
        return new Builder(cVar);
    }

    public static BidEvent parseFrom(byte[] bArr, y yVar) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, yVar);
    }

    public static BidEvent parseFrom(InputStream inputStream) throws IOException {
        return (BidEvent) j0.parseWithIOException(PARSER, inputStream);
    }

    public static BidEvent parseFrom(InputStream inputStream, y yVar) throws IOException {
        return (BidEvent) j0.parseWithIOException(PARSER, inputStream, yVar);
    }

    private BidEvent(n nVar, y yVar) throws InvalidProtocolBufferException {
        this();
        yVar.getClass();
        u2.b bVarG = u2.g();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = nVar.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                this.timestamp_ = nVar.J();
                            } else if (iK == 18) {
                                this.bidid_ = nVar.J();
                            } else if (iK != 26) {
                                if (iK == 34) {
                                    AuctionContext auctionContext = this.auctionContext_;
                                    AuctionContext.Builder builder = auctionContext != null ? auctionContext.toBuilder() : null;
                                    AuctionContext auctionContext2 = (AuctionContext) nVar.A(AuctionContext.parser(), yVar);
                                    this.auctionContext_ = auctionContext2;
                                    if (builder != null) {
                                        builder.mergeFrom(auctionContext2);
                                        this.auctionContext_ = builder.buildPartial();
                                    }
                                } else if (iK == 42) {
                                    Response.Seatbid.Bid bid = this.bid_;
                                    Response.Seatbid.Bid.Builder builder2 = bid != null ? bid.toBuilder() : null;
                                    Response.Seatbid.Bid bid2 = (Response.Seatbid.Bid) nVar.A(Response.Seatbid.Bid.parser(), yVar);
                                    this.bid_ = bid2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(bid2);
                                        this.bid_ = builder2.buildPartial();
                                    }
                                } else if (iK != 50) {
                                    if (!parseUnknownField(nVar, bVarG, yVar, iK)) {
                                    }
                                } else {
                                    Ad ad2 = this.ad_;
                                    Ad.Builder builder3 = ad2 != null ? ad2.toBuilder() : null;
                                    Ad ad3 = (Ad) nVar.A(Ad.parser(), yVar);
                                    this.ad_ = ad3;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(ad3);
                                        this.ad_ = builder3.buildPartial();
                                    }
                                }
                            } else {
                                this.seat_ = nVar.J();
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
                this.unknownFields = bVarG.build();
                makeExtensionsImmutable();
                throw th;
            }
        }
        this.unknownFields = bVarG.build();
        makeExtensionsImmutable();
    }

    public static BidEvent parseFrom(n nVar) throws IOException {
        return (BidEvent) j0.parseWithIOException(PARSER, nVar);
    }

    public static BidEvent parseFrom(n nVar, y yVar) throws IOException {
        return (BidEvent) j0.parseWithIOException(PARSER, nVar, yVar);
    }
}
