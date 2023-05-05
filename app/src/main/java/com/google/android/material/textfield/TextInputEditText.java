package com.google.android.material.textfield;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class TextInputEditText extends View {
    public TextInputEditText(Context context) {
        this(context, null);
    }

    public TextInputEditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TextInputEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
