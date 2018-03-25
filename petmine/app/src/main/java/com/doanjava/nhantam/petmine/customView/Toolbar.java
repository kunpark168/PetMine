package com.doanjava.nhantam.petmine.customView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.doanjava.nhantam.petmine.R;

import butterknife.ButterKnife;

/**
 * Created by Anderson on 24/03/2018.
 */

public class Toolbar extends FrameLayout{





    private IToolBar mListener;


    public Toolbar(@NonNull Context context) {
        super(context);
        init();
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init(){
        LayoutInflater.from(getContext()).inflate(R.layout.toolbar_view, this);
        ButterKnife.bind(this);
    }

    private void initData (IToolBar mListener){
        this.mListener = mListener;
    }

    public interface IToolBar {
        void backInstance ();
        void setHeaader (String title);
    }
}
