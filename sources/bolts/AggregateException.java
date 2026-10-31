package bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AggregateException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Throwable> f4513a;

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i10 = -1;
        for (Throwable th : this.f4513a) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i10++;
            printStream.append((CharSequence) Integer.toString(i10));
            printStream.append(": ");
            th.printStackTrace(printStream);
            printStream.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i10 = -1;
        for (Throwable th : this.f4513a) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i10++;
            printWriter.append((CharSequence) Integer.toString(i10));
            printWriter.append(": ");
            th.printStackTrace(printWriter);
            printWriter.append("\n");
        }
    }
}
