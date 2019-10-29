package com.bkw.butterknife.library;

import android.view.View;

/**
 * 控件点击事件
 *
 * @author bkw
 */
public abstract class DebouncingOnClickListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        doClick(v);
    }

    protected abstract void doClick(View v);
}
