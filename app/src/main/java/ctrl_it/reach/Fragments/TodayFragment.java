package ctrl_it.reach.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ctrl_it.reach.Adapters.TodayFragmentAdapter;
import ctrl_it.reach.Models.Ride;
import ctrl_it.reach.R;

import static android.support.v7.widget.DividerItemDecoration.HORIZONTAL;
import static android.support.v7.widget.DividerItemDecoration.VERTICAL;

/**
 * A simple {@link Fragment} subclass.
 */
public class TodayFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Ride> rideList = new ArrayList<>();
    private static int i;
    private DividerItemDecoration mDividerItemDecoration;

    public TodayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_today, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new TodayFragmentAdapter(rideList);
        mRecyclerView.setAdapter(mAdapter);

        mDividerItemDecoration = new DividerItemDecoration(mRecyclerView.getContext(),
                VERTICAL);
        mRecyclerView.addItemDecoration(mDividerItemDecoration);
        prepareRideData();

        return view;
    }

    private void prepareRideData() {
        while(i<5){
            Ride ride = new Ride("7/23/2018", "Driver Details", "Label", R.mipmap.ic_tropical_round);
            rideList.add(ride);
            i++;
        }
        mAdapter.notifyDataSetChanged();
    }

}
