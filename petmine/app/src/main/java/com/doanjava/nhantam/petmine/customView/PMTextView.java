package com.doanjava.nhantam.petmine.customView;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

import com.doanjava.nhantam.petmine.R;

/**
 * Created by Anderson on 24/03/2018.
 */

public class PMTextView extends AppCompatTextView {

    public PMTextView(Context context) {
        super(context);
        init(null);
    }

    public PMTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }

    public PMTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs);

    }

    private void init(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.PMTextView);
            String fontName = a.getString(R.styleable.PMTextView_fontTypeFaceName);
            try {
                if (fontName != null) {
                    Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/" + fontName);
                    setTypeface(myTypeface);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            a.recycle();
        }
    }



}
