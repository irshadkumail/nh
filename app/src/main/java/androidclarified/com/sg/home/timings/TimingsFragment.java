package androidclarified.com.sg.home.timings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidclarified.com.sg.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Irshad on 15/12/17.
 */

public class TimingsFragment extends Fragment implements TimingsContract.View {

    @BindView(R.id.timing_recycler)
    RecyclerView timingRecycler;



    public static TimingsFragment newInstance()
    {
        TimingsFragment timingsFragment=new TimingsFragment();

        return timingsFragment;
    }



    public View onCreateView(LayoutInflater layoutInflater, ViewGroup parent, Bundle bundle)
    {
       View view=layoutInflater.inflate(R.layout.fragment_timings,parent,false);

        ButterKnife.bind(this,view);

        return view;
    }


}
