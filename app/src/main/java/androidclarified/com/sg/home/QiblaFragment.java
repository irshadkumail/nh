package androidclarified.com.sg.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidclarified.com.sg.R;

/**
 * Created by Irshad on 15/12/17.
 */

public class QiblaFragment extends Fragment {


    public static QiblaFragment newInstance()
    {
        QiblaFragment qiblaFragment=new QiblaFragment();

        return qiblaFragment;

    }



    public View onCreateView(LayoutInflater layoutInflater, ViewGroup parent, Bundle bundle)
    {
       return layoutInflater.inflate(R.layout.fragment_qibla,parent,false);
    }



}
