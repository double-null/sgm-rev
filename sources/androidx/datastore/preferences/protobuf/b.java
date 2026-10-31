package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p0;

/* JADX INFO: compiled from: AbstractParser.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b<MessageType extends p0> implements x0<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f2105a = n.b();

    private MessageType c(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).b().s(messagetype);
    }

    private UninitializedMessageException d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).h() : new UninitializedMessageException(messagetype);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType a(g gVar, n nVar) throws InvalidProtocolBufferException {
        return (MessageType) c(f(gVar, nVar));
    }

    public MessageType f(g gVar, n nVar) throws InvalidProtocolBufferException {
        try {
            h hVarX = gVar.x();
            MessageType messagetypeB = b(hVarX, nVar);
            try {
                hVarX.a(0);
                return messagetypeB;
            } catch (InvalidProtocolBufferException e10) {
                throw e10.s(messagetypeB);
            }
        } catch (InvalidProtocolBufferException e11) {
            throw e11;
        }
    }
}
