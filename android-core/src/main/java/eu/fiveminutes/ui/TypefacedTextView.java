package eu.fiveminutes.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

import eu.fiveminutes.R;
import eu.fiveminutes.ui.util.TypefaceUtils;


/**
 *
 */
public class TypefacedTextView extends TextView implements TypefacedView {

    public TypefacedTextView(Context context) {
        super(context);
    }

    public TypefacedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypefaceUtils.extractAndApplyTypeface(this, context, attrs, R.styleable.TypefacedTextView, R.styleable.TypefacedTextView_typeface);
    }

    public TypefacedTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        TypefaceUtils.extractAndApplyTypeface(this, context, attrs, R.styleable.TypefacedTextView, R.styleable.TypefacedTextView_typeface);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TypefacedTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        TypefaceUtils.extractAndApplyTypeface(this, context, attrs, R.styleable.TypefacedTextView, R.styleable.TypefacedTextView_typeface);
    }
}