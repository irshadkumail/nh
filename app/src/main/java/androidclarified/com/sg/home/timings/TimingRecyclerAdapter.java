package androidclarified.com.sg.home.timings;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidclarified.com.sg.R;

/**
 * Created by Irshad on 22/12/17.
 */

public class TimingRecyclerAdapter extends RecyclerView.Adapter<TimingRecyclerAdapter.TimingViewholder> {

     Context context;

    TimingRecyclerAdapter(Context context)
    {
        this.context=context;

    }


    @Override
    public TimingRecyclerAdapter.TimingViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(TimingRecyclerAdapter.TimingViewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private class TimingViewholder extends RecyclerView.ViewHolder{

        TextView salahName,salahTime,salahampm;

        public TimingViewholder(View itemView) {
            super(itemView);

            salahName=itemView.findViewById(R.id.salah_name);
            salahTime=itemView.findViewById(R.id.salah_time);
            salahampm=itemView.findViewById(R.id.salah_time_ampm);

        }


    }
}
