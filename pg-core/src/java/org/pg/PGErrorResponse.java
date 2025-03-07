package org.pg;

import clojure.lang.IPersistentCollection;
import org.pg.msg.ErrorResponse;

public final class PGErrorResponse extends Error {

    private final ErrorResponse errorResponse;

    @SuppressWarnings("unused")
    public IPersistentCollection getErrorFields () {
        return this.errorResponse.toClojure();
    }

    public PGErrorResponse (final ErrorResponse errorResponse) {
        super(String.format("Server error response: %s", errorResponse.fields()));
        this.errorResponse = errorResponse;
    }

}
