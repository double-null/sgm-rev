package pd;

/* JADX INFO: compiled from: KFunction.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface g<R> extends b<R>, wc.g<R> {
    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // pd.b
    boolean isSuspend();
}
