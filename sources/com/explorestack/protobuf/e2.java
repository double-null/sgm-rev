package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessage.Builder;
import com.explorestack.protobuf.MessageOrBuilder;

/* JADX INFO: compiled from: SingleFieldBuilderV3.java */
/* JADX INFO: loaded from: classes.dex */
public class e2<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> implements AbstractMessage.BuilderParent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractMessage.BuilderParent f10377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BType f10378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MType f10379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10380d;

    public e2(MType mtype, AbstractMessage.BuilderParent builderParent, boolean z10) {
        this.f10379c = (MType) l0.a(mtype);
        this.f10377a = builderParent;
        this.f10380d = z10;
    }

    private void h() {
        AbstractMessage.BuilderParent builderParent;
        if (this.f10378b != null) {
            this.f10379c = null;
        }
        if (!this.f10380d || (builderParent = this.f10377a) == null) {
            return;
        }
        builderParent.markDirty();
        this.f10380d = false;
    }

    public MType a() {
        this.f10380d = true;
        return (MType) e();
    }

    public e2<MType, BType, IType> b() {
        MType mtype = this.f10379c;
        this.f10379c = (MType) (mtype != null ? mtype.getDefaultInstanceForType() : this.f10378b.getDefaultInstanceForType());
        BType btype = this.f10378b;
        if (btype != null) {
            btype.dispose();
            this.f10378b = null;
        }
        h();
        return this;
    }

    public void c() {
        this.f10377a = null;
    }

    public BType d() {
        if (this.f10378b == null) {
            BType btype = (BType) this.f10379c.newBuilderForType(this);
            this.f10378b = btype;
            btype.mergeFrom(this.f10379c);
            this.f10378b.markClean();
        }
        return this.f10378b;
    }

    public MType e() {
        if (this.f10379c == null) {
            this.f10379c = (MType) this.f10378b.buildPartial();
        }
        return this.f10379c;
    }

    public IType f() {
        BType btype = this.f10378b;
        return btype != null ? btype : this.f10379c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public e2<MType, BType, IType> g(MType mtype) {
        if (this.f10378b == null) {
            Message message = this.f10379c;
            if (message == message.getDefaultInstanceForType()) {
                this.f10379c = mtype;
            } else {
                d().mergeFrom((Message) mtype);
            }
        } else {
            d().mergeFrom((Message) mtype);
        }
        h();
        return this;
    }

    public e2<MType, BType, IType> i(MType mtype) {
        this.f10379c = (MType) l0.a(mtype);
        BType btype = this.f10378b;
        if (btype != null) {
            btype.dispose();
            this.f10378b = null;
        }
        h();
        return this;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.BuilderParent
    public void markDirty() {
        h();
    }
}
