package com.androidbegin.viewpagertutorial;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class test extends Fragment{

	ViewPager viewPager;
	PagerAdapter adapter;
	String[] rank;
	String[] country;
	String[] population;
	int[] flag;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.viewpager_main, container,false);
		
		
		rank = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

		country = new String[] { "China", "India", "United States",
				"Indonesia", "Brazil", "Pakistan", "Nigeria", "Bangladesh",
				"Russia", "Japan" };

		population = new String[] { "1,354,040,000", "1,210,193,422",
				"315,761,000", "237,641,326", "193,946,886", "182,912,000",
				"170,901,000", "152,518,015", "143,369,806", "127,360,000" };

		flag = new int[] { R.drawable.china, R.drawable.india,
				R.drawable.unitedstates, R.drawable.indonesia,
				R.drawable.brazil, R.drawable.pakistan, R.drawable.nigeria,
				R.drawable.bangladesh, R.drawable.russia, R.drawable.japan };

		// Locate the ViewPager in viewpager_main.xml
		viewPager = (ViewPager) v.findViewById(R.id.pager);
		// Pass results to ViewPagerAdapter Class
		adapter = new ViewPagerAdapter(getActivity(), rank, country, population, flag);
		// Binds the Adapter to the ViewPager
		viewPager.setAdapter(adapter);

		return v;
	}
}
