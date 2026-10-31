package com.facebook;

/* JADX INFO: compiled from: FacebookGraphResponseException.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookGraphResponseException extends FacebookException {
    private final GraphResponse graphResponse;

    public FacebookGraphResponseException(GraphResponse graphResponse, String str) {
        super(str);
        this.graphResponse = graphResponse;
    }

    public final GraphResponse getGraphResponse() {
        return this.graphResponse;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public String toString() {
        GraphResponse graphResponse = this.graphResponse;
        FacebookRequestError error = graphResponse != null ? graphResponse.getError() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (error != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(error.getRequestStatusCode());
            sb2.append(", facebookErrorCode: ");
            sb2.append(error.getErrorCode());
            sb2.append(", facebookErrorType: ");
            sb2.append(error.getErrorType());
            sb2.append(", message: ");
            sb2.append(error.getErrorMessage());
            sb2.append("}");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.t.e(string, "errorStringBuilder.toString()");
        return string;
    }
}
