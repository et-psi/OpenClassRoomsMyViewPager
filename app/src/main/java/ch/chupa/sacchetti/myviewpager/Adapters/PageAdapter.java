package ch.chupa.sacchetti.myviewpager.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ch.chupa.sacchetti.myviewpager.Controller.Fragments.PageFragment;

/**
 * Created by Plinio on 03.03.2018.
 */

public class PageAdapter extends FragmentPagerAdapter {

    private int[] colors;

    public PageAdapter(FragmentManager mgr, int[] colors) {
        super(mgr);
        this.colors = colors;
    }

    @Override
    public Fragment getItem(int position) {
        return(PageFragment.newInstance(position, this.colors[position]));
    }

    @Override
    public int getCount() {
        return 5;
    }
}
