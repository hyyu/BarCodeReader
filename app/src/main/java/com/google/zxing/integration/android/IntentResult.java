package com.google.zxing.integration.android;

/*
**  Result
*/

import android.content.Intent;

public final class IntentResult {
    private final String    contents;
    private final String    formatName;
    private final byte[]    rawBytes;
    private final Integer   orientation;
    private final String    errorCorrectionLevel;

    IntentResult() {
        this(null, null, null, null, null);
    }

    IntentResult(String contents,
                 String formatName,
                 byte[] rawBytes,
                 Integer orientation,
                 String errorCorrectionLevel) {
        this.contents = contents;
        this.formatName = formatName;
        this.rawBytes = rawBytes;
        this.orientation = orientation;
        this.errorCorrectionLevel = errorCorrectionLevel;
    }

    public String getContents() {
        return contents;
    }

    public String getFormatName() {
        return formatName;
    }

    public byte[] getRawBytes() {
        return rawBytes;
    }

    public Integer getOrientation() {
        return orientation;
    }

    public String getErrorCorrectionLevel() {
        return errorCorrectionLevel;
    }

    @Override
    public String toString() {
        StringBuilder   dialogtext = new StringBuilder(100);
        dialogtext.append("Format: ").append(formatName).append('\n');
        dialogtext.append("Contents: ").append(contents).append('\n');
        int       rawBytesLength = rawBytes == null ? 0 : rawBytes.length;
        dialogtext.append("Raw bytes: (").append(rawBytesLength).append(" bytes)\n");
        dialogtext.append("Orientation: ").append(orientation).append('\n');
        dialogtext.append("EC level: ").append(errorCorrectionLevel).append('\n');
        return dialogtext.toString();
    }

}
