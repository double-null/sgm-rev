package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: LazyFieldLite.java */
/* JADX INFO: loaded from: classes4.dex */
public class f0 {
    private static final p EMPTY_REGISTRY = p.getEmptyRegistry();
    private i delayedBytes;
    private p extensionRegistry;
    private volatile i memoizedBytes;
    protected volatile s0 value;

    public f0() {
    }

    public f0(p pVar, i iVar) {
        checkArguments(pVar, iVar);
        this.extensionRegistry = pVar;
        this.delayedBytes = iVar;
    }

    private static void checkArguments(p pVar, i iVar) {
        if (pVar == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (iVar == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public static f0 fromValue(s0 s0Var) {
        f0 f0Var = new f0();
        f0Var.setValue(s0Var);
        return f0Var;
    }

    private static s0 mergeValueAndBytes(s0 s0Var, i iVar, p pVar) {
        try {
            return s0Var.toBuilder().mergeFrom(iVar, pVar).build();
        } catch (InvalidProtocolBufferException unused) {
            return s0Var;
        }
    }

    public void clear() {
        this.delayedBytes = null;
        this.value = null;
        this.memoizedBytes = null;
    }

    public boolean containsDefaultInstance() {
        i iVar;
        i iVar2 = this.memoizedBytes;
        i iVar3 = i.EMPTY;
        return iVar2 == iVar3 || (this.value == null && ((iVar = this.delayedBytes) == null || iVar == iVar3));
    }

    protected void ensureInitialized(s0 s0Var) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.delayedBytes != null) {
                    this.value = s0Var.getParserForType().parseFrom(this.delayedBytes, this.extensionRegistry);
                    this.memoizedBytes = this.delayedBytes;
                } else {
                    this.value = s0Var;
                    this.memoizedBytes = i.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.value = s0Var;
                this.memoizedBytes = i.EMPTY;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        s0 s0Var = this.value;
        s0 s0Var2 = f0Var.value;
        if (s0Var == null && s0Var2 == null) {
            return toByteString().equals(f0Var.toByteString());
        }
        if (s0Var == null || s0Var2 == null) {
            return s0Var != null ? s0Var.equals(f0Var.getValue(s0Var.getDefaultInstanceForType())) : getValue(s0Var2.getDefaultInstanceForType()).equals(s0Var2);
        }
        return s0Var.equals(s0Var2);
    }

    public int getSerializedSize() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes.size();
        }
        i iVar = this.delayedBytes;
        if (iVar != null) {
            return iVar.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public s0 getValue(s0 s0Var) {
        ensureInitialized(s0Var);
        return this.value;
    }

    public int hashCode() {
        return 1;
    }

    public void merge(f0 f0Var) {
        i iVar;
        if (f0Var.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(f0Var);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = f0Var.extensionRegistry;
        }
        i iVar2 = this.delayedBytes;
        if (iVar2 != null && (iVar = f0Var.delayedBytes) != null) {
            this.delayedBytes = iVar2.concat(iVar);
            return;
        }
        if (this.value == null && f0Var.value != null) {
            setValue(mergeValueAndBytes(f0Var.value, this.delayedBytes, this.extensionRegistry));
        } else if (this.value == null || f0Var.value != null) {
            setValue(this.value.toBuilder().mergeFrom(f0Var.value).build());
        } else {
            setValue(mergeValueAndBytes(this.value, f0Var.delayedBytes, f0Var.extensionRegistry));
        }
    }

    public void mergeFrom(j jVar, p pVar) throws IOException {
        if (containsDefaultInstance()) {
            setByteString(jVar.readBytes(), pVar);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = pVar;
        }
        i iVar = this.delayedBytes;
        if (iVar != null) {
            setByteString(iVar.concat(jVar.readBytes()), this.extensionRegistry);
        } else {
            try {
                setValue(this.value.toBuilder().mergeFrom(jVar, pVar).build());
            } catch (InvalidProtocolBufferException unused) {
            }
        }
    }

    public void set(f0 f0Var) {
        this.delayedBytes = f0Var.delayedBytes;
        this.value = f0Var.value;
        this.memoizedBytes = f0Var.memoizedBytes;
        p pVar = f0Var.extensionRegistry;
        if (pVar != null) {
            this.extensionRegistry = pVar;
        }
    }

    public void setByteString(i iVar, p pVar) {
        checkArguments(pVar, iVar);
        this.delayedBytes = iVar;
        this.extensionRegistry = pVar;
        this.value = null;
        this.memoizedBytes = null;
    }

    public s0 setValue(s0 s0Var) {
        s0 s0Var2 = this.value;
        this.delayedBytes = null;
        this.memoizedBytes = null;
        this.value = s0Var;
        return s0Var2;
    }

    public i toByteString() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes;
        }
        i iVar = this.delayedBytes;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.memoizedBytes != null) {
                return this.memoizedBytes;
            }
            if (this.value == null) {
                this.memoizedBytes = i.EMPTY;
            } else {
                this.memoizedBytes = this.value.toByteString();
            }
            return this.memoizedBytes;
        }
    }

    void writeTo(y1 y1Var, int i10) throws IOException {
        if (this.memoizedBytes != null) {
            y1Var.writeBytes(i10, this.memoizedBytes);
            return;
        }
        i iVar = this.delayedBytes;
        if (iVar != null) {
            y1Var.writeBytes(i10, iVar);
        } else if (this.value != null) {
            y1Var.writeMessage(i10, this.value);
        } else {
            y1Var.writeBytes(i10, i.EMPTY);
        }
    }
}
