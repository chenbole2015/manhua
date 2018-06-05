package com.gn.cartoon.ui.activitys;

import android.os.SystemClock;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.gn.cartoon.AppConfig;
import com.gn.cartoon.R;
import com.gn.cartoon.base.BaseActivity;
import com.gn.cartoon.base.BaseFragment;
import com.gn.cartoon.ui.fragments.BooksFragment;
import com.gn.cartoon.ui.fragments.CommunityFragment;
import com.gn.cartoon.ui.fragments.HomeFragment;
import com.gn.cartoon.ui.fragments.MineFragment;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {

    @BindView(R.id.dm_main_group)
    RadioGroup mRadioGroupMain;

    private BaseFragment[] mBaseFragments = new BaseFragment[4];

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        mRadioGroupMain.setOnCheckedChangeListener(this);
        ((RadioButton) mRadioGroupMain.getChildAt(0)).setChecked(true);
    }

    @Override
    public boolean getUseTitle() {
        return false;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int id = 0;
        switch (checkedId) {
            case R.id.dm_main_rb_home:
                id = 0;
                break;
            case R.id.dm_main_rb_books:
                id = 1;
                break;
            case R.id.dm_main_rb_community:
                id = 2;
                break;
            case R.id.dm_main_rb_mine:
                id = 3;
                break;
        }
        changeFragment(id);
    }

    //添加fragment
    private void changeFragment(int iArp) {
        //没有时初始化
        if (mBaseFragments[iArp] == null) {
            BaseFragment baseFragmentTemp = null;
            switch (iArp) {
                case 0:
                    baseFragmentTemp = new HomeFragment();
                    break;
                case 1:
                    baseFragmentTemp = new BooksFragment();
                    break;
                case 2:
                    baseFragmentTemp = new CommunityFragment();
                    break;
                case 3:
                    baseFragmentTemp = new MineFragment();
                    break;
            }
            mBaseFragments[iArp] = baseFragmentTemp;
            //依附
            if (!baseFragmentTemp.isAdded()) {
                FragmentTransaction fragmentTransactionTemp1 = getSupportFragmentManager()
                        .beginTransaction();
                fragmentTransactionTemp1.add(R.id.dm_root_view, baseFragmentTemp);
                fragmentTransactionTemp1.commit();
            }
        } else {
            //隐藏与显示
            int length = mBaseFragments.length;
            FragmentTransaction fragmentTransactionTemp = getSupportFragmentManager()
                    .beginTransaction();
            for (int i = 0; i < length; i++) {
                if (iArp == i) {
                    fragmentTransactionTemp.show(mBaseFragments[i]);
                } else {
                    if (mBaseFragments[i] != null)
                        fragmentTransactionTemp.hide(mBaseFragments[i]);
                }
            }
            fragmentTransactionTemp.commitAllowingStateLoss();
        }
    }

    private long startTime, endTime;

    //是否退出
    @Override
    public void onBackPressed() {
        startTime = System.currentTimeMillis();
        if (startTime - endTime >AppConfig.MAIN_EXIT) {
            showToast("再按一次退出应用");
            endTime = startTime;
            return;
        }
        super.onBackPressed();
    }
}
