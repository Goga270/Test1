package com.example.test;

import android.graphics.Color;
import android.os.Bundle;
import android.telephony.IccOpenLogicalChannelResponse;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.test.databinding.FragmentRootBinding;

public class RootFragment extends Fragment implements View.OnClickListener {

    private FragmentRootBinding binding;

    @Override
    public void onViewCreated(View view, Bundle bundle){
        super.onViewCreated(view,bundle);
        binding = FragmentRootBinding.bind(view);
        binding.openGreenBox.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.action_rootFragment2_to_boxFragment:
                Bundle args = new Bundle();
                args.putInt("color",Color.rgb(250,250,200));
                NavHostFragment.findNavController(this).navigate(R.id.action_rootFragment2_to_boxFragment, args);
            case R.id.action_boxFragment_to_secretFragment:
                Bundle args2 = new Bundle();
                args2.putInt("color",Color.rgb(200,250,200));
                NavHostFragment.findNavController(this).navigate(R.id.action_rootFragment2_to_boxFragment, args2);
        }
    }
}
