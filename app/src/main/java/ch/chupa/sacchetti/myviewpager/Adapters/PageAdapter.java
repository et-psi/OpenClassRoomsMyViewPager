package ch.chupa.sacchetti.myviewpager.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ch.chupa.sacchetti.myviewpager.Controllers.Fragments.NewsPageFragment;
import ch.chupa.sacchetti.myviewpager.Controllers.Fragments.ParamPageFragment;
import ch.chupa.sacchetti.myviewpager.Controllers.Fragments.ProfilePageFragment;

/**
 * Created by Plinio on 03.03.2018.
 */

public class PageAdapter extends FragmentPagerAdapter {

    public PageAdapter(FragmentManager mgr) {
        super(mgr);
    }


    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: //Page number 1
                return NewsPageFragment.newInstance();
            case 1: //Page number 2
                return ProfilePageFragment.newInstance();
            case 2: //Page number 3
                return ParamPageFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: //Page number 1
                return "Fil d'actualité";
            case 1: //Page number 2
                return "Profil";
            case 2: //Page number 3
                return "Paramètre";
            default:
                return null;
        }
    }

}
