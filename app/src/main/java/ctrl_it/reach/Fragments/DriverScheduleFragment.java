package ctrl_it.reach.Fragments;

import android.app.ActionBar;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import ctrl_it.reach.Adapters.SchedulePagerAdapter;
import ctrl_it.reach.R;

public class DriverScheduleFragment extends Fragment {
    FragmentPagerAdapter adapterViewPager;
    ViewPager vpPager;
    TabLayout tabs;

    public DriverScheduleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_driver_schedule, container, false);
        vpPager = (ViewPager) view.findViewById(R.id.pager);
        tabs = (TabLayout)view.findViewById(R.id.tabs);
        vpPager.setAdapter(buildAdapter());
        tabs.setupWithViewPager(vpPager);
        final ActionBar actionBar = getActivity().getActionBar();
        // Create a tab listener that is called when the user changes tabs.
        ActionBar.TabListener tabListener = new ActionBar.TabListener() {
            @Override
            public void onTabSelected(ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction) {
                vpPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, android.app.FragmentTransaction fragmentTransaction) {

            }

        };

        // Add 3 tabs, specifying the tab's text and TabListener
//        for (int i = 0; i < 3; i++) {
//            actionBar.addTab(
//                    actionBar.newTab()
//                            .setText("Tab " + (i + 1))
//                            .setTabListener(tabListener));
//        }
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private PagerAdapter buildAdapter(){
        return(new SchedulePagerAdapter(getActivity(), getChildFragmentManager()));
    }




}
