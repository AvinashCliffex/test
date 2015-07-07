package com.androidbegin.viewpagertutorial;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {

	// Declare Variables
	ViewPager viewPager;
	PagerAdapter adapter;
	String[] rank;
	String[] country;
	String[] population;
	int[] flag;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Fragment fragment = null;

		fragment = new test();

		if (fragment != null) {

			FragmentManager fragmentManager = this
					.getSupportFragmentManager();
			fragmentManager.beginTransaction()
					.replace(R.id.frame_container, fragment)
					.addToBackStack("myfragment").commit();

		}
		

	}
}