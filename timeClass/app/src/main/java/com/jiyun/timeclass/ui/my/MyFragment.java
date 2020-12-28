package com.jiyun.timeclass.ui.my;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.jiyun.timeclass.R;
import com.jiyun.timeclass.ui.login.LoginActivity;

public class MyFragment extends Fragment {
    private TextView mLoginText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.my_frament, null);
        initView(inflate);
        return inflate;
    }

    private void initView(@NonNull final View itemView) {
        mLoginText = (TextView) itemView.findViewById(R.id.loginText);
        mLoginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), LoginActivity.class));
            }
        });
    }
}
