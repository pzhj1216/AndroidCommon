package com.panner.common_base.ui;

import android.view.MenuItem;
import androidx.fragment.app.FragmentActivity;
import com.trello.rxlifecycle4.components.support.RxAppCompatActivity;

/**
 * 基础通用的activity
 *
 * @author Panner
 * @version 2019-04-07-22:39
 */
public class BaseActivity extends RxAppCompatActivity {

    private final String TAG = getActivity().getClass().getSimpleName();

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //如果点击了home返回键，销毁当前的activity，返回上一个activity
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public FragmentActivity getActivity() {
        return this;
    }
}
