package vadyaprod.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Vadya on 11.09.17.
 */


public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
