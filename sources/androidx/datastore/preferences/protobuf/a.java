package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.AbstractC0039a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: AbstractMessageLite.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0039a<MessageType, BuilderType>> implements p0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractMessageLite.java */
    public static abstract class AbstractC0039a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0039a<MessageType, BuilderType>> implements p0.a {
        protected static <T> void b(Iterable<T> iterable, List<? super T> list) {
            y.a(iterable);
            if (!(iterable instanceof c0)) {
                if (iterable instanceof y0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    d(iterable, list);
                    return;
                }
            }
            List<?> underlyingElements = ((c0) iterable).getUnderlyingElements();
            c0 c0Var = (c0) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (c0Var.size() - size) + " is null.";
                    for (int size2 = c0Var.size() - 1; size2 >= size; size2--) {
                        c0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof g) {
                    c0Var.n((g) obj);
                } else if (obj instanceof byte[]) {
                    c0Var.n(g.h((byte[]) obj));
                } else {
                    c0Var.add((String) obj);
                }
            }
        }

        private static <T> void d(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        protected static UninitializedMessageException i(p0 p0Var) {
            return new UninitializedMessageException(p0Var);
        }

        protected abstract BuilderType g(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.p0.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public BuilderType c(p0 p0Var) {
            if (getDefaultInstanceForType().getClass().isInstance(p0Var)) {
                return (BuilderType) g((a) p0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    protected static <T> void b(Iterable<T> iterable, List<? super T> list) {
        AbstractC0039a.b(iterable, list);
    }

    private String g(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int d() {
        throw new UnsupportedOperationException();
    }

    int f(e1 e1Var) {
        int iD = d();
        if (iD != -1) {
            return iD;
        }
        int serializedSize = e1Var.getSerializedSize(this);
        i(serializedSize);
        return serializedSize;
    }

    UninitializedMessageException h() {
        return new UninitializedMessageException(this);
    }

    void i(int i10) {
        throw new UnsupportedOperationException();
    }

    public void j(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamE0 = CodedOutputStream.e0(outputStream, CodedOutputStream.I(getSerializedSize()));
        a(codedOutputStreamE0);
        codedOutputStreamE0.b0();
    }

    @Override // androidx.datastore.preferences.protobuf.p0
    public g toByteString() {
        try {
            g.h hVarW = g.w(getSerializedSize());
            a(hVarW.b());
            return hVarW.a();
        } catch (IOException e10) {
            throw new RuntimeException(g("ByteString"), e10);
        }
    }
}
