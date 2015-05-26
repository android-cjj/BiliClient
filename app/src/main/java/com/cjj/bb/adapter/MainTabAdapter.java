package com.cjj.bb.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.cjj.bb.fragment.BangumiFragment;
import com.cjj.bb.fragment.DonghuaFragment;
import com.cjj.bb.fragment.FragmentLogin;
import com.cjj.bb.fragment.FramentTime;
import com.cjj.bb.fragment.GamesCenterFragment;
import com.cjj.bb.fragment.HomePageFragment2;
import com.cjj.bb.fragment.SubareaFragment;

/**
 * FragmentPager适配器
 * 
 * @author wwj_748
 * @2014/8/9
 */
public class MainTabAdapter extends FragmentPagerAdapter {
	// 内容标题
	public static final String[] DONG_HUA_TITLE = new String[] { "个人中心","首页",
			"分区导航", "新番专题", "游戏中心","放松时间表" };
	public HomePageFragment2 homepage = new HomePageFragment2();
	public SubareaFragment subarea = new SubareaFragment();
	
	public MainTabAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}


	// 获取项
	@Override
	public Fragment getItem(int position) {
		System.out.println("Fragment position:" + position);
		
		switch (position) {
            case 0:
                return new FragmentLogin();
		case 1:
			return homepage;
		case 2:
			return subarea;
		case 3:
			return new BangumiFragment();
		case 4:
			return new GamesCenterFragment();
            case 5:
                return new FramentTime();
		default:
			return new DonghuaFragment(33);
		}
		
		// MainFragment fragment = new MainFragment(position);
		// return fragment;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		// 返回页面标题
		return DONG_HUA_TITLE[position % DONG_HUA_TITLE.length].toUpperCase();
	}

	@Override
	public int getCount() {
		// 页面个数
		return DONG_HUA_TITLE.length;
	}

}
