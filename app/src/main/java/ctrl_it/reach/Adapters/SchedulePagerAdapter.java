package ctrl_it.reach.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ctrl_it.reach.Fragments.HistoryFragment;
import ctrl_it.reach.Fragments.TodayFragment;
import ctrl_it.reach.Fragments.UpcomingFragment;

public class SchedulePagerAdapter extends FragmentPagerAdapter {
    Context ctxt=null;
    public SchedulePagerAdapter(Context ctxt, FragmentManager fm) {
        super(fm);
        this.ctxt = ctxt;
    }

    private static int NUM_ITEMS = 3;

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new TodayFragment();
            case 1:
                return new UpcomingFragment();
            case 2:
                return new HistoryFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch(position){
            case 0:
                return "Today";
            case 1:
                return "Upcoming";
            case 2:
                return "History";
            default:
                return null;
        }
    }
}

