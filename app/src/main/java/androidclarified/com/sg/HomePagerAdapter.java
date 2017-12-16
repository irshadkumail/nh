package androidclarified.com.sg;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import androidclarified.com.sg.home.QiblaFragment;
import androidclarified.com.sg.home.timings.TimingsFragment;

/**
 * Created by Irshad on 15/12/17.
 */

public class HomePagerAdapter extends FragmentPagerAdapter {


    public HomePagerAdapter(FragmentManager fragmentManager)
    {
        super(fragmentManager);

    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment= TimingsFragment.newInstance();
                break;
            case 1:
                fragment= QiblaFragment.newInstance();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position){

            case 0:
                return "TIMINGS";
            case 1:
                return "QIBLA";
            default:
                return "";

        }
    }
}
